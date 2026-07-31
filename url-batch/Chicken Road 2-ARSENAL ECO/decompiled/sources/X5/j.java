package X5;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2946k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2947l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2948m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f2949n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2951b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2952c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2953d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2954e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2955f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2956g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2957h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2958i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2959j;

    public j(String str, String str2, long j4, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8, String str5) {
        this.f2950a = str;
        this.f2951b = str2;
        this.f2952c = j4;
        this.f2953d = str3;
        this.f2954e = str4;
        this.f2955f = z5;
        this.f2956g = z6;
        this.f2957h = z7;
        this.f2958i = z8;
        this.f2959j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(jVar.f2950a, this.f2950a) && kotlin.jvm.internal.i.a(jVar.f2951b, this.f2951b) && jVar.f2952c == this.f2952c && kotlin.jvm.internal.i.a(jVar.f2953d, this.f2953d) && kotlin.jvm.internal.i.a(jVar.f2954e, this.f2954e) && jVar.f2955f == this.f2955f && jVar.f2956g == this.f2956g && jVar.f2957h == this.f2957h && jVar.f2958i == this.f2958i && kotlin.jvm.internal.i.a(jVar.f2959j, this.f2959j);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.f2958i) + ((Boolean.hashCode(this.f2957h) + ((Boolean.hashCode(this.f2956g) + ((Boolean.hashCode(this.f2955f) + ((this.f2954e.hashCode() + ((this.f2953d.hashCode() + ((Long.hashCode(this.f2952c) + ((this.f2951b.hashCode() + ((this.f2950a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f2959j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2950a);
        sb.append('=');
        sb.append(this.f2951b);
        if (this.f2957h) {
            long j4 = this.f2952c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) c6.d.f3825a.get()).format(new Date(j4));
                kotlin.jvm.internal.i.d(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.f2958i) {
            sb.append("; domain=");
            sb.append(this.f2953d);
        }
        sb.append("; path=");
        sb.append(this.f2954e);
        if (this.f2955f) {
            sb.append("; secure");
        }
        if (this.f2956g) {
            sb.append("; httponly");
        }
        String str = this.f2959j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }
}
