package u;

import c2.o0;
import n0.z0;
import v.s0;
import v.t0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends k0 {
    public t0 C;
    public z0 D;
    public o E;
    public long F;

    @Override // d1.k
    public final void C() {
        this.F = f.f9507a;
    }

    @Override // c2.v
    public final a2.h0 v(o0 o0Var, a2.f0 f0Var, long j) {
        long j3;
        a2.o0 c10 = f0Var.c(j);
        if (o0Var.j()) {
            j3 = (c10.f131d << 32) | (c10.f132e & 4294967295L);
        } else {
            t0 t0Var = this.C;
            int i3 = c10.f131d;
            if (t0Var == null) {
                j3 = (i3 << 32) | (c10.f132e & 4294967295L);
                this.F = j3;
            } else {
                long j10 = (c10.f132e & 4294967295L) | (i3 << 32);
                s0 a9 = t0Var.a(new m(this, j10, 0), new m(this, j10, 1));
                this.E.getClass();
                j3 = ((x2.k) a9.getValue()).f10329a;
                this.F = ((x2.k) a9.getValue()).f10329a;
            }
        }
        return a2.i0.V(o0Var, (int) (j3 >> 32), (int) (4294967295L & j3), new l(this, c10, j3));
    }
}
