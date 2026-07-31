package r0;

import D1.C0014b;
import F.C0060q;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0113p;
import I.C0122u;
import I.InterfaceC0101j;
import I.X;
import android.view.ViewGroup;
import j.C0475A;
import j.C0506x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u0.b1;

/* loaded from: classes.dex */
public final class w implements InterfaceC0101j {

    /* renamed from: d, reason: collision with root package name */
    public final t0.D f7178d;

    /* renamed from: e, reason: collision with root package name */
    public I.r f7179e;

    /* renamed from: f, reason: collision with root package name */
    public T f7180f;

    /* renamed from: g, reason: collision with root package name */
    public int f7181g;

    /* renamed from: h, reason: collision with root package name */
    public int f7182h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7183i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f7184j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final r f7185k = new r(this);

    /* renamed from: l, reason: collision with root package name */
    public final C0843p f7186l = new C0843p(this);

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f7187m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final S f7188n = new S();

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f7189o = new LinkedHashMap();
    public final K.d p = new K.d(new Object[16]);

    /* renamed from: q, reason: collision with root package name */
    public int f7190q;

    /* renamed from: r, reason: collision with root package name */
    public int f7191r;

    public w(t0.D d3, T t3) {
        this.f7178d = d3;
        this.f7180f = t3;
    }

    public static C0122u i(C0122u c0122u, t0.D d3, boolean z3, I.r rVar, Q.a aVar) {
        if (c0122u == null || c0122u.f2383u) {
            ViewGroup.LayoutParams layoutParams = b1.f8310a;
            c0122u = new C0122u(rVar, new C0014b(d3));
        }
        if (z3) {
            C0113p c0113p = c0122u.f2382t;
            c0113p.f2330y = 100;
            c0113p.f2329x = true;
            c0122u.j(aVar);
            if (c0113p.f2295E || c0113p.f2330y != 100) {
                C0089d.R("Cannot disable reuse from root if it was caused by other groups");
                throw null;
            }
            c0113p.f2330y = -1;
            c0113p.f2329x = false;
        } else {
            c0122u.j(aVar);
        }
        return c0122u;
    }

    @Override // I.InterfaceC0101j
    public final void a() {
        f(true);
    }

    @Override // I.InterfaceC0101j
    public final void b() {
        f(false);
    }

    @Override // I.InterfaceC0101j
    public final void c() {
        t0.D d3 = this.f7178d;
        d3.f7726n = true;
        HashMap hashMap = this.f7183i;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            C0122u c0122u = ((C0842o) it.next()).f7153c;
            if (c0122u != null) {
                c0122u.l();
            }
        }
        d3.L();
        d3.f7726n = false;
        hashMap.clear();
        this.f7184j.clear();
        this.f7191r = 0;
        this.f7190q = 0;
        this.f7187m.clear();
        e();
    }

    public final void d(int i3) {
        boolean z3;
        boolean z4 = false;
        this.f7190q = 0;
        int i4 = (((K.a) this.f7178d.o()).f2634d.f2642f - this.f7191r) - 1;
        if (i3 <= i4) {
            this.f7188n.clear();
            if (i3 <= i4) {
                int i5 = i3;
                while (true) {
                    Object obj = this.f7183i.get((t0.D) ((K.a) this.f7178d.o()).get(i5));
                    Z1.i.c(obj);
                    this.f7188n.f7135d.add(((C0842o) obj).f7151a);
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f7180f.f(this.f7188n);
            S.i c3 = S.u.c();
            Y1.c f3 = c3 != null ? c3.f() : null;
            S.i d3 = S.u.d(c3);
            z3 = false;
            while (i4 >= i3) {
                try {
                    t0.D d4 = (t0.D) ((K.a) this.f7178d.o()).get(i4);
                    Object obj2 = this.f7183i.get(d4);
                    Z1.i.c(obj2);
                    C0842o c0842o = (C0842o) obj2;
                    Object obj3 = c0842o.f7151a;
                    if (this.f7188n.f7135d.contains(obj3)) {
                        this.f7190q++;
                        if (((Boolean) c0842o.f7156f.getValue()).booleanValue()) {
                            t0.L l3 = d4.f7736y;
                            l3.f7813r.f7783n = 3;
                            t0.I i6 = l3.f7814s;
                            if (i6 != null) {
                                i6.f7758l = 3;
                            }
                            c0842o.f7156f.setValue(Boolean.FALSE);
                            z3 = true;
                        }
                    } else {
                        t0.D d5 = this.f7178d;
                        d5.f7726n = true;
                        this.f7183i.remove(d4);
                        C0122u c0122u = c0842o.f7153c;
                        if (c0122u != null) {
                            c0122u.l();
                        }
                        this.f7178d.M(i4, 1);
                        d5.f7726n = false;
                    }
                    this.f7184j.remove(obj3);
                    i4--;
                } catch (Throwable th) {
                    S.u.f(c3, d3, f3);
                    throw th;
                }
            }
            S.u.f(c3, d3, f3);
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (S.q.f3235b) {
                C0475A c0475a = ((S.d) S.q.f3242i.get()).f3197h;
                if (c0475a != null) {
                    if (c0475a.h()) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                S.q.a();
            }
        }
        e();
    }

    public final void e() {
        int i3 = ((K.a) this.f7178d.o()).f2634d.f2642f;
        HashMap hashMap = this.f7183i;
        if (hashMap.size() != i3) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + i3 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i3 - this.f7190q) - this.f7191r < 0) {
            StringBuilder l3 = AbstractC0080b.l("Incorrect state. Total children ", i3, ". Reusable children ");
            l3.append(this.f7190q);
            l3.append(". Precomposed children ");
            l3.append(this.f7191r);
            throw new IllegalArgumentException(l3.toString().toString());
        }
        HashMap hashMap2 = this.f7187m;
        if (hashMap2.size() == this.f7191r) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f7191r + ". Map size " + hashMap2.size()).toString());
    }

    public final void f(boolean z3) {
        this.f7191r = 0;
        this.f7187m.clear();
        t0.D d3 = this.f7178d;
        int i3 = ((K.a) d3.o()).f2634d.f2642f;
        if (this.f7190q != i3) {
            this.f7190q = i3;
            S.i c3 = S.u.c();
            Y1.c f3 = c3 != null ? c3.f() : null;
            S.i d4 = S.u.d(c3);
            for (int i4 = 0; i4 < i3; i4++) {
                try {
                    t0.D d5 = (t0.D) ((K.a) d3.o()).get(i4);
                    C0842o c0842o = (C0842o) this.f7183i.get(d5);
                    if (c0842o != null && ((Boolean) c0842o.f7156f.getValue()).booleanValue()) {
                        t0.L l3 = d5.f7736y;
                        l3.f7813r.f7783n = 3;
                        t0.I i5 = l3.f7814s;
                        if (i5 != null) {
                            i5.f7758l = 3;
                        }
                        if (z3) {
                            C0122u c0122u = c0842o.f7153c;
                            if (c0122u != null) {
                                c0122u.k();
                            }
                            c0842o.f7156f = C0089d.J(Boolean.FALSE, X.f2228i);
                        } else {
                            c0842o.f7156f.setValue(Boolean.FALSE);
                        }
                        c0842o.f7151a = M.f7127a;
                    }
                } catch (Throwable th) {
                    S.u.f(c3, d4, f3);
                    throw th;
                }
            }
            S.u.f(c3, d4, f3);
            this.f7184j.clear();
        }
        e();
    }

    public final N g(Object obj, Y1.e eVar) {
        t0.D d3 = this.f7178d;
        if (!d3.B()) {
            return new u();
        }
        e();
        if (!this.f7184j.containsKey(obj)) {
            this.f7189o.remove(obj);
            HashMap hashMap = this.f7187m;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int k3 = ((K.a) d3.o()).f2634d.k(obj2);
                    int i3 = ((K.a) d3.o()).f2634d.f2642f;
                    d3.f7726n = true;
                    d3.F(k3, i3, 1);
                    d3.f7726n = false;
                    this.f7191r++;
                } else {
                    int i4 = ((K.a) d3.o()).f2634d.f2642f;
                    t0.D d4 = new t0.D(2, 0, true);
                    d3.f7726n = true;
                    d3.v(i4, d4);
                    d3.f7726n = false;
                    this.f7191r++;
                    obj2 = d4;
                }
                hashMap.put(obj, obj2);
            }
            h((t0.D) obj2, obj, eVar);
        }
        return new v(this, obj);
    }

    public final void h(t0.D d3, Object obj, Y1.e eVar) {
        boolean z3;
        HashMap hashMap = this.f7183i;
        Object obj2 = hashMap.get(d3);
        Object obj3 = obj2;
        if (obj2 == null) {
            Q.a aVar = AbstractC0835h.f7145a;
            C0842o c0842o = new C0842o();
            c0842o.f7151a = obj;
            c0842o.f7152b = aVar;
            c0842o.f7153c = null;
            c0842o.f7156f = C0089d.J(Boolean.TRUE, X.f2228i);
            hashMap.put(d3, c0842o);
            obj3 = c0842o;
        }
        C0842o c0842o2 = (C0842o) obj3;
        C0122u c0122u = c0842o2.f7153c;
        if (c0122u != null) {
            synchronized (c0122u.f2370g) {
                z3 = ((C0506x) c0122u.f2379q.f83b).f5230e > 0;
            }
        } else {
            z3 = true;
        }
        if (c0842o2.f7152b != eVar || z3 || c0842o2.f7154d) {
            c0842o2.f7152b = eVar;
            S.i c3 = S.u.c();
            Y1.c f3 = c3 != null ? c3.f() : null;
            S.i d4 = S.u.d(c3);
            try {
                t0.D d5 = this.f7178d;
                d5.f7726n = true;
                Y1.e eVar2 = c0842o2.f7152b;
                C0122u c0122u2 = c0842o2.f7153c;
                I.r rVar = this.f7179e;
                if (rVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                c0842o2.f7153c = i(c0122u2, d3, c0842o2.f7155e, rVar, new Q.a(-1750409193, new C0060q(c0842o2, 5, eVar2), true));
                c0842o2.f7155e = false;
                d5.f7726n = false;
                S.u.f(c3, d4, f3);
                c0842o2.f7154d = false;
            } catch (Throwable th) {
                S.u.f(c3, d4, f3);
                throw th;
            }
        }
    }

    public final t0.D j(Object obj) {
        HashMap hashMap;
        int i3;
        if (this.f7190q == 0) {
            return null;
        }
        t0.D d3 = this.f7178d;
        int i4 = ((K.a) d3.o()).f2634d.f2642f - this.f7191r;
        int i5 = i4 - this.f7190q;
        int i6 = i4 - 1;
        int i7 = i6;
        while (true) {
            hashMap = this.f7183i;
            if (i7 < i5) {
                i3 = -1;
                break;
            }
            Object obj2 = hashMap.get((t0.D) ((K.a) d3.o()).get(i7));
            Z1.i.c(obj2);
            if (Z1.i.a(((C0842o) obj2).f7151a, obj)) {
                i3 = i7;
                break;
            }
            i7--;
        }
        if (i3 == -1) {
            while (i6 >= i5) {
                Object obj3 = hashMap.get((t0.D) ((K.a) d3.o()).get(i6));
                Z1.i.c(obj3);
                C0842o c0842o = (C0842o) obj3;
                Object obj4 = c0842o.f7151a;
                if (obj4 == M.f7127a || this.f7180f.d(obj, obj4)) {
                    c0842o.f7151a = obj;
                    i7 = i6;
                    i3 = i7;
                    break;
                }
                i6--;
            }
            i7 = i6;
        }
        if (i3 == -1) {
            return null;
        }
        if (i7 != i5) {
            d3.f7726n = true;
            d3.F(i7, i5, 1);
            d3.f7726n = false;
        }
        this.f7190q--;
        t0.D d4 = (t0.D) ((K.a) d3.o()).get(i5);
        Object obj5 = hashMap.get(d4);
        Z1.i.c(obj5);
        C0842o c0842o2 = (C0842o) obj5;
        c0842o2.f7156f = C0089d.J(Boolean.TRUE, X.f2228i);
        c0842o2.f7155e = true;
        c0842o2.f7154d = true;
        return d4;
    }
}
