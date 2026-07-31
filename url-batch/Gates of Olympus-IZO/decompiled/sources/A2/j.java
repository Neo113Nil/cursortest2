package A2;

import H2.AbstractC0080b;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f94j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f95k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f96l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f97m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f98a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99b;

    /* renamed from: c, reason: collision with root package name */
    public final long f100c;

    /* renamed from: d, reason: collision with root package name */
    public final String f101d;

    /* renamed from: e, reason: collision with root package name */
    public final String f102e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f103f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f104g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f105h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f106i;

    public j(String str, String str2, long j3, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f98a = str;
        this.f99b = str2;
        this.f100c = j3;
        this.f101d = str3;
        this.f102e = str4;
        this.f103f = z3;
        this.f104g = z4;
        this.f105h = z5;
        this.f106i = z6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Z1.i.a(jVar.f98a, this.f98a) && Z1.i.a(jVar.f99b, this.f99b) && jVar.f100c == this.f100c && Z1.i.a(jVar.f101d, this.f101d) && Z1.i.a(jVar.f102e, this.f102e) && jVar.f103f == this.f103f && jVar.f104g == this.f104g && jVar.f105h == this.f105h && jVar.f106i == this.f106i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106i) + AbstractC0080b.f(AbstractC0080b.f(AbstractC0080b.f(AbstractC0080b.e(AbstractC0080b.e(AbstractC0080b.d(AbstractC0080b.e(AbstractC0080b.e(527, 31, this.f98a), 31, this.f99b), 31, this.f100c), 31, this.f101d), 31, this.f102e), 31, this.f103f), 31, this.f104g), 31, this.f105h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f98a);
        sb.append('=');
        sb.append(this.f99b);
        if (this.f105h) {
            long j3 = this.f100c;
            if (j3 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) F2.d.f1491a.get()).format(new Date(j3));
                Z1.i.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f106i) {
            sb.append("; domain=");
            sb.append(this.f101d);
        }
        sb.append("; path=");
        sb.append(this.f102e);
        if (this.f103f) {
            sb.append("; secure");
        }
        if (this.f104g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString()");
        return sb2;
    }
}
