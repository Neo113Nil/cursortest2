package g1;

import android.util.Pair;
import g1.i0;
import java.util.Arrays;
import java.util.Collections;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f16399q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f16400a;

    /* renamed from: b, reason: collision with root package name */
    private w0.e0 f16401b;

    /* renamed from: c, reason: collision with root package name */
    private final k0 f16402c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.a0 f16403d;

    /* renamed from: e, reason: collision with root package name */
    private final u f16404e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f16405f;

    /* renamed from: g, reason: collision with root package name */
    private final a f16406g;

    /* renamed from: h, reason: collision with root package name */
    private long f16407h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16408i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16409j;

    /* renamed from: k, reason: collision with root package name */
    private long f16410k;

    /* renamed from: l, reason: collision with root package name */
    private long f16411l;

    /* renamed from: m, reason: collision with root package name */
    private long f16412m;

    /* renamed from: n, reason: collision with root package name */
    private long f16413n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f16414o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16415p;

    private static final class a {

        /* renamed from: e, reason: collision with root package name */
        private static final byte[] f16416e = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f16417a;

        /* renamed from: b, reason: collision with root package name */
        public int f16418b;

        /* renamed from: c, reason: collision with root package name */
        public int f16419c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f16420d;

        public a(int i7) {
            this.f16420d = new byte[i7];
        }

        public void a(byte[] bArr, int i7, int i8) {
            if (this.f16417a) {
                int i9 = i8 - i7;
                byte[] bArr2 = this.f16420d;
                int length = bArr2.length;
                int i10 = this.f16418b;
                if (length < i10 + i9) {
                    this.f16420d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i7, this.f16420d, this.f16418b, i9);
                this.f16418b += i9;
            }
        }

        public boolean b(int i7, int i8) {
            if (this.f16417a) {
                int i9 = this.f16418b - i8;
                this.f16418b = i9;
                if (this.f16419c != 0 || i7 != 181) {
                    this.f16417a = false;
                    return true;
                }
                this.f16419c = i9;
            } else if (i7 == 179) {
                this.f16417a = true;
            }
            byte[] bArr = f16416e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f16417a = false;
            this.f16418b = 0;
            this.f16419c = 0;
        }
    }

    public n() {
        this(null);
    }

    n(k0 k0Var) {
        o2.a0 a0Var;
        this.f16402c = k0Var;
        this.f16405f = new boolean[4];
        this.f16406g = new a(128);
        if (k0Var != null) {
            this.f16404e = new u(178, 128);
            a0Var = new o2.a0();
        } else {
            a0Var = null;
            this.f16404e = null;
        }
        this.f16403d = a0Var;
        this.f16411l = -9223372036854775807L;
        this.f16413n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<s1, Long> b(a aVar, String str) {
        float f7;
        int i7;
        float f8;
        int i8;
        byte[] copyOf = Arrays.copyOf(aVar.f16420d, aVar.f16418b);
        int i9 = copyOf[4] & 255;
        int i10 = copyOf[5] & 255;
        int i11 = (i9 << 4) | (i10 >> 4);
        int i12 = ((i10 & 15) << 8) | (copyOf[6] & 255);
        int i13 = (copyOf[7] & 240) >> 4;
        if (i13 == 2) {
            f7 = i12 * 4;
            i7 = i11 * 3;
        } else if (i13 == 3) {
            f7 = i12 * 16;
            i7 = i11 * 9;
        } else {
            if (i13 != 4) {
                f8 = 1.0f;
                s1 E = new s1.b().S(str).e0("video/mpeg2").j0(i11).Q(i12).a0(f8).T(Collections.singletonList(copyOf)).E();
                long j7 = 0;
                i8 = (copyOf[7] & 15) - 1;
                if (i8 >= 0) {
                    double[] dArr = f16399q;
                    if (i8 < dArr.length) {
                        double d7 = dArr[i8];
                        int i14 = aVar.f16419c + 9;
                        int i15 = (copyOf[i14] & 96) >> 5;
                        int i16 = copyOf[i14] & 31;
                        if (i15 != i16) {
                            double d8 = i15;
                            Double.isNaN(d8);
                            double d9 = i16 + 1;
                            Double.isNaN(d9);
                            d7 *= (d8 + 1.0d) / d9;
                        }
                        j7 = (long) (1000000.0d / d7);
                    }
                }
                return Pair.create(E, Long.valueOf(j7));
            }
            f7 = i12 * 121;
            i7 = i11 * 100;
        }
        f8 = f7 / i7;
        s1 E2 = new s1.b().S(str).e0("video/mpeg2").j0(i11).Q(i12).a0(f8).T(Collections.singletonList(copyOf)).E();
        long j72 = 0;
        i8 = (copyOf[7] & 15) - 1;
        if (i8 >= 0) {
        }
        return Pair.create(E2, Long.valueOf(j72));
    }

    @Override // g1.m
    public void a() {
        o2.w.a(this.f16405f);
        this.f16406g.c();
        u uVar = this.f16404e;
        if (uVar != null) {
            uVar.d();
        }
        this.f16407h = 0L;
        this.f16408i = false;
        this.f16411l = -9223372036854775807L;
        this.f16413n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // g1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(o2.a0 a0Var) {
        int i7;
        long j7;
        int i8;
        o2.a.h(this.f16401b);
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        byte[] d7 = a0Var.d();
        this.f16407h += a0Var.a();
        this.f16401b.d(a0Var, a0Var.a());
        while (true) {
            int c7 = o2.w.c(d7, e7, f7, this.f16405f);
            if (c7 == f7) {
                break;
            }
            int i9 = c7 + 3;
            int i10 = a0Var.d()[i9] & 255;
            int i11 = c7 - e7;
            if (!this.f16409j) {
                if (i11 > 0) {
                    this.f16406g.a(d7, e7, c7);
                }
                if (this.f16406g.b(i10, i11 < 0 ? -i11 : 0)) {
                    Pair<s1, Long> b7 = b(this.f16406g, (String) o2.a.e(this.f16400a));
                    this.f16401b.e((s1) b7.first);
                    this.f16410k = ((Long) b7.second).longValue();
                    this.f16409j = true;
                }
            }
            u uVar = this.f16404e;
            if (uVar != null) {
                if (i11 > 0) {
                    uVar.a(d7, e7, c7);
                    i8 = 0;
                } else {
                    i8 = -i11;
                }
                if (this.f16404e.b(i8)) {
                    u uVar2 = this.f16404e;
                    ((o2.a0) m0.j(this.f16403d)).M(this.f16404e.f16565d, o2.w.q(uVar2.f16565d, uVar2.f16566e));
                    ((k0) m0.j(this.f16402c)).a(this.f16413n, this.f16403d);
                }
                if (i10 == 178 && a0Var.d()[c7 + 2] == 1) {
                    this.f16404e.e(i10);
                }
            }
            if (i10 == 0 || i10 == 179) {
                int i12 = f7 - c7;
                if (this.f16415p && this.f16409j) {
                    long j8 = this.f16413n;
                    if (j8 != -9223372036854775807L) {
                        i7 = i10;
                        this.f16401b.b(j8, this.f16414o ? 1 : 0, ((int) (this.f16407h - this.f16412m)) - i12, i12, null);
                        if (this.f16408i || this.f16415p) {
                            this.f16412m = this.f16407h - i12;
                            j7 = this.f16411l;
                            if (j7 == -9223372036854775807L) {
                                long j9 = this.f16413n;
                                j7 = j9 != -9223372036854775807L ? j9 + this.f16410k : -9223372036854775807L;
                            }
                            this.f16413n = j7;
                            this.f16414o = false;
                            this.f16411l = -9223372036854775807L;
                            this.f16408i = true;
                        }
                        this.f16415p = i7 == 0;
                    }
                }
                i7 = i10;
                if (this.f16408i) {
                }
                this.f16412m = this.f16407h - i12;
                j7 = this.f16411l;
                if (j7 == -9223372036854775807L) {
                }
                this.f16413n = j7;
                this.f16414o = false;
                this.f16411l = -9223372036854775807L;
                this.f16408i = true;
                this.f16415p = i7 == 0;
            } else if (i10 == 184) {
                this.f16414o = true;
            }
            e7 = i9;
        }
        if (!this.f16409j) {
            this.f16406g.a(d7, e7, f7);
        }
        u uVar3 = this.f16404e;
        if (uVar3 != null) {
            uVar3.a(d7, e7, f7);
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16400a = dVar.b();
        this.f16401b = nVar.d(dVar.c(), 2);
        k0 k0Var = this.f16402c;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        this.f16411l = j7;
    }
}
