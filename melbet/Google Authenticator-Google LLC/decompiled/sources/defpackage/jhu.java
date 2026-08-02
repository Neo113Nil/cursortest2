package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhu {
    public final boolean a;
    public final Boolean b;
    public final boolean c;
    public final String d;

    public jhu(boolean z, Boolean bool, boolean z2, String str) {
        this.a = z;
        this.b = bool;
        this.c = z2;
        this.d = str;
    }

    public static /* synthetic */ jhu a(jhu jhuVar, boolean z, Boolean bool, boolean z2, String str, int i) {
        if ((i & 1) != 0) {
            z = jhuVar.a;
        }
        if ((i & 2) != 0) {
            bool = jhuVar.b;
        }
        if ((i & 4) != 0) {
            z2 = jhuVar.c;
        }
        if ((i & 8) != 0) {
            str = jhuVar.d;
        }
        return new jhu(z, bool, z2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhu)) {
            return false;
        }
        jhu jhuVar = (jhu) obj;
        return this.a == jhuVar.a && ksp.b(this.b, jhuVar.b) && this.c == jhuVar.c && ksp.b(this.d, jhuVar.d);
    }

    public final int hashCode() {
        Boolean bool = this.b;
        int hashCode = bool == null ? 0 : bool.hashCode();
        boolean z = this.a;
        boolean z2 = this.c;
        String str = this.d;
        return (((((a.m(z) * 31) + hashCode) * 31) + a.m(z2)) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "UserInput(isScrolled=" + this.a + ", isAccountManagementExpanded=" + this.b + ", isAllowInteractions=" + this.c + ", isLoadingInProgressForAccount=" + this.d + ")";
    }

    public jhu() {
        this(false, null, true, null);
    }
}
