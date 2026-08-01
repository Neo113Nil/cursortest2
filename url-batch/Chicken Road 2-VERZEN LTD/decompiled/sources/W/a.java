package W;

import d0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public final h f389b;

    public a(h hVar) {
        this.f389b = hVar;
    }

    @Override // W.i
    public final i c(i iVar) {
        return a.a.s(this, iVar);
    }

    @Override // W.i
    public i e(h hVar) {
        return a.a.r(this, hVar);
    }

    @Override // W.i
    public final Object f(Object obj, p pVar) {
        return pVar.e(obj, this);
    }

    @Override // W.g
    public final h getKey() {
        return this.f389b;
    }

    @Override // W.i
    public g k(h hVar) {
        return a.a.k(this, hVar);
    }
}
