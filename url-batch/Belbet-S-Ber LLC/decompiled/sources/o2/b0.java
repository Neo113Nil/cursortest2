package o2;

import android.util.StateSet;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2920a;

    /* renamed from: b, reason: collision with root package name */
    public int f2921b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2922c;
    public Serializable d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f2923e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2924f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2925g;
    public Object h;
    public Object i;

    public b0(o oVar) {
        this.f2920a = 0;
        e();
        a(StateSet.WILD_CARD, oVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object, o2.o[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[][], java.io.Serializable, java.lang.Object] */
    public void a(int[] iArr, o oVar) {
        int i = this.f2921b;
        if (i == 0 || iArr.length == 0) {
            this.f2922c = oVar;
        }
        int[][] iArr2 = (int[][]) this.d;
        if (i >= iArr2.length) {
            int i4 = i + 10;
            ?? r32 = new int[i4][];
            System.arraycopy(iArr2, 0, r32, 0, i);
            this.d = r32;
            ?? r12 = new o[i4];
            System.arraycopy((o[]) this.f2923e, 0, r12, 0, i);
            this.f2923e = r12;
        }
        int[][] iArr3 = (int[][]) this.d;
        int i5 = this.f2921b;
        iArr3[i5] = iArr;
        ((o[]) this.f2923e)[i5] = oVar;
        this.f2921b = i5 + 1;
    }

    public c0 b() {
        if (this.f2921b == 0) {
            return null;
        }
        return new c0(this);
    }

    public t3.k c() {
        ArrayList arrayList;
        String str = (String) this.f2922c;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e4 = t3.b.e((String) this.d, 0, 0, 7);
        String e5 = t3.b.e((String) this.f2923e, 0, 0, 7);
        String str2 = (String) this.f2924f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int d = d();
        ArrayList arrayList2 = (ArrayList) this.f2925g;
        ArrayList arrayList3 = new ArrayList(x2.j.C(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(t3.b.e((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = (ArrayList) this.h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(x2.j.C(arrayList4));
            int size2 = arrayList4.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList4.get(i4);
                i4++;
                String str3 = (String) obj2;
                arrayList5.add(str3 != null ? t3.b.e(str3, 0, 0, 3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new t3.k(str, e4, e5, str2, d, arrayList3, arrayList, str4 != null ? t3.b.e(str4, 0, 0, 7) : null, toString());
    }

    public int d() {
        int i = this.f2921b;
        if (i != -1) {
            return i;
        }
        String str = (String) this.f2922c;
        i3.d.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, o2.o[]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int[][], java.io.Serializable] */
    public void e() {
        this.f2922c = new o();
        this.d = new int[10][];
        this.f2923e = new o[10];
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
    public void f(t3.k kVar, String str) {
        int i;
        int d;
        int i4;
        char charAt;
        ArrayList arrayList = (ArrayList) this.f2925g;
        byte[] bArr = u3.b.f3581a;
        int k4 = u3.b.k(str, 0, str.length());
        int l4 = u3.b.l(str, k4, str.length());
        if (l4 - k4 >= 2) {
            char charAt2 = str.charAt(k4);
            if ((i3.d.f(charAt2, 97) >= 0 && i3.d.f(charAt2, 122) <= 0) || (i3.d.f(charAt2, 65) >= 0 && i3.d.f(charAt2, 90) <= 0)) {
                i = k4 + 1;
                while (true) {
                    if (i >= l4) {
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
            if (kVar == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? p3.d.D0(str, 6).concat("...") : str));
            }
            this.f2922c = kVar.f3455a;
        } else if (p3.l.p0(str, "https:", k4, true)) {
            this.f2922c = "https";
            k4 += 6;
        } else {
            if (!p3.l.p0(str, "http:", k4, true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = str.substring(0, i);
                i3.d.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f2922c = "http";
            k4 += 5;
        }
        int i5 = 0;
        for (int i6 = k4; i6 < l4 && ((charAt = str.charAt(i6)) == '\\' || charAt == '/'); i6++) {
            i5++;
        }
        char c5 = '#';
        if (i5 >= 2 || kVar == null || !i3.d.a(kVar.f3455a, (String) this.f2922c)) {
            int i7 = k4 + i5;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                d = u3.b.d(i7, l4, str, "@/\\?#");
                char charAt4 = d != l4 ? str.charAt(d) : (char) 65535;
                if (charAt4 == 65535 || charAt4 == c5 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z4) {
                        this.f2923e = ((String) this.f2923e) + "%40" + t3.b.b(str, i7, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z4 = z4;
                    } else {
                        boolean z6 = z4;
                        int e4 = u3.b.e(str, ':', i7, d);
                        String b2 = t3.b.b(str, i7, e4, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z5) {
                            b2 = ((String) this.d) + "%40" + b2;
                        }
                        this.d = b2;
                        if (e4 != d) {
                            this.f2923e = t3.b.b(str, e4 + 1, d, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z4 = true;
                        } else {
                            z4 = z6;
                        }
                        z5 = true;
                    }
                    i7 = d + 1;
                    c5 = '#';
                }
            }
            int i8 = i7;
            while (true) {
                if (i8 >= d) {
                    i8 = d;
                    break;
                }
                char charAt5 = str.charAt(i8);
                if (charAt5 != '[') {
                    if (charAt5 == ':') {
                        break;
                    }
                } else {
                    do {
                        i8++;
                        if (i8 >= d) {
                            break;
                        }
                    } while (str.charAt(i8) != ']');
                }
                i8++;
            }
            int i9 = i8 + 1;
            if (i9 < d) {
                this.f2924f = s.a.z(t3.b.e(str, i7, i8, 4));
                try {
                    i4 = Integer.parseInt(t3.b.b(str, i9, d, "", 248));
                    if (1 <= i4) {
                    }
                } catch (NumberFormatException unused) {
                }
                i4 = -1;
                this.f2921b = i4;
                if (i4 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String substring2 = str.substring(i9, d);
                    i3.d.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f2924f = s.a.z(t3.b.e(str, i7, i8, 4));
                String str2 = (String) this.f2922c;
                i3.d.b(str2);
                this.f2921b = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (((String) this.f2924f) == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String substring3 = str.substring(i7, i8);
                i3.d.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            k4 = d;
        } else {
            this.d = kVar.e();
            this.f2923e = kVar.a();
            this.f2924f = kVar.d;
            this.f2921b = kVar.f3458e;
            arrayList.clear();
            arrayList.addAll(kVar.c());
            if (k4 == l4 || str.charAt(k4) == '#') {
                String d5 = kVar.d();
                this.h = d5 != null ? t3.b.f(t3.b.b(d5, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int d6 = u3.b.d(k4, l4, str, "?#");
        if (k4 != d6) {
            char charAt6 = str.charAt(k4);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                k4++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (k4 < d6) {
                int d7 = u3.b.d(k4, d6, str, "/\\");
                boolean z7 = d7 < d6;
                String b5 = t3.b.b(str, k4, d7, " \"<>^`{}|/\\?#", 240);
                if (!b5.equals(".") && !b5.equalsIgnoreCase("%2e")) {
                    if (!b5.equals("..") && !b5.equalsIgnoreCase("%2e.") && !b5.equalsIgnoreCase(".%2e") && !b5.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, b5);
                        } else {
                            arrayList.add(b5);
                        }
                        if (z7) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                k4 = z7 ? d7 + 1 : d7;
            }
        }
        if (d6 < l4 && str.charAt(d6) == '?') {
            int e5 = u3.b.e(str, '#', d6, l4);
            this.h = t3.b.f(t3.b.b(str, d6 + 1, e5, " \"'<>#", 208));
            d6 = e5;
        }
        if (d6 >= l4 || str.charAt(d6) != '#') {
            return;
        }
        this.i = t3.b.b(str, d6 + 1, l4, "", 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f2920a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f2922c;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.d).length() > 0 || ((String) this.f2923e).length() > 0) {
                    sb.append((String) this.d);
                    if (((String) this.f2923e).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f2923e);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f2924f;
                if (str2 != null) {
                    if (p3.d.r0(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f2924f);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f2924f);
                    }
                }
                int i = -1;
                if (this.f2921b != -1 || ((String) this.f2922c) != null) {
                    int d = d();
                    String str3 = (String) this.f2922c;
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
                ArrayList arrayList = (ArrayList) this.f2925g;
                i3.d.e(arrayList, "<this>");
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i4));
                }
                if (((ArrayList) this.h) != null) {
                    sb.append('?');
                    ArrayList arrayList2 = (ArrayList) this.h;
                    i3.d.b(arrayList2);
                    m3.a X = b4.d.X(b4.d.Y(0, arrayList2.size()), 2);
                    int i5 = X.f2735f;
                    int i6 = X.f2736g;
                    int i7 = X.h;
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
                            if (i5 != i6) {
                                i5 += i7;
                            }
                        }
                    }
                }
                if (((String) this.i) != null) {
                    sb.append('#');
                    sb.append((String) this.i);
                }
                String sb2 = sb.toString();
                i3.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public b0(int i) {
        this.f2920a = i;
        switch (i) {
            case 1:
                this.d = "";
                this.f2923e = "";
                this.f2921b = -1;
                ArrayList arrayList = new ArrayList();
                this.f2925g = arrayList;
                arrayList.add("");
                break;
        }
    }
}
