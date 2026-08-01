package p1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3342j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3343k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3344l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3345m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3348c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3349e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3350f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3351g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3346a = str;
        this.f3347b = str2;
        this.f3348c = j2;
        this.d = str3;
        this.f3349e = str4;
        this.f3350f = z2;
        this.f3351g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (e1.d.a(iVar.f3346a, this.f3346a) && e1.d.a(iVar.f3347b, this.f3347b) && iVar.f3348c == this.f3348c && e1.d.a(iVar.d, this.d) && e1.d.a(iVar.f3349e, this.f3349e) && iVar.f3350f == this.f3350f && iVar.f3351g == this.f3351g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3351g) + ((Boolean.hashCode(this.f3350f) + ((this.f3349e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3348c) + ((this.f3347b.hashCode() + ((this.f3346a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3346a);
        sb.append('=');
        sb.append(this.f3347b);
        if (this.h) {
            long j2 = this.f3348c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) u1.c.f3824a.get()).format(new Date(j2));
                e1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3349e);
        if (this.f3350f) {
            sb.append("; secure");
        }
        if (this.f3351g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        e1.d.d(sb2, "toString()");
        return sb2;
    }
}
