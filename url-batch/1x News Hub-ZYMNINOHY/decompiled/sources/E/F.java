package E;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class F extends K {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f250c;

    public F() {
        this.f250c = E.l();
    }

    @Override // E.K
    public W b() {
        WindowInsets build;
        a();
        build = this.f250c.build();
        W b3 = W.b(build, null);
        b3.f270a.o(this.f252b);
        return b3;
    }

    @Override // E.K
    public void d(x.b bVar) {
        this.f250c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // E.K
    public void e(x.b bVar) {
        this.f250c.setSystemGestureInsets(bVar.d());
    }

    @Override // E.K
    public void f(x.b bVar) {
        this.f250c.setSystemWindowInsets(bVar.d());
    }

    @Override // E.K
    public void g(x.b bVar) {
        this.f250c.setTappableElementInsets(bVar.d());
    }

    public F(W w3) {
        super(w3);
        WindowInsets.Builder l3;
        WindowInsets a3 = w3.a();
        if (a3 != null) {
            l3 = E.m(a3);
        } else {
            l3 = E.l();
        }
        this.f250c = l3;
    }
}
