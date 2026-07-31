package A2;

import a.AbstractC0157a;
import e2.AbstractC0381e;
import e2.C0378b;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f120a;

    /* renamed from: d, reason: collision with root package name */
    public String f123d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f125f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f126g;

    /* renamed from: h, reason: collision with root package name */
    public String f127h;

    /* renamed from: b, reason: collision with root package name */
    public String f121b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f122c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f124e = -1;

    public p() {
        ArrayList arrayList = new ArrayList();
        this.f125f = arrayList;
        arrayList.add("");
    }

    public final q a() {
        ArrayList arrayList;
        String str = this.f120a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e3 = C0003b.e(this.f121b, 0, 0, false, 7);
        String e4 = C0003b.e(this.f122c, 0, 0, false, 7);
        String str2 = this.f123d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b2 = b();
        ArrayList arrayList2 = this.f125f;
        ArrayList arrayList3 = new ArrayList(M1.n.g0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0003b.e((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f126g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(M1.n.g0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C0003b.e(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f127h;
        return new q(str, e3, e4, str2, b2, arrayList3, arrayList, str4 != null ? C0003b.e(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i3 = this.f124e;
        if (i3 != -1) {
            return i3;
        }
        String str = this.f120a;
        Z1.i.c(str);
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
    public final void c(q qVar, String str) {
        int i3;
        int i4;
        int i5;
        char c3;
        char c4;
        int i6;
        int e3;
        char charAt;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        String str2;
        boolean z3;
        int i10;
        int i11;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        int e4;
        ArrayList arrayList3;
        char charAt2;
        byte[] bArr = B2.c.f415a;
        int m3 = B2.c.m(0, str.length(), str);
        int n3 = B2.c.n(m3, str.length(), str);
        char c5 = 65535;
        if (n3 - m3 >= 2) {
            char charAt3 = str.charAt(m3);
            char c6 = 'a';
            if ((Z1.i.g(charAt3, 97) >= 0 && Z1.i.g(charAt3, 122) <= 0) || (Z1.i.g(charAt3, 65) >= 0 && Z1.i.g(charAt3, 90) <= 0)) {
                i3 = m3 + 1;
                while (true) {
                    if (i3 >= n3) {
                        break;
                    }
                    char charAt4 = str.charAt(i3);
                    if ((c6 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i3++;
                        c6 = 'a';
                    }
                }
                String str6 = "http";
                String str7 = "https";
                String str8 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i3 == -1) {
                    if (AbstractC0454p.h0(str, "https:", m3, true)) {
                        this.f120a = "https";
                        m3 += 6;
                    } else {
                        if (!AbstractC0454p.h0(str, "http:", m3, true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = str.substring(0, i3);
                            Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f120a = "http";
                        m3 += 5;
                    }
                } else {
                    if (qVar == null) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? AbstractC0447i.G0(str, 6).concat("...") : str));
                    }
                    this.f120a = qVar.f129a;
                }
                i4 = m3;
                i5 = 0;
                while (true) {
                    c3 = '/';
                    c4 = '\\';
                    if (i4 >= n3 || !((charAt2 = str.charAt(i4)) == '\\' || charAt2 == '/')) {
                        break;
                    }
                    i5++;
                    i4++;
                }
                ArrayList arrayList4 = this.f125f;
                char c7 = '#';
                if (i5 < 2 && qVar != null) {
                    if (Z1.i.a(qVar.f129a, this.f120a)) {
                        this.f121b = qVar.e();
                        this.f122c = qVar.a();
                        this.f123d = qVar.f132d;
                        this.f124e = qVar.f133e;
                        arrayList4.clear();
                        arrayList4.addAll(qVar.c());
                        if (m3 == n3 || str.charAt(m3) == '#') {
                            String d3 = qVar.d();
                            this.f126g = d3 != null ? C0003b.f(C0003b.b(d3, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
                        }
                        arrayList = arrayList4;
                        z3 = false;
                        e4 = B2.c.e(m3, n3, str, "?#");
                        if (m3 != e4) {
                            char charAt5 = str.charAt(m3);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                m3++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i12 = m3;
                            while (i12 < e4) {
                                int e5 = B2.c.e(i12, e4, str, "/\\");
                                boolean z4 = e5 < e4 ? true : z3;
                                String b2 = C0003b.b(str, i12, e5, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!b2.equals(".") && !b2.equalsIgnoreCase("%2e")) {
                                    if (b2.equals("..") || b2.equalsIgnoreCase("%2e.") || b2.equalsIgnoreCase(".%2e") || b2.equalsIgnoreCase("%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i12 = !z4 ? e5 + 1 : e5;
                                    } else {
                                        if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, b2);
                                        } else {
                                            arrayList3.add(b2);
                                        }
                                        if (z4) {
                                            arrayList3.add("");
                                        }
                                    }
                                }
                                if (!z4) {
                                }
                            }
                        }
                        if (e4 < n3 && str.charAt(e4) == '?') {
                            int f3 = B2.c.f(str, '#', e4, n3);
                            this.f126g = C0003b.f(C0003b.b(str, e4 + 1, f3, " \"'<>#", true, false, true, false, 208));
                            e4 = f3;
                        }
                        if (e4 < n3 || str.charAt(e4) != '#') {
                            return;
                        }
                        this.f127h = C0003b.b(str, e4 + 1, n3, "", true, false, false, true, 176);
                        return;
                    }
                }
                i6 = m3 + i5;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    e3 = B2.c.e(i6, n3, str, "@/\\?#");
                    charAt = e3 == n3 ? str.charAt(e3) : c5;
                    if (charAt == c5 || charAt == c7 || charAt == c3 || charAt == c4 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z5) {
                            i11 = e3;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            this.f122c += "%40" + C0003b.b(str, i6, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        } else {
                            int f4 = B2.c.f(str, ':', i6, e3);
                            i11 = e3;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            String b3 = C0003b.b(str, i6, f4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z6) {
                                b3 = this.f121b + "%40" + b3;
                            }
                            this.f121b = b3;
                            if (f4 != i11) {
                                this.f122c = C0003b.b(str, f4 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z5 = true;
                            }
                            z6 = true;
                        }
                        i6 = i11 + 1;
                        arrayList4 = arrayList2;
                        str8 = str3;
                        str7 = str4;
                        str6 = str5;
                        c7 = '#';
                        c4 = '\\';
                        c5 = 65535;
                        c3 = '/';
                    }
                }
                String str9 = str8;
                String str10 = str7;
                String str11 = str6;
                arrayList = arrayList4;
                i7 = i6;
                while (true) {
                    if (i7 >= e3) {
                        i8 = e3;
                        break;
                    }
                    char charAt6 = str.charAt(i7);
                    if (charAt6 == '[') {
                        do {
                            i7++;
                            if (i7 >= e3) {
                                break;
                            }
                        } while (str.charAt(i7) != ']');
                    } else if (charAt6 == ':') {
                        i8 = i7;
                        break;
                    }
                    i7++;
                }
                i9 = i8 + 1;
                if (i9 >= e3) {
                    this.f123d = AbstractC0157a.X(C0003b.e(str, i6, i8, false, 4));
                    int i13 = i6;
                    try {
                        i10 = Integer.parseInt(C0003b.b(str, i9, e3, "", false, false, false, false, 248));
                        if (1 <= i10) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.f124e = i10;
                    if (i10 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i9, e3);
                        Z1.i.e(substring2, str9);
                        sb2.append(substring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    str2 = str9;
                    i6 = i13;
                    z3 = false;
                } else {
                    str2 = str9;
                    z3 = false;
                    this.f123d = AbstractC0157a.X(C0003b.e(str, i6, i8, false, 4));
                    String str12 = this.f120a;
                    Z1.i.c(str12);
                    this.f124e = str12.equals(str11) ? 80 : str12.equals(str10) ? 443 : -1;
                }
                if (this.f123d != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i6, i8);
                    Z1.i.e(substring3, str2);
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                m3 = e3;
                e4 = B2.c.e(m3, n3, str, "?#");
                if (m3 != e4) {
                }
                if (e4 < n3) {
                    int f32 = B2.c.f(str, '#', e4, n3);
                    this.f126g = C0003b.f(C0003b.b(str, e4 + 1, f32, " \"'<>#", true, false, true, false, 208));
                    e4 = f32;
                }
                if (e4 < n3) {
                    return;
                } else {
                    return;
                }
            }
        }
        i3 = -1;
        String str62 = "http";
        String str72 = "https";
        String str82 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i3 == -1) {
        }
        i4 = m3;
        i5 = 0;
        while (true) {
            c3 = '/';
            c4 = '\\';
            if (i4 >= n3) {
                break;
            } else {
                break;
            }
            i5++;
            i4++;
        }
        ArrayList arrayList42 = this.f125f;
        char c72 = '#';
        if (i5 < 2) {
            if (Z1.i.a(qVar.f129a, this.f120a)) {
            }
        }
        i6 = m3 + i5;
        boolean z52 = false;
        boolean z62 = false;
        while (true) {
            e3 = B2.c.e(i6, n3, str, "@/\\?#");
            if (e3 == n3) {
            }
            if (charAt == c5) {
                break;
            } else {
                break;
            }
        }
        String str92 = str82;
        String str102 = str72;
        String str112 = str62;
        arrayList = arrayList42;
        i7 = i6;
        while (true) {
            if (i7 >= e3) {
            }
            i7++;
        }
        i9 = i8 + 1;
        if (i9 >= e3) {
        }
        if (this.f123d != null) {
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
        String str = this.f120a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f121b.length() > 0 || this.f122c.length() > 0) {
            sb.append(this.f121b);
            if (this.f122c.length() > 0) {
                sb.append(':');
                sb.append(this.f122c);
            }
            sb.append('@');
        }
        String str2 = this.f123d;
        if (str2 != null) {
            if (AbstractC0447i.k0(str2, ':')) {
                sb.append('[');
                sb.append(this.f123d);
                sb.append(']');
            } else {
                sb.append(this.f123d);
            }
        }
        int i3 = -1;
        if (this.f124e != -1 || this.f120a != null) {
            int b2 = b();
            String str3 = this.f120a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i3 = 80;
                } else if (str3.equals("https")) {
                    i3 = 443;
                }
            }
            sb.append(':');
            sb.append(b2);
        }
        ArrayList arrayList = this.f125f;
        Z1.i.f(arrayList, "<this>");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb.append('/');
            sb.append((String) arrayList.get(i4));
        }
        if (this.f126g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f126g;
            Z1.i.c(arrayList2);
            C0378b L2 = AbstractC0381e.L(AbstractC0381e.Q(0, arrayList2.size()), 2);
            int i5 = L2.f4768d;
            int i6 = L2.f4769e;
            int i7 = L2.f4770f;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i5);
                    String str5 = (String) arrayList2.get(i5 + 1);
                    if (i5 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
        }
        if (this.f127h != null) {
            sb.append('#');
            sb.append(this.f127h);
        }
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
