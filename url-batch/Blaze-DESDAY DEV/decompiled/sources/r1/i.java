package r1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3442j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3443k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3444l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3445m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3447b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3448c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3449e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3450f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3451g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3446a = str;
        this.f3447b = str2;
        this.f3448c = j2;
        this.d = str3;
        this.f3449e = str4;
        this.f3450f = z2;
        this.f3451g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (g1.d.a(iVar.f3446a, this.f3446a) && g1.d.a(iVar.f3447b, this.f3447b) && iVar.f3448c == this.f3448c && g1.d.a(iVar.d, this.d) && g1.d.a(iVar.f3449e, this.f3449e) && iVar.f3450f == this.f3450f && iVar.f3451g == this.f3451g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3451g) + ((Boolean.hashCode(this.f3450f) + ((this.f3449e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3448c) + ((this.f3447b.hashCode() + ((this.f3446a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3446a);
        sb.append('=');
        sb.append(this.f3447b);
        if (this.h) {
            long j2 = this.f3448c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) w1.c.f4097a.get()).format(new Date(j2));
                g1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3449e);
        if (this.f3450f) {
            sb.append("; secure");
        }
        if (this.f3451g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        g1.d.d(sb2, "toString()");
        return sb2;
    }
}
