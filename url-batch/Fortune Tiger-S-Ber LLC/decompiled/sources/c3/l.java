package c3;

import android.util.StateSet;
import g2.b0;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1069a;

    /* renamed from: b, reason: collision with root package name */
    public int f1070b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f1071d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f1072e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1073f;
    public Object g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1074i;

    public l(g2.o oVar) {
        this.f1069a = 1;
        e();
        a(StateSet.WILD_CARD, oVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [g2.o[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, g2.o oVar) {
        int i4 = this.f1070b;
        if (i4 == 0 || iArr.length == 0) {
            this.c = oVar;
        }
        int[][] iArr2 = (int[][]) this.f1071d;
        if (i4 >= iArr2.length) {
            int i5 = i4 + 10;
            ?? r3 = new int[i5][];
            System.arraycopy(iArr2, 0, r3, 0, i4);
            this.f1071d = r3;
            ?? r12 = new g2.o[i5];
            System.arraycopy((g2.o[]) this.f1072e, 0, r12, 0, i4);
            this.f1072e = r12;
        }
        int[][] iArr3 = (int[][]) this.f1071d;
        int i6 = this.f1070b;
        iArr3[i6] = iArr;
        ((g2.o[]) this.f1072e)[i6] = oVar;
        this.f1070b = i6 + 1;
    }

    public m b() {
        ArrayList arrayList;
        String str = (String) this.c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e4 = b.e((String) this.f1071d, 0, 0, 7);
        String e5 = b.e((String) this.f1072e, 0, 0, 7);
        String str2 = (String) this.f1073f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int d4 = d();
        ArrayList arrayList2 = (ArrayList) this.h;
        ArrayList arrayList3 = new ArrayList(n2.i.E(arrayList2));
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            arrayList3.add(b.e((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.f1074i;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(n2.i.E(arrayList4));
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.g;
        return new m(str, e4, e5, str2, d4, arrayList3, arrayList, str4 != null ? b.e(str4, 0, 0, 7) : null, toString());
    }

    public b0 c() {
        if (this.f1070b == 0) {
            return null;
        }
        return new b0(this);
    }

    public int d() {
        int i4 = this.f1070b;
        if (i4 != -1) {
            return i4;
        }
        String str = (String) this.c;
        u2.c.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [g2.o[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.c = new g2.o();
        this.f1071d = new int[10][];
        this.f1072e = new g2.o[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x020f, code lost:
    
        if (r8 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r13 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(m mVar, String str) {
        int i4;
        int e4;
        int i5;
        char charAt;
        ArrayList arrayList = (ArrayList) this.h;
        byte[] bArr = d3.c.f1490a;
        int k4 = d3.c.k(str, 0, str.length());
        int l4 = d3.c.l(str, k4, str.length());
        if (l4 - k4 >= 2) {
            char charAt2 = str.charAt(k4);
            if ((u2.c.f(charAt2, 97) >= 0 && u2.c.f(charAt2, 122) <= 0) || (u2.c.f(charAt2, 65) >= 0 && u2.c.f(charAt2, 90) <= 0)) {
                i4 = k4 + 1;
                while (true) {
                    if (i4 >= l4) {
                        break;
                    }
                    char charAt3 = str.charAt(i4);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i4++;
                    }
                }
            }
        }
        i4 = -1;
        if (i4 == -1) {
            if (mVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? b3.e.p0(str, 6).concat("...") : str));
            }
            this.c = mVar.f1076a;
        } else if (b3.m.a0(str, "https:", k4, true)) {
            this.c = "https";
            k4 += 6;
        } else {
            if (!b3.m.a0(str, "http:", k4, true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = str.substring(0, i4);
                u2.c.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.c = "http";
            k4 += 5;
        }
        int i6 = 0;
        for (int i7 = k4; i7 < l4 && ((charAt = str.charAt(i7)) == '\\' || charAt == '/'); i7++) {
            i6++;
        }
        char c = '#';
        if (i6 >= 2 || mVar == null || !u2.c.a(mVar.f1076a, (String) this.c)) {
            int i8 = k4 + i6;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                e4 = d3.c.e(str, "@/\\?#", i8, l4);
                char charAt4 = e4 != l4 ? str.charAt(e4) : (char) 65535;
                if (charAt4 == 65535 || charAt4 == c || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z3) {
                        this.f1072e = ((String) this.f1072e) + "%40" + b.b(str, i8, e4, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z3 = z3;
                    } else {
                        boolean z5 = z3;
                        int d4 = d3.c.d(str, ':', i8, e4);
                        String b2 = b.b(str, i8, d4, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z4) {
                            b2 = ((String) this.f1071d) + "%40" + b2;
                        }
                        this.f1071d = b2;
                        if (d4 != e4) {
                            this.f1072e = b.b(str, d4 + 1, e4, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z3 = true;
                        } else {
                            z3 = z5;
                        }
                        z4 = true;
                    }
                    i8 = e4 + 1;
                    c = '#';
                }
            }
            int i9 = i8;
            while (true) {
                if (i9 >= e4) {
                    i9 = e4;
                    break;
                }
                char charAt5 = str.charAt(i9);
                if (charAt5 != '[') {
                    if (charAt5 == ':') {
                        break;
                    }
                } else {
                    do {
                        i9++;
                        if (i9 >= e4) {
                            break;
                        }
                    } while (str.charAt(i9) != ']');
                }
                i9++;
            }
            int i10 = i9 + 1;
            if (i10 < e4) {
                this.f1073f = k3.d.i0(b.e(str, i8, i9, 4));
                try {
                    i5 = Integer.parseInt(b.b(str, i10, e4, "", 248));
                    if (1 <= i5) {
                    }
                } catch (NumberFormatException unused) {
                }
                i5 = -1;
                this.f1070b = i5;
                if (i5 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String substring2 = str.substring(i10, e4);
                    u2.c.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f1073f = k3.d.i0(b.e(str, i8, i9, 4));
                String str2 = (String) this.c;
                u2.c.b(str2);
                this.f1070b = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.f1073f) == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String substring3 = str.substring(i8, i9);
                u2.c.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            k4 = e4;
        } else {
            this.f1071d = mVar.e();
            this.f1072e = mVar.a();
            this.f1073f = mVar.f1078d;
            this.f1070b = mVar.f1079e;
            arrayList.clear();
            arrayList.addAll(mVar.c());
            if (k4 == l4 || str.charAt(k4) == '#') {
                String d5 = mVar.d();
                this.f1074i = d5 != null ? b.f(b.b(d5, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int e5 = d3.c.e(str, "?#", k4, l4);
        if (k4 != e5) {
            char charAt6 = str.charAt(k4);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                k4++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (k4 < e5) {
                int e6 = d3.c.e(str, "/\\", k4, e5);
                boolean z6 = e6 < e5;
                String b4 = b.b(str, k4, e6, " \"<>^`{}|/\\?#", 240);
                if (!b4.equals(".") && !b4.equalsIgnoreCase("%2e")) {
                    if (!b4.equals("..") && !b4.equalsIgnoreCase("%2e.") && !b4.equalsIgnoreCase(".%2e") && !b4.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, b4);
                        } else {
                            arrayList.add(b4);
                        }
                        if (z6) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                k4 = z6 ? e6 + 1 : e6;
            }
        }
        if (e5 < l4 && str.charAt(e5) == '?') {
            int d6 = d3.c.d(str, '#', e5, l4);
            this.f1074i = b.f(b.b(str, e5 + 1, d6, " \"'<>#", 208));
            e5 = d6;
        }
        if (e5 >= l4 || str.charAt(e5) != '#') {
            return;
        }
        this.g = b.b(str, e5 + 1, l4, "", 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f1069a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f1071d).length() > 0 || ((String) this.f1072e).length() > 0) {
                    sb.append((String) this.f1071d);
                    if (((String) this.f1072e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f1072e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f1073f;
                if (str2 != null) {
                    if (b3.e.c0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f1073f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f1073f);
                    }
                }
                int i4 = -1;
                if (this.f1070b != -1 || ((String) this.c) != null) {
                    int d4 = d();
                    String str3 = (String) this.c;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i4 = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i4 = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(d4);
                }
                ArrayList arrayList = (ArrayList) this.h;
                u2.c.e(arrayList, "<this>");
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i5));
                }
                if (((ArrayList) this.f1074i) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f1074i;
                    u2.c.b(arrayList2);
                    y2.a x3 = l0.g.x(l0.g.z(0, arrayList2.size()), 2);
                    int i6 = x3.f3617f;
                    int i7 = x3.g;
                    int i8 = x3.h;
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
                            if (i6 != i7) {
                                i6 += i8;
                            }
                        }
                    }
                }
                if (((String) this.g) != null) {
                    sb.append('#');
                    sb.append((String) this.g);
                }
                String sb2 = sb.toString();
                u2.c.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public l(int i4) {
        this.f1069a = i4;
        switch (i4) {
            case 1:
                break;
            default:
                this.f1071d = "";
                this.f1072e = "";
                this.f1070b = -1;
                ArrayList arrayList = new ArrayList();
                this.h = arrayList;
                arrayList.add("");
                break;
        }
    }
}
