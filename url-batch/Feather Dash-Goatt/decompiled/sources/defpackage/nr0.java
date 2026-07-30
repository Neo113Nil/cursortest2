package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnr0;", "Lem0;", "Lor0;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class nr0 extends em0 {
    public final w6 a;

    public nr0(w6 w6Var) {
        this.a = w6Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        or0 or0Var = new or0();
        or0Var.s = this.a;
        return or0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ((or0) zl0Var).s = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nr0) {
            return this.a == ((nr0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
