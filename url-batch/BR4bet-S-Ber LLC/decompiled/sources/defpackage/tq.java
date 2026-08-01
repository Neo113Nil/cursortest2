package defpackage;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tq {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public tq(int i) {
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

    /* JADX WARN: Type inference failed for: r1v4, types: [f50[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, f50 f50Var) {
        int i = this.b;
        if (i == 0 || iArr.length == 0) {
            this.c = f50Var;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            ?? r3 = new int[i2][];
            System.arraycopy(iArr2, 0, r3, 0, i);
            this.d = r3;
            ?? r1 = new f50[i2];
            System.arraycopy((f50[]) this.e, 0, r1, 0, i);
            this.e = r1;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i3 = this.b;
        iArr3[i3] = iArr;
        ((f50[]) this.e)[i3] = f50Var;
        this.b = i3 + 1;
    }

    public uq b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            g9.s("scheme == null");
            return null;
        }
        String n = ej.n((String) this.d, 0, 0, 7);
        String n2 = ej.n((String) this.e, 0, 0, 7);
        String str2 = (String) this.f;
        if (str2 == null) {
            g9.s("host == null");
            return null;
        }
        int d = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(yb.k0(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(ej.n((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(yb.k0(arrayList4));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? ej.n(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new uq(str, n, n2, str2, d, arrayList3, arrayList, str4 != null ? ej.n(str4, 0, 0, 7) : null, toString());
    }

    public a70 c() {
        if (this.b == 0) {
            return null;
        }
        return new a70(this);
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

    /* JADX WARN: Type inference failed for: r0v2, types: [f50[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new f50();
        this.d = new int[10][];
        this.e = new f50[10];
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
    public void f(uq uqVar, String str) {
        int i;
        int d;
        int i2;
        char charAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = cb0.a;
        int k = cb0.k(str, 0, str.length());
        int l = cb0.l(str, k, str.length());
        char c = 65535;
        if (l - k >= 2) {
            char charAt2 = str.charAt(k);
            if ((kr.k(charAt2, 97) >= 0 && kr.k(charAt2, 122) <= 0) || (kr.k(charAt2, 65) >= 0 && kr.k(charAt2, 90) <= 0)) {
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
            if (uqVar == null) {
                g9.i("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? f70.f0(str, 6).concat("...") : str));
                return;
            }
            this.c = uqVar.a;
        } else if (n70.T(str, "https:", k, true)) {
            this.c = "https";
            k += 6;
        } else {
            if (!n70.T(str, "http:", k, true)) {
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
        if (i3 >= 2 || uqVar == null || !kr.b(uqVar.a, (String) this.c)) {
            int i5 = k + i3;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                d = cb0.d(i5, l, str, "@/\\?#");
                char charAt4 = d != l ? str.charAt(d) : c;
                if (charAt4 == c || charAt4 == c2 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z) {
                        this.e = ((String) this.e) + "%40" + ej.f(str, i5, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                    } else {
                        int e = cb0.e(str, ':', i5, d);
                        String f = ej.f(str, i5, e, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z2) {
                            f = ((String) this.d) + "%40" + f;
                        }
                        this.d = f;
                        if (e != d) {
                            this.e = ej.f(str, e + 1, d, " \"':;<=>@[]^`{}|/\\?#", 240);
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
                this.f = la0.e0(ej.n(str, i5, i6, 4));
                try {
                    i2 = Integer.parseInt(ej.f(str, i7, d, "", 248));
                    if (1 <= i2) {
                    }
                } catch (NumberFormatException unused) {
                }
                i2 = -1;
                this.b = i2;
                if (i2 == -1) {
                    g9.h(str.substring(i7, d), "Invalid URL port: \"");
                    return;
                }
            } else {
                int i8 = -1;
                this.f = la0.e0(ej.n(str, i5, i6, 4));
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
                g9.h(str.substring(i5, i6), "Invalid URL host: \"");
                return;
            }
            k = d;
        } else {
            this.d = uqVar.e();
            this.e = uqVar.a();
            this.f = uqVar.d;
            this.b = uqVar.e;
            arrayList.clear();
            arrayList.addAll(uqVar.c());
            if (k == l || str.charAt(k) == '#') {
                String d2 = uqVar.d();
                this.i = d2 != null ? ej.o(ej.f(d2, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int d3 = cb0.d(k, l, str, "?#");
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
                int d4 = cb0.d(k, d3, str, "/\\");
                boolean z3 = d4 < d3;
                String f2 = ej.f(str, k, d4, " \"<>^`{}|/\\?#", 240);
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
            int e2 = cb0.e(str, '#', d3, l);
            this.i = ej.o(ej.f(str, d3 + 1, e2, " \"'<>#", 208));
            d3 = e2;
        }
        if (d3 >= l || str.charAt(d3) != '#') {
            return;
        }
        this.g = ej.f(str, d3 + 1, l, "", 176);
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
                    if (f70.V(str2, ':')) {
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
                    gr O = mz.O(mz.Q(0, arrayList2.size()), 2);
                    int i3 = O.f;
                    int i4 = O.g;
                    int i5 = O.h;
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

    public tq(f50 f50Var) {
        this.a = 1;
        e();
        a(StateSet.WILD_CARD, f50Var);
    }
}
