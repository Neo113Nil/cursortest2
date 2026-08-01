package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2432j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2433k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2434l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2435m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2436a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2437b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2438c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2439e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2440f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2441g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2436a = str;
        this.f2437b = str2;
        this.f2438c = j2;
        this.d = str3;
        this.f2439e = str4;
        this.f2440f = z2;
        this.f2441g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (X0.d.a(iVar.f2436a, this.f2436a) && X0.d.a(iVar.f2437b, this.f2437b) && iVar.f2438c == this.f2438c && X0.d.a(iVar.d, this.d) && X0.d.a(iVar.f2439e, this.f2439e) && iVar.f2440f == this.f2440f && iVar.f2441g == this.f2441g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2441g) + ((Boolean.hashCode(this.f2440f) + ((this.f2439e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2438c) + ((this.f2437b.hashCode() + ((this.f2436a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2436a);
        sb.append('=');
        sb.append(this.f2437b);
        if (this.h) {
            long j2 = this.f2438c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3308a.get()).format(new Date(j2));
                X0.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2439e);
        if (this.f2440f) {
            sb.append("; secure");
        }
        if (this.f2441g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.d.d(sb2, "toString()");
        return sb2;
    }
}
