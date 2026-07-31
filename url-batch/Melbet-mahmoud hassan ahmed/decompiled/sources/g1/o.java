package g1;

import g1.i0;
import java.util.Arrays;
import java.util.Collections;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f16421l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final k0 f16422a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.a0 f16423b;

    /* renamed from: e, reason: collision with root package name */
    private final u f16426e;

    /* renamed from: f, reason: collision with root package name */
    private b f16427f;

    /* renamed from: g, reason: collision with root package name */
    private long f16428g;

    /* renamed from: h, reason: collision with root package name */
    private String f16429h;

    /* renamed from: i, reason: collision with root package name */
    private w0.e0 f16430i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16431j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f16424c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final a f16425d = new a(128);

    /* renamed from: k, reason: collision with root package name */
    private long f16432k = -9223372036854775807L;

    private static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f16433f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f16434a;

        /* renamed from: b, reason: collision with root package name */
        private int f16435b;

        /* renamed from: c, reason: collision with root package name */
        public int f16436c;

        /* renamed from: d, reason: collision with root package name */
        public int f16437d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f16438e;

        public a(int i7) {
            this.f16438e = new byte[i7];
        }

        public void a(byte[] bArr, int i7, int i8) {
            if (this.f16434a) {
                int i9 = i8 - i7;
                byte[] bArr2 = this.f16438e;
                int length = bArr2.length;
                int i10 = this.f16436c;
                if (length < i10 + i9) {
                    this.f16438e = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i7, this.f16438e, this.f16436c, i9);
                this.f16436c += i9;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (r9 != 181) goto L27;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean b(int i7, int i8) {
            int i9 = this.f16435b;
            if (i9 != 0) {
                int i10 = 2;
                if (i9 != 1) {
                    if (i9 != 2) {
                        i10 = 4;
                        if (i9 == 3) {
                            if ((i7 & 240) == 32) {
                                this.f16437d = this.f16436c;
                                this.f16435b = i10;
                            }
                            o2.r.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            if (i9 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i7 == 179 || i7 == 181) {
                                this.f16436c -= i8;
                                this.f16434a = false;
                                return true;
                            }
                        }
                    } else {
                        if (i7 <= 31) {
                            this.f16435b = 3;
                        }
                        o2.r.i("H263Reader", "Unexpected start code value");
                        c();
                    }
                }
            } else if (i7 == 176) {
                this.f16435b = 1;
                this.f16434a = true;
            }
            byte[] bArr = f16433f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f16434a = false;
            this.f16436c = 0;
            this.f16435b = 0;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final w0.e0 f16439a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16440b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16441c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16442d;

        /* renamed from: e, reason: collision with root package name */
        private int f16443e;

        /* renamed from: f, reason: collision with root package name */
        private int f16444f;

        /* renamed from: g, reason: collision with root package name */
        private long f16445g;

        /* renamed from: h, reason: collision with root package name */
        private long f16446h;

        public b(w0.e0 e0Var) {
            this.f16439a = e0Var;
        }

        public void a(byte[] bArr, int i7, int i8) {
            if (this.f16441c) {
                int i9 = this.f16444f;
                int i10 = (i7 + 1) - i9;
                if (i10 >= i8) {
                    this.f16444f = i9 + (i8 - i7);
                } else {
                    this.f16442d = ((bArr[i10] & 192) >> 6) == 0;
                    this.f16441c = false;
                }
            }
        }

        public void b(long j7, int i7, boolean z6) {
            if (this.f16443e == 182 && z6 && this.f16440b) {
                long j8 = this.f16446h;
                if (j8 != -9223372036854775807L) {
                    this.f16439a.b(j8, this.f16442d ? 1 : 0, (int) (j7 - this.f16445g), i7, null);
                }
            }
            if (this.f16443e != 179) {
                this.f16445g = j7;
            }
        }

        public void c(int i7, long j7) {
            this.f16443e = i7;
            this.f16442d = false;
            this.f16440b = i7 == 182 || i7 == 179;
            this.f16441c = i7 == 182;
            this.f16444f = 0;
            this.f16446h = j7;
        }

        public void d() {
            this.f16440b = false;
            this.f16441c = false;
            this.f16442d = false;
            this.f16443e = -1;
        }
    }

    o(k0 k0Var) {
        o2.a0 a0Var;
        this.f16422a = k0Var;
        if (k0Var != null) {
            this.f16426e = new u(178, 128);
            a0Var = new o2.a0();
        } else {
            a0Var = null;
            this.f16426e = null;
        }
        this.f16423b = a0Var;
    }

    private static s1 b(a aVar, int i7, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f16438e, aVar.f16436c);
        o2.z zVar = new o2.z(copyOf);
        zVar.s(i7);
        zVar.s(4);
        zVar.q();
        zVar.r(8);
        if (zVar.g()) {
            zVar.r(4);
            zVar.r(3);
        }
        int h7 = zVar.h(4);
        float f7 = 1.0f;
        if (h7 == 15) {
            int h8 = zVar.h(8);
            int h9 = zVar.h(8);
            if (h9 != 0) {
                f7 = h8 / h9;
            }
            o2.r.i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f16421l;
            if (h7 < fArr.length) {
                f7 = fArr[h7];
            }
            o2.r.i("H263Reader", "Invalid aspect ratio");
        }
        if (zVar.g()) {
            zVar.r(2);
            zVar.r(1);
            if (zVar.g()) {
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(15);
                zVar.q();
                zVar.r(3);
                zVar.r(11);
                zVar.q();
                zVar.r(15);
                zVar.q();
            }
        }
        if (zVar.h(2) != 0) {
            o2.r.i("H263Reader", "Unhandled video object layer shape");
        }
        zVar.q();
        int h10 = zVar.h(16);
        zVar.q();
        if (zVar.g()) {
            if (h10 == 0) {
                o2.r.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i8 = 0;
                for (int i9 = h10 - 1; i9 > 0; i9 >>= 1) {
                    i8++;
                }
                zVar.r(i8);
            }
        }
        zVar.q();
        int h11 = zVar.h(13);
        zVar.q();
        int h12 = zVar.h(13);
        zVar.q();
        zVar.q();
        return new s1.b().S(str).e0("video/mp4v-es").j0(h11).Q(h12).a0(f7).T(Collections.singletonList(copyOf)).E();
    }

    @Override // g1.m
    public void a() {
        o2.w.a(this.f16424c);
        this.f16425d.c();
        b bVar = this.f16427f;
        if (bVar != null) {
            bVar.d();
        }
        u uVar = this.f16426e;
        if (uVar != null) {
            uVar.d();
        }
        this.f16428g = 0L;
        this.f16432k = -9223372036854775807L;
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        o2.a.h(this.f16427f);
        o2.a.h(this.f16430i);
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        byte[] d7 = a0Var.d();
        this.f16428g += a0Var.a();
        this.f16430i.d(a0Var, a0Var.a());
        while (true) {
            int c7 = o2.w.c(d7, e7, f7, this.f16424c);
            if (c7 == f7) {
                break;
            }
            int i7 = c7 + 3;
            int i8 = a0Var.d()[i7] & 255;
            int i9 = c7 - e7;
            int i10 = 0;
            if (!this.f16431j) {
                if (i9 > 0) {
                    this.f16425d.a(d7, e7, c7);
                }
                if (this.f16425d.b(i8, i9 < 0 ? -i9 : 0)) {
                    w0.e0 e0Var = this.f16430i;
                    a aVar = this.f16425d;
                    e0Var.e(b(aVar, aVar.f16437d, (String) o2.a.e(this.f16429h)));
                    this.f16431j = true;
                }
            }
            this.f16427f.a(d7, e7, c7);
            u uVar = this.f16426e;
            if (uVar != null) {
                if (i9 > 0) {
                    uVar.a(d7, e7, c7);
                } else {
                    i10 = -i9;
                }
                if (this.f16426e.b(i10)) {
                    u uVar2 = this.f16426e;
                    ((o2.a0) m0.j(this.f16423b)).M(this.f16426e.f16565d, o2.w.q(uVar2.f16565d, uVar2.f16566e));
                    ((k0) m0.j(this.f16422a)).a(this.f16432k, this.f16423b);
                }
                if (i8 == 178 && a0Var.d()[c7 + 2] == 1) {
                    this.f16426e.e(i8);
                }
            }
            int i11 = f7 - c7;
            this.f16427f.b(this.f16428g - i11, i11, this.f16431j);
            this.f16427f.c(i8, this.f16432k);
            e7 = i7;
        }
        if (!this.f16431j) {
            this.f16425d.a(d7, e7, f7);
        }
        this.f16427f.a(d7, e7, f7);
        u uVar3 = this.f16426e;
        if (uVar3 != null) {
            uVar3.a(d7, e7, f7);
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16429h = dVar.b();
        w0.e0 d7 = nVar.d(dVar.c(), 2);
        this.f16430i = d7;
        this.f16427f = new b(d7);
        k0 k0Var = this.f16422a;
        if (k0Var != null) {
            k0Var.b(nVar, dVar);
        }
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16432k = j7;
        }
    }
}
