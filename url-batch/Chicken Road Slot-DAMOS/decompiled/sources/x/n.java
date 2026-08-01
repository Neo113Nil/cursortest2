package x;

import b5.d0;
import c2.i0;
import ge.a0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends d1.k implements c2.l {
    public final z.f C;
    public boolean D;
    public boolean E;
    public boolean F;

    public n(z.f fVar) {
        this.C = fVar;
    }

    @Override // d1.k
    public final void A() {
        a0.s(w(), null, new d0(this, null, 11), 3);
    }

    @Override // c2.l
    public final void f(i0 i0Var) {
        i0Var.a();
        m1.b bVar = i0Var.f1585d;
        if (this.D) {
            m1.d.r(i0Var, k1.p.b(k1.p.f5336b, 0.3f), bVar.u(), 122);
        } else if (this.E || this.F) {
            m1.d.r(i0Var, k1.p.b(k1.p.f5336b, 0.1f), bVar.u(), 122);
        }
    }
}
