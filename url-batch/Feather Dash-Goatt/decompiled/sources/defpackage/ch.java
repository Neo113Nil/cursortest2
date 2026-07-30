package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lch;", "Lem0;", "Leh;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
final class ch extends em0 {
    public final gn0 a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;

    public ch(gn0 gn0Var, boolean z, boolean z2, Function0 function0) {
        this.a = gn0Var;
        this.b = z;
        this.c = z2;
        this.d = function0;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        return new eh(this.a, this.b, this.c, this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7.A == null) goto L31;
     */
    @Override // defpackage.em0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(zl0 zl0Var) {
        boolean z;
        yq yqVar;
        eh ehVar = (eh) zl0Var;
        s10 s10Var = ehVar.y;
        gn0 gn0Var = ehVar.G;
        gn0 gn0Var2 = this.a;
        boolean z2 = true;
        if (Intrinsics.a(gn0Var, gn0Var2)) {
            z = false;
        } else {
            ehVar.C0();
            ehVar.G = gn0Var2;
            ehVar.u = gn0Var2;
            z = true;
        }
        boolean z3 = ehVar.v;
        boolean z4 = this.b;
        if (z3 != z4) {
            ehVar.v = z4;
            if (z4) {
                ehVar.B();
            }
            z = true;
        }
        boolean z5 = ehVar.w;
        boolean z6 = this.c;
        if (z5 != z6) {
            if (z6) {
                ehVar.z0(s10Var);
            } else {
                ehVar.A0(s10Var);
                ehVar.C0();
            }
            ka0.v(ehVar);
            ehVar.w = z6;
        }
        ehVar.x = this.d;
        boolean z7 = ehVar.H;
        gn0 gn0Var3 = ehVar.G;
        if (z7 != (gn0Var3 == null)) {
            boolean z8 = gn0Var3 == null;
            ehVar.H = z8;
            if (!z8) {
            }
        }
        z2 = z;
        if (z2 && ((yqVar = ehVar.A) != null || !ehVar.H)) {
            if (yqVar != null) {
                ehVar.A0(yqVar);
            }
            ehVar.A = null;
            ehVar.G0();
        }
        s10Var.E0(ehVar.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ch.class != obj.getClass()) {
            return false;
        }
        ch chVar = (ch) obj;
        return Intrinsics.a(this.a, chVar.a) && this.b == chVar.b && this.c == chVar.c && this.d == chVar.d;
    }

    public final int hashCode() {
        gn0 gn0Var = this.a;
        return this.d.hashCode() + qy0.d(qy0.d((gn0Var != null ? gn0Var.hashCode() : 0) * 961, 31, this.b), 29791, this.c);
    }
}
