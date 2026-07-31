package g1;

import android.util.SparseArray;
import g1.i0;
import java.util.ArrayList;
import java.util.Arrays;
import o2.m0;
import o2.w;
import r0.s1;

/* loaded from: classes.dex */
public final class p implements m {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f16447a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16448b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16449c;

    /* renamed from: g, reason: collision with root package name */
    private long f16453g;

    /* renamed from: i, reason: collision with root package name */
    private String f16455i;

    /* renamed from: j, reason: collision with root package name */
    private w0.e0 f16456j;

    /* renamed from: k, reason: collision with root package name */
    private b f16457k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16458l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f16460n;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f16454h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    private final u f16450d = new u(7, 128);

    /* renamed from: e, reason: collision with root package name */
    private final u f16451e = new u(8, 128);

    /* renamed from: f, reason: collision with root package name */
    private final u f16452f = new u(6, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f16459m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final o2.a0 f16461o = new o2.a0();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final w0.e0 f16462a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f16463b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16464c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<w.c> f16465d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<w.b> f16466e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final o2.b0 f16467f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f16468g;

        /* renamed from: h, reason: collision with root package name */
        private int f16469h;

        /* renamed from: i, reason: collision with root package name */
        private int f16470i;

        /* renamed from: j, reason: collision with root package name */
        private long f16471j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f16472k;

        /* renamed from: l, reason: collision with root package name */
        private long f16473l;

        /* renamed from: m, reason: collision with root package name */
        private a f16474m;

        /* renamed from: n, reason: collision with root package name */
        private a f16475n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f16476o;

        /* renamed from: p, reason: collision with root package name */
        private long f16477p;

        /* renamed from: q, reason: collision with root package name */
        private long f16478q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f16479r;

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f16480a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f16481b;

            /* renamed from: c, reason: collision with root package name */
            private w.c f16482c;

            /* renamed from: d, reason: collision with root package name */
            private int f16483d;

            /* renamed from: e, reason: collision with root package name */
            private int f16484e;

            /* renamed from: f, reason: collision with root package name */
            private int f16485f;

            /* renamed from: g, reason: collision with root package name */
            private int f16486g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f16487h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f16488i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f16489j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f16490k;

            /* renamed from: l, reason: collision with root package name */
            private int f16491l;

            /* renamed from: m, reason: collision with root package name */
            private int f16492m;

            /* renamed from: n, reason: collision with root package name */
            private int f16493n;

            /* renamed from: o, reason: collision with root package name */
            private int f16494o;

            /* renamed from: p, reason: collision with root package name */
            private int f16495p;

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i7;
                int i8;
                int i9;
                boolean z6;
                if (!this.f16480a) {
                    return false;
                }
                if (!aVar.f16480a) {
                    return true;
                }
                w.c cVar = (w.c) o2.a.h(this.f16482c);
                w.c cVar2 = (w.c) o2.a.h(aVar.f16482c);
                return (this.f16485f == aVar.f16485f && this.f16486g == aVar.f16486g && this.f16487h == aVar.f16487h && (!this.f16488i || !aVar.f16488i || this.f16489j == aVar.f16489j) && (((i7 = this.f16483d) == (i8 = aVar.f16483d) || (i7 != 0 && i8 != 0)) && (((i9 = cVar.f19824l) != 0 || cVar2.f19824l != 0 || (this.f16492m == aVar.f16492m && this.f16493n == aVar.f16493n)) && ((i9 != 1 || cVar2.f19824l != 1 || (this.f16494o == aVar.f16494o && this.f16495p == aVar.f16495p)) && (z6 = this.f16490k) == aVar.f16490k && (!z6 || this.f16491l == aVar.f16491l))))) ? false : true;
            }

            public void b() {
                this.f16481b = false;
                this.f16480a = false;
            }

            public boolean d() {
                int i7;
                return this.f16481b && ((i7 = this.f16484e) == 7 || i7 == 2);
            }

            public void e(w.c cVar, int i7, int i8, int i9, int i10, boolean z6, boolean z7, boolean z8, boolean z9, int i11, int i12, int i13, int i14, int i15) {
                this.f16482c = cVar;
                this.f16483d = i7;
                this.f16484e = i8;
                this.f16485f = i9;
                this.f16486g = i10;
                this.f16487h = z6;
                this.f16488i = z7;
                this.f16489j = z8;
                this.f16490k = z9;
                this.f16491l = i11;
                this.f16492m = i12;
                this.f16493n = i13;
                this.f16494o = i14;
                this.f16495p = i15;
                this.f16480a = true;
                this.f16481b = true;
            }

            public void f(int i7) {
                this.f16484e = i7;
                this.f16481b = true;
            }
        }

        public b(w0.e0 e0Var, boolean z6, boolean z7) {
            this.f16462a = e0Var;
            this.f16463b = z6;
            this.f16464c = z7;
            this.f16474m = new a();
            this.f16475n = new a();
            byte[] bArr = new byte[128];
            this.f16468g = bArr;
            this.f16467f = new o2.b0(bArr, 0, 0);
            g();
        }

        private void d(int i7) {
            long j7 = this.f16478q;
            if (j7 == -9223372036854775807L) {
                return;
            }
            boolean z6 = this.f16479r;
            this.f16462a.b(j7, z6 ? 1 : 0, (int) (this.f16471j - this.f16477p), i7, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(byte[] bArr, int i7, int i8) {
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int g7;
            if (this.f16472k) {
                int i14 = i8 - i7;
                byte[] bArr2 = this.f16468g;
                int length = bArr2.length;
                int i15 = this.f16469h;
                if (length < i15 + i14) {
                    this.f16468g = Arrays.copyOf(bArr2, (i15 + i14) * 2);
                }
                System.arraycopy(bArr, i7, this.f16468g, this.f16469h, i14);
                int i16 = this.f16469h + i14;
                this.f16469h = i16;
                this.f16467f.i(this.f16468g, 0, i16);
                if (this.f16467f.b(8)) {
                    this.f16467f.k();
                    int e7 = this.f16467f.e(2);
                    this.f16467f.l(5);
                    if (this.f16467f.c()) {
                        this.f16467f.h();
                        if (this.f16467f.c()) {
                            int h7 = this.f16467f.h();
                            if (!this.f16464c) {
                                this.f16472k = false;
                                this.f16475n.f(h7);
                                return;
                            }
                            if (this.f16467f.c()) {
                                int h8 = this.f16467f.h();
                                if (this.f16466e.indexOfKey(h8) < 0) {
                                    this.f16472k = false;
                                    return;
                                }
                                w.b bVar = this.f16466e.get(h8);
                                w.c cVar = this.f16465d.get(bVar.f19811b);
                                if (cVar.f19821i) {
                                    if (!this.f16467f.b(2)) {
                                        return;
                                    } else {
                                        this.f16467f.l(2);
                                    }
                                }
                                if (this.f16467f.b(cVar.f19823k)) {
                                    int e8 = this.f16467f.e(cVar.f19823k);
                                    if (cVar.f19822j) {
                                        z6 = false;
                                    } else {
                                        if (!this.f16467f.b(1)) {
                                            return;
                                        }
                                        boolean d7 = this.f16467f.d();
                                        if (d7) {
                                            if (this.f16467f.b(1)) {
                                                z6 = d7;
                                                z8 = this.f16467f.d();
                                                z7 = true;
                                                z9 = this.f16470i != 5;
                                                if (z9) {
                                                    i9 = 0;
                                                } else if (!this.f16467f.c()) {
                                                    return;
                                                } else {
                                                    i9 = this.f16467f.h();
                                                }
                                                i10 = cVar.f19824l;
                                                if (i10 != 0) {
                                                    if (!this.f16467f.b(cVar.f19825m)) {
                                                        return;
                                                    }
                                                    int e9 = this.f16467f.e(cVar.f19825m);
                                                    if (bVar.f19812c && !z6) {
                                                        if (this.f16467f.c()) {
                                                            i13 = this.f16467f.g();
                                                            i11 = e9;
                                                            i12 = 0;
                                                            g7 = 0;
                                                            this.f16475n.e(cVar, e7, h7, e8, h8, z6, z7, z8, z9, i9, i11, i13, i12, g7);
                                                            this.f16472k = false;
                                                        }
                                                        return;
                                                    }
                                                    i11 = e9;
                                                } else {
                                                    if (i10 == 1 && !cVar.f19826n) {
                                                        if (this.f16467f.c()) {
                                                            int g8 = this.f16467f.g();
                                                            if (!bVar.f19812c || z6) {
                                                                i12 = g8;
                                                                i11 = 0;
                                                                i13 = 0;
                                                                g7 = 0;
                                                                this.f16475n.e(cVar, e7, h7, e8, h8, z6, z7, z8, z9, i9, i11, i13, i12, g7);
                                                                this.f16472k = false;
                                                            }
                                                            if (this.f16467f.c()) {
                                                                g7 = this.f16467f.g();
                                                                i12 = g8;
                                                                i11 = 0;
                                                                i13 = 0;
                                                                this.f16475n.e(cVar, e7, h7, e8, h8, z6, z7, z8, z9, i9, i11, i13, i12, g7);
                                                                this.f16472k = false;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    i11 = 0;
                                                }
                                                i13 = 0;
                                                i12 = 0;
                                                g7 = 0;
                                                this.f16475n.e(cVar, e7, h7, e8, h8, z6, z7, z8, z9, i9, i11, i13, i12, g7);
                                                this.f16472k = false;
                                            }
                                            return;
                                        }
                                        z6 = d7;
                                    }
                                    z7 = false;
                                    z8 = false;
                                    if (this.f16470i != 5) {
                                    }
                                    if (z9) {
                                    }
                                    i10 = cVar.f19824l;
                                    if (i10 != 0) {
                                    }
                                    i13 = 0;
                                    i12 = 0;
                                    g7 = 0;
                                    this.f16475n.e(cVar, e7, h7, e8, h8, z6, z7, z8, z9, i9, i11, i13, i12, g7);
                                    this.f16472k = false;
                                }
                            }
                        }
                    }
                }
            }
        }

        public boolean b(long j7, int i7, boolean z6, boolean z7) {
            boolean z8 = false;
            if (this.f16470i == 9 || (this.f16464c && this.f16475n.c(this.f16474m))) {
                if (z6 && this.f16476o) {
                    d(i7 + ((int) (j7 - this.f16471j)));
                }
                this.f16477p = this.f16471j;
                this.f16478q = this.f16473l;
                this.f16479r = false;
                this.f16476o = true;
            }
            if (this.f16463b) {
                z7 = this.f16475n.d();
            }
            boolean z9 = this.f16479r;
            int i8 = this.f16470i;
            if (i8 == 5 || (z7 && i8 == 1)) {
                z8 = true;
            }
            boolean z10 = z9 | z8;
            this.f16479r = z10;
            return z10;
        }

        public boolean c() {
            return this.f16464c;
        }

        public void e(w.b bVar) {
            this.f16466e.append(bVar.f19810a, bVar);
        }

        public void f(w.c cVar) {
            this.f16465d.append(cVar.f19816d, cVar);
        }

        public void g() {
            this.f16472k = false;
            this.f16476o = false;
            this.f16475n.b();
        }

        public void h(long j7, int i7, long j8) {
            this.f16470i = i7;
            this.f16473l = j8;
            this.f16471j = j7;
            if (!this.f16463b || i7 != 1) {
                if (!this.f16464c) {
                    return;
                }
                if (i7 != 5 && i7 != 1 && i7 != 2) {
                    return;
                }
            }
            a aVar = this.f16474m;
            this.f16474m = this.f16475n;
            this.f16475n = aVar;
            aVar.b();
            this.f16469h = 0;
            this.f16472k = true;
        }
    }

    public p(d0 d0Var, boolean z6, boolean z7) {
        this.f16447a = d0Var;
        this.f16448b = z6;
        this.f16449c = z7;
    }

    private void b() {
        o2.a.h(this.f16456j);
        m0.j(this.f16457k);
    }

    private void g(long j7, int i7, int i8, long j8) {
        u uVar;
        if (!this.f16458l || this.f16457k.c()) {
            this.f16450d.b(i8);
            this.f16451e.b(i8);
            if (this.f16458l) {
                if (this.f16450d.c()) {
                    u uVar2 = this.f16450d;
                    this.f16457k.f(o2.w.l(uVar2.f16565d, 3, uVar2.f16566e));
                    uVar = this.f16450d;
                } else if (this.f16451e.c()) {
                    u uVar3 = this.f16451e;
                    this.f16457k.e(o2.w.j(uVar3.f16565d, 3, uVar3.f16566e));
                    uVar = this.f16451e;
                }
            } else if (this.f16450d.c() && this.f16451e.c()) {
                ArrayList arrayList = new ArrayList();
                u uVar4 = this.f16450d;
                arrayList.add(Arrays.copyOf(uVar4.f16565d, uVar4.f16566e));
                u uVar5 = this.f16451e;
                arrayList.add(Arrays.copyOf(uVar5.f16565d, uVar5.f16566e));
                u uVar6 = this.f16450d;
                w.c l7 = o2.w.l(uVar6.f16565d, 3, uVar6.f16566e);
                u uVar7 = this.f16451e;
                w.b j9 = o2.w.j(uVar7.f16565d, 3, uVar7.f16566e);
                this.f16456j.e(new s1.b().S(this.f16455i).e0("video/avc").I(o2.e.a(l7.f19813a, l7.f19814b, l7.f19815c)).j0(l7.f19818f).Q(l7.f19819g).a0(l7.f19820h).T(arrayList).E());
                this.f16458l = true;
                this.f16457k.f(l7);
                this.f16457k.e(j9);
                this.f16450d.d();
                uVar = this.f16451e;
            }
            uVar.d();
        }
        if (this.f16452f.b(i8)) {
            u uVar8 = this.f16452f;
            this.f16461o.M(this.f16452f.f16565d, o2.w.q(uVar8.f16565d, uVar8.f16566e));
            this.f16461o.O(4);
            this.f16447a.a(j8, this.f16461o);
        }
        if (this.f16457k.b(j7, i7, this.f16458l, this.f16460n)) {
            this.f16460n = false;
        }
    }

    private void h(byte[] bArr, int i7, int i8) {
        if (!this.f16458l || this.f16457k.c()) {
            this.f16450d.a(bArr, i7, i8);
            this.f16451e.a(bArr, i7, i8);
        }
        this.f16452f.a(bArr, i7, i8);
        this.f16457k.a(bArr, i7, i8);
    }

    private void i(long j7, int i7, long j8) {
        if (!this.f16458l || this.f16457k.c()) {
            this.f16450d.e(i7);
            this.f16451e.e(i7);
        }
        this.f16452f.e(i7);
        this.f16457k.h(j7, i7, j8);
    }

    @Override // g1.m
    public void a() {
        this.f16453g = 0L;
        this.f16460n = false;
        this.f16459m = -9223372036854775807L;
        o2.w.a(this.f16454h);
        this.f16450d.d();
        this.f16451e.d();
        this.f16452f.d();
        b bVar = this.f16457k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // g1.m
    public void c(o2.a0 a0Var) {
        b();
        int e7 = a0Var.e();
        int f7 = a0Var.f();
        byte[] d7 = a0Var.d();
        this.f16453g += a0Var.a();
        this.f16456j.d(a0Var, a0Var.a());
        while (true) {
            int c7 = o2.w.c(d7, e7, f7, this.f16454h);
            if (c7 == f7) {
                h(d7, e7, f7);
                return;
            }
            int f8 = o2.w.f(d7, c7);
            int i7 = c7 - e7;
            if (i7 > 0) {
                h(d7, e7, c7);
            }
            int i8 = f7 - c7;
            long j7 = this.f16453g - i8;
            g(j7, i8, i7 < 0 ? -i7 : 0, this.f16459m);
            i(j7, f8, this.f16459m);
            e7 = c7 + 3;
        }
    }

    @Override // g1.m
    public void d(w0.n nVar, i0.d dVar) {
        dVar.a();
        this.f16455i = dVar.b();
        w0.e0 d7 = nVar.d(dVar.c(), 2);
        this.f16456j = d7;
        this.f16457k = new b(d7, this.f16448b, this.f16449c);
        this.f16447a.b(nVar, dVar);
    }

    @Override // g1.m
    public void e() {
    }

    @Override // g1.m
    public void f(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f16459m = j7;
        }
        this.f16460n |= (i7 & 2) != 0;
    }
}
