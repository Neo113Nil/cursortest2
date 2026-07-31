package c1;

import android.view.WindowInsets;
import b0.AbstractC0350t;

/* loaded from: classes.dex */
public class I extends K {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f5568c;

    public I() {
        this.f5568c = AbstractC0350t.b();
    }

    @Override // c1.K
    public U b() {
        WindowInsets build;
        a();
        build = this.f5568c.build();
        U b3 = U.b(null, build);
        b3.f5589a.p(this.f5570b);
        return b3;
    }

    @Override // c1.K
    public void d(X0.c cVar) {
        this.f5568c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // c1.K
    public void e(X0.c cVar) {
        this.f5568c.setStableInsets(cVar.d());
    }

    @Override // c1.K
    public void f(X0.c cVar) {
        this.f5568c.setSystemGestureInsets(cVar.d());
    }

    @Override // c1.K
    public void g(X0.c cVar) {
        this.f5568c.setSystemWindowInsets(cVar.d());
    }

    @Override // c1.K
    public void h(X0.c cVar) {
        this.f5568c.setTappableElementInsets(cVar.d());
    }

    public I(U u3) {
        super(u3);
        WindowInsets.Builder b3;
        WindowInsets a3 = u3.a();
        if (a3 != null) {
            b3 = AbstractC0350t.c(a3);
        } else {
            b3 = AbstractC0350t.b();
        }
        this.f5568c = b3;
    }
}
