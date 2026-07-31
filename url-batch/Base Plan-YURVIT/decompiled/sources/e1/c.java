package e1;

import B0.E;
import O0.l;
import W0.C0066f;
import W0.InterfaceC0065e;
import W0.l0;
import b1.v;

/* loaded from: classes.dex */
public final class c implements InterfaceC0065e, l0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0066f f1869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1870f;

    public c(d dVar, C0066f c0066f) {
        this.f1870f = dVar;
        this.f1869e = c0066f;
    }

    @Override // W0.l0
    public final void a(v vVar, int i2) {
        this.f1869e.a(vVar, i2);
    }

    @Override // G0.d
    public final G0.i e() {
        return this.f1869e.f951i;
    }

    @Override // W0.InterfaceC0065e
    public final E f(Object obj, l lVar) {
        d dVar = this.f1870f;
        b bVar = new b(dVar, this, 1);
        E f2 = this.f1869e.f((D0.h) obj, bVar);
        if (f2 != null) {
            d.f1871g.set(dVar, null);
        }
        return f2;
    }

    @Override // G0.d
    public final void g(Object obj) {
        this.f1869e.g(obj);
    }

    @Override // W0.InterfaceC0065e
    public final void n(Object obj) {
        this.f1869e.n(obj);
    }
}
