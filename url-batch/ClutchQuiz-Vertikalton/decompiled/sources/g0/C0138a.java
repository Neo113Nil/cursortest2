package g0;

import g1.f;
import java.util.Locale;
import n1.g;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2541b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2542c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2543e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2544f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2545g;

    public C0138a(String str, String str2, boolean z2, int i, String str3, int i2) {
        this.f2540a = str;
        this.f2541b = str2;
        this.f2542c = z2;
        this.d = i;
        this.f2543e = str3;
        this.f2544f = i2;
        Locale locale = Locale.US;
        f.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        f.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f2545g = g.q(upperCase, "INT") ? 3 : (g.q(upperCase, "CHAR") || g.q(upperCase, "CLOB") || g.q(upperCase, "TEXT")) ? 2 : g.q(upperCase, "BLOB") ? 5 : (g.q(upperCase, "REAL") || g.q(upperCase, "FLOA") || g.q(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0138a)) {
            return false;
        }
        C0138a c0138a = (C0138a) obj;
        if (this.d != c0138a.d) {
            return false;
        }
        if (!this.f2540a.equals(c0138a.f2540a) || this.f2542c != c0138a.f2542c) {
            return false;
        }
        int i = c0138a.f2544f;
        String str = c0138a.f2543e;
        String str2 = this.f2543e;
        int i2 = this.f2544f;
        if (i2 == 1 && i == 2 && str2 != null && !T.d.q(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || T.d.q(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : T.d.q(str2, str))) && this.f2545g == c0138a.f2545g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2540a.hashCode() * 31) + this.f2545g) * 31) + (this.f2542c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f2540a);
        sb.append("', type='");
        sb.append(this.f2541b);
        sb.append("', affinity='");
        sb.append(this.f2545g);
        sb.append("', notNull=");
        sb.append(this.f2542c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.f2543e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
