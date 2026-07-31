package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bs {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f23893j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f23894k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f23895l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f23896m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23897n = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23898a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23899b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23900c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f23901d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f23902e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f23903f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f23904g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f23905h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23906i;

    public static final class a {
        private static int a(int i4, int i5, String str, boolean z4) {
            while (i4 < i5) {
                char charAt = str.charAt(i4);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z4)) {
                    return i4;
                }
                i4++;
            }
            return i5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
        
            if (r0.a(r5) == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:136:0x0254, code lost:
        
            if (com.yandex.mobile.ads.impl.v82.a(r0) == false) goto L110;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
        
            if (r1 != (-1)) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, "<this>");
            r1 = com.yandex.mobile.ads.impl.v82.a(r7 + 1, r0, r11);
            r1 = r11.substring(r1, com.yandex.mobile.ads.impl.v82.b(r1, r0, r11));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "<this>");
            r4 = r1.length();
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
        
            if (r5 >= r4) goto L152;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
        
            r7 = r1.charAt(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.compare((int) r7, 31) <= 0) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.compare((int) r7, 127) < 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
        
            if (r5 == (-1)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
        
            r0 = r0 + 1;
            r4 = r11.length();
            r21 = 253402300799999L;
            r28 = true;
            r23 = -1;
            r25 = 253402300799999L;
            r5 = null;
            r7 = null;
            r14 = false;
            r27 = false;
            r29 = false;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static List a(@NotNull mh0 mh0Var, @NotNull ff0 headers) {
            String setCookie;
            long currentTimeMillis;
            boolean z4;
            String str;
            String substring;
            String str2;
            List list;
            String substring2;
            int i4;
            int length;
            long j4;
            boolean z5;
            long j5;
            long j6;
            String str3;
            String str4;
            boolean z6;
            boolean z7;
            boolean z8;
            int i5;
            int i6;
            String str5;
            bs bsVar;
            PublicSuffixDatabase publicSuffixDatabase;
            String str6;
            int i7;
            boolean z9;
            bs bsVar2;
            mh0 url = mh0Var;
            String str7 = "url";
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List d4 = headers.d();
            int size = d4.size();
            int i8 = 0;
            int i9 = 0;
            ArrayList arrayList = null;
            while (i9 < size) {
                setCookie = (String) d4.get(i9);
                Intrinsics.checkNotNullParameter(url, str7);
                Intrinsics.checkNotNullParameter(setCookie, "setCookie");
                currentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNullParameter(url, str7);
                Intrinsics.checkNotNullParameter(setCookie, "setCookie");
                byte[] bArr = v82.f33550a;
                int a4 = v82.a(setCookie, ';', i8, setCookie.length());
                int a5 = v82.a(setCookie, com.ironsource.cc.f15727T, i8, a4);
                if (a5 == a4) {
                    str2 = str7;
                    list = d4;
                    i5 = size;
                    i6 = i8;
                    bsVar2 = null;
                } else {
                    z4 = true;
                    str = "<this>";
                    Intrinsics.checkNotNullParameter(setCookie, "<this>");
                    int a6 = v82.a(i8, a5, setCookie);
                    substring = setCookie.substring(a6, v82.b(a6, a5, setCookie));
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (substring.length() != 0) {
                        Intrinsics.checkNotNullParameter(substring, "<this>");
                        int length2 = substring.length();
                        str2 = str7;
                        int i10 = 0;
                        while (true) {
                            list = d4;
                            if (i10 >= length2) {
                                break;
                            }
                            char charAt = substring.charAt(i10);
                            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                                break;
                            }
                            i10++;
                            d4 = list;
                        }
                    } else {
                        str2 = str7;
                        list = d4;
                    }
                    i5 = size;
                    bsVar2 = null;
                    i6 = 0;
                }
                bsVar = bsVar2;
                if (bsVar != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bsVar);
                }
                i9++;
                url = mh0Var;
                i8 = i6;
                str7 = str2;
                d4 = list;
                size = i5;
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNull(unmodifiableList);
            return unmodifiableList;
            while (true) {
                String str8 = substring2;
                if (i4 < length) {
                    int i11 = size;
                    int a7 = v82.a(setCookie, ';', i4, length);
                    int i12 = length;
                    int a8 = v82.a(setCookie, com.ironsource.cc.f15727T, i4, a7);
                    Intrinsics.checkNotNullParameter(setCookie, str);
                    int a9 = v82.a(i4, a8, setCookie);
                    String substring3 = setCookie.substring(a9, v82.b(a9, a8, setCookie));
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    if (a8 < a7) {
                        Intrinsics.checkNotNullParameter(setCookie, str);
                        int a10 = v82.a(a8 + 1, a7, setCookie);
                        str6 = setCookie.substring(a10, v82.b(a10, a7, setCookie));
                        Intrinsics.checkNotNullExpressionValue(str6, "substring(...)");
                    } else {
                        str6 = "";
                    }
                    String str9 = str;
                    boolean z10 = z4;
                    if (StringsKt.w(substring3, "expires", z10)) {
                        try {
                            j6 = a(str6.length(), str6);
                        } catch (NumberFormatException | IllegalArgumentException unused) {
                            i7 = a7;
                            z9 = true;
                            i4 = i7 + 1;
                            z4 = z9;
                            length = i12;
                            substring2 = str8;
                            size = i11;
                            str = str9;
                        }
                    } else if (StringsKt.w(substring3, "max-age", z10)) {
                        try {
                            j5 = Long.parseLong(str6);
                        } catch (NumberFormatException e4) {
                            if (!new Regex("-?\\d+").d(str6)) {
                                i7 = a7;
                                throw e4;
                            }
                            i7 = a7;
                            try {
                            } catch (NumberFormatException | IllegalArgumentException unused2) {
                                z9 = true;
                                i4 = i7 + 1;
                                z4 = z9;
                                length = i12;
                                substring2 = str8;
                                size = i11;
                                str = str9;
                            }
                            if (!StringsKt.K(str6, "-", false, 2, null)) {
                                j5 = Long.MAX_VALUE;
                                z9 = true;
                                z8 = true;
                                i4 = i7 + 1;
                                z4 = z9;
                                length = i12;
                                substring2 = str8;
                                size = i11;
                                str = str9;
                            }
                            z9 = true;
                            i4 = i7 + 1;
                            z4 = z9;
                            length = i12;
                            substring2 = str8;
                            size = i11;
                            str = str9;
                        }
                        if (j5 <= 0) {
                            i7 = a7;
                            j5 = Long.MIN_VALUE;
                            z9 = true;
                            z8 = true;
                            i4 = i7 + 1;
                            z4 = z9;
                            length = i12;
                            substring2 = str8;
                            size = i11;
                            str = str9;
                        }
                    } else {
                        i7 = a7;
                        if (!StringsKt.w(substring3, b9.i.f15522D, true)) {
                            z9 = true;
                            if (StringsKt.w(substring3, "path", true)) {
                                str4 = str6;
                            } else if (StringsKt.w(substring3, "secure", true)) {
                                z6 = true;
                            } else if (StringsKt.w(substring3, "httponly", true)) {
                                z7 = true;
                            }
                        } else {
                            if (StringsKt.v(str6, ".", false, 2, null)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String a11 = pf0.a(StringsKt.v0(str6, "."));
                            if (a11 == null) {
                                throw new IllegalArgumentException();
                            }
                            str3 = a11;
                            z9 = true;
                            z5 = false;
                        }
                        i4 = i7 + 1;
                        z4 = z9;
                        length = i12;
                        substring2 = str8;
                        size = i11;
                        str = str9;
                    }
                    i7 = a7;
                    z9 = true;
                    z8 = true;
                    i4 = i7 + 1;
                    z4 = z9;
                    length = i12;
                    substring2 = str8;
                    size = i11;
                    str = str9;
                } else {
                    i5 = size;
                    if (j5 == Long.MIN_VALUE) {
                        j4 = Long.MIN_VALUE;
                    } else if (j5 != -1) {
                        long j7 = currentTimeMillis + (j5 <= 9223372036854775L ? j5 * 1000 : Long.MAX_VALUE);
                        if (j7 >= currentTimeMillis && j7 <= 253402300799999L) {
                            j4 = j7;
                        }
                    } else {
                        j4 = j6;
                    }
                    String g4 = mh0Var.g();
                    if (str3 == null) {
                        str3 = g4;
                    } else if (!Intrinsics.areEqual(g4, str3)) {
                        if (StringsKt.v(g4, str3, false, 2, null)) {
                            if (g4.charAt((g4.length() - str3.length()) - 1) == '.') {
                            }
                        }
                    }
                    if (g4.length() != str3.length()) {
                        publicSuffixDatabase = PublicSuffixDatabase.f20685g;
                    }
                    if (str4 == null || !StringsKt.K(str4, "/", false, 2, null)) {
                        String c4 = mh0Var.c();
                        int g02 = StringsKt.g0(c4, '/', 0, false, 6, null);
                        if (g02 != 0) {
                            i6 = 0;
                            String substring4 = c4.substring(0, g02);
                            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                            str5 = substring4;
                        } else {
                            i6 = 0;
                            str5 = "/";
                        }
                    } else {
                        str5 = str4;
                        i6 = 0;
                    }
                    bsVar = new bs(substring, str8, j4, str3, str5, z6, z7, z8, z5, 0);
                }
            }
        }

        private static long a(int i4, String str) {
            int a4 = a(0, i4, str, false);
            Matcher matcher = bs.f23896m.matcher(str);
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            while (a4 < i4) {
                int a5 = a(a4 + 1, i4, str, true);
                matcher.region(a4, a5);
                if (i6 != -1 || !matcher.usePattern(bs.f23896m).matches()) {
                    if (i7 != -1 || !matcher.usePattern(bs.f23895l).matches()) {
                        if (i8 != -1 || !matcher.usePattern(bs.f23894k).matches()) {
                            if (i5 == -1 && matcher.usePattern(bs.f23893j).matches()) {
                                String group = matcher.group(1);
                                Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                                i5 = Integer.parseInt(group);
                            }
                        } else {
                            String group2 = matcher.group(1);
                            Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                            Locale US = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US, "US");
                            String lowerCase = group2.toLowerCase(US);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            String pattern = bs.f23894k.pattern();
                            Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
                            i8 = StringsKt.c0(pattern, lowerCase, 0, false, 6, null) / 4;
                        }
                    } else {
                        String group3 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group3, "group(...)");
                        i7 = Integer.parseInt(group3);
                    }
                } else {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "group(...)");
                    i6 = Integer.parseInt(group4);
                    String group5 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group5, "group(...)");
                    i9 = Integer.parseInt(group5);
                    String group6 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group6, "group(...)");
                    i10 = Integer.parseInt(group6);
                }
                a4 = a(a5 + 1, i4, str, false);
            }
            if (70 <= i5 && i5 < 100) {
                i5 += 1900;
            }
            if (i5 >= 0 && i5 < 70) {
                i5 += 2000;
            }
            if (i5 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i8 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i7 || i7 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i6 < 0 || i6 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i9 < 0 || i9 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i10 >= 0 && i10 < 60) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(v82.f33553d);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i5);
                gregorianCalendar.set(2, i8 - 1);
                gregorianCalendar.set(5, i7);
                gregorianCalendar.set(11, i6);
                gregorianCalendar.set(12, i9);
                gregorianCalendar.set(13, i10);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private bs(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f23898a = str;
        this.f23899b = str2;
        this.f23900c = j4;
        this.f23901d = str3;
        this.f23902e = str4;
        this.f23903f = z4;
        this.f23904g = z5;
        this.f23905h = z6;
        this.f23906i = z7;
    }

    @NotNull
    public final String e() {
        return this.f23898a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return Intrinsics.areEqual(bsVar.f23898a, this.f23898a) && Intrinsics.areEqual(bsVar.f23899b, this.f23899b) && bsVar.f23900c == this.f23900c && Intrinsics.areEqual(bsVar.f23901d, this.f23901d) && Intrinsics.areEqual(bsVar.f23902e, this.f23902e) && bsVar.f23903f == this.f23903f && bsVar.f23904g == this.f23904g && bsVar.f23905h == this.f23905h && bsVar.f23906i == this.f23906i;
    }

    @NotNull
    public final String f() {
        return this.f23899b;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Boolean.hashCode(this.f23906i) + C1965h6.a(this.f23905h, C1965h6.a(this.f23904g, C1965h6.a(this.f23903f, C1842c3.a(this.f23902e, C1842c3.a(this.f23901d, (Long.hashCode(this.f23900c) + C1842c3.a(this.f23899b, C1842c3.a(this.f23898a, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31)) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23898a);
        sb.append(com.ironsource.cc.f15727T);
        sb.append(this.f23899b);
        if (this.f23905h) {
            if (this.f23900c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(pv.a(new Date(this.f23900c)));
            }
        }
        if (!this.f23906i) {
            sb.append("; domain=");
            sb.append(this.f23901d);
        }
        sb.append("; path=");
        sb.append(this.f23902e);
        if (this.f23903f) {
            sb.append("; secure");
        }
        if (this.f23904g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ bs(String str, String str2, long j4, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7, int i4) {
        this(str, str2, j4, str3, str4, z4, z5, z6, z7);
    }
}
