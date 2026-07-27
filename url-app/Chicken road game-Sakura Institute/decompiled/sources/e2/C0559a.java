package e2;

import A.AbstractC0017m;
import A.C0016l;
import A.V;
import B1.C0097d;
import G.C0231x;
import b2.C0518b;
import f2.C0632a;
import g2.s;
import g2.t;
import j2.AbstractC0720j;
import j2.C0715e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import l2.C0821a;
import o2.C0924c;
import o2.u;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0559a {

    /* renamed from: g, reason: collision with root package name */
    public static long f6163g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6164a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f6165b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6166c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6167d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6168e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6169f;

    public C0559a(C0560b c0560b, V v4, String str, n nVar, String str2, String str3) {
        long j4 = f6163g;
        f6163g = 1 + j4;
        this.f6166c = v4;
        this.f6168e = nVar;
        this.f6169f = new C0097d(c0560b.f6173d, "Connection", AbstractC0017m.i("conn_", j4), 18);
        this.f6165b = 1;
        this.f6167d = new r(c0560b, v4, str, str3, this, str2);
    }

    public static /* synthetic */ void o(C0559a c0559a, String str, int i2, String str2, int i4) {
        if ((i4 & 2) != 0) {
            i2 = c0559a.f6165b;
        }
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        c0559a.n(i2, str, str2);
        throw null;
    }

    public int A(int i2) {
        if (i2 < ((String) this.f6169f).length()) {
            return i2;
        }
        return -1;
    }

    public int B() {
        char charAt;
        int i2 = this.f6165b;
        if (i2 == -1) {
            return i2;
        }
        while (true) {
            String str = (String) this.f6169f;
            if (i2 >= str.length() || !((charAt = str.charAt(i2)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i2++;
        }
        this.f6165b = i2;
        return i2;
    }

    public boolean C() {
        int B = B();
        String str = (String) this.f6169f;
        if (B >= str.length() || B == -1 || str.charAt(B) != ',') {
            return false;
        }
        this.f6165b++;
        return true;
    }

    public boolean D(boolean z4) {
        int A4 = A(B());
        String str = (String) this.f6169f;
        int length = str.length() - A4;
        if (length < 4 || A4 == -1) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if ("null".charAt(i2) != str.charAt(A4 + i2)) {
                return false;
            }
        }
        if (length > 4 && k3.h.h(str.charAt(A4 + 4)) == 0) {
            return false;
        }
        if (!z4) {
            return true;
        }
        this.f6165b = A4 + 4;
        return true;
    }

    public void E(char c4) {
        int i2 = this.f6165b;
        if (i2 > 0 && c4 == '\"') {
            try {
                this.f6165b = i2 - 1;
                String k4 = k();
                this.f6165b = i2;
                if (Intrinsics.a(k4, "null")) {
                    n(this.f6165b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f6165b = i2;
                throw th;
            }
        }
        p(k3.h.h(c4), true);
        throw null;
    }

    public int a(CharSequence charSequence, int i2) {
        int i4 = i2 + 4;
        if (i4 < charSequence.length()) {
            ((StringBuilder) this.f6168e).append((char) (q(charSequence, i2 + 3) + (q(charSequence, i2) << 12) + (q(charSequence, i2 + 1) << 8) + (q(charSequence, i2 + 2) << 4)));
            return i4;
        }
        this.f6165b = i2;
        if (i4 < charSequence.length()) {
            return a(charSequence, this.f6165b);
        }
        o(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i2 = this.f6165b;
        if (i2 == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f6169f;
            if (i2 >= str.length()) {
                this.f6165b = i2;
                return false;
            }
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f6165b = i2;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i2++;
        }
    }

    public void c(int i2) {
        String str;
        if (this.f6165b != 3) {
            C0097d c0097d = (C0097d) this.f6169f;
            boolean z4 = false;
            if (c0097d.y()) {
                c0097d.d("closing realtime connection", null, new Object[0]);
            }
            this.f6165b = 3;
            r rVar = (r) this.f6167d;
            if (rVar != null) {
                rVar.c();
                this.f6167d = null;
            }
            n nVar = (n) this.f6168e;
            C0097d c0097d2 = nVar.f6235x;
            if (c0097d2.y()) {
                if (i2 == 1) {
                    str = "SERVER_RESET";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str = "OTHER";
                }
                c0097d2.d("Got on disconnect due to ".concat(str), null, new Object[0]);
            }
            nVar.f6219h = EnumC0568j.f6191d;
            nVar.f6218g = null;
            nVar.f6222k.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = nVar.f6224m.entrySet().iterator();
            while (it.hasNext()) {
                l lVar = (l) ((Map.Entry) it.next()).getValue();
                if (lVar.f6202b.containsKey("h") && lVar.f6204d) {
                    arrayList.add(lVar);
                    it.remove();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((l) it2.next()).f6203c.s("disconnected", null);
            }
            if (nVar.f6215d.size() == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = nVar.f6217f;
                long j5 = currentTimeMillis - j4;
                if (j4 > 0 && j5 > 30000) {
                    z4 = true;
                }
                if (i2 == 1 || z4) {
                    C0632a c0632a = nVar.f6236y;
                    c0632a.f6654j = true;
                    c0632a.f6653i = 0L;
                }
                nVar.m();
            }
            nVar.f6217f = 0L;
            g2.h hVar = nVar.f6212a;
            hVar.getClass();
            hVar.g(g2.c.f6682d, Boolean.FALSE);
            M1.a.C(hVar.f6704b);
            ArrayList arrayList2 = new ArrayList();
            E1.i iVar = hVar.f6707e;
            g2.e eVar = g2.e.f6694j;
            iVar.getClass();
            hVar.f6707e = new E1.i(12);
            hVar.b(arrayList2);
        }
    }

    public void d(int i2, String str) {
        String str2 = (String) this.f6169f;
        if (str2.length() - i2 < str.length()) {
            o(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != (str2.charAt(i2 + i4) | ' ')) {
                o(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f6165b = str.length() + i2;
    }

    public String e() {
        h('\"');
        int i2 = this.f6165b;
        String source = (String) this.f6169f;
        int u4 = y.u(source, '\"', i2, false, 4);
        if (u4 == -1) {
            k();
            p((byte) 1, false);
            throw null;
        }
        int i4 = i2;
        while (i4 < u4) {
            if (source.charAt(i4) == '\\') {
                int i5 = this.f6165b;
                Intrinsics.checkNotNullParameter(source, "source");
                char charAt = source.charAt(i4);
                boolean z4 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f6168e).append((CharSequence) source, i5, i4);
                        int A4 = A(i4 + 1);
                        if (A4 == -1) {
                            o(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i6 = A4 + 1;
                        char charAt2 = source.charAt(A4);
                        if (charAt2 == 'u') {
                            i6 = a(source, i6);
                        } else {
                            char c4 = charAt2 < 'u' ? k3.b.f7433a[charAt2] : (char) 0;
                            if (c4 == 0) {
                                o(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f6168e).append(c4);
                        }
                        i5 = A(i6);
                        if (i5 == -1) {
                            o(this, "Unexpected EOF", i5, null, 4);
                            throw null;
                        }
                    } else {
                        i4++;
                        if (i4 >= source.length()) {
                            ((StringBuilder) this.f6168e).append((CharSequence) source, i5, i4);
                            i5 = A(i4);
                            if (i5 == -1) {
                                o(this, "Unexpected EOF", i5, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = source.charAt(i4);
                        }
                    }
                    i4 = i5;
                    z4 = true;
                    charAt = source.charAt(i4);
                }
                String obj = !z4 ? source.subSequence(i5, i4).toString() : m(i5, i4);
                this.f6165b = i4 + 1;
                return obj;
            }
            i4++;
        }
        this.f6165b = u4 + 1;
        String substring = source.substring(i2, u4);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public byte f() {
        String str;
        int i2 = this.f6165b;
        while (true) {
            str = (String) this.f6169f;
            if (i2 == -1 || i2 >= str.length()) {
                break;
            }
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f6165b = i4;
                return k3.h.h(charAt);
            }
            i2 = i4;
        }
        this.f6165b = str.length();
        return (byte) 10;
    }

    public byte g(byte b4) {
        byte f4 = f();
        if (f4 == b4) {
            return f4;
        }
        p(b4, true);
        throw null;
    }

    public void h(char c4) {
        int i2 = this.f6165b;
        if (i2 == -1) {
            E(c4);
            throw null;
        }
        while (true) {
            String str = (String) this.f6169f;
            if (i2 >= str.length()) {
                this.f6165b = -1;
                E(c4);
                throw null;
            }
            int i4 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f6165b = i4;
                if (charAt == c4) {
                    return;
                }
                E(c4);
                throw null;
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        o(r19, "Unexpected symbol '" + r5 + "' in numeric literal", 0, null, 6);
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
    
        o(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        o(r19, r17, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
    
        r19.f6165b = r12;
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
    
        o(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019a, code lost:
    
        o(r19, "Numeric value overflow", 0, null, 6);
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
    
        throw new y2.C1338m();
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
    
        o(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
    
        o(r19, "Expected numeric literal", 0, null, 6);
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
    public long i() {
        boolean z4;
        String str;
        String str2;
        boolean z5;
        int A4 = A(B());
        String str3 = (String) this.f6169f;
        String str4 = "EOF";
        if (A4 < str3.length() && A4 != -1) {
            if (str3.charAt(A4) == '\"') {
                A4++;
                if (A4 == str3.length()) {
                    o(this, "EOF", 0, null, 6);
                    throw null;
                }
                z4 = true;
            } else {
                z4 = false;
            }
            int i2 = A4;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            long j4 = 0;
            long j5 = 0;
            while (true) {
                if (i2 == str3.length()) {
                    str = str3;
                    str2 = str4;
                    z5 = z8;
                    break;
                }
                char charAt = str3.charAt(i2);
                if ((charAt != 'e' && charAt != 'E') || z6) {
                    str2 = str4;
                    z5 = z8;
                    if (charAt == '-' && z6) {
                        if (i2 == A4) {
                            o(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i2++;
                        str4 = str2;
                        z8 = false;
                    } else if (charAt != '+' || !z6) {
                        str = str3;
                        if (charAt != '-') {
                            if (k3.h.h(charAt) != 0) {
                                break;
                            }
                            i2++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z6) {
                                j5 = (j5 * 10) + i4;
                            } else {
                                j4 = (j4 * 10) - i4;
                                if (j4 > 0) {
                                    o(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            z8 = z5;
                            str4 = str2;
                            str3 = str;
                        } else {
                            if (i2 != A4) {
                                o(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                            i2++;
                            z8 = z5;
                            str4 = str2;
                            str3 = str;
                            z7 = true;
                        }
                    } else {
                        if (i2 == A4) {
                            o(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i2++;
                        str4 = str2;
                    }
                } else {
                    if (i2 == A4) {
                        o(this, "Unexpected symbol " + charAt + " in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i2++;
                    z6 = true;
                }
                z8 = true;
            }
        } else {
            o(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String j() {
        String str = (String) this.f6167d;
        if (str == null) {
            return e();
        }
        Intrinsics.c(str);
        this.f6167d = null;
        return str;
    }

    public String k() {
        String str = (String) this.f6167d;
        if (str != null) {
            Intrinsics.c(str);
            this.f6167d = null;
            return str;
        }
        int B = B();
        String str2 = (String) this.f6169f;
        if (B >= str2.length() || B == -1) {
            o(this, "EOF", B, null, 4);
            throw null;
        }
        byte h4 = k3.h.h(str2.charAt(B));
        if (h4 == 1) {
            return j();
        }
        if (h4 != 0) {
            o(this, "Expected beginning of the string, but got " + str2.charAt(B), 0, null, 6);
            throw null;
        }
        boolean z4 = false;
        while (k3.h.h(str2.charAt(B)) == 0) {
            B++;
            if (B >= str2.length()) {
                ((StringBuilder) this.f6168e).append((CharSequence) str2, this.f6165b, B);
                int A4 = A(B);
                if (A4 == -1) {
                    this.f6165b = B;
                    return m(0, 0);
                }
                B = A4;
                z4 = true;
            }
        }
        String obj = !z4 ? str2.subSequence(this.f6165b, B).toString() : m(this.f6165b, B);
        this.f6165b = B;
        return obj;
    }

    public String l() {
        String k4 = k();
        if (Intrinsics.a(k4, "null")) {
            if (((String) this.f6169f).charAt(this.f6165b - 1) != '\"') {
                o(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return k4;
    }

    public String m(int i2, int i4) {
        ((StringBuilder) this.f6168e).append((CharSequence) this.f6169f, i2, i4);
        StringBuilder sb = (StringBuilder) this.f6168e;
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void n(int i2, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        throw k3.h.d(i2, message + " at path: " + ((C0016l) this.f6166c).e() + (hint.length() == 0 ? "" : "\n".concat(hint)), (String) this.f6169f);
    }

    public void p(byte b4, boolean z4) {
        String q2 = k3.h.q(b4);
        int i2 = z4 ? this.f6165b - 1 : this.f6165b;
        int i4 = this.f6165b;
        String str = (String) this.f6169f;
        o(this, "Expected " + q2 + ", but had '" + ((i4 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    public int q(CharSequence charSequence, int i2) {
        char charAt = charSequence.charAt(i2);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        o(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public void r(String str) {
        C0097d c0097d = (C0097d) this.f6169f;
        if (c0097d.y()) {
            c0097d.d("Connection shutdown command received. Shutting down...", null, new Object[0]);
        }
        n nVar = (n) this.f6168e;
        nVar.getClass();
        boolean equals = str.equals("Invalid appcheck token");
        C0097d c0097d2 = nVar.f6235x;
        if (equals) {
            int i2 = nVar.f6209C;
            if (i2 < 3) {
                nVar.f6209C = i2 + 1;
                c0097d2.M("Detected invalid AppCheck token. Reconnecting (" + (3 - nVar.f6209C) + " attempts remaining)");
                c(2);
            }
        }
        c0097d2.M("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
        nVar.c("server_kill");
        c(2);
    }

    public void s(Map map) {
        C0097d c0097d = (C0097d) this.f6169f;
        if (c0097d.y()) {
            c0097d.d("Got control message: " + map.toString(), null, new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (c0097d.y()) {
                    c0097d.d("Got invalid control message: " + map.toString(), null, new Object[0]);
                }
                c(2);
                return;
            }
            if (str.equals("s")) {
                r((String) map.get("d"));
                return;
            }
            if (str.equals("r")) {
                w((String) map.get("d"));
            } else if (str.equals("h")) {
                u((Map) map.get("d"));
            } else if (c0097d.y()) {
                c0097d.d("Ignoring unknown control message: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e4) {
            if (c0097d.y()) {
                c0097d.d("Failed to parse control message: " + e4.toString(), null, new Object[0]);
            }
            c(2);
        }
    }

    public void t(Map map) {
        List l4;
        List emptyList;
        C0097d c0097d = (C0097d) this.f6169f;
        ArrayList arrayList = null;
        if (c0097d.y()) {
            c0097d.d("received data message: " + map.toString(), null, new Object[0]);
        }
        n nVar = (n) this.f6168e;
        nVar.getClass();
        if (map.containsKey("r")) {
            InterfaceC0567i interfaceC0567i = (InterfaceC0567i) nVar.f6222k.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (interfaceC0567i != null) {
                interfaceC0567i.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        boolean containsKey = map.containsKey("a");
        C0097d c0097d2 = nVar.f6235x;
        if (!containsKey) {
            if (c0097d2.y()) {
                c0097d2.d("Ignoring unknown message: " + map, null, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        if (c0097d2.y()) {
            c0097d2.d("handleServerMessage: " + str + " " + map2, null, new Object[0]);
        }
        boolean equals = str.equals("d");
        g2.h hVar = nVar.f6212a;
        if (equals || str.equals("m")) {
            boolean equals2 = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long valueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (equals2 && (obj instanceof Map) && ((Map) obj).size() == 0) {
                if (c0097d2.y()) {
                    c0097d2.d("ignoring empty merge for path " + str2, null, new Object[0]);
                    return;
                }
                return;
            }
            ArrayList V3 = M1.a.V(str2);
            hVar.getClass();
            g2.e eVar = new g2.e(V3);
            C0097d c0097d3 = hVar.f6711i;
            if (c0097d3.y()) {
                c0097d3.d("onDataUpdate: " + eVar, null, new Object[0]);
            }
            if (hVar.f6712j.y()) {
                c0097d3.d("onDataUpdate: " + eVar + " " + obj, null, new Object[0]);
            }
            try {
                if (valueOf != null) {
                    t tVar = new t(valueOf.longValue());
                    if (equals2) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            hashMap.put(new g2.e((String) entry.getKey()), m3.o.c(entry.getValue(), o2.k.f8939k));
                        }
                        s sVar = hVar.f6714l;
                        sVar.getClass();
                        l4 = (List) ((C0231x) sVar.f6757g).a(new g2.m(sVar, tVar, eVar, hashMap, 0));
                    } else {
                        o2.s c4 = m3.o.c(obj, o2.k.f8939k);
                        s sVar2 = hVar.f6714l;
                        sVar2.getClass();
                        l4 = (List) ((C0231x) sVar2.f6757g).a(new g2.m(sVar2, tVar, eVar, c4, 2));
                    }
                } else if (equals2) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                        hashMap2.put(new g2.e((String) entry2.getKey()), m3.o.c(entry2.getValue(), o2.k.f8939k));
                    }
                    s sVar3 = hVar.f6714l;
                    sVar3.getClass();
                    l4 = (List) ((C0231x) sVar3.f6757g).a(new g2.r(sVar3, hashMap2, eVar));
                } else {
                    l4 = hVar.f6714l.l(eVar, m3.o.c(obj, o2.k.f8939k));
                }
                if (l4.size() > 0) {
                    hVar.d(eVar);
                }
                hVar.b(l4);
                return;
            } catch (C0518b e4) {
                c0097d3.i("FIREBASE INTERNAL ERROR", e4);
                return;
            }
        }
        if (!str.equals("rm")) {
            if (str.equals("c")) {
                ArrayList V4 = M1.a.V((String) map2.get("p"));
                if (c0097d2.y()) {
                    c0097d2.d("removing all listens at path " + V4, null, new Object[0]);
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap3 = nVar.f6226o;
                for (Map.Entry entry3 : hashMap3.entrySet()) {
                    m mVar = (m) entry3.getKey();
                    k kVar = (k) entry3.getValue();
                    if (mVar.f6205a.equals(V4)) {
                        arrayList2.add(kVar);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    hashMap3.remove(((k) it.next()).f6198b);
                }
                nVar.b();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((k) it2.next()).f6197a.s("permission_denied", null);
                }
                return;
            }
            if (str.equals("ac")) {
                c0097d2.d("Auth token revoked: " + ((String) map2.get("s")) + " (" + ((String) map2.get("d")) + ")", null, new Object[0]);
                nVar.f6227p = null;
                nVar.f6228q = true;
                hVar.getClass();
                hVar.g(g2.c.f6681c, Boolean.FALSE);
                nVar.f6218g.c(2);
                return;
            }
            if (!str.equals("apc")) {
                if (str.equals("sd")) {
                    String H3 = c0097d2.H((String) map2.get("msg"), new Object[0]);
                    System.currentTimeMillis();
                    ((G1.y) c0097d2.f987e).d(2, (String) c0097d2.f988i, H3);
                    return;
                } else {
                    if (c0097d2.y()) {
                        c0097d2.d("Unrecognized action from server: ".concat(str), null, new Object[0]);
                        return;
                    }
                    return;
                }
            }
            c0097d2.d("App check token revoked: " + ((String) map2.get("s")) + " (" + ((String) map2.get("d")) + ")", null, new Object[0]);
            nVar.f6229r = null;
            nVar.f6230s = true;
            return;
        }
        String str3 = (String) map2.get("p");
        ArrayList V5 = M1.a.V(str3);
        Object obj3 = map2.get("d");
        Object obj4 = map2.get("t");
        Long valueOf2 = obj4 instanceof Integer ? Long.valueOf(((Integer) obj4).intValue()) : obj4 instanceof Long ? (Long) obj4 : null;
        ArrayList arrayList3 = new ArrayList();
        for (Map map3 : (List) obj3) {
            String str4 = (String) map3.get("s");
            String str5 = (String) map3.get("e");
            arrayList3.add(new o(str4 != null ? M1.a.V(str4) : arrayList, str5 != null ? M1.a.V(str5) : arrayList, map3.get("m")));
            arrayList = null;
        }
        if (arrayList3.isEmpty()) {
            if (c0097d2.y()) {
                c0097d2.d("Ignoring empty range merge for path ".concat(str3), null, new Object[0]);
                return;
            }
            return;
        }
        hVar.getClass();
        g2.e eVar2 = new g2.e(V5);
        C0097d c0097d4 = hVar.f6711i;
        if (c0097d4.y()) {
            c0097d4.d("onRangeMergeUpdate: " + eVar2, null, new Object[0]);
        }
        if (hVar.f6712j.y()) {
            c0097d4.d("onRangeMergeUpdate: " + eVar2 + " " + arrayList3, null, new Object[0]);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new u((o) it3.next()));
        }
        if (valueOf2 != null) {
            s sVar4 = hVar.f6714l;
            t tVar2 = new t(valueOf2.longValue());
            l2.i iVar = (l2.i) ((HashMap) sVar4.f6754d).get(tVar2);
            if (iVar != null) {
                g2.e eVar3 = iVar.f7984a;
                AbstractC0720j.c(eVar2.equals(eVar3));
                g2.l lVar = (g2.l) ((C0715e) sVar4.f6752b).j(eVar3);
                AbstractC0720j.b("Missing sync point for query tag that we're tracking", lVar != null);
                l2.j g4 = lVar.g(iVar);
                AbstractC0720j.b("Missing view for query tag that we're tracking", g4 != null);
                o2.s sVar5 = ((C0821a) g4.f7988c.f7977c).f7962a.f8941d;
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    u uVar = (u) it4.next();
                    uVar.getClass();
                    sVar5 = uVar.a(g2.e.f6694j, sVar5, uVar.f8956c);
                }
                emptyList = (List) ((C0231x) sVar4.f6757g).a(new g2.m(sVar4, tVar2, eVar2, sVar5, 2));
            } else {
                emptyList = Collections.emptyList();
            }
        } else {
            s sVar6 = hVar.f6714l;
            g2.l lVar2 = (g2.l) ((C0715e) sVar6.f6752b).j(eVar2);
            if (lVar2 == null) {
                emptyList = Collections.emptyList();
            } else {
                l2.j d4 = lVar2.d();
                if (d4 != null) {
                    o2.s sVar7 = ((C0821a) d4.f7988c.f7977c).f7962a.f8941d;
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        u uVar2 = (u) it5.next();
                        uVar2.getClass();
                        sVar7 = uVar2.a(g2.e.f6694j, sVar7, uVar2.f8956c);
                    }
                    emptyList = sVar6.l(eVar2, sVar7);
                } else {
                    emptyList = Collections.emptyList();
                }
            }
        }
        if (emptyList.size() > 0) {
            hVar.d(eVar2);
        }
        hVar.b(emptyList);
    }

    public String toString() {
        switch (this.f6164a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f6169f);
                sb.append("', currentPosition=");
                return AbstractC0017m.l(sb, this.f6165b, ')');
            default:
                return super.toString();
        }
    }

    public void u(Map map) {
        long longValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        n nVar = (n) this.f6168e;
        nVar.f6214c = str;
        String str2 = (String) map.get("s");
        if (this.f6165b == 1) {
            ((r) this.f6167d).getClass();
            C0097d c0097d = (C0097d) this.f6169f;
            l2.g gVar = null;
            if (c0097d.y()) {
                c0097d.d("realtime connection established", null, new Object[0]);
            }
            this.f6165b = 2;
            C0097d c0097d2 = nVar.f6235x;
            if (c0097d2.y()) {
                c0097d2.d("onReady", null, new Object[0]);
            }
            nVar.f6217f = System.currentTimeMillis();
            if (c0097d2.y()) {
                c0097d2.d("handling timestamp", null, new Object[0]);
            }
            long currentTimeMillis = longValue - System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
            g2.h hVar = nVar.f6212a;
            hVar.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                hVar.g(C0924c.c((String) entry.getKey()), entry.getValue());
            }
            if (nVar.f6216e) {
                HashMap hashMap2 = new HashMap();
                nVar.f6231t.getClass();
                hashMap2.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (c0097d2.y()) {
                    c0097d2.d("Sending first connection stats", null, new Object[0]);
                }
                if (!hashMap2.isEmpty()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("c", hashMap2);
                    nVar.l("s", false, hashMap3, new C0564f(nVar, 1));
                } else if (c0097d2.y()) {
                    c0097d2.d("Not sending stats because stats are empty", null, new Object[0]);
                }
            }
            if (c0097d2.y()) {
                c0097d2.d("calling restore tokens", null, new Object[0]);
            }
            EnumC0568j enumC0568j = nVar.f6219h;
            M1.a.F(enumC0568j == EnumC0568j.f6193i, "Wanted to restore tokens, but was in wrong state: %s", enumC0568j);
            if (nVar.f6227p != null) {
                if (c0097d2.y()) {
                    c0097d2.d("Restoring auth.", null, new Object[0]);
                }
                nVar.f6219h = EnumC0568j.f6194j;
                M1.a.F(nVar.a(), "Must be connected to send auth, but was: %s", nVar.f6219h);
                if (c0097d2.y()) {
                    c0097d2.d("Sending auth.", null, new Object[0]);
                }
                C0564f c0564f = new C0564f(nVar, 0);
                HashMap hashMap4 = new HashMap();
                String str3 = nVar.f6227p;
                if (str3.startsWith("gauth|")) {
                    try {
                        HashMap t4 = m3.o.t(str3.substring(6));
                        gVar = new l2.g((String) t4.get("token"), 5, (Map) t4.get("auth"));
                    } catch (IOException e4) {
                        throw new RuntimeException("Failed to parse gauth token", e4);
                    }
                }
                if (gVar != null) {
                    hashMap4.put("cred", (String) gVar.f7976b);
                    Map map2 = (Map) gVar.f7977c;
                    if (map2 != null) {
                        hashMap4.put("authvar", map2);
                    }
                    nVar.l("gauth", true, hashMap4, c0564f);
                } else {
                    hashMap4.put("cred", nVar.f6227p);
                    nVar.l("auth", true, hashMap4, c0564f);
                }
            } else {
                if (c0097d2.y()) {
                    c0097d2.d("Not restoring auth because auth token is null.", null, new Object[0]);
                }
                nVar.f6219h = EnumC0568j.f6195k;
                nVar.i();
            }
            nVar.f6216e = false;
            nVar.f6237z = str2;
            hVar.g(g2.c.f6682d, Boolean.TRUE);
        }
    }

    public void v(HashMap hashMap) {
        C0097d c0097d = (C0097d) this.f6169f;
        try {
            String str = (String) hashMap.get("t");
            if (str == null) {
                if (c0097d.y()) {
                    c0097d.d("Failed to parse server message: missing message type:" + hashMap.toString(), null, new Object[0]);
                }
                c(2);
                return;
            }
            if (str.equals("d")) {
                t((Map) hashMap.get("d"));
            } else if (str.equals("c")) {
                s((Map) hashMap.get("d"));
            } else if (c0097d.y()) {
                c0097d.d("Ignoring unknown server message type: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e4) {
            if (c0097d.y()) {
                c0097d.d("Failed to parse server message: " + e4.toString(), null, new Object[0]);
            }
            c(2);
        }
    }

    public void w(String str) {
        C0097d c0097d = (C0097d) this.f6169f;
        if (c0097d.y()) {
            c0097d.d("Got a reset; killing connection to " + ((String) ((V) this.f6166c).f62c) + "; Updating internalHost to " + str, null, new Object[0]);
        }
        ((n) this.f6168e).f6214c = str;
        c(1);
    }

    public String x(String keyToMatch, boolean z4) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i2 = this.f6165b;
        try {
            if (f() != 6) {
                return null;
            }
            if (!Intrinsics.a(z(z4), keyToMatch)) {
                return null;
            }
            this.f6167d = null;
            if (f() != 5) {
                return null;
            }
            return z(z4);
        } finally {
            this.f6165b = i2;
            this.f6167d = null;
        }
    }

    public byte y() {
        int i2 = this.f6165b;
        while (true) {
            int A4 = A(i2);
            if (A4 == -1) {
                this.f6165b = A4;
                return (byte) 10;
            }
            char charAt = ((String) this.f6169f).charAt(A4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f6165b = A4;
                return k3.h.h(charAt);
            }
            i2 = A4 + 1;
        }
    }

    public String z(boolean z4) {
        String j4;
        byte y4 = y();
        if (z4) {
            if (y4 != 1 && y4 != 0) {
                return null;
            }
            j4 = k();
        } else {
            if (y4 != 1) {
                return null;
            }
            j4 = j();
        }
        this.f6167d = j4;
        return j4;
    }

    public C0559a(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        C0016l c0016l = new C0016l(2);
        c0016l.f164c = new Object[8];
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        c0016l.f165d = iArr;
        c0016l.f163b = -1;
        this.f6166c = c0016l;
        this.f6168e = new StringBuilder();
        this.f6169f = source;
    }
}
