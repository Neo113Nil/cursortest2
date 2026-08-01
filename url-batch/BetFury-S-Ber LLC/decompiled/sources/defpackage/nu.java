package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nu {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public nu(int i) {
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

    /* JADX WARN: Type inference failed for: r1v4, types: [gd0[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, gd0 gd0Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = gd0Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new gd0[i2];
            System.arraycopy((gd0[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((gd0[]) this.e)[i3] = gd0Var;
        this.b = i3 + 1;
    }

    public ou b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            s9.u("scheme == null");
            return null;
        }
        String n = sl.n((String) this.d, 0, 0, 7);
        String n2 = sl.n((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            s9.u("host == null");
            return null;
        }
        int d = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(wc.g0(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(sl.n((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(wc.g0(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? sl.n(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new ou(str, n, n2, str2, d, arrayList3, arrayList, str4 != null ? sl.n(str4, 0, 0, 7) : null, toString());
    }

    public gf0 c() {
        if (this.b == 0) {
            return null;
        }
        return new gf0(this);
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

    /* JADX WARN: Type inference failed for: r0v2, types: [gd0[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new gd0();
        this.d = new int[10][];
        this.e = new gd0[10];
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
    public void f(ou ouVar, String str) {
        int i;
        int d;
        int i2;
        char charAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = zk0.a;
        int k = zk0.k(str, 0, str.length());
        int l = zk0.l(str, k, str.length());
        char c = 65535;
        if (l - k >= 2) {
            char charAt2 = str.charAt(k);
            if ((mv.i(charAt2, 97) >= 0 && mv.i(charAt2, 122) <= 0) || (mv.i(charAt2, 65) >= 0 && mv.i(charAt2, 90) <= 0)) {
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
            if (ouVar == null) {
                s9.k("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? mf0.D(str, 6).concat("...") : str));
                return;
            }
            this.c = ouVar.a;
        } else if (uf0.q(str, "https:", k, true)) {
            this.c = "https";
            k += 6;
        } else {
            if (!uf0.q(str, "http:", k, true)) {
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
        if (i3 >= 2 || ouVar == null || !mv.c(ouVar.a, (String) this.c)) {
            int i5 = k + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                d = zk0.d(i5, l, str, "@/\\?#");
                char charAt4 = d != l ? str.charAt(d) : c;
                if (charAt4 == c || charAt4 == c2 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z) {
                        this.e = ((String) this.e) + "%40" + sl.f(str, i5, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                    } else {
                        int e = zk0.e(str, ':', i5, d);
                        String f = sl.f(str, i5, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z2) {
                            f = ((String) this.d) + "%40" + f;
                        }
                        this.d = f;
                        if (e != d) {
                            this.e = sl.f(str, e + 1, d, " \"':;<=>@[]^`{}|/\\?#", 240);
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
                this.f = bi.c0(sl.n(str, i5, i6, 4));
                try {
                    i2 = Integer.parseInt(sl.f(str, i7, d, "", 248));
                    if (1 <= i2) {
                    }
                } catch (NumberFormatException unused) {
                }
                i2 = -1;
                this.b = i2;
                if (i2 == -1) {
                    s9.j(str.substring(i7, d), "Invalid URL port: \"");
                    return;
                }
            } else {
                int i8 = -1;
                this.f = bi.c0(sl.n(str, i5, i6, 4));
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
                s9.j(str.substring(i5, i6), "Invalid URL host: \"");
                return;
            }
            k = d;
        } else {
            this.d = ouVar.e();
            this.e = ouVar.a();
            this.f = ouVar.d;
            this.b = ouVar.e;
            arrayList.clear();
            arrayList.addAll(ouVar.c());
            if (k == l || str.charAt(k) == '#') {
                String d2 = ouVar.d();
                this.i = d2 != null ? sl.o(sl.f(d2, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int d3 = zk0.d(k, l, str, "?#");
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
                int d4 = zk0.d(k, d3, str, "/\\");
                boolean z3 = d4 < d3;
                String f2 = sl.f(str, k, d4, " \"<>^`{}|/\\?#", 240);
                if (!f2.equals(".") && !f2.equalsIgnoreCase("%2e")) {
                    if (!f2.equals("..") && !f2.equalsIgnoreCase("%2e.") && !f2.equalsIgnoreCase(".%2e") && !f2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, f2);
                        } else {
                            arrayList.add(f2);
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
            int e2 = zk0.e(str, '#', d3, l);
            this.i = sl.o(sl.f(str, d3 + 1, e2, " \"'<>#", 208));
            d3 = e2;
        }
        if (d3 >= l || str.charAt(d3) != '#') {
            return;
        }
        this.g = sl.f(str, d3 + 1, l, "", 176);
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
                    if (mf0.s(str2, ':')) {
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
                    hv Z = d50.Z(d50.b0(0, arrayList2.size()), 2);
                    int i3 = Z.f;
                    int i4 = Z.g;
                    int i5 = Z.h;
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

    public nu(gd0 gd0Var) {
        this.a = 1;
        e();
        a(StateSet.WILD_CARD, gd0Var);
    }
}
