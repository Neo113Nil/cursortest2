package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luc;", "Lem0;", "Lwc;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class uc extends em0 {
    public final long a;
    public final op b;
    public final float c;
    public final u91 d;

    public uc(long j, mh0 mh0Var, u91 u91Var, int i) {
        j = (i & 1) != 0 ? hi.g : j;
        mh0Var = (i & 2) != 0 ? null : mh0Var;
        this.a = j;
        this.b = mh0Var;
        this.c = 1.0f;
        this.d = u91Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        wc wcVar = new wc();
        wcVar.s = this.a;
        wcVar.t = this.b;
        wcVar.u = this.c;
        wcVar.v = this.d;
        wcVar.w = 9205357640488583168L;
        return wcVar;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        wc wcVar = (wc) zl0Var;
        wcVar.s = this.a;
        wcVar.t = this.b;
        wcVar.u = this.c;
        u91 u91Var = wcVar.v;
        u91 u91Var2 = this.d;
        if (!Intrinsics.a(u91Var, u91Var2)) {
            wcVar.v = u91Var2;
            ka0.v(wcVar);
        }
        yr1.O(wcVar);
    }

    public final boolean equals(Object obj) {
        uc ucVar = obj instanceof uc ? (uc) obj : null;
        return ucVar != null && hi.c(this.a, ucVar.a) && Intrinsics.a(this.b, ucVar.b) && this.c == ucVar.c && Intrinsics.a(this.d, ucVar.d);
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        int hashCode = Long.hashCode(this.a) * 31;
        op opVar = this.b;
        return this.d.hashCode() + qy0.b(this.c, (hashCode + (opVar != null ? opVar.hashCode() : 0)) * 31, 31);
    }
}
