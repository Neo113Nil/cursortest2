package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnu0;", "Lem0;", "Lou0;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class nu0 extends em0 {
    public final mu0 a;
    public final ym b;
    public final float c;

    public nu0(mu0 mu0Var, ym ymVar, float f) {
        this.a = mu0Var;
        this.b = ymVar;
        this.c = f;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        kd kdVar = j50.k;
        ou0 ou0Var = new ou0();
        ou0Var.s = this.a;
        ou0Var.t = true;
        ou0Var.u = kdVar;
        ou0Var.v = this.b;
        ou0Var.w = this.c;
        return ou0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ou0 ou0Var = (ou0) zl0Var;
        boolean z = ou0Var.t;
        mu0 mu0Var = this.a;
        boolean z2 = (z && va1.a(ou0Var.s.c(), mu0Var.c())) ? false : true;
        ou0Var.s = mu0Var;
        ou0Var.t = true;
        ou0Var.u = j50.k;
        ou0Var.v = this.b;
        ou0Var.w = this.c;
        if (z2) {
            y90.t(ou0Var);
        }
        yr1.O(ou0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0)) {
            return false;
        }
        nu0 nu0Var = (nu0) obj;
        if (!Intrinsics.a(this.a, nu0Var.a)) {
            return false;
        }
        kd kdVar = j50.k;
        return kdVar.equals(kdVar) && Intrinsics.a(this.b, nu0Var.b) && Float.compare(this.c, nu0Var.c) == 0;
    }

    public final int hashCode() {
        return qy0.b(this.c, (this.b.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + qy0.d(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + j50.k + ", contentScale=" + this.b + ", alpha=" + this.c + ", colorFilter=null)";
    }
}
