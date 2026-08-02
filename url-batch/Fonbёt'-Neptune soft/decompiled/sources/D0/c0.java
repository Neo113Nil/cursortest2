package D0;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f325h;

    public /* synthetic */ c0(f0 f0Var, WebView webView, String str, int i2) {
        this.f322e = i2;
        this.f323f = f0Var;
        this.f324g = webView;
        this.f325h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f322e) {
            case 0:
                C0056p c0056p = new C0056p(2);
                f0 f0Var = this.f323f;
                f0Var.f351b.p(f0Var, this.f324g, this.f325h, c0056p);
                break;
            case 1:
                C0056p c0056p2 = new C0056p(2);
                f0 f0Var2 = this.f323f;
                f0Var2.f351b.d(f0Var2, this.f324g, this.f325h, c0056p2);
                break;
            case 2:
                C0056p c0056p3 = new C0056p(2);
                f0 f0Var3 = this.f323f;
                f0Var3.f351b.c(f0Var3, this.f324g, this.f325h, c0056p3);
                break;
            case 3:
                C0056p c0056p4 = new C0056p(2);
                f0 f0Var4 = this.f323f;
                f0Var4.f351b.e(f0Var4, this.f324g, this.f325h, c0056p4);
                break;
            default:
                C0056p c0056p5 = new C0056p(2);
                f0 f0Var5 = this.f323f;
                f0Var5.f351b.f(f0Var5, this.f324g, this.f325h, c0056p5);
                break;
        }
    }
}
