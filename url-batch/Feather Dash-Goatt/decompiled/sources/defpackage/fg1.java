package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfg1;", "Lem0;", "Lgg1;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class fg1 extends em0 {
    public final km1 a;

    public fg1(km1 km1Var) {
        this.a = km1Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        sz szVar = la0.w;
        gg1 gg1Var = new gg1();
        gg1Var.u = szVar;
        gg1Var.v = this.a;
        return gg1Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        gg1 gg1Var = (gg1) zl0Var;
        km1 km1Var = gg1Var.v;
        km1 km1Var2 = this.a;
        if (km1Var != km1Var2) {
            gg1Var.v = km1Var2;
            kp1 kp1Var = gg1Var.w;
            if (kp1Var != null) {
                dl1 dl1Var = kp1Var.l;
                if (Intrinsics.a(dl1Var, gg1Var.u)) {
                    return;
                }
                gg1Var.u = dl1Var;
                gg1Var.z0();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fg1) {
            return this.a == ((fg1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
