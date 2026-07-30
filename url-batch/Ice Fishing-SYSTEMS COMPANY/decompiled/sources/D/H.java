package D;

import O7.AbstractC0399y;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import m.Q0;
import r7.AbstractC4979j;
import u.AbstractC5088e;
import v7.C5134e;
import v7.C5139j;
import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class H implements R7.b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f490n;

    /* renamed from: u, reason: collision with root package name */
    public int f491u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f492v;

    /* renamed from: w, reason: collision with root package name */
    public Object f493w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f494x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f495y;

    public H(Q0 q02) {
        this.f490n = 3;
        ArrayList arrayList = (ArrayList) q02.f39326c;
        int size = arrayList.size();
        this.f492v = (String[]) ((ArrayList) q02.f39325b).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f493w = dArr;
        ArrayList arrayList2 = (ArrayList) q02.f39327d;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i4 = 0; i4 < size3; i4++) {
            dArr2[i4] = ((Double) arrayList2.get(i4)).doubleValue();
        }
        this.f494x = dArr2;
        this.f495y = new int[size];
        this.f491u = 0;
    }

    public static /* synthetic */ void n(H h9, String str, int i, int i4) {
        if ((i4 & 2) != 0) {
            i = h9.f491u;
        }
        h9.m(i, str, (i4 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(CharSequence charSequence, int i) {
        int i4 = i + 4;
        if (i4 < charSequence.length()) {
            ((StringBuilder) this.f494x).append((char) (q(charSequence, i + 3) + (q(charSequence, i) << 12) + (q(charSequence, i + 1) << 8) + (q(charSequence, i + 2) << 4)));
            return i4;
        }
        this.f491u = i;
        if (i4 < charSequence.length()) {
            return a(charSequence, this.f491u);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        int i = this.f491u;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f495y;
            if (i >= str.length()) {
                this.f491u = i;
                return false;
            }
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f491u = i;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i++;
        }
    }

    public void c(int i, String str) {
        String str2 = (String) this.f495y;
        if (str2.length() - i < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) != (str2.charAt(i + i4) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.f491u = str.length() + i;
    }

    public String d() {
        g('\"');
        int i = this.f491u;
        String str = (String) this.f495y;
        int Q3 = M7.j.Q(str, '\"', i, 4);
        if (Q3 == -1) {
            k();
            o((byte) 1, false);
            throw null;
        }
        int i4 = i;
        while (i4 < Q3) {
            if (str.charAt(i4) == '\\') {
                int i9 = this.f491u;
                char charAt = str.charAt(i4);
                boolean z8 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f494x).append((CharSequence) str, i9, i4);
                        int s3 = s(i4 + 1);
                        if (s3 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int i10 = s3 + 1;
                        char charAt2 = str.charAt(s3);
                        if (charAt2 == 'u') {
                            i10 = a(str, i10);
                        } else {
                            char c4 = charAt2 < 'u' ? c8.d.f5767a[charAt2] : (char) 0;
                            if (c4 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f494x).append(c4);
                        }
                        i9 = s(i10);
                        if (i9 == -1) {
                            n(this, "Unexpected EOF", i9, 4);
                            throw null;
                        }
                    } else {
                        i4++;
                        if (i4 >= str.length()) {
                            ((StringBuilder) this.f494x).append((CharSequence) str, i9, i4);
                            i9 = s(i4);
                            if (i9 == -1) {
                                n(this, "Unexpected EOF", i9, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i4);
                        }
                    }
                    i4 = i9;
                    z8 = true;
                    charAt = str.charAt(i4);
                }
                String obj = !z8 ? str.subSequence(i9, i4).toString() : l(i9, i4);
                this.f491u = i4 + 1;
                return obj;
            }
            i4++;
        }
        this.f491u = Q3 + 1;
        String substring = str.substring(i, Q3);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public byte e() {
        byte d2;
        do {
            int i = this.f491u;
            if (i == -1) {
                return (byte) 10;
            }
            String str = (String) this.f495y;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i4 = this.f491u;
            this.f491u = i4 + 1;
            d2 = c8.m.d(str.charAt(i4));
        } while (d2 == 3);
        return d2;
    }

    public byte f(byte b9) {
        byte e6 = e();
        if (e6 == b9) {
            return e6;
        }
        o(b9, true);
        throw null;
    }

    public void g(char c4) {
        if (this.f491u == -1) {
            w(c4);
            throw null;
        }
        while (true) {
            int i = this.f491u;
            String str = (String) this.f495y;
            if (i >= str.length()) {
                this.f491u = -1;
                w(c4);
                throw null;
            }
            int i4 = this.f491u;
            this.f491u = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c4) {
                    return;
                }
                w(c4);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0186, code lost:
    
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x014f, code lost:
    
        if (r5 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0151, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0191, code lost:
    
        throw new B0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0192, code lost:
    
        if (r14 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0194, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0199, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x019c, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x019d, code lost:
    
        n(r22, "Numeric value overflow", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a3, code lost:
    
        n(r22, "Expected numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0113, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        n(r22, "Unexpected symbol '" + r15 + "' in numeric literal", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x010f, code lost:
    
        if (r12 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0114, code lost:
    
        if (r1 == r12) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
    
        if (r14 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x011a, code lost:
    
        if (r1 == (r12 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0121, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0123, code lost:
    
        if (r3 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
    
        if (r2.charAt(r12) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012d, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        n(r22, "Expected closing quotation mark", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0137, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        n(r22, "EOF", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013e, code lost:
    
        r22.f491u = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0140, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0142, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        if (r5 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0156, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0161, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0169, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016b, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016d, code lost:
    
        n(r22, "Can't convert " + r1 + " to Long", 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0185, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long h() {
        boolean z8;
        boolean z9;
        boolean z10;
        int s3 = s(t());
        String str = (String) this.f495y;
        if (s3 < str.length() && s3 != -1) {
            if (str.charAt(s3) == '\"') {
                s3++;
                if (s3 == str.length()) {
                    n(this, "EOF", 0, 6);
                    throw null;
                }
                z8 = true;
            } else {
                z8 = false;
            }
            int i = s3;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            long j9 = 0;
            long j10 = 0;
            while (true) {
                if (i == str.length()) {
                    z9 = z8;
                    z10 = z12;
                    break;
                }
                char charAt = str.charAt(i);
                if ((charAt != 'e' && charAt != 'E') || z12) {
                    z9 = z8;
                    if (charAt == '-' && z12) {
                        if (i == s3) {
                            n(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                            throw null;
                        }
                        i++;
                        z8 = z9;
                        z11 = false;
                    } else if (charAt != '+' || !z12) {
                        z10 = z12;
                        if (charAt != '-') {
                            if (c8.m.d(charAt) != 0) {
                                break;
                            }
                            i++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z10) {
                                j9 = (j9 * 10) + i4;
                                z8 = z9;
                            } else {
                                j10 = (j10 * 10) - i4;
                                if (j10 > 0) {
                                    n(this, "Numeric value overflow", 0, 6);
                                    throw null;
                                }
                                z8 = z9;
                                i = i;
                            }
                            z12 = z10;
                        } else {
                            if (i != s3) {
                                n(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                                throw null;
                            }
                            i++;
                            z8 = z9;
                            z12 = z10;
                            z13 = true;
                        }
                    } else {
                        if (i == s3) {
                            n(this, "Unexpected symbol '+' in numeric literal", 0, 6);
                            throw null;
                        }
                        i++;
                        z8 = z9;
                        z11 = true;
                    }
                } else {
                    if (i == s3) {
                        n(this, "Unexpected symbol " + charAt + " in numeric literal", 0, 6);
                        throw null;
                    }
                    i++;
                    z11 = true;
                    z12 = true;
                }
            }
        } else {
            n(this, "EOF", 0, 6);
            throw null;
        }
    }

    public String i() {
        String str = (String) this.f493w;
        if (str == null) {
            return d();
        }
        kotlin.jvm.internal.h.b(str);
        this.f493w = null;
        return str;
    }

    @Override // R7.b
    public Object j(R7.c cVar, InterfaceC5133d interfaceC5133d) {
        q7.v vVar = q7.v.f40183a;
        if (this.f491u == -3) {
            InterfaceC5138i context = interfaceC5133d.getContext();
            Boolean bool = Boolean.FALSE;
            O7.r rVar = O7.r.f2622v;
            InterfaceC5138i interfaceC5138i = (InterfaceC5138i) this.f492v;
            InterfaceC5138i n9 = !((Boolean) interfaceC5138i.m(bool, rVar)).booleanValue() ? context.n(interfaceC5138i) : AbstractC0399y.h(context, interfaceC5138i, false);
            if (kotlin.jvm.internal.h.a(n9, context)) {
                Object p6 = p(cVar, interfaceC5133d);
                if (p6 == EnumC5179a.f41704n) {
                    return p6;
                }
            } else {
                C5134e c5134e = C5134e.f41371n;
                if (kotlin.jvm.internal.h.a(n9.i(c5134e), context.i(c5134e))) {
                    InterfaceC5138i context2 = interfaceC5133d.getContext();
                    if (!(cVar instanceof S7.u ? true : cVar instanceof S7.n)) {
                        cVar = new R7.f(cVar, context2);
                    }
                    Object a9 = S7.o.a(n9, cVar, T7.a.l(n9), new S7.f(this, null), interfaceC5133d);
                    if (a9 == EnumC5179a.f41704n) {
                        return a9;
                    }
                }
            }
        }
        Object e6 = AbstractC0399y.e(new S7.d(this, cVar, null), interfaceC5133d);
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        if (e6 != enumC5179a) {
            e6 = vVar;
        }
        return e6 == enumC5179a ? e6 : vVar;
    }

    public String k() {
        String str = (String) this.f493w;
        if (str != null) {
            kotlin.jvm.internal.h.b(str);
            this.f493w = null;
            return str;
        }
        int t9 = t();
        String str2 = (String) this.f495y;
        if (t9 >= str2.length() || t9 == -1) {
            n(this, "EOF", t9, 4);
            throw null;
        }
        byte d2 = c8.m.d(str2.charAt(t9));
        if (d2 == 1) {
            return i();
        }
        if (d2 != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(t9), 0, 6);
            throw null;
        }
        boolean z8 = false;
        while (c8.m.d(str2.charAt(t9)) == 0) {
            t9++;
            if (t9 >= str2.length()) {
                ((StringBuilder) this.f494x).append((CharSequence) str2, this.f491u, t9);
                int s3 = s(t9);
                if (s3 == -1) {
                    this.f491u = t9;
                    return l(0, 0);
                }
                t9 = s3;
                z8 = true;
            }
        }
        String obj = !z8 ? str2.subSequence(this.f491u, t9).toString() : l(this.f491u, t9);
        this.f491u = t9;
        return obj;
    }

    public String l(int i, int i4) {
        ((StringBuilder) this.f494x).append((CharSequence) this.f495y, i, i4);
        StringBuilder sb = (StringBuilder) this.f494x;
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void m(int i, String message, String hint) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder c4 = AbstractC5088e.c(message, " at path: ");
        c4.append(((F.d) this.f492v).f());
        c4.append(concat);
        throw c8.m.b(i, (String) this.f495y, c4.toString());
    }

    public void o(byte b9, boolean z8) {
        String j9 = c8.m.j(b9);
        int i = z8 ? this.f491u - 1 : this.f491u;
        int i4 = this.f491u;
        String str = (String) this.f495y;
        n(this, y.l("Expected ", j9, ", but had '", (i4 == str.length() || i < 0) ? "EOF" : String.valueOf(str.charAt(i)), "' instead"), i, 4);
        throw null;
    }

    public Object p(R7.c cVar, InterfaceC5133d interfaceC5133d) {
        Object e6 = AbstractC0399y.e(new S7.j(this, cVar, null), interfaceC5133d);
        return e6 == EnumC5179a.f41704n ? e6 : q7.v.f40183a;
    }

    public int q(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public byte r() {
        int i = this.f491u;
        while (true) {
            int s3 = s(i);
            if (s3 == -1) {
                this.f491u = s3;
                return (byte) 10;
            }
            char charAt = ((String) this.f495y).charAt(s3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f491u = s3;
                return c8.m.d(charAt);
            }
            i = s3 + 1;
        }
    }

    public int s(int i) {
        if (i < ((String) this.f495y).length()) {
            return i;
        }
        return -1;
    }

    public int t() {
        char charAt;
        int i = this.f491u;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = (String) this.f495y;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.f491u = i;
        return i;
    }

    public String toString() {
        switch (this.f490n) {
            case 1:
                return ((R7.l) this.f494x) + " -> " + u();
            case 2:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f495y);
                sb.append("', currentPosition=");
                return y.m(sb, this.f491u, ')');
            default:
                return super.toString();
        }
    }

    public String u() {
        ArrayList arrayList = new ArrayList(4);
        C5139j c5139j = C5139j.f41372n;
        InterfaceC5138i interfaceC5138i = (InterfaceC5138i) this.f492v;
        if (interfaceC5138i != c5139j) {
            arrayList.add("context=" + interfaceC5138i);
        }
        int i = this.f491u;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        Q7.a aVar = Q7.a.f2731n;
        Q7.a aVar2 = (Q7.a) this.f493w;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + AbstractC4979j.K(arrayList, ", ", null, null, null, 62) + ']';
    }

    public boolean v() {
        int t9 = t();
        String str = (String) this.f495y;
        if (t9 == str.length() || t9 == -1 || str.charAt(t9) != ',') {
            return false;
        }
        this.f491u++;
        return true;
    }

    public void w(char c4) {
        int i = this.f491u;
        if (i > 0 && c4 == '\"') {
            try {
                this.f491u = i - 1;
                String k6 = k();
                this.f491u = i;
                if (kotlin.jvm.internal.h.a(k6, "null")) {
                    m(this.f491u - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f491u = i;
                throw th;
            }
        }
        o(c8.m.d(c4), true);
        throw null;
    }

    public H(R7.g gVar, R7.l lVar, InterfaceC5138i interfaceC5138i, int i, Q7.a aVar) {
        this.f490n = 1;
        this.f490n = 1;
        this.f492v = interfaceC5138i;
        this.f491u = i;
        this.f493w = aVar;
        this.f494x = lVar;
        this.f495y = gVar;
    }

    public H(v vVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i4;
        this.f490n = 0;
        new ArrayList();
        this.f495y = new Bundle();
        this.f494x = vVar;
        Context context = vVar.f549a;
        this.f492v = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f493w = D.a(context, vVar.f566s);
        } else {
            this.f493w = new Notification.Builder(vVar.f549a);
        }
        Notification notification = vVar.f569v;
        int i9 = 0;
        ((Notification.Builder) this.f493w).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(vVar.f553e).setContentText(vVar.f554f).setContentInfo(null).setContentIntent(vVar.f555g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(vVar.i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f493w;
        IconCompat iconCompat = vVar.f556h;
        B.b(builder, iconCompat == null ? null : H.c.c(iconCompat, context));
        ((Notification.Builder) this.f493w).setSubText(null).setUsesChronometer(false).setPriority(vVar.f557j);
        Iterator it = vVar.f550b.iterator();
        while (it.hasNext()) {
            C0296p c0296p = (C0296p) it.next();
            if (c0296p.f538b == null && (i4 = c0296p.f541e) != 0) {
                c0296p.f538b = IconCompat.b(i4);
            }
            IconCompat iconCompat2 = c0296p.f538b;
            Notification.Action.Builder a9 = B.a(iconCompat2 != null ? H.c.c(iconCompat2, null) : null, c0296p.f542f, c0296p.f543g);
            Bundle bundle3 = c0296p.f537a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z8 = c0296p.f539c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z8);
            int i10 = Build.VERSION.SDK_INT;
            C.a(a9, z8);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i10 >= 28) {
                E.b(a9, 0);
            }
            if (i10 >= 29) {
                F.c(a9, false);
            }
            if (i10 >= 31) {
                G.a(a9, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0296p.f540d);
            z.b(a9, bundle2);
            z.a((Notification.Builder) this.f493w, z.d(a9));
        }
        Bundle bundle4 = vVar.f563p;
        if (bundle4 != null) {
            ((Bundle) this.f495y).putAll(bundle4);
        }
        int i11 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f493w).setShowWhen(vVar.f558k);
        z.i((Notification.Builder) this.f493w, vVar.f562o);
        z.g((Notification.Builder) this.f493w, vVar.f560m);
        z.j((Notification.Builder) this.f493w, null);
        z.h((Notification.Builder) this.f493w, vVar.f561n);
        this.f491u = vVar.f567t;
        A.b((Notification.Builder) this.f493w, null);
        A.c((Notification.Builder) this.f493w, vVar.f564q);
        A.f((Notification.Builder) this.f493w, vVar.f565r);
        A.d((Notification.Builder) this.f493w, null);
        A.e((Notification.Builder) this.f493w, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = vVar.f570w;
        ArrayList arrayList3 = vVar.f551c;
        if (i11 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw y.h(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    s.c cVar = new s.c(arrayList2.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                A.a((Notification.Builder) this.f493w, (String) it3.next());
            }
        }
        ArrayList arrayList4 = vVar.f552d;
        if (arrayList4.size() > 0) {
            if (vVar.f563p == null) {
                vVar.f563p = new Bundle();
            }
            Bundle bundle5 = vVar.f563p.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList4.size()) {
                String num = Integer.toString(i12);
                C0296p c0296p2 = (C0296p) arrayList4.get(i12);
                Bundle bundle8 = new Bundle();
                if (c0296p2.f538b == null && (i = c0296p2.f541e) != 0) {
                    c0296p2.f538b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = c0296p2.f538b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i9);
                bundle8.putCharSequence("title", c0296p2.f542f);
                bundle8.putParcelable("actionIntent", c0296p2.f543g);
                Bundle bundle9 = c0296p2.f537a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0296p2.f539c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0296p2.f540d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i12++;
                i9 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (vVar.f563p == null) {
                vVar.f563p = new Bundle();
            }
            vVar.f563p.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f495y).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f493w).setExtras(vVar.f563p);
        C.e((Notification.Builder) this.f493w, null);
        if (i13 >= 26) {
            D.b((Notification.Builder) this.f493w, 0);
            D.e((Notification.Builder) this.f493w, null);
            D.f((Notification.Builder) this.f493w, null);
            D.g((Notification.Builder) this.f493w, 0L);
            D.d((Notification.Builder) this.f493w, vVar.f567t);
            if (!TextUtils.isEmpty(vVar.f566s)) {
                ((Notification.Builder) this.f493w).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw y.h(it4);
            }
        }
        if (i13 >= 29) {
            F.a((Notification.Builder) this.f493w, vVar.f568u);
            F.b((Notification.Builder) this.f493w, null);
        }
    }

    public H(String source) {
        this.f490n = 2;
        kotlin.jvm.internal.h.e(source, "source");
        F.d dVar = new F.d((byte) 0, 5);
        dVar.f909c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        dVar.f910d = iArr;
        dVar.f908b = -1;
        this.f492v = dVar;
        this.f494x = new StringBuilder();
        this.f495y = source;
    }
}
