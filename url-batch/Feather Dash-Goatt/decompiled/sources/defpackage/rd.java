package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrd;", "Lem0;", "Lsd;", "foundation-layout"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class rd extends em0 {
    public final kd a;
    public final boolean b;

    public rd(kd kdVar, boolean z) {
        this.a = kdVar;
        this.b = z;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        sd sdVar = new sd();
        sdVar.s = this.a;
        sdVar.t = this.b;
        return sdVar;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        sd sdVar = (sd) zl0Var;
        sdVar.s = this.a;
        sdVar.t = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rd rdVar = obj instanceof rd ? (rd) obj : null;
        return rdVar != null && this.a.equals(rdVar.a) && this.b == rdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
