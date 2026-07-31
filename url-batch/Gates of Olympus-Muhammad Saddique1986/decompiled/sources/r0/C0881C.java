package r0;

import F.C0087c;
import I.C0143d;
import I.C0167p;
import I.C0176u;
import I.InterfaceC0155j;
import S.C0220d;
import android.view.ViewGroup;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import j.C0519A;
import j.C0550x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u0.m1;

/* renamed from: r0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0881C implements InterfaceC0155j {

    /* renamed from: d, reason: collision with root package name */
    public final t0.E f8100d;

    /* renamed from: e, reason: collision with root package name */
    public I.r f8101e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f8102f;

    /* renamed from: g, reason: collision with root package name */
    public int f8103g;

    /* renamed from: h, reason: collision with root package name */
    public int f8104h;

    /* renamed from: q, reason: collision with root package name */
    public int f8113q;

    /* renamed from: r, reason: collision with root package name */
    public int f8114r;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8105i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f8106j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final C0926w f8107k = new C0926w(this);

    /* renamed from: l, reason: collision with root package name */
    public final C0924u f8108l = new C0924u(this);

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f8109m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final C0903Z f8110n = new C0903Z();

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f8111o = new LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final K.d f8112p = new K.d(new Object[16]);

    /* renamed from: s, reason: collision with root package name */
    public final String f8115s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public C0881C(t0.E e3, a0 a0Var) {
        this.f8100d = e3;
        this.f8102f = a0Var;
    }

    public static C0176u i(C0176u c0176u, t0.E e3, boolean z3, I.r rVar, Q.a aVar) {
        if (c0176u == null || c0176u.f2943u) {
            ViewGroup.LayoutParams layoutParams = m1.f9406a;
            c0176u = new C0176u(rVar, new G1.m(e3));
        }
        if (z3) {
            C0167p c0167p = c0176u.f2942t;
            c0167p.f2889y = 100;
            c0167p.f2888x = true;
            c0176u.j(aVar);
            if (c0167p.f2853E || c0167p.f2889y != 100) {
                C0143d.S("Cannot disable reuse from root if it was caused by other groups");
                throw null;
            }
            c0167p.f2889y = -1;
            c0167p.f2888x = false;
        } else {
            c0176u.j(aVar);
        }
        return c0176u;
    }

    @Override // I.InterfaceC0155j
    public final void a() {
        f(true);
    }

    @Override // I.InterfaceC0155j
    public final void b() {
        f(false);
    }

    @Override // I.InterfaceC0155j
    public final void c() {
        t0.E e3 = this.f8100d;
        e3.f8550n = true;
        HashMap hashMap = this.f8105i;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            C0176u c0176u = ((C0923t) it.next()).f8175c;
            if (c0176u != null) {
                c0176u.l();
            }
        }
        e3.N();
        e3.f8550n = false;
        hashMap.clear();
        this.f8106j.clear();
        this.f8114r = 0;
        this.f8113q = 0;
        this.f8109m.clear();
        e();
    }

    public final void d(int i3) {
        boolean z3;
        boolean z4 = false;
        this.f8113q = 0;
        int i4 = (((K.a) this.f8100d.p()).f3208d.f3216f - this.f8114r) - 1;
        if (i3 <= i4) {
            this.f8110n.clear();
            if (i3 <= i4) {
                int i5 = i3;
                while (true) {
                    Object obj = this.f8105i.get((t0.E) ((K.a) this.f8100d.p()).get(i5));
                    f2.j.c(obj);
                    this.f8110n.f8147d.add(((C0923t) obj).f8173a);
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f8102f.e(this.f8110n);
            S.i c2 = S.u.c();
            InterfaceC0424c f3 = c2 != null ? c2.f() : null;
            S.i d3 = S.u.d(c2);
            z3 = false;
            while (i4 >= i3) {
                try {
                    t0.E e3 = (t0.E) ((K.a) this.f8100d.p()).get(i4);
                    Object obj2 = this.f8105i.get(e3);
                    f2.j.c(obj2);
                    C0923t c0923t = (C0923t) obj2;
                    Object obj3 = c0923t.f8173a;
                    if (this.f8110n.f8147d.contains(obj3)) {
                        this.f8113q++;
                        if (((Boolean) c0923t.f8178f.getValue()).booleanValue()) {
                            t0.M m3 = e3.f8562z;
                            m3.f8642r.f8610n = 3;
                            t0.J j3 = m3.f8643s;
                            if (j3 != null) {
                                j3.f8583l = 3;
                            }
                            c0923t.f8178f.setValue(Boolean.FALSE);
                            z3 = true;
                        }
                    } else {
                        t0.E e4 = this.f8100d;
                        e4.f8550n = true;
                        this.f8105i.remove(e3);
                        C0176u c0176u = c0923t.f8175c;
                        if (c0176u != null) {
                            c0176u.l();
                        }
                        this.f8100d.O(i4, 1);
                        e4.f8550n = false;
                    }
                    this.f8106j.remove(obj3);
                    i4--;
                } catch (Throwable th) {
                    S.u.f(c2, d3, f3);
                    throw th;
                }
            }
            S.u.f(c2, d3, f3);
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (S.p.f4241b) {
                C0519A c0519a = ((C0220d) S.p.f4248i.get()).f4204h;
                if (c0519a != null) {
                    if (c0519a.h()) {
                        z4 = true;
                    }
                }
            }
            if (z4) {
                S.p.a();
            }
        }
        e();
    }

    public final void e() {
        int i3 = ((K.a) this.f8100d.p()).f3208d.f3216f;
        HashMap hashMap = this.f8105i;
        if (hashMap.size() != i3) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + i3 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i3 - this.f8113q) - this.f8114r < 0) {
            StringBuilder k3 = A.k.k(i3, "Incorrect state. Total children ", ". Reusable children ");
            k3.append(this.f8113q);
            k3.append(". Precomposed children ");
            k3.append(this.f8114r);
            throw new IllegalArgumentException(k3.toString().toString());
        }
        HashMap hashMap2 = this.f8109m;
        if (hashMap2.size() == this.f8114r) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f8114r + ". Map size " + hashMap2.size()).toString());
    }

    public final void f(boolean z3) {
        this.f8114r = 0;
        this.f8109m.clear();
        t0.E e3 = this.f8100d;
        int i3 = ((K.a) e3.p()).f3208d.f3216f;
        if (this.f8113q != i3) {
            this.f8113q = i3;
            S.i c2 = S.u.c();
            InterfaceC0424c f3 = c2 != null ? c2.f() : null;
            S.i d3 = S.u.d(c2);
            for (int i4 = 0; i4 < i3; i4++) {
                try {
                    t0.E e4 = (t0.E) ((K.a) e3.p()).get(i4);
                    C0923t c0923t = (C0923t) this.f8105i.get(e4);
                    if (c0923t != null && ((Boolean) c0923t.f8178f.getValue()).booleanValue()) {
                        t0.M m3 = e4.f8562z;
                        m3.f8642r.f8610n = 3;
                        t0.J j3 = m3.f8643s;
                        if (j3 != null) {
                            j3.f8583l = 3;
                        }
                        if (z3) {
                            C0176u c0176u = c0923t.f8175c;
                            if (c0176u != null) {
                                c0176u.k();
                            }
                            c0923t.f8178f = C0143d.K(Boolean.FALSE, I.W.f2783i);
                        } else {
                            c0923t.f8178f.setValue(Boolean.FALSE);
                        }
                        c0923t.f8173a = AbstractC0898U.f8139a;
                    }
                } catch (Throwable th) {
                    S.u.f(c2, d3, f3);
                    throw th;
                }
            }
            S.u.f(c2, d3, f3);
            this.f8106j.clear();
        }
        e();
    }

    public final InterfaceC0899V g(Object obj, InterfaceC0426e interfaceC0426e) {
        t0.E e3 = this.f8100d;
        if (!e3.D()) {
            return new C0879A();
        }
        e();
        if (!this.f8106j.containsKey(obj)) {
            this.f8111o.remove(obj);
            HashMap hashMap = this.f8109m;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int k3 = ((K.a) e3.p()).f3208d.k(obj2);
                    int i3 = ((K.a) e3.p()).f3208d.f3216f;
                    e3.f8550n = true;
                    e3.H(k3, i3, 1);
                    e3.f8550n = false;
                    this.f8114r++;
                } else {
                    int i4 = ((K.a) e3.p()).f3208d.f3216f;
                    t0.E e4 = new t0.E(2, 0, true);
                    e3.f8550n = true;
                    e3.x(i4, e4);
                    e3.f8550n = false;
                    this.f8114r++;
                    obj2 = e4;
                }
                hashMap.put(obj, obj2);
            }
            h((t0.E) obj2, obj, interfaceC0426e);
        }
        return new C0880B(this, obj);
    }

    public final void h(t0.E e3, Object obj, InterfaceC0426e interfaceC0426e) {
        boolean z3;
        HashMap hashMap = this.f8105i;
        Object obj2 = hashMap.get(e3);
        Object obj3 = obj2;
        if (obj2 == null) {
            Q.a aVar = AbstractC0911h.f8157a;
            C0923t c0923t = new C0923t();
            c0923t.f8173a = obj;
            c0923t.f8174b = aVar;
            c0923t.f8175c = null;
            c0923t.f8178f = C0143d.K(Boolean.TRUE, I.W.f2783i);
            hashMap.put(e3, c0923t);
            obj3 = c0923t;
        }
        C0923t c0923t2 = (C0923t) obj3;
        C0176u c0176u = c0923t2.f8175c;
        if (c0176u != null) {
            synchronized (c0176u.f2929g) {
                z3 = ((C0550x) c0176u.f2939q.f334d).f6348e > 0;
            }
        } else {
            z3 = true;
        }
        if (c0923t2.f8174b != interfaceC0426e || z3 || c0923t2.f8176d) {
            c0923t2.f8174b = interfaceC0426e;
            S.i c2 = S.u.c();
            InterfaceC0424c f3 = c2 != null ? c2.f() : null;
            S.i d3 = S.u.d(c2);
            try {
                t0.E e4 = this.f8100d;
                e4.f8550n = true;
                InterfaceC0426e interfaceC0426e2 = c0923t2.f8174b;
                C0176u c0176u2 = c0923t2.f8175c;
                I.r rVar = this.f8101e;
                if (rVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                c0923t2.f8175c = i(c0176u2, e3, c0923t2.f8177e, rVar, new Q.a(-1750409193, new C0087c(c0923t2, interfaceC0426e2, 8), true));
                c0923t2.f8177e = false;
                e4.f8550n = false;
                S.u.f(c2, d3, f3);
                c0923t2.f8176d = false;
            } catch (Throwable th) {
                S.u.f(c2, d3, f3);
                throw th;
            }
        }
    }

    public final t0.E j(Object obj) {
        HashMap hashMap;
        int i3;
        if (this.f8113q == 0) {
            return null;
        }
        t0.E e3 = this.f8100d;
        int i4 = ((K.a) e3.p()).f3208d.f3216f - this.f8114r;
        int i5 = i4 - this.f8113q;
        int i6 = i4 - 1;
        int i7 = i6;
        while (true) {
            hashMap = this.f8105i;
            if (i7 < i5) {
                i3 = -1;
                break;
            }
            Object obj2 = hashMap.get((t0.E) ((K.a) e3.p()).get(i7));
            f2.j.c(obj2);
            if (((C0923t) obj2).f8173a.equals(obj)) {
                i3 = i7;
                break;
            }
            i7--;
        }
        if (i3 == -1) {
            while (i6 >= i5) {
                Object obj3 = hashMap.get((t0.E) ((K.a) e3.p()).get(i6));
                f2.j.c(obj3);
                C0923t c0923t = (C0923t) obj3;
                Object obj4 = c0923t.f8173a;
                if (obj4 == AbstractC0898U.f8139a || this.f8102f.d(obj, obj4)) {
                    c0923t.f8173a = obj;
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
            e3.f8550n = true;
            e3.H(i7, i5, 1);
            e3.f8550n = false;
        }
        this.f8113q--;
        t0.E e4 = (t0.E) ((K.a) e3.p()).get(i5);
        Object obj5 = hashMap.get(e4);
        f2.j.c(obj5);
        C0923t c0923t2 = (C0923t) obj5;
        c0923t2.f8178f = C0143d.K(Boolean.TRUE, I.W.f2783i);
        c0923t2.f8177e = true;
        c0923t2.f8176d = true;
        return e4;
    }
}
