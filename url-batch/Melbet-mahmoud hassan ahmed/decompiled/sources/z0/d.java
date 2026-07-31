package z0;

import android.net.Uri;
import java.util.Map;
import o2.a0;
import o2.m0;
import w0.b0;
import w0.e0;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;
import w0.s;
import w0.t;
import w0.u;
import w0.v;

/* loaded from: classes.dex */
public final class d implements l {

    /* renamed from: o, reason: collision with root package name */
    public static final r f23489o = new r() { // from class: z0.c
        @Override // w0.r
        public final l[] a() {
            l[] k7;
            k7 = d.k();
            return k7;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23490a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f23491b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23492c;

    /* renamed from: d, reason: collision with root package name */
    private final s.a f23493d;

    /* renamed from: e, reason: collision with root package name */
    private n f23494e;

    /* renamed from: f, reason: collision with root package name */
    private e0 f23495f;

    /* renamed from: g, reason: collision with root package name */
    private int f23496g;

    /* renamed from: h, reason: collision with root package name */
    private j1.a f23497h;

    /* renamed from: i, reason: collision with root package name */
    private v f23498i;

    /* renamed from: j, reason: collision with root package name */
    private int f23499j;

    /* renamed from: k, reason: collision with root package name */
    private int f23500k;

    /* renamed from: l, reason: collision with root package name */
    private b f23501l;

    /* renamed from: m, reason: collision with root package name */
    private int f23502m;

    /* renamed from: n, reason: collision with root package name */
    private long f23503n;

    public d() {
        this(0);
    }

    public d(int i7) {
        this.f23490a = new byte[42];
        this.f23491b = new a0(new byte[32768], 0);
        this.f23492c = (i7 & 1) != 0;
        this.f23493d = new s.a();
        this.f23496g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r5.O(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return r4.f23493d.f22962a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long f(a0 a0Var, boolean z6) {
        boolean z7;
        o2.a.e(this.f23498i);
        int e7 = a0Var.e();
        while (true) {
            if (e7 > a0Var.f() - 16) {
                if (!z6) {
                    a0Var.O(e7);
                    return -1L;
                }
                while (e7 <= a0Var.f() - this.f23499j) {
                    a0Var.O(e7);
                    try {
                        z7 = s.d(a0Var, this.f23498i, this.f23500k, this.f23493d);
                    } catch (IndexOutOfBoundsException unused) {
                        z7 = false;
                    }
                    if (!(a0Var.e() <= a0Var.f() ? z7 : false)) {
                        e7++;
                    }
                }
                a0Var.O(a0Var.f());
                return -1L;
            }
            a0Var.O(e7);
            if (s.d(a0Var, this.f23498i, this.f23500k, this.f23493d)) {
                break;
            }
            e7++;
        }
    }

    private void g(m mVar) {
        this.f23500k = t.b(mVar);
        ((n) m0.j(this.f23494e)).i(i(mVar.p(), mVar.a()));
        this.f23496g = 5;
    }

    private b0 i(long j7, long j8) {
        o2.a.e(this.f23498i);
        v vVar = this.f23498i;
        if (vVar.f22976k != null) {
            return new u(vVar, j7);
        }
        if (j8 == -1 || vVar.f22975j <= 0) {
            return new b0.b(vVar.f());
        }
        b bVar = new b(vVar, this.f23500k, j7, j8);
        this.f23501l = bVar;
        return bVar.b();
    }

    private void j(m mVar) {
        byte[] bArr = this.f23490a;
        mVar.n(bArr, 0, bArr.length);
        mVar.h();
        this.f23496g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] k() {
        return new l[]{new d()};
    }

    private void l() {
        ((e0) m0.j(this.f23495f)).b((this.f23503n * 1000000) / ((v) m0.j(this.f23498i)).f22970e, 1, this.f23502m, 0, null);
    }

    private int m(m mVar, w0.a0 a0Var) {
        boolean z6;
        o2.a.e(this.f23495f);
        o2.a.e(this.f23498i);
        b bVar = this.f23501l;
        if (bVar != null && bVar.d()) {
            return this.f23501l.c(mVar, a0Var);
        }
        if (this.f23503n == -1) {
            this.f23503n = s.i(mVar, this.f23498i);
            return 0;
        }
        int f7 = this.f23491b.f();
        if (f7 < 32768) {
            int read = mVar.read(this.f23491b.d(), f7, 32768 - f7);
            z6 = read == -1;
            if (!z6) {
                this.f23491b.N(f7 + read);
            } else if (this.f23491b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z6 = false;
        }
        int e7 = this.f23491b.e();
        int i7 = this.f23502m;
        int i8 = this.f23499j;
        if (i7 < i8) {
            a0 a0Var2 = this.f23491b;
            a0Var2.P(Math.min(i8 - i7, a0Var2.a()));
        }
        long f8 = f(this.f23491b, z6);
        int e8 = this.f23491b.e() - e7;
        this.f23491b.O(e7);
        this.f23495f.d(this.f23491b, e8);
        this.f23502m += e8;
        if (f8 != -1) {
            l();
            this.f23502m = 0;
            this.f23503n = f8;
        }
        if (this.f23491b.a() < 16) {
            int a7 = this.f23491b.a();
            System.arraycopy(this.f23491b.d(), this.f23491b.e(), this.f23491b.d(), 0, a7);
            this.f23491b.O(0);
            this.f23491b.N(a7);
        }
        return 0;
    }

    private void n(m mVar) {
        this.f23497h = t.d(mVar, !this.f23492c);
        this.f23496g = 1;
    }

    private void o(m mVar) {
        t.a aVar = new t.a(this.f23498i);
        boolean z6 = false;
        while (!z6) {
            z6 = t.e(mVar, aVar);
            this.f23498i = (v) m0.j(aVar.f22963a);
        }
        o2.a.e(this.f23498i);
        this.f23499j = Math.max(this.f23498i.f22968c, 6);
        ((e0) m0.j(this.f23495f)).e(this.f23498i.g(this.f23490a, this.f23497h));
        this.f23496g = 4;
    }

    private void p(m mVar) {
        t.i(mVar);
        this.f23496g = 3;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        if (j7 == 0) {
            this.f23496g = 0;
        } else {
            b bVar = this.f23501l;
            if (bVar != null) {
                bVar.h(j8);
            }
        }
        this.f23503n = j8 != 0 ? -1L : 0L;
        this.f23502m = 0;
        this.f23491b.K(0);
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f23494e = nVar;
        this.f23495f = nVar.d(0, 1);
        nVar.j();
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        int i7 = this.f23496g;
        if (i7 == 0) {
            n(mVar);
            return 0;
        }
        if (i7 == 1) {
            j(mVar);
            return 0;
        }
        if (i7 == 2) {
            p(mVar);
            return 0;
        }
        if (i7 == 3) {
            o(mVar);
            return 0;
        }
        if (i7 == 4) {
            g(mVar);
            return 0;
        }
        if (i7 == 5) {
            return m(mVar, a0Var);
        }
        throw new IllegalStateException();
    }

    @Override // w0.l
    public boolean h(m mVar) {
        t.c(mVar, false);
        return t.a(mVar);
    }
}
