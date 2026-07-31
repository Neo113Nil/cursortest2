package h1;

import android.net.Uri;
import android.util.Pair;
import java.util.Map;
import o2.a0;
import o2.m0;
import r0.n2;
import r0.s1;
import t0.l0;
import w0.e0;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: h, reason: collision with root package name */
    public static final r f16736h = new r() { // from class: h1.a
        @Override // w0.r
        public final l[] a() {
            l[] g7;
            g7 = b.g();
            return g7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private n f16737a;

    /* renamed from: b, reason: collision with root package name */
    private e0 f16738b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0067b f16741e;

    /* renamed from: c, reason: collision with root package name */
    private int f16739c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f16740d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f16742f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f16743g = -1;

    private static final class a implements InterfaceC0067b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f16744m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f16745n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final n f16746a;

        /* renamed from: b, reason: collision with root package name */
        private final e0 f16747b;

        /* renamed from: c, reason: collision with root package name */
        private final h1.c f16748c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16749d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f16750e;

        /* renamed from: f, reason: collision with root package name */
        private final a0 f16751f;

        /* renamed from: g, reason: collision with root package name */
        private final int f16752g;

        /* renamed from: h, reason: collision with root package name */
        private final s1 f16753h;

        /* renamed from: i, reason: collision with root package name */
        private int f16754i;

        /* renamed from: j, reason: collision with root package name */
        private long f16755j;

        /* renamed from: k, reason: collision with root package name */
        private int f16756k;

        /* renamed from: l, reason: collision with root package name */
        private long f16757l;

        public a(n nVar, e0 e0Var, h1.c cVar) {
            this.f16746a = nVar;
            this.f16747b = e0Var;
            this.f16748c = cVar;
            int max = Math.max(1, cVar.f16768c / 10);
            this.f16752g = max;
            a0 a0Var = new a0(cVar.f16772g);
            a0Var.u();
            int u6 = a0Var.u();
            this.f16749d = u6;
            int i7 = cVar.f16767b;
            int i8 = (((cVar.f16770e - (i7 * 4)) * 8) / (cVar.f16771f * i7)) + 1;
            if (u6 == i8) {
                int l7 = m0.l(max, u6);
                this.f16750e = new byte[cVar.f16770e * l7];
                this.f16751f = new a0(l7 * h(u6, i7));
                int i9 = ((cVar.f16768c * cVar.f16770e) * 8) / u6;
                this.f16753h = new s1.b().e0("audio/raw").G(i9).Z(i9).W(h(max, i7)).H(cVar.f16767b).f0(cVar.f16768c).Y(2).E();
                return;
            }
            throw n2.a("Expected frames per block: " + i8 + "; got: " + u6, null);
        }

        private void d(byte[] bArr, int i7, a0 a0Var) {
            for (int i8 = 0; i8 < i7; i8++) {
                for (int i9 = 0; i9 < this.f16748c.f16767b; i9++) {
                    e(bArr, i8, i9, a0Var.d());
                }
            }
            int g7 = g(this.f16749d * i7);
            a0Var.O(0);
            a0Var.N(g7);
        }

        private void e(byte[] bArr, int i7, int i8, byte[] bArr2) {
            h1.c cVar = this.f16748c;
            int i9 = cVar.f16770e;
            int i10 = cVar.f16767b;
            int i11 = (i7 * i9) + (i8 * 4);
            int i12 = (i10 * 4) + i11;
            int i13 = (i9 / i10) - 4;
            int i14 = (short) (((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255));
            int min = Math.min(bArr[i11 + 2] & 255, 88);
            int i15 = f16745n[min];
            int i16 = ((i7 * this.f16749d * i10) + i8) * 2;
            bArr2[i16] = (byte) (i14 & 255);
            bArr2[i16 + 1] = (byte) (i14 >> 8);
            for (int i17 = 0; i17 < i13 * 2; i17++) {
                int i18 = bArr[((i17 / 8) * i10 * 4) + i12 + ((i17 / 2) % 4)] & 255;
                int i19 = i17 % 2 == 0 ? i18 & 15 : i18 >> 4;
                int i20 = ((((i19 & 7) * 2) + 1) * i15) >> 3;
                if ((i19 & 8) != 0) {
                    i20 = -i20;
                }
                i14 = m0.q(i14 + i20, -32768, 32767);
                i16 += i10 * 2;
                bArr2[i16] = (byte) (i14 & 255);
                bArr2[i16 + 1] = (byte) (i14 >> 8);
                int i21 = min + f16744m[i19];
                int[] iArr = f16745n;
                min = m0.q(i21, 0, iArr.length - 1);
                i15 = iArr[min];
            }
        }

        private int f(int i7) {
            return i7 / (this.f16748c.f16767b * 2);
        }

        private int g(int i7) {
            return h(i7, this.f16748c.f16767b);
        }

        private static int h(int i7, int i8) {
            return i7 * 2 * i8;
        }

        private void i(int i7) {
            long N0 = this.f16755j + m0.N0(this.f16757l, 1000000L, this.f16748c.f16768c);
            int g7 = g(i7);
            this.f16747b.b(N0, 1, g7, this.f16756k - g7, null);
            this.f16757l += i7;
            this.f16756k -= g7;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0036 -> B:3:0x001c). Please report as a decompilation issue!!! */
        @Override // h1.b.InterfaceC0067b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(m mVar, long j7) {
            boolean z6;
            int i7;
            int f7;
            int l7 = m0.l(this.f16752g - f(this.f16756k), this.f16749d) * this.f16748c.f16770e;
            if (j7 != 0) {
                z6 = false;
                while (!z6) {
                    if (this.f16754i >= l7) {
                        break;
                    }
                    int read = mVar.read(this.f16750e, this.f16754i, (int) Math.min(l7 - r3, j7));
                    if (read != -1) {
                        this.f16754i += read;
                    }
                }
                i7 = this.f16754i / this.f16748c.f16770e;
                if (i7 > 0) {
                    d(this.f16750e, i7, this.f16751f);
                    this.f16754i -= i7 * this.f16748c.f16770e;
                    int f8 = this.f16751f.f();
                    this.f16747b.d(this.f16751f, f8);
                    int i8 = this.f16756k + f8;
                    this.f16756k = i8;
                    int f9 = f(i8);
                    int i9 = this.f16752g;
                    if (f9 >= i9) {
                        i(i9);
                    }
                }
                if (z6 && (f7 = f(this.f16756k)) > 0) {
                    i(f7);
                }
                return z6;
            }
            z6 = true;
            while (!z6) {
            }
            i7 = this.f16754i / this.f16748c.f16770e;
            if (i7 > 0) {
            }
            if (z6) {
                i(f7);
            }
            return z6;
        }

        @Override // h1.b.InterfaceC0067b
        public void b(int i7, long j7) {
            this.f16746a.i(new e(this.f16748c, this.f16749d, i7, j7));
            this.f16747b.e(this.f16753h);
        }

        @Override // h1.b.InterfaceC0067b
        public void c(long j7) {
            this.f16754i = 0;
            this.f16755j = j7;
            this.f16756k = 0;
            this.f16757l = 0L;
        }
    }

    /* renamed from: h1.b$b, reason: collision with other inner class name */
    private interface InterfaceC0067b {
        boolean a(m mVar, long j7);

        void b(int i7, long j7);

        void c(long j7);
    }

    private static final class c implements InterfaceC0067b {

        /* renamed from: a, reason: collision with root package name */
        private final n f16758a;

        /* renamed from: b, reason: collision with root package name */
        private final e0 f16759b;

        /* renamed from: c, reason: collision with root package name */
        private final h1.c f16760c;

        /* renamed from: d, reason: collision with root package name */
        private final s1 f16761d;

        /* renamed from: e, reason: collision with root package name */
        private final int f16762e;

        /* renamed from: f, reason: collision with root package name */
        private long f16763f;

        /* renamed from: g, reason: collision with root package name */
        private int f16764g;

        /* renamed from: h, reason: collision with root package name */
        private long f16765h;

        public c(n nVar, e0 e0Var, h1.c cVar, String str, int i7) {
            this.f16758a = nVar;
            this.f16759b = e0Var;
            this.f16760c = cVar;
            int i8 = (cVar.f16767b * cVar.f16771f) / 8;
            if (cVar.f16770e == i8) {
                int i9 = cVar.f16768c;
                int i10 = i9 * i8 * 8;
                int max = Math.max(i8, (i9 * i8) / 10);
                this.f16762e = max;
                this.f16761d = new s1.b().e0(str).G(i10).Z(i10).W(max).H(cVar.f16767b).f0(cVar.f16768c).Y(i7).E();
                return;
            }
            throw n2.a("Expected block size: " + i8 + "; got: " + cVar.f16770e, null);
        }

        @Override // h1.b.InterfaceC0067b
        public boolean a(m mVar, long j7) {
            long j8;
            int i7;
            int i8;
            long j9 = j7;
            while (j9 > 0 && (i7 = this.f16764g) < (i8 = this.f16762e)) {
                int a7 = this.f16759b.a(mVar, (int) Math.min(i8 - i7, j9), true);
                if (a7 == -1) {
                    j9 = 0;
                } else {
                    this.f16764g += a7;
                    j9 -= a7;
                }
            }
            int i9 = this.f16760c.f16770e;
            int i10 = this.f16764g / i9;
            if (i10 > 0) {
                long N0 = this.f16763f + m0.N0(this.f16765h, 1000000L, r6.f16768c);
                int i11 = i10 * i9;
                int i12 = this.f16764g - i11;
                this.f16759b.b(N0, 1, i11, i12, null);
                this.f16765h += i10;
                this.f16764g = i12;
                j8 = 0;
            } else {
                j8 = 0;
            }
            return j9 <= j8;
        }

        @Override // h1.b.InterfaceC0067b
        public void b(int i7, long j7) {
            this.f16758a.i(new e(this.f16760c, 1, i7, j7));
            this.f16759b.e(this.f16761d);
        }

        @Override // h1.b.InterfaceC0067b
        public void c(long j7) {
            this.f16763f = j7;
            this.f16764g = 0;
            this.f16765h = 0L;
        }
    }

    private void f() {
        o2.a.h(this.f16738b);
        m0.j(this.f16737a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] g() {
        return new l[]{new b()};
    }

    private void i(m mVar) {
        o2.a.f(mVar.p() == 0);
        int i7 = this.f16742f;
        if (i7 != -1) {
            mVar.i(i7);
            this.f16739c = 4;
        } else {
            if (!d.a(mVar)) {
                throw n2.a("Unsupported or unrecognized wav file type.", null);
            }
            mVar.i((int) (mVar.m() - mVar.p()));
            this.f16739c = 1;
        }
    }

    private void j(m mVar) {
        InterfaceC0067b cVar;
        h1.c b7 = d.b(mVar);
        int i7 = b7.f16766a;
        if (i7 == 17) {
            cVar = new a(this.f16737a, this.f16738b, b7);
        } else if (i7 == 6) {
            cVar = new c(this.f16737a, this.f16738b, b7, "audio/g711-alaw", -1);
        } else if (i7 == 7) {
            cVar = new c(this.f16737a, this.f16738b, b7, "audio/g711-mlaw", -1);
        } else {
            int a7 = l0.a(i7, b7.f16771f);
            if (a7 == 0) {
                throw n2.d("Unsupported WAV format type: " + b7.f16766a);
            }
            cVar = new c(this.f16737a, this.f16738b, b7, "audio/raw", a7);
        }
        this.f16741e = cVar;
        this.f16739c = 3;
    }

    private void k(m mVar) {
        this.f16740d = d.c(mVar);
        this.f16739c = 2;
    }

    private int l(m mVar) {
        o2.a.f(this.f16743g != -1);
        return ((InterfaceC0067b) o2.a.e(this.f16741e)).a(mVar, this.f16743g - mVar.p()) ? -1 : 0;
    }

    private void m(m mVar) {
        Pair<Long, Long> e7 = d.e(mVar);
        this.f16742f = ((Long) e7.first).intValue();
        long longValue = ((Long) e7.second).longValue();
        long j7 = this.f16740d;
        if (j7 != -1 && longValue == 4294967295L) {
            longValue = j7;
        }
        this.f16743g = this.f16742f + longValue;
        long a7 = mVar.a();
        if (a7 != -1 && this.f16743g > a7) {
            o2.r.i("WavExtractor", "Data exceeds input length: " + this.f16743g + ", " + a7);
            this.f16743g = a7;
        }
        ((InterfaceC0067b) o2.a.e(this.f16741e)).b(this.f16742f, this.f16743g);
        this.f16739c = 4;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f16739c = j7 == 0 ? 0 : 4;
        InterfaceC0067b interfaceC0067b = this.f16741e;
        if (interfaceC0067b != null) {
            interfaceC0067b.c(j8);
        }
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f16737a = nVar;
        this.f16738b = nVar.d(0, 1);
        nVar.j();
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        f();
        int i7 = this.f16739c;
        if (i7 == 0) {
            i(mVar);
            return 0;
        }
        if (i7 == 1) {
            k(mVar);
            return 0;
        }
        if (i7 == 2) {
            j(mVar);
            return 0;
        }
        if (i7 == 3) {
            m(mVar);
            return 0;
        }
        if (i7 == 4) {
            return l(mVar);
        }
        throw new IllegalStateException();
    }

    @Override // w0.l
    public boolean h(m mVar) {
        return d.a(mVar);
    }
}
