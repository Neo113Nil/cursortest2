package e8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f37409k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f37410l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f37411m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f37412n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f37413a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37414b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37415c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37416d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37417e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37418f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37419g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f37420h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f37421j;

    public j(String str, String str2, long j9, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11, String str5) {
        this.f37413a = str;
        this.f37414b = str2;
        this.f37415c = j9;
        this.f37416d = str3;
        this.f37417e = str4;
        this.f37418f = z8;
        this.f37419g = z9;
        this.f37420h = z10;
        this.i = z11;
        this.f37421j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.h.a(jVar.f37413a, this.f37413a) && kotlin.jvm.internal.h.a(jVar.f37414b, this.f37414b) && jVar.f37415c == this.f37415c && kotlin.jvm.internal.h.a(jVar.f37416d, this.f37416d) && kotlin.jvm.internal.h.a(jVar.f37417e, this.f37417e) && jVar.f37418f == this.f37418f && jVar.f37419g == this.f37419g && jVar.f37420h == this.f37420h && jVar.i == this.i && kotlin.jvm.internal.h.a(jVar.f37421j, this.f37421j);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.i) + ((Boolean.hashCode(this.f37420h) + ((Boolean.hashCode(this.f37419g) + ((Boolean.hashCode(this.f37418f) + AbstractC5051n.k(AbstractC5051n.k((Long.hashCode(this.f37415c) + AbstractC5051n.k(AbstractC5051n.k(527, 31, this.f37413a), 31, this.f37414b)) * 31, 31, this.f37416d), 31, this.f37417e)) * 31)) * 31)) * 31)) * 31;
        String str = this.f37421j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37413a);
        sb.append('=');
        sb.append(this.f37414b);
        if (this.f37420h) {
            long j9 = this.f37415c;
            if (j9 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) j8.d.f38593a.get()).format(new Date(j9));
                kotlin.jvm.internal.h.d(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f37416d);
        }
        sb.append("; path=");
        sb.append(this.f37417e);
        if (this.f37418f) {
            sb.append("; secure");
        }
        if (this.f37419g) {
            sb.append("; httponly");
        }
        String str = this.f37421j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }
}
