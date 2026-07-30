package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxo0;", "Lem0;", "Lap0;", "ui"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class xo0 extends em0 {
    public final wo0 a;

    public xo0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        return new ap0(op.a, this.a);
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ap0 ap0Var = (ap0) zl0Var;
        ap0Var.s = op.a;
        wo0 wo0Var = ap0Var.t;
        if (wo0Var.a == ap0Var) {
            wo0Var.a = null;
        }
        wo0 wo0Var2 = this.a;
        if (wo0Var2 != wo0Var) {
            ap0Var.t = wo0Var2;
        }
        if (ap0Var.r) {
            wo0 wo0Var3 = ap0Var.t;
            wo0Var3.a = ap0Var;
            wo0Var3.b = null;
            ap0Var.u = null;
            wo0Var3.c = new ce(8, ap0Var);
            wo0Var3.d = ap0Var.n0();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xo0) && ((xo0) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() + (op.a.hashCode() * 31);
    }
}
