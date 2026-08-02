package G3;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import t3.C1441a;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f938a;

    /* renamed from: d, reason: collision with root package name */
    public String f941d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f943f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f944g;

    /* renamed from: h, reason: collision with root package name */
    public String f945h;

    /* renamed from: b, reason: collision with root package name */
    public String f939b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f940c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f942e = -1;

    public o() {
        ArrayList arrayList = new ArrayList();
        this.f943f = arrayList;
        arrayList.add("");
    }

    public final p a() {
        ArrayList arrayList;
        String str = this.f938a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String f4 = C0051b.f(this.f939b, 0, 0, 7);
        String f5 = C0051b.f(this.f940c, 0, 0, 7);
        String str2 = this.f941d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b4 = b();
        ArrayList arrayList2 = this.f943f;
        ArrayList arrayList3 = new ArrayList(d3.k.Y(arrayList2));
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            arrayList3.add(C0051b.f((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.f944g;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(d3.k.Y(arrayList4));
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                String str3 = (String) obj2;
                arrayList.add(str3 == null ? null : C0051b.f(str3, 0, 0, 3));
            }
        }
        String str4 = this.f945h;
        return new p(str, f4, f5, str2, b4, arrayList3, arrayList, str4 != null ? C0051b.f(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i4 = this.f942e;
        if (i4 != -1) {
            return i4;
        }
        String str = this.f938a;
        kotlin.jvm.internal.i.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0209, code lost:
    
        if (r9 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r14 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(p pVar, String str) {
        int i4;
        int e4;
        int i5;
        byte[] bArr = H3.b.f1103a;
        int l4 = H3.b.l(0, str.length(), str);
        int m4 = H3.b.m(l4, str.length(), str);
        if (m4 - l4 >= 2) {
            char charAt = str.charAt(l4);
            if ((kotlin.jvm.internal.i.f(charAt, 97) >= 0 && kotlin.jvm.internal.i.f(charAt, 122) <= 0) || (kotlin.jvm.internal.i.f(charAt, 65) >= 0 && kotlin.jvm.internal.i.f(charAt, 90) <= 0)) {
                i4 = l4 + 1;
                while (true) {
                    if (i4 >= m4) {
                        break;
                    }
                    int i6 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    if (('a' <= charAt2 && charAt2 < '{') || (('A' <= charAt2 && charAt2 < '[') || (('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        i4 = i6;
                    }
                }
            }
        }
        i4 = -1;
        if (i4 != -1) {
            if (w3.o.Z(l4, str, "https:", true)) {
                this.f938a = "https";
                l4 += 6;
            } else {
                if (!w3.o.Z(l4, str, "http:", true)) {
                    StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str.substring(0, i4);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append('\'');
                    throw new IllegalArgumentException(sb.toString());
                }
                this.f938a = "http";
                l4 += 5;
            }
        } else {
            if (pVar == null) {
                throw new IllegalArgumentException(kotlin.jvm.internal.i.h(str.length() > 6 ? kotlin.jvm.internal.i.h("...", AbstractC1510g.q0(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
            }
            this.f938a = pVar.f947a;
        }
        int i7 = l4;
        int i8 = 0;
        while (i7 < m4) {
            int i9 = i7 + 1;
            char charAt3 = str.charAt(i7);
            if (charAt3 != '\\' && charAt3 != '/') {
                break;
            }
            i8++;
            i7 = i9;
        }
        ArrayList arrayList = this.f943f;
        char c4 = '#';
        if (i8 >= 2 || pVar == null || !kotlin.jvm.internal.i.a(pVar.f947a, this.f938a)) {
            int i10 = l4 + i8;
            boolean z = false;
            boolean z4 = false;
            while (true) {
                e4 = H3.b.e(i10, m4, str, "@/\\?#");
                char charAt4 = e4 != m4 ? str.charAt(e4) : (char) 65535;
                if (charAt4 == 65535 || charAt4 == c4 || charAt4 == '/' || charAt4 == '\\' || charAt4 == '?') {
                    break;
                }
                if (charAt4 == '@') {
                    if (z) {
                        this.f940c += "%40" + C0051b.b(str, i10, " \"':;<=>@[]^`{}|/\\?#", e4, 240);
                        z = z;
                    } else {
                        boolean z5 = z;
                        int f4 = H3.b.f(str, ':', i10, e4);
                        String b4 = C0051b.b(str, i10, " \"':;<=>@[]^`{}|/\\?#", f4, 240);
                        if (z4) {
                            b4 = this.f939b + "%40" + b4;
                        }
                        this.f939b = b4;
                        if (f4 != e4) {
                            this.f940c = C0051b.b(str, f4 + 1, " \"':;<=>@[]^`{}|/\\?#", e4, 240);
                            z = true;
                        } else {
                            z = z5;
                        }
                        z4 = true;
                    }
                    i10 = e4 + 1;
                    c4 = '#';
                }
            }
            int i11 = i10;
            while (true) {
                if (i11 >= e4) {
                    i11 = e4;
                    break;
                }
                char charAt5 = str.charAt(i11);
                if (charAt5 == '[') {
                    do {
                        i11++;
                        if (i11 >= e4) {
                            break;
                        }
                    } while (str.charAt(i11) != ']');
                } else if (charAt5 == ':') {
                    break;
                }
                i11++;
            }
            int i12 = i11 + 1;
            if (i12 < e4) {
                this.f941d = O3.l.x(C0051b.f(str, i10, i11, 4));
                try {
                    i5 = Integer.parseInt(C0051b.b(str, i12, "", e4, 248));
                    if (1 <= i5) {
                    }
                } catch (NumberFormatException unused) {
                }
                i5 = -1;
                this.f942e = i5;
                if (i5 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String substring2 = str.substring(i12, e4);
                    kotlin.jvm.internal.i.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f941d = O3.l.x(C0051b.f(str, i10, i11, 4));
                String str2 = this.f938a;
                kotlin.jvm.internal.i.b(str2);
                this.f942e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.f941d == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String substring3 = str.substring(i10, i11);
                kotlin.jvm.internal.i.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            l4 = e4;
        } else {
            this.f939b = pVar.e();
            this.f940c = pVar.a();
            this.f941d = pVar.f950d;
            this.f942e = pVar.f951e;
            arrayList.clear();
            arrayList.addAll(pVar.c());
            if (l4 == m4 || str.charAt(l4) == '#') {
                String d4 = pVar.d();
                this.f944g = d4 == null ? null : C0051b.g(C0051b.b(d4, 0, " \"'<>#", 0, 211));
            }
        }
        int e5 = H3.b.e(l4, m4, str, "?#");
        if (l4 != e5) {
            char charAt6 = str.charAt(l4);
            if (charAt6 == '/' || charAt6 == '\\') {
                arrayList.clear();
                arrayList.add("");
                l4++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (l4 < e5) {
                int e6 = H3.b.e(l4, e5, str, "/\\");
                boolean z6 = e6 < e5;
                String b5 = C0051b.b(str, l4, " \"<>^`{}|/\\?#", e6, 240);
                if (!b5.equals(".") && !b5.equalsIgnoreCase("%2e")) {
                    if (!b5.equals("..") && !b5.equalsIgnoreCase("%2e.") && !b5.equalsIgnoreCase(".%2e") && !b5.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, b5);
                        } else {
                            arrayList.add(b5);
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
                l4 = z6 ? e6 + 1 : e6;
            }
        }
        if (e5 < m4 && str.charAt(e5) == '?') {
            int f5 = H3.b.f(str, '#', e5, m4);
            this.f944g = C0051b.g(C0051b.b(str, e5 + 1, " \"'<>#", f5, 208));
            e5 = f5;
        }
        if (e5 >= m4 || str.charAt(e5) != '#') {
            return;
        }
        this.f945h = C0051b.b(str, e5 + 1, "", m4, 176);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f938a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f939b.length() > 0 || this.f940c.length() > 0) {
            sb.append(this.f939b);
            if (this.f940c.length() > 0) {
                sb.append(':');
                sb.append(this.f940c);
            }
            sb.append('@');
        }
        String str2 = this.f941d;
        if (str2 != null) {
            if (AbstractC1510g.b0(str2, ':')) {
                sb.append('[');
                sb.append(this.f941d);
                sb.append(']');
            } else {
                sb.append(this.f941d);
            }
        }
        int i4 = -1;
        if (this.f942e != -1 || this.f938a != null) {
            int b4 = b();
            String str3 = this.f938a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i4 = 80;
                } else if (str3.equals("https")) {
                    i4 = 443;
                }
            }
            sb.append(':');
            sb.append(b4);
        }
        ArrayList arrayList = this.f943f;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append((String) arrayList.get(i5));
        }
        if (this.f944g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f944g;
            kotlin.jvm.internal.i.b(arrayList2);
            C1441a E4 = O3.d.E(O3.d.H(0, arrayList2.size()), 2);
            int i6 = E4.f15424a;
            int i7 = E4.f15425b;
            int i8 = E4.f15426c;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    int i9 = i6 + i8;
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
                    if (i6 == i7) {
                        break;
                    }
                    i6 = i9;
                }
            }
        }
        if (this.f945h != null) {
            sb.append('#');
            sb.append(this.f945h);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
