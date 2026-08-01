package i0;

import b1.g;
import java.util.Locale;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3000a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3001b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3002c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3003e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3004f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3005g;

    public C0163a(String str, String str2, boolean z2, int i, String str3, int i2) {
        this.f3000a = str;
        this.f3001b = str2;
        this.f3002c = z2;
        this.d = i;
        this.f3003e = str3;
        this.f3004f = i2;
        Locale locale = Locale.US;
        k1.e.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        k1.e.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f3005g = r1.d.E(upperCase, "INT") ? 3 : (r1.d.E(upperCase, "CHAR") || r1.d.E(upperCase, "CLOB") || r1.d.E(upperCase, "TEXT")) ? 2 : r1.d.E(upperCase, "BLOB") ? 5 : (r1.d.E(upperCase, "REAL") || r1.d.E(upperCase, "FLOA") || r1.d.E(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0163a)) {
            return false;
        }
        C0163a c0163a = (C0163a) obj;
        if (this.d != c0163a.d) {
            return false;
        }
        if (!this.f3000a.equals(c0163a.f3000a) || this.f3002c != c0163a.f3002c) {
            return false;
        }
        int i = c0163a.f3004f;
        String str = c0163a.f3003e;
        String str2 = this.f3003e;
        int i2 = this.f3004f;
        if (i2 == 1 && i == 2 && str2 != null && !g.j(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || g.j(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : g.j(str2, str))) && this.f3005g == c0163a.f3005g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3000a.hashCode() * 31) + this.f3005g) * 31) + (this.f3002c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f3000a);
        sb.append("', type='");
        sb.append(this.f3001b);
        sb.append("', affinity='");
        sb.append(this.f3005g);
        sb.append("', notNull=");
        sb.append(this.f3002c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.f3003e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
