package q1;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
import u1.C1221a;

/* loaded from: classes.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f10235b;

    public /* synthetic */ c(d dVar, int i3) {
        this.f10234a = i3;
        this.f10235b = dVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.f10234a) {
            case 0:
                d dVar = this.f10235b;
                dVar.getClass();
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (dVar.g() == webView) {
                    dVar.f10230b = new C1221a(null);
                }
                if (webView != null) {
                    webView.destroy();
                    break;
                }
                break;
            default:
                d dVar2 = this.f10235b;
                dVar2.getClass();
                renderProcessGoneDetail.toString();
                Objects.toString(webView);
                if (dVar2.g() == webView) {
                    dVar2.f10230b = new C1221a(null);
                }
                if (webView != null) {
                    webView.destroy();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f10234a) {
            case 0:
                return C2.b.a(webResourceRequest.getUrl().toString());
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.f10234a) {
            case 0:
                return C2.b.a(str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
