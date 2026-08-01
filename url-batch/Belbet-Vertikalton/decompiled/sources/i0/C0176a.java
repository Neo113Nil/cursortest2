package i0;

import G1.AbstractC0001b;
import j1.h;
import java.util.Locale;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3139b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3140c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3141d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3142f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3143g;

    public C0176a(String str, String str2, boolean z2, int i, String str3, int i2) {
        this.f3138a = str;
        this.f3139b = str2;
        this.f3140c = z2;
        this.f3141d = i;
        this.e = str3;
        this.f3142f = i2;
        Locale locale = Locale.US;
        h.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        h.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f3143g = q1.e.u0(upperCase, "INT") ? 3 : (q1.e.u0(upperCase, "CHAR") || q1.e.u0(upperCase, "CLOB") || q1.e.u0(upperCase, "TEXT")) ? 2 : q1.e.u0(upperCase, "BLOB") ? 5 : (q1.e.u0(upperCase, "REAL") || q1.e.u0(upperCase, "FLOA") || q1.e.u0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0176a)) {
            return false;
        }
        C0176a c0176a = (C0176a) obj;
        if (this.f3141d != c0176a.f3141d) {
            return false;
        }
        if (!this.f3138a.equals(c0176a.f3138a) || this.f3140c != c0176a.f3140c) {
            return false;
        }
        int i = c0176a.f3142f;
        String str = c0176a.e;
        String str2 = this.e;
        int i2 = this.f3142f;
        if (i2 == 1 && i == 2 && str2 != null && !H1.d.w(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || H1.d.w(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : H1.d.w(str2, str))) && this.f3143g == c0176a.f3143g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3138a.hashCode() * 31) + this.f3143g) * 31) + (this.f3140c ? 1231 : 1237)) * 31) + this.f3141d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f3138a);
        sb.append("', type='");
        sb.append(this.f3139b);
        sb.append("', affinity='");
        sb.append(this.f3143g);
        sb.append("', notNull=");
        sb.append(this.f3140c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f3141d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return AbstractC0001b.g(sb, str, "'}");
    }
}
