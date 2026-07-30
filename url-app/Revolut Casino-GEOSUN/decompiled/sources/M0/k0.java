package M0;

/* loaded from: classes.dex */
public final class k0 implements w0.g, w0.h {

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f669e = new k0();

    @Override // w0.i
    public final w0.g f(w0.h hVar) {
        return o.g.m(this, hVar);
    }

    @Override // w0.i
    public final Object h(Object obj, E0.p pVar) {
        return pVar.f(obj, this);
    }

    @Override // w0.i
    public final w0.i i(w0.h hVar) {
        return o.g.u(this, hVar);
    }

    @Override // w0.i
    public final w0.i k(w0.i iVar) {
        F0.i.e(iVar, "context");
        return iVar == w0.j.f3082e ? this : (w0.i) iVar.h(this, new w0.b(1));
    }

    @Override // w0.g
    public final w0.h getKey() {
        return this;
    }
}
