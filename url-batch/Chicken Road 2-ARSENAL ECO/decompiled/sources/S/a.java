package S;

import F5.j;
import N.p;
import a1.AbstractC0223a;
import java.util.Locale;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2177b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2179d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2180e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2181f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2182g;

    public a(String str, String str2, boolean z5, int i7, String str3, int i8) {
        this.f2176a = str;
        this.f2177b = str2;
        this.f2178c = z5;
        this.f2179d = i7;
        this.f2180e = str3;
        this.f2181f = i8;
        Locale US = Locale.US;
        i.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f2182g = j.L(upperCase, "INT", false) ? 3 : (j.L(upperCase, "CHAR", false) || j.L(upperCase, "CLOB", false) || j.L(upperCase, "TEXT", false)) ? 2 : j.L(upperCase, "BLOB", false) ? 5 : (j.L(upperCase, "REAL", false) || j.L(upperCase, "FLOA", false) || j.L(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f2179d != aVar.f2179d) {
                return false;
            }
            String str = aVar.f2176a;
            int i7 = aVar.f2181f;
            String str2 = aVar.f2180e;
            if (!this.f2176a.equals(str) || this.f2178c != aVar.f2178c) {
                return false;
            }
            String str3 = this.f2180e;
            int i8 = this.f2181f;
            if (i8 == 1 && i7 == 2 && str3 != null && !AbstractC0223a.t(str3, str2)) {
                return false;
            }
            if (i8 == 2 && i7 == 1 && str2 != null && !AbstractC0223a.t(str2, str3)) {
                return false;
            }
            if (i8 != 0 && i8 == i7) {
                if (str3 != null) {
                    if (!AbstractC0223a.t(str3, str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.f2182g != aVar.f2182g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f2176a.hashCode() * 31) + this.f2182g) * 31) + (this.f2178c ? 1231 : 1237)) * 31) + this.f2179d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f2176a);
        sb.append("', type='");
        sb.append(this.f2177b);
        sb.append("', affinity='");
        sb.append(this.f2182g);
        sb.append("', notNull=");
        sb.append(this.f2178c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f2179d);
        sb.append(", defaultValue='");
        String str = this.f2180e;
        if (str == null) {
            str = "undefined";
        }
        return p.b(sb, str, "'}");
    }
}
