package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwc0;", "Lem0;", "Lzc0;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class wc0 extends em0 {
    public final s30 a;

    public wc0(s30 s30Var) {
        this.a = s30Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        zc0 zc0Var = new zc0();
        zc0Var.s = this.a;
        return zc0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ((zc0) zl0Var).s = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wc0) {
            return this.a == ((wc0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
