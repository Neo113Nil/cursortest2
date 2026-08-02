package D0;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebView f297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f300i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f301j;

    public /* synthetic */ Y(WebViewClient webViewClient, WebView webView, int i2, String str, String str2, int i3) {
        this.f296e = i3;
        this.f301j = webViewClient;
        this.f297f = webView;
        this.f298g = i2;
        this.f299h = str;
        this.f300i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f296e) {
            case 0:
                long j2 = this.f298g;
                C0056p c0056p = new C0056p(2);
                f0 f0Var = (f0) this.f301j;
                f0Var.f351b.h(f0Var, this.f297f, j2, this.f299h, this.f300i, c0056p);
                break;
            default:
                long j3 = this.f298g;
                C0056p c0056p2 = new C0056p(3);
                h0 h0Var = (h0) this.f301j;
                h0Var.f361a.h(h0Var, this.f297f, j3, this.f299h, this.f300i, c0056p2);
                break;
        }
    }
}
