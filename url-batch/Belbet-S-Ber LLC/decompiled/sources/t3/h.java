package t3;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3440j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f3441k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f3442l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f3443m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f3444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3445b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3446c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3447e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3448f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3449g;
    public final boolean h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f3444a = str;
        this.f3445b = str2;
        this.f3446c = j2;
        this.d = str3;
        this.f3447e = str4;
        this.f3448f = z4;
        this.f3449g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i3.d.a(hVar.f3444a, this.f3444a) && i3.d.a(hVar.f3445b, this.f3445b) && hVar.f3446c == this.f3446c && i3.d.a(hVar.d, this.d) && i3.d.a(hVar.f3447e, this.f3447e) && hVar.f3448f == this.f3448f && hVar.f3449g == this.f3449g && hVar.h == this.h && hVar.i == this.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f3449g) + ((Boolean.hashCode(this.f3448f) + ((this.f3447e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f3446c) + ((this.f3445b.hashCode() + ((this.f3444a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3444a);
        sb.append('=');
        sb.append(this.f3445b);
        if (this.h) {
            long j2 = this.f3446c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) y3.c.f4113a.get()).format(new Date(j2));
                i3.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f3447e);
        if (this.f3448f) {
            sb.append("; secure");
        }
        if (this.f3449g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        i3.d.d(sb2, "toString()");
        return sb2;
    }
}
