package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cn extends ul1 implements xd0, xt1 {
    public long A;
    public cq B;
    public float C;
    public fk2 D;
    public long E;
    public u81 F;
    public bx1 G;
    public fk2 H;

    @Override // defpackage.xt1
    public final void L() {
        this.E = 9205357640488583168L;
        this.F = null;
        this.G = null;
        this.H = null;
        z71.F(this);
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        cq cqVar;
        oa oaVar;
        ns nsVar = k91Var.m;
        if (this.D == ap.e) {
            if (!aw.c(this.A, aw.g)) {
                yd0.H(k91Var, this.A, 0L, 126);
            }
            cq cqVar2 = this.B;
            if (cqVar2 != null) {
                yd0.W(k91Var, cqVar2, 0L, 0L, this.C, null, 118);
            }
        } else {
            c82 c82Var = new c82();
            if (ql2.a(nsVar.f(), this.E) && k91Var.getLayoutDirection() == this.F && Intrinsics.b(this.H, this.D)) {
                bx1 bx1Var = this.G;
                bx1Var.getClass();
                c82Var.m = bx1Var;
            } else {
                j8.P(this, new bn(c82Var, this, k91Var, 0));
            }
            this.G = (bx1) c82Var.m;
            this.E = nsVar.f();
            this.F = k91Var.getLayoutDirection();
            this.H = this.D;
            Object obj = c82Var.m;
            obj.getClass();
            bx1 bx1Var2 = (bx1) obj;
            if (!aw.c(this.A, aw.g)) {
                yk3.B(k91Var, bx1Var2, this.A);
            }
            cq cqVar3 = this.B;
            if (cqVar3 != null) {
                float f = this.C;
                boolean z = bx1Var2 instanceof zw1;
                vl0 vl0Var = vl0.a;
                if (z) {
                    w72 w72Var = ((zw1) bx1Var2).a;
                    float f2 = w72Var.a;
                    float f3 = w72Var.b;
                    k91Var.c(cqVar3, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), yk3.S(w72Var), f, vl0Var);
                } else {
                    if (bx1Var2 instanceof ax1) {
                        ax1 ax1Var = (ax1) bx1Var2;
                        cqVar = cqVar3;
                        oaVar = ax1Var.b;
                        if (oaVar == null) {
                            ub2 ub2Var = ax1Var.a;
                            float f4 = ub2Var.b;
                            float f5 = ub2Var.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (ub2Var.h >> 32));
                            float f6 = ub2Var.c - f5;
                            float f7 = ub2Var.d - f4;
                            k91Var.e(cqVar, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f, vl0Var);
                        }
                    } else if (!(bx1Var2 instanceof yw1)) {
                        a.b();
                        return;
                    } else {
                        oa oaVar2 = ((yw1) bx1Var2).a;
                        cqVar = cqVar3;
                        oaVar = oaVar2;
                    }
                    k91Var.k(oaVar, cqVar, f, vl0Var, 3);
                }
            }
        }
        k91Var.a();
    }
}
