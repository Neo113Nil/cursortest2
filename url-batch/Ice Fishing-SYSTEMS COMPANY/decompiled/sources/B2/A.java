package B2;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f141n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f142u;

    public /* synthetic */ A(B b9, int i) {
        this.f141n = i;
        this.f142u = b9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient e6;
        switch (this.f141n) {
            case 0:
                B b9 = this.f142u;
                synchronized (b9.f145c) {
                    WebView webView = b9.f148f;
                    if (webView == null) {
                        return;
                    }
                    try {
                        t2.G g9 = p2.j.f39798C.f39803c;
                        if (Build.VERSION.SDK_INT < 26) {
                            if (com.bumptech.glide.h.s("GET_WEB_VIEW_CLIENT")) {
                                try {
                                    e6 = H0.e.e(webView);
                                } catch (RuntimeException e9) {
                                    p2.j.f39798C.f39808h.d("AdUtil.getWebViewClient", e9);
                                }
                            }
                            throw new IllegalStateException("getWebViewClient not supported");
                        }
                        e6 = webView.getWebViewClient();
                        if (e6 == b9) {
                            return;
                        }
                        if (e6 != null) {
                            b9.f147e = e6;
                        }
                        webView.setWebViewClient(b9);
                        b9.x();
                        return;
                    } catch (IllegalStateException unused) {
                        return;
                    }
                }
            default:
                B b10 = this.f142u;
                b10.f144b.execute(new A(b10, 0));
                return;
        }
    }
}
