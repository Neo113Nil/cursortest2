package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltr;", "Lem0;", "Lur;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class tr extends em0 {
    public final ro1 a;

    public tr(ro1 ro1Var) {
        this.a = ro1Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        j61 j61Var = yr1.s;
        ur urVar = new ur();
        urVar.u = this.a;
        urVar.v = j61Var;
        urVar.w = la0.w;
        return urVar;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ur urVar = (ur) zl0Var;
        j61 j61Var = yr1.s;
        ro1 ro1Var = urVar.u;
        ro1 ro1Var2 = this.a;
        if (Intrinsics.a(ro1Var, ro1Var2) && j61Var == urVar.v) {
            return;
        }
        urVar.u = ro1Var2;
        urVar.v = j61Var;
        urVar.w = new mw(ro1Var2, urVar.s);
        y90.t(urVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tr) {
            return Intrinsics.a(this.a, ((tr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return yr1.s.hashCode() + (this.a.hashCode() * 31);
    }
}
