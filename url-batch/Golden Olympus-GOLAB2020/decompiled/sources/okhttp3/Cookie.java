package okhttp3;

import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

@Metadata
/* loaded from: classes3.dex */
public final class Cookie {

    /* renamed from: j, reason: collision with root package name */
    public static final Companion f42340j = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f42341k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f42342l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f42343m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f42344n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f42345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42346b;

    /* renamed from: c, reason: collision with root package name */
    private final long f42347c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42348d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42349e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f42350f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f42351g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f42352h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f42353i;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private long f42354a = 253402300799999L;

        /* renamed from: b, reason: collision with root package name */
        private String f42355b = "/";
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, int i4, int i5, boolean z4) {
            while (i4 < i5) {
                char charAt = str.charAt(i4);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z4)) {
                    return i4;
                }
                i4++;
            }
            return i5;
        }

        private final boolean b(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.v(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.i(str);
        }

        private final String f(String str) {
            if (StringsKt.v(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String e4 = HostnamesKt.e(StringsKt.v0(str, "."));
            if (e4 != null) {
                return e4;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i4, int i5) {
            int a4 = a(str, i4, i5, false);
            Matcher matcher = Cookie.f42344n.matcher(str);
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            while (a4 < i5) {
                int a5 = a(str, a4 + 1, i5, true);
                matcher.region(a4, a5);
                if (i7 == -1 && matcher.usePattern(Cookie.f42344n).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                    i7 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                    i10 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                    i11 = Integer.parseInt(group3);
                } else if (i8 == -1 && matcher.usePattern(Cookie.f42343m).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                    i8 = Integer.parseInt(group4);
                } else if (i9 == -1 && matcher.usePattern(Cookie.f42342l).matches()) {
                    String group5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.f42342l.pattern();
                    Intrinsics.checkNotNullExpressionValue(pattern, "MONTH_PATTERN.pattern()");
                    i9 = StringsKt.c0(pattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i6 == -1 && matcher.usePattern(Cookie.f42341k).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i6 = Integer.parseInt(group6);
                }
                a4 = a(str, a5 + 1, i5, false);
            }
            if (70 <= i6 && i6 < 100) {
                i6 += 1900;
            }
            if (i6 >= 0 && i6 < 70) {
                i6 += 2000;
            }
            if (i6 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i9 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i8 || i8 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i7 < 0 || i7 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i10 < 0 || i10 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f42594f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i6);
            gregorianCalendar.set(2, i9 - 1);
            gregorianCalendar.set(5, i8);
            gregorianCalendar.set(11, i7);
            gregorianCalendar.set(12, i10);
            gregorianCalendar.set(13, i11);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e4) {
                if (new Regex("-?\\d+").d(str)) {
                    return StringsKt.K(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e4;
            }
        }

        public final Cookie c(HttpUrl url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie d(long j4, HttpUrl url, String setCookie) {
            long j5;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            int q4 = Util.q(setCookie, ';', 0, 0, 6, null);
            int q5 = Util.q(setCookie, cc.f15727T, 0, q4, 2, null);
            Cookie cookie = null;
            if (q5 == q4) {
                return null;
            }
            String Z3 = Util.Z(setCookie, 0, q5, 1, null);
            if (Z3.length() == 0 || Util.x(Z3) != -1) {
                return null;
            }
            String Y3 = Util.Y(setCookie, q5 + 1, q4);
            if (Util.x(Y3) != -1) {
                return null;
            }
            int i4 = q4 + 1;
            int length = setCookie.length();
            String str = null;
            String str2 = null;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = true;
            long j6 = -1;
            long j7 = 253402300799999L;
            while (i4 < length) {
                int o4 = Util.o(setCookie, ';', i4, length);
                int o5 = Util.o(setCookie, cc.f15727T, i4, o4);
                String Y4 = Util.Y(setCookie, i4, o5);
                String Y5 = o5 < o4 ? Util.Y(setCookie, o5 + 1, o4) : "";
                Cookie cookie2 = cookie;
                if (StringsKt.w(Y4, "expires", true)) {
                    try {
                        j7 = g(Y5, 0, Y5.length());
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.w(Y4, "max-age", true)) {
                    j6 = h(Y5);
                } else {
                    if (StringsKt.w(Y4, b9.i.f15522D, true)) {
                        str = f(Y5);
                        z7 = false;
                    } else if (StringsKt.w(Y4, "path", true)) {
                        str2 = Y5;
                    } else if (StringsKt.w(Y4, "secure", true)) {
                        z6 = true;
                    } else if (StringsKt.w(Y4, "httponly", true)) {
                        z4 = true;
                    }
                    i4 = o4 + 1;
                    cookie = cookie2;
                }
                z5 = true;
                i4 = o4 + 1;
                cookie = cookie2;
            }
            Cookie cookie3 = cookie;
            if (j6 == Long.MIN_VALUE) {
                j5 = Long.MIN_VALUE;
            } else if (j6 != -1) {
                long j8 = j4 + (j6 <= 9223372036854775L ? j6 * 1000 : Long.MAX_VALUE);
                j5 = (j8 < j4 || j8 > 253402300799999L) ? 253402300799999L : j8;
            } else {
                j5 = j7;
            }
            String h4 = url.h();
            if (str == null) {
                str = h4;
            } else if (!b(h4, str)) {
                return cookie3;
            }
            if (h4.length() != str.length() && PublicSuffixDatabase.f43153e.c().c(str) == null) {
                return cookie3;
            }
            String str3 = "/";
            if (str2 == null || !StringsKt.K(str2, "/", false, 2, cookie3)) {
                String d4 = url.d();
                int g02 = StringsKt.g0(d4, '/', 0, false, 6, null);
                if (g02 != 0) {
                    str3 = d4.substring(0, g02);
                    Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str2 = str3;
            }
            return new Cookie(Z3, Y3, j5, str, str2, z6, z4, z5, z7, null);
        }

        public final List e(HttpUrl url, Headers headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List g4 = headers.g("Set-Cookie");
            int size = g4.size();
            ArrayList arrayList = null;
            for (int i4 = 0; i4 < size; i4++) {
                Cookie c4 = c(url, (String) g4.get(i4));
                if (c4 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c4);
                }
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j4, str3, str4, z4, z5, z6, z7);
    }

    public final String e() {
        return this.f42345a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return Intrinsics.areEqual(cookie.f42345a, this.f42345a) && Intrinsics.areEqual(cookie.f42346b, this.f42346b) && cookie.f42347c == this.f42347c && Intrinsics.areEqual(cookie.f42348d, this.f42348d) && Intrinsics.areEqual(cookie.f42349e, this.f42349e) && cookie.f42350f == this.f42350f && cookie.f42351g == this.f42351g && cookie.f42352h == this.f42352h && cookie.f42353i == this.f42353i;
    }

    public final String f(boolean z4) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42345a);
        sb.append(cc.f15727T);
        sb.append(this.f42346b);
        if (this.f42352h) {
            if (this.f42347c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.b(new Date(this.f42347c)));
            }
        }
        if (!this.f42353i) {
            sb.append("; domain=");
            if (z4) {
                sb.append(".");
            }
            sb.append(this.f42348d);
        }
        sb.append("; path=");
        sb.append(this.f42349e);
        if (this.f42350f) {
            sb.append("; secure");
        }
        if (this.f42351g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString()");
        return sb2;
    }

    public final String g() {
        return this.f42346b;
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f42345a.hashCode()) * 31) + this.f42346b.hashCode()) * 31) + Long.hashCode(this.f42347c)) * 31) + this.f42348d.hashCode()) * 31) + this.f42349e.hashCode()) * 31) + Boolean.hashCode(this.f42350f)) * 31) + Boolean.hashCode(this.f42351g)) * 31) + Boolean.hashCode(this.f42352h)) * 31) + Boolean.hashCode(this.f42353i);
    }

    public String toString() {
        return f(false);
    }

    private Cookie(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f42345a = str;
        this.f42346b = str2;
        this.f42347c = j4;
        this.f42348d = str3;
        this.f42349e = str4;
        this.f42350f = z4;
        this.f42351g = z5;
        this.f42352h = z6;
        this.f42353i = z7;
    }
}
