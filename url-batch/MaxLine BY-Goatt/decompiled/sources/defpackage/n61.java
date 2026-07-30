package defpackage;

import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class n61 implements g61, nz1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(n61.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = hd2.a;
        p = unsafe.objectFieldOffset(n61.class.getDeclaredField("_state$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(n61.class, Object.class, "_parentHandle$volatile");
        o = unsafe.objectFieldOffset(n61.class.getDeclaredField("_parentHandle$volatile"));
    }

    public n61(boolean z) {
        this._state$volatile = z ? j8.m : j8.l;
    }

    public static cu X(xf1 xf1Var) {
        while (xf1Var.n()) {
            xf1Var = xf1Var.m();
        }
        while (true) {
            xf1Var = xf1Var.l();
            if (!xf1Var.n()) {
                if (xf1Var instanceof cu) {
                    return (cu) xf1Var;
                }
                if (xf1Var instanceof ms1) {
                    return null;
                }
            }
        }
    }

    public static String g0(Object obj) {
        if (!(obj instanceof m61)) {
            return obj instanceof v11 ? ((v11) obj).b() ? "Active" : "New" : obj instanceof gx ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
        }
        m61 m61Var = (m61) obj;
        return m61Var.f() ? "Cancelling" : m61.n.get(m61Var) != 0 ? "Completing" : "Active";
    }

    public boolean A(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return u(th) && I();
    }

    public final void D(v11 v11Var, Object obj) {
        bu N = N();
        if (N != null) {
            N.a();
            e0(rs1.m);
        }
        hx hxVar = null;
        gx gxVar = obj instanceof gx ? (gx) obj : null;
        Throwable th = gxVar != null ? gxVar.a : null;
        if (v11Var instanceof j61) {
            try {
                ((j61) v11Var).s(th);
                return;
            } catch (Throwable th2) {
                Q(new hx("Exception in completion handler " + v11Var + " for " + this, th2));
                return;
            }
        }
        ms1 d = v11Var.d();
        if (d != null) {
            d.e(new me1(1), 1);
            Object k = d.k();
            k.getClass();
            for (xf1 xf1Var = (xf1) k; !xf1Var.equals(d); xf1Var = xf1Var.l()) {
                if (xf1Var instanceof j61) {
                    try {
                        ((j61) xf1Var).s(th);
                    } catch (Throwable th3) {
                        if (hxVar != null) {
                            wi0.a(hxVar, th3);
                        } else {
                            hxVar = new hx("Exception in completion handler " + xf1Var + " for " + this, th3);
                            Unit unit = Unit.a;
                        }
                    }
                }
            }
            if (hxVar != null) {
                Q(hxVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable E(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        n61 n61Var = (n61) ((nz1) obj);
        Object O = n61Var.O();
        if (O instanceof m61) {
            cancellationException = ((m61) O).e();
        } else if (O instanceof gx) {
            cancellationException = ((gx) O).a;
        } else {
            if (O instanceof v11) {
                dm0.i(O, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new h61("Parent job is ".concat(g0(O)), cancellationException, n61Var) : cancellationException2;
    }

    public final Object F(m61 m61Var, Object obj) {
        m61 m61Var2;
        Throwable th;
        Throwable G;
        n61 n61Var;
        m61 m61Var3;
        gx gxVar = obj instanceof gx ? (gx) obj : null;
        Throwable th2 = gxVar != null ? gxVar.a : null;
        synchronized (m61Var) {
            try {
                m61Var.f();
                ArrayList g = m61Var.g(th2);
                G = G(m61Var, g);
                if (G != null) {
                    try {
                        if (g.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                            int size = g.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = g.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != G && th3 != G && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    wi0.a(G, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        m61Var2 = m61Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                m61Var2 = m61Var;
                th = th5;
            }
        }
        if (G != null && G != th2) {
            obj = new gx(G, false);
        }
        if (G != null && (x(G) || P(G))) {
            obj.getClass();
            gx.b.compareAndSet((gx) obj, 0, 1);
        }
        Z(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        Object w11Var = obj instanceof v11 ? new w11((v11) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = hd2.a;
            long j = p;
            n61Var = this;
            m61Var3 = m61Var;
            if (!unsafe.compareAndSwapObject(n61Var, j, m61Var3, w11Var) && unsafe.getObjectVolatile(n61Var, j) == m61Var3) {
                this = n61Var;
                m61Var = m61Var3;
            }
        }
        n61Var.D(m61Var3, obj);
        return obj;
    }

    public final Throwable G(m61 m61Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (m61Var.f()) {
                return new h61(z(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof sx2) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof sx2)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    public boolean I() {
        return true;
    }

    @Override // defpackage.g61
    public final Object J(r30 r30Var) {
        Object O;
        do {
            O = O();
            if (!(O instanceof v11)) {
                l41.C(r30Var.getContext());
                return Unit.a;
            }
        } while (f0(O) < 0);
        fs fsVar = new fs(1, q41.b(r30Var));
        fsVar.u();
        fsVar.x(new as(2, l41.K(this, true, new ga2(fsVar))));
        Object s = fsVar.s();
        b50 b50Var = b50.m;
        if (s != b50Var) {
            s = Unit.a;
        }
        return s == b50Var ? s : Unit.a;
    }

    public boolean K() {
        return this instanceof dx;
    }

    public final ms1 M(v11 v11Var) {
        ms1 d = v11Var.d();
        if (d != null) {
            return d;
        }
        if (v11Var instanceof vg0) {
            return new ms1();
        }
        if (v11Var instanceof j61) {
            c0((j61) v11Var);
            return null;
        }
        dm0.i(v11Var, "State should have list: ");
        return null;
    }

    public final bu N() {
        n.getClass();
        return (bu) hd2.a.getObjectVolatile(this, o);
    }

    public final Object O() {
        m.getClass();
        return hd2.a.getObjectVolatile(this, p);
    }

    public boolean P(Throwable th) {
        return false;
    }

    public final void R(g61 g61Var) {
        rs1 rs1Var = rs1.m;
        if (g61Var == null) {
            e0(rs1Var);
            return;
        }
        g61Var.start();
        bu s = g61Var.s(this);
        e0(s);
        if (O() instanceof v11) {
            return;
        }
        s.a();
        e0(rs1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ec0 S(boolean z, j61 j61Var) {
        n61 n61Var;
        j61 j61Var2;
        rs1 rs1Var;
        boolean e;
        j61Var.s = this;
        loop0: while (true) {
            Object O = this.O();
            if (O instanceof vg0) {
                vg0 vg0Var = (vg0) O;
                if (vg0Var.m) {
                    while (true) {
                        m.getClass();
                        Unsafe unsafe = hd2.a;
                        long j = p;
                        n61Var = this;
                        j61Var2 = j61Var;
                        if (unsafe.compareAndSwapObject(n61Var, j, O, j61Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(n61Var, j) != O) {
                            break;
                        }
                        this = n61Var;
                        j61Var = j61Var2;
                    }
                } else {
                    n61Var = this;
                    j61Var2 = j61Var;
                    n61Var.b0(vg0Var);
                }
                this = n61Var;
                j61Var = j61Var2;
            } else {
                n61Var = this;
                j61Var2 = j61Var;
                boolean z2 = O instanceof v11;
                rs1Var = rs1.m;
                if (z2) {
                    v11 v11Var = (v11) O;
                    ms1 d = v11Var.d();
                    if (d == null) {
                        n61Var.c0((j61) O);
                    } else {
                        if (j61Var2.r()) {
                            m61 m61Var = v11Var instanceof m61 ? (m61) v11Var : null;
                            Throwable e2 = m61Var != null ? m61Var.e() : null;
                            if (e2 == null) {
                                e = d.e(j61Var2, 5);
                            } else if (z) {
                                j61Var2.s(e2);
                                return rs1Var;
                            }
                        } else {
                            e = d.e(j61Var2, 1);
                        }
                        if (e) {
                            break;
                        }
                    }
                    this = n61Var;
                    j61Var = j61Var2;
                } else if (z) {
                    Object O2 = n61Var.O();
                    gx gxVar = O2 instanceof gx ? (gx) O2 : null;
                    j61Var2.s(gxVar != null ? gxVar.a : null);
                }
            }
        }
        return rs1Var;
    }

    public boolean T() {
        return this instanceof qo;
    }

    public final boolean U(Object obj) {
        Object j0;
        do {
            j0 = j0(O(), obj);
            if (j0 == j8.g) {
                return false;
            }
            if (j0 == j8.h) {
                return true;
            }
        } while (j0 == j8.i);
        k(j0);
        return true;
    }

    public final Object V(Object obj) {
        Object j0;
        do {
            j0 = j0(O(), obj);
            if (j0 == j8.g) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                gx gxVar = obj instanceof gx ? (gx) obj : null;
                throw new IllegalStateException(str, gxVar != null ? gxVar.a : null);
            }
        } while (j0 == j8.i);
        return j0;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final void Y(ms1 ms1Var, Throwable th) {
        ms1Var.e(new me1(4), 4);
        Object k = ms1Var.k();
        k.getClass();
        hx hxVar = null;
        for (xf1 xf1Var = (xf1) k; !xf1Var.equals(ms1Var); xf1Var = xf1Var.l()) {
            if ((xf1Var instanceof j61) && ((j61) xf1Var).r()) {
                try {
                    ((j61) xf1Var).s(th);
                } catch (Throwable th2) {
                    if (hxVar != null) {
                        wi0.a(hxVar, th2);
                    } else {
                        hxVar = new hx("Exception in completion handler " + xf1Var + " for " + this, th2);
                        Unit unit = Unit.a;
                    }
                }
            }
        }
        if (hxVar != null) {
            Q(hxVar);
        }
        x(th);
    }

    @Override // defpackage.g61
    public boolean b() {
        Object O = O();
        return (O instanceof v11) && ((v11) O).b();
    }

    public final void b0(vg0 vg0Var) {
        ms1 ms1Var = new ms1();
        v11 u11Var = vg0Var.m ? ms1Var : new u11(ms1Var);
        while (true) {
            m.getClass();
            Unsafe unsafe = hd2.a;
            long j = p;
            n61 n61Var = this;
            vg0 vg0Var2 = vg0Var;
            if (unsafe.compareAndSwapObject(n61Var, j, vg0Var2, u11Var) || unsafe.getObjectVolatile(n61Var, j) != vg0Var2) {
                return;
            }
            this = n61Var;
            vg0Var = vg0Var2;
        }
    }

    public final void c0(j61 j61Var) {
        j61Var.g(new ms1());
        xf1 l = j61Var.l();
        while (true) {
            m.getClass();
            Unsafe unsafe = hd2.a;
            long j = p;
            n61 n61Var = this;
            j61 j61Var2 = j61Var;
            if (unsafe.compareAndSwapObject(n61Var, j, j61Var2, l) || unsafe.getObjectVolatile(n61Var, j) != j61Var2) {
                return;
            }
            this = n61Var;
            j61Var = j61Var2;
        }
    }

    public final void d0(j61 j61Var) {
        n61 n61Var;
        while (true) {
            Object O = this.O();
            if (!(O instanceof j61)) {
                if (!(O instanceof v11) || ((v11) O).d() == null) {
                    return;
                }
                j61Var.o();
                return;
            }
            if (O != j61Var) {
                return;
            }
            vg0 vg0Var = j8.m;
            while (true) {
                m.getClass();
                Unsafe unsafe = hd2.a;
                long j = p;
                n61Var = this;
                if (unsafe.compareAndSwapObject(n61Var, j, O, vg0Var)) {
                    return;
                }
                if (unsafe.getObjectVolatile(n61Var, j) != O) {
                    break;
                } else {
                    this = n61Var;
                }
            }
            this = n61Var;
        }
    }

    public final void e0(bu buVar) {
        n.getClass();
        hd2.a.putObjectVolatile(this, o, buVar);
    }

    @Override // defpackage.g61, defpackage.gt
    public void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h61(z(), null, this);
        }
        w(cancellationException);
    }

    public final int f0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof vg0;
        long j = p;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
        if (z) {
            if (((vg0) obj).m) {
                return 0;
            }
            vg0 vg0Var = j8.m;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = hd2.a;
                if (unsafe2.compareAndSwapObject(this, p, obj, vg0Var)) {
                    a0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof u11)) {
            return 0;
        }
        ms1 ms1Var = ((u11) obj).m;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = hd2.a;
            if (unsafe.compareAndSwapObject(this, p, obj, ms1Var)) {
                a0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final g getKey() {
        return qb2.U;
    }

    public final boolean h0(v11 v11Var, Object obj) {
        Object w11Var = obj instanceof v11 ? new w11((v11) obj) : obj;
        while (true) {
            m.getClass();
            Unsafe unsafe = hd2.a;
            long j = p;
            n61 n61Var = this;
            v11 v11Var2 = v11Var;
            if (unsafe.compareAndSwapObject(n61Var, j, v11Var2, w11Var)) {
                n61Var.Z(obj);
                n61Var.D(v11Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(n61Var, j) != v11Var2) {
                return false;
            }
            this = n61Var;
            v11Var = v11Var2;
        }
    }

    public final boolean i0(v11 v11Var, Throwable th) {
        ms1 M = M(v11Var);
        if (M == null) {
            return false;
        }
        m61 m61Var = new m61(M, th);
        while (true) {
            m.getClass();
            Unsafe unsafe = hd2.a;
            long j = p;
            n61 n61Var = this;
            v11 v11Var2 = v11Var;
            if (unsafe.compareAndSwapObject(n61Var, j, v11Var2, m61Var)) {
                n61Var.Y(M, th);
                return true;
            }
            if (unsafe.getObjectVolatile(n61Var, j) != v11Var2) {
                return false;
            }
            this = n61Var;
            v11Var = v11Var2;
        }
    }

    public final Object j0(Object obj, Object obj2) {
        if (!(obj instanceof v11)) {
            return j8.g;
        }
        if (((obj instanceof vg0) || (obj instanceof j61)) && !(obj instanceof cu) && !(obj2 instanceof gx)) {
            return h0((v11) obj, obj2) ? obj2 : j8.i;
        }
        v11 v11Var = (v11) obj;
        ms1 M = M(v11Var);
        if (M == null) {
            return j8.i;
        }
        m61 m61Var = v11Var instanceof m61 ? (m61) v11Var : null;
        if (m61Var == null) {
            m61Var = new m61(M, null);
        }
        synchronized (m61Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m61.n;
            if (atomicIntegerFieldUpdater.get(m61Var) != 0) {
                return j8.g;
            }
            atomicIntegerFieldUpdater.set(m61Var, 1);
            if (m61Var != v11Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, v11Var, m61Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != v11Var) {
                        return j8.i;
                    }
                }
            }
            boolean f = m61Var.f();
            gx gxVar = obj2 instanceof gx ? (gx) obj2 : null;
            if (gxVar != null) {
                m61Var.a(gxVar.a);
            }
            Throwable e = f ? null : m61Var.e();
            Unit unit = Unit.a;
            if (e != null) {
                Y(M, e);
            }
            cu X = X(M);
            if (X != null && k0(m61Var, X, obj2)) {
                return j8.h;
            }
            M.e(new me1(2), 2);
            cu X2 = X(M);
            return (X2 == null || !k0(m61Var, X2, obj2)) ? F(m61Var, obj2) : j8.h;
        }
    }

    public final boolean k0(m61 m61Var, cu cuVar, Object obj) {
        while (l41.K(cuVar.t, false, new l61(this, m61Var, cuVar, obj)) == rs1.m) {
            cuVar = X(cuVar);
            if (cuVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        return f.a(this, gVar);
    }

    @Override // defpackage.g61
    public final ec0 o(Function1 function1) {
        return S(true, new b51(function1));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return f.c(this, coroutineContext);
    }

    @Override // defpackage.g61
    public final ec0 q(boolean z, boolean z2, rk rkVar) {
        return S(z2, z ? new a51(rkVar) : new b51(rkVar));
    }

    public void r(Object obj) {
        k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.g61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bu s(n61 n61Var) {
        n61 n61Var2;
        cu cuVar = new cu(n61Var);
        cuVar.s = this;
        loop0: while (true) {
            Object O = this.O();
            if (O instanceof vg0) {
                vg0 vg0Var = (vg0) O;
                if (vg0Var.m) {
                    while (true) {
                        m.getClass();
                        Unsafe unsafe = hd2.a;
                        long j = p;
                        n61Var2 = this;
                        if (unsafe.compareAndSwapObject(n61Var2, j, O, cuVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(n61Var2, j) != O) {
                            break;
                        }
                        this = n61Var2;
                    }
                } else {
                    n61Var2 = this;
                    n61Var2.b0(vg0Var);
                }
                this = n61Var2;
            } else {
                n61Var2 = this;
                boolean z = O instanceof v11;
                rs1 rs1Var = rs1.m;
                if (!z) {
                    Object O2 = n61Var2.O();
                    gx gxVar = O2 instanceof gx ? (gx) O2 : null;
                    cuVar.s(gxVar != null ? gxVar.a : null);
                    return rs1Var;
                }
                ms1 d = ((v11) O).d();
                if (d == null) {
                    n61Var2.c0((j61) O);
                    this = n61Var2;
                } else if (!d.e(cuVar, 7)) {
                    boolean e = d.e(cuVar, 3);
                    Object O3 = n61Var2.O();
                    if (O3 instanceof m61) {
                        r0 = ((m61) O3).e();
                    } else {
                        gx gxVar2 = O3 instanceof gx ? (gx) O3 : null;
                        if (gxVar2 != null) {
                            r0 = gxVar2.a;
                        }
                    }
                    cuVar.s(r0);
                    if (e) {
                        break loop0;
                    }
                    return rs1Var;
                }
            }
        }
    }

    @Override // defpackage.g61
    public final boolean start() {
        int f0;
        do {
            f0 = f0(O());
            if (f0 == 0) {
                return false;
            }
        } while (f0 != 1);
        return true;
    }

    public final Object t(r30 r30Var) {
        Object O;
        do {
            O = O();
            if (!(O instanceof v11)) {
                if (O instanceof gx) {
                    throw ((gx) O).a;
                }
                return j8.Y(O);
            }
        } while (f0(O) < 0);
        k61 k61Var = new k61(q41.b(r30Var), this);
        k61Var.u();
        k61Var.x(new as(2, l41.K(this, true, new fa2(k61Var))));
        Object s = k61Var.s();
        b50 b50Var = b50.m;
        return s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(W() + '{' + g0(O()) + '}');
        sb.append('@');
        sb.append(o70.x(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.j8.h) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(Object obj) {
        ng0 ng0Var;
        Object obj2 = j8.g;
        if (K()) {
            do {
                Object O = O();
                if (O instanceof v11) {
                    if (O instanceof m61) {
                        if (m61.n.get((m61) O) != 0) {
                        }
                    }
                    obj2 = j0(O, new gx(E(obj), false));
                }
                obj2 = j8.g;
                break;
            } while (obj2 == j8.i);
        }
        if (obj2 == j8.g) {
            Throwable th = null;
            while (true) {
                Object O2 = O();
                if (!(O2 instanceof m61)) {
                    if (!(O2 instanceof v11)) {
                        ng0Var = j8.j;
                        break;
                    }
                    if (th == null) {
                        th = E(obj);
                    }
                    v11 v11Var = (v11) O2;
                    if (!v11Var.b()) {
                        Object j0 = j0(O2, new gx(th, false));
                        if (j0 == j8.g) {
                            dm0.i(O2, "Cannot happen in ");
                            return false;
                        }
                        if (j0 != j8.i) {
                            obj2 = j0;
                            break;
                        }
                    } else if (i0(v11Var, th)) {
                        ng0Var = j8.g;
                        break;
                    }
                } else {
                    synchronized (O2) {
                        if (((m61) O2).c() == j8.k) {
                            ng0Var = j8.j;
                        } else {
                            boolean f = ((m61) O2).f();
                            if (th == null) {
                                th = E(obj);
                            }
                            ((m61) O2).a(th);
                            Throwable e = f ? null : ((m61) O2).e();
                            if (e != null) {
                                Y(((m61) O2).m, e);
                            }
                            ng0Var = j8.g;
                        }
                    }
                }
            }
        }
        if (obj2 != j8.g && obj2 != j8.h) {
            if (obj2 == j8.j) {
                return false;
            }
            k(obj2);
            return true;
        }
        return true;
    }

    @Override // defpackage.g61
    public final CancellationException v() {
        CancellationException cancellationException;
        Object O = O();
        if (O instanceof m61) {
            Throwable e = ((m61) O).e();
            if (e == null) {
                dm0.i(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = e instanceof CancellationException ? (CancellationException) e : null;
            return cancellationException == null ? new h61(concat, e, this) : cancellationException;
        }
        if (O instanceof v11) {
            dm0.i(this, "Job is still new or active: ");
            return null;
        }
        if (!(O instanceof gx)) {
            return new h61(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((gx) O).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new h61(z(), th, this) : cancellationException;
    }

    public void w(CancellationException cancellationException) {
        u(cancellationException);
    }

    public final boolean x(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        bu N = N();
        return (N == null || N == rs1.m) ? z : N.c(th) || z;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public String z() {
        return "Job was cancelled";
    }

    public void a0() {
    }

    public void Q(hx hxVar) {
        throw hxVar;
    }

    public void Z(Object obj) {
    }

    public void k(Object obj) {
    }
}
