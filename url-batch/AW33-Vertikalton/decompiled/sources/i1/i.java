package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2429j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2430k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2431l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2432m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2434b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2435c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2436e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2437f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2438g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2433a = str;
        this.f2434b = str2;
        this.f2435c = j2;
        this.d = str3;
        this.f2436e = str4;
        this.f2437f = z2;
        this.f2438g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (X0.e.a(iVar.f2433a, this.f2433a) && X0.e.a(iVar.f2434b, this.f2434b) && iVar.f2435c == this.f2435c && X0.e.a(iVar.d, this.d) && X0.e.a(iVar.f2436e, this.f2436e) && iVar.f2437f == this.f2437f && iVar.f2438g == this.f2438g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2438g) + ((Boolean.hashCode(this.f2437f) + ((this.f2436e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2435c) + ((this.f2434b.hashCode() + ((this.f2433a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2433a);
        sb.append('=');
        sb.append(this.f2434b);
        if (this.h) {
            long j2 = this.f2435c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3303a.get()).format(new Date(j2));
                X0.e.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2436e);
        if (this.f2437f) {
            sb.append("; secure");
        }
        if (this.f2438g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.e.d(sb2, "toString()");
        return sb2;
    }
}
