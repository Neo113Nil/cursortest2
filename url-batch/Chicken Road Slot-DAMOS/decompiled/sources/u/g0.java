package u;

import a2.r0;
import c2.o0;
import kotlin.jvm.functions.Function0;
import v.s0;
import v.t0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 extends k0 {
    public z0 C;
    public i0 D;
    public Function0 E;
    public y F;
    public long G;
    public d1.d H;

    @Override // d1.k
    public final void A() {
        this.G = u.f9550a;
    }

    @Override // c2.v
    public final a2.h0 v(o0 o0Var, a2.f0 f0Var, long j) {
        if (this.C.f9917a.l() == this.C.f9920d.getValue()) {
            this.H = null;
        } else if (this.H == null) {
            if (this.C.f().b(w.f9555d, w.f9556e)) {
                m0 m0Var = this.D.f9520a;
            } else {
                m0 m0Var2 = this.D.f9520a;
            }
            this.H = d1.a.f3282d;
        }
        if (o0Var.j()) {
            a2.o0 c10 = f0Var.c(j);
            long j3 = (c10.f131d << 32) | (c10.f132e & 4294967295L);
            this.G = j3;
            return a2.i0.V(o0Var, (int) (j3 >> 32), (int) (j3 & 4294967295L), new r0(c10, 3));
        }
        if (!((Boolean) this.E.invoke()).booleanValue()) {
            a2.o0 c11 = f0Var.c(j);
            return a2.i0.V(o0Var, c11.f131d, c11.f132e, new r0(c11, 4));
        }
        y yVar = this.F;
        t0 t0Var = yVar.f9564a;
        t0 t0Var2 = yVar.f9565b;
        z0 z0Var = yVar.f9566c;
        h0 h0Var = yVar.f9567d;
        i0 i0Var = yVar.f9568e;
        t0 t0Var3 = yVar.f9569f;
        s0 a9 = t0Var != null ? t0Var.a(new a0(h0Var, i0Var, 0), new a0(h0Var, i0Var, 1)) : null;
        s0 a10 = t0Var2 != null ? t0Var2.a(new a0(h0Var, i0Var, 2), new a0(h0Var, i0Var, 3)) : null;
        if (z0Var.f9917a.l() == w.f9555d) {
            m0 m0Var3 = i0Var.f9520a;
        } else {
            m0 m0Var4 = i0Var.f9520a;
        }
        a3.i iVar = new a3.i(a9, a10, t0Var3 != null ? t0Var3.a(z.f9572r, new a3.i(null, h0Var, i0Var, 5)) : null, 4);
        a2.o0 c12 = f0Var.c(j);
        long j10 = (c12.f131d << 32) | (c12.f132e & 4294967295L);
        long j11 = !x2.k.a(this.G, u.f9550a) ? this.G : j10;
        long d10 = x2.b.d(j, j10);
        d1.d dVar = this.H;
        return a2.i0.V(o0Var, (int) (d10 >> 32), (int) (d10 & 4294967295L), new e0(c12, x2.i.c(dVar != null ? dVar.a(j11, d10, x2.l.f10330d) : 0L, 0L), 0L, iVar));
    }
}
