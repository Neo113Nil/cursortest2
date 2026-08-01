package r1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3475j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3476k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3477l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3478m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3480b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3481c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3482e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3483f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3484g;
    public final boolean h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3479a = str;
        this.f3480b = str2;
        this.f3481c = j2;
        this.d = str3;
        this.f3482e = str4;
        this.f3483f = z2;
        this.f3484g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (g1.d.a(hVar.f3479a, this.f3479a) && g1.d.a(hVar.f3480b, this.f3480b) && hVar.f3481c == this.f3481c && g1.d.a(hVar.d, this.d) && g1.d.a(hVar.f3482e, this.f3482e) && hVar.f3483f == this.f3483f && hVar.f3484g == this.f3484g && hVar.h == this.h && hVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3484g) + ((Boolean.hashCode(this.f3483f) + ((this.f3482e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3481c) + ((this.f3480b.hashCode() + ((this.f3479a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3479a);
        sb.append('=');
        sb.append(this.f3480b);
        if (this.h) {
            long j2 = this.f3481c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) w1.c.f3941a.get()).format(new Date(j2));
                g1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3482e);
        if (this.f3483f) {
            sb.append("; secure");
        }
        if (this.f3484g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        g1.d.d(sb2, "toString()");
        return sb2;
    }
}
