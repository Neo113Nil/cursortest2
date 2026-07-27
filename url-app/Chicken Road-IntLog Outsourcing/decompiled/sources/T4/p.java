package T4;

import g4.AbstractC0466k;
import g4.AbstractC0467l;
import java.util.ArrayList;
import java.util.Iterator;
import y4.C1572a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f2915a;

    /* renamed from: d, reason: collision with root package name */
    public String f2918d;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2921g;

    /* renamed from: h, reason: collision with root package name */
    public String f2922h;

    /* renamed from: b, reason: collision with root package name */
    public String f2916b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f2917c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f2919e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2920f = AbstractC0466k.B0("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int W5 = B4.k.W(str, '&', i2, false, 4);
            if (W5 == -1) {
                W5 = str.length();
            }
            int W6 = B4.k.W(str, '=', i2, false, 4);
            if (W6 == -1 || W6 > W5) {
                String substring = str.substring(i2, W5);
                kotlin.jvm.internal.i.d(substring, "substring(...)");
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i2, W6);
                kotlin.jvm.internal.i.d(substring2, "substring(...)");
                arrayList.add(substring2);
                String substring3 = str.substring(W6 + 1, W5);
                kotlin.jvm.internal.i.d(substring3, "substring(...)");
                arrayList.add(substring3);
            }
            i2 = W5 + 1;
        }
        return arrayList;
    }

    public final q a() {
        ArrayList arrayList;
        String str = this.f2915a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String c2 = i5.a.c(this.f2916b, 0, 0, false, 7);
        String c6 = i5.a.c(this.f2917c, 0, 0, false, 7);
        String str2 = this.f2918d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b6 = b();
        ArrayList arrayList2 = this.f2920f;
        ArrayList arrayList3 = new ArrayList(AbstractC0467l.D0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(i5.a.c((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f2921g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0467l.D0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? i5.a.c(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f2922h;
        return new q(str, c2, c6, str2, b6, arrayList, str4 != null ? i5.a.c(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i2 = this.f2919e;
        if (i2 != -1) {
            return i2;
        }
        String str = this.f2915a;
        kotlin.jvm.internal.i.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0279, code lost:
    
        if (r9 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0079, code lost:
    
        if (r7 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(q qVar, String input) {
        int i2;
        int i3;
        int i6;
        char c2;
        char c6;
        int i7;
        int d6;
        char charAt;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int i11;
        char c7;
        boolean z;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        String str;
        String str2;
        String str3;
        int i15;
        char c8;
        int i16;
        int d7;
        ArrayList arrayList3;
        char charAt2;
        kotlin.jvm.internal.i.e(input, "input");
        byte[] bArr = U4.c.f3176a;
        int g6 = U4.c.g(input, 0, input.length());
        int h3 = U4.c.h(input, g6, input.length());
        char c9 = 65535;
        if (h3 - g6 >= 2) {
            char charAt3 = input.charAt(g6);
            char c10 = 'a';
            if ((kotlin.jvm.internal.i.g(charAt3, 97) >= 0 && kotlin.jvm.internal.i.g(charAt3, 122) <= 0) || (kotlin.jvm.internal.i.g(charAt3, 65) >= 0 && kotlin.jvm.internal.i.g(charAt3, 90) <= 0)) {
                i2 = g6 + 1;
                while (true) {
                    if (i2 >= h3) {
                        break;
                    }
                    char charAt4 = input.charAt(i2);
                    if ((c10 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i2++;
                        c10 = 'a';
                    }
                }
                String str4 = "http";
                String str5 = "https";
                String str6 = "substring(...)";
                if (i2 == -1) {
                    if (B4.r.N(input, g6, "https:", true)) {
                        this.f2915a = "https";
                        g6 += 6;
                    } else {
                        if (!B4.r.N(input, g6, "http:", true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = input.substring(0, i2);
                            kotlin.jvm.internal.i.d(substring, "substring(...)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f2915a = "http";
                        g6 += 5;
                    }
                } else {
                    if (qVar == null) {
                        throw new IllegalArgumentException(B0.o.i("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? B4.k.l0(6, input).concat("...") : input));
                    }
                    this.f2915a = qVar.f2923a;
                }
                i3 = g6;
                i6 = 0;
                while (true) {
                    c2 = '\\';
                    c6 = '/';
                    if (i3 >= h3 || !((charAt2 = input.charAt(i3)) == '/' || charAt2 == '\\')) {
                        break;
                    }
                    i6++;
                    i3++;
                }
                ArrayList arrayList4 = this.f2920f;
                char c11 = '#';
                if (i6 < 2 && qVar != null) {
                    if (kotlin.jvm.internal.i.a(qVar.f2923a, this.f2915a)) {
                        this.f2916b = qVar.e();
                        this.f2917c = qVar.a();
                        this.f2918d = qVar.f2926d;
                        this.f2919e = qVar.f2927e;
                        arrayList4.clear();
                        arrayList4.addAll(qVar.c());
                        if (g6 == h3 || input.charAt(g6) == '#') {
                            String d8 = qVar.d();
                            this.f2921g = d8 != null ? d(i5.a.a(d8, 0, 0, " \"'<>#", true, false, true, false, 83)) : null;
                        }
                        arrayList = arrayList4;
                        i8 = h3;
                        z = false;
                        i16 = i8;
                        d7 = U4.c.d(input, g6, i16, "?#");
                        if (g6 != d7) {
                            char charAt5 = input.charAt(g6);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                g6++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i17 = g6;
                            while (i17 < d7) {
                                int d9 = U4.c.d(input, i17, d7, "/\\");
                                boolean z5 = d9 < d7 ? true : z;
                                boolean z6 = z;
                                String a6 = i5.a.a(input, i17, d9, " \"<>^`{}|/\\?#", true, false, false, false, 112);
                                if (!a6.equals(".") && !a6.equalsIgnoreCase("%2e")) {
                                    if (a6.equals("..") || a6.equalsIgnoreCase("%2e.") || a6.equalsIgnoreCase(".%2e") || a6.equalsIgnoreCase("%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i17 = !z5 ? d9 + 1 : d9;
                                        z = z6;
                                    } else {
                                        if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, a6);
                                        } else {
                                            arrayList3.add(a6);
                                        }
                                        if (z5) {
                                            arrayList3.add("");
                                        }
                                    }
                                }
                                if (!z5) {
                                }
                                z = z6;
                            }
                        }
                        if (d7 < i16 && input.charAt(d7) == '?') {
                            int c12 = U4.c.c(input, '#', d7, i16);
                            this.f2921g = d(i5.a.a(input, d7 + 1, c12, " \"'<>#", true, false, true, false, 80));
                            d7 = c12;
                        }
                        if (d7 < i16 || input.charAt(d7) != '#') {
                            return;
                        }
                        this.f2922h = i5.a.a(input, d7 + 1, i16, "", true, false, false, true, 48);
                        return;
                    }
                }
                i7 = g6 + i6;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    d6 = U4.c.d(input, i7, h3, "@/\\?#");
                    charAt = d6 == h3 ? input.charAt(d6) : c9;
                    if (charAt == c9 || charAt == c11 || charAt == c6 || charAt == c2 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z7) {
                            arrayList2 = arrayList4;
                            i14 = d6;
                            str = str6;
                            str2 = str5;
                            str3 = str4;
                            i15 = h3;
                            c8 = c9;
                            this.f2917c += "%40" + i5.a.a(input, i7, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112);
                        } else {
                            int c13 = U4.c.c(input, ':', i7, d6);
                            arrayList2 = arrayList4;
                            i14 = d6;
                            str = str6;
                            str2 = str5;
                            str3 = str4;
                            i15 = h3;
                            c8 = c9;
                            String a7 = i5.a.a(input, i7, c13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112);
                            if (z8) {
                                a7 = this.f2916b + "%40" + a7;
                            }
                            this.f2916b = a7;
                            if (c13 != i14) {
                                this.f2917c = i5.a.a(input, c13 + 1, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112);
                                z7 = true;
                            }
                            z8 = true;
                        }
                        i7 = i14 + 1;
                        arrayList4 = arrayList2;
                        str6 = str;
                        c9 = c8;
                        h3 = i15;
                        str5 = str2;
                        str4 = str3;
                        c11 = '#';
                        c6 = '/';
                        c2 = '\\';
                    }
                }
                arrayList = arrayList4;
                String str7 = str6;
                String str8 = str5;
                String str9 = str4;
                i8 = h3;
                char c14 = c9;
                i9 = i7;
                while (true) {
                    if (i9 < d6) {
                        char charAt6 = input.charAt(i9);
                        if (charAt6 == ':') {
                            i10 = i9;
                            break;
                        }
                        if (charAt6 != '[') {
                            i13 = 1;
                        } else {
                            i13 = 1;
                            do {
                                i9++;
                                if (i9 < d6) {
                                }
                            } while (input.charAt(i9) != ']');
                        }
                        i9 += i13;
                    } else {
                        i10 = d6;
                        break;
                    }
                }
                i11 = i10 + 1;
                if (i11 >= d6) {
                    this.f2918d = U4.b.b(i5.a.c(input, i7, i10, false, 4));
                    try {
                        i12 = Integer.parseInt(i5.a.a(input, i11, d6, "", false, false, false, false, 120));
                        if (1 <= i12) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i12 = c14;
                    this.f2919e = i12;
                    if (i12 == c14) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = input.substring(i11, d6);
                        kotlin.jvm.internal.i.d(substring2, str7);
                        sb2.append(substring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    c7 = '\"';
                    z = false;
                } else {
                    c7 = '\"';
                    z = false;
                    this.f2918d = U4.b.b(i5.a.c(input, i7, i10, false, 4));
                    String str10 = this.f2915a;
                    kotlin.jvm.internal.i.b(str10);
                    this.f2919e = str10.equals(str9) ? 'P' : str10.equals(str8) ? (char) 443 : c14;
                }
                if (this.f2918d != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = input.substring(i7, i10);
                    kotlin.jvm.internal.i.d(substring3, str7);
                    sb3.append(substring3);
                    sb3.append(c7);
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                g6 = d6;
                i16 = i8;
                d7 = U4.c.d(input, g6, i16, "?#");
                if (g6 != d7) {
                }
                if (d7 < i16) {
                    int c122 = U4.c.c(input, '#', d7, i16);
                    this.f2921g = d(i5.a.a(input, d7 + 1, c122, " \"'<>#", true, false, true, false, 80));
                    d7 = c122;
                }
                if (d7 < i16) {
                    return;
                } else {
                    return;
                }
            }
        }
        i2 = -1;
        String str42 = "http";
        String str52 = "https";
        String str62 = "substring(...)";
        if (i2 == -1) {
        }
        i3 = g6;
        i6 = 0;
        while (true) {
            c2 = '\\';
            c6 = '/';
            if (i3 >= h3) {
                break;
            } else {
                break;
            }
            i6++;
            i3++;
        }
        ArrayList arrayList42 = this.f2920f;
        char c112 = '#';
        if (i6 < 2) {
            if (kotlin.jvm.internal.i.a(qVar.f2923a, this.f2915a)) {
            }
        }
        i7 = g6 + i6;
        boolean z72 = false;
        boolean z82 = false;
        while (true) {
            d6 = U4.c.d(input, i7, h3, "@/\\?#");
            if (d6 == h3) {
            }
            if (charAt == c9) {
                break;
            } else {
                break;
            }
        }
        arrayList = arrayList42;
        String str72 = str62;
        String str82 = str52;
        String str92 = str42;
        i8 = h3;
        char c142 = c9;
        i9 = i7;
        while (true) {
            if (i9 < d6) {
            }
            i9 += i13;
        }
        i11 = i10 + 1;
        if (i11 >= d6) {
        }
        if (this.f2918d != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f2915a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f2916b.length() > 0 || this.f2917c.length() > 0) {
            sb.append(this.f2916b);
            if (this.f2917c.length() > 0) {
                sb.append(':');
                sb.append(this.f2917c);
            }
            sb.append('@');
        }
        String str2 = this.f2918d;
        if (str2 != null) {
            if (B4.k.S(str2, ':')) {
                sb.append('[');
                sb.append(this.f2918d);
                sb.append(']');
            } else {
                sb.append(this.f2918d);
            }
        }
        int i2 = -1;
        if (this.f2919e != -1 || this.f2915a != null) {
            int b6 = b();
            String str3 = this.f2915a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i2 = 80;
                } else if (str3.equals("https")) {
                    i2 = 443;
                }
            }
            sb.append(':');
            sb.append(b6);
        }
        ArrayList arrayList = this.f2920f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            sb.append('/');
            sb.append((String) arrayList.get(i3));
        }
        if (this.f2921g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f2921g;
            kotlin.jvm.internal.i.b(arrayList2);
            C1572a q02 = K1.b.q0(K1.b.s0(0, arrayList2.size()), 2);
            int i6 = q02.f12439a;
            int i7 = q02.f12440b;
            int i8 = q02.f12441c;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i6);
                    String str5 = (String) arrayList2.get(i6 + 1);
                    if (i6 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6 += i8;
                }
            }
        }
        if (this.f2922h != null) {
            sb.append('#');
            sb.append(this.f2922h);
        }
        return sb.toString();
    }
}
