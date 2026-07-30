package w0;

import E0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: e, reason: collision with root package name */
    public final h f3077e;

    public a(h hVar) {
        this.f3077e = hVar;
    }

    @Override // w0.i
    public g f(h hVar) {
        return o.g.m(this, hVar);
    }

    @Override // w0.g
    public final h getKey() {
        return this.f3077e;
    }

    @Override // w0.i
    public final Object h(Object obj, p pVar) {
        return pVar.f(obj, this);
    }

    @Override // w0.i
    public i i(h hVar) {
        return o.g.u(this, hVar);
    }

    @Override // w0.i
    public final i k(i iVar) {
        F0.i.e(iVar, "context");
        return iVar == j.f3082e ? this : (i) iVar.h(this, new b(1));
    }
}
