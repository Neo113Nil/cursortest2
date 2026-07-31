package x1;

import f2.j;
import java.util.Locale;
import n.z0;
import n2.AbstractC0730j;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10297b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10298c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10299d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10300e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10301f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10302g;

    public C1222a(String str, String str2, boolean z3, int i3, String str3, int i4) {
        this.f10296a = str;
        this.f10297b = str2;
        this.f10298c = z3;
        this.f10299d = i3;
        this.f10300e = str3;
        this.f10301f = i4;
        this.f10302g = findAffinity(str2);
    }

    private final int findAffinity(String str) {
        if (str == null) {
            return 5;
        }
        Locale locale = Locale.US;
        j.e(locale, "US");
        String upperCase = str.toUpperCase(locale);
        j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (AbstractC0730j.C(upperCase, "INT")) {
            return 3;
        }
        if (AbstractC0730j.C(upperCase, "CHAR") || AbstractC0730j.C(upperCase, "CLOB") || AbstractC0730j.C(upperCase, "TEXT")) {
            return 2;
        }
        if (AbstractC0730j.C(upperCase, "BLOB")) {
            return 5;
        }
        return (AbstractC0730j.C(upperCase, "REAL") || AbstractC0730j.C(upperCase, "FLOA") || AbstractC0730j.C(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1222a)) {
            return false;
        }
        C1222a c1222a = (C1222a) obj;
        if (this.f10299d != c1222a.f10299d) {
            return false;
        }
        if (!this.f10296a.equals(c1222a.f10296a) || this.f10298c != c1222a.f10298c) {
            return false;
        }
        int i3 = c1222a.f10301f;
        String str = c1222a.f10300e;
        String str2 = this.f10300e;
        int i4 = this.f10301f;
        if (i4 == 1 && i3 == 2 && str2 != null && !z0.j(str2, str)) {
            return false;
        }
        if (i4 != 2 || i3 != 1 || str == null || z0.j(str, str2)) {
            return (i4 == 0 || i4 != i3 || (str2 == null ? str == null : z0.j(str2, str))) && this.f10302g == c1222a.f10302g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f10296a.hashCode() * 31) + this.f10302g) * 31) + (this.f10298c ? 1231 : 1237)) * 31) + this.f10299d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f10296a);
        sb.append("', type='");
        sb.append(this.f10297b);
        sb.append("', affinity='");
        sb.append(this.f10302g);
        sb.append("', notNull=");
        sb.append(this.f10298c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f10299d);
        sb.append(", defaultValue='");
        String str = this.f10300e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public static /* synthetic */ void getAffinity$annotations() {
    }
}
