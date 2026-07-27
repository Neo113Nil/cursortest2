package p0;

import A.AbstractC0017m;
import B1.C0097d;
import D.C0120c;
import G.C0192d;
import G.C0216p;
import G.C0225u;
import G.InterfaceC0204j;
import Q.AbstractC0274j;
import Q.C0268d;
import android.view.ViewGroup;
import i.C0661B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s0.n1;

/* renamed from: p0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941B implements InterfaceC0204j {

    /* renamed from: d, reason: collision with root package name */
    public final r0.E f8978d;

    /* renamed from: e, reason: collision with root package name */
    public G.r f8979e;

    /* renamed from: i, reason: collision with root package name */
    public b0 f8980i;

    /* renamed from: j, reason: collision with root package name */
    public int f8981j;

    /* renamed from: k, reason: collision with root package name */
    public int f8982k;

    /* renamed from: t, reason: collision with root package name */
    public int f8991t;

    /* renamed from: u, reason: collision with root package name */
    public int f8992u;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f8983l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f8984m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final C0987w f8985n = new C0987w(this);

    /* renamed from: o, reason: collision with root package name */
    public final C0985u f8986o = new C0985u(this);

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f8987p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final a0 f8988q = new a0();

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashMap f8989r = new LinkedHashMap();

    /* renamed from: s, reason: collision with root package name */
    public final I.d f8990s = new I.d(new Object[16]);

    /* renamed from: v, reason: collision with root package name */
    public final String f8993v = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public C0941B(r0.E e4, b0 b0Var) {
        this.f8978d = e4;
        this.f8980i = b0Var;
    }

    public static C0225u i(C0225u c0225u, r0.E e4, boolean z4, G.r rVar, O.a aVar) {
        if (c0225u == null || c0225u.f2941y) {
            ViewGroup.LayoutParams layoutParams = n1.f10278a;
            c0225u = new C0225u(rVar, new C0097d(e4));
        }
        if (z4) {
            C0216p c0216p = c0225u.f2939w;
            c0216p.f2886y = 100;
            c0216p.f2885x = true;
            c0225u.j(aVar);
            if (c0216p.f2850E || c0216p.f2886y != 100) {
                C0192d.S("Cannot disable reuse from root if it was caused by other groups");
                throw null;
            }
            c0216p.f2886y = -1;
            c0216p.f2885x = false;
        } else {
            c0225u.j(aVar);
        }
        return c0225u;
    }

    @Override // G.InterfaceC0204j
    public final void a() {
        f(true);
    }

    @Override // G.InterfaceC0204j
    public final void b() {
        f(false);
    }

    @Override // G.InterfaceC0204j
    public final void c() {
        r0.E e4 = this.f8978d;
        e4.f9604q = true;
        HashMap hashMap = this.f8983l;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            C0225u c0225u = ((C0984t) it.next()).f9059c;
            if (c0225u != null) {
                c0225u.l();
            }
        }
        e4.M();
        e4.f9604q = false;
        hashMap.clear();
        this.f8984m.clear();
        this.f8992u = 0;
        this.f8991t = 0;
        this.f8987p.clear();
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        if (r2.h() == true) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i2) {
        boolean z4;
        boolean z5 = true;
        this.f8991t = 0;
        int i4 = (((I.a) this.f8978d.p()).f3324d.f3332i - this.f8992u) - 1;
        if (i2 <= i4) {
            this.f8988q.clear();
            if (i2 <= i4) {
                int i5 = i2;
                while (true) {
                    Object obj = this.f8983l.get((r0.E) ((I.a) this.f8978d.p()).get(i5));
                    Intrinsics.c(obj);
                    this.f8988q.f9032d.add(((C0984t) obj).f9057a);
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f8980i.b(this.f8988q);
            AbstractC0274j c4 = Q.w.c();
            Function1 f4 = c4 != null ? c4.f() : null;
            AbstractC0274j d4 = Q.w.d(c4);
            z4 = false;
            while (i4 >= i2) {
                try {
                    r0.E e4 = (r0.E) ((I.a) this.f8978d.p()).get(i4);
                    Object obj2 = this.f8983l.get(e4);
                    Intrinsics.c(obj2);
                    C0984t c0984t = (C0984t) obj2;
                    Object obj3 = c0984t.f9057a;
                    if (this.f8988q.f9032d.contains(obj3)) {
                        this.f8991t++;
                        if (((Boolean) c0984t.f9062f.getValue()).booleanValue()) {
                            r0.L l4 = e4.f9584C;
                            l4.f9691r.f9664q = 3;
                            r0.J j4 = l4.f9692s;
                            if (j4 != null) {
                                j4.f9636o = 3;
                            }
                            c0984t.f9062f.setValue(Boolean.FALSE);
                            z4 = true;
                        }
                    } else {
                        r0.E e5 = this.f8978d;
                        e5.f9604q = true;
                        this.f8983l.remove(e4);
                        C0225u c0225u = c0984t.f9059c;
                        if (c0225u != null) {
                            c0225u.l();
                        }
                        this.f8978d.O(i4, 1);
                        e5.f9604q = false;
                    }
                    this.f8984m.remove(obj3);
                    i4--;
                } catch (Throwable th) {
                    Q.w.f(c4, d4, f4);
                    throw th;
                }
            }
            Unit unit = Unit.f7487a;
            Q.w.f(c4, d4, f4);
        } else {
            z4 = false;
        }
        if (z4) {
            synchronized (Q.q.f3878b) {
                C0661B c0661b = ((C0268d) Q.q.f3885i.get()).f3839h;
                if (c0661b != null) {
                }
                z5 = false;
            }
            if (z5) {
                Q.q.a();
            }
        }
        e();
    }

    public final void e() {
        int i2 = ((I.a) this.f8978d.p()).f3324d.f3332i;
        HashMap hashMap = this.f8983l;
        if (hashMap.size() != i2) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + i2 + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((i2 - this.f8991t) - this.f8992u < 0) {
            StringBuilder o4 = AbstractC0017m.o(i2, "Incorrect state. Total children ", ". Reusable children ");
            o4.append(this.f8991t);
            o4.append(". Precomposed children ");
            o4.append(this.f8992u);
            throw new IllegalArgumentException(o4.toString().toString());
        }
        HashMap hashMap2 = this.f8987p;
        if (hashMap2.size() == this.f8992u) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f8992u + ". Map size " + hashMap2.size()).toString());
    }

    public final void f(boolean z4) {
        this.f8992u = 0;
        this.f8987p.clear();
        r0.E e4 = this.f8978d;
        int i2 = ((I.a) e4.p()).f3324d.f3332i;
        if (this.f8991t != i2) {
            this.f8991t = i2;
            AbstractC0274j c4 = Q.w.c();
            Function1 f4 = c4 != null ? c4.f() : null;
            AbstractC0274j d4 = Q.w.d(c4);
            for (int i4 = 0; i4 < i2; i4++) {
                try {
                    r0.E e5 = (r0.E) ((I.a) e4.p()).get(i4);
                    C0984t c0984t = (C0984t) this.f8983l.get(e5);
                    if (c0984t != null && ((Boolean) c0984t.f9062f.getValue()).booleanValue()) {
                        r0.L l4 = e5.f9584C;
                        l4.f9691r.f9664q = 3;
                        r0.J j4 = l4.f9692s;
                        if (j4 != null) {
                            j4.f9636o = 3;
                        }
                        if (z4) {
                            C0225u c0225u = c0984t.f9059c;
                            if (c0225u != null) {
                                c0225u.k();
                            }
                            c0984t.f9062f = C0192d.K(Boolean.FALSE, G.W.f2779l);
                        } else {
                            c0984t.f9062f.setValue(Boolean.FALSE);
                        }
                        c0984t.f9057a = AbstractC0960V.f9023a;
                    }
                } catch (Throwable th) {
                    Q.w.f(c4, d4, f4);
                    throw th;
                }
            }
            Unit unit = Unit.f7487a;
            Q.w.f(c4, d4, f4);
            this.f8984m.clear();
        }
        e();
    }

    public final InterfaceC0961W g(Object obj, Function2 function2) {
        r0.E e4 = this.f8978d;
        if (!e4.D()) {
            return new C0990z();
        }
        e();
        if (!this.f8984m.containsKey(obj)) {
            this.f8989r.remove(obj);
            HashMap hashMap = this.f8987p;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int j4 = ((I.a) e4.p()).f3324d.j(obj2);
                    int i2 = ((I.a) e4.p()).f3324d.f3332i;
                    e4.f9604q = true;
                    e4.H(j4, i2, 1);
                    e4.f9604q = false;
                    this.f8992u++;
                } else {
                    int i4 = ((I.a) e4.p()).f3324d.f3332i;
                    r0.E e5 = new r0.E(2, 0, true);
                    e4.f9604q = true;
                    e4.x(i4, e5);
                    e4.f9604q = false;
                    this.f8992u++;
                    obj2 = e5;
                }
                hashMap.put(obj, obj2);
            }
            h((r0.E) obj2, obj, function2);
        }
        return new C0940A(this, obj);
    }

    public final void h(r0.E e4, Object obj, Function2 function2) {
        boolean z4;
        HashMap hashMap = this.f8983l;
        Object obj2 = hashMap.get(e4);
        Object obj3 = obj2;
        if (obj2 == null) {
            O.a aVar = AbstractC0972h.f9041a;
            C0984t c0984t = new C0984t();
            c0984t.f9057a = obj;
            c0984t.f9058b = aVar;
            c0984t.f9059c = null;
            c0984t.f9062f = C0192d.K(Boolean.TRUE, G.W.f2779l);
            hashMap.put(e4, c0984t);
            obj3 = c0984t;
        }
        C0984t c0984t2 = (C0984t) obj3;
        C0225u c0225u = c0984t2.f9059c;
        if (c0225u != null) {
            synchronized (c0225u.f2926j) {
                z4 = ((i.y) c0225u.f2936t.f11388d).f6986e > 0;
            }
        } else {
            z4 = true;
        }
        if (c0984t2.f9058b != function2 || z4 || c0984t2.f9060d) {
            c0984t2.f9058b = function2;
            AbstractC0274j c4 = Q.w.c();
            Function1 f4 = c4 != null ? c4.f() : null;
            AbstractC0274j d4 = Q.w.d(c4);
            try {
                r0.E e5 = this.f8978d;
                e5.f9604q = true;
                Function2 function22 = c0984t2.f9058b;
                C0225u c0225u2 = c0984t2.f9059c;
                G.r rVar = this.f8979e;
                if (rVar == null) {
                    throw new IllegalStateException("parent composition reference not set");
                }
                c0984t2.f9059c = i(c0225u2, e4, c0984t2.f9061e, rVar, new O.a(-1750409193, true, new C0120c(c0984t2, function22, 9)));
                c0984t2.f9061e = false;
                e5.f9604q = false;
                Unit unit = Unit.f7487a;
                Q.w.f(c4, d4, f4);
                c0984t2.f9060d = false;
            } catch (Throwable th) {
                Q.w.f(c4, d4, f4);
                throw th;
            }
        }
    }

    public final r0.E j(Object obj) {
        HashMap hashMap;
        int i2;
        if (this.f8991t == 0) {
            return null;
        }
        r0.E e4 = this.f8978d;
        int i4 = ((I.a) e4.p()).f3324d.f3332i - this.f8992u;
        int i5 = i4 - this.f8991t;
        int i6 = i4 - 1;
        int i7 = i6;
        while (true) {
            hashMap = this.f8983l;
            if (i7 < i5) {
                i2 = -1;
                break;
            }
            Object obj2 = hashMap.get((r0.E) ((I.a) e4.p()).get(i7));
            Intrinsics.c(obj2);
            if (((C0984t) obj2).f9057a.equals(obj)) {
                i2 = i7;
                break;
            }
            i7--;
        }
        if (i2 == -1) {
            while (i6 >= i5) {
                Object obj3 = hashMap.get((r0.E) ((I.a) e4.p()).get(i6));
                Intrinsics.c(obj3);
                C0984t c0984t = (C0984t) obj3;
                Object obj4 = c0984t.f9057a;
                if (obj4 == AbstractC0960V.f9023a || this.f8980i.a(obj, obj4)) {
                    c0984t.f9057a = obj;
                    i7 = i6;
                    i2 = i7;
                    break;
                }
                i6--;
            }
            i7 = i6;
        }
        if (i2 == -1) {
            return null;
        }
        if (i7 != i5) {
            e4.f9604q = true;
            e4.H(i7, i5, 1);
            e4.f9604q = false;
        }
        this.f8991t--;
        r0.E e5 = (r0.E) ((I.a) e4.p()).get(i5);
        Object obj5 = hashMap.get(e5);
        Intrinsics.c(obj5);
        C0984t c0984t2 = (C0984t) obj5;
        c0984t2.f9062f = C0192d.K(Boolean.TRUE, G.W.f2779l);
        c0984t2.f9061e = true;
        c0984t2.f9060d = true;
        return e5;
    }
}
