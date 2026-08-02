package D0;

import I.C0079n;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import w0.InterfaceC0320f;

/* loaded from: classes.dex */
public final class l0 extends WebView implements io.flutter.plugin.platform.g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f383h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final C0050j f384e;

    /* renamed from: f, reason: collision with root package name */
    public WebViewClient f385f;

    /* renamed from: g, reason: collision with root package name */
    public U f386g;

    public l0(C0050j c0050j) {
        super((Context) c0050j.f366a.f263e);
        this.f384e = c0050j;
        this.f385f = new WebViewClient();
        this.f386g = new U();
        setWebViewClient(this.f385f);
        setWebChromeClient(this.f386g);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f386g;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        m0.q qVar;
        super.onAttachedToWindow();
        this.f384e.f366a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent viewParent = this;
            while (true) {
                if (viewParent.getParent() == null) {
                    qVar = null;
                    break;
                }
                viewParent = viewParent.getParent();
                if (viewParent instanceof m0.q) {
                    qVar = (m0.q) viewParent;
                    break;
                }
            }
            if (qVar != null) {
                qVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i2, final int i3, final int i4, final int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        this.f384e.f366a.c(new Runnable() { // from class: D0.k0
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = i2;
                long j3 = i3;
                long j4 = i4;
                long j5 = i5;
                C0056p c0056p = new C0056p(4);
                l0 l0Var = l0.this;
                C0050j c0050j = l0Var.f384e;
                c0050j.getClass();
                O o2 = c0050j.f366a;
                o2.getClass();
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", o2.a(), null).h(G0.e.O(l0Var, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)), new H(16, c0056p));
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof U)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        U u2 = (U) webChromeClient;
        this.f386g = u2;
        u2.f282a = this.f385f;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f385f = webViewClient;
        this.f386g.f282a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this;
    }
}
