package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class io {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public io(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                this.d = "";
                this.e = "";
                this.b = -1;
                ArrayList arrayList = new ArrayList();
                this.h = arrayList;
                arrayList.add("");
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [d20[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, d20 d20Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = d20Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new d20[i2];
            System.arraycopy((d20[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((d20[]) this.e)[i3] = d20Var;
        this.b = i3 + 1;
    }

    public jo b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            t8.t("scheme == null");
            return null;
        }
        String p = dh.p((String) this.d, 0, 0, 7);
        String p2 = dh.p((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            t8.t("host == null");
            return null;
        }
        int d = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(db.G0(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(dh.p((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(db.G0(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? dh.p(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new jo(str, p, p2, str2, d, arrayList3, arrayList, str4 != null ? dh.p(str4, 0, 0, 7) : null, toString());
    }

    public x30 c() {
        if (this.b == 0) {
            return null;
        }
        return new x30(this);
    }

    public int d() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.c;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d20[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new d20();
        this.d = new int[10][];
        this.e = new d20[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0200, code lost:
    
        if (r8 < 65536) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r13 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(jo joVar, String str) {
        int i;
        int d;
        int i2;
        char charAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = r70.a;
        int k = r70.k(str, 0, str.length());
        int l = r70.l(str, k, str.length());
        char c = 65535;
        if (l - k >= 2) {
            char charAt2 = str.charAt(k);
            if ((zo.k(charAt2, 97) >= 0 && zo.k(charAt2, 122) <= 0) || (zo.k(charAt2, 65) >= 0 && zo.k(charAt2, 90) <= 0)) {
                i = k + 1;
                while (true) {
                    if (i >= l) {
                        break;
                    }
                    char charAt3 = str.charAt(i);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i++;
                    }
                }
            }
        }
        i = -1;
        if (i == -1) {
            if (joVar == null) {
                t8.k("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? c40.x0(str, 6).concat("...") : str));
                return;
            }
            this.c = joVar.a;
        } else if (k40.l0(str, "https:", k, true)) {
            this.c = "https";
            k += 6;
        } else {
            if (!k40.l0(str, "http:", k, true)) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
            }
            this.c = "http";
            k += 5;
        }
        int i3 = 0;
        for (int i4 = k; i4 < l && ((charAt = str.charAt(i4)) == '\\' || charAt == '/'); i4++) {
            i3++;
        }
        char c2 = '#';
        if (i3 >= 2 || joVar == null || !zo.b(joVar.a, (String) this.c)) {
            int i5 = k + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                d = r70.d(i5, l, str, "@/\\?#");
                char charAt4 = d != l ? str.charAt(d) : c;
                if (charAt4 == c || charAt4 == c2 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z) {
                        this.e = ((String) this.e) + "%40" + dh.g(str, i5, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                    } else {
                        int e = r70.e(str, ':', i5, d);
                        String g = dh.g(str, i5, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z2) {
                            g = ((String) this.d) + "%40" + g;
                        }
                        this.d = g;
                        if (e != d) {
                            this.e = dh.g(str, e + 1, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z = true;
                        }
                        z2 = true;
                    }
                    i5 = d + 1;
                    c2 = '#';
                    c = 65535;
                }
            }
            int i6 = i5;
            while (true) {
                if (i6 >= d) {
                    i6 = d;
                    break;
                }
                char charAt5 = str.charAt(i6);
                if (charAt5 != '[') {
                    if (charAt5 == ':') {
                        break;
                    }
                } else {
                    do {
                        i6++;
                        if (i6 >= d) {
                            break;
                        }
                    } while (str.charAt(i6) != ']');
                }
                i6++;
            }
            int i7 = i6 + 1;
            if (i7 < d) {
                this.f = e70.S(dh.p(str, i5, i6, 4));
                try {
                    i2 = Integer.parseInt(dh.g(str, i7, d, "", 248));
                    if (1 <= i2) {
                    }
                } catch (NumberFormatException unused) {
                }
                i2 = -1;
                this.b = i2;
                if (i2 == -1) {
                    t8.j(str.substring(i7, d), "Invalid URL port: \"");
                    return;
                }
            } else {
                int i8 = -1;
                this.f = e70.S(dh.p(str, i5, i6, 4));
                String str2 = (String) this.c;
                str2.getClass();
                if (str2.equals("http")) {
                    i8 = 80;
                } else if (str2.equals("https")) {
                    i8 = 443;
                }
                this.b = i8;
            }
            if (((String) this.f) == null) {
                t8.j(str.substring(i5, i6), "Invalid URL host: \"");
                return;
            }
            k = d;
        } else {
            this.d = joVar.e();
            this.e = joVar.a();
            this.f = joVar.d;
            this.b = joVar.e;
            arrayList.clear();
            arrayList.addAll(joVar.c());
            if (k == l || str.charAt(k) == '#') {
                String d2 = joVar.d();
                this.i = d2 != null ? dh.q(dh.g(d2, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int d3 = r70.d(k, l, str, "?#");
        if (k != d3) {
            char charAt6 = str.charAt(k);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                k++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (k < d3) {
                int d4 = r70.d(k, d3, str, "/\\");
                boolean z3 = d4 < d3;
                String g2 = dh.g(str, k, d4, " \"<>^`{}|/\\?#", 240);
                if (!g2.equals(".") && !g2.equalsIgnoreCase("%2e")) {
                    if (!g2.equals("..") && !g2.equalsIgnoreCase("%2e.") && !g2.equalsIgnoreCase(".%2e") && !g2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, g2);
                        } else {
                            arrayList.add(g2);
                        }
                        if (z3) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                k = z3 ? d4 + 1 : d4;
            }
        }
        if (d3 < l && str.charAt(d3) == '?') {
            int e2 = r70.e(str, '#', d3, l);
            this.i = dh.q(dh.g(str, d3 + 1, e2, " \"'<>#", 208));
            d3 = e2;
        }
        if (d3 >= l || str.charAt(d3) != '#') {
            return;
        }
        this.g = dh.g(str, d3 + 1, l, "", 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f;
                if (str2 != null) {
                    if (c40.n0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f);
                    }
                }
                int i = -1;
                if (this.b != -1 || ((String) this.c) != null) {
                    int d = d();
                    String str3 = (String) this.c;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(d);
                }
                ArrayList arrayList = (ArrayList) this.h;
                arrayList.getClass();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i2));
                }
                if (((ArrayList) this.i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.i;
                    arrayList2.getClass();
                    vo x0 = o8.x0(o8.y0(0, arrayList2.size()), 2);
                    int i3 = x0.f;
                    int i4 = x0.g;
                    int i5 = x0.h;
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
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                }
                if (((String) this.g) != null) {
                    sb.append('#');
                    sb.append((String) this.g);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public io(d20 d20Var) {
        this.a = 1;
        e();
        a(StateSet.WILD_CARD, d20Var);
    }
}
