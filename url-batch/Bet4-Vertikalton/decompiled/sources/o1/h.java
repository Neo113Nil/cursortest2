package o1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3296j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3297k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3298l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3299m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3301b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3302c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3303e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3304f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3305g;
    public final boolean h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3300a = str;
        this.f3301b = str2;
        this.f3302c = j2;
        this.d = str3;
        this.f3303e = str4;
        this.f3304f = z2;
        this.f3305g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (d1.d.a(hVar.f3300a, this.f3300a) && d1.d.a(hVar.f3301b, this.f3301b) && hVar.f3302c == this.f3302c && d1.d.a(hVar.d, this.d) && d1.d.a(hVar.f3303e, this.f3303e) && hVar.f3304f == this.f3304f && hVar.f3305g == this.f3305g && hVar.h == this.h && hVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3305g) + ((Boolean.hashCode(this.f3304f) + ((this.f3303e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3302c) + ((this.f3301b.hashCode() + ((this.f3300a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3300a);
        sb.append('=');
        sb.append(this.f3301b);
        if (this.h) {
            long j2 = this.f3302c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) t1.c.f3805a.get()).format(new Date(j2));
                d1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3303e);
        if (this.f3304f) {
            sb.append("; secure");
        }
        if (this.f3305g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        d1.d.d(sb2, "toString()");
        return sb2;
    }
}
