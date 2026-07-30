package okhttp3;

import cn.hutool.core.io.file.c;
import com.baidu.ar.auth.FeatureCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes5.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j8 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j8, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final Builder domain(String domain) {
            s.checkNotNullParameter(domain, "domain");
            return domain(domain, false);
        }

        public final Builder expiresAt(long j8) {
            if (j8 <= 0) {
                j8 = Long.MIN_VALUE;
            }
            if (j8 > DatesKt.MAX_DATE) {
                j8 = 253402300799999L;
            }
            this.expiresAt = j8;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            s.checkNotNullParameter(domain, "domain");
            return domain(domain, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String name) {
            s.checkNotNullParameter(name, "name");
            if (!s.areEqual(StringsKt__StringsKt.trim((CharSequence) name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = name;
            return this;
        }

        public final Builder path(String path) {
            s.checkNotNullParameter(path, "path");
            if (!t.startsWith$default(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = path;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String value) {
            s.checkNotNullParameter(value, "value");
            if (!s.areEqual(StringsKt__StringsKt.trim((CharSequence) value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = value;
            return this;
        }

        private final Builder domain(String str, boolean z7) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(s.stringPlus("unexpected domain: ", str));
            }
            this.domain = canonicalHost;
            this.hostOnly = z7;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        private final int dateCharacterOffset(String str, int i8, int i9, boolean z7) {
            while (i8 < i9) {
                int i10 = i8 + 1;
                char charAt = str.charAt(i8);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt <= '9' && '0' <= charAt) || ((charAt <= 'z' && 'a' <= charAt) || ((charAt <= 'Z' && 'A' <= charAt) || charAt == ':'))) == (!z7)) {
                    return i8;
                }
                i8 = i10;
            }
            return i9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (s.areEqual(str, str2)) {
                return true;
            }
            return t.endsWith$default(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str);
        }

        private final String parseDomain(String str) {
            String removePrefix;
            if (!(!t.endsWith$default(str, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            removePrefix = StringsKt__StringsKt.removePrefix(str, (CharSequence) ".");
            String canonicalHost = HostnamesKt.toCanonicalHost(removePrefix);
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i8, int i9) {
            int dateCharacterOffset = dateCharacterOffset(str, i8, i9, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (dateCharacterOffset < i9) {
                int dateCharacterOffset2 = dateCharacterOffset(str, dateCharacterOffset + 1, i9, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i11 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    s.checkNotNullExpressionValue(group, "matcher.group(1)");
                    i11 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    s.checkNotNullExpressionValue(group2, "matcher.group(2)");
                    i14 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    s.checkNotNullExpressionValue(group3, "matcher.group(3)");
                    i15 = Integer.parseInt(group3);
                } else if (i12 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    s.checkNotNullExpressionValue(group4, "matcher.group(1)");
                    i12 = Integer.parseInt(group4);
                } else if (i13 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    s.checkNotNullExpressionValue(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    s.checkNotNullExpressionValue(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    s.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    s.checkNotNullExpressionValue(pattern, "MONTH_PATTERN.pattern()");
                    i13 = StringsKt__StringsKt.indexOf$default((CharSequence) pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i10 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    s.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i10 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str, dateCharacterOffset2 + 1, i9, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += FeatureCodes.SKY_SEG;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i13 == -1) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (1 > i12 || i12 >= 32) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i11 < 0 || i11 >= 24) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, i13 - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i15);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e8) {
                if (new Regex("-?\\d+").matches(str)) {
                    return t.startsWith$default(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e8;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (s.areEqual(encodedPath, str)) {
                return true;
            }
            return t.startsWith$default(encodedPath, str, false, 2, null) && (t.endsWith$default(str, "/", false, 2, null) || encodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            s.checkNotNullParameter(url, "url");
            s.checkNotNullParameter(setCookie, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:83:0x00fe, code lost:
        
            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0113  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Cookie parse$okhttp(long j8, HttpUrl url, String setCookie) {
            long j9;
            String host;
            Cookie cookie;
            String str;
            String str2;
            String str3;
            int lastIndexOf$default;
            String str4;
            s.checkNotNullParameter(url, "url");
            s.checkNotNullParameter(setCookie, "setCookie");
            int delimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int delimiterOffset$default2 = Util.delimiterOffset$default(setCookie, '=', 0, delimiterOffset$default, 2, (Object) null);
            if (delimiterOffset$default2 == delimiterOffset$default) {
                return null;
            }
            String trimSubstring$default = Util.trimSubstring$default(setCookie, 0, delimiterOffset$default2, 1, null);
            if (trimSubstring$default.length() == 0 || Util.indexOfControlOrNonAscii(trimSubstring$default) != -1) {
                return null;
            }
            String trimSubstring = Util.trimSubstring(setCookie, delimiterOffset$default2 + 1, delimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(trimSubstring) != -1) {
                return null;
            }
            int i8 = delimiterOffset$default + 1;
            int length = setCookie.length();
            String str5 = null;
            String str6 = null;
            long j10 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = true;
            long j11 = DatesKt.MAX_DATE;
            while (i8 < length) {
                int delimiterOffset = Util.delimiterOffset(setCookie, ';', i8, length);
                int delimiterOffset2 = Util.delimiterOffset(setCookie, '=', i8, delimiterOffset);
                String trimSubstring2 = Util.trimSubstring(setCookie, i8, delimiterOffset2);
                String trimSubstring3 = delimiterOffset2 < delimiterOffset ? Util.trimSubstring(setCookie, delimiterOffset2 + 1, delimiterOffset) : "";
                if (t.equals(trimSubstring2, "expires", true)) {
                    try {
                        j11 = parseExpires(trimSubstring3, 0, trimSubstring3.length());
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (t.equals(trimSubstring2, "max-age", true)) {
                    j10 = parseMaxAge(trimSubstring3);
                } else {
                    if (t.equals(trimSubstring2, "domain", true)) {
                        str5 = parseDomain(trimSubstring3);
                        z10 = false;
                    } else if (t.equals(trimSubstring2, "path", true)) {
                        str6 = trimSubstring3;
                    } else if (t.equals(trimSubstring2, "secure", true)) {
                        z7 = true;
                    } else if (t.equals(trimSubstring2, "httponly", true)) {
                        z8 = true;
                    }
                    i8 = delimiterOffset + 1;
                }
                z9 = true;
                i8 = delimiterOffset + 1;
            }
            long j12 = Long.MIN_VALUE;
            if (j10 != Long.MIN_VALUE) {
                if (j10 != -1) {
                    j12 = j8 + (j10 <= 9223372036854775L ? j10 * 1000 : Long.MAX_VALUE);
                    long j13 = j12 >= j8 ? DatesKt.MAX_DATE : DatesKt.MAX_DATE;
                    j9 = j13;
                } else {
                    j9 = j11;
                }
                host = url.host();
                if (str5 != null) {
                    str = host;
                    cookie = null;
                } else {
                    if (!domainMatch(host, str5)) {
                        return null;
                    }
                    cookie = null;
                    str = str5;
                }
                if (host.length() == str.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(str) == null) {
                    return cookie;
                }
                str2 = "/";
                str3 = str6;
                if (str3 == null && t.startsWith$default(str3, "/", false, 2, cookie)) {
                    str4 = str3;
                } else {
                    String encodedPath = url.encodedPath();
                    lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) encodedPath, c.UNIX_SEPARATOR, 0, false, 6, (Object) null);
                    if (lastIndexOf$default != 0) {
                        str2 = encodedPath.substring(0, lastIndexOf$default);
                        s.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    str4 = str2;
                }
                return new Cookie(trimSubstring$default, trimSubstring, j9, str, str4, z7, z8, z9, z10, null);
            }
            j9 = j12;
            host = url.host();
            if (str5 != null) {
            }
            if (host.length() == str.length()) {
            }
            str2 = "/";
            str3 = str6;
            if (str3 == null) {
            }
            String encodedPath2 = url.encodedPath();
            lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) encodedPath2, c.UNIX_SEPARATOR, 0, false, 6, (Object) null);
            if (lastIndexOf$default != 0) {
            }
            str4 = str2;
            return new Cookie(trimSubstring$default, trimSubstring, j9, str, str4, z7, z8, z9, z10, null);
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            s.checkNotNullParameter(url, "url");
            s.checkNotNullParameter(headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            int i8 = 0;
            while (i8 < size) {
                int i9 = i8 + 1;
                Cookie parse = parse(url, values.get(i8));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
                i8 = i9;
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
            s.checkNotNullExpressionValue(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j8, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10, o oVar) {
        this(str, str2, j8, str3, str4, z7, z8, z9, z10);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain, reason: not valid java name */
    public final String m1330deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m1331deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m1332deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m1333deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name, reason: not valid java name */
    public final String m1334deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path, reason: not valid java name */
    public final String m1335deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m1336deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m1337deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value, reason: not valid java name */
    public final String m1338deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (s.areEqual(cookie.name, this.name) && s.areEqual(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && s.areEqual(cookie.domain, this.domain) && s.areEqual(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + androidx.collection.a.a(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + a.a(this.secure)) * 31) + a.a(this.httpOnly)) * 31) + a.a(this.persistent)) * 31) + a.a(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        s.checkNotNullParameter(url, "url");
        if ((this.hostOnly ? s.areEqual(url.host(), this.domain) : Companion.domainMatch(url.host(), this.domain)) && Companion.pathMatch(url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z7) {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('=');
        sb.append(value());
        if (persistent()) {
            if (expiresAt() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(expiresAt())));
            }
        }
        if (!hostOnly()) {
            sb.append("; domain=");
            if (z7) {
                sb.append(".");
            }
            sb.append(domain());
        }
        sb.append("; path=");
        sb.append(path());
        if (secure()) {
            sb.append("; secure");
        }
        if (httpOnly()) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        s.checkNotNullExpressionValue(sb2, "toString()");
        return sb2;
    }

    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j8, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j8;
        this.domain = str3;
        this.path = str4;
        this.secure = z7;
        this.httpOnly = z8;
        this.persistent = z9;
        this.hostOnly = z10;
    }
}
