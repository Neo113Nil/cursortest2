package s7;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f8589j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f8590k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f8591l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f8592m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f8593a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8595c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8596d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8597e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8598f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8599g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8600h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8601i;

    public i(String str, String str2, long j8, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f8593a = str;
        this.f8594b = str2;
        this.f8595c = j8;
        this.f8596d = str3;
        this.f8597e = str4;
        this.f8598f = z8;
        this.f8599g = z9;
        this.f8600h = z10;
        this.f8601i = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r6.k.a(iVar.f8593a, this.f8593a) && r6.k.a(iVar.f8594b, this.f8594b) && iVar.f8595c == this.f8595c && r6.k.a(iVar.f8596d, this.f8596d) && r6.k.a(iVar.f8597e, this.f8597e) && iVar.f8598f == this.f8598f && iVar.f8599g == this.f8599g && iVar.f8600h == this.f8600h && iVar.f8601i == this.f8601i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8601i) + a0.m.e(a0.m.e(a0.m.e(r6.i.a(r6.i.a(a0.m.d(r6.i.a(r6.i.a(527, 31, this.f8593a), 31, this.f8594b), 31, this.f8595c), 31, this.f8596d), 31, this.f8597e), 31, this.f8598f), 31, this.f8599g), 31, this.f8600h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8593a);
        sb.append('=');
        sb.append(this.f8594b);
        if (this.f8600h) {
            long j8 = this.f8595c;
            if (j8 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) x7.c.f9687a.get()).format(new Date(j8));
                r6.k.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f8601i) {
            sb.append("; domain=");
            sb.append(this.f8596d);
        }
        sb.append("; path=");
        sb.append(this.f8597e);
        if (this.f8598f) {
            sb.append("; secure");
        }
        if (this.f8599g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString()");
        return sb2;
    }
}
