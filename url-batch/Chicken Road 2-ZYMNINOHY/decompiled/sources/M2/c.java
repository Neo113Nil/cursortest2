package M2;

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
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1755a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1756b;

    public /* synthetic */ c(d dVar, int i4) {
        this.f1755a = i4;
        this.f1756b = dVar;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).doUpdateVisitedHistory(webView, str, z);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onFormResubmission(webView, message, message2);
                break;
            default:
                super.onFormResubmission(webView, message, message2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onLoadResource(webView, str);
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onPageCommitVisible(webView, str);
                break;
            default:
                super.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedClientCertRequest(webView, clientCertRequest);
                break;
            default:
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i4, String str, String str2) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedError(webView, i4, str, str2);
                break;
            default:
                super.onReceivedError(webView, i4, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
            default:
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedLoginRequest(webView, str, str2, str3);
                break;
            default:
                super.onReceivedLoginRequest(webView, str, str2, str3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        switch (this.f1755a) {
            case 0:
                d dVar = (d) this.f1756b;
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (dVar.g() == webView) {
                    dVar.f1750b = new Q2.a(null);
                }
                if (webView == null) {
                    return true;
                }
                webView.destroy();
                return true;
            case 1:
                d dVar2 = (d) this.f1756b;
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (dVar2.g() == webView) {
                    dVar2.f1750b = new Q2.a(null);
                }
                if (webView == null) {
                    return true;
                }
                webView.destroy();
                return true;
            default:
                onRenderProcessGone = ((WebViewClient) this.f1756b).onRenderProcessGone(webView, renderProcessGoneDetail);
                return onRenderProcessGone;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i4, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onSafeBrowsingHit(webView, webResourceRequest, i4, safeBrowsingResponse);
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i4, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f4, float f5) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onScaleChanged(webView, f4, f5);
                break;
            default:
                super.onScaleChanged(webView, f4, f5);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onUnhandledKeyEvent(webView, keyEvent);
                break;
            default:
                super.onUnhandledKeyEvent(webView, keyEvent);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1755a) {
            case 2:
                return ((WebViewClient) this.f1756b).shouldInterceptRequest(webView, webResourceRequest);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.f1755a) {
            case 2:
                return ((WebViewClient) this.f1756b).shouldOverrideKeyEvent(webView, keyEvent);
            default:
                return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1755a) {
            case 0:
                return O3.d.b(webResourceRequest.getUrl().toString());
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            case 2:
                if (O3.d.b(webResourceRequest.getUrl().toString())) {
                    return true;
                }
                return ((WebViewClient) this.f1756b).shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public c(WebViewClient webViewClient) {
        this.f1755a = 2;
        this.f1756b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f1755a) {
            case 2:
                ((WebViewClient) this.f1756b).onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.f1755a) {
            case 2:
                return ((WebViewClient) this.f1756b).shouldInterceptRequest(webView, str);
            default:
                return super.shouldInterceptRequest(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f1755a) {
            case 0:
                return O3.d.b(str);
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, str);
            case 2:
                if (O3.d.b(str)) {
                    return true;
                }
                return ((WebViewClient) this.f1756b).shouldOverrideUrlLoading(webView, str);
        }
    }
}
