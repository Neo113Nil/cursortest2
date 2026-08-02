package D0;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebView f338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f341i;

    public /* synthetic */ d0(WebViewClient webViewClient, WebView webView, String str, boolean z2, int i2) {
        this.f337e = i2;
        this.f341i = webViewClient;
        this.f338f = webView;
        this.f339g = str;
        this.f340h = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f337e) {
            case 0:
                C0056p c0056p = new C0056p(2);
                f0 f0Var = (f0) this.f341i;
                f0Var.f351b.a(f0Var, this.f338f, this.f339g, this.f340h, c0056p);
                break;
            default:
                C0056p c0056p2 = new C0056p(3);
                h0 h0Var = (h0) this.f341i;
                h0Var.f361a.a(h0Var, this.f338f, this.f339g, this.f340h, c0056p2);
                break;
        }
    }
}
