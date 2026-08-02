package X1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class i extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1739a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1740b;

    public i(WebViewClient webViewClient) {
        this.f1740b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).doUpdateVisitedHistory(webView, str, z);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onFormResubmission(webView, message, message2);
                break;
            default:
                super.onFormResubmission(webView, message, message2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onLoadResource(webView, str);
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onPageCommitVisible(webView, str);
                break;
            default:
                super.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedClientCertRequest(webView, clientCertRequest);
                break;
            default:
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i3, String str, String str2) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedError(webView, i3, str, str2);
                break;
            default:
                super.onReceivedError(webView, i3, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
            default:
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedLoginRequest(webView, str, str2, str3);
                break;
            default:
                super.onReceivedLoginRequest(webView, str, str2, str3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        switch (this.f1739a) {
            case 1:
                onRenderProcessGone = ((WebViewClient) this.f1740b).onRenderProcessGone(webView, renderProcessGoneDetail);
                return onRenderProcessGone;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i3, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onSafeBrowsingHit(webView, webResourceRequest, i3, safeBrowsingResponse);
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i3, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f3) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onScaleChanged(webView, f, f3);
                break;
            default:
                super.onScaleChanged(webView, f, f3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onUnhandledKeyEvent(webView, keyEvent);
                break;
            default:
                super.onUnhandledKeyEvent(webView, keyEvent);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1739a) {
            case 1:
                return ((WebViewClient) this.f1740b).shouldInterceptRequest(webView, webResourceRequest);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f1739a) {
            case 1:
                return ((WebViewClient) this.f1740b).shouldOverrideKeyEvent(webView, keyEvent);
            default:
                return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1739a) {
            case 0:
                ((j) this.f1740b).f1741a.f9335c.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            default:
                if (C2.b.a(webResourceRequest.getUrl().toString())) {
                    return true;
                }
                return ((WebViewClient) this.f1740b).shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public i(j jVar) {
        this.f1740b = jVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f1739a) {
            case 1:
                ((WebViewClient) this.f1740b).onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.f1739a) {
            case 1:
                return ((WebViewClient) this.f1740b).shouldInterceptRequest(webView, str);
            default:
                return super.shouldInterceptRequest(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f1739a) {
            case 1:
                if (C2.b.a(str)) {
                    return true;
                }
                return ((WebViewClient) this.f1740b).shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
