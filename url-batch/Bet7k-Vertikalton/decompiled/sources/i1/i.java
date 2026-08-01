package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2431j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2432k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2433l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2434m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2436b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2437c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2438e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2439f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2440g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2435a = str;
        this.f2436b = str2;
        this.f2437c = j2;
        this.d = str3;
        this.f2438e = str4;
        this.f2439f = z2;
        this.f2440g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (X0.d.a(iVar.f2435a, this.f2435a) && X0.d.a(iVar.f2436b, this.f2436b) && iVar.f2437c == this.f2437c && X0.d.a(iVar.d, this.d) && X0.d.a(iVar.f2438e, this.f2438e) && iVar.f2439f == this.f2439f && iVar.f2440g == this.f2440g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2440g) + ((Boolean.hashCode(this.f2439f) + ((this.f2438e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2437c) + ((this.f2436b.hashCode() + ((this.f2435a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2435a);
        sb.append('=');
        sb.append(this.f2436b);
        if (this.h) {
            long j2 = this.f2437c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3307a.get()).format(new Date(j2));
                X0.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2438e);
        if (this.f2439f) {
            sb.append("; secure");
        }
        if (this.f2440g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.d.d(sb2, "toString()");
        return sb2;
    }
}
