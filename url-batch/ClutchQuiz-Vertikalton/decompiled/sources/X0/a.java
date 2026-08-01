package X0;

import f1.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f1150a;

    public a(h hVar) {
        this.f1150a = hVar;
    }

    @Override // X0.g
    public final h getKey() {
        return this.f1150a;
    }

    @Override // X0.i
    public g j(h hVar) {
        return T.d.r(this, hVar);
    }

    @Override // X0.i
    public final i k(i iVar) {
        return T.d.G(this, iVar);
    }

    @Override // X0.i
    public i p(h hVar) {
        return T.d.A(this, hVar);
    }

    @Override // X0.i
    public final Object u(Object obj, p pVar) {
        return pVar.d(obj, this);
    }
}
