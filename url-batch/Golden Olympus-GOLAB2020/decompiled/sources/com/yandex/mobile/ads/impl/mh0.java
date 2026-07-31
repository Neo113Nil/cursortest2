package com.yandex.mobile.ads.impl;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class mh0 {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final char[] f29088j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29089a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29090b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f29091c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f29092d;

    /* renamed from: e, reason: collision with root package name */
    private final int f29093e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final List<String> f29094f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f29095g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f29096h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f29097i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private String f29098a;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        private String f29101d;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final ArrayList f29103f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        private ArrayList f29104g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        private String f29105h;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private String f29099b = "";

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private String f29100c = "";

        /* renamed from: e, reason: collision with root package name */
        private int f29102e = -1;

        /* renamed from: com.yandex.mobile.ads.impl.mh0$a$a, reason: collision with other inner class name */
        public static final class C0197a {
            private C0197a() {
            }

            public static final int a(String str, int i4, int i5) {
                try {
                    int parseInt = Integer.parseInt(b.a(str, i4, i5, "", false, false, false, false, 248));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public static final int b(String str, int i4, int i5) {
                while (i4 < i5) {
                    char charAt = str.charAt(i4);
                    if (charAt == '[') {
                        do {
                            i4++;
                            if (i4 < i5) {
                            }
                        } while (str.charAt(i4) != ']');
                    } else if (charAt == ':') {
                        return i4;
                    }
                    i4++;
                }
                return i5;
            }

            public static final int c(String str, int i4, int i5) {
                if (i5 - i4 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i4);
                if ((Intrinsics.compare((int) charAt, 97) < 0 || Intrinsics.compare((int) charAt, 122) > 0) && (Intrinsics.compare((int) charAt, 65) < 0 || Intrinsics.compare((int) charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i4++;
                    if (i4 >= i5) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i4);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i4;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public static final int d(String str, int i4, int i5) {
                int i6 = 0;
                while (i4 < i5) {
                    char charAt = str.charAt(i4);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i6++;
                    i4++;
                }
                return i6;
            }

            public /* synthetic */ C0197a(int i4) {
                this();
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f29103f = arrayList;
            arrayList.add("");
        }

        @NotNull
        public final mh0 a() {
            ArrayList arrayList;
            String str = this.f29098a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String a4 = b.a(this.f29099b, 0, 0, false, 7);
            String a5 = b.a(this.f29100c, 0, 0, false, 7);
            String str2 = this.f29101d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i4 = this.f29102e;
            if (i4 == -1) {
                String scheme = this.f29098a;
                Intrinsics.checkNotNull(scheme);
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                i4 = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
            }
            ArrayList arrayList2 = this.f29103f;
            int i5 = i4;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                arrayList3.add(b.a((String) obj, 0, 0, false, 7));
            }
            ArrayList arrayList4 = this.f29104g;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                int size2 = arrayList4.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj2 = arrayList4.get(i7);
                    i7++;
                    String str3 = (String) obj2;
                    arrayList5.add(str3 != null ? b.a(str3, 0, 0, true, 3) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str4 = this.f29105h;
            return new mh0(str, a4, a5, str2, i5, arrayList3, arrayList, str4 != null ? b.a(str4, 0, 0, false, 7) : null, toString());
        }

        @NotNull
        public final ArrayList b() {
            return this.f29103f;
        }

        @NotNull
        public final a c() {
            Intrinsics.checkNotNullParameter("", "password");
            this.f29100c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        @NotNull
        public final a d() {
            String str = this.f29101d;
            this.f29101d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f29103f.size();
            for (int i4 = 0; i4 < size; i4++) {
                ArrayList arrayList = this.f29103f;
                arrayList.set(i4, b.a((String) arrayList.get(i4), 0, 0, "[]", true, true, false, false, 227));
            }
            ArrayList arrayList2 = this.f29104g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = (String) arrayList2.get(i5);
                    arrayList2.set(i5, str2 != null ? b.a(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
                }
            }
            String str3 = this.f29105h;
            this.f29105h = str3 != null ? b.a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
            return this;
        }

        public final void e(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f29100c = str;
        }

        public final void f(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f29099b = str;
        }

        public final void g(@Nullable String str) {
            this.f29101d = str;
        }

        public final void h(@Nullable String str) {
            this.f29098a = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
        
            if (r1 != r5) goto L44;
         */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String toString() {
            StringBuilder out = new StringBuilder();
            String str = this.f29098a;
            if (str != null) {
                out.append(str);
                out.append("://");
            } else {
                out.append("//");
            }
            if (this.f29099b.length() > 0 || this.f29100c.length() > 0) {
                out.append(this.f29099b);
                if (this.f29100c.length() > 0) {
                    out.append(':');
                    out.append(this.f29100c);
                }
                out.append('@');
            }
            String str2 = this.f29101d;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.O(str2, ':', false, 2, null)) {
                    out.append('[');
                    out.append(this.f29101d);
                    out.append(']');
                } else {
                    out.append(this.f29101d);
                }
            }
            int i4 = this.f29102e;
            int i5 = -1;
            if (i4 != -1 || this.f29098a != null) {
                if (i4 == -1) {
                    String scheme = this.f29098a;
                    Intrinsics.checkNotNull(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    i4 = Intrinsics.areEqual(scheme, "http") ? 80 : Intrinsics.areEqual(scheme, "https") ? 443 : -1;
                }
                String scheme2 = this.f29098a;
                if (scheme2 != null) {
                    Intrinsics.checkNotNull(scheme2);
                    Intrinsics.checkNotNullParameter(scheme2, "scheme");
                    if (Intrinsics.areEqual(scheme2, "http")) {
                        i5 = 80;
                    } else if (Intrinsics.areEqual(scheme2, "https")) {
                        i5 = 443;
                    }
                }
                out.append(':');
                out.append(i4);
            }
            ArrayList arrayList = this.f29103f;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                out.append('/');
                out.append((String) arrayList.get(i6));
            }
            if (this.f29104g != null) {
                out.append('?');
                ArrayList arrayList2 = this.f29104g;
                Intrinsics.checkNotNull(arrayList2);
                Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                Intrinsics.checkNotNullParameter(out, "out");
                kotlin.ranges.d o4 = kotlin.ranges.g.o(kotlin.ranges.g.p(0, arrayList2.size()), 2);
                int b4 = o4.b();
                int d4 = o4.d();
                int e4 = o4.e();
                if ((e4 > 0 && b4 <= d4) || (e4 < 0 && d4 <= b4)) {
                    while (true) {
                        String str3 = (String) arrayList2.get(b4);
                        String str4 = (String) arrayList2.get(b4 + 1);
                        if (b4 > 0) {
                            out.append('&');
                        }
                        out.append(str3);
                        if (str4 != null) {
                            out.append(com.ironsource.cc.f15727T);
                            out.append(str4);
                        }
                        if (b4 == d4) {
                            break;
                        }
                        b4 += e4;
                    }
                }
            }
            if (this.f29105h != null) {
                out.append('#');
                out.append(this.f29105h);
            }
            String sb = out.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
            return sb;
        }

        @NotNull
        public final a b(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String a4 = pf0.a(b.a(host, 0, 0, false, 7));
            if (a4 != null) {
                this.f29101d = a4;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        @NotNull
        public final a c(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.w(scheme, "http", true)) {
                this.f29098a = "http";
                return this;
            }
            if (StringsKt.w(scheme, "https", true)) {
                this.f29098a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        @NotNull
        public final a e() {
            Intrinsics.checkNotNullParameter("", "username");
            this.f29099b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final void b(int i4) {
            this.f29102e = i4;
        }

        public final void d(@Nullable String str) {
            this.f29105h = str;
        }

        @NotNull
        public final void a(@Nullable String str) {
            String a4;
            this.f29104g = (str == null || (a4 = b.a(str, 0, 0, " \"'<>#", true, false, true, false, 211)) == null) ? null : b.b(a4);
        }

        @NotNull
        public final a a(@Nullable mh0 mh0Var, @NotNull String str) {
            int a4;
            int b4;
            int a5;
            boolean z4;
            boolean z5;
            char c4;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            a4 = v82.a(0, input.length(), input);
            b4 = v82.b(a4, input.length(), input);
            int c5 = C0197a.c(input, a4, b4);
            boolean z6 = true;
            if (c5 != -1) {
                if (StringsKt.H(input, "https:", a4, true)) {
                    this.f29098a = "https";
                    a4 += 6;
                } else if (StringsKt.H(input, "http:", a4, true)) {
                    this.f29098a = "http";
                    a4 += 5;
                } else {
                    String substring = input.substring(0, c5);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + substring + "'");
                }
            } else if (mh0Var != null) {
                this.f29098a = mh0Var.k();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d4 = C0197a.d(input, a4, b4);
            char c6 = '?';
            char c7 = '\\';
            char c8 = '/';
            char c9 = '#';
            if (d4 < 2 && mh0Var != null && Intrinsics.areEqual(mh0Var.k(), this.f29098a)) {
                this.f29099b = mh0Var.f();
                this.f29100c = mh0Var.b();
                this.f29101d = mh0Var.g();
                this.f29102e = mh0Var.i();
                this.f29103f.clear();
                this.f29103f.addAll(mh0Var.d());
                if (a4 == b4 || input.charAt(a4) == '#') {
                    a(mh0Var.e());
                }
                z4 = true;
            } else {
                int i4 = a4 + d4;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    a5 = v82.a(i4, b4, input, "@/\\?#");
                    char charAt = a5 != b4 ? input.charAt(a5) : (char) 65535;
                    if (charAt == 65535 || charAt == c9 || charAt == c8 || charAt == c7 || charAt == c6) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z7) {
                            int a6 = v82.a(input, ':', i4, a5);
                            z5 = z6;
                            String a7 = b.a(input, i4, a6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z8) {
                                a7 = this.f29099b + "%40" + a7;
                            }
                            this.f29099b = a7;
                            if (a6 != a5) {
                                a5 = a5;
                                this.f29100c = b.a(str, a6 + 1, a5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z7 = z5;
                            } else {
                                a5 = a5;
                            }
                            input = str;
                            z8 = z5;
                        } else {
                            z5 = z6;
                            input = str;
                            this.f29100c = this.f29100c + "%40" + b.a(input, i4, a5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        }
                        i4 = a5 + 1;
                        z6 = z5;
                        c7 = '\\';
                        c8 = '/';
                        c9 = '#';
                        c6 = '?';
                    }
                }
                z4 = z6;
                int b5 = C0197a.b(input, i4, a5);
                int i5 = b5 + 1;
                if (i5 < a5) {
                    this.f29101d = pf0.a(b.a(input, i4, b5, false, 4));
                    int a8 = C0197a.a(input, i5, a5);
                    this.f29102e = a8;
                    if (a8 == -1) {
                        String substring2 = input.substring(i5, a5);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        throw new IllegalArgumentException(("Invalid URL port: \"" + substring2 + "\"").toString());
                    }
                } else {
                    this.f29101d = pf0.a(b.a(input, i4, b5, false, 4));
                    String str2 = this.f29098a;
                    Intrinsics.checkNotNull(str2);
                    this.f29102e = b.a(str2);
                }
                if (this.f29101d == null) {
                    String substring3 = input.substring(i4, b5);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    throw new IllegalArgumentException(("Invalid URL host: \"" + substring3 + "\"").toString());
                }
                a4 = a5;
            }
            int a9 = v82.a(a4, b4, input, "?#");
            if (a4 != a9) {
                char charAt2 = input.charAt(a4);
                if (charAt2 != '/' && charAt2 != '\\') {
                    this.f29103f.set(r3.size() - 1, "");
                } else {
                    this.f29103f.clear();
                    this.f29103f.add("");
                    a4++;
                }
                while (a4 < a9) {
                    int a10 = v82.a(a4, a9, input, "/\\");
                    boolean z9 = a10 < a9 ? z4 : false;
                    String a11 = b.a(input, a4, a10, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                    if (!Intrinsics.areEqual(a11, ".")) {
                        boolean z10 = z4;
                        if (!StringsKt.w(a11, "%2e", z10)) {
                            if (!Intrinsics.areEqual(a11, "..") && !StringsKt.w(a11, "%2e.", z10) && !StringsKt.w(a11, ".%2e", z10) && !StringsKt.w(a11, "%2e%2e", z10)) {
                                ArrayList arrayList = this.f29103f;
                                if (((CharSequence) arrayList.get(arrayList.size() - (z10 ? 1 : 0))).length() == 0) {
                                    ArrayList arrayList2 = this.f29103f;
                                    arrayList2.set(arrayList2.size() - (z10 ? 1 : 0), a11);
                                } else {
                                    this.f29103f.add(a11);
                                }
                                if (z9) {
                                    this.f29103f.add("");
                                }
                            } else {
                                if (((String) this.f29103f.remove(r2.size() - 1)).length() == 0 && !this.f29103f.isEmpty()) {
                                    this.f29103f.set(r2.size() - 1, "");
                                } else {
                                    this.f29103f.add("");
                                }
                            }
                        }
                    }
                    a4 = z9 ? a10 + 1 : a10;
                    z4 = true;
                }
            }
            if (a9 >= b4 || input.charAt(a9) != '?') {
                c4 = '#';
            } else {
                c4 = '#';
                int a12 = v82.a(input, '#', a9, b4);
                this.f29104g = b.b(b.a(input, a9 + 1, a12, " \"'<>#", true, false, true, false, 208));
                a9 = a12;
            }
            if (a9 < b4 && input.charAt(a9) == c4) {
                this.f29105h = b.a(input, a9 + 1, b4, "", true, false, false, true, 176);
            }
            return this;
        }

        @NotNull
        public final a a(int i4) {
            if (1 <= i4 && i4 < 65536) {
                this.f29102e = i4;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i4).toString());
        }
    }

    public static final class b {
        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
        
            if (com.yandex.mobile.ads.impl.v82.a(r17.charAt(r12)) != (-1)) goto L95;
         */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0122 A[LOOP:2: B:72:0x011c->B:74:0x0122, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static String a(String str, int i4, int i5, String encodeSet, boolean z4, boolean z5, boolean z6, boolean z7, int i6) {
            int i7;
            boolean z8 = false;
            int i8 = (i6 & 1) != 0 ? 0 : i4;
            int length = (i6 & 2) != 0 ? str.length() : i5;
            boolean z9 = (i6 & 8) != 0 ? false : z4;
            boolean z10 = (i6 & 16) != 0 ? false : z5;
            boolean z11 = (i6 & 32) != 0 ? false : z6;
            boolean z12 = (i6 & 64) != 0 ? false : z7;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i9 = i8;
            while (i9 < length) {
                int codePointAt = str.codePointAt(i9);
                int i10 = 127;
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z12) || StringsKt.O(encodeSet, (char) codePointAt, z8, 2, null) || ((codePointAt == 37 && (!z9 || (z10 && ((i7 = i9 + 2) >= length || str.charAt(i9) != '%' || v82.a(str.charAt(i9 + 1)) == -1 || v82.a(str.charAt(i7)) == -1)))) || (codePointAt == 43 && z11)))) {
                    C3372e c3372e = new C3372e();
                    c3372e.A0(str, i8, i9);
                    C3372e c3372e2 = null;
                    while (i9 < length) {
                        int codePointAt2 = str.codePointAt(i9);
                        if (!z9 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                            if (codePointAt2 == 43 && z11) {
                                c3372e.C(z9 ? "+" : "%2B");
                            } else {
                                if (codePointAt2 >= 32 && codePointAt2 != i10 && ((codePointAt2 < 128 || z12) && !StringsKt.O(encodeSet, (char) codePointAt2, false, 2, null))) {
                                    if (codePointAt2 == 37) {
                                        if (z9) {
                                            if (z10) {
                                                int i11 = i9 + 2;
                                                if (i11 < length && str.charAt(i9) == '%') {
                                                    if (v82.a(str.charAt(i9 + 1)) != -1) {
                                                    }
                                                    if (c3372e2 == null) {
                                                        c3372e2 = new C3372e();
                                                    }
                                                    c3372e2.B0(codePointAt2);
                                                    while (!c3372e2.v()) {
                                                        byte readByte = c3372e2.readByte();
                                                        c3372e.w(37);
                                                        c3372e.w(mh0.f29088j[((readByte & 255) >> 4) & 15]);
                                                        c3372e.w(mh0.f29088j[readByte & 15]);
                                                    }
                                                    i9 += Character.charCount(codePointAt2);
                                                    i10 = 127;
                                                }
                                            }
                                        }
                                    }
                                    c3372e.B0(codePointAt2);
                                    i9 += Character.charCount(codePointAt2);
                                    i10 = 127;
                                }
                                if (c3372e2 == null) {
                                }
                                c3372e2.B0(codePointAt2);
                                while (!c3372e2.v()) {
                                }
                                i9 += Character.charCount(codePointAt2);
                                i10 = 127;
                            }
                        }
                        i9 += Character.charCount(codePointAt2);
                        i10 = 127;
                    }
                    return c3372e.i0();
                }
                i9 += Character.charCount(codePointAt);
                z8 = false;
            }
            String substring = str.substring(i8, length);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }

        @NotNull
        public static ArrayList b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= str.length()) {
                String str2 = str;
                int b02 = StringsKt.b0(str2, '&', i4, false, 4, null);
                if (b02 == -1) {
                    b02 = str2.length();
                }
                int b03 = StringsKt.b0(str2, com.ironsource.cc.f15727T, i4, false, 4, null);
                if (b03 == -1 || b03 > b02) {
                    String substring = str2.substring(i4, b02);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str2.substring(i4, b03);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    arrayList.add(substring2);
                    String substring3 = str2.substring(b03 + 1, b02);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    arrayList.add(substring3);
                }
                i4 = b02 + 1;
                str = str2;
            }
            return arrayList;
        }

        public /* synthetic */ b(int i4) {
            this();
        }

        public static int a(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public static String a(String str, int i4, int i5, boolean z4, int i6) {
            int i7;
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 4) != 0) {
                z4 = false;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i8 = i4;
            while (i8 < i5) {
                char charAt = str.charAt(i8);
                if (charAt == '%' || (charAt == '+' && z4)) {
                    C3372e c3372e = new C3372e();
                    c3372e.A0(str, i4, i8);
                    while (i8 < i5) {
                        int codePointAt = str.codePointAt(i8);
                        if (codePointAt == 37 && (i7 = i8 + 2) < i5) {
                            int a4 = v82.a(str.charAt(i8 + 1));
                            int a5 = v82.a(str.charAt(i7));
                            if (a4 != -1 && a5 != -1) {
                                c3372e.w((a4 << 4) + a5);
                                i8 = Character.charCount(codePointAt) + i7;
                            }
                            c3372e.B0(codePointAt);
                            i8 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z4) {
                                c3372e.w(32);
                                i8++;
                            }
                            c3372e.B0(codePointAt);
                            i8 += Character.charCount(codePointAt);
                        }
                    }
                    return c3372e.i0();
                }
                i8++;
            }
            String substring = str.substring(i4, i5);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
    }

    public mh0(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i4, @NotNull ArrayList pathSegments, @Nullable ArrayList arrayList, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f29089a = scheme;
        this.f29090b = username;
        this.f29091c = password;
        this.f29092d = host;
        this.f29093e = i4;
        this.f29094f = arrayList;
        this.f29095g = str;
        this.f29096h = url;
        this.f29097i = Intrinsics.areEqual(scheme, "https");
    }

    @NotNull
    public final String b() {
        if (this.f29091c.length() == 0) {
            return "";
        }
        String substring = this.f29096h.substring(StringsKt.b0(this.f29096h, ':', this.f29089a.length() + 3, false, 4, null) + 1, StringsKt.b0(this.f29096h, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final String c() {
        int b02 = StringsKt.b0(this.f29096h, '/', this.f29089a.length() + 3, false, 4, null);
        String str = this.f29096h;
        String substring = this.f29096h.substring(b02, v82.a(b02, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final ArrayList d() {
        int b02 = StringsKt.b0(this.f29096h, '/', this.f29089a.length() + 3, false, 4, null);
        String str = this.f29096h;
        int a4 = v82.a(b02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (b02 < a4) {
            int i4 = b02 + 1;
            int a5 = v82.a(this.f29096h, '/', i4, a4);
            String substring = this.f29096h.substring(i4, a5);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            arrayList.add(substring);
            b02 = a5;
        }
        return arrayList;
    }

    @Nullable
    public final String e() {
        if (this.f29094f == null) {
            return null;
        }
        int b02 = StringsKt.b0(this.f29096h, '?', 0, false, 6, null) + 1;
        String str = this.f29096h;
        String substring = this.f29096h.substring(b02, v82.a(str, '#', b02, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof mh0) && Intrinsics.areEqual(((mh0) obj).f29096h, this.f29096h);
    }

    @NotNull
    public final String f() {
        if (this.f29090b.length() == 0) {
            return "";
        }
        int length = this.f29089a.length() + 3;
        String str = this.f29096h;
        String substring = this.f29096h.substring(length, v82.a(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @NotNull
    public final String g() {
        return this.f29092d;
    }

    public final boolean h() {
        return this.f29097i;
    }

    public final int hashCode() {
        return this.f29096h.hashCode();
    }

    public final int i() {
        return this.f29093e;
    }

    @NotNull
    public final String j() {
        a aVar;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            aVar = new a().a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        Intrinsics.checkNotNull(aVar);
        return aVar.e().c().a().f29096h;
    }

    @NotNull
    public final String k() {
        return this.f29089a;
    }

    @NotNull
    public final URI l() {
        String substring;
        a aVar = new a();
        aVar.h(this.f29089a);
        aVar.f(f());
        aVar.e(b());
        aVar.g(this.f29092d);
        aVar.b(this.f29093e != b.a(this.f29089a) ? this.f29093e : -1);
        aVar.b().clear();
        aVar.b().addAll(d());
        aVar.a(e());
        if (this.f29095g == null) {
            substring = null;
        } else {
            substring = this.f29096h.substring(StringsKt.b0(this.f29096h, '#', 0, false, 6, null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        aVar.d(substring);
        String aVar2 = aVar.d().toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e4) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar2, ""));
                Intrinsics.checkNotNull(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    @NotNull
    public final URL m() {
        try {
            return new URL(this.f29096h);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    @NotNull
    public final String toString() {
        return this.f29096h;
    }
}
