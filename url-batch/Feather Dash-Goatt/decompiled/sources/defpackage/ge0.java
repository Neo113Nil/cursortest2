package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lge0;", "Lem0;", "Lje0;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class ge0 extends em0 {
    public final jf0 a;
    public final ee b;
    public final et0 c;

    public ge0(jf0 jf0Var, ee eeVar, et0 et0Var) {
        this.a = jf0Var;
        this.b = eeVar;
        this.c = et0Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        je0 je0Var = new je0();
        je0Var.s = this.a;
        je0Var.t = this.b;
        je0Var.u = this.c;
        return je0Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        je0 je0Var = (je0) zl0Var;
        je0Var.s = this.a;
        je0Var.t = this.b;
        je0Var.u = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge0)) {
            return false;
        }
        ge0 ge0Var = (ge0) obj;
        return Intrinsics.a(this.a, ge0Var.a) && Intrinsics.a(this.b, ge0Var.b) && this.c == ge0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qy0.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
