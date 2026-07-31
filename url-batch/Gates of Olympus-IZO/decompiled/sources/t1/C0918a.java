package t1;

import Z1.i;
import h.AbstractC0416e;
import h2.AbstractC0447i;
import java.util.Locale;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7970a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7971b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7972c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7973d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7975f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7976g;

    public C0918a(String str, String str2, boolean z3, int i3, String str3, int i4) {
        this.f7970a = str;
        this.f7971b = str2;
        this.f7972c = z3;
        this.f7973d = i3;
        this.f7974e = str3;
        this.f7975f = i4;
        Locale locale = Locale.US;
        i.e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        i.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f7976g = AbstractC0447i.l0(upperCase, "INT") ? 3 : (AbstractC0447i.l0(upperCase, "CHAR") || AbstractC0447i.l0(upperCase, "CLOB") || AbstractC0447i.l0(upperCase, "TEXT")) ? 2 : AbstractC0447i.l0(upperCase, "BLOB") ? 5 : (AbstractC0447i.l0(upperCase, "REAL") || AbstractC0447i.l0(upperCase, "FLOA") || AbstractC0447i.l0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0918a)) {
            return false;
        }
        C0918a c0918a = (C0918a) obj;
        if (this.f7973d != c0918a.f7973d) {
            return false;
        }
        if (!this.f7970a.equals(c0918a.f7970a) || this.f7972c != c0918a.f7972c) {
            return false;
        }
        int i3 = c0918a.f7975f;
        String str = c0918a.f7974e;
        String str2 = this.f7974e;
        int i4 = this.f7975f;
        if (i4 == 1 && i3 == 2 && str2 != null && !AbstractC0416e.p(str2, str)) {
            return false;
        }
        if (i4 != 2 || i3 != 1 || str == null || AbstractC0416e.p(str, str2)) {
            return (i4 == 0 || i4 != i3 || (str2 == null ? str == null : AbstractC0416e.p(str2, str))) && this.f7976g == c0918a.f7976g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7970a.hashCode() * 31) + this.f7976g) * 31) + (this.f7972c ? 1231 : 1237)) * 31) + this.f7973d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f7970a);
        sb.append("', type='");
        sb.append(this.f7971b);
        sb.append("', affinity='");
        sb.append(this.f7976g);
        sb.append("', notNull=");
        sb.append(this.f7972c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f7973d);
        sb.append(", defaultValue='");
        String str = this.f7974e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
