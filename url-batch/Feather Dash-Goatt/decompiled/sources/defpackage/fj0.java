package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fj0 extends yw0 {
    public final /* synthetic */ int e;
    public final Object g;

    public /* synthetic */ fj0(int i, Object obj) {
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.yw0
    public float b(o60 o60Var) {
        float intBitsToFloat;
        int k;
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Function2 function2 = o60Var.a;
                if (function2 != null) {
                    return ((Number) function2.b(this, Float.valueOf(Float.NaN))).floatValue();
                }
                ej0 ej0Var = (ej0) this.g;
                if (ej0Var.o) {
                    return Float.NaN;
                }
                ej0 ej0Var2 = ej0Var;
                while (true) {
                    u41 u41Var = ej0Var2.q;
                    if (!Float.isNaN((u41Var == null || (k = y9.k(u41Var.b, o60Var)) < 0) ? Float.NaN : u41Var.c[k])) {
                        ej0Var2.d0(ej0Var.q0(), o60Var);
                        uc0 o0 = ej0Var2.o0();
                        uc0 o02 = ej0Var.o0();
                        switch (o60Var.b) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                intBitsToFloat = Float.intBitsToFloat((int) (o02.C(o0, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (o0.K() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (o02.C(o0, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (o0.K() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    ej0 s0 = ej0Var2.s0();
                    if (s0 == null) {
                        ej0Var2.d0(ej0Var.q0(), o60Var);
                        return Float.NaN;
                    }
                    ej0Var2 = s0;
                }
                break;
            default:
                return super.b(o60Var);
        }
    }

    @Override // defpackage.yw0
    public final vc0 c() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ej0) obj).getLayoutDirection();
            default:
                return ((d4) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.nr
    public final float f() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ej0) obj).f();
            default:
                return ((d4) obj).getDensity().f();
        }
    }

    @Override // defpackage.yw0
    public final int g() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ej0) obj).W();
            default:
                return ((d4) obj).getRoot().K.p.d;
        }
    }

    @Override // defpackage.nr
    public final float k() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ej0) obj).k();
            default:
                return ((d4) obj).getDensity().k();
        }
    }
}
