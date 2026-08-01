package b1;

import j1.p;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0081a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final i f2041a;

    public AbstractC0081a(i iVar) {
        this.f2041a = iVar;
    }

    @Override // b1.j
    public j d(i iVar) {
        return g.s(this, iVar);
    }

    @Override // b1.h
    public final i getKey() {
        return this.f2041a;
    }

    @Override // b1.j
    public final j j(j jVar) {
        return g.x(this, jVar);
    }

    @Override // b1.j
    public final Object k(Object obj, p pVar) {
        return pVar.d(obj, this);
    }

    @Override // b1.j
    public h p(i iVar) {
        return g.n(this, iVar);
    }
}
