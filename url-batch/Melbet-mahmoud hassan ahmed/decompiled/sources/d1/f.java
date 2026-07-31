package d1;

import android.net.Uri;
import d1.g;
import j1.a;
import java.io.EOFException;
import java.util.Map;
import o1.h;
import o2.a0;
import o2.m0;
import r0.n2;
import r0.s1;
import t0.e0;
import w0.k;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;
import w0.x;
import w0.y;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: u, reason: collision with root package name */
    public static final r f15521u = new r() { // from class: d1.e
        @Override // w0.r
        public final l[] a() {
            l[] p7;
            p7 = f.p();
            return p7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private static final h.a f15522v = new h.a() { // from class: d1.d
        @Override // o1.h.a
        public final boolean a(int i7, int i8, int i9, int i10, int i11) {
            boolean q7;
            q7 = f.q(i7, i8, i9, i10, i11);
            return q7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f15523a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15524b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f15525c;

    /* renamed from: d, reason: collision with root package name */
    private final e0.a f15526d;

    /* renamed from: e, reason: collision with root package name */
    private final x f15527e;

    /* renamed from: f, reason: collision with root package name */
    private final y f15528f;

    /* renamed from: g, reason: collision with root package name */
    private final w0.e0 f15529g;

    /* renamed from: h, reason: collision with root package name */
    private n f15530h;

    /* renamed from: i, reason: collision with root package name */
    private w0.e0 f15531i;

    /* renamed from: j, reason: collision with root package name */
    private w0.e0 f15532j;

    /* renamed from: k, reason: collision with root package name */
    private int f15533k;

    /* renamed from: l, reason: collision with root package name */
    private j1.a f15534l;

    /* renamed from: m, reason: collision with root package name */
    private long f15535m;

    /* renamed from: n, reason: collision with root package name */
    private long f15536n;

    /* renamed from: o, reason: collision with root package name */
    private long f15537o;

    /* renamed from: p, reason: collision with root package name */
    private int f15538p;

    /* renamed from: q, reason: collision with root package name */
    private g f15539q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15540r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15541s;

    /* renamed from: t, reason: collision with root package name */
    private long f15542t;

    public f() {
        this(0);
    }

    public f(int i7) {
        this(i7, -9223372036854775807L);
    }

    public f(int i7, long j7) {
        this.f15523a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f15524b = j7;
        this.f15525c = new a0(10);
        this.f15526d = new e0.a();
        this.f15527e = new x();
        this.f15535m = -9223372036854775807L;
        this.f15528f = new y();
        k kVar = new k();
        this.f15529g = kVar;
        this.f15532j = kVar;
    }

    private void g() {
        o2.a.h(this.f15531i);
        m0.j(this.f15530h);
    }

    private g i(m mVar) {
        long m7;
        long j7;
        long j8;
        long f7;
        g s7 = s(mVar);
        c r7 = r(this.f15534l, mVar.p());
        if (this.f15540r) {
            return new g.a();
        }
        if ((this.f15523a & 4) != 0) {
            if (r7 != null) {
                j8 = r7.j();
                f7 = r7.f();
            } else if (s7 != null) {
                j8 = s7.j();
                f7 = s7.f();
            } else {
                m7 = m(this.f15534l);
                j7 = -1;
                s7 = new b(m7, mVar.p(), j7);
            }
            j7 = f7;
            m7 = j8;
            s7 = new b(m7, mVar.p(), j7);
        } else if (r7 != null) {
            s7 = r7;
        } else if (s7 == null) {
            s7 = null;
        }
        if (s7 == null || !(s7.g() || (this.f15523a & 1) == 0)) {
            return l(mVar, (this.f15523a & 2) != 0);
        }
        return s7;
    }

    private long j(long j7) {
        return this.f15535m + ((j7 * 1000000) / this.f15526d.f21730d);
    }

    private g l(m mVar, boolean z6) {
        mVar.n(this.f15525c.d(), 0, 4);
        this.f15525c.O(0);
        this.f15526d.a(this.f15525c.m());
        return new a(mVar.a(), mVar.p(), this.f15526d, z6);
    }

    private static long m(j1.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int h7 = aVar.h();
        for (int i7 = 0; i7 < h7; i7++) {
            a.b g7 = aVar.g(i7);
            if (g7 instanceof o1.m) {
                o1.m mVar = (o1.m) g7;
                if (mVar.f19673f.equals("TLEN")) {
                    return m0.B0(Long.parseLong(mVar.f19685h));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int n(a0 a0Var, int i7) {
        if (a0Var.f() >= i7 + 4) {
            a0Var.O(i7);
            int m7 = a0Var.m();
            if (m7 == 1483304551 || m7 == 1231971951) {
                return m7;
            }
        }
        if (a0Var.f() < 40) {
            return 0;
        }
        a0Var.O(36);
        return a0Var.m() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean o(int i7, long j7) {
        return ((long) (i7 & (-128000))) == (j7 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] p() {
        return new l[]{new f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q(int i7, int i8, int i9, int i10, int i11) {
        return (i8 == 67 && i9 == 79 && i10 == 77 && (i11 == 77 || i7 == 2)) || (i8 == 77 && i9 == 76 && i10 == 76 && (i11 == 84 || i7 == 2));
    }

    private static c r(j1.a aVar, long j7) {
        if (aVar == null) {
            return null;
        }
        int h7 = aVar.h();
        for (int i7 = 0; i7 < h7; i7++) {
            a.b g7 = aVar.g(i7);
            if (g7 instanceof o1.k) {
                return c.a(j7, (o1.k) g7, m(aVar));
            }
        }
        return null;
    }

    private g s(m mVar) {
        int i7;
        a0 a0Var = new a0(this.f15526d.f21729c);
        mVar.n(a0Var.d(), 0, this.f15526d.f21729c);
        e0.a aVar = this.f15526d;
        int i8 = aVar.f21727a & 1;
        int i9 = aVar.f21731e;
        if (i8 != 0) {
            if (i9 != 1) {
                i7 = 36;
            }
            i7 = 21;
        } else {
            if (i9 == 1) {
                i7 = 13;
            }
            i7 = 21;
        }
        int n7 = n(a0Var, i7);
        if (n7 != 1483304551 && n7 != 1231971951) {
            if (n7 != 1447187017) {
                mVar.h();
                return null;
            }
            h a7 = h.a(mVar.a(), mVar.p(), this.f15526d, a0Var);
            mVar.i(this.f15526d.f21729c);
            return a7;
        }
        i a8 = i.a(mVar.a(), mVar.p(), this.f15526d, a0Var);
        if (a8 != null && !this.f15527e.a()) {
            mVar.h();
            mVar.o(i7 + 141);
            mVar.n(this.f15525c.d(), 0, 3);
            this.f15525c.O(0);
            this.f15527e.d(this.f15525c.F());
        }
        mVar.i(this.f15526d.f21729c);
        return (a8 == null || a8.g() || n7 != 1231971951) ? a8 : l(mVar, false);
    }

    private boolean t(m mVar) {
        g gVar = this.f15539q;
        if (gVar != null) {
            long f7 = gVar.f();
            if (f7 != -1 && mVar.m() > f7 - 4) {
                return true;
            }
        }
        try {
            return !mVar.l(this.f15525c.d(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int u(m mVar) {
        if (this.f15533k == 0) {
            try {
                w(mVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f15539q == null) {
            g i7 = i(mVar);
            this.f15539q = i7;
            this.f15530h.i(i7);
            this.f15532j.e(new s1.b().e0(this.f15526d.f21728b).W(4096).H(this.f15526d.f21731e).f0(this.f15526d.f21730d).N(this.f15527e.f22982a).O(this.f15527e.f22983b).X((this.f15523a & 8) != 0 ? null : this.f15534l).E());
            this.f15537o = mVar.p();
        } else if (this.f15537o != 0) {
            long p7 = mVar.p();
            long j7 = this.f15537o;
            if (p7 < j7) {
                mVar.i((int) (j7 - p7));
            }
        }
        return v(mVar);
    }

    private int v(m mVar) {
        if (this.f15538p == 0) {
            mVar.h();
            if (t(mVar)) {
                return -1;
            }
            this.f15525c.O(0);
            int m7 = this.f15525c.m();
            if (!o(m7, this.f15533k) || e0.j(m7) == -1) {
                mVar.i(1);
                this.f15533k = 0;
                return 0;
            }
            this.f15526d.a(m7);
            if (this.f15535m == -9223372036854775807L) {
                this.f15535m = this.f15539q.c(mVar.p());
                if (this.f15524b != -9223372036854775807L) {
                    this.f15535m += this.f15524b - this.f15539q.c(0L);
                }
            }
            this.f15538p = this.f15526d.f21729c;
            g gVar = this.f15539q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(j(this.f15536n + r0.f21733g), mVar.p() + this.f15526d.f21729c);
                if (this.f15541s && bVar.a(this.f15542t)) {
                    this.f15541s = false;
                    this.f15532j = this.f15531i;
                }
            }
        }
        int a7 = this.f15532j.a(mVar, this.f15538p, true);
        if (a7 == -1) {
            return -1;
        }
        int i7 = this.f15538p - a7;
        this.f15538p = i7;
        if (i7 > 0) {
            return 0;
        }
        this.f15532j.b(j(this.f15536n), 1, this.f15526d.f21729c, 0, null);
        this.f15536n += this.f15526d.f21733g;
        this.f15538p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r13 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r12.i(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r11.f15533k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean w(m mVar, boolean z6) {
        int i7;
        int i8;
        int j7;
        int i9 = z6 ? 32768 : 131072;
        mVar.h();
        if (mVar.p() == 0) {
            j1.a a7 = this.f15528f.a(mVar, (this.f15523a & 8) == 0 ? null : f15522v);
            this.f15534l = a7;
            if (a7 != null) {
                this.f15527e.c(a7);
            }
            i8 = (int) mVar.m();
            if (!z6) {
                mVar.i(i8);
            }
            i7 = 0;
        } else {
            i7 = 0;
            i8 = 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (!t(mVar)) {
                this.f15525c.O(0);
                int m7 = this.f15525c.m();
                if ((i7 == 0 || o(m7, i7)) && (j7 = e0.j(m7)) != -1) {
                    i10++;
                    if (i10 != 1) {
                        if (i10 == 4) {
                            break;
                        }
                    } else {
                        this.f15526d.a(m7);
                        i7 = m7;
                    }
                    mVar.o(j7 - 4);
                } else {
                    int i12 = i11 + 1;
                    if (i11 == i9) {
                        if (z6) {
                            return false;
                        }
                        throw n2.a("Searched too many bytes.", null);
                    }
                    if (z6) {
                        mVar.h();
                        mVar.o(i8 + i12);
                    } else {
                        mVar.i(1);
                    }
                    i11 = i12;
                    i7 = 0;
                    i10 = 0;
                }
            } else if (i10 <= 0) {
                throw new EOFException();
            }
        }
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f15533k = 0;
        this.f15535m = -9223372036854775807L;
        this.f15536n = 0L;
        this.f15538p = 0;
        this.f15542t = j8;
        g gVar = this.f15539q;
        if (!(gVar instanceof b) || ((b) gVar).a(j8)) {
            return;
        }
        this.f15541s = true;
        this.f15532j = this.f15529g;
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f15530h = nVar;
        w0.e0 d7 = nVar.d(0, 1);
        this.f15531i = d7;
        this.f15532j = d7;
        this.f15530h.j();
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        g();
        int u6 = u(mVar);
        if (u6 == -1 && (this.f15539q instanceof b)) {
            long j7 = j(this.f15536n);
            if (this.f15539q.j() != j7) {
                ((b) this.f15539q).d(j7);
                this.f15530h.i(this.f15539q);
            }
        }
        return u6;
    }

    @Override // w0.l
    public boolean h(m mVar) {
        return w(mVar, true);
    }

    public void k() {
        this.f15540r = true;
    }
}
