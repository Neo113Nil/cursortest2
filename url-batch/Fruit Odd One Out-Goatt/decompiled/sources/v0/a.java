package v0;

import c1.p;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: b, reason: collision with root package name */
    public final g f1189b;

    public a(g gVar) {
        this.f1189b = gVar;
    }

    @Override // v0.h
    public final Object a(Object obj, p pVar) {
        return pVar.g(obj, this);
    }

    @Override // v0.f
    public final g getKey() {
        return this.f1189b;
    }

    @Override // v0.h
    public final h h(h hVar) {
        return a.a.r(this, hVar);
    }

    @Override // v0.h
    public h i(g gVar) {
        gVar.getClass();
        return d1.h.a(getKey(), gVar) ? i.f1196b : this;
    }

    @Override // v0.h
    public f j(g gVar) {
        gVar.getClass();
        if (d1.h.a(getKey(), gVar)) {
            return this;
        }
        return null;
    }
}
