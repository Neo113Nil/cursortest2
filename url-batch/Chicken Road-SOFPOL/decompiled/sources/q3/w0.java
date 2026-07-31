package q3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class w0 extends a1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f6168c;

    public w0() {
        this.f6168c = i3.f.i();
    }

    @Override // q3.a1
    public l1 b() {
        WindowInsets build;
        a();
        build = this.f6168c.build();
        l1 d8 = l1.d(null, build);
        d8.f6127a.q(this.f6074b);
        return d8;
    }

    @Override // q3.a1
    public void d(i3.c cVar) {
        this.f6168c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // q3.a1
    public void e(i3.c cVar) {
        this.f6168c.setStableInsets(cVar.d());
    }

    @Override // q3.a1
    public void f(i3.c cVar) {
        this.f6168c.setSystemGestureInsets(cVar.d());
    }

    @Override // q3.a1
    public void g(i3.c cVar) {
        this.f6168c.setSystemWindowInsets(cVar.d());
    }

    @Override // q3.a1
    public void h(i3.c cVar) {
        this.f6168c.setTappableElementInsets(cVar.d());
    }

    public w0(l1 l1Var) {
        super(l1Var);
        WindowInsets.Builder i;
        WindowInsets c8 = l1Var.c();
        if (c8 != null) {
            i = i3.f.j(c8);
        } else {
            i = i3.f.i();
        }
        this.f6168c = i;
    }
}
