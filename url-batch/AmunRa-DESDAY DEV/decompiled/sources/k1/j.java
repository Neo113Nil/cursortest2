package k1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2810j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2811k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2812l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2813m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2815b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2816c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2817e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2818f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2819g;
    public final boolean h;
    public final boolean i;

    public j(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2814a = str;
        this.f2815b = str2;
        this.f2816c = j2;
        this.d = str3;
        this.f2817e = str4;
        this.f2818f = z2;
        this.f2819g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Z0.d.a(jVar.f2814a, this.f2814a) && Z0.d.a(jVar.f2815b, this.f2815b) && jVar.f2816c == this.f2816c && Z0.d.a(jVar.d, this.d) && Z0.d.a(jVar.f2817e, this.f2817e) && jVar.f2818f == this.f2818f && jVar.f2819g == this.f2819g && jVar.h == this.h && jVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2819g) + ((Boolean.hashCode(this.f2818f) + ((this.f2817e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2816c) + ((this.f2815b.hashCode() + ((this.f2814a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2814a);
        sb.append('=');
        sb.append(this.f2815b);
        if (this.h) {
            long j2 = this.f2816c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) p1.c.f3466a.get()).format(new Date(j2));
                Z0.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2817e);
        if (this.f2818f) {
            sb.append("; secure");
        }
        if (this.f2819g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Z0.d.d(sb2, "toString()");
        return sb2;
    }
}
