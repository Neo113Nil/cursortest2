package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyq0;", "Lem0;", "Lzq0;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class yq0 extends em0 {
    public final float a;
    public final float b;

    public yq0(float f, float f2, q1 q1Var) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        zq0 zq0Var = new zq0();
        zq0Var.s = this.a;
        zq0Var.t = this.b;
        zq0Var.u = true;
        return zq0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        zq0 zq0Var = (zq0) zl0Var;
        float f = zq0Var.s;
        float f2 = this.a;
        boolean a = bt.a(f, f2);
        float f3 = this.b;
        if (!a || !bt.a(zq0Var.t, f3) || !zq0Var.u) {
            op.I(zq0Var).S(false);
        }
        zq0Var.s = f2;
        zq0Var.t = f3;
        zq0Var.u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        yq0 yq0Var = obj instanceof yq0 ? (yq0) obj : null;
        return yq0Var != null && bt.a(this.a, yq0Var.a) && bt.a(this.b, yq0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qy0.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) bt.b(this.a)) + ", y=" + ((Object) bt.b(this.b)) + ", rtlAware=true)";
    }
}
