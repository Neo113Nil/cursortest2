package m1;

import B1.v;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.A;
import kotlin.text.u;
import kotlin.text.y;
import z2.C1442z;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8279a;

    /* renamed from: b, reason: collision with root package name */
    public int f8280b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8281c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8282d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f8283e;

    /* renamed from: f, reason: collision with root package name */
    public Object f8284f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8285g;

    /* renamed from: h, reason: collision with root package name */
    public Serializable f8286h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8287i;

    public k(int i2) {
        this.f8279a = i2;
        switch (i2) {
            case 1:
                this.f8284f = "";
                this.f8285g = "";
                this.f8280b = -1;
                ArrayList arrayList = new ArrayList();
                this.f8281c = arrayList;
                arrayList.add("");
                break;
            default:
                this.f8281c = new ArrayList();
                this.f8284f = new l2.g(2);
                new ArrayList();
                this.f8285g = null;
                new v(2, this);
                this.f8286h = new AtomicInteger();
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                Collections.synchronizedMap(new HashMap());
                this.f8283e = new ArrayList();
                new E1.i(this);
                new CopyOnWriteArrayList();
                new h(this, 0);
                new h(this, 1);
                new h(this, 2);
                new h(this, 3);
                this.f8280b = -1;
                this.f8287i = new H1.f(18, false);
                new ArrayDeque();
                new G1.j(5, this);
                break;
        }
    }

    public static boolean n(g gVar) {
        if (gVar == null) {
            return true;
        }
        return gVar.f8265j;
    }

    public void a(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f8282d == null) {
            this.f8282d = new ArrayList();
        }
        ArrayList arrayList = this.f8282d;
        Intrinsics.c(arrayList);
        arrayList.add(m3.j.b(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        ArrayList arrayList2 = this.f8282d;
        Intrinsics.c(arrayList2);
        arrayList2.add(str != null ? m3.j.b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
    }

    public m3.m b() {
        ArrayList arrayList;
        String str = (String) this.f8283e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e4 = m3.j.e((String) this.f8284f, 0, 0, false, 7);
        String e5 = m3.j.e((String) this.f8285g, 0, 0, false, 7);
        String str2 = (String) this.f8286h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int k4 = k();
        ArrayList arrayList2 = this.f8281c;
        ArrayList arrayList3 = new ArrayList(C1442z.h(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(m3.j.e((String) it.next(), 0, 0, false, 7));
        }
        ArrayList<String> arrayList4 = this.f8282d;
        if (arrayList4 != null) {
            arrayList = new ArrayList(C1442z.h(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? m3.j.e(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f8287i;
        return new m3.m(str, e4, e5, str2, k4, arrayList3, arrayList, str4 != null ? m3.j.e(str4, 0, 0, false, 7) : null, toString());
    }

    public void c(boolean z4) {
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && z4) {
                gVar.f8264i.c(true);
            }
        }
    }

    public boolean d() {
        if (this.f8280b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && n(gVar) && gVar.f8264i.d()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gVar);
                z4 = true;
            }
        }
        if (this.f8282d != null) {
            for (int i2 = 0; i2 < this.f8282d.size(); i2++) {
                g gVar2 = (g) this.f8282d.get(i2);
                if (arrayList == null || !arrayList.contains(gVar2)) {
                    gVar2.getClass();
                }
            }
        }
        this.f8282d = arrayList;
        return z4;
    }

    public void e(boolean z4) {
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && z4) {
                gVar.f8264i.e(true);
            }
        }
    }

    public void f(boolean z4, boolean z5) {
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && z5) {
                gVar.f8264i.f(z4, true);
            }
        }
    }

    public boolean g() {
        if (this.f8280b < 1) {
            return false;
        }
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && gVar.f8264i.g()) {
                return true;
            }
        }
        return false;
    }

    public void h() {
        if (this.f8280b < 1) {
            return;
        }
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null) {
                gVar.f8264i.h();
            }
        }
    }

    public void i(boolean z4, boolean z5) {
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && z5) {
                gVar.f8264i.i(z4, true);
            }
        }
    }

    public boolean j() {
        boolean z4 = false;
        if (this.f8280b < 1) {
            return false;
        }
        for (g gVar : ((l2.g) this.f8284f).i()) {
            if (gVar != null && n(gVar) && gVar.f8264i.j()) {
                z4 = true;
            }
        }
        return z4;
    }

    public int k() {
        int i2 = this.f8280b;
        if (i2 != -1) {
            return i2;
        }
        String scheme = (String) this.f8283e;
        Intrinsics.c(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.a(scheme, "http")) {
            return 80;
        }
        return Intrinsics.a(scheme, "https") ? 443 : -1;
    }

    public void l(String str) {
        String b4;
        this.f8282d = (str == null || (b4 = m3.j.b(str, 0, 0, " \"'<>#", true, false, true, false, 211)) == null) ? null : m3.j.g(b4);
    }

    public void m() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0263, code lost:
    
        if (r1 < 65536) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x007e, code lost:
    
        if (r7 == ':') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(m3.m mVar, String input) {
        int i2;
        String str;
        int i4;
        int i5;
        char c4;
        char c5;
        int i6;
        int e4;
        char charAt;
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        String str2;
        boolean z4;
        int i10;
        int i11;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList2;
        int e5;
        ArrayList arrayList3;
        char charAt2;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = n3.b.f8558a;
        int m4 = n3.b.m(input, 0, input.length());
        int n2 = n3.b.n(input, m4, input.length());
        char c6 = 65535;
        if (n2 - m4 >= 2) {
            char charAt3 = input.charAt(m4);
            char c7 = 'a';
            if ((Intrinsics.e(charAt3, 97) >= 0 && Intrinsics.e(charAt3, 122) <= 0) || (Intrinsics.e(charAt3, 65) >= 0 && Intrinsics.e(charAt3, 90) <= 0)) {
                i2 = m4 + 1;
                while (true) {
                    if (i2 >= n2) {
                        break;
                    }
                    char charAt4 = input.charAt(i2);
                    if ((c7 <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                        i2++;
                        c7 = 'a';
                    }
                }
                String str6 = "http";
                String str7 = "https";
                String str8 = "this as java.lang.String…ing(startIndex, endIndex)";
                if (i2 == -1) {
                    if (u.m(m4, input, "https:", true)) {
                        this.f8283e = "https";
                        m4 += 6;
                    } else {
                        if (!u.m(m4, input, "http:", true)) {
                            StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                            String substring = input.substring(0, i2);
                            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb.append(substring);
                            sb.append('\'');
                            throw new IllegalArgumentException(sb.toString());
                        }
                        this.f8283e = "http";
                        m4 += 5;
                    }
                } else {
                    if (mVar == null) {
                        if (input.length() > 6) {
                            str = A.P(6, input) + "...";
                        } else {
                            str = input;
                        }
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str);
                    }
                    this.f8283e = mVar.f8393a;
                }
                i4 = m4;
                i5 = 0;
                while (true) {
                    c4 = '/';
                    c5 = '\\';
                    if (i4 >= n2 || !((charAt2 = input.charAt(i4)) == '\\' || charAt2 == '/')) {
                        break;
                    }
                    i5++;
                    i4++;
                }
                ArrayList arrayList4 = this.f8281c;
                char c8 = '#';
                if (i5 < 2 && mVar != null) {
                    if (Intrinsics.a(mVar.f8393a, (String) this.f8283e)) {
                        this.f8284f = mVar.e();
                        this.f8285g = mVar.a();
                        this.f8286h = mVar.f8396d;
                        this.f8280b = mVar.f8397e;
                        arrayList4.clear();
                        arrayList4.addAll(mVar.c());
                        if (m4 == n2 || input.charAt(m4) == '#') {
                            l(mVar.d());
                        }
                        arrayList = arrayList4;
                        z4 = false;
                        e5 = n3.b.e(m4, n2, input, "?#");
                        if (m4 != e5) {
                            char charAt5 = input.charAt(m4);
                            if (charAt5 == '/' || charAt5 == '\\') {
                                arrayList3 = arrayList;
                                arrayList3.clear();
                                arrayList3.add("");
                                m4++;
                            } else {
                                arrayList3 = arrayList;
                                arrayList3.set(arrayList.size() - 1, "");
                            }
                            int i12 = m4;
                            while (i12 < e5) {
                                int e6 = n3.b.e(i12, e5, input, "/\\");
                                boolean z5 = e6 < e5 ? true : z4;
                                String b4 = m3.j.b(input, i12, e6, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                                if (!Intrinsics.a(b4, ".")) {
                                    if (!u.i(true, b4, "%2e")) {
                                        if (!Intrinsics.a(b4, "..") && !u.i(true, b4, "%2e.") && !u.i(true, b4, ".%2e") && !u.i(true, b4, "%2e%2e")) {
                                            if (((CharSequence) arrayList3.get(arrayList3.size() - 1)).length() == 0) {
                                                arrayList3.set(arrayList3.size() - 1, b4);
                                            } else {
                                                arrayList3.add(b4);
                                            }
                                            if (z5) {
                                                arrayList3.add("");
                                            }
                                        } else if (((String) arrayList3.remove(arrayList3.size() - 1)).length() != 0 || arrayList3.isEmpty()) {
                                            arrayList3.add("");
                                        } else {
                                            arrayList3.set(arrayList3.size() - 1, "");
                                        }
                                    }
                                    i12 = !z5 ? e6 + 1 : e6;
                                }
                                if (!z5) {
                                }
                            }
                        }
                        if (e5 < n2 && input.charAt(e5) == '?') {
                            int f4 = n3.b.f(input, '#', e5, n2);
                            this.f8282d = m3.j.g(m3.j.b(input, e5 + 1, f4, " \"'<>#", true, false, true, false, 208));
                            e5 = f4;
                        }
                        if (e5 < n2 || input.charAt(e5) != '#') {
                            return;
                        }
                        this.f8287i = m3.j.b(input, e5 + 1, n2, "", true, false, false, true, 176);
                        return;
                    }
                }
                i6 = m4 + i5;
                boolean z6 = false;
                boolean z7 = false;
                while (true) {
                    e4 = n3.b.e(i6, n2, input, "@/\\?#");
                    charAt = e4 == n2 ? input.charAt(e4) : c6;
                    if (charAt == c6 || charAt == c8 || charAt == c4 || charAt == c5 || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z6) {
                            i11 = e4;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            this.f8285g = ((String) this.f8285g) + "%40" + m3.j.b(input, i6, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        } else {
                            int f5 = n3.b.f(input, ':', i6, e4);
                            i11 = e4;
                            str3 = str8;
                            str4 = str7;
                            str5 = str6;
                            arrayList2 = arrayList4;
                            String b5 = m3.j.b(input, i6, f5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z7) {
                                b5 = ((String) this.f8284f) + "%40" + b5;
                            }
                            this.f8284f = b5;
                            if (f5 != i11) {
                                this.f8285g = m3.j.b(input, f5 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z6 = true;
                            }
                            z7 = true;
                        }
                        i6 = i11 + 1;
                        arrayList4 = arrayList2;
                        str8 = str3;
                        str7 = str4;
                        str6 = str5;
                        c8 = '#';
                        c5 = '\\';
                        c6 = 65535;
                        c4 = '/';
                    }
                }
                String str9 = str8;
                String str10 = str7;
                String str11 = str6;
                arrayList = arrayList4;
                i7 = i6;
                while (true) {
                    if (i7 >= e4) {
                        i8 = e4;
                        break;
                    }
                    char charAt6 = input.charAt(i7);
                    if (charAt6 == '[') {
                        do {
                            i7++;
                            if (i7 >= e4) {
                                break;
                            }
                        } while (input.charAt(i7) != ']');
                    } else if (charAt6 == ':') {
                        i8 = i7;
                        break;
                    }
                    i7++;
                }
                i9 = i8 + 1;
                if (i9 >= e4) {
                    this.f8286h = m3.u.j(m3.j.e(input, i6, i8, false, 4));
                    int i13 = i6;
                    try {
                        i10 = Integer.parseInt(m3.j.b(input, i9, e4, "", false, false, false, false, 248));
                        if (1 <= i10) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    i10 = -1;
                    this.f8280b = i10;
                    if (i10 == -1) {
                        StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                        String substring2 = input.substring(i9, e4);
                        Intrinsics.checkNotNullExpressionValue(substring2, str9);
                        sb2.append(substring2);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    str2 = str9;
                    i6 = i13;
                    z4 = false;
                } else {
                    str2 = str9;
                    z4 = false;
                    this.f8286h = m3.u.j(m3.j.e(input, i6, i8, false, 4));
                    String scheme = (String) this.f8283e;
                    Intrinsics.c(scheme);
                    Intrinsics.checkNotNullParameter(scheme, "scheme");
                    this.f8280b = Intrinsics.a(scheme, str11) ? 80 : Intrinsics.a(scheme, str10) ? 443 : -1;
                }
                if (((String) this.f8286h) != null) {
                    StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                    String substring3 = input.substring(i6, i8);
                    Intrinsics.checkNotNullExpressionValue(substring3, str2);
                    sb3.append(substring3);
                    sb3.append('\"');
                    throw new IllegalArgumentException(sb3.toString().toString());
                }
                m4 = e4;
                e5 = n3.b.e(m4, n2, input, "?#");
                if (m4 != e5) {
                }
                if (e5 < n2) {
                    int f42 = n3.b.f(input, '#', e5, n2);
                    this.f8282d = m3.j.g(m3.j.b(input, e5 + 1, f42, " \"'<>#", true, false, true, false, 208));
                    e5 = f42;
                }
                if (e5 < n2) {
                    return;
                } else {
                    return;
                }
            }
        }
        i2 = -1;
        String str62 = "http";
        String str72 = "https";
        String str82 = "this as java.lang.String…ing(startIndex, endIndex)";
        if (i2 == -1) {
        }
        i4 = m4;
        i5 = 0;
        while (true) {
            c4 = '/';
            c5 = '\\';
            if (i4 >= n2) {
                break;
            } else {
                break;
            }
            i5++;
            i4++;
        }
        ArrayList arrayList42 = this.f8281c;
        char c82 = '#';
        if (i5 < 2) {
            if (Intrinsics.a(mVar.f8393a, (String) this.f8283e)) {
            }
        }
        i6 = m4 + i5;
        boolean z62 = false;
        boolean z72 = false;
        while (true) {
            e4 = n3.b.e(i6, n2, input, "@/\\?#");
            if (e4 == n2) {
            }
            if (charAt == c6) {
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
            if (i7 >= e4) {
            }
            i7++;
        }
        i9 = i8 + 1;
        if (i9 >= e4) {
        }
        if (((String) this.f8286h) != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a9, code lost:
    
        if (r1 != r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        switch (this.f8279a) {
            case 0:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                StringBuilder out = new StringBuilder();
                String str = (String) this.f8283e;
                if (str != null) {
                    out.append(str);
                    out.append("://");
                } else {
                    out.append("//");
                }
                if (((String) this.f8284f).length() > 0 || ((String) this.f8285g).length() > 0) {
                    out.append((String) this.f8284f);
                    if (((String) this.f8285g).length() > 0) {
                        out.append(':');
                        out.append((String) this.f8285g);
                    }
                    out.append('@');
                }
                String str2 = (String) this.f8286h;
                if (str2 != null) {
                    if (y.o(str2, ':')) {
                        out.append('[');
                        out.append((String) this.f8286h);
                        out.append(']');
                    } else {
                        out.append((String) this.f8286h);
                    }
                }
                int i2 = -1;
                if (this.f8280b != -1 || ((String) this.f8283e) != null) {
                    int k4 = k();
                    String scheme = (String) this.f8283e;
                    if (scheme != null) {
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        if (scheme.equals("http")) {
                            i2 = 80;
                            break;
                        } else if (scheme.equals("https")) {
                            i2 = 443;
                            break;
                        }
                    }
                    out.append(':');
                    out.append(k4);
                }
                ArrayList arrayList = this.f8281c;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                Intrinsics.checkNotNullParameter(out, "out");
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    out.append('/');
                    out.append((String) arrayList.get(i4));
                }
                if (this.f8282d != null) {
                    out.append('?');
                    ArrayList arrayList2 = this.f8282d;
                    Intrinsics.c(arrayList2);
                    Intrinsics.checkNotNullParameter(arrayList2, "<this>");
                    Intrinsics.checkNotNullParameter(out, "out");
                    kotlin.ranges.a g4 = kotlin.ranges.b.g(kotlin.ranges.b.h(0, arrayList2.size()), 2);
                    int i5 = g4.f7505d;
                    int i6 = g4.f7506e;
                    int i7 = g4.f7507i;
                    if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                        while (true) {
                            String str3 = (String) arrayList2.get(i5);
                            String str4 = (String) arrayList2.get(i5 + 1);
                            if (i5 > 0) {
                                out.append('&');
                            }
                            out.append(str3);
                            if (str4 != null) {
                                out.append('=');
                                out.append(str4);
                            }
                            if (i5 != i6) {
                                i5 += i7;
                            }
                        }
                    }
                }
                if (((String) this.f8287i) != null) {
                    out.append('#');
                    out.append((String) this.f8287i);
                }
                String sb2 = out.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
        }
    }
}
