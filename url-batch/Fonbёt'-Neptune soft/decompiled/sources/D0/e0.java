package D0;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebView f345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f346g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f348i;

    public /* synthetic */ e0(WebViewClient webViewClient, WebView webView, float f2, float f3, int i2) {
        this.f344e = i2;
        this.f348i = webViewClient;
        this.f345f = webView;
        this.f346g = f2;
        this.f347h = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f344e) {
            case 0:
                double d2 = this.f346g;
                double d3 = this.f347h;
                C0056p c0056p = new C0056p(2);
                f0 f0Var = (f0) this.f348i;
                f0Var.f351b.m(f0Var, this.f345f, d2, d3, c0056p);
                break;
            default:
                double d4 = this.f346g;
                double d5 = this.f347h;
                C0056p c0056p2 = new C0056p(3);
                h0 h0Var = (h0) this.f348i;
                h0Var.f361a.m(h0Var, this.f345f, d4, d5, c0056p2);
                break;
        }
    }
}
