package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lef0;", "Lem0;", "Lif0;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class ef0 extends em0 {
    public final Function0 a;
    public final df0 b;
    public final et0 c;
    public final boolean d;

    public ef0(Function0 function0, df0 df0Var, et0 et0Var, boolean z) {
        this.a = function0;
        this.b = df0Var;
        this.c = et0Var;
        this.d = z;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        return new if0(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        if0 if0Var = (if0) zl0Var;
        if0Var.s = this.a;
        if0Var.t = this.b;
        et0 et0Var = if0Var.u;
        et0 et0Var2 = this.c;
        if (et0Var != et0Var2) {
            if0Var.u = et0Var2;
            ka0.v(if0Var);
        }
        boolean z = if0Var.v;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        if0Var.v = z2;
        if0Var.z0();
        ka0.v(if0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef0)) {
            return false;
        }
        ef0 ef0Var = (ef0) obj;
        return this.a == ef0Var.a && Intrinsics.a(this.b, ef0Var.b) && this.c == ef0Var.c && this.d == ef0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qy0.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
