package D0;

import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WebView f316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f317h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f318i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f319j;

    public /* synthetic */ b0(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, int i2) {
        this.f314e = i2;
        this.f315f = webViewClient;
        this.f316g = webView;
        this.f319j = httpAuthHandler;
        this.f317h = str;
        this.f318i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f314e) {
            case 0:
                C0056p c0056p = new C0056p(2);
                f0 f0Var = (f0) this.f315f;
                f0Var.f351b.k(f0Var, this.f316g, this.f317h, this.f318i, (String) this.f319j, c0056p);
                break;
            case 1:
                C0056p c0056p2 = new C0056p(2);
                f0 f0Var2 = (f0) this.f315f;
                f0Var2.f351b.i(f0Var2, this.f316g, (HttpAuthHandler) this.f319j, this.f317h, this.f318i, c0056p2);
                break;
            case 2:
                C0056p c0056p3 = new C0056p(3);
                h0 h0Var = (h0) this.f315f;
                h0Var.f361a.k(h0Var, this.f316g, this.f317h, this.f318i, (String) this.f319j, c0056p3);
                break;
            default:
                C0056p c0056p4 = new C0056p(3);
                h0 h0Var2 = (h0) this.f315f;
                h0Var2.f361a.i(h0Var2, this.f316g, (HttpAuthHandler) this.f319j, this.f317h, this.f318i, c0056p4);
                break;
        }
    }

    public /* synthetic */ b0(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, int i2) {
        this.f314e = i2;
        this.f315f = webViewClient;
        this.f316g = webView;
        this.f317h = str;
        this.f318i = str2;
        this.f319j = str3;
    }
}
