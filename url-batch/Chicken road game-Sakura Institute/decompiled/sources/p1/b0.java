package p1;

import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import s1.e3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 implements g0.j {

    /* renamed from: f, reason: collision with root package name */
    public final r1.d0 f7018f;

    /* renamed from: g, reason: collision with root package name */
    public g0.r f7019g;

    /* renamed from: h, reason: collision with root package name */
    public y0 f7020h;

    /* renamed from: i, reason: collision with root package name */
    public int f7021i;

    /* renamed from: j, reason: collision with root package name */
    public int f7022j;

    /* renamed from: s, reason: collision with root package name */
    public int f7031s;

    /* renamed from: t, reason: collision with root package name */
    public int f7032t;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f7023k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7024l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final w f7025m = new w(this);

    /* renamed from: n, reason: collision with root package name */
    public final u f7026n = new u(this);

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f7027o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final x0 f7028p = new x0();

    /* renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f7029q = new LinkedHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final i0.d f7030r = new i0.d(new Object[16]);

    /* renamed from: u, reason: collision with root package name */
    public final String f7033u = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public b0(r1.d0 d0Var, y0 y0Var) {
        this.f7018f = d0Var;
        this.f7020h = y0Var;
    }

    public static g0.u i(g0.u uVar, r1.d0 d0Var, boolean z8, g0.r rVar, o0.a aVar) {
        if (uVar == null || uVar.f3945w) {
            ViewGroup.LayoutParams layoutParams = e3.f8210a;
            uVar = new g0.u(rVar, new b1.b(d0Var));
        }
        if (!z8) {
            uVar.j(aVar);
            return uVar;
        }
        g0.p pVar = uVar.f3944v;
        pVar.f3844y = 100;
        pVar.f3843x = true;
        uVar.j(aVar);
        if (pVar.E || pVar.f3844y != 100) {
            g0.d.R("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        pVar.f3844y = -1;
        pVar.f3843x = false;
        return uVar;
    }

    @Override // g0.j
    public final void a() {
        f(false);
    }

    @Override // g0.j
    public final void b() {
        r1.d0 d0Var = this.f7018f;
        d0Var.f7729p = true;
        HashMap hashMap = this.f7023k;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            g0.u uVar = ((t) it.next()).f7083c;
            if (uVar != null) {
                uVar.l();
            }
        }
        d0Var.N();
        d0Var.f7729p = false;
        hashMap.clear();
        this.f7024l.clear();
        this.f7032t = 0;
        this.f7031s = 0;
        this.f7027o.clear();
        e();
    }

    @Override // g0.j
    public final void c() {
        f(true);
    }

    public final void d(int i7) {
        boolean z8;
        boolean z9 = false;
        this.f7031s = 0;
        int i8 = (((i0.a) this.f7018f.p()).f4834f.f4842h - this.f7032t) - 1;
        if (i7 <= i8) {
            this.f7028p.clear();
            if (i7 <= i8) {
                int i9 = i7;
                while (true) {
                    Object obj = this.f7023k.get((r1.d0) ((i0.a) this.f7018f.p()).get(i9));
                    r6.k.c(obj);
                    this.f7028p.f7111f.add(((t) obj).f7081a);
                    if (i9 == i8) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.f7020h.d(this.f7028p);
            q0.g c4 = q0.r.c();
            q6.c f9 = c4 != null ? c4.f() : null;
            q0.g d8 = q0.r.d(c4);
            z8 = false;
            while (i8 >= i7) {
                try {
                    r1.d0 d0Var = (r1.d0) ((i0.a) this.f7018f.p()).get(i8);
                    Object obj2 = this.f7023k.get(d0Var);
                    r6.k.c(obj2);
                    t tVar = (t) obj2;
                    Object obj3 = tVar.f7081a;
                    if (this.f7028p.f7111f.contains(obj3)) {
                        this.f7031s++;
                        if (((Boolean) tVar.f7086f.getValue()).booleanValue()) {
                            r1.l0 l0Var = d0Var.B;
                            l0Var.f7848r.f7816p = 3;
                            r1.i0 i0Var = l0Var.f7849s;
                            if (i0Var != null) {
                                i0Var.f7789n = 3;
                            }
                            tVar.f7086f.setValue(Boolean.FALSE);
                            z8 = true;
                        }
                    } else {
                        r1.d0 d0Var2 = this.f7018f;
                        d0Var2.f7729p = true;
                        this.f7023k.remove(d0Var);
                        g0.u uVar = tVar.f7083c;
                        if (uVar != null) {
                            uVar.l();
                        }
                        this.f7018f.O(i8, 1);
                        d0Var2.f7729p = false;
                    }
                    this.f7024l.remove(obj3);
                    i8--;
                } catch (Throwable th) {
                    q0.r.f(c4, d8, f9);
                    throw th;
                }
            }
            q0.r.f(c4, d8, f9);
        } else {
            z8 = false;
        }
        if (z8) {
            synchronized (q0.n.f7427b) {
                i.b0 b0Var = ((q0.b) q0.n.f7434i.get()).f7390h;
                if (b0Var != null) {
                    if (b0Var.h()) {
                        z9 = true;
                    }
                }
            }
            if (z9) {
                q0.n.a();
            }
        }
        e();
    }

    public final void e() {
        int i7 = ((i0.a) this.f7018f.p()).f4834f.f4842h;
        HashMap hashMap = this.f7023k;
        if (hashMap.size() != i7) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + i7 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i7 - this.f7031s) - this.f7032t < 0) {
            StringBuilder n8 = a0.m.n(i7, "Incorrect state. Total children ", ". Reusable children ");
            n8.append(this.f7031s);
            n8.append(". Precomposed children ");
            n8.append(this.f7032t);
            throw new IllegalArgumentException(n8.toString().toString());
        }
        HashMap hashMap2 = this.f7027o;
        if (hashMap2.size() == this.f7032t) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f7032t + ". Map size " + hashMap2.size()).toString());
    }

    public final void f(boolean z8) {
        this.f7032t = 0;
        this.f7027o.clear();
        r1.d0 d0Var = this.f7018f;
        int i7 = ((i0.a) d0Var.p()).f4834f.f4842h;
        if (this.f7031s != i7) {
            this.f7031s = i7;
            q0.g c4 = q0.r.c();
            q6.c f9 = c4 != null ? c4.f() : null;
            q0.g d8 = q0.r.d(c4);
            for (int i8 = 0; i8 < i7; i8++) {
                try {
                    r1.d0 d0Var2 = (r1.d0) ((i0.a) d0Var.p()).get(i8);
                    t tVar = (t) this.f7023k.get(d0Var2);
                    if (tVar != null && ((Boolean) tVar.f7086f.getValue()).booleanValue()) {
                        r1.l0 l0Var = d0Var2.B;
                        l0Var.f7848r.f7816p = 3;
                        r1.i0 i0Var = l0Var.f7849s;
                        if (i0Var != null) {
                            i0Var.f7789n = 3;
                        }
                        if (z8) {
                            g0.u uVar = tVar.f7083c;
                            if (uVar != null) {
                                uVar.k();
                            }
                            tVar.f7086f = g0.d.J(Boolean.FALSE, g0.t0.f3903k);
                        } else {
                            tVar.f7086f.setValue(Boolean.FALSE);
                        }
                        tVar.f7081a = s0.f7080a;
                    }
                } catch (Throwable th) {
                    q0.r.f(c4, d8, f9);
                    throw th;
                }
            }
            q0.r.f(c4, d8, f9);
            this.f7024l.clear();
        }
        e();
    }

    public final t0 g(Object obj, q6.e eVar) {
        r1.d0 d0Var = this.f7018f;
        if (!d0Var.E()) {
            return new z();
        }
        e();
        if (!this.f7024l.containsKey(obj)) {
            this.f7029q.remove(obj);
            HashMap hashMap = this.f7027o;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int k8 = ((i0.a) d0Var.p()).f4834f.k(obj2);
                    int i7 = ((i0.a) d0Var.p()).f4834f.f4842h;
                    d0Var.f7729p = true;
                    d0Var.I(k8, i7, 1);
                    d0Var.f7729p = false;
                    this.f7032t++;
                } else {
                    int i8 = ((i0.a) d0Var.p()).f4834f.f4842h;
                    r1.d0 d0Var2 = new r1.d0(2);
                    d0Var.f7729p = true;
                    d0Var.x(i8, d0Var2);
                    d0Var.f7729p = false;
                    this.f7032t++;
                    obj2 = d0Var2;
                }
                hashMap.put(obj, obj2);
            }
            h((r1.d0) obj2, obj, eVar);
        }
        return new a0(this, obj);
    }

    public final void h(r1.d0 d0Var, Object obj, q6.e eVar) {
        boolean z8;
        HashMap hashMap = this.f7023k;
        Object obj2 = hashMap.get(d0Var);
        Object obj3 = obj2;
        if (obj2 == null) {
            o0.a aVar = h.f7044a;
            t tVar = new t();
            tVar.f7081a = obj;
            tVar.f7082b = aVar;
            tVar.f7083c = null;
            tVar.f7086f = g0.d.J(Boolean.TRUE, g0.t0.f3903k);
            hashMap.put(d0Var, tVar);
            obj3 = tVar;
        }
        t tVar2 = (t) obj3;
        g0.u uVar = tVar2.f7083c;
        if (uVar != null) {
            synchronized (uVar.f3931i) {
                z8 = ((i.x) uVar.f3941s.f1394g).f4816e > 0;
            }
        } else {
            z8 = true;
        }
        if (tVar2.f7082b != eVar || z8 || tVar2.f7084d) {
            tVar2.f7082b = eVar;
            q0.g c4 = q0.r.c();
            q6.c f9 = c4 != null ? c4.f() : null;
            q0.g d8 = q0.r.d(c4);
            try {
                r1.d0 d0Var2 = this.f7018f;
                d0Var2.f7729p = true;
                q6.e eVar2 = tVar2.f7082b;
                g0.u uVar2 = tVar2.f7083c;
                g0.r rVar = this.f7019g;
                if (rVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                tVar2.f7083c = i(uVar2, d0Var, tVar2.f7085e, rVar, new o0.a(-1750409193, new d0.b0(tVar2, 10, eVar2), true));
                tVar2.f7085e = false;
                d0Var2.f7729p = false;
                q0.r.f(c4, d8, f9);
                tVar2.f7084d = false;
            } catch (Throwable th) {
                q0.r.f(c4, d8, f9);
                throw th;
            }
        }
    }

    public final r1.d0 j(Object obj) {
        HashMap hashMap;
        int i7;
        if (this.f7031s == 0) {
            return null;
        }
        r1.d0 d0Var = this.f7018f;
        int i8 = ((i0.a) d0Var.p()).f4834f.f4842h - this.f7032t;
        int i9 = i8 - this.f7031s;
        int i10 = i8 - 1;
        int i11 = i10;
        while (true) {
            hashMap = this.f7023k;
            if (i11 < i9) {
                i7 = -1;
                break;
            }
            Object obj2 = hashMap.get((r1.d0) ((i0.a) d0Var.p()).get(i11));
            r6.k.c(obj2);
            if (((t) obj2).f7081a.equals(obj)) {
                i7 = i11;
                break;
            }
            i11--;
        }
        if (i7 == -1) {
            while (i10 >= i9) {
                Object obj3 = hashMap.get((r1.d0) ((i0.a) d0Var.p()).get(i10));
                r6.k.c(obj3);
                t tVar = (t) obj3;
                Object obj4 = tVar.f7081a;
                if (obj4 == s0.f7080a || this.f7020h.a(obj, obj4)) {
                    tVar.f7081a = obj;
                    i11 = i10;
                    i7 = i11;
                    break;
                }
                i10--;
            }
            i11 = i10;
        }
        if (i7 == -1) {
            return null;
        }
        if (i11 != i9) {
            d0Var.f7729p = true;
            d0Var.I(i11, i9, 1);
            d0Var.f7729p = false;
        }
        this.f7031s--;
        r1.d0 d0Var2 = (r1.d0) ((i0.a) d0Var.p()).get(i9);
        Object obj5 = hashMap.get(d0Var2);
        r6.k.c(obj5);
        t tVar2 = (t) obj5;
        tVar2.f7086f = g0.d.J(Boolean.TRUE, g0.t0.f3903k);
        tVar2.f7085e = true;
        tVar2.f7084d = true;
        return d0Var2;
    }
}
