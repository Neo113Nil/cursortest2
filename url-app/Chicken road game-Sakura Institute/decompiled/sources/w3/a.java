package w3;

import a0.m;
import java.util.Locale;
import r6.k;
import u3.z;
import z6.h;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9496b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9497c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9498d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9499e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9500f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9501g;

    public a(String str, String str2, boolean z8, int i7, String str3, int i8) {
        this.f9495a = str;
        this.f9496b = str2;
        this.f9497c = z8;
        this.f9498d = i7;
        this.f9499e = str3;
        this.f9500f = i8;
        Locale locale = Locale.US;
        k.e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        k.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f9501g = h.y(upperCase, "INT") ? 3 : (h.y(upperCase, "CHAR") || h.y(upperCase, "CLOB") || h.y(upperCase, "TEXT")) ? 2 : h.y(upperCase, "BLOB") ? 5 : (h.y(upperCase, "REAL") || h.y(upperCase, "FLOA") || h.y(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f9498d != aVar.f9498d) {
                return false;
            }
            int i7 = aVar.f9500f;
            String str = aVar.f9499e;
            if (!this.f9495a.equals(aVar.f9495a) || this.f9497c != aVar.f9497c) {
                return false;
            }
            String str2 = this.f9499e;
            int i8 = this.f9500f;
            if (i8 == 1 && i7 == 2 && str2 != null && !z.g(str2, str)) {
                return false;
            }
            if (i8 == 2 && i7 == 1 && str != null && !z.g(str, str2)) {
                return false;
            }
            if (i8 != 0 && i8 == i7) {
                if (str2 != null) {
                    if (!z.g(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f9501g != aVar.f9501g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f9495a.hashCode() * 31) + this.f9501g) * 31) + (this.f9497c ? 1231 : 1237)) * 31) + this.f9498d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f9495a);
        sb.append("', type='");
        sb.append(this.f9496b);
        sb.append("', affinity='");
        sb.append(this.f9501g);
        sb.append("', notNull=");
        sb.append(this.f9497c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f9498d);
        sb.append(", defaultValue='");
        String str = this.f9499e;
        if (str == null) {
            str = "undefined";
        }
        return m.m(sb, str, "'}");
    }
}
