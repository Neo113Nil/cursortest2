package q0;

import T.C0107z;
import a.AbstractC0124a;
import android.util.Pair;

/* renamed from: q0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381x extends l0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15080l;

    /* renamed from: m, reason: collision with root package name */
    public final T.S f15081m;
    public final T.Q n;
    public C1379v o;

    /* renamed from: p, reason: collision with root package name */
    public C1378u f15082p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15083q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15084r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15085s;

    public C1381x(AbstractC1359a abstractC1359a, boolean z) {
        super(abstractC1359a);
        this.f15080l = z && abstractC1359a.j();
        this.f15081m = new T.S();
        this.n = new T.Q();
        T.T h2 = abstractC1359a.h();
        if (h2 == null) {
            this.o = new C1379v(new C1380w(abstractC1359a.i()), T.S.f2688q, C1379v.f15076e);
        } else {
            this.o = new C1379v(h2, null, null);
            this.f15085s = true;
        }
    }

    @Override // q0.l0
    public final C1353B C(C1353B c1353b) {
        Object obj = c1353b.f14812a;
        Object obj2 = this.o.f15078d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C1379v.f15076e;
        }
        return c1353b.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // q0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(T.T t4) {
        long j4;
        C1379v c1379v;
        C1378u c1378u;
        Object obj;
        C1353B a3;
        C1379v c1379v2;
        if (this.f15084r) {
            C1379v c1379v3 = this.o;
            this.o = new C1379v(t4, c1379v3.f15077c, c1379v3.f15078d);
            C1378u c1378u2 = this.f15082p;
            if (c1378u2 != null) {
                H(c1378u2.f15075g);
            }
        } else if (t4.p()) {
            if (this.f15085s) {
                C1379v c1379v4 = this.o;
                c1379v2 = new C1379v(t4, c1379v4.f15077c, c1379v4.f15078d);
            } else {
                c1379v2 = new C1379v(t4, T.S.f2688q, C1379v.f15076e);
            }
            this.o = c1379v2;
        } else {
            T.S s4 = this.f15081m;
            t4.n(0, s4);
            long j5 = s4.f2701l;
            Object obj2 = s4.f2690a;
            C1378u c1378u3 = this.f15082p;
            if (c1378u3 != null) {
                long j6 = c1378u3.f15070b;
                C1379v c1379v5 = this.o;
                Object obj3 = c1378u3.f15069a.f14812a;
                T.Q q4 = this.n;
                c1379v5.g(obj3, q4);
                long j7 = q4.f2685e + j6;
                this.o.m(0, s4, 0L);
                if (j7 != s4.f2701l) {
                    j4 = j7;
                    Pair i4 = t4.i(this.f15081m, this.n, 0, j4);
                    Object obj4 = i4.first;
                    long longValue = ((Long) i4.second).longValue();
                    if (this.f15085s) {
                        c1379v = new C1379v(t4, obj2, obj4);
                    } else {
                        C1379v c1379v6 = this.o;
                        c1379v = new C1379v(t4, c1379v6.f15077c, c1379v6.f15078d);
                    }
                    this.o = c1379v;
                    c1378u = this.f15082p;
                    if (c1378u != null && H(longValue)) {
                        C1353B c1353b = c1378u.f15069a;
                        obj = c1353b.f14812a;
                        if (this.o.f15078d != null && obj.equals(C1379v.f15076e)) {
                            obj = this.o.f15078d;
                        }
                        a3 = c1353b.a(obj);
                        this.f15085s = true;
                        this.f15084r = true;
                        q(this.o);
                        if (a3 != null) {
                            C1378u c1378u4 = this.f15082p;
                            c1378u4.getClass();
                            c1378u4.a(a3);
                            return;
                        }
                        return;
                    }
                }
            }
            j4 = j5;
            Pair i42 = t4.i(this.f15081m, this.n, 0, j4);
            Object obj42 = i42.first;
            long longValue2 = ((Long) i42.second).longValue();
            if (this.f15085s) {
            }
            this.o = c1379v;
            c1378u = this.f15082p;
            if (c1378u != null) {
                C1353B c1353b2 = c1378u.f15069a;
                obj = c1353b2.f14812a;
                if (this.o.f15078d != null) {
                    obj = this.o.f15078d;
                }
                a3 = c1353b2.a(obj);
                this.f15085s = true;
                this.f15084r = true;
                q(this.o);
                if (a3 != null) {
                }
            }
        }
        a3 = null;
        this.f15085s = true;
        this.f15084r = true;
        q(this.o);
        if (a3 != null) {
        }
    }

    @Override // q0.l0
    public final void F() {
        if (this.f15080l) {
            return;
        }
        this.f15083q = true;
        E();
    }

    @Override // q0.AbstractC1359a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final C1378u b(C1353B c1353b, B1.j jVar, long j4) {
        C1378u c1378u = new C1378u(c1353b, jVar, j4);
        AbstractC0124a.t(c1378u.f15072d == null);
        c1378u.f15072d = this.f15044k;
        if (!this.f15084r) {
            this.f15082p = c1378u;
            if (!this.f15083q) {
                this.f15083q = true;
                E();
            }
            return c1378u;
        }
        Object obj = c1353b.f14812a;
        if (this.o.f15078d != null && obj.equals(C1379v.f15076e)) {
            obj = this.o.f15078d;
        }
        c1378u.a(c1353b.a(obj));
        return c1378u;
    }

    public final boolean H(long j4) {
        C1378u c1378u = this.f15082p;
        int b4 = this.o.b(c1378u.f15069a.f14812a);
        if (b4 == -1) {
            return false;
        }
        C1379v c1379v = this.o;
        T.Q q4 = this.n;
        c1379v.f(b4, q4, false);
        long j5 = q4.f2684d;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        c1378u.f15075g = j4;
        return true;
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        C1378u c1378u = (C1378u) interfaceC1383z;
        if (c1378u.f15073e != null) {
            AbstractC1359a abstractC1359a = c1378u.f15072d;
            abstractC1359a.getClass();
            abstractC1359a.r(c1378u.f15073e);
        }
        if (interfaceC1383z == this.f15082p) {
            this.f15082p = null;
        }
    }

    @Override // q0.AbstractC1370l, q0.AbstractC1359a
    public final void t() {
        this.f15084r = false;
        this.f15083q = false;
        super.t();
    }

    @Override // q0.l0, q0.AbstractC1359a
    public final void w(C0107z c0107z) {
        if (this.f15085s) {
            C1379v c1379v = this.o;
            T.T t4 = c1379v.f15061b;
            this.o = new C1379v(t4 instanceof i0 ? new i0(((i0) t4).f15061b, c0107z) : new i0(t4, c0107z), c1379v.f15077c, c1379v.f15078d);
        } else {
            this.o = new C1379v(new C1380w(c0107z), T.S.f2688q, C1379v.f15076e);
        }
        this.f15044k.w(c0107z);
    }
}
