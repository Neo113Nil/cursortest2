package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Li71;", "Lem0;", "Lj71;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class i71 extends em0 {
    public final w71 a;
    public final et0 b;
    public final boolean c;
    public final xp d;
    public final gn0 e;
    public final boolean f;
    public final i5 g;

    public i71(i5 i5Var, xp xpVar, gn0 gn0Var, et0 et0Var, w71 w71Var, boolean z, boolean z2) {
        this.a = w71Var;
        this.b = et0Var;
        this.c = z;
        this.d = xpVar;
        this.e = gn0Var;
        this.f = z2;
        this.g = i5Var;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        j71 j71Var = new j71();
        j71Var.u = this.a;
        j71Var.v = this.b;
        j71Var.w = this.c;
        j71Var.x = this.d;
        j71Var.y = this.e;
        j71Var.z = this.f;
        j71Var.A = this.g;
        return j71Var;
    }

    @Override // defpackage.em0
    public final void e(zl0 zl0Var) {
        ((j71) zl0Var).E0(this.g, this.d, this.e, this.b, this.a, this.f, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i71.class != obj.getClass()) {
            return false;
        }
        i71 i71Var = (i71) obj;
        return Intrinsics.a(this.a, i71Var.a) && this.b == i71Var.b && this.c == i71Var.c && Intrinsics.a(this.d, i71Var.d) && Intrinsics.a(this.e, i71Var.e) && this.f == i71Var.f && Intrinsics.a(this.g, i71Var.g);
    }

    public final int hashCode() {
        int d = qy0.d(qy0.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        xp xpVar = this.d;
        int hashCode = (d + (xpVar != null ? xpVar.hashCode() : 0)) * 31;
        gn0 gn0Var = this.e;
        int d2 = qy0.d((hashCode + (gn0Var != null ? gn0Var.hashCode() : 0)) * 961, 31, this.f);
        i5 i5Var = this.g;
        return d2 + (i5Var != null ? i5Var.hashCode() : 0);
    }
}
