package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehr {
    public static final /* synthetic */ int e = 0;
    private static final jhh f = new jhh(R.string.og_google_one_account_a11y);
    private static final jhh g = new jhh(R.string.og_google_membership_a11y);
    public final jit a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final String h;
    private final String i;
    private final String j;

    public ehr(jit jitVar, boolean z, String str, String str2, String str3, String str4, boolean z2) {
        this.a = jitVar;
        this.b = z;
        this.h = str;
        this.c = str2;
        this.i = str3;
        this.j = str4;
        this.d = z2;
    }

    public final jfj a(jfi jfiVar) {
        if (jfiVar == null) {
            return null;
        }
        this.a.c.getClass();
        jfk a = jfiVar.a();
        if (a != null) {
            return a.a();
        }
        return null;
    }

    public final jgi b(jfr jfrVar, boolean z) {
        return new jgi(1.0f, c(jfrVar, z), null);
    }

    public final jhm c(jfr jfrVar, boolean z) {
        jit jitVar = this.a;
        jho a = jfrVar.a(jitVar);
        int a2 = a != null ? a.a() : 0;
        if (a2 != 0 ? ili.a(a2) : this.d) {
            return new jhm(z ? 3 : 2, z ? g : f, jfrVar.a(jitVar));
        }
        return new jhm(1, null, null);
    }

    public final String d() {
        String str = this.i;
        return str == null ? this.h : str;
    }

    public final String e() {
        return ksp.q(this.c, '-', (char) 8209);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehr)) {
            return false;
        }
        ehr ehrVar = (ehr) obj;
        return ksp.b(this.a, ehrVar.a) && this.b == ehrVar.b && ksp.b(this.h, ehrVar.h) && ksp.b(this.c, ehrVar.c) && ksp.b(this.i, ehrVar.i) && ksp.b(this.j, ehrVar.j) && this.d == ehrVar.d;
    }

    public final String f() {
        String str = this.h;
        if (str != null) {
            return ksp.q(str, '-', (char) 8209);
        }
        return null;
    }

    public final void g(jfi jfiVar) {
        if (a(jfiVar) != null) {
            throw null;
        }
    }

    public final jgg h(int i, jfr jfrVar, jhu jhuVar, boolean z) {
        String str;
        jfrVar.getClass();
        String str2 = this.h;
        String e2 = (str2 == null || ksp.b(str2, this.c) || !jfrVar.b(this.a)) ? null : e();
        jit jitVar = this.a;
        jgi jgiVar = new jgi(i == 1 ? 1.0f : 0.38f, c(jfrVar, z), null);
        String f2 = f();
        if (f2 == null) {
            f2 = e();
        }
        int i2 = i - 1;
        return new jgg(jitVar, jgiVar, f2, e2, i, i2 != 0 ? i2 != 1 ? (jhuVar == null || (str = jhuVar.d) == null || !str.equals(jitVar.c)) ? new jht(new jir(new jhq(new jhh(R.string.og_deactivated_label), jhb.c, 5, (Integer) 1, 16), jhb.l), 2) : new jht(new jiq(new jhl(), 3), 2) : new jht(new jiq(new jha(21, new jhh(R.string.og_deactivated_label)), 3), 4) : null, null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.h;
        int m = (((((hashCode + a.m(this.b)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        String str2 = this.i;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + a.m(this.d);
    }

    public final String toString() {
        return "AccountInfo(accountIdentifier=" + this.a + ", isGaiaAccount=" + this.b + ", displayName=" + this.h + ", accountName=" + this.c + ", givenName=" + this.i + ", familyName=" + this.j + ", isG1Account=" + this.d + ")";
    }
}
