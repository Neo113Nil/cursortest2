package m1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3195j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3196k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3197l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3198m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3200b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3201c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3202e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3203f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3204g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f3199a = str;
        this.f3200b = str2;
        this.f3201c = j2;
        this.d = str3;
        this.f3202e = str4;
        this.f3203f = z2;
        this.f3204g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (b1.d.a(iVar.f3199a, this.f3199a) && b1.d.a(iVar.f3200b, this.f3200b) && iVar.f3201c == this.f3201c && b1.d.a(iVar.d, this.d) && b1.d.a(iVar.f3202e, this.f3202e) && iVar.f3203f == this.f3203f && iVar.f3204g == this.f3204g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3204g) + ((Boolean.hashCode(this.f3203f) + ((this.f3202e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3201c) + ((this.f3200b.hashCode() + ((this.f3199a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3199a);
        sb.append('=');
        sb.append(this.f3200b);
        if (this.h) {
            long j2 = this.f3201c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) r1.c.f3572a.get()).format(new Date(j2));
                b1.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3202e);
        if (this.f3203f) {
            sb.append("; secure");
        }
        if (this.f3204g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        b1.d.d(sb2, "toString()");
        return sb2;
    }
}
