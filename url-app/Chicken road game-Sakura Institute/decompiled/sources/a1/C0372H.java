package a1;

import Z.AbstractC0304a;
import android.view.WindowInsets;

/* renamed from: a1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0372H extends AbstractC0374J {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f4850c;

    public C0372H() {
        this.f4850c = AbstractC0304a.g();
    }

    @Override // a1.AbstractC0374J
    public C0383T b() {
        WindowInsets build;
        a();
        build = this.f4850c.build();
        C0383T b4 = C0383T.b(null, build);
        b4.f4871a.p(this.f4852b);
        return b4;
    }

    @Override // a1.AbstractC0374J
    public void d(V0.c cVar) {
        this.f4850c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // a1.AbstractC0374J
    public void e(V0.c cVar) {
        this.f4850c.setStableInsets(cVar.d());
    }

    @Override // a1.AbstractC0374J
    public void f(V0.c cVar) {
        this.f4850c.setSystemGestureInsets(cVar.d());
    }

    @Override // a1.AbstractC0374J
    public void g(V0.c cVar) {
        this.f4850c.setSystemWindowInsets(cVar.d());
    }

    @Override // a1.AbstractC0374J
    public void h(V0.c cVar) {
        this.f4850c.setTappableElementInsets(cVar.d());
    }

    public C0372H(C0383T c0383t) {
        super(c0383t);
        WindowInsets.Builder g4;
        WindowInsets a4 = c0383t.a();
        if (a4 != null) {
            g4 = AbstractC0304a.h(a4);
        } else {
            g4 = AbstractC0304a.g();
        }
        this.f4850c = g4;
    }
}
