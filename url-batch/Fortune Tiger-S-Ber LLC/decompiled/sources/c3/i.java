package c3;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f1055j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f1056k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f1057l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f1058m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f1059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1060b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1061d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1062e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1063f;
    public final boolean g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1064i;

    public i(String str, String str2, long j4, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f1059a = str;
        this.f1060b = str2;
        this.c = j4;
        this.f1061d = str3;
        this.f1062e = str4;
        this.f1063f = z3;
        this.g = z4;
        this.h = z5;
        this.f1064i = z6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return u2.c.a(iVar.f1059a, this.f1059a) && u2.c.a(iVar.f1060b, this.f1060b) && iVar.c == this.c && u2.c.a(iVar.f1061d, this.f1061d) && u2.c.a(iVar.f1062e, this.f1062e) && iVar.f1063f == this.f1063f && iVar.g == this.g && iVar.h == this.h && iVar.f1064i == this.f1064i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1064i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f1063f) + ((this.f1062e.hashCode() + ((this.f1061d.hashCode() + ((Long.hashCode(this.c) + ((this.f1060b.hashCode() + ((this.f1059a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1059a);
        sb.append('=');
        sb.append(this.f1060b);
        if (this.h) {
            long j4 = this.c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) h3.d.f2020a.get()).format(new Date(j4));
                u2.c.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f1064i) {
            sb.append("; domain=");
            sb.append(this.f1061d);
        }
        sb.append("; path=");
        sb.append(this.f1062e);
        if (this.f1063f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        u2.c.d(sb2, "toString()");
        return sb2;
    }
}
