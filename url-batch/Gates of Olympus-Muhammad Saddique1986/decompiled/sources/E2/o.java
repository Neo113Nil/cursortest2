package E2;

import B.C0011l;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final C0011l f1079b;

    /* renamed from: c, reason: collision with root package name */
    public String f1080c;

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f1081d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1082e;

    public o(String str) {
        f2.j.f(str, "source");
        C0011l c0011l = new C0011l(1, (byte) 0);
        c0011l.f422f = new Object[8];
        int[] iArr = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr[i3] = -1;
        }
        c0011l.f423g = iArr;
        c0011l.f421e = -1;
        this.f1079b = c0011l;
        this.f1081d = new StringBuilder();
        this.f1082e = str;
    }

    public static /* synthetic */ void n(o oVar, String str, int i3, String str2, int i4) {
        if ((i4 & 2) != 0) {
            i3 = oVar.f1078a;
        }
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        oVar.m(i3, str, str2);
        throw null;
    }

    public final int a(CharSequence charSequence, int i3) {
        int i4 = i3 + 4;
        if (i4 < charSequence.length()) {
            this.f1081d.append((char) (p(charSequence, i3 + 3) + (p(charSequence, i3) << 12) + (p(charSequence, i3 + 1) << 8) + (p(charSequence, i3 + 2) << 4)));
            return i4;
        }
        this.f1078a = i3;
        if (i4 < charSequence.length()) {
            return a(charSequence, this.f1078a);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i3 = this.f1078a;
        if (i3 == -1) {
            return false;
        }
        while (true) {
            String str = this.f1082e;
            if (i3 >= str.length()) {
                this.f1078a = i3;
                return false;
            }
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f1078a = i3;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i3++;
        }
    }

    public final void c(String str, int i3) {
        String str2 = this.f1082e;
        if (str2.length() - i3 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != (str2.charAt(i3 + i4) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f1078a = str.length() + i3;
    }

    public final String d() {
        g('\"');
        int i3 = this.f1078a;
        String str = this.f1082e;
        int H3 = AbstractC0730j.H(str, '\"', i3, false, 4);
        if (H3 == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i4 = i3;
        while (i4 < H3) {
            if (str.charAt(i4) == '\\') {
                int i5 = this.f1078a;
                char charAt = str.charAt(i4);
                boolean z3 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        this.f1081d.append((CharSequence) str, i5, i4);
                        int t3 = t(i4 + 1);
                        if (t3 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i6 = t3 + 1;
                        char charAt2 = str.charAt(t3);
                        if (charAt2 == 'u') {
                            i6 = a(str, i6);
                        } else {
                            char c2 = charAt2 < 'u' ? a.f1044a[charAt2] : (char) 0;
                            if (c2 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.f1081d.append(c2);
                        }
                        i5 = t(i6);
                        if (i5 == -1) {
                            n(this, "Unexpected EOF", i5, null, 4);
                            throw null;
                        }
                    } else {
                        i4++;
                        if (i4 >= str.length()) {
                            this.f1081d.append((CharSequence) str, i5, i4);
                            i5 = t(i4);
                            if (i5 == -1) {
                                n(this, "Unexpected EOF", i5, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i4);
                        }
                    }
                    i4 = i5;
                    z3 = true;
                    charAt = str.charAt(i4);
                }
                String obj = !z3 ? str.subSequence(i5, i4).toString() : l(i5, i4);
                this.f1078a = i4 + 1;
                return obj;
            }
            i4++;
        }
        this.f1078a = H3 + 1;
        String substring = str.substring(i3, H3);
        f2.j.e(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        String str;
        int i3 = this.f1078a;
        while (true) {
            str = this.f1082e;
            if (i3 == -1 || i3 >= str.length()) {
                break;
            }
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f1078a = i4;
                return h.d(charAt);
            }
            i3 = i4;
        }
        this.f1078a = str.length();
        return (byte) 10;
    }

    public final byte f(byte b3) {
        byte e3 = e();
        if (e3 == b3) {
            return e3;
        }
        o(b3, true);
        throw null;
    }

    public void g(char c2) {
        int i3 = this.f1078a;
        if (i3 == -1) {
            x(c2);
            throw null;
        }
        while (true) {
            String str = this.f1082e;
            if (i3 >= str.length()) {
                this.f1078a = -1;
                x(c2);
                throw null;
            }
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f1078a = i4;
                if (charAt == c2) {
                    return;
                }
                x(c2);
                throw null;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        n(r19, "Unexpected symbol '" + r5 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
    
        if (r3 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        if (r18.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        n(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        n(r19, r17, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        r19.f1078a = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014f, code lost:
    
        if (r13 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
    
        if (r16 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        r8 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
    
        n(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0160, code lost:
    
        if (r16 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a4, code lost:
    
        throw new C1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
    
        if (r14 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        if (r8 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01af, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b7, code lost:
    
        n(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011b, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h() {
        boolean z3;
        String str;
        String str2;
        boolean z4;
        int t3 = t(u());
        String str3 = this.f1082e;
        String str4 = "EOF";
        if (t3 < str3.length() && t3 != -1) {
            if (str3.charAt(t3) == '\"') {
                t3++;
                if (t3 == str3.length()) {
                    n(this, "EOF", 0, null, 6);
                    throw null;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            int i3 = t3;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            long j3 = 0;
            long j4 = 0;
            while (true) {
                if (i3 == str3.length()) {
                    str = str3;
                    str2 = str4;
                    z4 = z7;
                    break;
                }
                char charAt = str3.charAt(i3);
                if ((charAt != 'e' && charAt != 'E') || z5) {
                    str2 = str4;
                    z4 = z7;
                    if (charAt == '-' && z5) {
                        if (i3 == t3) {
                            n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i3++;
                        str4 = str2;
                        z7 = false;
                    } else if (charAt != '+' || !z5) {
                        str = str3;
                        if (charAt != '-') {
                            if (h.d(charAt) != 0) {
                                break;
                            }
                            i3++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z5) {
                                j4 = (j4 * 10) + i4;
                            } else {
                                j3 = (j3 * 10) - i4;
                                if (j3 > 0) {
                                    n(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            z7 = z4;
                            str4 = str2;
                            str3 = str;
                        } else {
                            if (i3 != t3) {
                                n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                            i3++;
                            z7 = z4;
                            str4 = str2;
                            str3 = str;
                            z6 = true;
                        }
                    } else {
                        if (i3 == t3) {
                            n(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i3++;
                        str4 = str2;
                    }
                } else {
                    if (i3 == t3) {
                        n(this, "Unexpected symbol " + charAt + " in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i3++;
                    z5 = true;
                }
                z7 = true;
            }
        } else {
            n(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public final String i() {
        String str = this.f1080c;
        if (str == null) {
            return d();
        }
        f2.j.c(str);
        this.f1080c = null;
        return str;
    }

    public final String j() {
        String str = this.f1080c;
        if (str != null) {
            f2.j.c(str);
            this.f1080c = null;
            return str;
        }
        int u3 = u();
        String str2 = this.f1082e;
        if (u3 >= str2.length() || u3 == -1) {
            n(this, "EOF", u3, null, 4);
            throw null;
        }
        byte d3 = h.d(str2.charAt(u3));
        if (d3 == 1) {
            return i();
        }
        if (d3 != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(u3), 0, null, 6);
            throw null;
        }
        boolean z3 = false;
        while (h.d(str2.charAt(u3)) == 0) {
            u3++;
            if (u3 >= str2.length()) {
                this.f1081d.append((CharSequence) str2, this.f1078a, u3);
                int t3 = t(u3);
                if (t3 == -1) {
                    this.f1078a = u3;
                    return l(0, 0);
                }
                u3 = t3;
                z3 = true;
            }
        }
        String obj = !z3 ? str2.subSequence(this.f1078a, u3).toString() : l(this.f1078a, u3);
        this.f1078a = u3;
        return obj;
    }

    public final String k() {
        String j3 = j();
        if (f2.j.a(j3, "null")) {
            if (this.f1082e.charAt(this.f1078a - 1) != '\"') {
                n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return j3;
    }

    public final String l(int i3, int i4) {
        this.f1081d.append((CharSequence) this.f1082e, i3, i4);
        StringBuilder sb = this.f1081d;
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public final void m(int i3, String str, String str2) {
        f2.j.f(str, "message");
        f2.j.f(str2, "hint");
        throw h.a(i3, str + " at path: " + this.f1079b.f() + (str2.length() == 0 ? "" : "\n".concat(str2)), this.f1082e);
    }

    public final void o(byte b3, boolean z3) {
        String k3 = h.k(b3);
        int i3 = z3 ? this.f1078a - 1 : this.f1078a;
        int i4 = this.f1078a;
        String str = this.f1082e;
        n(this, "Expected " + k3 + ", but had '" + ((i4 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    public final int p(CharSequence charSequence, int i3) {
        char charAt = charSequence.charAt(i3);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String q(String str, boolean z3) {
        f2.j.f(str, "keyToMatch");
        int i3 = this.f1078a;
        try {
            if (e() != 6) {
                return null;
            }
            if (!f2.j.a(s(z3), str)) {
                return null;
            }
            this.f1080c = null;
            if (e() != 5) {
                return null;
            }
            return s(z3);
        } finally {
            this.f1078a = i3;
            this.f1080c = null;
        }
    }

    public byte r() {
        int i3 = this.f1078a;
        while (true) {
            int t3 = t(i3);
            if (t3 == -1) {
                this.f1078a = t3;
                return (byte) 10;
            }
            char charAt = this.f1082e.charAt(t3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f1078a = t3;
                return h.d(charAt);
            }
            i3 = t3 + 1;
        }
    }

    public final String s(boolean z3) {
        String i3;
        byte r3 = r();
        if (z3) {
            if (r3 != 1 && r3 != 0) {
                return null;
            }
            i3 = j();
        } else {
            if (r3 != 1) {
                return null;
            }
            i3 = i();
        }
        this.f1080c = i3;
        return i3;
    }

    public final int t(int i3) {
        if (i3 < this.f1082e.length()) {
            return i3;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) this.f1082e);
        sb.append("', currentPosition=");
        return A.k.j(sb, this.f1078a, ')');
    }

    public int u() {
        char charAt;
        int i3 = this.f1078a;
        if (i3 == -1) {
            return i3;
        }
        while (true) {
            String str = this.f1082e;
            if (i3 >= str.length() || !((charAt = str.charAt(i3)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i3++;
        }
        this.f1078a = i3;
        return i3;
    }

    public final boolean v() {
        int u3 = u();
        String str = this.f1082e;
        if (u3 >= str.length() || u3 == -1 || str.charAt(u3) != ',') {
            return false;
        }
        this.f1078a++;
        return true;
    }

    public final boolean w(boolean z3) {
        int t3 = t(u());
        String str = this.f1082e;
        int length = str.length() - t3;
        if (length < 4 || t3 == -1) {
            return false;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if ("null".charAt(i3) != str.charAt(t3 + i3)) {
                return false;
            }
        }
        if (length > 4 && h.d(str.charAt(t3 + 4)) == 0) {
            return false;
        }
        if (!z3) {
            return true;
        }
        this.f1078a = t3 + 4;
        return true;
    }

    public final void x(char c2) {
        int i3 = this.f1078a;
        if (i3 > 0 && c2 == '\"') {
            try {
                this.f1078a = i3 - 1;
                String j3 = j();
                this.f1078a = i3;
                if (f2.j.a(j3, "null")) {
                    m(this.f1078a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f1078a = i3;
                throw th;
            }
        }
        o(h.d(c2), true);
        throw null;
    }
}
