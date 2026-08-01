package x;

import c2.i0;
import c2.k1;
import c2.x1;
import k1.a0;
import k1.f0;
import k1.y;
import k1.z;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends d1.k implements c2.l, k1, x1 {
    public long C;
    public f0 D;
    public long E;
    public x2.l F;
    public k1.v G;
    public f0 H;
    public k1.v I;

    @Override // c2.x1
    public final boolean b() {
        return false;
    }

    @Override // c2.l
    public final void f(i0 i0Var) {
        k1.v vVar;
        m1.b bVar = i0Var.f1585d;
        if (this.D != k1.v.f5351b) {
            if (j1.e.a(bVar.u(), this.E) && i0Var.getLayoutDirection() == this.F && Intrinsics.a(this.H, this.D)) {
                vVar = this.G;
                vVar.getClass();
            } else {
                c2.k.r(this, new a4.a(13, this, i0Var));
                vVar = this.I;
                this.I = null;
            }
            this.G = vVar;
            this.E = bVar.u();
            this.F = i0Var.getLayoutDirection();
            this.H = this.D;
            vVar.getClass();
            if (!k1.p.c(this.C, k1.p.g)) {
                long j = this.C;
                boolean z10 = vVar instanceof z;
                m1.f fVar = m1.f.f6411b;
                if (z10) {
                    j1.c cVar = ((z) vVar).f5357f;
                    float f3 = cVar.f4916a;
                    float f10 = cVar.f4917b;
                    long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (4294967295L & Float.floatToRawIntBits(f10));
                    float f11 = cVar.f4918c - cVar.f4916a;
                    float f12 = cVar.f4919d - cVar.f4917b;
                    i0Var.i(j, floatToRawIntBits, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), fVar, 3);
                } else if (vVar instanceof a0) {
                    a0 a0Var = (a0) vVar;
                    k1.g gVar = a0Var.g;
                    if (gVar != null) {
                        i0Var.c(gVar, j, fVar);
                    } else {
                        j1.d dVar = a0Var.f5295f;
                        float f13 = dVar.f4920a;
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.f4926h >> 32));
                        float f14 = dVar.f4921b;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
                        float f15 = dVar.f4922c - f13;
                        float a9 = dVar.a();
                        long floatToRawIntBits3 = (Float.floatToRawIntBits(a9) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32);
                        long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                        int i3 = (int) (floatToRawIntBits2 >> 32);
                        int i10 = (int) (floatToRawIntBits2 & 4294967295L);
                        bVar.f6405d.f6403c.d(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (floatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits4 & 4294967295L)), m1.b.a(bVar, j, fVar, 3));
                    }
                } else {
                    if (!(vVar instanceof y)) {
                        a2.r.p();
                        return;
                    }
                    i0Var.c(((y) vVar).f5356f, j, fVar);
                }
            }
        } else if (!k1.p.c(this.C, k1.p.g)) {
            m1.d.r(i0Var, this.C, 0L, 126);
        }
        i0Var.a();
    }

    @Override // c2.k1
    public final void h() {
        this.E = 9205357640488583168L;
        this.F = null;
        this.G = null;
        this.H = null;
        c2.k.l(this);
    }

    @Override // c2.x1
    public final void u(j2.u uVar) {
        f0 f0Var = this.D;
        wd.y[] yVarArr = j2.s.f5019a;
        j2.t tVar = j2.q.M;
        wd.y yVar = j2.s.f5019a[30];
        uVar.b(tVar, f0Var);
    }
}
