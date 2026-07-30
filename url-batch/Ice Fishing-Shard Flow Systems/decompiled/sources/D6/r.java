package D6;

import j6.C0588e;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f554a;

    /* renamed from: d, reason: collision with root package name */
    public String f557d;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f560g;

    /* renamed from: h, reason: collision with root package name */
    public String f561h;

    /* renamed from: b, reason: collision with root package name */
    public String f555b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f556c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f558e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f559f = kotlin.collections.r.e("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int x7 = StringsKt.x(str, '&', i2, 4);
            if (x7 == -1) {
                x7 = str.length();
            }
            int x8 = StringsKt.x(str, '=', i2, 4);
            if (x8 == -1 || x8 > x7) {
                String substring = str.substring(i2, x7);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i2, x8);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(x8 + 1, x7);
                Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i2 = x7 + 1;
        }
        return arrayList;
    }

    public final s a() {
        ArrayList arrayList;
        String str = this.f554a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String c7 = S6.a.c(0, 0, 7, this.f555b);
        String c8 = S6.a.c(0, 0, 7, this.f556c);
        String str2 = this.f557d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b7 = b();
        ArrayList arrayList2 = this.f559f;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.s.g(arrayList2, 10));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList3.add(S6.a.c(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = this.f560g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(kotlin.collections.s.g(arrayList4, 10));
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? S6.a.c(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f561h;
        return new s(str, c7, c8, str2, b7, arrayList, str4 != null ? S6.a.c(0, 0, 7, str4) : null, toString());
    }

    public final int b() {
        int i2 = this.f558e;
        if (i2 != -1) {
            return i2;
        }
        String scheme = this.f554a;
        Intrinsics.b(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.a(scheme, "http")) {
            return 80;
        }
        return Intrinsics.a(scheme, "https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x020c, code lost:
    
        if (r7 < 65536) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0077, code lost:
    
        if (r13 == ':') goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(s sVar, String input) {
        int i2;
        int i5;
        int i7;
        int i8;
        int c7;
        char charAt;
        int i9;
        int i10;
        int i11;
        String a7;
        char charAt2;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = E6.c.f709a;
        int f7 = E6.c.f(input, 0, input.length());
        int g7 = E6.c.g(input, f7, input.length());
        if (g7 - f7 >= 2) {
            char charAt3 = input.charAt(f7);
            if ((Intrinsics.d(charAt3, 97) >= 0 && Intrinsics.d(charAt3, 122) <= 0) || (Intrinsics.d(charAt3, 65) >= 0 && Intrinsics.d(charAt3, 90) <= 0)) {
                i2 = f7 + 1;
                while (true) {
                    if (i2 >= g7) {
                        break;
                    }
                    char charAt4 = input.charAt(i2);
                    if (('a' <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i2++;
                    }
                }
                if (i2 != -1) {
                    if (sVar == null) {
                        throw new IllegalArgumentException(r4.f.i("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? kotlin.text.t.s(6, input) + "..." : input));
                    }
                    this.f554a = sVar.f562a;
                } else if (kotlin.text.p.k(input, f7, "https:", true)) {
                    this.f554a = "https";
                    f7 += 6;
                } else {
                    if (!kotlin.text.p.k(input, f7, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, i2);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        sb.append(substring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.f554a = "http";
                    f7 += 5;
                }
                i7 = 0;
                for (i5 = f7; i5 < g7 && ((charAt2 = input.charAt(i5)) == '/' || charAt2 == '\\'); i5++) {
                    i7++;
                }
                ArrayList arrayList = this.f559f;
                char c8 = '#';
                if (i7 < 2 || sVar == null || !Intrinsics.a(sVar.f562a, this.f554a)) {
                    i8 = f7 + i7;
                    boolean z7 = false;
                    boolean z8 = false;
                    while (true) {
                        c7 = E6.c.c(input, "@/\\?#", i8, g7);
                        charAt = c7 == g7 ? input.charAt(c7) : (char) 65535;
                        if (charAt != 65535 || charAt == c8 || charAt == '/' || charAt == '\\' || charAt == '?') {
                            break;
                        }
                        if (charAt == '@') {
                            if (z7) {
                                this.f556c += "%40" + S6.a.a(input, i8, c7, " \"':;<=>@[]^`{}|/\\?#", 112);
                                z7 = z7;
                            } else {
                                boolean z9 = z7;
                                int b7 = E6.c.b(input, ':', i8, c7);
                                String a8 = S6.a.a(input, i8, b7, " \"':;<=>@[]^`{}|/\\?#", 112);
                                if (z8) {
                                    a8 = this.f555b + "%40" + a8;
                                }
                                this.f555b = a8;
                                if (b7 != c7) {
                                    this.f556c = S6.a.a(input, b7 + 1, c7, " \"':;<=>@[]^`{}|/\\?#", 112);
                                    z7 = true;
                                } else {
                                    z7 = z9;
                                }
                                z8 = true;
                            }
                            i8 = c7 + 1;
                            c8 = '#';
                        }
                    }
                    i9 = i8;
                    while (true) {
                        if (i9 >= c7) {
                            i9 = c7;
                            break;
                        }
                        char charAt5 = input.charAt(i9);
                        if (charAt5 == ':') {
                            break;
                        }
                        if (charAt5 == '[') {
                            do {
                                i9++;
                                if (i9 < c7) {
                                }
                            } while (input.charAt(i9) != ']');
                        }
                        i9++;
                    }
                    i10 = i9 + 1;
                    if (i10 >= c7) {
                        this.f557d = E6.b.b(S6.a.c(i8, i9, 4, input));
                        try {
                            i11 = Integer.parseInt(S6.a.a(input, i10, c7, "", 120));
                            if (1 <= i11) {
                            }
                        } catch (NumberFormatException unused) {
                        }
                        i11 = -1;
                        this.f558e = i11;
                        if (i11 == -1) {
                            StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                            String substring2 = input.substring(i10, c7);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            sb2.append(substring2);
                            sb2.append('\"');
                            throw new IllegalArgumentException(sb2.toString().toString());
                        }
                    } else {
                        this.f557d = E6.b.b(S6.a.c(i8, i9, 4, input));
                        String scheme = this.f554a;
                        Intrinsics.b(scheme);
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        this.f558e = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
                    }
                    if (this.f557d != null) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                        String substring3 = input.substring(i8, i9);
                        Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                        sb3.append(substring3);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    f7 = c7;
                } else {
                    this.f555b = sVar.e();
                    this.f556c = sVar.a();
                    this.f557d = sVar.f565d;
                    this.f558e = sVar.f566e;
                    arrayList.clear();
                    arrayList.addAll(sVar.c());
                    if (f7 == g7 || input.charAt(f7) == '#') {
                        String d7 = sVar.d();
                        this.f560g = (d7 == null || (a7 = S6.a.a(d7, 0, 0, " \"'<>#", 83)) == null) ? null : d(a7);
                    }
                }
                int c9 = E6.c.c(input, "?#", f7, g7);
                if (f7 != c9) {
                    char charAt6 = input.charAt(f7);
                    if (charAt6 == '/' || charAt6 == '\\') {
                        arrayList.clear();
                        arrayList.add("");
                        f7++;
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                    while (f7 < c9) {
                        int c10 = E6.c.c(input, "/\\", f7, c9);
                        boolean z10 = c10 < c9;
                        String a9 = S6.a.a(input, f7, c10, " \"<>^`{}|/\\?#", 112);
                        if (!Intrinsics.a(a9, ".") && !kotlin.text.p.g(a9, "%2e")) {
                            if (!Intrinsics.a(a9, "..") && !kotlin.text.p.g(a9, "%2e.") && !kotlin.text.p.g(a9, ".%2e") && !kotlin.text.p.g(a9, "%2e%2e")) {
                                if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                                    arrayList.set(arrayList.size() - 1, a9);
                                } else {
                                    arrayList.add(a9);
                                }
                                if (z10) {
                                    arrayList.add("");
                                }
                            } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                                arrayList.add("");
                            } else {
                                arrayList.set(arrayList.size() - 1, "");
                            }
                        }
                        f7 = z10 ? c10 + 1 : c10;
                    }
                }
                if (c9 < g7 && input.charAt(c9) == '?') {
                    int b8 = E6.c.b(input, '#', c9, g7);
                    this.f560g = d(S6.a.a(input, c9 + 1, b8, " \"'<>#", 80));
                    c9 = b8;
                }
                if (c9 >= g7 || input.charAt(c9) != '#') {
                    return;
                }
                this.f561h = S6.a.a(input, c9 + 1, g7, "", 48);
                return;
            }
        }
        i2 = -1;
        if (i2 != -1) {
        }
        i7 = 0;
        while (i5 < g7) {
            i7++;
        }
        ArrayList arrayList2 = this.f559f;
        char c82 = '#';
        if (i7 < 2) {
        }
        i8 = f7 + i7;
        boolean z72 = false;
        boolean z82 = false;
        while (true) {
            c7 = E6.c.c(input, "@/\\?#", i8, g7);
            if (c7 == g7) {
            }
            if (charAt != 65535) {
                break;
            } else {
                break;
            }
        }
        i9 = i8;
        while (true) {
            if (i9 >= c7) {
            }
            i9++;
        }
        i10 = i9 + 1;
        if (i10 >= c7) {
        }
        if (this.f557d != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f554a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f555b.length() > 0 || this.f556c.length() > 0) {
            sb.append(this.f555b);
            if (this.f556c.length() > 0) {
                sb.append(':');
                sb.append(this.f556c);
            }
            sb.append('@');
        }
        String str2 = this.f557d;
        if (str2 != null) {
            if (StringsKt.v(str2, ':')) {
                sb.append('[');
                sb.append(this.f557d);
                sb.append(']');
            } else {
                sb.append(this.f557d);
            }
        }
        int i2 = -1;
        if (this.f558e != -1 || this.f554a != null) {
            int b7 = b();
            String scheme = this.f554a;
            if (scheme != null) {
                Intrinsics.checkNotNullParameter(scheme, "scheme");
                if (scheme.equals("http")) {
                    i2 = 80;
                } else if (scheme.equals("https")) {
                    i2 = 443;
                }
            }
            sb.append(':');
            sb.append(b7);
        }
        ArrayList arrayList = this.f559f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb.append('/');
            sb.append((String) arrayList.get(i5));
        }
        if (this.f560g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f560g;
            Intrinsics.b(arrayList2);
            kotlin.ranges.a b8 = C0588e.b(C0588e.c(0, arrayList2.size()), 2);
            int i7 = b8.f6173d;
            int i8 = b8.f6174e;
            int i9 = b8.f6175i;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    String str3 = (String) arrayList2.get(i7);
                    String str4 = (String) arrayList2.get(i7 + 1);
                    if (i7 > 0) {
                        sb.append('&');
                    }
                    sb.append(str3);
                    if (str4 != null) {
                        sb.append('=');
                        sb.append(str4);
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
        }
        if (this.f561h != null) {
            sb.append('#');
            sb.append(this.f561h);
        }
        return sb.toString();
    }
}
