package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2433j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2434k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2435l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2436m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2438b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2439c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2440e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2441f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2442g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2437a = str;
        this.f2438b = str2;
        this.f2439c = j2;
        this.d = str3;
        this.f2440e = str4;
        this.f2441f = z2;
        this.f2442g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (X0.d.a(iVar.f2437a, this.f2437a) && X0.d.a(iVar.f2438b, this.f2438b) && iVar.f2439c == this.f2439c && X0.d.a(iVar.d, this.d) && X0.d.a(iVar.f2440e, this.f2440e) && iVar.f2441f == this.f2441f && iVar.f2442g == this.f2442g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2442g) + ((Boolean.hashCode(this.f2441f) + ((this.f2440e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2439c) + ((this.f2438b.hashCode() + ((this.f2437a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2437a);
        sb.append('=');
        sb.append(this.f2438b);
        if (this.h) {
            long j2 = this.f2439c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3307a.get()).format(new Date(j2));
                X0.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2440e);
        if (this.f2441f) {
            sb.append("; secure");
        }
        if (this.f2442g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.d.d(sb2, "toString()");
        return sb2;
    }
}
