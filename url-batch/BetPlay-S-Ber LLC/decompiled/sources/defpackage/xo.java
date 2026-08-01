package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xo {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public xo(int i) {
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

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, n20[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, n20 n20Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = n20Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new n20[i2];
            System.arraycopy((n20[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((n20[]) this.e)[i3] = n20Var;
        this.b = i3 + 1;
    }

    public yo b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            o8.t("scheme == null");
            return null;
        }
        String p = vg.p((String) this.d, 0, 0, 7);
        String p2 = vg.p((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            o8.t("host == null");
            return null;
        }
        int d = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(fb.b0(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(vg.p((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(fb.b0(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? vg.p(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new yo(str, p, p2, str2, d, arrayList3, arrayList, str4 != null ? vg.p(str4, 0, 0, 7) : null, toString());
    }

    public g40 c() {
        if (this.b == 0) {
            return null;
        }
        return new g40(this);
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, n20[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new n20();
        this.d = new int[10][];
        this.e = new n20[10];
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
    public void f(yo yoVar, String str) {
        int i;
        int d;
        int i2;
        char charAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = y70.a;
        int k = y70.k(str, 0, str.length());
        int l = y70.l(str, k, str.length());
        char c = 65535;
        if (l - k >= 2) {
            char charAt2 = str.charAt(k);
            if ((op.i(charAt2, 97) >= 0 && op.i(charAt2, 122) <= 0) || (op.i(charAt2, 65) >= 0 && op.i(charAt2, 90) <= 0)) {
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
            if (yoVar == null) {
                o8.j("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? l40.p0(str, 6).concat("...") : str));
                return;
            }
            this.c = yoVar.a;
        } else if (t40.d0(str, "https:", k, true)) {
            this.c = "https";
            k += 6;
        } else {
            if (!t40.d0(str, "http:", k, true)) {
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
        if (i3 >= 2 || yoVar == null || !op.d(yoVar.a, (String) this.c)) {
            int i5 = k + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                d = y70.d(i5, l, str, "@/\\?#");
                char charAt4 = d != l ? str.charAt(d) : c;
                if (charAt4 == c || charAt4 == c2 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z) {
                        this.e = ((String) this.e) + "%40" + vg.g(str, i5, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                    } else {
                        int e = y70.e(str, ':', i5, d);
                        String g = vg.g(str, i5, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z2) {
                            g = ((String) this.d) + "%40" + g;
                        }
                        this.d = g;
                        if (e != d) {
                            this.e = vg.g(str, e + 1, d, " \"':;<=>@[]^`{}|/\\?#", 240);
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
                this.f = op.U(vg.p(str, i5, i6, 4));
                try {
                    i2 = Integer.parseInt(vg.g(str, i7, d, "", 248));
                    if (1 <= i2) {
                    }
                } catch (NumberFormatException unused) {
                }
                i2 = -1;
                this.b = i2;
                if (i2 == -1) {
                    o8.i(str.substring(i7, d), "Invalid URL port: \"");
                    return;
                }
            } else {
                int i8 = -1;
                this.f = op.U(vg.p(str, i5, i6, 4));
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
                o8.i(str.substring(i5, i6), "Invalid URL host: \"");
                return;
            }
            k = d;
        } else {
            this.d = yoVar.e();
            this.e = yoVar.a();
            this.f = yoVar.d;
            this.b = yoVar.e;
            arrayList.clear();
            arrayList.addAll(yoVar.c());
            if (k == l || str.charAt(k) == '#') {
                String d2 = yoVar.d();
                this.i = d2 != null ? vg.q(vg.g(d2, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int d3 = y70.d(k, l, str, "?#");
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
                int d4 = y70.d(k, d3, str, "/\\");
                boolean z3 = d4 < d3;
                String g2 = vg.g(str, k, d4, " \"<>^`{}|/\\?#", 240);
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
            int e2 = y70.e(str, '#', d3, l);
            this.i = vg.q(vg.g(str, d3 + 1, e2, " \"'<>#", 208));
            d3 = e2;
        }
        if (d3 >= l || str.charAt(d3) != '#') {
            return;
        }
        this.g = vg.g(str, d3 + 1, l, "", 176);
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
                    if (l40.f0(str2, ':')) {
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
                    jp R = op.R(op.W(0, arrayList2.size()), 2);
                    int i3 = R.f;
                    int i4 = R.g;
                    int i5 = R.h;
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

    public xo(n20 n20Var) {
        this.a = 1;
        e();
        a(StateSet.WILD_CARD, n20Var);
    }
}
