package i1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f2704a;

    /* renamed from: d, reason: collision with root package name */
    public String f2707d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2709f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2710g;
    public String h;

    /* renamed from: b, reason: collision with root package name */
    public String f2705b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f2706c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f2708e = -1;

    public o() {
        ArrayList arrayList = new ArrayList();
        this.f2709f = arrayList;
        arrayList.add("");
    }

    public final p a() {
        ArrayList arrayList;
        String str = this.f2704a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e2 = C0167b.e(this.f2705b, 0, 0, false, 7);
        String e3 = C0167b.e(this.f2706c, 0, 0, false, 7);
        String str2 = this.f2707d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b2 = b();
        ArrayList arrayList2 = this.f2709f;
        ArrayList arrayList3 = new ArrayList(O0.j.d0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0167b.e((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f2710g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(O0.j.d0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C0167b.e(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new p(str, e2, e3, str2, b2, arrayList3, arrayList, str4 != null ? C0167b.e(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i = this.f2708e;
        if (i != -1) {
            return i;
        }
        String str = this.f2704a;
        X0.f.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0273, code lost:
    
        if (r1 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0079, code lost:
    
        if (r7 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(p pVar, String str) {
        int i;
        int i2;
        int i3;
        char c2;
        char c3;
        int i4;
        int e2;
        char charAt;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        String str2;
        boolean z2;
        int i8;
        int i9;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        int e3;
        ArrayList arrayList3;
        char charAt2;
        byte[] bArr = j1.b.f2967a;
        int l2 = j1.b.l(str, 0, str.length());
        int m2 = j1.b.m(str, l2, str.length());
        char c4 = 65535;
        if (m2 - l2 >= 2) {
            char charAt3 = str.charAt(l2);
            char c5 = 'a';
            if ((X0.f.f(charAt3, 97) >= 0 && X0.f.f(charAt3, 122) <= 0) || (X0.f.f(charAt3, 65) >= 0 && X0.f.f(charAt3, 90) <= 0)) {
                i = l2 + 1;
                while (true) {
                    if (i >= m2) {
                        break;
                    }
                    char charAt4 = str.charAt(i);
                    if ((c5 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i++;
                        c5 = 'a';
                    }
                }
                String str6 = "http";
                String str7 = "https";
                String str8 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i == -1) {
                    if (e1.l.y0(str, "https:", l2, true)) {
                        this.f2704a = "https";
                        l2 += 6;
                    } else {
                        if (!e1.l.y0(str, "http:", l2, true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = str.substring(0, i);
                            X0.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f2704a = "http";
                        l2 += 5;
                    }
                } else {
                    if (pVar == null) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? e1.d.O0(str, 6).concat("...") : str));
                    }
                    this.f2704a = pVar.f2712a;
                }
                i2 = l2;
                i3 = 0;
                while (true) {
                    c2 = '/';
                    c3 = '\\';
                    if (i2 >= m2 || !((charAt2 = str.charAt(i2)) == '\\' || charAt2 == '/')) {
                        break;
                    }
                    i3++;
                    i2++;
                }
                ArrayList arrayList4 = this.f2709f;
                char c6 = '#';
                if (i3 < 2 && pVar != null) {
                    if (X0.f.a(pVar.f2712a, this.f2704a)) {
                        this.f2705b = pVar.e();
                        this.f2706c = pVar.a();
                        this.f2707d = pVar.f2715d;
                        this.f2708e = pVar.f2716e;
                        arrayList4.clear();
                        arrayList4.addAll(pVar.c());
                        if (l2 == m2 || str.charAt(l2) == '#') {
                            String d2 = pVar.d();
                            this.f2710g = d2 != null ? C0167b.f(C0167b.b(d2, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
                        }
                        arrayList = arrayList4;
                        z2 = false;
                        e3 = j1.b.e(str, "?#", l2, m2);
                        if (l2 != e3) {
                            char charAt5 = str.charAt(l2);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                l2++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i10 = l2;
                            while (i10 < e3) {
                                int e4 = j1.b.e(str, "/\\", i10, e3);
                                boolean z3 = e4 < e3 ? true : z2;
                                String b2 = C0167b.b(str, i10, e4, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!b2.equals(".") && !b2.equalsIgnoreCase("%2e")) {
                                    if (b2.equals("..") || b2.equalsIgnoreCase("%2e.") || b2.equalsIgnoreCase(".%2e") || b2.equalsIgnoreCase("%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i10 = !z3 ? e4 + 1 : e4;
                                    } else {
                                        if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, b2);
                                        } else {
                                            arrayList3.add(b2);
                                        }
                                        if (z3) {
                                            arrayList3.add("");
                                        }
                                    }
                                }
                                if (!z3) {
                                }
                            }
                        }
                        if (e3 < m2 && str.charAt(e3) == '?') {
                            int d3 = j1.b.d(str, '#', e3, m2);
                            this.f2710g = C0167b.f(C0167b.b(str, e3 + 1, d3, " \"'<>#", true, false, true, false, 208));
                            e3 = d3;
                        }
                        if (e3 < m2 || str.charAt(e3) != '#') {
                            return;
                        }
                        this.h = C0167b.b(str, e3 + 1, m2, "", true, false, false, true, 176);
                        return;
                    }
                }
                i4 = l2 + i3;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    e2 = j1.b.e(str, "@/\\?#", i4, m2);
                    charAt = e2 == m2 ? str.charAt(e2) : c4;
                    if (charAt == c4 || charAt == c6 || charAt == c2 || charAt == c3 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z4) {
                            i9 = e2;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            this.f2706c += "%40" + C0167b.b(str, i4, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        } else {
                            int d4 = j1.b.d(str, ':', i4, e2);
                            i9 = e2;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            String b3 = C0167b.b(str, i4, d4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z5) {
                                b3 = this.f2705b + "%40" + b3;
                            }
                            this.f2705b = b3;
                            if (d4 != i9) {
                                this.f2706c = C0167b.b(str, d4 + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z4 = true;
                            }
                            z5 = true;
                        }
                        i4 = i9 + 1;
                        arrayList4 = arrayList2;
                        str8 = str3;
                        str7 = str4;
                        str6 = str5;
                        c6 = '#';
                        c3 = '\\';
                        c4 = 65535;
                        c2 = '/';
                    }
                }
                String str9 = str8;
                String str10 = str7;
                String str11 = str6;
                arrayList = arrayList4;
                i5 = i4;
                while (true) {
                    if (i5 >= e2) {
                        i6 = e2;
                        break;
                    }
                    char charAt6 = str.charAt(i5);
                    if (charAt6 == '[') {
                        do {
                            i5++;
                            if (i5 >= e2) {
                                break;
                            }
                        } while (str.charAt(i5) != ']');
                    } else if (charAt6 == ':') {
                        i6 = i5;
                        break;
                    }
                    i5++;
                }
                i7 = i6 + 1;
                if (i7 >= e2) {
                    this.f2707d = m.p(C0167b.e(str, i4, i6, false, 4));
                    int i11 = i4;
                    try {
                        i8 = Integer.parseInt(C0167b.b(str, i7, e2, "", false, false, false, false, 248));
                        if (1 <= i8) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i8 = -1;
                    this.f2708e = i8;
                    if (i8 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i7, e2);
                        X0.f.d(substring2, str9);
                        sb2.append(substring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    str2 = str9;
                    i4 = i11;
                    z2 = false;
                } else {
                    str2 = str9;
                    z2 = false;
                    this.f2707d = m.p(C0167b.e(str, i4, i6, false, 4));
                    String str12 = this.f2704a;
                    X0.f.b(str12);
                    this.f2708e = str12.equals(str11) ? 80 : str12.equals(str10) ? 443 : -1;
                }
                if (this.f2707d != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i4, i6);
                    X0.f.d(substring3, str2);
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                l2 = e2;
                e3 = j1.b.e(str, "?#", l2, m2);
                if (l2 != e3) {
                }
                if (e3 < m2) {
                    int d32 = j1.b.d(str, '#', e3, m2);
                    this.f2710g = C0167b.f(C0167b.b(str, e3 + 1, d32, " \"'<>#", true, false, true, false, 208));
                    e3 = d32;
                }
                if (e3 < m2) {
                    return;
                } else {
                    return;
                }
            }
        }
        i = -1;
        String str62 = "http";
        String str72 = "https";
        String str82 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i == -1) {
        }
        i2 = l2;
        i3 = 0;
        while (true) {
            c2 = '/';
            c3 = '\\';
            if (i2 >= m2) {
                break;
            } else {
                break;
            }
            i3++;
            i2++;
        }
        ArrayList arrayList42 = this.f2709f;
        char c62 = '#';
        if (i3 < 2) {
            if (X0.f.a(pVar.f2712a, this.f2704a)) {
            }
        }
        i4 = l2 + i3;
        boolean z42 = false;
        boolean z52 = false;
        while (true) {
            e2 = j1.b.e(str, "@/\\?#", i4, m2);
            if (e2 == m2) {
            }
            if (charAt == c4) {
                break;
            } else {
                break;
            }
        }
        String str92 = str82;
        String str102 = str72;
        String str112 = str62;
        arrayList = arrayList42;
        i5 = i4;
        while (true) {
            if (i5 >= e2) {
            }
            i5++;
        }
        i7 = i6 + 1;
        if (i7 >= e2) {
        }
        if (this.f2707d != null) {
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
        String str = this.f2704a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f2705b.length() > 0 || this.f2706c.length() > 0) {
            sb.append(this.f2705b);
            if (this.f2706c.length() > 0) {
                sb.append(':');
                sb.append(this.f2706c);
            }
            sb.append('@');
        }
        String str2 = this.f2707d;
        if (str2 != null) {
            if (e1.d.A0(str2, ':')) {
                sb.append('[');
                sb.append(this.f2707d);
                sb.append(']');
            } else {
                sb.append(this.f2707d);
            }
        }
        int i = -1;
        if (this.f2708e != -1 || this.f2704a != null) {
            int b2 = b();
            String str3 = this.f2704a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
            }
            sb.append(':');
            sb.append(b2);
        }
        ArrayList arrayList = this.f2709f;
        X0.f.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f2710g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f2710g;
            X0.f.b(arrayList2);
            b1.a Y2 = q1.d.Y(q1.d.a0(0, arrayList2.size()), 2);
            int i3 = Y2.f1637a;
            int i4 = Y2.f1638b;
            int i5 = Y2.f1639c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        String sb2 = sb.toString();
        X0.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
