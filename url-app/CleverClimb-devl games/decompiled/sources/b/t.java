package b;

import com.mopub.common.Constants;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpUrl.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f2130d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f2131a;

    /* renamed from: b, reason: collision with root package name */
    final String f2132b;

    /* renamed from: c, reason: collision with root package name */
    final int f2133c;
    private final String e;
    private final String f;
    private final List<String> g;
    private final List<String> h;
    private final String i;
    private final String j;

    static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return (c2 - 'a') + 10;
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return (c2 - 'A') + 10;
    }

    t(a aVar) {
        this.f2131a = aVar.f2134a;
        this.e = a(aVar.f2135b, false);
        this.f = a(aVar.f2136c, false);
        this.f2132b = aVar.f2137d;
        this.f2133c = aVar.a();
        this.g = a(aVar.f, false);
        this.h = aVar.g != null ? a(aVar.g, true) : null;
        this.i = aVar.h != null ? a(aVar.h, false) : null;
        this.j = aVar.toString();
    }

    public URI a() {
        String aVar = o().b().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String b() {
        return this.f2131a;
    }

    public boolean c() {
        return this.f2131a.equals(Constants.HTTPS);
    }

    public String d() {
        if (this.e.isEmpty()) {
            return "";
        }
        int length = this.f2131a.length() + 3;
        return this.j.substring(length, b.a.c.a(this.j, length, this.j.length(), ":@"));
    }

    public String e() {
        if (this.f.isEmpty()) {
            return "";
        }
        return this.j.substring(this.j.indexOf(58, this.f2131a.length() + 3) + 1, this.j.indexOf(64));
    }

    public String f() {
        return this.f2132b;
    }

    public int g() {
        return this.f2133c;
    }

    public static int a(String str) {
        if (str.equals(Constants.HTTP)) {
            return 80;
        }
        return str.equals(Constants.HTTPS) ? 443 : -1;
    }

    public String h() {
        int indexOf = this.j.indexOf(47, this.f2131a.length() + 3);
        return this.j.substring(indexOf, b.a.c.a(this.j, indexOf, this.j.length(), "?#"));
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public List<String> i() {
        int indexOf = this.j.indexOf(47, this.f2131a.length() + 3);
        int a2 = b.a.c.a(this.j, indexOf, this.j.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = b.a.c.a(this.j, i, a2, '/');
            arrayList.add(this.j.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public List<String> j() {
        return this.g;
    }

    public String k() {
        if (this.h == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        return this.j.substring(indexOf, b.a.c.a(this.j, indexOf + 1, this.j.length(), '#'));
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public String l() {
        if (this.h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b(sb, this.h);
        return sb.toString();
    }

    public String m() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    public String n() {
        return d("/...").b("").c("").c().toString();
    }

    public t c(String str) {
        a d2 = d(str);
        if (d2 != null) {
            return d2.c();
        }
        return null;
    }

    public a o() {
        a aVar = new a();
        aVar.f2134a = this.f2131a;
        aVar.f2135b = d();
        aVar.f2136c = e();
        aVar.f2137d = this.f2132b;
        aVar.e = this.f2133c != a(this.f2131a) ? this.f2133c : -1;
        aVar.f.clear();
        aVar.f.addAll(i());
        aVar.e(k());
        aVar.h = m();
        return aVar;
    }

    public a d(String str) {
        a aVar = new a();
        if (aVar.a(this, str) == a.EnumC0017a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public static t e(String str) {
        a aVar = new a();
        if (aVar.a((t) null, str) == a.EnumC0017a.SUCCESS) {
            return aVar.c();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && ((t) obj).j.equals(this.j);
    }

    public int hashCode() {
        return this.j.hashCode();
    }

    public String toString() {
        return this.j;
    }

    /* compiled from: HttpUrl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f2134a;

        /* renamed from: d, reason: collision with root package name */
        String f2137d;
        List<String> g;
        String h;

        /* renamed from: b, reason: collision with root package name */
        String f2135b = "";

        /* renamed from: c, reason: collision with root package name */
        String f2136c = "";
        int e = -1;
        final List<String> f = new ArrayList();

        /* compiled from: HttpUrl.java */
        /* renamed from: b.t$a$a, reason: collision with other inner class name */
        enum EnumC0017a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            this.f.add("");
        }

        public a a(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase(Constants.HTTP)) {
                this.f2134a = Constants.HTTP;
            } else if (str.equalsIgnoreCase(Constants.HTTPS)) {
                this.f2134a = Constants.HTTPS;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f2135b = t.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a c(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f2136c = t.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a d(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String e = e(str, 0, str.length());
            if (e == null) {
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            this.f2137d = e;
            return this;
        }

        public a a(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.e = i;
            return this;
        }

        int a() {
            return this.e != -1 ? this.e : t.a(this.f2134a);
        }

        public a e(String str) {
            this.g = str != null ? t.b(t.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(t.a(str, " \"'<>#&=", false, false, true, true));
            this.g.add(str2 != null ? t.a(str2, " \"'<>#&=", false, false, true, true) : null);
            return this;
        }

        public a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(t.a(str, " \"'<>#&=", true, false, true, true));
            this.g.add(str2 != null ? t.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        a b() {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.set(i, t.a(this.f.get(i), "[]", true, true, false, true));
            }
            if (this.g != null) {
                int size2 = this.g.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, t.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            if (this.h != null) {
                this.h = t.a(this.h, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public t c() {
            if (this.f2134a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f2137d == null) {
                throw new IllegalStateException("host == null");
            }
            return new t(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2134a);
            sb.append("://");
            if (!this.f2135b.isEmpty() || !this.f2136c.isEmpty()) {
                sb.append(this.f2135b);
                if (!this.f2136c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f2136c);
                }
                sb.append('@');
            }
            if (this.f2137d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f2137d);
                sb.append(']');
            } else {
                sb.append(this.f2137d);
            }
            int a2 = a();
            if (a2 != t.a(this.f2134a)) {
                sb.append(':');
                sb.append(a2);
            }
            t.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                t.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        EnumC0017a a(t tVar, String str) {
            int a2;
            int i;
            int i2;
            int a3 = b.a.c.a(str, 0, str.length());
            int b2 = b.a.c.b(str, a3, str.length());
            if (b(str, a3, b2) != -1) {
                if (str.regionMatches(true, a3, "https:", 0, 6)) {
                    this.f2134a = Constants.HTTPS;
                    a3 += "https:".length();
                } else if (str.regionMatches(true, a3, "http:", 0, 5)) {
                    this.f2134a = Constants.HTTP;
                    a3 += "http:".length();
                } else {
                    return EnumC0017a.UNSUPPORTED_SCHEME;
                }
            } else if (tVar != null) {
                this.f2134a = tVar.f2131a;
            } else {
                return EnumC0017a.MISSING_SCHEME;
            }
            int c2 = c(str, a3, b2);
            char c3 = '#';
            if (c2 >= 2 || tVar == null || !tVar.f2131a.equals(this.f2134a)) {
                int i3 = a3 + c2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = b.a.c.a(str, i3, b2, "@/\\?#");
                    char charAt = a2 != b2 ? str.charAt(a2) : (char) 65535;
                    if (charAt != 65535 && charAt != c3 && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case '?':
                                break;
                            case '@':
                                if (!z) {
                                    int a4 = b.a.c.a(str, i3, a2, ':');
                                    i2 = a2;
                                    String a5 = t.a(str, i3, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    if (z2) {
                                        a5 = this.f2135b + "%40" + a5;
                                    }
                                    this.f2135b = a5;
                                    if (a4 != i2) {
                                        this.f2136c = t.a(str, a4 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                        z = true;
                                    }
                                    z2 = true;
                                } else {
                                    i2 = a2;
                                    this.f2136c += "%40" + t.a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                }
                                i3 = i2 + 1;
                                continue;
                                c3 = '#';
                            default:
                                c3 = '#';
                        }
                    }
                }
                i = a2;
                int d2 = d(str, i3, i);
                int i4 = d2 + 1;
                if (i4 < i) {
                    this.f2137d = e(str, i3, d2);
                    this.e = g(str, i4, i);
                    if (this.e == -1) {
                        return EnumC0017a.INVALID_PORT;
                    }
                } else {
                    this.f2137d = e(str, i3, d2);
                    this.e = t.a(this.f2134a);
                }
                if (this.f2137d == null) {
                    return EnumC0017a.INVALID_HOST;
                }
            } else {
                this.f2135b = tVar.d();
                this.f2136c = tVar.e();
                this.f2137d = tVar.f2132b;
                this.e = tVar.f2133c;
                this.f.clear();
                this.f.addAll(tVar.i());
                if (a3 == b2 || str.charAt(a3) == '#') {
                    e(tVar.k());
                }
                i = a3;
            }
            int a6 = b.a.c.a(str, i, b2, "?#");
            a(str, i, a6);
            if (a6 < b2 && str.charAt(a6) == '?') {
                int a7 = b.a.c.a(str, a6, b2, '#');
                this.g = t.b(t.a(str, a6 + 1, a7, " \"'<>#", true, false, true, true));
                a6 = a7;
            }
            if (a6 < b2 && str.charAt(a6) == '#') {
                this.h = t.a(str, 1 + a6, b2, "", true, false, false, false);
            }
            return EnumC0017a.SUCCESS;
        }

        private void a(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.f.clear();
                this.f.add("");
                i++;
            } else {
                this.f.set(this.f.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = b.a.c.a(str, i3, i2, "/\\");
                boolean z = i < i2;
                a(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void a(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = t.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true);
            if (f(a2)) {
                return;
            }
            if (g(a2)) {
                d();
                return;
            }
            if (this.f.get(this.f.size() - 1).isEmpty()) {
                this.f.set(this.f.size() - 1, a2);
            } else {
                this.f.add(a2);
            }
            if (z) {
                this.f.add("");
            }
        }

        private boolean f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void d() {
            if (this.f.remove(this.f.size() - 1).isEmpty() && !this.f.isEmpty()) {
                this.f.set(this.f.size() - 1, "");
            } else {
                this.f.add("");
            }
        }

        private static int b(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return -1;
            }
            while (true) {
                i++;
                if (i >= i2) {
                    return -1;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 < 'a' || charAt2 > 'z') {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                if (charAt2 == ':') {
                                    return i;
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }

        private static int c(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int d(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String e(String str, int i, int i2) {
            InetAddress f;
            String a2 = t.a(str, i, i2, false);
            if (a2.contains(":")) {
                if (a2.startsWith("[") && a2.endsWith("]")) {
                    f = f(a2, 1, a2.length() - 1);
                } else {
                    f = f(a2, 0, a2.length());
                }
                if (f == null) {
                    return null;
                }
                byte[] address = f.getAddress();
                if (address.length == 16) {
                    return a(address);
                }
                throw new AssertionError();
            }
            return b.a.c.a(a2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static InetAddress f(String str, int i, int i2) {
            int i3;
            byte[] bArr = new byte[16];
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            while (true) {
                if (i < i2) {
                    if (i4 != bArr.length) {
                        int i7 = i + 2;
                        if (i7 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                            if (i5 == -1) {
                                i4 += 2;
                                if (i7 != i2) {
                                    i5 = i4;
                                    i6 = i7;
                                    i = i6;
                                    int i8 = 0;
                                    while (i < i2) {
                                    }
                                    i3 = i - i6;
                                    if (i3 == 0) {
                                        break;
                                    }
                                    break;
                                }
                                i5 = i4;
                                break;
                            }
                            return null;
                        }
                        if (i4 != 0) {
                            if (str.regionMatches(i, ":", 0, 1)) {
                                i++;
                            } else {
                                if (!str.regionMatches(i, ".", 0, 1) || !a(str, i6, i2, bArr, i4 - 2)) {
                                    return null;
                                }
                                i4 += 2;
                            }
                        }
                        i6 = i;
                        i = i6;
                        int i82 = 0;
                        while (i < i2) {
                            int a2 = t.a(str.charAt(i));
                            if (a2 == -1) {
                                break;
                            }
                            i82 = (i82 << 4) + a2;
                            i++;
                        }
                        i3 = i - i6;
                        if (i3 == 0 || i3 > 4) {
                            break;
                        }
                        int i9 = i4 + 1;
                        bArr[i4] = (byte) ((i82 >>> 8) & 255);
                        i4 = i9 + 1;
                        bArr[i9] = (byte) (i82 & 255);
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            if (i4 != bArr.length) {
                if (i5 == -1) {
                    return null;
                }
                int i10 = i4 - i5;
                System.arraycopy(bArr, i5, bArr, bArr.length - i10, i10);
                Arrays.fill(bArr, i5, (bArr.length - i4) + i5, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        private static boolean a(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    i5++;
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        private static String a(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            while (i2 < bArr.length) {
                int i5 = i2;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i2;
                if (i6 > i3 && i6 >= 4) {
                    i4 = i2;
                    i3 = i6;
                }
                i2 = i5 + 2;
            }
            c.c cVar = new c.c();
            while (i < bArr.length) {
                if (i == i4) {
                    cVar.i(58);
                    i += i3;
                    if (i == 16) {
                        cVar.i(58);
                    }
                } else {
                    if (i > 0) {
                        cVar.i(58);
                    }
                    cVar.k(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return cVar.p();
        }

        private static int g(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(t.a(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                c.c cVar = new c.c();
                cVar.a(str, i, i3);
                a(cVar, str, i3, i2, z);
                return cVar.p();
            }
        }
        return str.substring(i, i2);
    }

    static void a(c.c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a2 = a(str.charAt(i + 1));
                int a3 = a(str.charAt(i3));
                if (a2 != -1 && a3 != -1) {
                    cVar.i((a2 << 4) + a3);
                    i = i3;
                }
                cVar.a(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    cVar.i(32);
                }
                cVar.a(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && a(str.charAt(i + 1)) != -1 && a(str.charAt(i3)) != -1;
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z4)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i3, i2)))) && (codePointAt != 43 || !z3))) {
                    i3 += Character.charCount(codePointAt);
                }
            }
            c.c cVar = new c.c();
            cVar.a(str, i, i3);
            a(cVar, str, i3, i2, str2, z, z2, z3, z4);
            return cVar.p();
        }
        return str.substring(i, i2);
    }

    static void a(c.c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        c.c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.b(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new c.c();
                    }
                    cVar2.a(codePointAt);
                    while (!cVar2.f()) {
                        int i3 = cVar2.i() & 255;
                        cVar.i(37);
                        cVar.i((int) f2130d[(i3 >> 4) & 15]);
                        cVar.i((int) f2130d[i3 & 15]);
                    }
                } else {
                    cVar.a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4);
    }
}
