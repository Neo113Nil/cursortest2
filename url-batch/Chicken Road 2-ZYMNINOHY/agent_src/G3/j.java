package G3;

import E.AbstractC0005f;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f917j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f918k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f919l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f920m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f923c;

    /* renamed from: d, reason: collision with root package name */
    public final String f924d;

    /* renamed from: e, reason: collision with root package name */
    public final String f925e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f926f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f927g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f928h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f929i;

    public j(String str, String str2, long j4, String str3, String str4, boolean z, boolean z4, boolean z5, boolean z6) {
        this.f921a = str;
        this.f922b = str2;
        this.f923c = j4;
        this.f924d = str3;
        this.f925e = str4;
        this.f926f = z;
        this.f927g = z4;
        this.f928h = z5;
        this.f929i = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.i.a(jVar.f921a, this.f921a) && kotlin.jvm.internal.i.a(jVar.f922b, this.f922b) && jVar.f923c == this.f923c && kotlin.jvm.internal.i.a(jVar.f924d, this.f924d) && kotlin.jvm.internal.i.a(jVar.f925e, this.f925e) && jVar.f926f == this.f926f && jVar.f927g == this.f927g && jVar.f928h == this.f928h && jVar.f929i == this.f929i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f929i) + ((Boolean.hashCode(this.f928h) + ((Boolean.hashCode(this.f927g) + ((Boolean.hashCode(this.f926f) + AbstractC0005f.f(AbstractC0005f.f((Long.hashCode(this.f923c) + AbstractC0005f.f(AbstractC0005f.f(527, 31, this.f921a), 31, this.f922b)) * 31, 31, this.f924d), 31, this.f925e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f921a);
        sb.append('=');
        sb.append(this.f922b);
        if (this.f928h) {
            long j4 = this.f923c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) L3.d.f1669a.get()).format(new Date(j4));
                kotlin.jvm.internal.i.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f929i) {
            sb.append("; domain=");
            sb.append(this.f924d);
        }
        sb.append("; path=");
        sb.append(this.f925e);
        if (this.f926f) {
            sb.append("; secure");
        }
        if (this.f927g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString()");
        return sb2;
    }
}
