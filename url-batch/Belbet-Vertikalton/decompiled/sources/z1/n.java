package z1;

import a.AbstractC0058a;
import java.util.ArrayList;
import java.util.Iterator;
import n1.C0316a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f4868a;

    /* renamed from: d, reason: collision with root package name */
    public String f4871d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4872f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f4873g;

    /* renamed from: h, reason: collision with root package name */
    public String f4874h;

    /* renamed from: b, reason: collision with root package name */
    public String f4869b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f4870c = "";
    public int e = -1;

    public n() {
        ArrayList arrayList = new ArrayList();
        this.f4872f = arrayList;
        arrayList.add("");
    }

    public final o a() {
        ArrayList arrayList;
        String str = this.f4868a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e = b.e(this.f4869b, 0, 0, false, 7);
        String e2 = b.e(this.f4870c, 0, 0, false, 7);
        String str2 = this.f4871d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b2 = b();
        ArrayList arrayList2 = this.f4872f;
        ArrayList arrayList3 = new ArrayList(X0.m.m0(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(b.e((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f4873g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(X0.m.m0(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? b.e(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f4874h;
        return new o(str, e, e2, str2, b2, arrayList3, arrayList, str4 != null ? b.e(str4, 0, 0, false, 7) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.f4868a;
        j1.h.b(str);
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
    public final void c(o oVar, String str) {
        int i;
        int i2;
        int i3;
        char c2;
        char c3;
        int i4;
        int d2;
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
        int d3;
        ArrayList arrayList3;
        char charAt2;
        byte[] bArr = A1.c.f19a;
        int l2 = A1.c.l(str, 0, str.length());
        int m2 = A1.c.m(str, l2, str.length());
        char c4 = 65535;
        if (m2 - l2 >= 2) {
            char charAt3 = str.charAt(l2);
            char c5 = 'a';
            if ((j1.h.f(charAt3, 97) >= 0 && j1.h.f(charAt3, 122) <= 0) || (j1.h.f(charAt3, 65) >= 0 && j1.h.f(charAt3, 90) <= 0)) {
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
                    if (q1.m.r0(str, "https:", l2, true)) {
                        this.f4868a = "https";
                        l2 += 6;
                    } else {
                        if (!q1.m.r0(str, "http:", l2, true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = str.substring(0, i);
                            j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f4868a = "http";
                        l2 += 5;
                    }
                } else {
                    if (oVar == null) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? q1.e.K0(str, 6).concat("...") : str));
                    }
                    this.f4868a = oVar.f4875a;
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
                ArrayList arrayList4 = this.f4872f;
                char c6 = '#';
                if (i3 < 2 && oVar != null) {
                    if (j1.h.a(oVar.f4875a, this.f4868a)) {
                        this.f4869b = oVar.e();
                        this.f4870c = oVar.a();
                        this.f4871d = oVar.f4878d;
                        this.e = oVar.e;
                        arrayList4.clear();
                        arrayList4.addAll(oVar.c());
                        if (l2 == m2 || str.charAt(l2) == '#') {
                            String d4 = oVar.d();
                            this.f4873g = d4 != null ? b.f(b.b(d4, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
                        }
                        arrayList = arrayList4;
                        z2 = false;
                        d3 = A1.c.d(l2, m2, str, "?#");
                        if (l2 != d3) {
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
                            while (i10 < d3) {
                                int d5 = A1.c.d(i10, d3, str, "/\\");
                                boolean z3 = d5 < d3 ? true : z2;
                                String b2 = b.b(str, i10, d5, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!b2.equals(".") && !b2.equalsIgnoreCase("%2e")) {
                                    if (b2.equals("..") || b2.equalsIgnoreCase("%2e.") || b2.equalsIgnoreCase(".%2e") || b2.equalsIgnoreCase("%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i10 = !z3 ? d5 + 1 : d5;
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
                        if (d3 < m2 && str.charAt(d3) == '?') {
                            int e = A1.c.e(str, '#', d3, m2);
                            this.f4873g = b.f(b.b(str, d3 + 1, e, " \"'<>#", true, false, true, false, 208));
                            d3 = e;
                        }
                        if (d3 < m2 || str.charAt(d3) != '#') {
                            return;
                        }
                        this.f4874h = b.b(str, d3 + 1, m2, "", true, false, false, true, 176);
                        return;
                    }
                }
                i4 = l2 + i3;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    d2 = A1.c.d(i4, m2, str, "@/\\?#");
                    charAt = d2 == m2 ? str.charAt(d2) : c4;
                    if (charAt == c4 || charAt == c6 || charAt == c2 || charAt == c3 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z4) {
                            i9 = d2;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            this.f4870c += "%40" + b.b(str, i4, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        } else {
                            int e2 = A1.c.e(str, ':', i4, d2);
                            i9 = d2;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            String b3 = b.b(str, i4, e2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z5) {
                                b3 = this.f4869b + "%40" + b3;
                            }
                            this.f4869b = b3;
                            if (e2 != i9) {
                                this.f4870c = b.b(str, e2 + 1, i9, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
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
                    if (i5 >= d2) {
                        i6 = d2;
                        break;
                    }
                    char charAt6 = str.charAt(i5);
                    if (charAt6 == '[') {
                        do {
                            i5++;
                            if (i5 >= d2) {
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
                if (i7 >= d2) {
                    this.f4871d = H1.d.j0(b.e(str, i4, i6, false, 4));
                    int i11 = i4;
                    try {
                        i8 = Integer.parseInt(b.b(str, i7, d2, "", false, false, false, false, 248));
                        if (1 <= i8) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i8 = -1;
                    this.e = i8;
                    if (i8 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i7, d2);
                        j1.h.d(substring2, str9);
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
                    this.f4871d = H1.d.j0(b.e(str, i4, i6, false, 4));
                    String str12 = this.f4868a;
                    j1.h.b(str12);
                    this.e = str12.equals(str11) ? 80 : str12.equals(str10) ? 443 : -1;
                }
                if (this.f4871d != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i4, i6);
                    j1.h.d(substring3, str2);
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                l2 = d2;
                d3 = A1.c.d(l2, m2, str, "?#");
                if (l2 != d3) {
                }
                if (d3 < m2) {
                    int e3 = A1.c.e(str, '#', d3, m2);
                    this.f4873g = b.f(b.b(str, d3 + 1, e3, " \"'<>#", true, false, true, false, 208));
                    d3 = e3;
                }
                if (d3 < m2) {
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
        ArrayList arrayList42 = this.f4872f;
        char c62 = '#';
        if (i3 < 2) {
            if (j1.h.a(oVar.f4875a, this.f4868a)) {
            }
        }
        i4 = l2 + i3;
        boolean z42 = false;
        boolean z52 = false;
        while (true) {
            d2 = A1.c.d(i4, m2, str, "@/\\?#");
            if (d2 == m2) {
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
            if (i5 >= d2) {
            }
            i5++;
        }
        i7 = i6 + 1;
        if (i7 >= d2) {
        }
        if (this.f4871d != null) {
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
        String str = this.f4868a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f4869b.length() > 0 || this.f4870c.length() > 0) {
            sb.append(this.f4869b);
            if (this.f4870c.length() > 0) {
                sb.append(':');
                sb.append(this.f4870c);
            }
            sb.append('@');
        }
        String str2 = this.f4871d;
        if (str2 != null) {
            if (q1.e.t0(str2, ':')) {
                sb.append('[');
                sb.append(this.f4871d);
                sb.append(']');
            } else {
                sb.append(this.f4871d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.f4868a != null) {
            int b2 = b();
            String str3 = this.f4868a;
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
        ArrayList arrayList = this.f4872f;
        j1.h.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f4873g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f4873g;
            j1.h.b(arrayList2);
            C0316a c02 = AbstractC0058a.c0(AbstractC0058a.e0(0, arrayList2.size()), 2);
            int i3 = c02.f3755a;
            int i4 = c02.f3756b;
            int i5 = c02.f3757c;
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
        if (this.f4874h != null) {
            sb.append('#');
            sb.append(this.f4874h);
        }
        String sb2 = sb.toString();
        j1.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
