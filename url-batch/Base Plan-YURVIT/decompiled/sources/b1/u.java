package b1;

import W0.AbstractC0061a;
import W0.AbstractC0081v;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public class u extends AbstractC0061a implements I0.c {

    /* renamed from: h, reason: collision with root package name */
    public final G0.d f1775h;

    public u(G0.d dVar, G0.i iVar) {
        super(iVar, true);
        this.f1775h = dVar;
    }

    @Override // W0.Z
    public final boolean I() {
        return true;
    }

    @Override // I0.c
    public final I0.c d() {
        G0.d dVar = this.f1775h;
        if (dVar instanceof I0.c) {
            return (I0.c) dVar;
        }
        return null;
    }

    @Override // W0.Z
    public void p(Object obj) {
        AbstractC0115a.g(AbstractC0086a.v(this.f1775h), AbstractC0081v.g(obj));
    }

    @Override // W0.Z
    public void q(Object obj) {
        this.f1775h.g(AbstractC0081v.g(obj));
    }
}
