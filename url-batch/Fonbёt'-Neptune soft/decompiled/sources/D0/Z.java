package D0;

import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f305h;

    public /* synthetic */ Z(Object obj, Object obj2, Object obj3, int i2) {
        this.f302e = i2;
        this.f303f = obj;
        this.f304g = obj2;
        this.f305h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f302e) {
            case 0:
                C0056p c0056p = new C0056p(2);
                f0 f0Var = (f0) this.f303f;
                f0Var.f351b.g(f0Var, (WebView) this.f304g, (ClientCertRequest) this.f305h, c0056p);
                break;
            case 1:
                C0056p c0056p2 = new C0056p(2);
                f0 f0Var2 = (f0) this.f303f;
                f0Var2.f351b.o(f0Var2, (WebView) this.f304g, (WebResourceRequest) this.f305h, c0056p2);
                break;
            case 2:
                C0056p c0056p3 = new C0056p(3);
                h0 h0Var = (h0) this.f303f;
                h0Var.f361a.g(h0Var, (WebView) this.f304g, (ClientCertRequest) this.f305h, c0056p3);
                break;
            case 3:
                C0056p c0056p4 = new C0056p(3);
                h0 h0Var2 = (h0) this.f303f;
                h0Var2.f361a.o(h0Var2, (WebView) this.f304g, (WebResourceRequest) this.f305h, c0056p4);
                break;
            default:
                m0.w wVar = (m0.w) this.f303f;
                wVar.getClass();
                m0.C c2 = (m0.C) this.f304g;
                wVar.c(false, Long.valueOf(c2.f3125b), Long.valueOf(c2.f3124a), ((KeyEvent) this.f305h).getEventTime());
                break;
        }
    }
}
