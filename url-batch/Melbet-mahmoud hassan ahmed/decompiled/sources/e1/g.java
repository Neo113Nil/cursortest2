package e1;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import e1.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o2.a0;
import o2.i0;
import o2.m0;
import o2.w;
import r0.n2;
import r0.s1;
import v0.m;
import w0.b0;
import w0.e0;
import w0.x;

/* loaded from: classes.dex */
public class g implements w0.l {
    public static final w0.r I = new w0.r() { // from class: e1.f
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] m7;
            m7 = g.m();
            return m7;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final s1 K = new s1.b().e0("application/x-emsg").E();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private w0.n E;
    private e0[] F;
    private e0[] G;
    private boolean H;

    /* renamed from: a, reason: collision with root package name */
    private final int f15884a;

    /* renamed from: b, reason: collision with root package name */
    private final o f15885b;

    /* renamed from: c, reason: collision with root package name */
    private final List<s1> f15886c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<b> f15887d;

    /* renamed from: e, reason: collision with root package name */
    private final a0 f15888e;

    /* renamed from: f, reason: collision with root package name */
    private final a0 f15889f;

    /* renamed from: g, reason: collision with root package name */
    private final a0 f15890g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f15891h;

    /* renamed from: i, reason: collision with root package name */
    private final a0 f15892i;

    /* renamed from: j, reason: collision with root package name */
    private final i0 f15893j;

    /* renamed from: k, reason: collision with root package name */
    private final l1.c f15894k;

    /* renamed from: l, reason: collision with root package name */
    private final a0 f15895l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayDeque<a.C0056a> f15896m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque<a> f15897n;

    /* renamed from: o, reason: collision with root package name */
    private final e0 f15898o;

    /* renamed from: p, reason: collision with root package name */
    private int f15899p;

    /* renamed from: q, reason: collision with root package name */
    private int f15900q;

    /* renamed from: r, reason: collision with root package name */
    private long f15901r;

    /* renamed from: s, reason: collision with root package name */
    private int f15902s;

    /* renamed from: t, reason: collision with root package name */
    private a0 f15903t;

    /* renamed from: u, reason: collision with root package name */
    private long f15904u;

    /* renamed from: v, reason: collision with root package name */
    private int f15905v;

    /* renamed from: w, reason: collision with root package name */
    private long f15906w;

    /* renamed from: x, reason: collision with root package name */
    private long f15907x;

    /* renamed from: y, reason: collision with root package name */
    private long f15908y;

    /* renamed from: z, reason: collision with root package name */
    private b f15909z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f15910a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15911b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15912c;

        public a(long j7, boolean z6, int i7) {
            this.f15910a = j7;
            this.f15911b = z6;
            this.f15912c = i7;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final e0 f15913a;

        /* renamed from: d, reason: collision with root package name */
        public r f15916d;

        /* renamed from: e, reason: collision with root package name */
        public c f15917e;

        /* renamed from: f, reason: collision with root package name */
        public int f15918f;

        /* renamed from: g, reason: collision with root package name */
        public int f15919g;

        /* renamed from: h, reason: collision with root package name */
        public int f15920h;

        /* renamed from: i, reason: collision with root package name */
        public int f15921i;

        /* renamed from: l, reason: collision with root package name */
        private boolean f15924l;

        /* renamed from: b, reason: collision with root package name */
        public final q f15914b = new q();

        /* renamed from: c, reason: collision with root package name */
        public final a0 f15915c = new a0();

        /* renamed from: j, reason: collision with root package name */
        private final a0 f15922j = new a0(1);

        /* renamed from: k, reason: collision with root package name */
        private final a0 f15923k = new a0();

        public b(e0 e0Var, r rVar, c cVar) {
            this.f15913a = e0Var;
            this.f15916d = rVar;
            this.f15917e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i7 = !this.f15924l ? this.f15916d.f16010g[this.f15918f] : this.f15914b.f15996k[this.f15918f] ? 1 : 0;
            return g() != null ? i7 | 1073741824 : i7;
        }

        public long d() {
            return !this.f15924l ? this.f15916d.f16006c[this.f15918f] : this.f15914b.f15992g[this.f15920h];
        }

        public long e() {
            return !this.f15924l ? this.f15916d.f16009f[this.f15918f] : this.f15914b.c(this.f15918f);
        }

        public int f() {
            return !this.f15924l ? this.f15916d.f16007d[this.f15918f] : this.f15914b.f15994i[this.f15918f];
        }

        public p g() {
            if (!this.f15924l) {
                return null;
            }
            int i7 = ((c) m0.j(this.f15914b.f15986a)).f15872a;
            p pVar = this.f15914b.f15999n;
            if (pVar == null) {
                pVar = this.f15916d.f16004a.a(i7);
            }
            if (pVar == null || !pVar.f15981a) {
                return null;
            }
            return pVar;
        }

        public boolean h() {
            this.f15918f++;
            if (!this.f15924l) {
                return false;
            }
            int i7 = this.f15919g + 1;
            this.f15919g = i7;
            int[] iArr = this.f15914b.f15993h;
            int i8 = this.f15920h;
            if (i7 != iArr[i8]) {
                return true;
            }
            this.f15920h = i8 + 1;
            this.f15919g = 0;
            return false;
        }

        public int i(int i7, int i8) {
            a0 a0Var;
            p g7 = g();
            if (g7 == null) {
                return 0;
            }
            int i9 = g7.f15984d;
            if (i9 != 0) {
                a0Var = this.f15914b.f16000o;
            } else {
                byte[] bArr = (byte[]) m0.j(g7.f15985e);
                this.f15923k.M(bArr, bArr.length);
                a0 a0Var2 = this.f15923k;
                i9 = bArr.length;
                a0Var = a0Var2;
            }
            boolean g8 = this.f15914b.g(this.f15918f);
            boolean z6 = g8 || i8 != 0;
            this.f15922j.d()[0] = (byte) ((z6 ? 128 : 0) | i9);
            this.f15922j.O(0);
            this.f15913a.c(this.f15922j, 1, 1);
            this.f15913a.c(a0Var, i9, 1);
            if (!z6) {
                return i9 + 1;
            }
            if (!g8) {
                this.f15915c.K(8);
                byte[] d7 = this.f15915c.d();
                d7[0] = 0;
                d7[1] = 1;
                d7[2] = (byte) ((i8 >> 8) & 255);
                d7[3] = (byte) (i8 & 255);
                d7[4] = (byte) ((i7 >> 24) & 255);
                d7[5] = (byte) ((i7 >> 16) & 255);
                d7[6] = (byte) ((i7 >> 8) & 255);
                d7[7] = (byte) (i7 & 255);
                this.f15913a.c(this.f15915c, 8, 1);
                return i9 + 1 + 8;
            }
            a0 a0Var3 = this.f15914b.f16000o;
            int I = a0Var3.I();
            a0Var3.P(-2);
            int i10 = (I * 6) + 2;
            if (i8 != 0) {
                this.f15915c.K(i10);
                byte[] d8 = this.f15915c.d();
                a0Var3.j(d8, 0, i10);
                int i11 = (((d8[2] & 255) << 8) | (d8[3] & 255)) + i8;
                d8[2] = (byte) ((i11 >> 8) & 255);
                d8[3] = (byte) (i11 & 255);
                a0Var3 = this.f15915c;
            }
            this.f15913a.c(a0Var3, i10, 1);
            return i9 + 1 + i10;
        }

        public void j(r rVar, c cVar) {
            this.f15916d = rVar;
            this.f15917e = cVar;
            this.f15913a.e(rVar.f16004a.f15975f);
            k();
        }

        public void k() {
            this.f15914b.f();
            this.f15918f = 0;
            this.f15920h = 0;
            this.f15919g = 0;
            this.f15921i = 0;
            this.f15924l = false;
        }

        public void l(long j7) {
            int i7 = this.f15918f;
            while (true) {
                q qVar = this.f15914b;
                if (i7 >= qVar.f15991f || qVar.c(i7) >= j7) {
                    return;
                }
                if (this.f15914b.f15996k[i7]) {
                    this.f15921i = i7;
                }
                i7++;
            }
        }

        public void m() {
            p g7 = g();
            if (g7 == null) {
                return;
            }
            a0 a0Var = this.f15914b.f16000o;
            int i7 = g7.f15984d;
            if (i7 != 0) {
                a0Var.P(i7);
            }
            if (this.f15914b.g(this.f15918f)) {
                a0Var.P(a0Var.I() * 6);
            }
        }

        public void n(v0.m mVar) {
            p a7 = this.f15916d.f16004a.a(((c) m0.j(this.f15914b.f15986a)).f15872a);
            this.f15913a.e(this.f15916d.f16004a.f15975f.b().M(mVar.g(a7 != null ? a7.f15982b : null)).E());
        }
    }

    public g() {
        this(0);
    }

    public g(int i7) {
        this(i7, null);
    }

    public g(int i7, i0 i0Var) {
        this(i7, i0Var, null, Collections.emptyList());
    }

    public g(int i7, i0 i0Var, o oVar) {
        this(i7, i0Var, oVar, Collections.emptyList());
    }

    public g(int i7, i0 i0Var, o oVar, List<s1> list) {
        this(i7, i0Var, oVar, list, null);
    }

    public g(int i7, i0 i0Var, o oVar, List<s1> list, e0 e0Var) {
        this.f15884a = i7;
        this.f15893j = i0Var;
        this.f15885b = oVar;
        this.f15886c = Collections.unmodifiableList(list);
        this.f15898o = e0Var;
        this.f15894k = new l1.c();
        this.f15895l = new a0(16);
        this.f15888e = new a0(w.f19796a);
        this.f15889f = new a0(5);
        this.f15890g = new a0();
        byte[] bArr = new byte[16];
        this.f15891h = bArr;
        this.f15892i = new a0(bArr);
        this.f15896m = new ArrayDeque<>();
        this.f15897n = new ArrayDeque<>();
        this.f15887d = new SparseArray<>();
        this.f15907x = -9223372036854775807L;
        this.f15906w = -9223372036854775807L;
        this.f15908y = -9223372036854775807L;
        this.E = w0.n.f22959d;
        this.F = new e0[0];
        this.G = new e0[0];
    }

    private static void A(a0 a0Var, q qVar) {
        z(a0Var, 0, qVar);
    }

    private static Pair<Long, w0.d> B(a0 a0Var, long j7) {
        long H;
        long H2;
        a0Var.O(8);
        int c7 = e1.a.c(a0Var.m());
        a0Var.P(4);
        long E = a0Var.E();
        if (c7 == 0) {
            H = a0Var.E();
            H2 = a0Var.E();
        } else {
            H = a0Var.H();
            H2 = a0Var.H();
        }
        long j8 = H;
        long j9 = j7 + H2;
        long N0 = m0.N0(j8, 1000000L, E);
        a0Var.P(2);
        int I2 = a0Var.I();
        int[] iArr = new int[I2];
        long[] jArr = new long[I2];
        long[] jArr2 = new long[I2];
        long[] jArr3 = new long[I2];
        long j10 = j8;
        long j11 = N0;
        int i7 = 0;
        while (i7 < I2) {
            int m7 = a0Var.m();
            if ((m7 & Integer.MIN_VALUE) != 0) {
                throw n2.a("Unhandled indirect reference", null);
            }
            long E2 = a0Var.E();
            iArr[i7] = m7 & Integer.MAX_VALUE;
            jArr[i7] = j9;
            jArr3[i7] = j11;
            long j12 = j10 + E2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i8 = I2;
            long N02 = m0.N0(j12, 1000000L, E);
            jArr4[i7] = N02 - jArr5[i7];
            a0Var.P(4);
            j9 += r1[i7];
            i7++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            I2 = i8;
            j10 = j12;
            j11 = N02;
        }
        return Pair.create(Long.valueOf(N0), new w0.d(iArr, jArr, jArr2, jArr3));
    }

    private static long C(a0 a0Var) {
        a0Var.O(8);
        return e1.a.c(a0Var.m()) == 1 ? a0Var.H() : a0Var.E();
    }

    private static b D(a0 a0Var, SparseArray<b> sparseArray, boolean z6) {
        a0Var.O(8);
        int b7 = e1.a.b(a0Var.m());
        b valueAt = z6 ? sparseArray.valueAt(0) : sparseArray.get(a0Var.m());
        if (valueAt == null) {
            return null;
        }
        if ((b7 & 1) != 0) {
            long H = a0Var.H();
            q qVar = valueAt.f15914b;
            qVar.f15988c = H;
            qVar.f15989d = H;
        }
        c cVar = valueAt.f15917e;
        valueAt.f15914b.f15986a = new c((b7 & 2) != 0 ? a0Var.m() - 1 : cVar.f15872a, (b7 & 8) != 0 ? a0Var.m() : cVar.f15873b, (b7 & 16) != 0 ? a0Var.m() : cVar.f15874c, (b7 & 32) != 0 ? a0Var.m() : cVar.f15875d);
        return valueAt;
    }

    private static void E(a.C0056a c0056a, SparseArray<b> sparseArray, boolean z6, int i7, byte[] bArr) {
        b D = D(((a.b) o2.a.e(c0056a.g(1952868452))).f15842b, sparseArray, z6);
        if (D == null) {
            return;
        }
        q qVar = D.f15914b;
        long j7 = qVar.f16002q;
        boolean z7 = qVar.f16003r;
        D.k();
        D.f15924l = true;
        a.b g7 = c0056a.g(1952867444);
        if (g7 == null || (i7 & 2) != 0) {
            qVar.f16002q = j7;
            qVar.f16003r = z7;
        } else {
            qVar.f16002q = C(g7.f15842b);
            qVar.f16003r = true;
        }
        H(c0056a, D, i7);
        p a7 = D.f15916d.f16004a.a(((c) o2.a.e(qVar.f15986a)).f15872a);
        a.b g8 = c0056a.g(1935763834);
        if (g8 != null) {
            x((p) o2.a.e(a7), g8.f15842b, qVar);
        }
        a.b g9 = c0056a.g(1935763823);
        if (g9 != null) {
            w(g9.f15842b, qVar);
        }
        a.b g10 = c0056a.g(1936027235);
        if (g10 != null) {
            A(g10.f15842b, qVar);
        }
        y(c0056a, a7 != null ? a7.f15982b : null, qVar);
        int size = c0056a.f15840c.size();
        for (int i8 = 0; i8 < size; i8++) {
            a.b bVar = c0056a.f15840c.get(i8);
            if (bVar.f15838a == 1970628964) {
                I(bVar.f15842b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> F(a0 a0Var) {
        a0Var.O(12);
        return Pair.create(Integer.valueOf(a0Var.m()), new c(a0Var.m() - 1, a0Var.m(), a0Var.m(), a0Var.m()));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int G(b bVar, int i7, int i8, a0 a0Var, int i9) {
        long j7;
        long j8;
        int i10;
        int i11;
        boolean z6;
        int i12;
        boolean z7;
        int i13;
        boolean z8;
        boolean z9;
        boolean z10;
        int i14;
        b bVar2 = bVar;
        a0Var.O(8);
        int b7 = e1.a.b(a0Var.m());
        o oVar = bVar2.f15916d.f16004a;
        q qVar = bVar2.f15914b;
        c cVar = (c) m0.j(qVar.f15986a);
        qVar.f15993h[i7] = a0Var.G();
        long[] jArr = qVar.f15992g;
        jArr[i7] = qVar.f15988c;
        if ((b7 & 1) != 0) {
            jArr[i7] = jArr[i7] + a0Var.m();
        }
        boolean z11 = (b7 & 4) != 0;
        int i15 = cVar.f15875d;
        if (z11) {
            i15 = a0Var.m();
        }
        boolean z12 = (b7 & 256) != 0;
        boolean z13 = (b7 & 512) != 0;
        boolean z14 = (b7 & 1024) != 0;
        boolean z15 = (b7 & 2048) != 0;
        long[] jArr2 = oVar.f15977h;
        if (jArr2 == null || jArr2.length != 1) {
            j7 = 0;
        } else {
            j7 = 0;
            if (jArr2[0] == 0) {
                j8 = ((long[]) m0.j(oVar.f15978i))[0];
                int[] iArr = qVar.f15994i;
                long[] jArr3 = qVar.f15995j;
                boolean[] zArr = qVar.f15996k;
                int i16 = i15;
                boolean z16 = (oVar.f15971b == 2 || (i8 & 1) == 0) ? false : true;
                i10 = i9 + qVar.f15993h[i7];
                boolean z17 = z16;
                long j9 = oVar.f15972c;
                long j10 = qVar.f16002q;
                i11 = i9;
                while (i11 < i10) {
                    int f7 = f(z12 ? a0Var.m() : cVar.f15873b);
                    if (z13) {
                        i12 = a0Var.m();
                        z6 = z12;
                    } else {
                        z6 = z12;
                        i12 = cVar.f15874c;
                    }
                    int f8 = f(i12);
                    if (z14) {
                        z7 = z11;
                        i13 = a0Var.m();
                    } else if (i11 == 0 && z11) {
                        z7 = z11;
                        i13 = i16;
                    } else {
                        z7 = z11;
                        i13 = cVar.f15875d;
                    }
                    if (z15) {
                        z8 = z15;
                        z9 = z13;
                        z10 = z14;
                        i14 = a0Var.m();
                    } else {
                        z8 = z15;
                        z9 = z13;
                        z10 = z14;
                        i14 = 0;
                    }
                    jArr3[i11] = m0.N0((i14 + j10) - j8, 1000000L, j9);
                    if (!qVar.f16003r) {
                        jArr3[i11] = jArr3[i11] + bVar2.f15916d.f16011h;
                    }
                    iArr[i11] = f8;
                    zArr[i11] = ((i13 >> 16) & 1) == 0 && (!z17 || i11 == 0);
                    j10 += f7;
                    i11++;
                    bVar2 = bVar;
                    z12 = z6;
                    z11 = z7;
                    z15 = z8;
                    z13 = z9;
                    z14 = z10;
                }
                qVar.f16002q = j10;
                return i10;
            }
        }
        j8 = j7;
        int[] iArr2 = qVar.f15994i;
        long[] jArr32 = qVar.f15995j;
        boolean[] zArr2 = qVar.f15996k;
        int i162 = i15;
        if (oVar.f15971b == 2) {
        }
        i10 = i9 + qVar.f15993h[i7];
        boolean z172 = z16;
        long j92 = oVar.f15972c;
        long j102 = qVar.f16002q;
        i11 = i9;
        while (i11 < i10) {
        }
        qVar.f16002q = j102;
        return i10;
    }

    private static void H(a.C0056a c0056a, b bVar, int i7) {
        List<a.b> list = c0056a.f15840c;
        int size = list.size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar2 = list.get(i10);
            if (bVar2.f15838a == 1953658222) {
                a0 a0Var = bVar2.f15842b;
                a0Var.O(12);
                int G = a0Var.G();
                if (G > 0) {
                    i9 += G;
                    i8++;
                }
            }
        }
        bVar.f15920h = 0;
        bVar.f15919g = 0;
        bVar.f15918f = 0;
        bVar.f15914b.e(i8, i9);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar3 = list.get(i13);
            if (bVar3.f15838a == 1953658222) {
                i12 = G(bVar, i11, i7, bVar3.f15842b, i12);
                i11++;
            }
        }
    }

    private static void I(a0 a0Var, q qVar, byte[] bArr) {
        a0Var.O(8);
        a0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(a0Var, 16, qVar);
        }
    }

    private void J(long j7) {
        while (!this.f15896m.isEmpty() && this.f15896m.peek().f15839b == j7) {
            o(this.f15896m.pop());
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean K(w0.m mVar) {
        long p7;
        if (this.f15902s == 0) {
            if (!mVar.e(this.f15895l.d(), 0, 8, true)) {
                return false;
            }
            this.f15902s = 8;
            this.f15895l.O(0);
            this.f15901r = this.f15895l.E();
            this.f15900q = this.f15895l.m();
        }
        long j7 = this.f15901r;
        if (j7 != 1) {
            if (j7 == 0) {
                long a7 = mVar.a();
                if (a7 == -1 && !this.f15896m.isEmpty()) {
                    a7 = this.f15896m.peek().f15839b;
                }
                if (a7 != -1) {
                    p7 = (a7 - mVar.p()) + this.f15902s;
                }
            }
            if (this.f15901r >= this.f15902s) {
                throw n2.d("Atom size less than header length (unsupported).");
            }
            long p8 = mVar.p() - this.f15902s;
            int i7 = this.f15900q;
            if ((i7 == 1836019558 || i7 == 1835295092) && !this.H) {
                this.E.i(new b0.b(this.f15907x, p8));
                this.H = true;
            }
            if (this.f15900q == 1836019558) {
                int size = this.f15887d.size();
                for (int i8 = 0; i8 < size; i8++) {
                    q qVar = this.f15887d.valueAt(i8).f15914b;
                    qVar.f15987b = p8;
                    qVar.f15989d = p8;
                    qVar.f15988c = p8;
                }
            }
            int i9 = this.f15900q;
            if (i9 == 1835295092) {
                this.f15909z = null;
                this.f15904u = p8 + this.f15901r;
                this.f15899p = 2;
                return true;
            }
            if (O(i9)) {
                long p9 = (mVar.p() + this.f15901r) - 8;
                this.f15896m.push(new a.C0056a(this.f15900q, p9));
                if (this.f15901r == this.f15902s) {
                    J(p9);
                } else {
                    g();
                }
            } else {
                if (P(this.f15900q)) {
                    if (this.f15902s != 8) {
                        throw n2.d("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j8 = this.f15901r;
                    if (j8 > 2147483647L) {
                        throw n2.d("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    a0 a0Var = new a0((int) j8);
                    System.arraycopy(this.f15895l.d(), 0, a0Var.d(), 0, 8);
                    this.f15903t = a0Var;
                } else {
                    if (this.f15901r > 2147483647L) {
                        throw n2.d("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f15903t = null;
                }
                this.f15899p = 1;
            }
            return true;
        }
        mVar.readFully(this.f15895l.d(), 8, 8);
        this.f15902s += 8;
        p7 = this.f15895l.H();
        this.f15901r = p7;
        if (this.f15901r >= this.f15902s) {
        }
    }

    private void L(w0.m mVar) {
        int i7 = ((int) this.f15901r) - this.f15902s;
        a0 a0Var = this.f15903t;
        if (a0Var != null) {
            mVar.readFully(a0Var.d(), 8, i7);
            q(new a.b(this.f15900q, a0Var), mVar.p());
        } else {
            mVar.i(i7);
        }
        J(mVar.p());
    }

    private void M(w0.m mVar) {
        int size = this.f15887d.size();
        long j7 = Long.MAX_VALUE;
        b bVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = this.f15887d.valueAt(i7).f15914b;
            if (qVar.f16001p) {
                long j8 = qVar.f15989d;
                if (j8 < j7) {
                    bVar = this.f15887d.valueAt(i7);
                    j7 = j8;
                }
            }
        }
        if (bVar == null) {
            this.f15899p = 3;
            return;
        }
        int p7 = (int) (j7 - mVar.p());
        if (p7 < 0) {
            throw n2.a("Offset to encryption data was negative.", null);
        }
        mVar.i(p7);
        bVar.f15914b.b(mVar);
    }

    private boolean N(w0.m mVar) {
        int a7;
        int i7;
        b bVar = this.f15909z;
        Throwable th = null;
        if (bVar == null) {
            bVar = k(this.f15887d);
            if (bVar == null) {
                int p7 = (int) (this.f15904u - mVar.p());
                if (p7 < 0) {
                    throw n2.a("Offset to end of mdat was negative.", null);
                }
                mVar.i(p7);
                g();
                return false;
            }
            int d7 = (int) (bVar.d() - mVar.p());
            if (d7 < 0) {
                o2.r.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d7 = 0;
            }
            mVar.i(d7);
            this.f15909z = bVar;
        }
        int i8 = 4;
        int i9 = 1;
        if (this.f15899p == 3) {
            int f7 = bVar.f();
            this.A = f7;
            if (bVar.f15918f < bVar.f15921i) {
                mVar.i(f7);
                bVar.m();
                if (!bVar.h()) {
                    this.f15909z = null;
                }
                this.f15899p = 3;
                return true;
            }
            if (bVar.f15916d.f16004a.f15976g == 1) {
                this.A = f7 - 8;
                mVar.i(8);
            }
            if ("audio/ac4".equals(bVar.f15916d.f16004a.f15975f.f20956q)) {
                this.B = bVar.i(this.A, 7);
                t0.c.a(this.A, this.f15892i);
                bVar.f15913a.d(this.f15892i, 7);
                i7 = this.B + 7;
            } else {
                i7 = bVar.i(this.A, 0);
            }
            this.B = i7;
            this.A += this.B;
            this.f15899p = 4;
            this.C = 0;
        }
        o oVar = bVar.f15916d.f16004a;
        e0 e0Var = bVar.f15913a;
        long e7 = bVar.e();
        i0 i0Var = this.f15893j;
        if (i0Var != null) {
            e7 = i0Var.a(e7);
        }
        long j7 = e7;
        if (oVar.f15979j == 0) {
            while (true) {
                int i10 = this.B;
                int i11 = this.A;
                if (i10 >= i11) {
                    break;
                }
                this.B += e0Var.a(mVar, i11 - i10, false);
            }
        } else {
            byte[] d8 = this.f15889f.d();
            d8[0] = 0;
            d8[1] = 0;
            d8[2] = 0;
            int i12 = oVar.f15979j;
            int i13 = i12 + 1;
            int i14 = 4 - i12;
            while (this.B < this.A) {
                int i15 = this.C;
                if (i15 == 0) {
                    mVar.readFully(d8, i14, i13);
                    this.f15889f.O(0);
                    int m7 = this.f15889f.m();
                    if (m7 < i9) {
                        throw n2.a("Invalid NAL length", th);
                    }
                    this.C = m7 - 1;
                    this.f15888e.O(0);
                    e0Var.d(this.f15888e, i8);
                    e0Var.d(this.f15889f, i9);
                    this.D = this.G.length > 0 && w.g(oVar.f15975f.f20956q, d8[i8]);
                    this.B += 5;
                    this.A += i14;
                } else {
                    if (this.D) {
                        this.f15890g.K(i15);
                        mVar.readFully(this.f15890g.d(), 0, this.C);
                        e0Var.d(this.f15890g, this.C);
                        a7 = this.C;
                        int q7 = w.q(this.f15890g.d(), this.f15890g.f());
                        this.f15890g.O("video/hevc".equals(oVar.f15975f.f20956q) ? 1 : 0);
                        this.f15890g.N(q7);
                        w0.c.a(j7, this.f15890g, this.G);
                    } else {
                        a7 = e0Var.a(mVar, i15, false);
                    }
                    this.B += a7;
                    this.C -= a7;
                    th = null;
                    i8 = 4;
                    i9 = 1;
                }
            }
        }
        int c7 = bVar.c();
        p g7 = bVar.g();
        e0Var.b(j7, c7, this.A, 0, g7 != null ? g7.f15983c : null);
        t(j7);
        if (!bVar.h()) {
            this.f15909z = null;
        }
        this.f15899p = 3;
        return true;
    }

    private static boolean O(int i7) {
        return i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1836019558 || i7 == 1953653094 || i7 == 1836475768 || i7 == 1701082227;
    }

    private static boolean P(int i7) {
        return i7 == 1751411826 || i7 == 1835296868 || i7 == 1836476516 || i7 == 1936286840 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1668576371 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1937011571 || i7 == 1952867444 || i7 == 1952868452 || i7 == 1953196132 || i7 == 1953654136 || i7 == 1953658222 || i7 == 1886614376 || i7 == 1935763834 || i7 == 1935763823 || i7 == 1936027235 || i7 == 1970628964 || i7 == 1935828848 || i7 == 1936158820 || i7 == 1701606260 || i7 == 1835362404 || i7 == 1701671783;
    }

    private static int f(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw n2.a("Unexpected negative value: " + i7, null);
    }

    private void g() {
        this.f15899p = 0;
        this.f15902s = 0;
    }

    private c i(SparseArray<c> sparseArray, int i7) {
        return (c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : o2.a.e(sparseArray.get(i7)));
    }

    private static v0.m j(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            a.b bVar = list.get(i7);
            if (bVar.f15838a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d7 = bVar.f15842b.d();
                UUID f7 = l.f(d7);
                if (f7 == null) {
                    o2.r.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f7, "video/mp4", d7));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new v0.m(arrayList);
    }

    private static b k(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j7 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < size; i7++) {
            b valueAt = sparseArray.valueAt(i7);
            if ((valueAt.f15924l || valueAt.f15918f != valueAt.f15916d.f16005b) && (!valueAt.f15924l || valueAt.f15920h != valueAt.f15914b.f15990e)) {
                long d7 = valueAt.d();
                if (d7 < j7) {
                    bVar = valueAt;
                    j7 = d7;
                }
            }
        }
        return bVar;
    }

    private void l() {
        int i7;
        e0[] e0VarArr = new e0[2];
        this.F = e0VarArr;
        e0 e0Var = this.f15898o;
        int i8 = 0;
        if (e0Var != null) {
            e0VarArr[0] = e0Var;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i9 = 100;
        if ((this.f15884a & 4) != 0) {
            e0VarArr[i7] = this.E.d(100, 5);
            i7++;
            i9 = 101;
        }
        e0[] e0VarArr2 = (e0[]) m0.G0(this.F, i7);
        this.F = e0VarArr2;
        for (e0 e0Var2 : e0VarArr2) {
            e0Var2.e(K);
        }
        this.G = new e0[this.f15886c.size()];
        while (i8 < this.G.length) {
            e0 d7 = this.E.d(i9, 3);
            d7.e(this.f15886c.get(i8));
            this.G[i8] = d7;
            i8++;
            i9++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] m() {
        return new w0.l[]{new g()};
    }

    private void o(a.C0056a c0056a) {
        int i7 = c0056a.f15838a;
        if (i7 == 1836019574) {
            s(c0056a);
        } else if (i7 == 1836019558) {
            r(c0056a);
        } else {
            if (this.f15896m.isEmpty()) {
                return;
            }
            this.f15896m.peek().d(c0056a);
        }
    }

    private void p(a0 a0Var) {
        long N0;
        String str;
        long N02;
        String str2;
        long E;
        long j7;
        if (this.F.length == 0) {
            return;
        }
        a0Var.O(8);
        int c7 = e1.a.c(a0Var.m());
        if (c7 == 0) {
            String str3 = (String) o2.a.e(a0Var.w());
            String str4 = (String) o2.a.e(a0Var.w());
            long E2 = a0Var.E();
            N0 = m0.N0(a0Var.E(), 1000000L, E2);
            long j8 = this.f15908y;
            long j9 = j8 != -9223372036854775807L ? j8 + N0 : -9223372036854775807L;
            str = str3;
            N02 = m0.N0(a0Var.E(), 1000L, E2);
            str2 = str4;
            E = a0Var.E();
            j7 = j9;
        } else {
            if (c7 != 1) {
                o2.r.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c7);
                return;
            }
            long E3 = a0Var.E();
            j7 = m0.N0(a0Var.H(), 1000000L, E3);
            long N03 = m0.N0(a0Var.E(), 1000L, E3);
            long E4 = a0Var.E();
            str = (String) o2.a.e(a0Var.w());
            N02 = N03;
            E = E4;
            str2 = (String) o2.a.e(a0Var.w());
            N0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[a0Var.a()];
        a0Var.j(bArr, 0, a0Var.a());
        a0 a0Var2 = new a0(this.f15894k.a(new l1.a(str, str2, N02, E, bArr)));
        int a7 = a0Var2.a();
        for (e0 e0Var : this.F) {
            a0Var2.O(0);
            e0Var.d(a0Var2, a7);
        }
        if (j7 == -9223372036854775807L) {
            this.f15897n.addLast(new a(N0, true, a7));
        } else {
            if (this.f15897n.isEmpty()) {
                i0 i0Var = this.f15893j;
                if (i0Var != null) {
                    j7 = i0Var.a(j7);
                }
                for (e0 e0Var2 : this.F) {
                    e0Var2.b(j7, 1, a7, 0, null);
                }
                return;
            }
            this.f15897n.addLast(new a(j7, false, a7));
        }
        this.f15905v += a7;
    }

    private void q(a.b bVar, long j7) {
        if (!this.f15896m.isEmpty()) {
            this.f15896m.peek().e(bVar);
            return;
        }
        int i7 = bVar.f15838a;
        if (i7 != 1936286840) {
            if (i7 == 1701671783) {
                p(bVar.f15842b);
            }
        } else {
            Pair<Long, w0.d> B = B(bVar.f15842b, j7);
            this.f15908y = ((Long) B.first).longValue();
            this.E.i((b0) B.second);
            this.H = true;
        }
    }

    private void r(a.C0056a c0056a) {
        v(c0056a, this.f15887d, this.f15885b != null, this.f15884a, this.f15891h);
        v0.m j7 = j(c0056a.f15840c);
        if (j7 != null) {
            int size = this.f15887d.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f15887d.valueAt(i7).n(j7);
            }
        }
        if (this.f15906w != -9223372036854775807L) {
            int size2 = this.f15887d.size();
            for (int i8 = 0; i8 < size2; i8++) {
                this.f15887d.valueAt(i8).l(this.f15906w);
            }
            this.f15906w = -9223372036854775807L;
        }
    }

    private void s(a.C0056a c0056a) {
        int i7 = 0;
        o2.a.g(this.f15885b == null, "Unexpected moov box.");
        v0.m j7 = j(c0056a.f15840c);
        a.C0056a c0056a2 = (a.C0056a) o2.a.e(c0056a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0056a2.f15840c.size();
        long j8 = -9223372036854775807L;
        for (int i8 = 0; i8 < size; i8++) {
            a.b bVar = c0056a2.f15840c.get(i8);
            int i9 = bVar.f15838a;
            if (i9 == 1953654136) {
                Pair<Integer, c> F = F(bVar.f15842b);
                sparseArray.put(((Integer) F.first).intValue(), (c) F.second);
            } else if (i9 == 1835362404) {
                j8 = u(bVar.f15842b);
            }
        }
        List<r> A = e1.b.A(c0056a, new x(), j8, j7, (this.f15884a & 16) != 0, false, new l4.f() { // from class: e1.e
            @Override // l4.f
            public final Object apply(Object obj) {
                return g.this.n((o) obj);
            }
        });
        int size2 = A.size();
        if (this.f15887d.size() != 0) {
            o2.a.f(this.f15887d.size() == size2);
            while (i7 < size2) {
                r rVar = A.get(i7);
                o oVar = rVar.f16004a;
                this.f15887d.get(oVar.f15970a).j(rVar, i(sparseArray, oVar.f15970a));
                i7++;
            }
            return;
        }
        while (i7 < size2) {
            r rVar2 = A.get(i7);
            o oVar2 = rVar2.f16004a;
            this.f15887d.put(oVar2.f15970a, new b(this.E.d(i7, oVar2.f15971b), rVar2, i(sparseArray, oVar2.f15970a)));
            this.f15907x = Math.max(this.f15907x, oVar2.f15974e);
            i7++;
        }
        this.E.j();
    }

    private void t(long j7) {
        while (!this.f15897n.isEmpty()) {
            a removeFirst = this.f15897n.removeFirst();
            this.f15905v -= removeFirst.f15912c;
            long j8 = removeFirst.f15910a;
            if (removeFirst.f15911b) {
                j8 += j7;
            }
            i0 i0Var = this.f15893j;
            if (i0Var != null) {
                j8 = i0Var.a(j8);
            }
            for (e0 e0Var : this.F) {
                e0Var.b(j8, 1, removeFirst.f15912c, this.f15905v, null);
            }
        }
    }

    private static long u(a0 a0Var) {
        a0Var.O(8);
        return e1.a.c(a0Var.m()) == 0 ? a0Var.E() : a0Var.H();
    }

    private static void v(a.C0056a c0056a, SparseArray<b> sparseArray, boolean z6, int i7, byte[] bArr) {
        int size = c0056a.f15841d.size();
        for (int i8 = 0; i8 < size; i8++) {
            a.C0056a c0056a2 = c0056a.f15841d.get(i8);
            if (c0056a2.f15838a == 1953653094) {
                E(c0056a2, sparseArray, z6, i7, bArr);
            }
        }
    }

    private static void w(a0 a0Var, q qVar) {
        a0Var.O(8);
        int m7 = a0Var.m();
        if ((e1.a.b(m7) & 1) == 1) {
            a0Var.P(8);
        }
        int G = a0Var.G();
        if (G == 1) {
            qVar.f15989d += e1.a.c(m7) == 0 ? a0Var.E() : a0Var.H();
        } else {
            throw n2.a("Unexpected saio entry count: " + G, null);
        }
    }

    private static void x(p pVar, a0 a0Var, q qVar) {
        int i7;
        int i8 = pVar.f15984d;
        a0Var.O(8);
        if ((e1.a.b(a0Var.m()) & 1) == 1) {
            a0Var.P(8);
        }
        int C = a0Var.C();
        int G = a0Var.G();
        if (G > qVar.f15991f) {
            throw n2.a("Saiz sample count " + G + " is greater than fragment sample count" + qVar.f15991f, null);
        }
        if (C == 0) {
            boolean[] zArr = qVar.f15998m;
            i7 = 0;
            for (int i9 = 0; i9 < G; i9++) {
                int C2 = a0Var.C();
                i7 += C2;
                zArr[i9] = C2 > i8;
            }
        } else {
            i7 = (C * G) + 0;
            Arrays.fill(qVar.f15998m, 0, G, C > i8);
        }
        Arrays.fill(qVar.f15998m, G, qVar.f15991f, false);
        if (i7 > 0) {
            qVar.d(i7);
        }
    }

    private static void y(a.C0056a c0056a, String str, q qVar) {
        byte[] bArr = null;
        a0 a0Var = null;
        a0 a0Var2 = null;
        for (int i7 = 0; i7 < c0056a.f15840c.size(); i7++) {
            a.b bVar = c0056a.f15840c.get(i7);
            a0 a0Var3 = bVar.f15842b;
            int i8 = bVar.f15838a;
            if (i8 == 1935828848) {
                a0Var3.O(12);
                if (a0Var3.m() == 1936025959) {
                    a0Var = a0Var3;
                }
            } else if (i8 == 1936158820) {
                a0Var3.O(12);
                if (a0Var3.m() == 1936025959) {
                    a0Var2 = a0Var3;
                }
            }
        }
        if (a0Var == null || a0Var2 == null) {
            return;
        }
        a0Var.O(8);
        int c7 = e1.a.c(a0Var.m());
        a0Var.P(4);
        if (c7 == 1) {
            a0Var.P(4);
        }
        if (a0Var.m() != 1) {
            throw n2.d("Entry count in sbgp != 1 (unsupported).");
        }
        a0Var2.O(8);
        int c8 = e1.a.c(a0Var2.m());
        a0Var2.P(4);
        if (c8 == 1) {
            if (a0Var2.E() == 0) {
                throw n2.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (c8 >= 2) {
            a0Var2.P(4);
        }
        if (a0Var2.E() != 1) {
            throw n2.d("Entry count in sgpd != 1 (unsupported).");
        }
        a0Var2.P(1);
        int C = a0Var2.C();
        int i9 = (C & 240) >> 4;
        int i10 = C & 15;
        boolean z6 = a0Var2.C() == 1;
        if (z6) {
            int C2 = a0Var2.C();
            byte[] bArr2 = new byte[16];
            a0Var2.j(bArr2, 0, 16);
            if (C2 == 0) {
                int C3 = a0Var2.C();
                bArr = new byte[C3];
                a0Var2.j(bArr, 0, C3);
            }
            qVar.f15997l = true;
            qVar.f15999n = new p(z6, str, C2, bArr2, i9, i10, bArr);
        }
    }

    private static void z(a0 a0Var, int i7, q qVar) {
        a0Var.O(i7 + 8);
        int b7 = e1.a.b(a0Var.m());
        if ((b7 & 1) != 0) {
            throw n2.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (b7 & 2) != 0;
        int G = a0Var.G();
        if (G == 0) {
            Arrays.fill(qVar.f15998m, 0, qVar.f15991f, false);
            return;
        }
        if (G == qVar.f15991f) {
            Arrays.fill(qVar.f15998m, 0, G, z6);
            qVar.d(a0Var.a());
            qVar.a(a0Var);
        } else {
            throw n2.a("Senc sample count " + G + " is different from fragment sample count" + qVar.f15991f, null);
        }
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        int size = this.f15887d.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f15887d.valueAt(i7).k();
        }
        this.f15897n.clear();
        this.f15905v = 0;
        this.f15906w = j8;
        this.f15896m.clear();
        g();
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.E = nVar;
        g();
        l();
        o oVar = this.f15885b;
        if (oVar != null) {
            this.f15887d.put(0, new b(nVar.d(0, oVar.f15971b), new r(this.f15885b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.j();
        }
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        while (true) {
            int i7 = this.f15899p;
            if (i7 != 0) {
                if (i7 == 1) {
                    L(mVar);
                } else if (i7 == 2) {
                    M(mVar);
                } else if (N(mVar)) {
                    return 0;
                }
            } else if (!K(mVar)) {
                return -1;
            }
        }
    }

    @Override // w0.l
    public boolean h(w0.m mVar) {
        return n.b(mVar);
    }

    protected o n(o oVar) {
        return oVar;
    }
}
