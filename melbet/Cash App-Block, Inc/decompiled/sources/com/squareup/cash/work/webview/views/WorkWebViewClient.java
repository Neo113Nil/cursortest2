package com.squareup.cash.work.webview.views;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.common.web.UriSchemeKt;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewEvent;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.stripe3ds2.views.ChallengeZoneWebView;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient$OnHtmlSubmitListener;
import com.stripe.android.view.PaymentAuthWebChromeClient;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import timber.log.Timber;

/* loaded from: classes8.dex */
public final class WorkWebViewClient extends WebViewClient {
    public final /* synthetic */ int $r8$classId;
    public Object onEvent;

    public WorkWebViewClient(UserJavascriptInterfaceBase$$ExternalSyntheticLambda25 userJavascriptInterfaceBase$$ExternalSyntheticLambda25) {
        this.$r8$classId = 0;
        this.onEvent = userJavascriptInterfaceBase$$ExternalSyntheticLambda25;
    }

    public void handleFormSubmitUrl(Uri uri) {
        ThreeDS2WebViewClient$OnHtmlSubmitListener threeDS2WebViewClient$OnHtmlSubmitListener;
        uri.getClass();
        String uri2 = uri.toString();
        uri2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String lowerCase = uri2.toLowerCase(locale);
        lowerCase.getClass();
        if (!StringsKt__StringsJVMKt.startsWith(lowerCase, "https://emv3ds/challenge", false) || (threeDS2WebViewClient$OnHtmlSubmitListener = (ThreeDS2WebViewClient$OnHtmlSubmitListener) this.onEvent) == null) {
            return;
        }
        String query = uri.getQuery();
        ChallengeZoneWebView challengeZoneWebView = (ChallengeZoneWebView) ((MaterialButton$$ExternalSyntheticLambda3) threeDS2WebViewClient$OnHtmlSubmitListener).f$0;
        Pattern pattern = ChallengeZoneWebView.PATTERN_METHOD_POST;
        if (query == null) {
            query = "";
        }
        challengeZoneWebView.userEntry = query;
        View.OnClickListener onClickListener = challengeZoneWebView.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(challengeZoneWebView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.$r8$classId) {
            case 0:
                super.onPageFinished(webView, str);
                ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(WorkWebViewEvent.PageFinished.INSTANCE);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.$r8$classId) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                if (str != null) {
                    ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.PageStarted(str));
                    break;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence charSequence;
        switch (this.$r8$classId) {
            case 0:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null) {
                    boolean z = true;
                    if (webResourceRequest.isForMainFrame()) {
                        Timber.Forest forest = Timber.Forest;
                        Integer valueOf = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
                        if (webResourceError == null || (charSequence = webResourceError.getDescription()) == null) {
                            charSequence = "Unknown";
                        }
                        forest.w("WebView error: code=" + valueOf + ", description=" + ((Object) charSequence) + ", url=" + webResourceRequest.getUrl(), new Object[0]);
                        Integer valueOf2 = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
                        if ((valueOf2 == null || valueOf2.intValue() != -2) && ((valueOf2 == null || valueOf2.intValue() != -6) && ((valueOf2 == null || valueOf2.intValue() != -7) && (valueOf2 == null || valueOf2.intValue() != -8)))) {
                            z = false;
                        }
                        ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.PageError(z));
                        break;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.$r8$classId) {
            case 0:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest != null) {
                    if (webResourceRequest.isForMainFrame()) {
                        Timber.Forest forest = Timber.Forest;
                        Integer valueOf = webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null;
                        forest.w("WebView HTTP error: status=" + valueOf + ", url=" + webResourceRequest.getUrl(), new Object[0]);
                        int statusCode = webResourceResponse != null ? webResourceResponse.getStatusCode() : 0;
                        ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.PageError(500 <= statusCode && statusCode < 600));
                        break;
                    }
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.$r8$classId) {
            case 0:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                Timber.Forest forest = Timber.Forest;
                Object obj = sslError;
                if (sslError == null) {
                    obj = "Unknown SSL error";
                }
                forest.w(Boxes$$ExternalSyntheticOutline1.m("WebView SSL error: ", obj), new Object[0]);
                ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.PageError(false));
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.$r8$classId) {
            case 0:
                Timber.Forest.e("WebView renderer crashed", new Object[0]);
                ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.PageError(true));
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.$r8$classId) {
            case 0:
                Timber.Forest.w("WebView security threat: type=" + i + ", url=" + (webResourceRequest != null ? webResourceRequest.getUrl() : null), new Object[0]);
                ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.PageError(false));
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.$r8$classId) {
            case 3:
                webView.getClass();
                webResourceRequest.getClass();
                Uri url = webResourceRequest.getUrl();
                url.getClass();
                handleFormSubmitUrl(url);
                Uri url2 = webResourceRequest.getUrl();
                url2.getClass();
                url2.getClass();
                return URLUtil.isDataUrl(url2.toString()) ? super.shouldInterceptRequest(webView, webResourceRequest) : new WebResourceResponse(null, null, null);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        Object failure;
        Object value;
        Object[] objArr = 0;
        switch (this.$r8$classId) {
            case 0:
                if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                if (!Intrinsics.areEqual(url.getScheme(), "team-app-action")) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
                ((UserJavascriptInterfaceBase$$ExternalSyntheticLambda25) this.onEvent).invoke(new WorkWebViewEvent.WebResult(url));
                return true;
            case 1:
                webView.getClass();
                webResourceRequest.getClass();
                Uri url2 = webResourceRequest.getUrl();
                url2.getClass();
                if (UriSchemeKt.isUrl(url2)) {
                    Uri https = UriSchemeKt.toHttps(url2);
                    PaymentAuthWebChromeClient paymentAuthWebChromeClient = (PaymentAuthWebChromeClient) this.onEvent;
                    JobKt.launch$default((CoroutineScope) paymentAuthWebChromeClient.logger, null, null, new PlaidLinkView.AnonymousClass2((Object) paymentAuthWebChromeClient, (Object) https, (Continuation) (objArr == true ? 1 : 0), 9), 3);
                }
                return true;
            case 2:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.onEvent;
                Uri url3 = webResourceRequest != null ? webResourceRequest.getUrl() : null;
                int i = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                if (url3 == null) {
                    return false;
                }
                FinancialConnectionsLiteViewModel financialConnectionsLiteViewModel = (FinancialConnectionsLiteViewModel) financialConnectionsSheetLiteActivity.viewModel$delegate.getValue();
                String uri = url3.toString();
                uri.getClass();
                HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(21, uri, financialConnectionsLiteViewModel);
                try {
                    Result.Companion companion = Result.Companion;
                    value = financialConnectionsLiteViewModel._state.getValue();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (value == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                heroCardViewKt$$ExternalSyntheticLambda0.invoke(value);
                failure = Unit.INSTANCE;
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl == null) {
                    return true;
                }
                financialConnectionsLiteViewModel.handleError("State is null", m4120exceptionOrNullimpl);
                return true;
            default:
                webView.getClass();
                webResourceRequest.getClass();
                Uri url4 = webResourceRequest.getUrl();
                url4.getClass();
                handleFormSubmitUrl(url4);
                return true;
        }
    }

    public /* synthetic */ WorkWebViewClient(Object obj, int i) {
        this.$r8$classId = i;
        this.onEvent = obj;
    }
}
