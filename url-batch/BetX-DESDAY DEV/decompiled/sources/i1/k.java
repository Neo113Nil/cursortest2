package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2691j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2692k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2693l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2694m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2696b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2697c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2698d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2699e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2700f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2701g;
    public final boolean h;
    public final boolean i;

    public k(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2695a = str;
        this.f2696b = str2;
        this.f2697c = j2;
        this.f2698d = str3;
        this.f2699e = str4;
        this.f2700f = z2;
        this.f2701g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (X0.f.a(kVar.f2695a, this.f2695a) && X0.f.a(kVar.f2696b, this.f2696b) && kVar.f2697c == this.f2697c && X0.f.a(kVar.f2698d, this.f2698d) && X0.f.a(kVar.f2699e, this.f2699e) && kVar.f2700f == this.f2700f && kVar.f2701g == this.f2701g && kVar.h == this.h && kVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2701g) + ((Boolean.hashCode(this.f2700f) + ((this.f2699e.hashCode() + ((this.f2698d.hashCode() + ((Long.hashCode(this.f2697c) + ((this.f2696b.hashCode() + ((this.f2695a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2695a);
        sb.append('=');
        sb.append(this.f2696b);
        if (this.h) {
            long j2 = this.f2697c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3660a.get()).format(new Date(j2));
                X0.f.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f2698d);
        }
        sb.append("; path=");
        sb.append(this.f2699e);
        if (this.f2700f) {
            sb.append("; secure");
        }
        if (this.f2701g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.f.d(sb2, "toString()");
        return sb2;
    }
}
