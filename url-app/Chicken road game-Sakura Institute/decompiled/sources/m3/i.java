package m3;

import A.AbstractC0017m;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p2.C0996c;
import r0.B;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f8371j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f8372k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f8373l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f8374m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f8375a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8376b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8377c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8378d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8380f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8381g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8382h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8383i;

    public i(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f8375a = str;
        this.f8376b = str2;
        this.f8377c = j4;
        this.f8378d = str3;
        this.f8379e = str4;
        this.f8380f = z4;
        this.f8381g = z5;
        this.f8382h = z6;
        this.f8383i = z7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.a(iVar.f8375a, this.f8375a) && Intrinsics.a(iVar.f8376b, this.f8376b) && iVar.f8377c == this.f8377c && Intrinsics.a(iVar.f8378d, this.f8378d) && Intrinsics.a(iVar.f8379e, this.f8379e) && iVar.f8380f == this.f8380f && iVar.f8381g == this.f8381g && iVar.f8382h == this.f8382h && iVar.f8383i == this.f8383i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8383i) + AbstractC0017m.d(AbstractC0017m.d(AbstractC0017m.d(B.a(this.f8379e, B.a(this.f8378d, AbstractC0017m.c(B.a(this.f8376b, B.a(this.f8375a, 527, 31), 31), 31, this.f8377c), 31), 31), 31, this.f8380f), 31, this.f8381g), 31, this.f8382h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8375a);
        sb.append('=');
        sb.append(this.f8376b);
        if (this.f8382h) {
            long j4 = this.f8377c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                Date date = new Date(j4);
                C0996c c0996c = r3.c.f9864a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = ((DateFormat) r3.c.f9864a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f8383i) {
            sb.append("; domain=");
            sb.append(this.f8378d);
        }
        sb.append("; path=");
        sb.append(this.f8379e);
        if (this.f8380f) {
            sb.append("; secure");
        }
        if (this.f8381g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString()");
        return sb2;
    }
}
