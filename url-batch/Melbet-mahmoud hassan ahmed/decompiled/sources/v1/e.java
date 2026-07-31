package v1;

import android.util.SparseArray;
import java.util.List;
import o2.m0;
import o2.v;
import r0.s1;
import s0.u1;
import v1.g;
import w0.a0;
import w0.b0;
import w0.d0;
import w0.e0;

/* loaded from: classes.dex */
public final class e implements w0.n, g {

    /* renamed from: o, reason: collision with root package name */
    public static final g.a f22729o = new g.a() { // from class: v1.d
        @Override // v1.g.a
        public final g a(int i7, s1 s1Var, boolean z6, List list, e0 e0Var, u1 u1Var) {
            g h7;
            h7 = e.h(i7, s1Var, z6, list, e0Var, u1Var);
            return h7;
        }
    };

    /* renamed from: p, reason: collision with root package name */
    private static final a0 f22730p = new a0();

    /* renamed from: f, reason: collision with root package name */
    private final w0.l f22731f;

    /* renamed from: g, reason: collision with root package name */
    private final int f22732g;

    /* renamed from: h, reason: collision with root package name */
    private final s1 f22733h;

    /* renamed from: i, reason: collision with root package name */
    private final SparseArray<a> f22734i = new SparseArray<>();

    /* renamed from: j, reason: collision with root package name */
    private boolean f22735j;

    /* renamed from: k, reason: collision with root package name */
    private g.b f22736k;

    /* renamed from: l, reason: collision with root package name */
    private long f22737l;

    /* renamed from: m, reason: collision with root package name */
    private b0 f22738m;

    /* renamed from: n, reason: collision with root package name */
    private s1[] f22739n;

    private static final class a implements e0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f22740a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22741b;

        /* renamed from: c, reason: collision with root package name */
        private final s1 f22742c;

        /* renamed from: d, reason: collision with root package name */
        private final w0.k f22743d = new w0.k();

        /* renamed from: e, reason: collision with root package name */
        public s1 f22744e;

        /* renamed from: f, reason: collision with root package name */
        private e0 f22745f;

        /* renamed from: g, reason: collision with root package name */
        private long f22746g;

        public a(int i7, int i8, s1 s1Var) {
            this.f22740a = i7;
            this.f22741b = i8;
            this.f22742c = s1Var;
        }

        @Override // w0.e0
        public /* synthetic */ int a(n2.i iVar, int i7, boolean z6) {
            return d0.a(this, iVar, i7, z6);
        }

        @Override // w0.e0
        public void b(long j7, int i7, int i8, int i9, e0.a aVar) {
            long j8 = this.f22746g;
            if (j8 != -9223372036854775807L && j7 >= j8) {
                this.f22745f = this.f22743d;
            }
            ((e0) m0.j(this.f22745f)).b(j7, i7, i8, i9, aVar);
        }

        @Override // w0.e0
        public void c(o2.a0 a0Var, int i7, int i8) {
            ((e0) m0.j(this.f22745f)).d(a0Var, i7);
        }

        @Override // w0.e0
        public /* synthetic */ void d(o2.a0 a0Var, int i7) {
            d0.b(this, a0Var, i7);
        }

        @Override // w0.e0
        public void e(s1 s1Var) {
            s1 s1Var2 = this.f22742c;
            if (s1Var2 != null) {
                s1Var = s1Var.j(s1Var2);
            }
            this.f22744e = s1Var;
            ((e0) m0.j(this.f22745f)).e(this.f22744e);
        }

        @Override // w0.e0
        public int f(n2.i iVar, int i7, boolean z6, int i8) {
            return ((e0) m0.j(this.f22745f)).a(iVar, i7, z6);
        }

        public void g(g.b bVar, long j7) {
            if (bVar == null) {
                this.f22745f = this.f22743d;
                return;
            }
            this.f22746g = j7;
            e0 d7 = bVar.d(this.f22740a, this.f22741b);
            this.f22745f = d7;
            s1 s1Var = this.f22744e;
            if (s1Var != null) {
                d7.e(s1Var);
            }
        }
    }

    public e(w0.l lVar, int i7, s1 s1Var) {
        this.f22731f = lVar;
        this.f22732g = i7;
        this.f22733h = s1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g h(int i7, s1 s1Var, boolean z6, List list, e0 e0Var, u1 u1Var) {
        w0.l gVar;
        String str = s1Var.f20955p;
        if (v.r(str)) {
            return null;
        }
        if (v.q(str)) {
            gVar = new c1.e(1);
        } else {
            gVar = new e1.g(z6 ? 4 : 0, null, null, list, e0Var);
        }
        return new e(gVar, i7, s1Var);
    }

    @Override // v1.g
    public void a() {
        this.f22731f.a();
    }

    @Override // v1.g
    public boolean b(w0.m mVar) {
        int e7 = this.f22731f.e(mVar, f22730p);
        o2.a.f(e7 != 1);
        return e7 == 0;
    }

    @Override // v1.g
    public void c(g.b bVar, long j7, long j8) {
        this.f22736k = bVar;
        this.f22737l = j8;
        if (!this.f22735j) {
            this.f22731f.d(this);
            if (j7 != -9223372036854775807L) {
                this.f22731f.b(0L, j7);
            }
            this.f22735j = true;
            return;
        }
        w0.l lVar = this.f22731f;
        if (j7 == -9223372036854775807L) {
            j7 = 0;
        }
        lVar.b(0L, j7);
        for (int i7 = 0; i7 < this.f22734i.size(); i7++) {
            this.f22734i.valueAt(i7).g(bVar, j8);
        }
    }

    @Override // w0.n
    public e0 d(int i7, int i8) {
        a aVar = this.f22734i.get(i7);
        if (aVar == null) {
            o2.a.f(this.f22739n == null);
            aVar = new a(i7, i8, i8 == this.f22732g ? this.f22733h : null);
            aVar.g(this.f22736k, this.f22737l);
            this.f22734i.put(i7, aVar);
        }
        return aVar;
    }

    @Override // v1.g
    public w0.d e() {
        b0 b0Var = this.f22738m;
        if (b0Var instanceof w0.d) {
            return (w0.d) b0Var;
        }
        return null;
    }

    @Override // v1.g
    public s1[] f() {
        return this.f22739n;
    }

    @Override // w0.n
    public void i(b0 b0Var) {
        this.f22738m = b0Var;
    }

    @Override // w0.n
    public void j() {
        s1[] s1VarArr = new s1[this.f22734i.size()];
        for (int i7 = 0; i7 < this.f22734i.size(); i7++) {
            s1VarArr[i7] = (s1) o2.a.h(this.f22734i.valueAt(i7).f22744e);
        }
        this.f22739n = s1VarArr;
    }
}
