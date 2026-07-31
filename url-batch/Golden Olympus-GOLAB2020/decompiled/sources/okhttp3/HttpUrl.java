package okhttp3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.cc;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.C3372e;

@Metadata
/* loaded from: classes3.dex */
public final class HttpUrl {

    /* renamed from: k, reason: collision with root package name */
    public static final Companion f42390k = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f42391l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final String f42392a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42393b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42394c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42395d;

    /* renamed from: e, reason: collision with root package name */
    private final int f42396e;

    /* renamed from: f, reason: collision with root package name */
    private final List f42397f;

    /* renamed from: g, reason: collision with root package name */
    private final List f42398g;

    /* renamed from: h, reason: collision with root package name */
    private final String f42399h;

    /* renamed from: i, reason: collision with root package name */
    private final String f42400i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f42401j;

    @Metadata
    public static final class Builder {

        /* renamed from: i, reason: collision with root package name */
        public static final Companion f42402i = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private String f42403a;

        /* renamed from: d, reason: collision with root package name */
        private String f42406d;

        /* renamed from: f, reason: collision with root package name */
        private final List f42408f;

        /* renamed from: g, reason: collision with root package name */
        private List f42409g;

        /* renamed from: h, reason: collision with root package name */
        private String f42410h;

        /* renamed from: b, reason: collision with root package name */
        private String f42404b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f42405c = "";

        /* renamed from: e, reason: collision with root package name */
        private int f42407e = -1;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String str, int i4, int i5) {
                int parseInt;
                try {
                    parseInt = Integer.parseInt(Companion.b(HttpUrl.f42390k, str, i4, i5, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > parseInt || parseInt >= 65536) {
                    return -1;
                }
                return parseInt;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String str, int i4, int i5) {
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

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String str, int i4, int i5) {
                if (i5 - i4 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i4);
                if ((Intrinsics.compare((int) charAt, 97) >= 0 && Intrinsics.compare((int) charAt, 122) <= 0) || (Intrinsics.compare((int) charAt, 65) >= 0 && Intrinsics.compare((int) charAt, 90) <= 0)) {
                    while (true) {
                        i4++;
                        if (i4 >= i5) {
                            break;
                        }
                        char charAt2 = str.charAt(i4);
                        if ('a' > charAt2 || charAt2 >= '{') {
                            if ('A' > charAt2 || charAt2 >= '[') {
                                if ('0' > charAt2 || charAt2 >= ':') {
                                    if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                        if (charAt2 == ':') {
                                            return i4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i4, int i5) {
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

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f42408f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i4 = this.f42407e;
            if (i4 != -1) {
                return i4;
            }
            Companion companion = HttpUrl.f42390k;
            String str = this.f42403a;
            Intrinsics.checkNotNull(str);
            return companion.c(str);
        }

        private final boolean f(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.w(str, "%2e", true);
        }

        private final boolean g(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.w(str, "%2e.", true) || StringsKt.w(str, ".%2e", true) || StringsKt.w(str, "%2e%2e", true);
        }

        private final void j() {
            if (((String) this.f42408f.remove(r0.size() - 1)).length() != 0 || this.f42408f.isEmpty()) {
                this.f42408f.add("");
            } else {
                this.f42408f.set(r0.size() - 1, "");
            }
        }

        private final void l(String str, int i4, int i5, boolean z4, boolean z5) {
            String b4 = Companion.b(HttpUrl.f42390k, str, i4, i5, " \"<>^`{}|/\\?#", z5, false, false, false, null, 240, null);
            if (f(b4)) {
                return;
            }
            if (g(b4)) {
                j();
                return;
            }
            if (((CharSequence) this.f42408f.get(r14.size() - 1)).length() == 0) {
                this.f42408f.set(r14.size() - 1, b4);
            } else {
                this.f42408f.add(b4);
            }
            if (z4) {
                this.f42408f.add("");
            }
        }

        private final void n(String str, int i4, int i5) {
            if (i4 == i5) {
                return;
            }
            char charAt = str.charAt(i4);
            if (charAt == '/' || charAt == '\\') {
                this.f42408f.clear();
                this.f42408f.add("");
                i4++;
            } else {
                List list = this.f42408f;
                list.set(list.size() - 1, "");
            }
            int i6 = i4;
            while (i6 < i5) {
                int p4 = Util.p(str, "/\\", i6, i5);
                boolean z4 = p4 < i5;
                String str2 = str;
                l(str2, i6, p4, z4, true);
                if (z4) {
                    i6 = p4 + 1;
                    str = str2;
                } else {
                    str = str2;
                    i6 = p4;
                }
            }
        }

        public final HttpUrl a() {
            ArrayList arrayList;
            String str = this.f42403a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.f42390k;
            String h4 = Companion.h(companion, this.f42404b, 0, 0, false, 7, null);
            String h5 = Companion.h(companion, this.f42405c, 0, 0, false, 7, null);
            String str2 = this.f42406d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int b4 = b();
            List list = this.f42408f;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.h(HttpUrl.f42390k, (String) it.next(), 0, 0, false, 7, null));
            }
            List list2 = this.f42409g;
            if (list2 != null) {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 != null ? Companion.h(HttpUrl.f42390k, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f42410h;
            return new HttpUrl(str, h4, h5, str2, b4, arrayList2, arrayList, str4 != null ? Companion.h(HttpUrl.f42390k, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder c(String str) {
            Companion companion;
            String b4;
            this.f42409g = (str == null || (b4 = Companion.b((companion = HttpUrl.f42390k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : companion.j(b4);
            return this;
        }

        public final List d() {
            return this.f42408f;
        }

        public final Builder e(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String e4 = HostnamesKt.e(Companion.h(HttpUrl.f42390k, host, 0, 0, false, 7, null));
            if (e4 != null) {
                this.f42406d = e4;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final Builder h(HttpUrl httpUrl, String str) {
            String str2;
            int p4;
            int i4;
            int i5;
            boolean z4;
            int i6;
            int i7;
            char c4;
            int i8;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int z5 = Util.z(input, 0, 0, 3, null);
            int B4 = Util.B(input, z5, 0, 2, null);
            Companion companion = f42402i;
            int g4 = companion.g(input, z5, B4);
            boolean z6 = true;
            char c5 = 65535;
            if (g4 != -1) {
                if (StringsKt.H(input, "https:", z5, true)) {
                    this.f42403a = "https";
                    z5 += 6;
                } else {
                    if (!StringsKt.H(input, "http:", z5, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, g4);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f42403a = "http";
                    z5 += 5;
                }
            } else {
                if (httpUrl == null) {
                    if (input.length() > 6) {
                        str2 = StringsKt.i1(input, 6) + "...";
                    } else {
                        str2 = input;
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f42403a = httpUrl.p();
            }
            int h4 = companion.h(input, z5, B4);
            char c6 = '?';
            char c7 = '#';
            if (h4 >= 2 || httpUrl == null || !Intrinsics.areEqual(httpUrl.p(), this.f42403a)) {
                int i9 = z5 + h4;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    p4 = Util.p(input, "@/\\?#", i9, B4);
                    char charAt = p4 != B4 ? input.charAt(p4) : c5;
                    if (charAt == c5 || charAt == c7 || charAt == '/' || charAt == '\\' || charAt == c6) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z7) {
                            i5 = B4;
                            z4 = z6;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f42405c);
                            sb2.append("%40");
                            input = str;
                            i6 = p4;
                            sb2.append(Companion.b(HttpUrl.f42390k, input, i9, p4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f42405c = sb2.toString();
                        } else {
                            int o4 = Util.o(input, ':', i9, p4);
                            Companion companion2 = HttpUrl.f42390k;
                            i5 = B4;
                            z4 = z6;
                            String b4 = Companion.b(companion2, input, i9, o4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z8) {
                                b4 = this.f42404b + "%40" + b4;
                            }
                            this.f42404b = b4;
                            if (o4 != p4) {
                                i7 = p4;
                                this.f42405c = Companion.b(companion2, str, o4 + 1, i7, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z7 = z4;
                            } else {
                                i7 = p4;
                            }
                            input = str;
                            i6 = i7;
                            z8 = z4;
                        }
                        i9 = i6 + 1;
                        B4 = i5;
                        z6 = z4;
                        c6 = '?';
                        c5 = 65535;
                        c7 = '#';
                    }
                }
                i4 = B4;
                Companion companion3 = f42402i;
                int f4 = companion3.f(input, i9, p4);
                int i10 = f4 + 1;
                if (i10 < p4) {
                    this.f42406d = HostnamesKt.e(Companion.h(HttpUrl.f42390k, input, i9, f4, false, 4, null));
                    int e4 = companion3.e(input, i10, p4);
                    this.f42407e = e4;
                    if (e4 == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String substring2 = input.substring(i10, p4);
                        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(substring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.f42390k;
                    this.f42406d = HostnamesKt.e(Companion.h(companion4, input, i9, f4, false, 4, null));
                    String str3 = this.f42403a;
                    Intrinsics.checkNotNull(str3);
                    this.f42407e = companion4.c(str3);
                }
                if (this.f42406d == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String substring3 = input.substring(i9, f4);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(substring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                z5 = p4;
            } else {
                this.f42404b = httpUrl.g();
                this.f42405c = httpUrl.c();
                this.f42406d = httpUrl.h();
                this.f42407e = httpUrl.l();
                this.f42408f.clear();
                this.f42408f.addAll(httpUrl.e());
                if (z5 == B4 || input.charAt(z5) == '#') {
                    c(httpUrl.f());
                }
                i4 = B4;
            }
            int i11 = i4;
            int p5 = Util.p(input, "?#", z5, i11);
            n(input, z5, p5);
            if (p5 >= i11 || input.charAt(p5) != '?') {
                c4 = '#';
                i8 = p5;
            } else {
                c4 = '#';
                int o5 = Util.o(input, '#', p5, i11);
                Companion companion5 = HttpUrl.f42390k;
                this.f42409g = companion5.j(Companion.b(companion5, input, p5 + 1, o5, " \"'<>#", true, false, true, false, null, 208, null));
                i8 = o5;
            }
            if (i8 < i11 && input.charAt(i8) == c4) {
                this.f42410h = Companion.b(HttpUrl.f42390k, input, i8 + 1, i11, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder i(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.f42405c = Companion.b(HttpUrl.f42390k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder k(int i4) {
            if (1 <= i4 && i4 < 65536) {
                this.f42407e = i4;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i4).toString());
        }

        public final Builder m() {
            String str = this.f42406d;
            this.f42406d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f42408f.size();
            for (int i4 = 0; i4 < size; i4++) {
                List list = this.f42408f;
                list.set(i4, Companion.b(HttpUrl.f42390k, (String) list.get(i4), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List list2 = this.f42409g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = (String) list2.get(i5);
                    list2.set(i5, str2 != null ? Companion.b(HttpUrl.f42390k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.f42410h;
            this.f42410h = str3 != null ? Companion.b(HttpUrl.f42390k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder o(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.w(scheme, "http", true)) {
                this.f42403a = "http";
                return this;
            }
            if (StringsKt.w(scheme, "https", true)) {
                this.f42403a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public final void p(String str) {
            this.f42410h = str;
        }

        public final void q(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f42405c = str;
        }

        public final void r(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f42404b = str;
        }

        public final void s(String str) {
            this.f42406d = str;
        }

        public final void t(int i4) {
            this.f42407e = i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
        
            if (r1 != r4.c(r3)) goto L29;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f42403a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.f42404b.length() > 0 || this.f42405c.length() > 0) {
                sb.append(this.f42404b);
                if (this.f42405c.length() > 0) {
                    sb.append(':');
                    sb.append(this.f42405c);
                }
                sb.append('@');
            }
            String str2 = this.f42406d;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt.O(str2, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.f42406d);
                    sb.append(']');
                } else {
                    sb.append(this.f42406d);
                }
            }
            if (this.f42407e != -1 || this.f42403a != null) {
                int b4 = b();
                String str3 = this.f42403a;
                if (str3 != null) {
                    Companion companion = HttpUrl.f42390k;
                    Intrinsics.checkNotNull(str3);
                }
                sb.append(':');
                sb.append(b4);
            }
            Companion companion2 = HttpUrl.f42390k;
            companion2.i(this.f42408f, sb);
            if (this.f42409g != null) {
                sb.append('?');
                List list = this.f42409g;
                Intrinsics.checkNotNull(list);
                companion2.k(list, sb);
            }
            if (this.f42410h != null) {
                sb.append('#');
                sb.append(this.f42410h);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }

        public final void u(String str) {
            this.f42403a = str;
        }

        public final Builder v(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.f42404b = Companion.b(HttpUrl.f42390k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(Companion companion, String str, int i4, int i5, String str2, boolean z4, boolean z5, boolean z6, boolean z7, Charset charset, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 8) != 0) {
                z4 = false;
            }
            if ((i6 & 16) != 0) {
                z5 = false;
            }
            if ((i6 & 32) != 0) {
                z6 = false;
            }
            if ((i6 & 64) != 0) {
                z7 = false;
            }
            if ((i6 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                charset = null;
            }
            return companion.a(str, i4, i5, str2, z4, z5, z6, z7, charset);
        }

        private final boolean e(String str, int i4, int i5) {
            int i6 = i4 + 2;
            return i6 < i5 && str.charAt(i4) == '%' && Util.H(str.charAt(i4 + 1)) != -1 && Util.H(str.charAt(i6)) != -1;
        }

        public static /* synthetic */ String h(Companion companion, String str, int i4, int i5, boolean z4, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 4) != 0) {
                z4 = false;
            }
            return companion.g(str, i4, i5, z4);
        }

        private final void l(C3372e c3372e, String str, int i4, int i5, String str2, boolean z4, boolean z5, boolean z6, boolean z7, Charset charset) {
            int i6 = i4;
            C3372e c3372e2 = null;
            while (i6 < i5) {
                int codePointAt = str.codePointAt(i6);
                if (!z4 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                    if (codePointAt == 43 && z6) {
                        c3372e.C(z4 ? "+" : "%2B");
                    } else {
                        if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z7)) {
                            if (!StringsKt.O(str2, (char) codePointAt, false, 2, null) && (codePointAt != 37 || (z4 && (!z5 || e(str, i6, i5))))) {
                                c3372e.B0(codePointAt);
                                i6 += Character.charCount(codePointAt);
                            }
                        }
                        if (c3372e2 == null) {
                            c3372e2 = new C3372e();
                        }
                        if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                            c3372e2.B0(codePointAt);
                        } else {
                            c3372e2.y0(str, i6, Character.charCount(codePointAt) + i6, charset);
                        }
                        while (!c3372e2.v()) {
                            byte readByte = c3372e2.readByte();
                            c3372e.w(37);
                            c3372e.w(HttpUrl.f42391l[((readByte & 255) >> 4) & 15]);
                            c3372e.w(HttpUrl.f42391l[readByte & 15]);
                        }
                        i6 += Character.charCount(codePointAt);
                    }
                }
                i6 += Character.charCount(codePointAt);
            }
        }

        private final void m(C3372e c3372e, String str, int i4, int i5, boolean z4) {
            int i6;
            while (i4 < i5) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt != 37 || (i6 = i4 + 2) >= i5) {
                    if (codePointAt == 43 && z4) {
                        c3372e.w(32);
                        i4++;
                    }
                    c3372e.B0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                } else {
                    int H3 = Util.H(str.charAt(i4 + 1));
                    int H4 = Util.H(str.charAt(i6));
                    if (H3 != -1 && H4 != -1) {
                        c3372e.w((H3 << 4) + H4);
                        i4 = Character.charCount(codePointAt) + i6;
                    }
                    c3372e.B0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
            }
        }

        public final String a(String str, int i4, int i5, String encodeSet, boolean z4, boolean z5, boolean z6, boolean z7, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i6 = i4;
            while (i6 < i5) {
                int codePointAt = str.codePointAt(i6);
                if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z7) || StringsKt.O(encodeSet, (char) codePointAt, false, 2, null) || ((codePointAt == 37 && (!z4 || (z5 && !e(str, i6, i5)))) || (codePointAt == 43 && z6)))) {
                    C3372e c3372e = new C3372e();
                    c3372e.A0(str, i4, i6);
                    l(c3372e, str, i6, i5, encodeSet, z4, z5, z6, z7, charset);
                    return c3372e.i0();
                }
                i6 += Character.charCount(codePointAt);
            }
            String substring = str.substring(i4, i5);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public final HttpUrl d(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new Builder().h(null, str).a();
        }

        public final HttpUrl f(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i4, int i5, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i6 = i4; i6 < i5; i6++) {
                char charAt = str.charAt(i6);
                if (charAt == '%' || (charAt == '+' && z4)) {
                    C3372e c3372e = new C3372e();
                    c3372e.A0(str, i4, i6);
                    m(c3372e, str, i6, i5, z4);
                    return c3372e.i0();
                }
            }
            String substring = str.substring(i4, i5);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                out.append('/');
                out.append((String) list.get(i4));
            }
        }

        public final List j(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= str.length()) {
                String str2 = str;
                int b02 = StringsKt.b0(str2, '&', i4, false, 4, null);
                if (b02 == -1) {
                    b02 = str2.length();
                }
                int b03 = StringsKt.b0(str2, cc.f15727T, i4, false, 4, null);
                if (b03 == -1 || b03 > b02) {
                    String substring = str2.substring(i4, b02);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str2.substring(i4, b03);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str2.substring(b03 + 1, b02);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i4 = b02 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void k(List list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            d o4 = g.o(g.p(0, list.size()), 2);
            int b4 = o4.b();
            int d4 = o4.d();
            int e4 = o4.e();
            if ((e4 <= 0 || b4 > d4) && (e4 >= 0 || d4 > b4)) {
                return;
            }
            while (true) {
                String str = (String) list.get(b4);
                String str2 = (String) list.get(b4 + 1);
                if (b4 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append(cc.f15727T);
                    out.append(str2);
                }
                if (b4 == d4) {
                    return;
                } else {
                    b4 += e4;
                }
            }
        }

        private Companion() {
        }
    }

    public HttpUrl(String scheme, String username, String password, String host, int i4, List pathSegments, List list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f42392a = scheme;
        this.f42393b = username;
        this.f42394c = password;
        this.f42395d = host;
        this.f42396e = i4;
        this.f42397f = pathSegments;
        this.f42398g = list;
        this.f42399h = str;
        this.f42400i = url;
        this.f42401j = Intrinsics.areEqual(scheme, "https");
    }

    public final String b() {
        if (this.f42399h == null) {
            return null;
        }
        String substring = this.f42400i.substring(StringsKt.b0(this.f42400i, '#', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f42394c.length() == 0) {
            return "";
        }
        String substring = this.f42400i.substring(StringsKt.b0(this.f42400i, ':', this.f42392a.length() + 3, false, 4, null) + 1, StringsKt.b0(this.f42400i, '@', 0, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int b02 = StringsKt.b0(this.f42400i, '/', this.f42392a.length() + 3, false, 4, null);
        String str = this.f42400i;
        String substring = this.f42400i.substring(b02, Util.p(str, "?#", b02, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List e() {
        int b02 = StringsKt.b0(this.f42400i, '/', this.f42392a.length() + 3, false, 4, null);
        String str = this.f42400i;
        int p4 = Util.p(str, "?#", b02, str.length());
        ArrayList arrayList = new ArrayList();
        while (b02 < p4) {
            int i4 = b02 + 1;
            int o4 = Util.o(this.f42400i, '/', i4, p4);
            String substring = this.f42400i.substring(i4, o4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            b02 = o4;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) obj).f42400i, this.f42400i);
    }

    public final String f() {
        if (this.f42398g == null) {
            return null;
        }
        int b02 = StringsKt.b0(this.f42400i, '?', 0, false, 6, null) + 1;
        String str = this.f42400i;
        String substring = this.f42400i.substring(b02, Util.o(str, '#', b02, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f42393b.length() == 0) {
            return "";
        }
        int length = this.f42392a.length() + 3;
        String str = this.f42400i;
        String substring = this.f42400i.substring(length, Util.p(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String h() {
        return this.f42395d;
    }

    public int hashCode() {
        return this.f42400i.hashCode();
    }

    public final boolean i() {
        return this.f42401j;
    }

    public final Builder j() {
        Builder builder = new Builder();
        builder.u(this.f42392a);
        builder.r(g());
        builder.q(c());
        builder.s(this.f42395d);
        builder.t(this.f42396e != f42390k.c(this.f42392a) ? this.f42396e : -1);
        builder.d().clear();
        builder.d().addAll(e());
        builder.c(f());
        builder.p(b());
        return builder;
    }

    public final Builder k(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new Builder().h(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int l() {
        return this.f42396e;
    }

    public final String m() {
        if (this.f42398g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f42390k.k(this.f42398g, sb);
        return sb.toString();
    }

    public final String n() {
        Builder k4 = k("/...");
        Intrinsics.checkNotNull(k4);
        return k4.v("").i("").a().toString();
    }

    public final HttpUrl o(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Builder k4 = k(link);
        if (k4 != null) {
            return k4.a();
        }
        return null;
    }

    public final String p() {
        return this.f42392a;
    }

    public final URI q() {
        String builder = j().m().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e4) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                Intrinsics.checkNotNullExpressionValue(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final URL r() {
        try {
            return new URL(this.f42400i);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public String toString() {
        return this.f42400i;
    }
}
