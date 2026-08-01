package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2428j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2429k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2430l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2431m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2432a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2433b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2434c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2435e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2436f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2437g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2432a = str;
        this.f2433b = str2;
        this.f2434c = j2;
        this.d = str3;
        this.f2435e = str4;
        this.f2436f = z2;
        this.f2437g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (X0.e.a(iVar.f2432a, this.f2432a) && X0.e.a(iVar.f2433b, this.f2433b) && iVar.f2434c == this.f2434c && X0.e.a(iVar.d, this.d) && X0.e.a(iVar.f2435e, this.f2435e) && iVar.f2436f == this.f2436f && iVar.f2437g == this.f2437g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2437g) + ((Boolean.hashCode(this.f2436f) + ((this.f2435e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2434c) + ((this.f2433b.hashCode() + ((this.f2432a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2432a);
        sb.append('=');
        sb.append(this.f2433b);
        if (this.h) {
            long j2 = this.f2434c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3285a.get()).format(new Date(j2));
                X0.e.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2435e);
        if (this.f2436f) {
            sb.append("; secure");
        }
        if (this.f2437g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.e.d(sb2, "toString()");
        return sb2;
    }
}
