package t;

import H2.AbstractC0080b;
import h2.AbstractC0447i;
import java.io.Serializable;
import java.util.ArrayList;
import k.C0523b;
import u.C0940h;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7670a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f7671b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7672c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f7673d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f7674e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7675f;

    public u(g gVar) {
        this.f7672c = gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0523b(0, 0));
        this.f7673d = arrayList;
        this.f7674e = new ArrayList();
        this.f7675f = M1.u.f2803d;
    }

    public static /* synthetic */ void n(u uVar, String str, int i3, String str2, int i4) {
        if ((i4 & 2) != 0) {
            i3 = uVar.f7671b;
        }
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        uVar.m(str, i3, str2);
        throw null;
    }

    public boolean A(boolean z3) {
        int w3 = w(x());
        String str = (String) this.f7675f;
        int length = str.length() - w3;
        if (length < 4 || w3 == -1) {
            return false;
        }
        for (int i3 = 0; i3 < 4; i3++) {
            if ("null".charAt(i3) != str.charAt(w3 + i3)) {
                return false;
            }
        }
        if (length > 4 && y2.e.d(str.charAt(w3 + 4)) == 0) {
            return false;
        }
        if (!z3) {
            return true;
        }
        this.f7671b = w3 + 4;
        return true;
    }

    public void B(char c3) {
        int i3 = this.f7671b;
        if (i3 > 0 && c3 == '\"') {
            try {
                this.f7671b = i3 - 1;
                String j3 = j();
                this.f7671b = i3;
                if (Z1.i.a(j3, "null")) {
                    m("Expected string literal but 'null' literal was found", this.f7671b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f7671b = i3;
                throw th;
            }
        }
        o(y2.e.d(c3), true);
        throw null;
    }

    public int a(CharSequence charSequence, int i3) {
        int i4 = i3 + 4;
        if (i4 < charSequence.length()) {
            ((StringBuilder) this.f7674e).append((char) (p(charSequence, i3 + 3) + (p(charSequence, i3) << 12) + (p(charSequence, i3 + 1) << 8) + (p(charSequence, i3 + 2) << 4)));
            return i4;
        }
        this.f7671b = i3;
        if (i4 < charSequence.length()) {
            return a(charSequence, this.f7671b);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i3 = this.f7671b;
        if (i3 == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f7675f;
            if (i3 >= str.length()) {
                this.f7671b = i3;
                return false;
            }
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f7671b = i3;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i3++;
        }
    }

    public void c(String str, int i3) {
        String str2 = (String) this.f7675f;
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
        this.f7671b = str.length() + i3;
    }

    public String d() {
        g('\"');
        int i3 = this.f7671b;
        String str = (String) this.f7675f;
        int q0 = AbstractC0447i.q0(str, '\"', i3, false, 4);
        if (q0 == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i4 = i3;
        while (i4 < q0) {
            if (str.charAt(i4) == '\\') {
                int i5 = this.f7671b;
                char charAt = str.charAt(i4);
                boolean z3 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f7674e).append((CharSequence) str, i5, i4);
                        int w3 = w(i4 + 1);
                        if (w3 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i6 = w3 + 1;
                        char charAt2 = str.charAt(w3);
                        if (charAt2 == 'u') {
                            i6 = a(str, i6);
                        } else {
                            char c3 = charAt2 < 'u' ? y2.a.f8831a[charAt2] : (char) 0;
                            if (c3 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f7674e).append(c3);
                        }
                        i5 = w(i6);
                        if (i5 == -1) {
                            n(this, "Unexpected EOF", i5, null, 4);
                            throw null;
                        }
                    } else {
                        i4++;
                        if (i4 >= str.length()) {
                            ((StringBuilder) this.f7674e).append((CharSequence) str, i5, i4);
                            i5 = w(i4);
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
                this.f7671b = i4 + 1;
                return obj;
            }
            i4++;
        }
        this.f7671b = q0 + 1;
        String substring = str.substring(i3, q0);
        Z1.i.e(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        String str;
        int i3 = this.f7671b;
        while (true) {
            str = (String) this.f7675f;
            if (i3 == -1 || i3 >= str.length()) {
                break;
            }
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f7671b = i4;
                return y2.e.d(charAt);
            }
            i3 = i4;
        }
        this.f7671b = str.length();
        return (byte) 10;
    }

    public byte f(byte b2) {
        byte e3 = e();
        if (e3 == b2) {
            return e3;
        }
        o(b2, true);
        throw null;
    }

    public void g(char c3) {
        int i3 = this.f7671b;
        if (i3 == -1) {
            B(c3);
            throw null;
        }
        while (true) {
            String str = (String) this.f7675f;
            if (i3 >= str.length()) {
                this.f7671b = -1;
                B(c3);
                throw null;
            }
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f7671b = i4;
                if (charAt == c3) {
                    return;
                }
                B(c3);
                throw null;
            }
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        n(r19, "Unexpected symbol '" + r5 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012c, code lost:
    
        if (r3 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0138, code lost:
    
        if (r18.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013d, code lost:
    
        n(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        n(r19, r17, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
    
        r19.f7671b = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0151, code lost:
    
        if (r13 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0156, code lost:
    
        if (r16 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017c, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017e, code lost:
    
        r8 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        n(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        if (r16 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
    
        throw new L1.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        if (r14 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ae, code lost:
    
        if (r8 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b2, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
    
        n(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011d, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long h() {
        boolean z3;
        String str;
        String str2;
        boolean z4;
        int w3 = w(x());
        String str3 = (String) this.f7675f;
        String str4 = "EOF";
        if (w3 < str3.length() && w3 != -1) {
            if (str3.charAt(w3) == '\"') {
                w3++;
                if (w3 == str3.length()) {
                    n(this, "EOF", 0, null, 6);
                    throw null;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            int i3 = w3;
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
                        if (i3 == w3) {
                            n(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i3++;
                        str4 = str2;
                        z7 = false;
                    } else if (charAt != '+' || !z5) {
                        str = str3;
                        if (charAt != '-') {
                            if (y2.e.d(charAt) != 0) {
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
                            if (i3 != w3) {
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
                        if (i3 == w3) {
                            n(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i3++;
                        str4 = str2;
                    }
                } else {
                    if (i3 == w3) {
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

    public String i() {
        String str = (String) this.f7673d;
        if (str == null) {
            return d();
        }
        Z1.i.c(str);
        this.f7673d = null;
        return str;
    }

    public String j() {
        String str = (String) this.f7673d;
        if (str != null) {
            Z1.i.c(str);
            this.f7673d = null;
            return str;
        }
        int x3 = x();
        String str2 = (String) this.f7675f;
        if (x3 >= str2.length() || x3 == -1) {
            n(this, "EOF", x3, null, 4);
            throw null;
        }
        byte d3 = y2.e.d(str2.charAt(x3));
        if (d3 == 1) {
            return i();
        }
        if (d3 != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(x3), 0, null, 6);
            throw null;
        }
        boolean z3 = false;
        while (y2.e.d(str2.charAt(x3)) == 0) {
            x3++;
            if (x3 >= str2.length()) {
                ((StringBuilder) this.f7674e).append((CharSequence) str2, this.f7671b, x3);
                int w3 = w(x3);
                if (w3 == -1) {
                    this.f7671b = x3;
                    return l(0, 0);
                }
                x3 = w3;
                z3 = true;
            }
        }
        String obj = !z3 ? str2.subSequence(this.f7671b, x3).toString() : l(this.f7671b, x3);
        this.f7671b = x3;
        return obj;
    }

    public String k() {
        String j3 = j();
        if (Z1.i.a(j3, "null")) {
            if (((String) this.f7675f).charAt(this.f7671b - 1) != '\"') {
                n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return j3;
    }

    public String l(int i3, int i4) {
        ((StringBuilder) this.f7674e).append((CharSequence) this.f7675f, i3, i4);
        StringBuilder sb = (StringBuilder) this.f7674e;
        String sb2 = sb.toString();
        Z1.i.e(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void m(String str, int i3, String str2) {
        Z1.i.f(str, "message");
        Z1.i.f(str2, "hint");
        throw y2.e.a(i3, str + " at path: " + ((F2.h) this.f7672c).g() + (str2.length() == 0 ? "" : "\n".concat(str2)), (String) this.f7675f);
    }

    public void o(byte b2, boolean z3) {
        String k3 = y2.e.k(b2);
        int i3 = z3 ? this.f7671b - 1 : this.f7671b;
        int i4 = this.f7671b;
        String str = (String) this.f7675f;
        n(this, "Expected " + k3 + ", but had '" + ((i4 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3))) + "' instead", i3, null, 4);
        throw null;
    }

    public int p(CharSequence charSequence, int i3) {
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

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public E2.n q(int i3) {
        Object obj;
        ((g) this.f7672c).getClass();
        int i4 = this.f7671b;
        int i5 = i3 * i4;
        int s3 = s() - i5;
        if (i4 > s3) {
            i4 = s3;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 == this.f7675f.size()) {
            obj = this.f7675f;
        } else {
            ArrayList arrayList = new ArrayList(i4);
            for (int i6 = 0; i6 < i4; i6++) {
                arrayList.add(new C0892b(1));
            }
            this.f7675f = arrayList;
            obj = arrayList;
        }
        return new E2.n(i5, obj, 6);
    }

    public int r(int i3) {
        if (s() <= 0) {
            return 0;
        }
        if (i3 >= s()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        ((g) this.f7672c).getClass();
        return i3 / this.f7671b;
    }

    public int s() {
        return ((g) this.f7672c).f7585i.f1502e;
    }

    public String t(String str, boolean z3) {
        Z1.i.f(str, "keyToMatch");
        int i3 = this.f7671b;
        try {
            if (e() != 6) {
                return null;
            }
            if (!Z1.i.a(v(z3), str)) {
                return null;
            }
            this.f7673d = null;
            if (e() != 5) {
                return null;
            }
            return v(z3);
        } finally {
            this.f7671b = i3;
            this.f7673d = null;
        }
    }

    public String toString() {
        switch (this.f7670a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f7675f);
                sb.append("', currentPosition=");
                return AbstractC0080b.k(sb, this.f7671b, ')');
            default:
                return super.toString();
        }
    }

    public byte u() {
        int i3 = this.f7671b;
        while (true) {
            int w3 = w(i3);
            if (w3 == -1) {
                this.f7671b = w3;
                return (byte) 10;
            }
            char charAt = ((String) this.f7675f).charAt(w3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f7671b = w3;
                return y2.e.d(charAt);
            }
            i3 = w3 + 1;
        }
    }

    public String v(boolean z3) {
        String i3;
        byte u3 = u();
        if (z3) {
            if (u3 != 1 && u3 != 0) {
                return null;
            }
            i3 = j();
        } else {
            if (u3 != 1) {
                return null;
            }
            i3 = i();
        }
        this.f7673d = i3;
        return i3;
    }

    public int w(int i3) {
        if (i3 < ((String) this.f7675f).length()) {
            return i3;
        }
        return -1;
    }

    public int x() {
        char charAt;
        int i3 = this.f7671b;
        if (i3 == -1) {
            return i3;
        }
        while (true) {
            String str = (String) this.f7675f;
            if (i3 >= str.length() || !((charAt = str.charAt(i3)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i3++;
        }
        this.f7671b = i3;
        return i3;
    }

    public int y(int i3) {
        t tVar = t.f7669a;
        C0940h e3 = ((g) this.f7672c).f7585i.e(i3);
        return (int) ((C0892b) ((e) e3.f8068c).f7578b.g(tVar, Integer.valueOf(i3 - e3.f8066a))).f7571a;
    }

    public boolean z() {
        int x3 = x();
        String str = (String) this.f7675f;
        if (x3 >= str.length() || x3 == -1 || str.charAt(x3) != ',') {
            return false;
        }
        this.f7671b++;
        return true;
    }

    public u(String str) {
        Z1.i.f(str, "source");
        F2.h hVar = new F2.h(5, (byte) 0);
        hVar.f1503f = new Object[8];
        int[] iArr = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr[i3] = -1;
        }
        hVar.f1504g = iArr;
        hVar.f1502e = -1;
        this.f7672c = hVar;
        this.f7674e = new StringBuilder();
        this.f7675f = str;
    }
}
