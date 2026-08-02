package H0;

import P0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: e, reason: collision with root package name */
    public final h f496e;

    public a(h hVar) {
        this.f496e = hVar;
    }

    @Override // H0.i
    public i d(h hVar) {
        return i1.a.v(this, hVar);
    }

    @Override // H0.g
    public final h getKey() {
        return this.f496e;
    }

    @Override // H0.i
    public final i i(i iVar) {
        Q0.h.e(iVar, "context");
        return iVar == j.f503e ? this : (i) iVar.m(this, b.f498h);
    }

    @Override // H0.i
    public g k(h hVar) {
        return i1.a.m(this, hVar);
    }

    @Override // H0.i
    public final Object m(Object obj, p pVar) {
        return pVar.h(obj, this);
    }
}
