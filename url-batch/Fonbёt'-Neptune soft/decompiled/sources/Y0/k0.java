package Y0;

/* loaded from: classes.dex */
public final class k0 implements H0.g, H0.h {

    /* renamed from: e, reason: collision with root package name */
    public static final k0 f1212e = new k0();

    @Override // H0.i
    public final H0.i d(H0.h hVar) {
        return i1.a.v(this, hVar);
    }

    @Override // H0.i
    public final H0.i i(H0.i iVar) {
        Q0.h.e(iVar, "context");
        return iVar == H0.j.f503e ? this : (H0.i) iVar.m(this, H0.b.f498h);
    }

    @Override // H0.i
    public final H0.g k(H0.h hVar) {
        return i1.a.m(this, hVar);
    }

    @Override // H0.i
    public final Object m(Object obj, P0.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // H0.g
    public final H0.h getKey() {
        return this;
    }
}
