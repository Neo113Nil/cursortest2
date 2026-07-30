package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rg1 extends m12 {
    public final /* synthetic */ int n;
    public final Object o;

    public /* synthetic */ rg1(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.m12
    public float b(ay0 ay0Var) {
        float intBitsToFloat;
        int u;
        switch (this.n) {
            case 0:
                Function2 function2 = ay0Var.a;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                qg1 qg1Var = (qg1) this.o;
                if (qg1Var.w) {
                    return Float.NaN;
                }
                qg1 qg1Var2 = qg1Var;
                while (true) {
                    te teVar = qg1Var2.y;
                    if (!Float.isNaN((teVar == null || (u = oi.u((ay0[]) teVar.b, ay0Var)) < 0) ? Float.NaN : ((float[]) teVar.c)[u])) {
                        qg1Var2.m0(qg1Var.x0(), ay0Var);
                        t81 v0 = qg1Var2.v0();
                        t81 v02 = qg1Var.v0();
                        switch (ay0Var.b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (v02.u(v0, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (v0.N() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (v02.u(v0, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (v0.N() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    qg1 z0 = qg1Var2.z0();
                    if (z0 == null) {
                        qg1Var2.m0(qg1Var.x0(), ay0Var);
                        return Float.NaN;
                    }
                    qg1Var2 = z0;
                }
                break;
            default:
                return super.b(ay0Var);
        }
    }

    @Override // defpackage.m12
    public final u81 c() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((qg1) obj).getLayoutDirection();
            default:
                return ((t7) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.ca0
    public final float d() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((qg1) obj).d();
            default:
                return ((t7) obj).getDensity().d();
        }
    }

    @Override // defpackage.m12
    public final int e() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((qg1) obj).e0();
            default:
                return ((t7) obj).getRoot().Q.p.m;
        }
    }

    @Override // defpackage.ca0
    public final float p() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return ((qg1) obj).p();
            default:
                return ((t7) obj).getDensity().p();
        }
    }
}
