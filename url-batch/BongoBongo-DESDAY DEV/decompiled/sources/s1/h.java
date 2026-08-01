package s1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3626j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3627k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3628l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3629m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3631b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3632c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3633e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3634f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3635g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3636h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3630a = str;
        this.f3631b = str2;
        this.f3632c = j2;
        this.d = str3;
        this.f3633e = str4;
        this.f3634f = z2;
        this.f3635g = z3;
        this.f3636h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (h1.d.a(hVar.f3630a, this.f3630a) && h1.d.a(hVar.f3631b, this.f3631b) && hVar.f3632c == this.f3632c && h1.d.a(hVar.d, this.d) && h1.d.a(hVar.f3633e, this.f3633e) && hVar.f3634f == this.f3634f && hVar.f3635g == this.f3635g && hVar.f3636h == this.f3636h && hVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.f3636h) + ((Boolean.hashCode(this.f3635g) + ((Boolean.hashCode(this.f3634f) + ((this.f3633e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3632c) + ((this.f3631b.hashCode() + ((this.f3630a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3630a);
        sb.append('=');
        sb.append(this.f3631b);
        if (this.f3636h) {
            long j2 = this.f3632c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) x1.c.f4290a.get()).format(new Date(j2));
                h1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3633e);
        if (this.f3634f) {
            sb.append("; secure");
        }
        if (this.f3635g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        h1.d.d(sb2, "toString()");
        return sb2;
    }
}
