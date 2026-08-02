package D0;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0 f356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f358h;

    public /* synthetic */ g0(h0 h0Var, WebView webView, String str, int i2) {
        this.f355e = i2;
        this.f356f = h0Var;
        this.f357g = webView;
        this.f358h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f355e) {
            case 0:
                C0056p c0056p = new C0056p(3);
                h0 h0Var = this.f356f;
                h0Var.f361a.f(h0Var, this.f357g, this.f358h, c0056p);
                break;
            case 1:
                C0056p c0056p2 = new C0056p(3);
                h0 h0Var2 = this.f356f;
                h0Var2.f361a.p(h0Var2, this.f357g, this.f358h, c0056p2);
                break;
            case 2:
                C0056p c0056p3 = new C0056p(3);
                h0 h0Var3 = this.f356f;
                h0Var3.f361a.c(h0Var3, this.f357g, this.f358h, c0056p3);
                break;
            case 3:
                C0056p c0056p4 = new C0056p(3);
                h0 h0Var4 = this.f356f;
                h0Var4.f361a.e(h0Var4, this.f357g, this.f358h, c0056p4);
                break;
            default:
                C0056p c0056p5 = new C0056p(3);
                h0 h0Var5 = this.f356f;
                h0Var5.f361a.d(h0Var5, this.f357g, this.f358h, c0056p5);
                break;
        }
    }
}
