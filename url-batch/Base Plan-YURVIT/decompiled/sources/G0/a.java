package G0;

import O0.p;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: e, reason: collision with root package name */
    public final h f495e;

    public a(h hVar) {
        this.f495e = hVar;
    }

    @Override // G0.g
    public final h getKey() {
        return this.f495e;
    }

    @Override // G0.i
    public final Object h(Object obj, p pVar) {
        return pVar.i(obj, this);
    }

    @Override // G0.i
    public /* bridge */ i i(h hVar) {
        return AbstractC0086a.z(this, hVar);
    }

    @Override // G0.i
    public final i j(i iVar) {
        P0.h.e(iVar, "context");
        return iVar == j.f500e ? this : (i) iVar.h(this, new b(1));
    }

    @Override // G0.i
    public /* bridge */ g m(h hVar) {
        return AbstractC0086a.p(this, hVar);
    }
}
