package z1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f4672j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f4673k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f4674l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f4675m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f4676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4677b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4678c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4679e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4680f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4681g;
    public final boolean h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f4676a = str;
        this.f4677b = str2;
        this.f4678c = j2;
        this.d = str3;
        this.f4679e = str4;
        this.f4680f = z2;
        this.f4681g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (k1.e.a(hVar.f4676a, this.f4676a) && k1.e.a(hVar.f4677b, this.f4677b) && hVar.f4678c == this.f4678c && k1.e.a(hVar.d, this.d) && k1.e.a(hVar.f4679e, this.f4679e) && hVar.f4680f == this.f4680f && hVar.f4681g == this.f4681g && hVar.h == this.h && hVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f4681g) + ((Boolean.hashCode(this.f4680f) + ((this.f4679e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f4678c) + ((this.f4677b.hashCode() + ((this.f4676a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4676a);
        sb.append('=');
        sb.append(this.f4677b);
        if (this.h) {
            long j2 = this.f4678c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) E1.d.f232a.get()).format(new Date(j2));
                k1.e.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f4679e);
        if (this.f4680f) {
            sb.append("; secure");
        }
        if (this.f4681g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        k1.e.d(sb2, "toString()");
        return sb2;
    }
}
