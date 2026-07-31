package o1;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o2.a0;
import o2.m0;
import o2.r;
import o2.z;

/* loaded from: classes.dex */
public final class h extends j1.h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19668b = new a() { // from class: o1.g
        @Override // o1.h.a
        public final boolean a(int i7, int i8, int i9, int i10, int i11) {
            boolean z6;
            z6 = h.z(i7, i8, i9, i10, i11);
            return z6;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a f19669a;

    public interface a {
        boolean a(int i7, int i8, int i9, int i10, int i11);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f19670a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f19671b;

        /* renamed from: c, reason: collision with root package name */
        private final int f19672c;

        public b(int i7, boolean z6, int i8) {
            this.f19670a = i7;
            this.f19671b = z6;
            this.f19672c = i8;
        }
    }

    public h() {
        this(null);
    }

    public h(a aVar) {
        this.f19669a = aVar;
    }

    private static int A(a0 a0Var, int i7) {
        byte[] d7 = a0Var.d();
        int e7 = a0Var.e();
        int i8 = e7;
        while (true) {
            int i9 = i8 + 1;
            if (i9 >= e7 + i7) {
                return i7;
            }
            if ((d7[i8] & 255) == 255 && d7[i9] == 0) {
                System.arraycopy(d7, i8 + 2, d7, i9, (i7 - (i8 - e7)) - 2);
                i7--;
            }
            i8 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean B(a0 a0Var, int i7, int i8, boolean z6) {
        int F;
        long F2;
        int i9;
        int i10;
        int e7 = a0Var.e();
        while (true) {
            try {
                boolean z7 = true;
                if (a0Var.a() < i8) {
                    return true;
                }
                if (i7 >= 3) {
                    F = a0Var.m();
                    F2 = a0Var.E();
                    i9 = a0Var.I();
                } else {
                    F = a0Var.F();
                    F2 = a0Var.F();
                    i9 = 0;
                }
                if (F == 0 && F2 == 0 && i9 == 0) {
                    return true;
                }
                if (i7 == 4 && !z6) {
                    if ((8421504 & F2) != 0) {
                        return false;
                    }
                    F2 = (((F2 >> 24) & 255) << 21) | (F2 & 255) | (((F2 >> 8) & 255) << 7) | (((F2 >> 16) & 255) << 14);
                }
                if (i7 == 4) {
                    i10 = (i9 & 64) != 0 ? 1 : 0;
                } else {
                    if (i7 == 3) {
                        i10 = (i9 & 32) != 0 ? 1 : 0;
                    } else {
                        i10 = 0;
                    }
                    z7 = false;
                    if (z7) {
                        i10 += 4;
                    }
                    if (F2 < i10) {
                        return false;
                    }
                    if (a0Var.a() < F2) {
                        return false;
                    }
                    a0Var.P((int) F2);
                }
            } finally {
                a0Var.O(e7);
            }
        }
    }

    private static byte[] d(byte[] bArr, int i7, int i8) {
        return i8 <= i7 ? m0.f19757f : Arrays.copyOfRange(bArr, i7, i8);
    }

    private static o1.a f(a0 a0Var, int i7, int i8) {
        int y6;
        String str;
        int C = a0Var.C();
        String v6 = v(C);
        int i9 = i7 - 1;
        byte[] bArr = new byte[i9];
        a0Var.j(bArr, 0, i9);
        if (i8 == 2) {
            str = "image/" + l4.b.e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            y6 = 2;
        } else {
            y6 = y(bArr, 0);
            String e7 = l4.b.e(new String(bArr, 0, y6, "ISO-8859-1"));
            if (e7.indexOf(47) == -1) {
                str = "image/" + e7;
            } else {
                str = e7;
            }
        }
        int i10 = bArr[y6 + 1] & 255;
        int i11 = y6 + 2;
        int x6 = x(bArr, i11, C);
        return new o1.a(str, new String(bArr, i11, x6 - i11, v6), i10, d(bArr, x6 + u(C), i9));
    }

    private static o1.b g(a0 a0Var, int i7, String str) {
        byte[] bArr = new byte[i7];
        a0Var.j(bArr, 0, i7);
        return new o1.b(str, bArr);
    }

    private static c h(a0 a0Var, int i7, int i8, boolean z6, int i9, a aVar) {
        int e7 = a0Var.e();
        int y6 = y(a0Var.d(), e7);
        String str = new String(a0Var.d(), e7, y6 - e7, "ISO-8859-1");
        a0Var.O(y6 + 1);
        int m7 = a0Var.m();
        int m8 = a0Var.m();
        long E = a0Var.E();
        long j7 = E == 4294967295L ? -1L : E;
        long E2 = a0Var.E();
        long j8 = E2 == 4294967295L ? -1L : E2;
        ArrayList arrayList = new ArrayList();
        int i10 = e7 + i7;
        while (a0Var.e() < i10) {
            i k7 = k(i8, a0Var, z6, i9, aVar);
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        return new c(str, m7, m8, j7, j8, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(a0 a0Var, int i7, int i8, boolean z6, int i9, a aVar) {
        int e7 = a0Var.e();
        int y6 = y(a0Var.d(), e7);
        String str = new String(a0Var.d(), e7, y6 - e7, "ISO-8859-1");
        a0Var.O(y6 + 1);
        int C = a0Var.C();
        boolean z7 = (C & 2) != 0;
        boolean z8 = (C & 1) != 0;
        int C2 = a0Var.C();
        String[] strArr = new String[C2];
        for (int i10 = 0; i10 < C2; i10++) {
            int e8 = a0Var.e();
            int y7 = y(a0Var.d(), e8);
            strArr[i10] = new String(a0Var.d(), e8, y7 - e8, "ISO-8859-1");
            a0Var.O(y7 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = e7 + i7;
        while (a0Var.e() < i11) {
            i k7 = k(i8, a0Var, z6, i9, aVar);
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        return new d(str, z7, z8, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(a0 a0Var, int i7) {
        if (i7 < 4) {
            return null;
        }
        int C = a0Var.C();
        String v6 = v(C);
        byte[] bArr = new byte[3];
        a0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i8 = i7 - 4;
        byte[] bArr2 = new byte[i8];
        a0Var.j(bArr2, 0, i8);
        int x6 = x(bArr2, 0, C);
        String str2 = new String(bArr2, 0, x6, v6);
        int u6 = x6 + u(C);
        return new e(str, str2, p(bArr2, u6, x(bArr2, u6, C), v6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        if (r13 == 67) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static i k(int i7, a0 a0Var, boolean z6, int i8, a aVar) {
        int G;
        String str;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        i j7;
        int C = a0Var.C();
        int C2 = a0Var.C();
        int C3 = a0Var.C();
        int C4 = i7 >= 3 ? a0Var.C() : 0;
        if (i7 == 4) {
            G = a0Var.G();
            if (!z6) {
                G = (((G >> 24) & 255) << 21) | (G & 255) | (((G >> 8) & 255) << 7) | (((G >> 16) & 255) << 14);
            }
        } else {
            G = i7 == 3 ? a0Var.G() : a0Var.F();
        }
        int i11 = G;
        int I = i7 >= 3 ? a0Var.I() : 0;
        if (C == 0 && C2 == 0 && C3 == 0 && C4 == 0 && i11 == 0 && I == 0) {
            a0Var.O(a0Var.f());
            return null;
        }
        int e7 = a0Var.e() + i11;
        if (e7 > a0Var.f()) {
            r.i("Id3Decoder", "Frame size exceeds remaining tag data");
            a0Var.O(a0Var.f());
            return null;
        }
        if (aVar != null) {
            str = "Id3Decoder";
            i9 = e7;
            i10 = I;
            if (!aVar.a(i7, C, C2, C3, C4)) {
                a0Var.O(i9);
                return null;
            }
        } else {
            str = "Id3Decoder";
            i9 = e7;
            i10 = I;
        }
        if (i7 == 3) {
            int i12 = i10;
            z8 = (i12 & 128) != 0;
            z9 = (i12 & 64) != 0;
            z7 = (i12 & 32) != 0;
            z11 = z8;
            z10 = false;
        } else {
            int i13 = i10;
            if (i7 == 4) {
                boolean z12 = (i13 & 64) != 0;
                boolean z13 = (i13 & 8) != 0;
                boolean z14 = (i13 & 4) != 0;
                z10 = (i13 & 2) != 0;
                boolean z15 = (i13 & 1) != 0;
                z7 = z12;
                z8 = z15;
                z11 = z13;
                z9 = z14;
            } else {
                z7 = false;
                z8 = false;
                z9 = false;
                z10 = false;
                z11 = false;
            }
        }
        if (z11 || z9) {
            r.i(str, "Skipping unsupported compressed or encrypted frame");
            a0Var.O(i9);
            return null;
        }
        if (z7) {
            i11--;
            a0Var.P(1);
        }
        if (z8) {
            i11 -= 4;
            a0Var.P(4);
        }
        if (z10) {
            i11 = A(a0Var, i11);
        }
        try {
            try {
                if (C == 84 && C2 == 88 && C3 == 88 && (i7 == 2 || C4 == 88)) {
                    j7 = r(a0Var, i11);
                } else if (C == 84) {
                    j7 = q(a0Var, i11, w(i7, C, C2, C3, C4));
                } else if (C == 87 && C2 == 88 && C3 == 88 && (i7 == 2 || C4 == 88)) {
                    j7 = t(a0Var, i11);
                } else if (C == 87) {
                    j7 = s(a0Var, i11, w(i7, C, C2, C3, C4));
                } else if (C == 80 && C2 == 82 && C3 == 73 && C4 == 86) {
                    j7 = o(a0Var, i11);
                } else if (C == 71 && C2 == 69 && C3 == 79 && (C4 == 66 || i7 == 2)) {
                    j7 = l(a0Var, i11);
                } else if (i7 == 2) {
                    if (C == 80 && C2 == 73 && C3 == 67) {
                        j7 = f(a0Var, i11, i7);
                    }
                    j7 = (C != 67 && C2 == 79 && C3 == 77 && (C4 == 77 || i7 == 2)) ? j(a0Var, i11) : (C != 67 && C2 == 72 && C3 == 65 && C4 == 80) ? h(a0Var, i11, i7, z6, i8, aVar) : (C != 67 && C2 == 84 && C3 == 79 && C4 == 67) ? i(a0Var, i11, i7, z6, i8, aVar) : (C != 77 && C2 == 76 && C3 == 76 && C4 == 84) ? n(a0Var, i11) : g(a0Var, i11, w(i7, C, C2, C3, C4));
                } else {
                    if (C == 65) {
                        if (C2 == 80) {
                            if (C3 == 73) {
                            }
                        }
                    }
                    if (C != 67) {
                    }
                }
                if (j7 == null) {
                    r.i(str, "Failed to decode frame: id=" + w(i7, C, C2, C3, C4) + ", frameSize=" + i11);
                }
                a0Var.O(i9);
                return j7;
            } catch (UnsupportedEncodingException unused) {
                r.i(str, "Unsupported character encoding");
                a0Var.O(i9);
                return null;
            }
        } catch (Throwable th) {
            a0Var.O(i9);
            throw th;
        }
    }

    private static f l(a0 a0Var, int i7) {
        int C = a0Var.C();
        String v6 = v(C);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        a0Var.j(bArr, 0, i8);
        int y6 = y(bArr, 0);
        String str = new String(bArr, 0, y6, "ISO-8859-1");
        int i9 = y6 + 1;
        int x6 = x(bArr, i9, C);
        String p7 = p(bArr, i9, x6, v6);
        int u6 = x6 + u(C);
        int x7 = x(bArr, u6, C);
        return new f(str, p7, p(bArr, u6, x7, v6), d(bArr, x7 + u(C), i8));
    }

    private static b m(a0 a0Var) {
        StringBuilder sb;
        String str;
        if (a0Var.a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int F = a0Var.F();
            boolean z6 = false;
            if (F == 4801587) {
                int C = a0Var.C();
                a0Var.P(1);
                int C2 = a0Var.C();
                int B = a0Var.B();
                if (C == 2) {
                    if ((C2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (C == 3) {
                    if ((C2 & 64) != 0) {
                        int m7 = a0Var.m();
                        a0Var.P(m7);
                        B -= m7 + 4;
                    }
                } else if (C == 4) {
                    if ((C2 & 64) != 0) {
                        int B2 = a0Var.B();
                        a0Var.P(B2 - 4);
                        B -= B2;
                    }
                    if ((C2 & 16) != 0) {
                        B -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(C);
                }
                if (C < 4 && (C2 & 128) != 0) {
                    z6 = true;
                }
                return new b(C, z6, B);
            }
            sb = new StringBuilder();
            sb.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb.append(String.format("%06X", Integer.valueOf(F)));
            str = sb.toString();
        }
        r.i("Id3Decoder", str);
        return null;
    }

    private static k n(a0 a0Var, int i7) {
        int I = a0Var.I();
        int F = a0Var.F();
        int F2 = a0Var.F();
        int C = a0Var.C();
        int C2 = a0Var.C();
        z zVar = new z();
        zVar.m(a0Var);
        int i8 = ((i7 - 10) * 8) / (C + C2);
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int h7 = zVar.h(C);
            int h8 = zVar.h(C2);
            iArr[i9] = h7;
            iArr2[i9] = h8;
        }
        return new k(I, F, F2, iArr, iArr2);
    }

    private static l o(a0 a0Var, int i7) {
        byte[] bArr = new byte[i7];
        a0Var.j(bArr, 0, i7);
        int y6 = y(bArr, 0);
        return new l(new String(bArr, 0, y6, "ISO-8859-1"), d(bArr, y6 + 1, i7));
    }

    private static String p(byte[] bArr, int i7, int i8, String str) {
        return (i8 <= i7 || i8 > bArr.length) ? "" : new String(bArr, i7, i8 - i7, str);
    }

    private static m q(a0 a0Var, int i7, String str) {
        if (i7 < 1) {
            return null;
        }
        int C = a0Var.C();
        String v6 = v(C);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        a0Var.j(bArr, 0, i8);
        return new m(str, null, new String(bArr, 0, x(bArr, 0, C), v6));
    }

    private static m r(a0 a0Var, int i7) {
        if (i7 < 1) {
            return null;
        }
        int C = a0Var.C();
        String v6 = v(C);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        a0Var.j(bArr, 0, i8);
        int x6 = x(bArr, 0, C);
        String str = new String(bArr, 0, x6, v6);
        int u6 = x6 + u(C);
        return new m("TXXX", str, p(bArr, u6, x(bArr, u6, C), v6));
    }

    private static n s(a0 a0Var, int i7, String str) {
        byte[] bArr = new byte[i7];
        a0Var.j(bArr, 0, i7);
        return new n(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    private static n t(a0 a0Var, int i7) {
        if (i7 < 1) {
            return null;
        }
        int C = a0Var.C();
        String v6 = v(C);
        int i8 = i7 - 1;
        byte[] bArr = new byte[i8];
        a0Var.j(bArr, 0, i8);
        int x6 = x(bArr, 0, C);
        String str = new String(bArr, 0, x6, v6);
        int u6 = x6 + u(C);
        return new n("WXXX", str, p(bArr, u6, y(bArr, u6), "ISO-8859-1"));
    }

    private static int u(int i7) {
        return (i7 == 0 || i7 == 3) ? 1 : 2;
    }

    private static String v(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String w(int i7, int i8, int i9, int i10, int i11) {
        return i7 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private static int x(byte[] bArr, int i7, int i8) {
        int y6 = y(bArr, i7);
        if (i8 == 0 || i8 == 3) {
            return y6;
        }
        while (y6 < bArr.length - 1) {
            if ((y6 - i7) % 2 == 0 && bArr[y6 + 1] == 0) {
                return y6;
            }
            y6 = y(bArr, y6 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i7) {
        while (i7 < bArr.length) {
            if (bArr[i7] == 0) {
                return i7;
            }
            i7++;
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean z(int i7, int i8, int i9, int i10, int i11) {
        return false;
    }

    @Override // j1.h
    protected j1.a b(j1.e eVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public j1.a e(byte[] bArr, int i7) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i7);
        b m7 = m(a0Var);
        if (m7 == null) {
            return null;
        }
        int e7 = a0Var.e();
        int i8 = m7.f19670a == 2 ? 6 : 10;
        int i9 = m7.f19672c;
        if (m7.f19671b) {
            i9 = A(a0Var, m7.f19672c);
        }
        a0Var.N(e7 + i9);
        boolean z6 = false;
        if (!B(a0Var, m7.f19670a, i8, false)) {
            if (m7.f19670a != 4 || !B(a0Var, 4, i8, true)) {
                r.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m7.f19670a);
                return null;
            }
            z6 = true;
        }
        while (a0Var.a() >= i8) {
            i k7 = k(m7.f19670a, a0Var, z6, i8, this.f19669a);
            if (k7 != null) {
                arrayList.add(k7);
            }
        }
        return new j1.a(arrayList);
    }
}
