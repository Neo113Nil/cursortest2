package w0;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o2.m0;
import r0.n2;

/* loaded from: classes.dex */
public final class h0 {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f22918a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22919b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f22920c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22921d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f22922e;

        public a(int i7, int i8, long[] jArr, int i9, boolean z6) {
            this.f22918a = i7;
            this.f22919b = i8;
            this.f22920c = jArr;
            this.f22921d = i9;
            this.f22922e = z6;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f22923a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f22924b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22925c;

        public b(String str, String[] strArr, int i7) {
            this.f22923a = str;
            this.f22924b = strArr;
            this.f22925c = i7;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22926a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22927b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22928c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22929d;

        public c(boolean z6, int i7, int i8, int i9) {
            this.f22926a = z6;
            this.f22927b = i7;
            this.f22928c = i8;
            this.f22929d = i9;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f22930a;

        /* renamed from: b, reason: collision with root package name */
        public final int f22931b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22932c;

        /* renamed from: d, reason: collision with root package name */
        public final int f22933d;

        /* renamed from: e, reason: collision with root package name */
        public final int f22934e;

        /* renamed from: f, reason: collision with root package name */
        public final int f22935f;

        /* renamed from: g, reason: collision with root package name */
        public final int f22936g;

        /* renamed from: h, reason: collision with root package name */
        public final int f22937h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f22938i;

        /* renamed from: j, reason: collision with root package name */
        public final byte[] f22939j;

        public d(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6, byte[] bArr) {
            this.f22930a = i7;
            this.f22931b = i8;
            this.f22932c = i9;
            this.f22933d = i10;
            this.f22934e = i11;
            this.f22935f = i12;
            this.f22936g = i13;
            this.f22937h = i14;
            this.f22938i = z6;
            this.f22939j = bArr;
        }
    }

    public static int a(int i7) {
        int i8 = 0;
        while (i7 > 0) {
            i8++;
            i7 >>>= 1;
        }
        return i8;
    }

    private static long b(long j7, long j8) {
        double d7 = j8;
        Double.isNaN(d7);
        return (long) Math.floor(Math.pow(j7, 1.0d / d7));
    }

    public static j1.a c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            String str = list.get(i7);
            String[] R0 = m0.R0(str, "=");
            if (R0.length != 2) {
                o2.r.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (R0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(m1.a.a(new o2.a0(Base64.decode(R0[1], 0))));
                } catch (RuntimeException e7) {
                    o2.r.j("VorbisUtil", "Failed to parse vorbis picture", e7);
                }
            } else {
                arrayList.add(new r1.a(R0[0], R0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j1.a(arrayList);
    }

    private static a d(g0 g0Var) {
        if (g0Var.d(24) != 5653314) {
            throw n2.a("expected code book to start with [0x56, 0x43, 0x42] at " + g0Var.b(), null);
        }
        int d7 = g0Var.d(16);
        int d8 = g0Var.d(24);
        long[] jArr = new long[d8];
        boolean c7 = g0Var.c();
        long j7 = 0;
        if (c7) {
            int d9 = g0Var.d(5) + 1;
            int i7 = 0;
            while (i7 < d8) {
                int d10 = g0Var.d(a(d8 - i7));
                for (int i8 = 0; i8 < d10 && i7 < d8; i8++) {
                    jArr[i7] = d9;
                    i7++;
                }
                d9++;
            }
        } else {
            boolean c8 = g0Var.c();
            for (int i9 = 0; i9 < d8; i9++) {
                if (!c8) {
                    jArr[i9] = g0Var.d(5) + 1;
                } else if (g0Var.c()) {
                    jArr[i9] = g0Var.d(5) + 1;
                } else {
                    jArr[i9] = 0;
                }
            }
        }
        int d11 = g0Var.d(4);
        if (d11 > 2) {
            throw n2.a("lookup type greater than 2 not decodable: " + d11, null);
        }
        if (d11 == 1 || d11 == 2) {
            g0Var.e(32);
            g0Var.e(32);
            int d12 = g0Var.d(4) + 1;
            g0Var.e(1);
            if (d11 != 1) {
                j7 = d8 * d7;
            } else if (d7 != 0) {
                j7 = b(d8, d7);
            }
            g0Var.e((int) (j7 * d12));
        }
        return new a(d7, d8, jArr, d11, c7);
    }

    private static void e(g0 g0Var) {
        int d7 = g0Var.d(6) + 1;
        for (int i7 = 0; i7 < d7; i7++) {
            int d8 = g0Var.d(16);
            if (d8 == 0) {
                g0Var.e(8);
                g0Var.e(16);
                g0Var.e(16);
                g0Var.e(6);
                g0Var.e(8);
                int d9 = g0Var.d(4) + 1;
                for (int i8 = 0; i8 < d9; i8++) {
                    g0Var.e(8);
                }
            } else {
                if (d8 != 1) {
                    throw n2.a("floor type greater than 1 not decodable: " + d8, null);
                }
                int d10 = g0Var.d(5);
                int i9 = -1;
                int[] iArr = new int[d10];
                for (int i10 = 0; i10 < d10; i10++) {
                    iArr[i10] = g0Var.d(4);
                    if (iArr[i10] > i9) {
                        i9 = iArr[i10];
                    }
                }
                int i11 = i9 + 1;
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr2[i12] = g0Var.d(3) + 1;
                    int d11 = g0Var.d(2);
                    if (d11 > 0) {
                        g0Var.e(8);
                    }
                    for (int i13 = 0; i13 < (1 << d11); i13++) {
                        g0Var.e(8);
                    }
                }
                g0Var.e(2);
                int d12 = g0Var.d(4);
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < d10; i16++) {
                    i14 += iArr2[iArr[i16]];
                    while (i15 < i14) {
                        g0Var.e(d12);
                        i15++;
                    }
                }
            }
        }
    }

    private static void f(int i7, g0 g0Var) {
        int d7 = g0Var.d(6) + 1;
        for (int i8 = 0; i8 < d7; i8++) {
            int d8 = g0Var.d(16);
            if (d8 != 0) {
                o2.r.c("VorbisUtil", "mapping type other than 0 not supported: " + d8);
            } else {
                int d9 = g0Var.c() ? g0Var.d(4) + 1 : 1;
                if (g0Var.c()) {
                    int d10 = g0Var.d(8) + 1;
                    for (int i9 = 0; i9 < d10; i9++) {
                        int i10 = i7 - 1;
                        g0Var.e(a(i10));
                        g0Var.e(a(i10));
                    }
                }
                if (g0Var.d(2) != 0) {
                    throw n2.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d9 > 1) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        g0Var.e(4);
                    }
                }
                for (int i12 = 0; i12 < d9; i12++) {
                    g0Var.e(8);
                    g0Var.e(8);
                    g0Var.e(8);
                }
            }
        }
    }

    private static c[] g(g0 g0Var) {
        int d7 = g0Var.d(6) + 1;
        c[] cVarArr = new c[d7];
        for (int i7 = 0; i7 < d7; i7++) {
            cVarArr[i7] = new c(g0Var.c(), g0Var.d(16), g0Var.d(16), g0Var.d(8));
        }
        return cVarArr;
    }

    private static void h(g0 g0Var) {
        int d7 = g0Var.d(6) + 1;
        for (int i7 = 0; i7 < d7; i7++) {
            if (g0Var.d(16) > 2) {
                throw n2.a("residueType greater than 2 is not decodable", null);
            }
            g0Var.e(24);
            g0Var.e(24);
            g0Var.e(24);
            int d8 = g0Var.d(6) + 1;
            g0Var.e(8);
            int[] iArr = new int[d8];
            for (int i8 = 0; i8 < d8; i8++) {
                iArr[i8] = ((g0Var.c() ? g0Var.d(5) : 0) * 8) + g0Var.d(3);
            }
            for (int i9 = 0; i9 < d8; i9++) {
                for (int i10 = 0; i10 < 8; i10++) {
                    if ((iArr[i9] & (1 << i10)) != 0) {
                        g0Var.e(8);
                    }
                }
            }
        }
    }

    public static b i(o2.a0 a0Var) {
        return j(a0Var, true, true);
    }

    public static b j(o2.a0 a0Var, boolean z6, boolean z7) {
        if (z6) {
            m(3, a0Var, false);
        }
        String z8 = a0Var.z((int) a0Var.s());
        int length = 11 + z8.length();
        long s7 = a0Var.s();
        String[] strArr = new String[(int) s7];
        int i7 = length + 4;
        for (int i8 = 0; i8 < s7; i8++) {
            strArr[i8] = a0Var.z((int) a0Var.s());
            i7 = i7 + 4 + strArr[i8].length();
        }
        if (z7 && (a0Var.C() & 1) == 0) {
            throw n2.a("framing bit expected to be set", null);
        }
        return new b(z8, strArr, i7 + 1);
    }

    public static d k(o2.a0 a0Var) {
        m(1, a0Var, false);
        int t6 = a0Var.t();
        int C = a0Var.C();
        int t7 = a0Var.t();
        int p7 = a0Var.p();
        if (p7 <= 0) {
            p7 = -1;
        }
        int p8 = a0Var.p();
        if (p8 <= 0) {
            p8 = -1;
        }
        int p9 = a0Var.p();
        if (p9 <= 0) {
            p9 = -1;
        }
        int C2 = a0Var.C();
        return new d(t6, C, t7, p7, p8, p9, (int) Math.pow(2.0d, C2 & 15), (int) Math.pow(2.0d, (C2 & 240) >> 4), (a0Var.C() & 1) > 0, Arrays.copyOf(a0Var.d(), a0Var.f()));
    }

    public static c[] l(o2.a0 a0Var, int i7) {
        m(5, a0Var, false);
        int C = a0Var.C() + 1;
        g0 g0Var = new g0(a0Var.d());
        g0Var.e(a0Var.e() * 8);
        for (int i8 = 0; i8 < C; i8++) {
            d(g0Var);
        }
        int d7 = g0Var.d(6) + 1;
        for (int i9 = 0; i9 < d7; i9++) {
            if (g0Var.d(16) != 0) {
                throw n2.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        e(g0Var);
        h(g0Var);
        f(i7, g0Var);
        c[] g7 = g(g0Var);
        if (g0Var.c()) {
            return g7;
        }
        throw n2.a("framing bit after modes not set as expected", null);
    }

    public static boolean m(int i7, o2.a0 a0Var, boolean z6) {
        if (a0Var.a() < 7) {
            if (z6) {
                return false;
            }
            throw n2.a("too short header: " + a0Var.a(), null);
        }
        if (a0Var.C() != i7) {
            if (z6) {
                return false;
            }
            throw n2.a("expected header type " + Integer.toHexString(i7), null);
        }
        if (a0Var.C() == 118 && a0Var.C() == 111 && a0Var.C() == 114 && a0Var.C() == 98 && a0Var.C() == 105 && a0Var.C() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw n2.a("expected characters 'vorbis'", null);
    }
}
