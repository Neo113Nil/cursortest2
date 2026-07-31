package G2;

import android.content.Intent;
import com.gatesof.olympus.martu.marku.App;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k2.C0570b;
import m.y0;
import n2.AbstractC0730j;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2205a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2206b;

    /* renamed from: c, reason: collision with root package name */
    public int f2207c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f2208d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2209e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2210f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2211g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2212h;

    /* renamed from: i, reason: collision with root package name */
    public Serializable f2213i;

    public m(App app, A1.i iVar, y0 y0Var, ArrayList arrayList, int i3, Intent intent, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        this.f2205a = 1;
        f2.j.f(y0Var, "migrationContainer");
        A.k.s("journalMode", i3);
        this.f2209e = app;
        this.f2210f = iVar;
        this.f2211g = y0Var;
        this.f2206b = arrayList;
        this.f2207c = i3;
        this.f2212h = intent;
        this.f2208d = arrayList2;
        this.f2213i = arrayList3;
    }

    public n a() {
        ArrayList arrayList;
        String str = (String) this.f2209e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e3 = b.e((String) this.f2210f, 0, 0, false, 7);
        String e4 = b.e((String) this.f2211g, 0, 0, false, 7);
        String str2 = (String) this.f2212h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b3 = b();
        ArrayList arrayList2 = this.f2206b;
        ArrayList arrayList3 = new ArrayList(S1.n.E0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(b.e((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f2208d;
        if (arrayList4 != null) {
            arrayList = new ArrayList(S1.n.E0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? b.e(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f2213i;
        return new n(str, e3, e4, str2, b3, arrayList3, arrayList, str4 != null ? b.e(str4, 0, 0, false, 7) : null, toString());
    }

    public int b() {
        int i3 = this.f2207c;
        if (i3 != -1) {
            return i3;
        }
        String str = (String) this.f2209e;
        f2.j.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0279, code lost:
    
        if (r1 < 65536) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0079, code lost:
    
        if (r7 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(n nVar, String str) {
        int i3;
        int i4;
        int i5;
        char c2;
        char c3;
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
        byte[] bArr = H2.b.f2632a;
        int m3 = H2.b.m(0, str.length(), str);
        int n3 = H2.b.n(m3, str.length(), str);
        char c4 = 65535;
        if (n3 - m3 >= 2) {
            char charAt3 = str.charAt(m3);
            char c5 = 'a';
            if ((f2.j.g(charAt3, 97) >= 0 && f2.j.g(charAt3, 122) <= 0) || (f2.j.g(charAt3, 65) >= 0 && f2.j.g(charAt3, 90) <= 0)) {
                i3 = m3 + 1;
                while (true) {
                    if (i3 >= n3) {
                        break;
                    }
                    char charAt4 = str.charAt(i3);
                    if ((c5 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i3++;
                        c5 = 'a';
                    }
                }
                String str6 = "http";
                String str7 = "https";
                String str8 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i3 == -1) {
                    if (AbstractC0737q.y(str, "https:", m3, true)) {
                        this.f2209e = "https";
                        m3 += 6;
                    } else {
                        if (!AbstractC0737q.y(str, "http:", m3, true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = str.substring(0, i3);
                            f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f2209e = "http";
                        m3 += 5;
                    }
                } else {
                    if (nVar == null) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? AbstractC0730j.X(str, 6).concat("...") : str));
                    }
                    this.f2209e = nVar.f2215a;
                }
                i4 = m3;
                i5 = 0;
                while (true) {
                    c2 = '/';
                    c3 = '\\';
                    if (i4 >= n3 || !((charAt2 = str.charAt(i4)) == '\\' || charAt2 == '/')) {
                        break;
                    }
                    i5++;
                    i4++;
                }
                ArrayList arrayList4 = this.f2206b;
                char c6 = '#';
                if (i5 < 2 && nVar != null) {
                    if (f2.j.a(nVar.f2215a, (String) this.f2209e)) {
                        this.f2210f = nVar.e();
                        this.f2211g = nVar.a();
                        this.f2212h = nVar.f2218d;
                        this.f2207c = nVar.f2219e;
                        arrayList4.clear();
                        arrayList4.addAll(nVar.c());
                        if (m3 == n3 || str.charAt(m3) == '#') {
                            String d3 = nVar.d();
                            this.f2208d = d3 != null ? b.f(b.b(d3, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
                        }
                        arrayList = arrayList4;
                        z3 = false;
                        e4 = H2.b.e(m3, n3, str, "?#");
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
                                int e5 = H2.b.e(i12, e4, str, "/\\");
                                boolean z4 = e5 < e4 ? true : z3;
                                String b3 = b.b(str, i12, e5, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!b3.equals(".") && !b3.equalsIgnoreCase("%2e")) {
                                    if (b3.equals("..") || b3.equalsIgnoreCase("%2e.") || b3.equalsIgnoreCase(".%2e") || b3.equalsIgnoreCase("%2e%2e")) {
                                        if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                        i12 = !z4 ? e5 + 1 : e5;
                                    } else {
                                        if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                            arrayList3.set(arrayList3.size() - 1, b3);
                                        } else {
                                            arrayList3.add(b3);
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
                            int f3 = H2.b.f(str, '#', e4, n3);
                            this.f2208d = b.f(b.b(str, e4 + 1, f3, " \"'<>#", true, false, true, false, 208));
                            e4 = f3;
                        }
                        if (e4 < n3 || str.charAt(e4) != '#') {
                            return;
                        }
                        this.f2213i = b.b(str, e4 + 1, n3, "", true, false, false, true, 176);
                        return;
                    }
                }
                i6 = m3 + i5;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    e3 = H2.b.e(i6, n3, str, "@/\\?#");
                    charAt = e3 == n3 ? str.charAt(e3) : c4;
                    if (charAt == c4 || charAt == c6 || charAt == c2 || charAt == c3 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z5) {
                            i11 = e3;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            this.f2211g = ((String) this.f2211g) + "%40" + b.b(str, i6, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        } else {
                            int f4 = H2.b.f(str, ':', i6, e3);
                            i11 = e3;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            String b4 = b.b(str, i6, f4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z6) {
                                b4 = ((String) this.f2210f) + "%40" + b4;
                            }
                            this.f2210f = b4;
                            if (f4 != i11) {
                                this.f2211g = b.b(str, f4 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z5 = true;
                            }
                            z6 = true;
                        }
                        i6 = i11 + 1;
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
                    this.f2212h = O2.l.w0(b.e(str, i6, i8, false, 4));
                    int i13 = i6;
                    try {
                        i10 = Integer.parseInt(b.b(str, i9, e3, "", false, false, false, false, 248));
                        if (1 <= i10) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.f2207c = i10;
                    if (i10 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = str.substring(i9, e3);
                        f2.j.e(substring2, str9);
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
                    this.f2212h = O2.l.w0(b.e(str, i6, i8, false, 4));
                    String str12 = (String) this.f2209e;
                    f2.j.c(str12);
                    this.f2207c = str12.equals(str11) ? 80 : str12.equals(str10) ? 443 : -1;
                }
                if (((String) this.f2212h) != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = str.substring(i6, i8);
                    f2.j.e(substring3, str2);
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                m3 = e3;
                e4 = H2.b.e(m3, n3, str, "?#");
                if (m3 != e4) {
                }
                if (e4 < n3) {
                    int f32 = H2.b.f(str, '#', e4, n3);
                    this.f2208d = b.f(b.b(str, e4 + 1, f32, " \"'<>#", true, false, true, false, 208));
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
            c2 = '/';
            c3 = '\\';
            if (i4 >= n3) {
                break;
            } else {
                break;
            }
            i5++;
            i4++;
        }
        ArrayList arrayList42 = this.f2206b;
        char c62 = '#';
        if (i5 < 2) {
            if (f2.j.a(nVar.f2215a, (String) this.f2209e)) {
            }
        }
        i6 = m3 + i5;
        boolean z52 = false;
        boolean z62 = false;
        while (true) {
            e3 = H2.b.e(i6, n3, str, "@/\\?#");
            if (e3 == n3) {
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
        i7 = i6;
        while (true) {
            if (i7 >= e3) {
            }
            i7++;
        }
        i9 = i8 + 1;
        if (i9 >= e3) {
        }
        if (((String) this.f2212h) != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        switch (this.f2205a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                String str = (String) this.f2209e;
                if (str != null) {
                    sb.append(str);
                    sb.append("://");
                } else {
                    sb.append("//");
                }
                if (((String) this.f2210f).length() > 0 || ((String) this.f2211g).length() > 0) {
                    sb.append((String) this.f2210f);
                    if (((String) this.f2211g).length() > 0) {
                        sb.append(':');
                        sb.append((String) this.f2211g);
                    }
                    sb.append('@');
                }
                String str2 = (String) this.f2212h;
                if (str2 != null) {
                    if (AbstractC0730j.B(str2, ':')) {
                        sb.append('[');
                        sb.append((String) this.f2212h);
                        sb.append(']');
                    } else {
                        sb.append((String) this.f2212h);
                    }
                }
                int i3 = -1;
                if (this.f2207c != -1 || ((String) this.f2209e) != null) {
                    int b3 = b();
                    String str3 = (String) this.f2209e;
                    if (str3 != null) {
                        if (str3.equals("http")) {
                            i3 = 80;
                            break;
                        } else if (str3.equals("https")) {
                            i3 = 443;
                            break;
                        }
                    }
                    sb.append(':');
                    sb.append(b3);
                }
                ArrayList arrayList = this.f2206b;
                f2.j.f(arrayList, "<this>");
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    sb.append('/');
                    sb.append((String) arrayList.get(i4));
                }
                if (this.f2208d != null) {
                    sb.append('?');
                    ArrayList arrayList2 = this.f2208d;
                    f2.j.c(arrayList2);
                    C0570b e02 = O2.d.e0(O2.d.g0(0, arrayList2.size()), 2);
                    int i5 = e02.f6419d;
                    int i6 = e02.f6420e;
                    int i7 = e02.f6421f;
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
                if (((String) this.f2213i) != null) {
                    sb.append('#');
                    sb.append((String) this.f2213i);
                }
                String sb2 = sb.toString();
                f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public m() {
        this.f2205a = 0;
        this.f2210f = "";
        this.f2211g = "";
        this.f2207c = -1;
        ArrayList arrayList = new ArrayList();
        this.f2206b = arrayList;
        arrayList.add("");
    }
}
