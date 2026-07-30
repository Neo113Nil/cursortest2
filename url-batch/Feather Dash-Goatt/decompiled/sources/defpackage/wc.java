package defpackage;

import com.appsflyer.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wc extends zl0 implements gu, uq0, j81 {
    public ka0 A;
    public long s;
    public op t;
    public float u;
    public u91 v;
    public long w;
    public vc0 x;
    public ka0 y;
    public u91 z;

    @Override // defpackage.uq0
    public final void B() {
        this.w = 9205357640488583168L;
        this.x = null;
        this.y = null;
        this.z = null;
        yr1.O(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x015a  */
    @Override // defpackage.gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(ld0 ld0Var) {
        ka0 ka0Var;
        char c;
        long j;
        op opVar;
        zf zfVar = ld0Var.d;
        if (this.v == m90.m) {
            if (!hi.c(this.s, hi.g)) {
                hu.V(ld0Var, this.s, 0L, 0L, 126);
            }
            op opVar2 = this.t;
            if (opVar2 != null) {
                float f = this.u;
                long l0 = (118 & 4) != 0 ? hu.l0(ld0Var.d.x(), 0L) : 0L;
                if ((118 & 8) != 0) {
                    f = 1.0f;
                }
                ld0Var.g(opVar2, 0L, l0, f, (118 & 16) != 0 ? uy.q : null);
            }
        } else {
            uy uyVar = uy.q;
            if (va1.a(zfVar.x(), this.w) && ld0Var.getLayoutDirection() == this.x && Intrinsics.a(this.z, this.v)) {
                ka0Var = this.y;
                ka0Var.getClass();
            } else {
                gb0.G(this, new vc(this, 0, ld0Var));
                ka0Var = this.A;
                this.A = null;
            }
            ka0 ka0Var2 = ka0Var;
            this.y = ka0Var2;
            this.w = zfVar.x();
            this.x = ld0Var.getLayoutDirection();
            this.z = this.v;
            ka0Var2.getClass();
            if (!hi.c(this.s, hi.g)) {
                long j2 = this.s;
                if (ka0Var2 instanceof ht0) {
                    s11 s11Var = ((ht0) ka0Var2).a;
                    float f2 = s11Var.a;
                    ld0Var.I(j2, (Float.floatToRawIntBits(s11Var.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), xa0.v(s11Var), uyVar, 3);
                    uyVar = uyVar;
                } else {
                    if (ka0Var2 instanceof it0) {
                        it0 it0Var = (it0) ka0Var2;
                        c6 c6Var = it0Var.b;
                        if (c6Var != null) {
                            ld0Var.c(c6Var, j2, uyVar);
                        } else {
                            l41 l41Var = it0Var.a;
                            float f3 = l41Var.b;
                            float f4 = l41Var.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (l41Var.h >> 32));
                            c = ' ';
                            j = 4294967295L;
                            ld0Var.o(j2, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(l41Var.c - f4) << 32) | (Float.floatToRawIntBits(l41Var.d - f3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), uyVar);
                            uyVar = uyVar;
                        }
                    } else {
                        c = ' ';
                        j = 4294967295L;
                        if (!(ka0Var2 instanceof gt0)) {
                            l.a();
                            return;
                        }
                        ld0Var.c(((gt0) ka0Var2).a, j2, uyVar);
                    }
                    opVar = this.t;
                    if (opVar != null) {
                        float f5 = this.u;
                        if (ka0Var2 instanceof ht0) {
                            s11 s11Var2 = ((ht0) ka0Var2).a;
                            float f6 = s11Var2.a;
                            ld0Var.g(opVar, (Float.floatToRawIntBits(s11Var2.b) & j) | (Float.floatToRawIntBits(f6) << c), xa0.v(s11Var2), f5, uyVar);
                        } else if (ka0Var2 instanceof it0) {
                            it0 it0Var2 = (it0) ka0Var2;
                            c6 c6Var2 = it0Var2.b;
                            if (c6Var2 != null) {
                                ld0Var.b0(c6Var2, opVar, f5, uyVar, 3);
                            } else {
                                l41 l41Var2 = it0Var2.a;
                                float f7 = l41Var2.b;
                                float f8 = l41Var2.a;
                                float intBitsToFloat2 = Float.intBitsToFloat((int) (l41Var2.h >> c));
                                long floatToRawIntBits = (Float.floatToRawIntBits(f8) << c) | (Float.floatToRawIntBits(f7) & j);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(l41Var2.c - f8) << c) | (Float.floatToRawIntBits(l41Var2.d - f7) & j);
                                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat2) & j) | (Float.floatToRawIntBits(intBitsToFloat2) << c);
                                zf zfVar2 = ld0Var.d;
                                int i = (int) (floatToRawIntBits >> c);
                                int i2 = (int) (floatToRawIntBits & j);
                                zfVar2.d.c.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (floatToRawIntBits2 >> c)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (floatToRawIntBits2 & j)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (floatToRawIntBits3 >> c)), Float.intBitsToFloat((int) (floatToRawIntBits3 & j)), zfVar2.b(opVar, uyVar, f5, null, 3, 1));
                            }
                        } else {
                            if (!(ka0Var2 instanceof gt0)) {
                                l.a();
                                return;
                            }
                            ld0Var.b0(((gt0) ka0Var2).a, opVar, f5, uyVar, 3);
                        }
                    }
                }
            }
            c = ' ';
            j = 4294967295L;
            opVar = this.t;
            if (opVar != null) {
            }
        }
        ld0Var.a();
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        u91 u91Var = this.v;
        dc0[] dc0VarArr = s81.a;
        t81 t81Var = p81.M;
        dc0 dc0Var = s81.a[28];
        u81Var.a(t81Var, u91Var);
    }

    @Override // defpackage.j81
    public final boolean b() {
        return false;
    }
}
