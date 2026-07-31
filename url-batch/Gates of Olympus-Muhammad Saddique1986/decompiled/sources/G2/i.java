package G2;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2186j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2187k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2188l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2189m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2191b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2192c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2193d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2194e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2195f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2196g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2197h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2198i;

    public i(String str, String str2, long j3, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f2190a = str;
        this.f2191b = str2;
        this.f2192c = j3;
        this.f2193d = str3;
        this.f2194e = str4;
        this.f2195f = z3;
        this.f2196g = z4;
        this.f2197h = z5;
        this.f2198i = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (f2.j.a(iVar.f2190a, this.f2190a) && f2.j.a(iVar.f2191b, this.f2191b) && iVar.f2192c == this.f2192c && f2.j.a(iVar.f2193d, this.f2193d) && f2.j.a(iVar.f2194e, this.f2194e) && iVar.f2195f == this.f2195f && iVar.f2196g == this.f2196g && iVar.f2197h == this.f2197h && iVar.f2198i == this.f2198i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2198i) + A.k.e(A.k.e(A.k.e(A.k.d(A.k.d(A.k.c(A.k.d(A.k.d(527, 31, this.f2190a), 31, this.f2191b), 31, this.f2192c), 31, this.f2193d), 31, this.f2194e), 31, this.f2195f), 31, this.f2196g), 31, this.f2197h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2190a);
        sb.append('=');
        sb.append(this.f2191b);
        if (this.f2197h) {
            long j3 = this.f2192c;
            if (j3 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) L2.d.f3411a.get()).format(new Date(j3));
                f2.j.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f2198i) {
            sb.append("; domain=");
            sb.append(this.f2193d);
        }
        sb.append("; path=");
        sb.append(this.f2194e);
        if (this.f2195f) {
            sb.append("; secure");
        }
        if (this.f2196g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString()");
        return sb2;
    }
}
