package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2687j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2688k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2689l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2690m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2691a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2692b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2693c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2694d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2695e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2696f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2697g;
    public final boolean h;
    public final boolean i;

    public k(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2691a = str;
        this.f2692b = str2;
        this.f2693c = j2;
        this.f2694d = str3;
        this.f2695e = str4;
        this.f2696f = z2;
        this.f2697g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (X0.f.a(kVar.f2691a, this.f2691a) && X0.f.a(kVar.f2692b, this.f2692b) && kVar.f2693c == this.f2693c && X0.f.a(kVar.f2694d, this.f2694d) && X0.f.a(kVar.f2695e, this.f2695e) && kVar.f2696f == this.f2696f && kVar.f2697g == this.f2697g && kVar.h == this.h && kVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2697g) + ((Boolean.hashCode(this.f2696f) + ((this.f2695e.hashCode() + ((this.f2694d.hashCode() + ((Long.hashCode(this.f2693c) + ((this.f2692b.hashCode() + ((this.f2691a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2691a);
        sb.append('=');
        sb.append(this.f2692b);
        if (this.h) {
            long j2 = this.f2693c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3656a.get()).format(new Date(j2));
                X0.f.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f2694d);
        }
        sb.append("; path=");
        sb.append(this.f2695e);
        if (this.f2696f) {
            sb.append("; secure");
        }
        if (this.f2697g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.f.d(sb2, "toString()");
        return sb2;
    }
}
