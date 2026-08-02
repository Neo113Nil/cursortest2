package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class PaymentAuthWebViewClient extends WebViewClient {
    public static final Set AUTHENTICATE_URLS = SetsKt__SetsJVMKt.setOf("https://hooks.stripe.com/three_d_secure/authenticate");
    public static final Set COMPLETION_URLS = ArraysKt___ArraysKt.toSet(new String[]{"https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete"});
    public final TextFieldUIKt$TextField$4$1 activityFinisher;
    public final TextFieldUIKt$TextField$4$1 activityStarter;
    public final String clientSecret;
    public boolean hasLoadedBlank;
    public final StateFlowImpl isPageLoaded;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final Uri userReturnUri;

    public PaymentAuthWebViewClient(Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, StateFlowImpl stateFlowImpl, String str, String str2, TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1, TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$12) {
        logger$Companion$NOOP_LOGGER$1.getClass();
        str.getClass();
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.isPageLoaded = stateFlowImpl;
        this.clientSecret = str;
        this.activityStarter = textFieldUIKt$TextField$4$1;
        this.activityFinisher = textFieldUIKt$TextField$4$12;
        this.userReturnUri = str2 != null ? Uri.parse(str2) : null;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = this.logger;
        logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(webView, str);
        if (!this.hasLoadedBlank) {
            logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#hideProgressBar()");
            Boolean bool = Boolean.TRUE;
            StateFlowImpl stateFlowImpl = this.isPageLoaded;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, bool);
        }
        if (str != null) {
            Set set = COMPLETION_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsJVMKt.startsWith(str, (String) it.next(), false)) {
                    logger$Companion$NOOP_LOGGER$1.debug(str.concat(" is a completion URL"));
                    logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#onAuthCompleted()");
                    this.activityFinisher.invoke(null);
                    return;
                }
            }
        }
    }

    public final void openIntent(Intent intent) {
        Object failure;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = this.logger;
        logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            Result.Companion companion = Result.Companion;
            this.activityStarter.invoke(intent);
            failure = Unit.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            logger$Companion$NOOP_LOGGER$1.error("Failed to start Intent.", m4120exceptionOrNullimpl);
            if (Intrinsics.areEqual(intent.getScheme(), "alipays")) {
                return;
            }
            logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#onAuthCompleted()");
            this.activityFinisher.invoke(m4120exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.getHost(), r0.getHost()) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String queryParameter;
        Object failure;
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = this.logger;
        logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        url.getClass();
        logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#updateCompletionUrl()");
        String uri = url.toString();
        uri.getClass();
        Set set = AUTHENTICATE_URLS;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt__StringsJVMKt.startsWith(uri, (String) it.next(), false)) {
                    queryParameter = url.getQueryParameter("return_url");
                    break;
                }
            }
        }
        queryParameter = null;
        if (queryParameter != null) {
            StringsKt.isBlank(queryParameter);
        }
        logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (!"stripejs://use_stripe_sdk/return_url".equals(url.toString())) {
            String uri2 = url.toString();
            uri2.getClass();
            if (!StringsKt__StringsJVMKt.startsWith(uri2, "stripesdk://payment_return_url/", false)) {
                Uri uri3 = this.userReturnUri;
                if (uri3 != null) {
                    if (uri3.getScheme() != null) {
                        if (Intrinsics.areEqual(uri3.getScheme(), url.getScheme())) {
                            if (uri3.getHost() != null) {
                            }
                        }
                    }
                } else if (!url.isOpaque()) {
                    Set<String> queryParameterNames = url.getQueryParameterNames();
                    z = Intrinsics.areEqual(this.clientSecret, queryParameterNames.contains("payment_intent_client_secret") ? url.getQueryParameter("payment_intent_client_secret") : queryParameterNames.contains("setup_intent_client_secret") ? url.getQueryParameter("setup_intent_client_secret") : null);
                }
                TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = this.activityFinisher;
                if (!z) {
                    logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
                    logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#onAuthCompleted()");
                    textFieldUIKt$TextField$4$1.invoke(null);
                    return true;
                }
                if (!"intent".equalsIgnoreCase(url.getScheme())) {
                    if (URLUtil.isNetworkUrl(url.toString())) {
                        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                    }
                    openIntent(new Intent("android.intent.action.VIEW", url));
                    return true;
                }
                logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#openIntentScheme()");
                try {
                    Result.Companion companion = Result.Companion;
                    Intent parseUri = Intent.parseUri(url.toString(), 1);
                    parseUri.getClass();
                    openIntent(parseUri);
                    failure = Unit.INSTANCE;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    logger$Companion$NOOP_LOGGER$1.error("Failed to start Intent.", m4120exceptionOrNullimpl);
                    logger$Companion$NOOP_LOGGER$1.debug("PaymentAuthWebViewClient#onAuthCompleted()");
                    textFieldUIKt$TextField$4$1.invoke(m4120exceptionOrNullimpl);
                }
                return true;
            }
        }
        z = true;
        TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$12 = this.activityFinisher;
        if (!z) {
        }
    }
}
