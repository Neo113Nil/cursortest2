package v2;

import q2.AbstractC0814a;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public class q extends AbstractC0814a implements X1.d {

    /* renamed from: g, reason: collision with root package name */
    public final V1.d f9824g;

    public q(V1.d dVar, V1.i iVar) {
        super(iVar, true);
        this.f9824g = dVar;
    }

    @Override // q2.f0
    public void A(Object obj) {
        a.j(l0.c.B(this.f9824g), AbstractC0837y.s(obj));
    }

    @Override // q2.f0
    public void D(Object obj) {
        this.f9824g.u(AbstractC0837y.s(obj));
    }

    @Override // q2.f0
    public final boolean U() {
        return true;
    }

    @Override // X1.d
    public final X1.d k() {
        V1.d dVar = this.f9824g;
        if (dVar instanceof X1.d) {
            return (X1.d) dVar;
        }
        return null;
    }
}
