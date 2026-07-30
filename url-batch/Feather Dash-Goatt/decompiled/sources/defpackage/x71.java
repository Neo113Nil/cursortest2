package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx71;", "Lem0;", "Ld71;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class x71 extends em0 {
    public final h71 a;

    public x71(h71 h71Var) {
        this.a = h71Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        d71 d71Var = new d71();
        d71Var.s = this.a;
        d71Var.t = true;
        return d71Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        d71 d71Var = (d71) zl0Var;
        d71Var.s = this.a;
        d71Var.t = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x71) {
            return Intrinsics.a(this.a, ((x71) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qy0.d(this.a.hashCode() * 31, 31, false);
    }
}
