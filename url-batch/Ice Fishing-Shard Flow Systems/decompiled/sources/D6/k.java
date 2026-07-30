package D6;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f523k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f524l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f525m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f526n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f527a;

    /* renamed from: b, reason: collision with root package name */
    public final String f528b;

    /* renamed from: c, reason: collision with root package name */
    public final long f529c;

    /* renamed from: d, reason: collision with root package name */
    public final String f530d;

    /* renamed from: e, reason: collision with root package name */
    public final String f531e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f532f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f533g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f534h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f535i;
    public final String j;

    public k(String str, String str2, long j, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10, String str5) {
        this.f527a = str;
        this.f528b = str2;
        this.f529c = j;
        this.f530d = str3;
        this.f531e = str4;
        this.f532f = z7;
        this.f533g = z8;
        this.f534h = z9;
        this.f535i = z10;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.a(kVar.f527a, this.f527a) && Intrinsics.a(kVar.f528b, this.f528b) && kVar.f529c == this.f529c && Intrinsics.a(kVar.f530d, this.f530d) && Intrinsics.a(kVar.f531e, this.f531e) && kVar.f532f == this.f532f && kVar.f533g == this.f533g && kVar.f534h == this.f534h && kVar.f535i == this.f535i && Intrinsics.a(kVar.j, this.j);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.f535i) + ((Boolean.hashCode(this.f534h) + ((Boolean.hashCode(this.f533g) + ((Boolean.hashCode(this.f532f) + C4.p.e(this.f531e, C4.p.e(this.f530d, (Long.hashCode(this.f529c) + C4.p.e(this.f528b, C4.p.e(this.f527a, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f527a);
        sb.append('=');
        sb.append(this.f528b);
        if (this.f534h) {
            long j = this.f529c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(j);
                I6.d dVar = I6.e.f1295a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = ((DateFormat) I6.e.f1295a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                sb.append(format);
            }
        }
        if (!this.f535i) {
            sb.append("; domain=");
            sb.append(this.f530d);
        }
        sb.append("; path=");
        sb.append(this.f531e);
        if (this.f532f) {
            sb.append("; secure");
        }
        if (this.f533g) {
            sb.append("; httponly");
        }
        String str = this.j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
