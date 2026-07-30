package j5;

import a0.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.v;
import l5.t;
import t5.s;
import t5.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static long f5032g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5033a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f5034b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5035c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5036d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5037e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5038f;

    public a(b bVar, s0 s0Var, String str, n nVar, String str2, String str3) {
        long j8 = f5032g;
        f5032g = 1 + j8;
        this.f5035c = s0Var;
        this.f5037e = nVar;
        this.f5038f = new b1.b(bVar.f5042d, "Connection", a0.m.h(j8, "conn_"), 22);
        this.f5034b = 1;
        this.f5036d = new r(bVar, s0Var, str, str3, this, str2);
    }

    public static /* synthetic */ void o(a aVar, String str, int i7, String str2, int i8) {
        if ((i8 & 2) != 0) {
            i7 = aVar.f5034b;
        }
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        aVar.n(i7, str, str2);
        throw null;
    }

    public int A(int i7) {
        if (i7 < ((String) this.f5038f).length()) {
            return i7;
        }
        return -1;
    }

    public int B() {
        char charAt;
        int i7 = this.f5034b;
        if (i7 == -1) {
            return i7;
        }
        String str = (String) this.f5038f;
        while (i7 < str.length() && ((charAt = str.charAt(i7)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i7++;
        }
        this.f5034b = i7;
        return i7;
    }

    public boolean C() {
        int B = B();
        String str = (String) this.f5038f;
        if (B >= str.length() || B == -1 || str.charAt(B) != ',') {
            return false;
        }
        this.f5034b++;
        return true;
    }

    public void D(char c4) {
        int i7 = this.f5034b;
        if (i7 > 0 && c4 == '\"') {
            try {
                this.f5034b = i7 - 1;
                String k8 = k();
                this.f5034b = i7;
                if (r6.k.a(k8, "null")) {
                    n(this.f5034b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f5034b = i7;
                throw th;
            }
        }
        p(q7.f.c(c4), true);
        throw null;
    }

    public int a(CharSequence charSequence, int i7) {
        int i8 = i7 + 4;
        if (i8 < charSequence.length()) {
            ((StringBuilder) this.f5037e).append((char) (q(charSequence, i7 + 3) + (q(charSequence, i7) << 12) + (q(charSequence, i7 + 1) << 8) + (q(charSequence, i7 + 2) << 4)));
            return i8;
        }
        this.f5034b = i7;
        if (i8 < charSequence.length()) {
            return a(charSequence, this.f5034b);
        }
        o(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i7 = this.f5034b;
        if (i7 == -1) {
            return false;
        }
        String str = (String) this.f5038f;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f5034b = i7;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i7++;
        }
        this.f5034b = i7;
        return false;
    }

    public void c(int i7) {
        String str;
        b1.b bVar = (b1.b) this.f5038f;
        if (this.f5034b != 3) {
            boolean z8 = false;
            if (bVar.v()) {
                bVar.d("closing realtime connection", null, new Object[0]);
            }
            this.f5034b = 3;
            r rVar = (r) this.f5036d;
            if (rVar != null) {
                rVar.c();
                this.f5036d = null;
            }
            n nVar = (n) this.f5037e;
            b1.b bVar2 = nVar.f5099x;
            if (bVar2.v()) {
                if (i7 == 1) {
                    str = "SERVER_RESET";
                } else {
                    if (i7 != 2) {
                        throw null;
                    }
                    str = "OTHER";
                }
                bVar2.d("Got on disconnect due to ".concat(str), null, new Object[0]);
            }
            nVar.f5083h = j.f5060f;
            nVar.f5082g = null;
            nVar.f5086k.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = nVar.f5088m.entrySet().iterator();
            while (it.hasNext()) {
                l lVar = (l) ((Map.Entry) it.next()).getValue();
                if (lVar.f5071b.containsKey("h") && lVar.f5073d) {
                    arrayList.add(lVar);
                    it.remove();
                }
            }
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                ((l) obj).f5072c.x("disconnected", null);
            }
            if (nVar.f5079d.size() == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j8 = nVar.f5081f;
                long j9 = currentTimeMillis - j8;
                if (j8 > 0 && j9 > 30000) {
                    z8 = true;
                }
                if (i7 == 1 || z8) {
                    k5.a aVar = nVar.f5100y;
                    aVar.f5368j = true;
                    aVar.f5367i = 0L;
                }
                nVar.m();
            }
            nVar.f5081f = 0L;
            l5.i iVar = nVar.f5076a;
            iVar.getClass();
            iVar.g(l5.c.f6011d, Boolean.FALSE);
            t6.a.A(iVar.f6033b);
            ArrayList arrayList2 = new ArrayList();
            m4.f fVar = iVar.f6036e;
            l5.f fVar2 = l5.f.f6023i;
            fVar.getClass();
            iVar.f6036e = new m4.f();
            iVar.b(arrayList2);
        }
    }

    public void d(String str, int i7) {
        String str2 = (String) this.f5038f;
        if (str2.length() - i7 < str.length()) {
            o(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (str.charAt(i8) != (str2.charAt(i7 + i8) | ' ')) {
                o(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f5034b = str.length() + i7;
    }

    public String e() {
        StringBuilder sb = (StringBuilder) this.f5037e;
        String str = (String) this.f5038f;
        h('\"');
        int i7 = this.f5034b;
        int D = z6.h.D(str, '\"', i7, 4);
        if (D == -1) {
            k();
            p((byte) 1, false);
            throw null;
        }
        int i8 = i7;
        while (i8 < D) {
            if (str.charAt(i8) == '\\') {
                int i9 = this.f5034b;
                char charAt = str.charAt(i8);
                boolean z8 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append((CharSequence) str, i9, i8);
                        int A = A(i8 + 1);
                        if (A == -1) {
                            o(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i10 = A + 1;
                        char charAt2 = str.charAt(A);
                        if (charAt2 == 'u') {
                            i10 = a(str, i10);
                        } else {
                            char c4 = charAt2 < 'u' ? q7.a.f7544a[charAt2] : (char) 0;
                            if (c4 == 0) {
                                o(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c4);
                        }
                        i9 = A(i10);
                        if (i9 == -1) {
                            o(this, "Unexpected EOF", i9, null, 4);
                            throw null;
                        }
                    } else {
                        i8++;
                        if (i8 >= str.length()) {
                            sb.append((CharSequence) str, i9, i8);
                            i9 = A(i8);
                            if (i9 == -1) {
                                o(this, "Unexpected EOF", i9, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i8);
                        }
                    }
                    i8 = i9;
                    z8 = true;
                    charAt = str.charAt(i8);
                }
                String obj = !z8 ? str.subSequence(i9, i8).toString() : m(i9, i8);
                this.f5034b = i8 + 1;
                return obj;
            }
            i8++;
        }
        this.f5034b = D + 1;
        String substring = str.substring(i7, D);
        r6.k.e(substring, "substring(...)");
        return substring;
    }

    public byte f() {
        String str = (String) this.f5038f;
        int i7 = this.f5034b;
        while (i7 != -1 && i7 < str.length()) {
            int i8 = i7 + 1;
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f5034b = i8;
                return q7.f.c(charAt);
            }
            i7 = i8;
        }
        this.f5034b = str.length();
        return (byte) 10;
    }

    public byte g(byte b9) {
        byte f9 = f();
        if (f9 == b9) {
            return f9;
        }
        p(b9, true);
        throw null;
    }

    public void h(char c4) {
        int i7 = this.f5034b;
        if (i7 == -1) {
            D(c4);
            throw null;
        }
        String str = (String) this.f5038f;
        while (i7 < str.length()) {
            int i8 = i7 + 1;
            char charAt = str.charAt(i7);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f5034b = i8;
                if (charAt == c4) {
                    return;
                }
                D(c4);
                throw null;
            }
            i7 = i8;
        }
        this.f5034b = -1;
        D(c4);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0195, code lost:
    
        o(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0164, code lost:
    
        o(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017d, code lost:
    
        o(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (r11 != true) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0188, code lost:
    
        throw new b4.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019b, code lost:
    
        o(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        o(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r12 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0109, code lost:
    
        if (r1 == r12) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010b, code lost:
    
        if (r14 == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if (r20 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0118, code lost:
    
        if (r3 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0125, code lost:
    
        o(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012d, code lost:
    
        o(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0133, code lost:
    
        r21.f5034b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0137, code lost:
    
        if (r13 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013c, code lost:
    
        if (r11 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        if (r14 == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() {
        boolean z8;
        boolean z9;
        int A = A(B());
        String str = (String) this.f5038f;
        ?? r62 = 0;
        if (A < str.length() && A != -1) {
            if (str.charAt(A) == '\"') {
                A++;
                if (A == str.length()) {
                    o(this, "EOF", 0, null, 6);
                    throw null;
                }
                z8 = true;
            } else {
                z8 = false;
            }
            int i7 = A;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            long j8 = 0;
            long j9 = 0;
            while (true) {
                if (i7 == str.length()) {
                    z9 = z8;
                    break;
                }
                char charAt = str.charAt(i7);
                if ((charAt != 'e' && charAt != 'E') || z11) {
                    if (charAt == '-' && z11) {
                        if (i7 == A) {
                            o(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i7++;
                        z10 = false;
                    } else if (charAt != '+' || !z11) {
                        z9 = z8;
                        if (charAt != '-') {
                            if (q7.f.c(charAt) != 0) {
                                break;
                            }
                            i7++;
                            int i8 = charAt - '0';
                            if (i8 < 0 || i8 >= 10) {
                                break;
                            }
                            if (z11) {
                                j8 = (j8 * 10) + i8;
                            } else {
                                j9 = (j9 * 10) - i8;
                                if (j9 > 0) {
                                    o(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                            }
                            z8 = z9;
                        } else {
                            if (i7 != A) {
                                o(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                            i7++;
                            z8 = z9;
                            r62 = 0;
                            z12 = true;
                        }
                    } else {
                        if (i7 == A) {
                            o(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i7++;
                        r62 = 0;
                        z10 = true;
                    }
                    r62 = 0;
                } else {
                    if (i7 == A) {
                        o(this, "Unexpected symbol " + charAt + " in numeric literal", 0, r62, 6);
                        throw r62;
                    }
                    i7++;
                    z10 = true;
                    z11 = true;
                }
            }
        } else {
            o(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String j() {
        String str = (String) this.f5036d;
        if (str == null) {
            return e();
        }
        r6.k.c(str);
        this.f5036d = null;
        return str;
    }

    public String k() {
        String str = (String) this.f5038f;
        String str2 = (String) this.f5036d;
        if (str2 != null) {
            r6.k.c(str2);
            this.f5036d = null;
            return str2;
        }
        int B = B();
        if (B >= str.length() || B == -1) {
            o(this, "EOF", B, null, 4);
            throw null;
        }
        byte c4 = q7.f.c(str.charAt(B));
        if (c4 == 1) {
            return j();
        }
        if (c4 != 0) {
            o(this, "Expected beginning of the string, but got " + str.charAt(B), 0, null, 6);
            throw null;
        }
        boolean z8 = false;
        while (q7.f.c(str.charAt(B)) == 0) {
            B++;
            if (B >= str.length()) {
                ((StringBuilder) this.f5037e).append((CharSequence) str, this.f5034b, B);
                int A = A(B);
                if (A == -1) {
                    this.f5034b = B;
                    return m(0, 0);
                }
                B = A;
                z8 = true;
            }
        }
        String obj = !z8 ? str.subSequence(this.f5034b, B).toString() : m(this.f5034b, B);
        this.f5034b = B;
        return obj;
    }

    public String l() {
        String k8 = k();
        if (!r6.k.a(k8, "null") || ((String) this.f5038f).charAt(this.f5034b - 1) == '\"') {
            return k8;
        }
        o(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public String m(int i7, int i8) {
        StringBuilder sb = (StringBuilder) this.f5037e;
        sb.append((CharSequence) this.f5038f, i7, i8);
        String sb2 = sb.toString();
        r6.k.e(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void n(int i7, String str, String str2) {
        r6.k.f(str, "message");
        r6.k.f(str2, "hint");
        throw q7.f.a(i7, str + " at path: " + ((a0.l) this.f5035c).e() + (str2.length() == 0 ? "" : "\n".concat(str2)), (String) this.f5038f);
    }

    public void p(byte b9, boolean z8) {
        String str = (String) this.f5038f;
        String h3 = q7.f.h(b9);
        int i7 = z8 ? this.f5034b - 1 : this.f5034b;
        o(this, "Expected " + h3 + ", but had '" + ((this.f5034b == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7))) + "' instead", i7, null, 4);
        throw null;
    }

    public int q(CharSequence charSequence, int i7) {
        char charAt = charSequence.charAt(i7);
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
        b1.b bVar = (b1.b) this.f5038f;
        if (bVar.v()) {
            bVar.d("Connection shutdown command received. Shutting down...", null, new Object[0]);
        }
        n nVar = (n) this.f5037e;
        b1.b bVar2 = nVar.f5099x;
        if (str.equals("Invalid appcheck token")) {
            int i7 = nVar.C;
            if (i7 < 3) {
                nVar.C = i7 + 1;
                bVar2.I("Detected invalid AppCheck token. Reconnecting (" + (3 - nVar.C) + " attempts remaining)");
                c(2);
            }
        }
        bVar2.I("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
        nVar.c("server_kill");
        c(2);
    }

    public void s(Map map) {
        b1.b bVar = (b1.b) this.f5038f;
        if (bVar.v()) {
            bVar.d("Got control message: " + map.toString(), null, new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (bVar.v()) {
                    bVar.d("Got invalid control message: " + map.toString(), null, new Object[0]);
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
            } else if (bVar.v()) {
                bVar.d("Ignoring unknown control message: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e9) {
            if (bVar.v()) {
                bVar.d("Failed to parse control message: " + e9.toString(), null, new Object[0]);
            }
            c(2);
        }
    }

    public void t(Map map) {
        List l8;
        List list;
        b1.b bVar = (b1.b) this.f5038f;
        ArrayList arrayList = null;
        int i7 = 0;
        if (bVar.v()) {
            bVar.d("received data message: " + map.toString(), null, new Object[0]);
        }
        n nVar = (n) this.f5037e;
        b1.b bVar2 = nVar.f5099x;
        if (map.containsKey("r")) {
            i iVar = (i) nVar.f5086k.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (iVar != null) {
                iVar.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        if (!map.containsKey("a")) {
            if (bVar2.v()) {
                bVar2.d("Ignoring unknown message: " + map, null, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        l5.i iVar2 = nVar.f5076a;
        if (bVar2.v()) {
            bVar2.d("handleServerMessage: " + str + " " + map2, null, new Object[0]);
        }
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long valueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (equals && (obj instanceof Map) && ((Map) obj).size() == 0) {
                if (bVar2.v()) {
                    bVar2.d("ignoring empty merge for path " + str2, null, new Object[0]);
                    return;
                }
                return;
            }
            ArrayList K = a.a.K(str2);
            iVar2.getClass();
            l5.f fVar = new l5.f(K);
            b1.b bVar3 = iVar2.f6040i;
            if (bVar3.v()) {
                bVar3.d("onDataUpdate: " + fVar, null, new Object[0]);
            }
            if (iVar2.f6041j.v()) {
                bVar3.d("onDataUpdate: " + fVar + " " + obj, null, new Object[0]);
            }
            try {
                if (valueOf != null) {
                    t tVar = new t(valueOf.longValue());
                    if (equals) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            hashMap.put(new l5.f((String) entry.getKey()), a8.m.d(entry.getValue(), t5.k.f8908j));
                        }
                        v vVar = iVar2.f6043l;
                        l8 = (List) ((n5.a) vVar.f5686g).a(new l5.n(vVar, tVar, fVar, hashMap, 0));
                    } else {
                        s d8 = a8.m.d(obj, t5.k.f8908j);
                        v vVar2 = iVar2.f6043l;
                        l8 = (List) ((n5.a) vVar2.f5686g).a(new l5.n(vVar2, tVar, fVar, d8, 2));
                    }
                } else if (equals) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                        hashMap2.put(new l5.f((String) entry2.getKey()), a8.m.d(entry2.getValue(), t5.k.f8908j));
                    }
                    v vVar3 = iVar2.f6043l;
                    l8 = (List) ((n5.a) vVar3.f5686g).a(new l5.s(vVar3, hashMap2, fVar));
                } else {
                    l8 = iVar2.f6043l.l(fVar, a8.m.d(obj, t5.k.f8908j));
                }
                if (l8.size() > 0) {
                    iVar2.d(fVar);
                }
                iVar2.b(l8);
                return;
            } catch (g5.b e9) {
                bVar3.i("FIREBASE INTERNAL ERROR", e9);
                return;
            }
        }
        if (!str.equals("rm")) {
            if (str.equals("c")) {
                ArrayList K2 = a.a.K((String) map2.get("p"));
                HashMap hashMap3 = nVar.f5090o;
                if (bVar2.v()) {
                    bVar2.d("removing all listens at path " + K2, null, new Object[0]);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry3 : hashMap3.entrySet()) {
                    m mVar = (m) entry3.getKey();
                    k kVar = (k) entry3.getValue();
                    if (mVar.f5074a.equals(K2)) {
                        arrayList2.add(kVar);
                    }
                }
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj3 = arrayList2.get(i8);
                    i8++;
                    hashMap3.remove(((k) obj3).f5067b);
                }
                nVar.b();
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj4 = arrayList2.get(i7);
                    i7++;
                    ((k) obj4).f5066a.x("permission_denied", null);
                }
                return;
            }
            if (str.equals("ac")) {
                bVar2.d("Auth token revoked: " + ((String) map2.get("s")) + " (" + ((String) map2.get("d")) + ")", null, new Object[0]);
                nVar.f5091p = null;
                nVar.f5092q = true;
                iVar2.getClass();
                iVar2.g(l5.c.f6010c, Boolean.FALSE);
                nVar.f5082g.c(2);
                return;
            }
            if (str.equals("apc")) {
                bVar2.d("App check token revoked: " + ((String) map2.get("s")) + " (" + ((String) map2.get("d")) + ")", null, new Object[0]);
                nVar.f5093r = null;
                nVar.f5094s = true;
                return;
            }
            if (!str.equals("sd")) {
                if (bVar2.v()) {
                    bVar2.d("Unrecognized action from server: ".concat(str), null, new Object[0]);
                    return;
                }
                return;
            } else {
                String str3 = (String) map2.get("msg");
                l.i iVar3 = (l.i) bVar2.f1230g;
                String str4 = (String) bVar2.f1231h;
                String D = bVar2.D(str3, new Object[0]);
                System.currentTimeMillis();
                iVar3.e(2, str4, D);
                return;
            }
        }
        String str5 = (String) map2.get("p");
        ArrayList K3 = a.a.K(str5);
        Object obj5 = map2.get("d");
        Object obj6 = map2.get("t");
        Long valueOf2 = obj6 instanceof Integer ? Long.valueOf(((Integer) obj6).intValue()) : obj6 instanceof Long ? (Long) obj6 : null;
        ArrayList arrayList3 = new ArrayList();
        for (Map map3 : (List) obj5) {
            String str6 = (String) map3.get("s");
            String str7 = (String) map3.get("e");
            arrayList3.add(new o(str6 != null ? a.a.K(str6) : arrayList, str7 != null ? a.a.K(str7) : arrayList, map3.get("m")));
            arrayList = null;
        }
        if (arrayList3.isEmpty()) {
            if (bVar2.v()) {
                bVar2.d("Ignoring empty range merge for path ".concat(str5), null, new Object[0]);
                return;
            }
            return;
        }
        iVar2.getClass();
        l5.f fVar2 = new l5.f(K3);
        b1.b bVar4 = iVar2.f6040i;
        if (bVar4.v()) {
            bVar4.d("onRangeMergeUpdate: " + fVar2, null, new Object[0]);
        }
        if (iVar2.f6041j.v()) {
            bVar4.d("onRangeMergeUpdate: " + fVar2 + " " + arrayList3, null, new Object[0]);
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj7 = arrayList3.get(i9);
            i9++;
            arrayList4.add(new u((o) obj7));
        }
        if (valueOf2 != null) {
            v vVar4 = iVar2.f6043l;
            t tVar2 = new t(valueOf2.longValue());
            q5.i iVar4 = (q5.i) ((HashMap) vVar4.f5683d).get(tVar2);
            if (iVar4 != null) {
                l5.f fVar3 = iVar4.f7535a;
                o5.j.c(fVar2.equals(fVar3));
                l5.m mVar2 = (l5.m) ((o5.e) vVar4.f5681b).m(fVar3);
                o5.j.b("Missing sync point for query tag that we're tracking", mVar2 != null);
                q5.j g9 = mVar2.g(iVar4);
                o5.j.b("Missing view for query tag that we're tracking", g9 != null);
                s sVar = ((q5.a) g9.f7539c.f7528h).f7513a.f8910f;
                int size4 = arrayList4.size();
                s sVar2 = sVar;
                while (i7 < size4) {
                    Object obj8 = arrayList4.get(i7);
                    i7++;
                    u uVar = (u) obj8;
                    uVar.getClass();
                    sVar2 = uVar.a(l5.f.f6023i, sVar2, uVar.f8925c);
                }
                list = (List) ((n5.a) vVar4.f5686g).a(new l5.n(vVar4, tVar2, fVar2, sVar2, 2));
            } else {
                list = Collections.EMPTY_LIST;
            }
        } else {
            v vVar5 = iVar2.f6043l;
            l5.m mVar3 = (l5.m) ((o5.e) vVar5.f5681b).m(fVar2);
            if (mVar3 == null) {
                list = Collections.EMPTY_LIST;
            } else {
                q5.j d9 = mVar3.d();
                if (d9 != null) {
                    s sVar3 = ((q5.a) d9.f7539c.f7528h).f7513a.f8910f;
                    int size5 = arrayList4.size();
                    while (i7 < size5) {
                        Object obj9 = arrayList4.get(i7);
                        i7++;
                        u uVar2 = (u) obj9;
                        uVar2.getClass();
                        sVar3 = uVar2.a(l5.f.f6023i, sVar3, uVar2.f8925c);
                    }
                    list = vVar5.l(fVar2, sVar3);
                } else {
                    list = Collections.EMPTY_LIST;
                }
            }
        }
        if (list.size() > 0) {
            iVar2.d(fVar2);
        }
        iVar2.b(list);
    }

    public String toString() {
        switch (this.f5033a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f5038f);
                sb.append("', currentPosition=");
                return a0.m.l(sb, this.f5034b, ')');
            default:
                return super.toString();
        }
    }

    public void u(Map map) {
        long longValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        n nVar = (n) this.f5037e;
        nVar.f5078c = str;
        String str2 = (String) map.get("s");
        if (this.f5034b == 1) {
            ((r) this.f5036d).getClass();
            b1.b bVar = (b1.b) this.f5038f;
            q5.g gVar = null;
            if (bVar.v()) {
                bVar.d("realtime connection established", null, new Object[0]);
            }
            this.f5034b = 2;
            l5.i iVar = nVar.f5076a;
            b1.b bVar2 = nVar.f5099x;
            if (bVar2.v()) {
                bVar2.d("onReady", null, new Object[0]);
            }
            nVar.f5081f = System.currentTimeMillis();
            if (bVar2.v()) {
                bVar2.d("handling timestamp", null, new Object[0]);
            }
            long currentTimeMillis = longValue - System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
            iVar.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                iVar.g(t5.c.e((String) entry.getKey()), entry.getValue());
            }
            if (nVar.f5080e) {
                HashMap hashMap2 = new HashMap();
                nVar.f5095t.getClass();
                hashMap2.put("sdk.android." + "21.0.0".replace('.', '-'), 1);
                if (bVar2.v()) {
                    bVar2.d("Sending first connection stats", null, new Object[0]);
                }
                if (!hashMap2.isEmpty()) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("c", hashMap2);
                    nVar.l("s", false, hashMap3, new f(nVar, 1));
                } else if (bVar2.v()) {
                    bVar2.d("Not sending stats because stats are empty", null, new Object[0]);
                }
            }
            if (bVar2.v()) {
                bVar2.d("calling restore tokens", null, new Object[0]);
            }
            j jVar = nVar.f5083h;
            a.a.z(jVar == j.f5062h, "Wanted to restore tokens, but was in wrong state: %s", jVar);
            if (nVar.f5091p != null) {
                if (bVar2.v()) {
                    bVar2.d("Restoring auth.", null, new Object[0]);
                }
                nVar.f5083h = j.f5063i;
                a.a.z(nVar.a(), "Must be connected to send auth, but was: %s", nVar.f5083h);
                if (bVar2.v()) {
                    bVar2.d("Sending auth.", null, new Object[0]);
                }
                f fVar = new f(nVar, 0);
                HashMap hashMap4 = new HashMap();
                String str3 = nVar.f5091p;
                if (str3.startsWith("gauth|")) {
                    try {
                        HashMap k8 = u3.t.k(str3.substring(6));
                        gVar = new q5.g((String) k8.get("token"), 13, (Map) k8.get("auth"));
                    } catch (IOException e9) {
                        throw new RuntimeException("Failed to parse gauth token", e9);
                    }
                }
                if (gVar != null) {
                    hashMap4.put("cred", (String) gVar.f7527g);
                    Map map2 = (Map) gVar.f7528h;
                    if (map2 != null) {
                        hashMap4.put("authvar", map2);
                    }
                    nVar.l("gauth", true, hashMap4, fVar);
                } else {
                    hashMap4.put("cred", nVar.f5091p);
                    nVar.l("auth", true, hashMap4, fVar);
                }
            } else {
                if (bVar2.v()) {
                    bVar2.d("Not restoring auth because auth token is null.", null, new Object[0]);
                }
                nVar.f5083h = j.f5064j;
                nVar.i();
            }
            nVar.f5080e = false;
            nVar.f5101z = str2;
            iVar.g(l5.c.f6011d, Boolean.TRUE);
        }
    }

    public void v(HashMap hashMap) {
        b1.b bVar = (b1.b) this.f5038f;
        try {
            String str = (String) hashMap.get("t");
            if (str == null) {
                if (bVar.v()) {
                    bVar.d("Failed to parse server message: missing message type:" + hashMap.toString(), null, new Object[0]);
                }
                c(2);
                return;
            }
            if (str.equals("d")) {
                t((Map) hashMap.get("d"));
            } else if (str.equals("c")) {
                s((Map) hashMap.get("d"));
            } else if (bVar.v()) {
                bVar.d("Ignoring unknown server message type: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e9) {
            if (bVar.v()) {
                bVar.d("Failed to parse server message: " + e9.toString(), null, new Object[0]);
            }
            c(2);
        }
    }

    public void w(String str) {
        b1.b bVar = (b1.b) this.f5038f;
        if (bVar.v()) {
            bVar.d("Got a reset; killing connection to " + ((String) ((s0) this.f5035c).f137c) + "; Updating internalHost to " + str, null, new Object[0]);
        }
        ((n) this.f5037e).f5078c = str;
        c(1);
    }

    public String x(String str, boolean z8) {
        r6.k.f(str, "keyToMatch");
        int i7 = this.f5034b;
        try {
            if (f() == 6 && r6.k.a(z(z8), str)) {
                this.f5036d = null;
                if (f() == 5) {
                    return z(z8);
                }
            }
            return null;
        } finally {
            this.f5034b = i7;
            this.f5036d = null;
        }
    }

    public byte y() {
        String str = (String) this.f5038f;
        int i7 = this.f5034b;
        while (true) {
            int A = A(i7);
            if (A == -1) {
                this.f5034b = A;
                return (byte) 10;
            }
            char charAt = str.charAt(A);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f5034b = A;
                return q7.f.c(charAt);
            }
            i7 = A + 1;
        }
    }

    public String z(boolean z8) {
        String j8;
        byte y4 = y();
        if (z8) {
            if (y4 != 1 && y4 != 0) {
                return null;
            }
            j8 = k();
        } else {
            if (y4 != 1) {
                return null;
            }
            j8 = j();
        }
        this.f5036d = j8;
        return j8;
    }

    public a(String str) {
        r6.k.f(str, "source");
        a0.l lVar = new a0.l(3, (byte) 0);
        lVar.f101h = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        lVar.f102i = iArr;
        lVar.f100g = -1;
        this.f5035c = lVar;
        this.f5037e = new StringBuilder();
        this.f5038f = str;
    }
}
