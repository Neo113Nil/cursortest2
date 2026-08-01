package m1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3162j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3163k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3164l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3165m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3167b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3168c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3169e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3170f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3171g;
    public final boolean h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3166a = str;
        this.f3167b = str2;
        this.f3168c = j2;
        this.d = str3;
        this.f3169e = str4;
        this.f3170f = z2;
        this.f3171g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (b1.d.a(hVar.f3166a, this.f3166a) && b1.d.a(hVar.f3167b, this.f3167b) && hVar.f3168c == this.f3168c && b1.d.a(hVar.d, this.d) && b1.d.a(hVar.f3169e, this.f3169e) && hVar.f3170f == this.f3170f && hVar.f3171g == this.f3171g && hVar.h == this.h && hVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3171g) + ((Boolean.hashCode(this.f3170f) + ((this.f3169e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3168c) + ((this.f3167b.hashCode() + ((this.f3166a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3166a);
        sb.append('=');
        sb.append(this.f3167b);
        if (this.h) {
            long j2 = this.f3168c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) r1.c.f3518a.get()).format(new Date(j2));
                b1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3169e);
        if (this.f3170f) {
            sb.append("; secure");
        }
        if (this.f3171g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        b1.d.d(sb2, "toString()");
        return sb2;
    }
}
