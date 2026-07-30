package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lph1;", "Lem0;", "Lsh1;", "foundation"}, k = 1, mv = {2, InstallReferrerClient.InstallReferrerResponse.OK, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
/* loaded from: classes.dex */
public final class ph1 extends em0 {
    public final String a;
    public final th1 b;
    public final v10 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public ph1(String str, th1 th1Var, v10 v10Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = th1Var;
        this.c = v10Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.em0
    public final zl0 d() {
        sh1 sh1Var = new sh1();
        sh1Var.s = this.a;
        sh1Var.t = this.b;
        sh1Var.u = this.c;
        sh1Var.v = this.d;
        sh1Var.w = this.e;
        sh1Var.x = this.f;
        sh1Var.y = this.g;
        return sh1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r5.a.a(r3.a) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.em0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(zl0 zl0Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        th1 th1Var;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        v10 v10Var;
        v10 v10Var2;
        int i5;
        int i6;
        sh1 sh1Var = (sh1) zl0Var;
        sh1Var.getClass();
        th1 th1Var2 = sh1Var.t;
        boolean z5 = false;
        boolean z6 = true;
        th1 th1Var3 = this.b;
        if (th1Var3 == th1Var2) {
            th1Var3.getClass();
        } else if (!th1Var3.a.b(th1Var2.a)) {
            z = true;
            str = sh1Var.s;
            str2 = this.a;
            if (Intrinsics.a(str, str2)) {
                sh1Var.s = str2;
                sh1Var.C = null;
                z2 = true;
            } else {
                z2 = false;
            }
            th1Var = sh1Var.t;
            if (th1Var == th1Var3) {
                if (Intrinsics.a(th1Var.b, th1Var3.b)) {
                }
                boolean z7 = !z5;
                sh1Var.t = th1Var3;
                i = sh1Var.y;
                i2 = this.g;
                if (i != i2) {
                    sh1Var.y = i2;
                    z7 = true;
                }
                i3 = sh1Var.x;
                i4 = this.f;
                if (i3 != i4) {
                    sh1Var.x = i4;
                    z7 = true;
                }
                z3 = sh1Var.w;
                z4 = this.e;
                if (z3 != z4) {
                    sh1Var.w = z4;
                    z7 = true;
                }
                v10Var = sh1Var.u;
                v10Var2 = this.c;
                if (!Intrinsics.a(v10Var, v10Var2)) {
                    sh1Var.u = v10Var2;
                    z7 = true;
                }
                i5 = sh1Var.v;
                i6 = this.d;
                if (i5 == i6) {
                    z6 = z7;
                } else {
                    sh1Var.v = i6;
                }
                if (!z2 || z6) {
                    tu0 z0 = sh1Var.z0();
                    String str3 = sh1Var.s;
                    th1 th1Var4 = sh1Var.t;
                    v10 v10Var3 = sh1Var.u;
                    int i7 = sh1Var.v;
                    boolean z8 = sh1Var.w;
                    int i8 = sh1Var.x;
                    int i9 = sh1Var.y;
                    z0.a = str3;
                    z0.b = th1Var4;
                    z0.c = v10Var3;
                    z0.d = i7;
                    z0.e = z8;
                    z0.f = i8;
                    z0.g = i9;
                    z0.q = (z0.q << 2) | 2;
                    z0.b();
                }
                if (sh1Var.r) {
                    if (z2 || (z && sh1Var.B != null)) {
                        ka0.v(sh1Var);
                    }
                    if (z2 || z6) {
                        y90.t(sh1Var);
                        yr1.O(sh1Var);
                    }
                    if (z) {
                        yr1.O(sh1Var);
                        return;
                    }
                    return;
                }
                return;
            }
            th1Var.getClass();
            z5 = true;
            boolean z72 = !z5;
            sh1Var.t = th1Var3;
            i = sh1Var.y;
            i2 = this.g;
            if (i != i2) {
            }
            i3 = sh1Var.x;
            i4 = this.f;
            if (i3 != i4) {
            }
            z3 = sh1Var.w;
            z4 = this.e;
            if (z3 != z4) {
            }
            v10Var = sh1Var.u;
            v10Var2 = this.c;
            if (!Intrinsics.a(v10Var, v10Var2)) {
            }
            i5 = sh1Var.v;
            i6 = this.d;
            if (i5 == i6) {
            }
            if (!z2) {
            }
            tu0 z02 = sh1Var.z0();
            String str32 = sh1Var.s;
            th1 th1Var42 = sh1Var.t;
            v10 v10Var32 = sh1Var.u;
            int i72 = sh1Var.v;
            boolean z82 = sh1Var.w;
            int i82 = sh1Var.x;
            int i92 = sh1Var.y;
            z02.a = str32;
            z02.b = th1Var42;
            z02.c = v10Var32;
            z02.d = i72;
            z02.e = z82;
            z02.f = i82;
            z02.g = i92;
            z02.q = (z02.q << 2) | 2;
            z02.b();
            if (sh1Var.r) {
            }
        }
        z = false;
        str = sh1Var.s;
        str2 = this.a;
        if (Intrinsics.a(str, str2)) {
        }
        th1Var = sh1Var.t;
        if (th1Var == th1Var3) {
        }
        z5 = true;
        boolean z722 = !z5;
        sh1Var.t = th1Var3;
        i = sh1Var.y;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = sh1Var.x;
        i4 = this.f;
        if (i3 != i4) {
        }
        z3 = sh1Var.w;
        z4 = this.e;
        if (z3 != z4) {
        }
        v10Var = sh1Var.u;
        v10Var2 = this.c;
        if (!Intrinsics.a(v10Var, v10Var2)) {
        }
        i5 = sh1Var.v;
        i6 = this.d;
        if (i5 == i6) {
        }
        if (!z2) {
        }
        tu0 z022 = sh1Var.z0();
        String str322 = sh1Var.s;
        th1 th1Var422 = sh1Var.t;
        v10 v10Var322 = sh1Var.u;
        int i722 = sh1Var.v;
        boolean z822 = sh1Var.w;
        int i822 = sh1Var.x;
        int i922 = sh1Var.y;
        z022.a = str322;
        z022.b = th1Var422;
        z022.c = v10Var322;
        z022.d = i722;
        z022.e = z822;
        z022.f = i822;
        z022.g = i922;
        z022.q = (z022.q << 2) | 2;
        z022.b();
        if (sh1Var.r) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph1)) {
            return false;
        }
        ph1 ph1Var = (ph1) obj;
        return Intrinsics.a(this.a, ph1Var.a) && Intrinsics.a(this.b, ph1Var.b) && Intrinsics.a(this.c, ph1Var.c) && this.d == ph1Var.d && this.e == ph1Var.e && this.f == ph1Var.f && this.g == ph1Var.g;
    }

    public final int hashCode() {
        return (((qy0.d(qy0.c(this.d, (this.c.hashCode() + qy0.f(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
