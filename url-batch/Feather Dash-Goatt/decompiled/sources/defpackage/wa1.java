package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwa1;", "Lem0;", "Lya1;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class wa1 extends em0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ wa1(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4);
    }

    @Override // defpackage.em0
    public final zl0 d() {
        ya1 ya1Var = new ya1();
        ya1Var.s = this.a;
        ya1Var.t = this.b;
        ya1Var.u = this.c;
        ya1Var.v = this.d;
        ya1Var.w = this.e;
        return ya1Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ya1 ya1Var = (ya1) zl0Var;
        ya1Var.s = this.a;
        ya1Var.t = this.b;
        ya1Var.u = this.c;
        ya1Var.v = this.d;
        ya1Var.w = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa1)) {
            return false;
        }
        wa1 wa1Var = (wa1) obj;
        return bt.a(this.a, wa1Var.a) && bt.a(this.b, wa1Var.b) && bt.a(this.c, wa1Var.c) && bt.a(this.d, wa1Var.d) && this.e == wa1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qy0.b(this.d, qy0.b(this.c, qy0.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public wa1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = true;
    }
}
