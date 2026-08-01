package z1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f4853k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f4854l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f4855m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f4856a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4857b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4858c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4859d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4860f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4861g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4862h;
    public final boolean i;

    public k(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f4856a = str;
        this.f4857b = str2;
        this.f4858c = j2;
        this.f4859d = str3;
        this.e = str4;
        this.f4860f = z2;
        this.f4861g = z3;
        this.f4862h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (j1.h.a(kVar.f4856a, this.f4856a) && j1.h.a(kVar.f4857b, this.f4857b) && kVar.f4858c == this.f4858c && j1.h.a(kVar.f4859d, this.f4859d) && j1.h.a(kVar.e, this.e) && kVar.f4860f == this.f4860f && kVar.f4861g == this.f4861g && kVar.f4862h == this.f4862h && kVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.f4862h) + ((Boolean.hashCode(this.f4861g) + ((Boolean.hashCode(this.f4860f) + ((this.e.hashCode() + ((this.f4859d.hashCode() + ((Long.hashCode(this.f4858c) + ((this.f4857b.hashCode() + ((this.f4856a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4856a);
        sb.append('=');
        sb.append(this.f4857b);
        if (this.f4862h) {
            long j2 = this.f4858c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) E1.d.f304a.get()).format(new Date(j2));
                j1.h.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f4859d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f4860f) {
            sb.append("; secure");
        }
        if (this.f4861g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        j1.h.d(sb2, "toString()");
        return sb2;
    }
}
