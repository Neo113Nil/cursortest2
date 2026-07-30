package com.anythink.core.common.n.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15837a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f15838b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f15839c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f15840d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: e, reason: collision with root package name */
    private final String f15841e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15842f;

    /* renamed from: g, reason: collision with root package name */
    private final long f15843g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15844h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15845j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f15846k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f15847l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f15848m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f15849a;

        /* renamed from: b, reason: collision with root package name */
        String f15850b;

        /* renamed from: d, reason: collision with root package name */
        String f15852d;

        /* renamed from: f, reason: collision with root package name */
        boolean f15854f;

        /* renamed from: g, reason: collision with root package name */
        boolean f15855g;

        /* renamed from: h, reason: collision with root package name */
        boolean f15856h;
        boolean i;

        /* renamed from: c, reason: collision with root package name */
        long f15851c = com.anythink.core.common.n.b.a.c.d.f15208a;

        /* renamed from: e, reason: collision with root package name */
        String f15853e = "/";

        private a a(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f15849a = str;
            return this;
        }

        private a b(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f15850b = str;
            return this;
        }

        private a c(String str) {
            return a(str, false);
        }

        private a d(String str) {
            return a(str, true);
        }

        private a e(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.f15853e = str;
            return this;
        }

        private m c() {
            return new m(this);
        }

        private a a(long j9) {
            if (j9 <= 0) {
                j9 = Long.MIN_VALUE;
            }
            if (j9 > com.anythink.core.common.n.b.a.c.d.f15208a) {
                j9 = 253402300799999L;
            }
            this.f15851c = j9;
            this.f15856h = true;
            return this;
        }

        private a b() {
            this.f15855g = true;
            return this;
        }

        private a a(String str, boolean z8) {
            if (str != null) {
                String a9 = com.anythink.core.common.n.b.a.c.a(str);
                if (a9 != null) {
                    this.f15852d = a9;
                    this.i = z8;
                    return this;
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            throw new NullPointerException("domain == null");
        }

        private a a() {
            this.f15854f = true;
            return this;
        }
    }

    private m(String str, String str2, long j9, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f15841e = str;
        this.f15842f = str2;
        this.f15843g = j9;
        this.f15844h = str3;
        this.i = str4;
        this.f15845j = z8;
        this.f15846k = z9;
        this.f15848m = z10;
        this.f15847l = z11;
    }

    private boolean c() {
        return this.f15847l;
    }

    private long d() {
        return this.f15843g;
    }

    private boolean e() {
        return this.f15848m;
    }

    private String f() {
        return this.f15844h;
    }

    private String g() {
        return this.i;
    }

    private boolean h() {
        return this.f15846k;
    }

    private boolean i() {
        return this.f15845j;
    }

    private String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15841e);
        sb.append('=');
        sb.append(this.f15842f);
        if (this.f15847l) {
            if (this.f15843g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.f15843g)));
            }
        }
        if (!this.f15848m) {
            sb.append("; domain=");
            sb.append(this.f15844h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.f15845j) {
            sb.append("; secure");
        }
        if (this.f15846k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final String a() {
        return this.f15841e;
    }

    public final String b() {
        return this.f15842f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f15841e.equals(this.f15841e) && mVar.f15842f.equals(this.f15842f) && mVar.f15844h.equals(this.f15844h) && mVar.i.equals(this.i) && mVar.f15843g == this.f15843g && mVar.f15845j == this.f15845j && mVar.f15846k == this.f15846k && mVar.f15847l == this.f15847l && mVar.f15848m == this.f15848m;
    }

    public final int hashCode() {
        int k6 = AbstractC5051n.k(AbstractC5051n.k(AbstractC5051n.k(AbstractC5051n.k(527, 31, this.f15841e), 31, this.f15842f), 31, this.f15844h), 31, this.i);
        long j9 = this.f15843g;
        return ((((((((k6 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (!this.f15845j ? 1 : 0)) * 31) + (!this.f15846k ? 1 : 0)) * 31) + (!this.f15847l ? 1 : 0)) * 31) + (!this.f15848m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15841e);
        sb.append('=');
        sb.append(this.f15842f);
        if (this.f15847l) {
            if (this.f15843g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.f15843g)));
            }
        }
        if (!this.f15848m) {
            sb.append("; domain=");
            sb.append(this.f15844h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.f15845j) {
            sb.append("; secure");
        }
        if (this.f15846k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    private boolean a(v vVar) {
        if (!(this.f15848m ? vVar.f15892m.equals(this.f15844h) : a(vVar.f15892m, this.f15844h))) {
            return false;
        }
        String str = this.i;
        String h9 = vVar.h();
        if (h9.equals(str) || (h9.startsWith(str) && (str.endsWith("/") || h9.charAt(str.length()) == '/'))) {
            return !this.f15845j || vVar.c();
        }
        return false;
    }

    private static m b(v vVar, String str) {
        return a(System.currentTimeMillis(), vVar, str);
    }

    private static String b(String str) {
        if (!str.endsWith(com.anythink.core.common.d.j.f12535z)) {
            if (str.startsWith(com.anythink.core.common.d.j.f12535z)) {
                str = str.substring(1);
            }
            String a9 = com.anythink.core.common.n.b.a.c.a(str);
            if (a9 != null) {
                return a9;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public m(a aVar) {
        String str = aVar.f15849a;
        if (str != null) {
            String str2 = aVar.f15850b;
            if (str2 != null) {
                String str3 = aVar.f15852d;
                if (str3 != null) {
                    this.f15841e = str;
                    this.f15842f = str2;
                    this.f15843g = aVar.f15851c;
                    this.f15844h = str3;
                    this.i = aVar.f15853e;
                    this.f15845j = aVar.f15854f;
                    this.f15846k = aVar.f15855g;
                    this.f15847l = aVar.f15856h;
                    this.f15848m = aVar.i;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.anythink.core.common.n.b.a.c.c(str);
    }

    private static boolean a(v vVar, String str) {
        String h9 = vVar.h();
        if (h9.equals(str)) {
            return true;
        }
        if (h9.startsWith(str)) {
            return str.endsWith("/") || h9.charAt(str.length()) == '/';
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    private static m a(long j9, v vVar, String str) {
        v vVar2;
        long j10;
        String str2;
        int i;
        boolean z8;
        int i4;
        int i9;
        int i10;
        int i11;
        String str3 = str;
        int length = str3.length();
        ?? r32 = 0;
        char c4 = ';';
        int a9 = com.anythink.core.common.n.b.a.c.a(str3, 0, length, ';');
        char c9 = '=';
        int a10 = com.anythink.core.common.n.b.a.c.a(str3, 0, a9, '=');
        String str4 = null;
        if (a10 == a9) {
            return null;
        }
        String c10 = com.anythink.core.common.n.b.a.c.c(str3, 0, a10);
        if (!c10.isEmpty()) {
            int i12 = -1;
            if (com.anythink.core.common.n.b.a.c.b(c10) == -1) {
                boolean z9 = true;
                String c11 = com.anythink.core.common.n.b.a.c.c(str3, a10 + 1, a9);
                if (com.anythink.core.common.n.b.a.c.b(c11) != -1) {
                    return null;
                }
                int i13 = a9 + 1;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                String str5 = null;
                boolean z13 = true;
                long j11 = -1;
                long j12 = com.anythink.core.common.n.b.a.c.d.f15208a;
                while (i13 < length) {
                    int a11 = com.anythink.core.common.n.b.a.c.a(str3, i13, length, c4);
                    int a12 = com.anythink.core.common.n.b.a.c.a(str3, i13, a11, c9);
                    String c12 = com.anythink.core.common.n.b.a.c.c(str3, i13, a12);
                    if (a12 < a11) {
                        str2 = com.anythink.core.common.n.b.a.c.c(str3, a12 + 1, a11);
                    } else {
                        str2 = "";
                    }
                    if (c12.equalsIgnoreCase("expires")) {
                        try {
                            int length2 = str2.length();
                            int a13 = a(str2, r32, length2, r32);
                            try {
                                Matcher matcher = f15840d.matcher(str2);
                                int i14 = i12;
                                int i15 = i14;
                                int i16 = i15;
                                int i17 = i16;
                                int i18 = i17;
                                int i19 = i18;
                                while (a13 < length2) {
                                    int a14 = a(str2, a13 + 1, length2, z9);
                                    matcher.region(a13, a14);
                                    int i20 = i15;
                                    try {
                                        if (i20 != -1) {
                                            i4 = -1;
                                        } else if (matcher.usePattern(f15840d).matches()) {
                                            i20 = Integer.parseInt(matcher.group(1));
                                            i18 = Integer.parseInt(matcher.group(2));
                                            i19 = Integer.parseInt(matcher.group(3));
                                            i11 = i16;
                                            i = length;
                                            i15 = i20;
                                            a13 = a(str2, a14 + 1, length2, false);
                                            length = i;
                                            z9 = true;
                                            i16 = i11;
                                        } else {
                                            i4 = -1;
                                        }
                                        if (i9 != i4) {
                                            int i21 = length;
                                            i10 = i4;
                                            i11 = i16;
                                            i = i21;
                                        } else if (matcher.usePattern(f15839c).matches()) {
                                            i17 = Integer.parseInt(matcher.group(1));
                                            i11 = i16;
                                            i = length;
                                            i15 = i20;
                                            a13 = a(str2, a14 + 1, length2, false);
                                            length = i;
                                            z9 = true;
                                            i16 = i11;
                                        } else {
                                            i11 = i16;
                                            i = length;
                                            i10 = -1;
                                        }
                                        if (i11 == i10) {
                                            Pattern pattern = f15838b;
                                            if (matcher.usePattern(pattern).matches()) {
                                                i11 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                                i17 = i9;
                                                i15 = i20;
                                                a13 = a(str2, a14 + 1, length2, false);
                                                length = i;
                                                z9 = true;
                                                i16 = i11;
                                            } else {
                                                i10 = -1;
                                            }
                                        }
                                        i15 = i20;
                                        a13 = a(str2, a14 + 1, length2, false);
                                        length = i;
                                        z9 = true;
                                        i16 = i11;
                                    } catch (IllegalArgumentException unused) {
                                        c4 = ';';
                                        z8 = true;
                                        i13 = a11 + 1;
                                        str3 = str;
                                        z9 = z8;
                                        length = i;
                                        r32 = 0;
                                        c9 = '=';
                                        i12 = -1;
                                    }
                                    i9 = i17;
                                    if (i14 == i10 && matcher.usePattern(f15837a).matches()) {
                                        i14 = Integer.parseInt(matcher.group(1));
                                    }
                                    i17 = i9;
                                }
                                int i22 = i15;
                                int i23 = i16;
                                int i24 = i17;
                                i = length;
                                if (i14 >= 70 && i14 <= 99) {
                                    i14 += 1900;
                                }
                                if (i14 >= 0 && i14 <= 69) {
                                    i14 += 2000;
                                }
                                if (i14 < 1601) {
                                    throw new IllegalArgumentException();
                                }
                                if (i23 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                if (i24 <= 0 || i24 > 31) {
                                    throw new IllegalArgumentException();
                                }
                                if (i22 < 0 || i22 > 23) {
                                    throw new IllegalArgumentException();
                                }
                                int i25 = i18;
                                c4 = ';';
                                if (i25 < 0 || i25 > 59) {
                                    throw new IllegalArgumentException();
                                }
                                int i26 = i19;
                                if (i26 >= 0 && i26 <= 59) {
                                    try {
                                        GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f15199f);
                                        gregorianCalendar.setLenient(false);
                                        gregorianCalendar.set(1, i14);
                                        gregorianCalendar.set(2, i23 - 1);
                                        gregorianCalendar.set(5, i24);
                                        gregorianCalendar.set(11, i22);
                                        gregorianCalendar.set(12, i25);
                                        gregorianCalendar.set(13, i26);
                                        gregorianCalendar.set(14, 0);
                                        j12 = gregorianCalendar.getTimeInMillis();
                                    } catch (NumberFormatException | IllegalArgumentException unused2) {
                                        z8 = true;
                                        i13 = a11 + 1;
                                        str3 = str;
                                        z9 = z8;
                                        length = i;
                                        r32 = 0;
                                        c9 = '=';
                                        i12 = -1;
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } catch (IllegalArgumentException unused3) {
                                i = length;
                            }
                        } catch (IllegalArgumentException unused4) {
                            i = length;
                        }
                    } else {
                        i = length;
                        if (c12.equalsIgnoreCase("max-age")) {
                            j11 = a(str2);
                        } else {
                            if (c12.equalsIgnoreCase("domain")) {
                                if (!str2.endsWith(com.anythink.core.common.d.j.f12535z)) {
                                    if (str2.startsWith(com.anythink.core.common.d.j.f12535z)) {
                                        z8 = true;
                                        try {
                                            str2 = str2.substring(1);
                                        } catch (IllegalArgumentException unused5) {
                                            continue;
                                        }
                                    } else {
                                        z8 = true;
                                    }
                                    String a15 = com.anythink.core.common.n.b.a.c.a(str2);
                                    if (a15 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str4 = a15;
                                    z13 = false;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                z8 = true;
                                if (c12.equalsIgnoreCase(com.anythink.expressad.a.f17761K)) {
                                    str5 = str2;
                                } else if (c12.equalsIgnoreCase("secure")) {
                                    z11 = true;
                                } else if (c12.equalsIgnoreCase("httponly")) {
                                    z12 = true;
                                }
                            }
                            i13 = a11 + 1;
                            str3 = str;
                            z9 = z8;
                            length = i;
                            r32 = 0;
                            c9 = '=';
                            i12 = -1;
                        }
                    }
                    z8 = true;
                    z10 = true;
                    i13 = a11 + 1;
                    str3 = str;
                    z9 = z8;
                    length = i;
                    r32 = 0;
                    c9 = '=';
                    i12 = -1;
                }
                if (j11 == Long.MIN_VALUE) {
                    j10 = Long.MIN_VALUE;
                    vVar2 = vVar;
                } else if (j11 != -1) {
                    long j13 = j9 + (j11 <= 9223372036854775L ? j11 * 1000 : Long.MAX_VALUE);
                    if (j13 < j9 || j13 > com.anythink.core.common.n.b.a.c.d.f15208a) {
                        vVar2 = vVar;
                        j10 = 253402300799999L;
                    } else {
                        vVar2 = vVar;
                        j10 = j13;
                    }
                } else {
                    vVar2 = vVar;
                    j10 = j12;
                }
                String str6 = vVar2.f15892m;
                if (str4 == null) {
                    str4 = str6;
                } else if (!a(str6, str4)) {
                    return null;
                }
                if (str6.length() != str4.length() && com.anythink.core.common.n.b.a.i.a.a().a(str4) == null) {
                    return null;
                }
                if (str5 == null || !str5.startsWith("/")) {
                    String h9 = vVar2.h();
                    int lastIndexOf = h9.lastIndexOf(47);
                    if (lastIndexOf == 0) {
                        str5 = "/";
                    } else {
                        str5 = h9.substring(0, lastIndexOf);
                    }
                }
                return new m(c10, c11, j10, str4, str5, z11, z12, z13, z10);
            }
        }
        return null;
    }

    private static long a(String str, int i) {
        int a9 = a(str, 0, i, false);
        Matcher matcher = f15840d.matcher(str);
        int i4 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (a9 < i) {
            int a10 = a(str, a9 + 1, i, true);
            matcher.region(a9, a10);
            if (i9 == -1 && matcher.usePattern(f15840d).matches()) {
                i9 = Integer.parseInt(matcher.group(1));
                i12 = Integer.parseInt(matcher.group(2));
                i13 = Integer.parseInt(matcher.group(3));
            } else if (i10 == -1 && matcher.usePattern(f15839c).matches()) {
                i10 = Integer.parseInt(matcher.group(1));
            } else {
                if (i11 == -1) {
                    Pattern pattern = f15838b;
                    if (matcher.usePattern(pattern).matches()) {
                        i11 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(f15837a).matches()) {
                    i4 = Integer.parseInt(matcher.group(1));
                }
            }
            a9 = a(str, a10 + 1, i, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i11 == -1) {
            throw new IllegalArgumentException();
        }
        if (i10 <= 0 || i10 > 31) {
            throw new IllegalArgumentException();
        }
        if (i9 < 0 || i9 > 23) {
            throw new IllegalArgumentException();
        }
        if (i12 < 0 || i12 > 59) {
            throw new IllegalArgumentException();
        }
        if (i13 >= 0 && i13 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f15199f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i11 - 1);
            gregorianCalendar.set(5, i10);
            gregorianCalendar.set(11, i9);
            gregorianCalendar.set(12, i12);
            gregorianCalendar.set(13, i13);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i, int i4, boolean z8) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z8)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e6) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e6;
        }
    }

    public static List<m> a(v vVar, u uVar) {
        List<String> b9 = uVar.b("Set-Cookie");
        int size = b9.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            m a9 = a(System.currentTimeMillis(), vVar, b9.get(i));
            if (a9 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a9);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }
}
