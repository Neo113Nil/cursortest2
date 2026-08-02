package Y1;

import E1.AbstractC0033i;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class f0 extends WebView implements io.flutter.plugin.platform.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1850d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0113j f1851a;

    /* renamed from: b, reason: collision with root package name */
    public WebViewClient f1852b;

    /* renamed from: c, reason: collision with root package name */
    public S f1853c;

    public f0(C0113j c0113j) {
        super((Context) c0113j.f1861a.f19d);
        this.f1851a = c0113j;
        this.f1852b = new WebViewClient();
        this.f1853c = new S();
        setWebViewClient(this.f1852b);
        setWebChromeClient(this.f1853c);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f1853c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        E1.t tVar;
        super.onAttachedToWindow();
        this.f1851a.f1861a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent viewParent = this;
            while (true) {
                if (viewParent.getParent() == null) {
                    tVar = null;
                    break;
                }
                viewParent = viewParent.getParent();
                if (viewParent instanceof E1.t) {
                    tVar = (E1.t) viewParent;
                    break;
                }
            }
            if (tVar != null) {
                tVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i3, final int i4, final int i5, final int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
        this.f1851a.f1861a.c(new Runnable() { // from class: Y1.e0
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = i3;
                long j4 = i4;
                long j5 = i5;
                long j6 = i6;
                C0120q c0120q = new C0120q(3);
                f0 f0Var = f0.this;
                C0113j c0113j = f0Var.f1851a;
                c0113j.getClass();
                A0.d dVar = c0113j.f1861a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(f0Var)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", "");
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", dVar.a(), (K0.j) null).h(c2.f.L(f0Var, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)), new C0.f(24, c0120q));
                }
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof S)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        S s3 = (S) webChromeClient;
        this.f1853c = s3;
        s3.f1785a = this.f1852b;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f1852b = webViewClient;
        this.f1853c.f1785a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.g
    public final void dispose() {
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this;
    }
}
