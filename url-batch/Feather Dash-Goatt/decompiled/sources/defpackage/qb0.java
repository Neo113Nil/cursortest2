package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class qb0 implements jb0, cv0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(qb0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = n51.a;
        h = unsafe.objectFieldOffset(qb0.class.getDeclaredField("_state$volatile"));
        e = AtomicReferenceFieldUpdater.newUpdater(qb0.class, Object.class, "_parentHandle$volatile");
        g = unsafe.objectFieldOffset(qb0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public qb0(boolean z) {
        this._state$volatile = z ? yr1.o : yr1.n;
    }

    public static ug b0(pi0 pi0Var) {
        while (pi0Var.n()) {
            pi0Var = pi0Var.m();
        }
        while (true) {
            pi0Var = pi0Var.l();
            if (!pi0Var.n()) {
                if (pi0Var instanceof ug) {
                    return (ug) pi0Var;
                }
                if (pi0Var instanceof sp0) {
                    return null;
                }
            }
        }
    }

    public static String k0(Object obj) {
        if (!(obj instanceof pb0)) {
            return obj instanceof n70 ? ((n70) obj).b() ? "Active" : "New" : obj instanceof hj ? "Cancelled" : "Completed";
        }
        pb0 pb0Var = (pb0) obj;
        return pb0Var.f() ? "Cancelling" : pb0.e.get(pb0Var) != 0 ? "Completing" : "Active";
    }

    public void C(Object obj) {
        A(obj);
    }

    public final Object D(fn fnVar) {
        Object R;
        do {
            R = R();
            if (!(R instanceof n70)) {
                if (R instanceof hj) {
                    throw ((hj) R).a;
                }
                return yr1.f0(R);
            }
        } while (j0(R) < 0);
        nb0 nb0Var = new nb0(qa0.b(fnVar), this);
        nb0Var.w();
        nb0Var.z(new pf(2, t80.A(this, true, new l31(nb0Var))));
        Object u = nb0Var.u();
        tn tnVar = tn.d;
        return u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.yr1.j) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(Object obj) {
        fv fvVar;
        Object obj2 = yr1.i;
        if (O()) {
            do {
                Object R = R();
                if (R instanceof n70) {
                    if (R instanceof pb0) {
                        if (pb0.e.get((pb0) R) != 0) {
                        }
                    }
                    obj2 = n0(R, new hj(K(obj), false));
                }
                obj2 = yr1.i;
                break;
            } while (obj2 == yr1.k);
        }
        if (obj2 == yr1.i) {
            Throwable th = null;
            while (true) {
                Object R2 = R();
                if (!(R2 instanceof pb0)) {
                    if (!(R2 instanceof n70)) {
                        fvVar = yr1.l;
                        break;
                    }
                    if (th == null) {
                        th = K(obj);
                    }
                    n70 n70Var = (n70) R2;
                    if (!n70Var.b()) {
                        Object n0 = n0(R2, new hj(th, false));
                        if (n0 == yr1.i) {
                            af.j(R2, "Cannot happen in ");
                            return false;
                        }
                        if (n0 != yr1.k) {
                            obj2 = n0;
                            break;
                        }
                    } else if (m0(n70Var, th)) {
                        fvVar = yr1.i;
                        break;
                    }
                } else {
                    synchronized (R2) {
                        if (((pb0) R2).c() == yr1.m) {
                            fvVar = yr1.l;
                        } else {
                            boolean f = ((pb0) R2).f();
                            if (th == null) {
                                th = K(obj);
                            }
                            ((pb0) R2).a(th);
                            Throwable e2 = f ? null : ((pb0) R2).e();
                            if (e2 != null) {
                                c0(((pb0) R2).d, e2);
                            }
                            fvVar = yr1.i;
                        }
                    }
                }
            }
        }
        if (obj2 != yr1.i && obj2 != yr1.j) {
            if (obj2 == yr1.l) {
                return false;
            }
            A(obj2);
            return true;
        }
        return true;
    }

    public void F(CancellationException cancellationException) {
        E(cancellationException);
    }

    public final boolean G(Throwable th) {
        if (X()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        tg Q = Q();
        return (Q == null || Q == vp0.d) ? z : Q.c(th) || z;
    }

    public String H() {
        return "Job was cancelled";
    }

    public boolean I(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return E(th) && N();
    }

    public final void J(n70 n70Var, Object obj) {
        tg Q = Q();
        if (Q != null) {
            Q.a();
            i0(vp0.d);
        }
        ij ijVar = null;
        hj hjVar = obj instanceof hj ? (hj) obj : null;
        Throwable th = hjVar != null ? hjVar.a : null;
        if (n70Var instanceof mb0) {
            try {
                ((mb0) n70Var).s(th);
                return;
            } catch (Throwable th2) {
                T(new ij("Exception in completion handler " + n70Var + " for " + this, th2));
                return;
            }
        }
        sp0 d2 = n70Var.d();
        if (d2 != null) {
            d2.e(new wh0(1), 1);
            Object k = d2.k();
            k.getClass();
            for (pi0 pi0Var = (pi0) k; !pi0Var.equals(d2); pi0Var = pi0Var.l()) {
                if (pi0Var instanceof mb0) {
                    try {
                        ((mb0) pi0Var).s(th);
                    } catch (Throwable th3) {
                        if (ijVar != null) {
                            lw.a(ijVar, th3);
                        } else {
                            ijVar = new ij("Exception in completion handler " + pi0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (ijVar != null) {
                T(ijVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable K(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        qb0 qb0Var = (qb0) ((cv0) obj);
        Object R = qb0Var.R();
        if (R instanceof pb0) {
            cancellationException = ((pb0) R).e();
        } else if (R instanceof hj) {
            cancellationException = ((hj) R).a;
        } else {
            if (R instanceof n70) {
                af.j(R, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new kb0("Parent job is ".concat(k0(R)), cancellationException, qb0Var) : cancellationException2;
    }

    public final Object L(pb0 pb0Var, Object obj) {
        pb0 pb0Var2;
        Throwable th;
        Throwable M;
        qb0 qb0Var;
        pb0 pb0Var3;
        hj hjVar = obj instanceof hj ? (hj) obj : null;
        Throwable th2 = hjVar != null ? hjVar.a : null;
        synchronized (pb0Var) {
            try {
                pb0Var.f();
                ArrayList g2 = pb0Var.g(th2);
                M = M(pb0Var, g2);
                if (M != null) {
                    try {
                        if (g2.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                            int size = g2.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = g2.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != M && th3 != M && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    lw.a(M, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        pb0Var2 = pb0Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                pb0Var2 = pb0Var;
                th = th5;
            }
        }
        if (M != null && M != th2) {
            obj = new hj(M, false);
        }
        if (M != null && (G(M) || S(M))) {
            obj.getClass();
            hj.b.compareAndSet((hj) obj, 0, 1);
        }
        d0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object o70Var = obj instanceof n70 ? new o70((n70) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = n51.a;
            long j = h;
            qb0Var = this;
            pb0Var3 = pb0Var;
            if (!unsafe.compareAndSwapObject(qb0Var, j, pb0Var3, o70Var) && unsafe.getObjectVolatile(qb0Var, j) == pb0Var3) {
                this = qb0Var;
                pb0Var = pb0Var3;
            }
        }
        qb0Var.J(pb0Var3, obj);
        return obj;
    }

    public final Throwable M(pb0 pb0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (pb0Var.f()) {
                return new kb0(H(), null, this);
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
        if (th2 instanceof mi1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof mi1)) {
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

    public boolean N() {
        return true;
    }

    public boolean O() {
        return this instanceof ej;
    }

    public final sp0 P(n70 n70Var) {
        sp0 d2 = n70Var.d();
        if (d2 != null) {
            return d2;
        }
        if (n70Var instanceof iv) {
            return new sp0();
        }
        if (n70Var instanceof mb0) {
            g0((mb0) n70Var);
            return null;
        }
        af.j(n70Var, "State should have list: ");
        return null;
    }

    public final tg Q() {
        e.getClass();
        return (tg) n51.a.getObjectVolatile(this, g);
    }

    public final Object R() {
        d.getClass();
        return n51.a.getObjectVolatile(this, h);
    }

    public boolean S(Throwable th) {
        return false;
    }

    public final void U(jb0 jb0Var) {
        vp0 vp0Var = vp0.d;
        if (jb0Var == null) {
            i0(vp0Var);
            return;
        }
        jb0Var.start();
        tg k = jb0Var.k(this);
        i0(k);
        if (W()) {
            k.a();
            i0(vp0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rs V(boolean z, mb0 mb0Var) {
        qb0 qb0Var;
        mb0 mb0Var2;
        vp0 vp0Var;
        boolean e2;
        mb0Var.k = this;
        loop0: while (true) {
            Object R = this.R();
            if (R instanceof iv) {
                iv ivVar = (iv) R;
                if (ivVar.d) {
                    while (true) {
                        d.getClass();
                        Unsafe unsafe = n51.a;
                        long j = h;
                        qb0Var = this;
                        mb0Var2 = mb0Var;
                        if (unsafe.compareAndSwapObject(qb0Var, j, R, mb0Var2)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(qb0Var, j) != R) {
                            break;
                        }
                        this = qb0Var;
                        mb0Var = mb0Var2;
                    }
                } else {
                    qb0Var = this;
                    mb0Var2 = mb0Var;
                    qb0Var.f0(ivVar);
                }
                this = qb0Var;
                mb0Var = mb0Var2;
            } else {
                qb0Var = this;
                mb0Var2 = mb0Var;
                boolean z2 = R instanceof n70;
                vp0Var = vp0.d;
                if (z2) {
                    n70 n70Var = (n70) R;
                    sp0 d2 = n70Var.d();
                    if (d2 == null) {
                        qb0Var.g0((mb0) R);
                    } else {
                        if (mb0Var2.r()) {
                            pb0 pb0Var = n70Var instanceof pb0 ? (pb0) n70Var : null;
                            Throwable e3 = pb0Var != null ? pb0Var.e() : null;
                            if (e3 == null) {
                                e2 = d2.e(mb0Var2, 5);
                            } else if (z) {
                                mb0Var2.s(e3);
                                return vp0Var;
                            }
                        } else {
                            e2 = d2.e(mb0Var2, 1);
                        }
                        if (e2) {
                            break;
                        }
                    }
                    this = qb0Var;
                    mb0Var = mb0Var2;
                } else if (z) {
                    Object R2 = qb0Var.R();
                    hj hjVar = R2 instanceof hj ? (hj) R2 : null;
                    mb0Var2.s(hjVar != null ? hjVar.a : null);
                }
            }
        }
        return vp0Var;
    }

    public final boolean W() {
        return !(R() instanceof n70);
    }

    public boolean X() {
        return this instanceof od;
    }

    public final boolean Y(Object obj) {
        Object n0;
        do {
            n0 = n0(R(), obj);
            if (n0 == yr1.i) {
                return false;
            }
            if (n0 == yr1.j) {
                return true;
            }
        } while (n0 == yr1.k);
        A(n0);
        return true;
    }

    public final Object Z(Object obj) {
        Object n0;
        do {
            n0 = n0(R(), obj);
            if (n0 == yr1.i) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                hj hjVar = obj instanceof hj ? (hj) obj : null;
                throw new IllegalStateException(str, hjVar != null ? hjVar.a : null);
            }
        } while (n0 == yr1.k);
        return n0;
    }

    @Override // defpackage.jb0, defpackage.fg
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new kb0(H(), null, this);
        }
        F(cancellationException);
    }

    public String a0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.jb0
    public boolean b() {
        Object R = R();
        return (R instanceof n70) && ((n70) R).b();
    }

    public final void c0(sp0 sp0Var, Throwable th) {
        sp0Var.e(new wh0(4), 4);
        Object k = sp0Var.k();
        k.getClass();
        ij ijVar = null;
        for (pi0 pi0Var = (pi0) k; !pi0Var.equals(sp0Var); pi0Var = pi0Var.l()) {
            if ((pi0Var instanceof mb0) && ((mb0) pi0Var).r()) {
                try {
                    ((mb0) pi0Var).s(th);
                } catch (Throwable th2) {
                    if (ijVar != null) {
                        lw.a(ijVar, th2);
                    } else {
                        ijVar = new ij("Exception in completion handler " + pi0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (ijVar != null) {
            T(ijVar);
        }
        G(th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        return e.a(this, fVar);
    }

    public final void f0(iv ivVar) {
        sp0 sp0Var = new sp0();
        n70 m70Var = ivVar.d ? sp0Var : new m70(sp0Var);
        while (true) {
            d.getClass();
            Unsafe unsafe = n51.a;
            long j = h;
            qb0 qb0Var = this;
            iv ivVar2 = ivVar;
            if (unsafe.compareAndSwapObject(qb0Var, j, ivVar2, m70Var) || unsafe.getObjectVolatile(qb0Var, j) != ivVar2) {
                return;
            }
            this = qb0Var;
            ivVar = ivVar2;
        }
    }

    public final void g0(mb0 mb0Var) {
        mb0Var.g(new sp0());
        pi0 l = mb0Var.l();
        while (true) {
            d.getClass();
            Unsafe unsafe = n51.a;
            long j = h;
            qb0 qb0Var = this;
            mb0 mb0Var2 = mb0Var;
            if (unsafe.compareAndSwapObject(qb0Var, j, mb0Var2, l) || unsafe.getObjectVolatile(qb0Var, j) != mb0Var2) {
                return;
            }
            this = qb0Var;
            mb0Var = mb0Var2;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return j41.m;
    }

    @Override // defpackage.jb0
    public final rs h(Function1 function1) {
        return V(true, new za0(function1));
    }

    public final void h0(mb0 mb0Var) {
        qb0 qb0Var;
        while (true) {
            Object R = this.R();
            if (!(R instanceof mb0)) {
                if (!(R instanceof n70) || ((n70) R).d() == null) {
                    return;
                }
                mb0Var.o();
                return;
            }
            if (R != mb0Var) {
                return;
            }
            iv ivVar = yr1.o;
            while (true) {
                d.getClass();
                Unsafe unsafe = n51.a;
                long j = h;
                qb0Var = this;
                if (unsafe.compareAndSwapObject(qb0Var, j, R, ivVar)) {
                    return;
                }
                if (unsafe.getObjectVolatile(qb0Var, j) != R) {
                    break;
                } else {
                    this = qb0Var;
                }
            }
            this = qb0Var;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    public final void i0(tg tgVar) {
        e.getClass();
        n51.a.putObjectVolatile(this, g, tgVar);
    }

    public final int j0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof iv;
        long j = h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        if (z) {
            if (((iv) obj).d) {
                return 0;
            }
            iv ivVar = yr1.o;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = n51.a;
                if (unsafe2.compareAndSwapObject(this, h, obj, ivVar)) {
                    e0();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof m70)) {
            return 0;
        }
        sp0 sp0Var = ((m70) obj).d;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = n51.a;
            if (unsafe.compareAndSwapObject(this, h, obj, sp0Var)) {
                e0();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.jb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tg k(qb0 qb0Var) {
        qb0 qb0Var2;
        ug ugVar = new ug(qb0Var);
        ugVar.k = this;
        loop0: while (true) {
            Object R = this.R();
            if (R instanceof iv) {
                iv ivVar = (iv) R;
                if (ivVar.d) {
                    while (true) {
                        d.getClass();
                        Unsafe unsafe = n51.a;
                        long j = h;
                        qb0Var2 = this;
                        if (unsafe.compareAndSwapObject(qb0Var2, j, R, ugVar)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(qb0Var2, j) != R) {
                            break;
                        }
                        this = qb0Var2;
                    }
                } else {
                    qb0Var2 = this;
                    qb0Var2.f0(ivVar);
                }
                this = qb0Var2;
            } else {
                qb0Var2 = this;
                boolean z = R instanceof n70;
                vp0 vp0Var = vp0.d;
                if (!z) {
                    Object R2 = qb0Var2.R();
                    hj hjVar = R2 instanceof hj ? (hj) R2 : null;
                    ugVar.s(hjVar != null ? hjVar.a : null);
                    return vp0Var;
                }
                sp0 d2 = ((n70) R).d();
                if (d2 == null) {
                    qb0Var2.g0((mb0) R);
                    this = qb0Var2;
                } else if (!d2.e(ugVar, 7)) {
                    boolean e2 = d2.e(ugVar, 3);
                    Object R3 = qb0Var2.R();
                    if (R3 instanceof pb0) {
                        r0 = ((pb0) R3).e();
                    } else {
                        hj hjVar2 = R3 instanceof hj ? (hj) R3 : null;
                        if (hjVar2 != null) {
                            r0 = hjVar2.a;
                        }
                    }
                    ugVar.s(r0);
                    if (e2) {
                        break loop0;
                    }
                    return vp0Var;
                }
            }
        }
    }

    public final boolean l0(n70 n70Var, Object obj) {
        Object o70Var = obj instanceof n70 ? new o70((n70) obj) : obj;
        while (true) {
            d.getClass();
            Unsafe unsafe = n51.a;
            long j = h;
            qb0 qb0Var = this;
            n70 n70Var2 = n70Var;
            if (unsafe.compareAndSwapObject(qb0Var, j, n70Var2, o70Var)) {
                qb0Var.d0(obj);
                qb0Var.J(n70Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(qb0Var, j) != n70Var2) {
                return false;
            }
            this = qb0Var;
            n70Var = n70Var2;
        }
    }

    public final boolean m0(n70 n70Var, Throwable th) {
        sp0 P = P(n70Var);
        if (P == null) {
            return false;
        }
        pb0 pb0Var = new pb0(P, th);
        while (true) {
            d.getClass();
            Unsafe unsafe = n51.a;
            long j = h;
            qb0 qb0Var = this;
            n70 n70Var2 = n70Var;
            if (unsafe.compareAndSwapObject(qb0Var, j, n70Var2, pb0Var)) {
                qb0Var.c0(P, th);
                return true;
            }
            if (unsafe.getObjectVolatile(qb0Var, j) != n70Var2) {
                return false;
            }
            this = qb0Var;
            n70Var = n70Var2;
        }
    }

    public final Object n0(Object obj, Object obj2) {
        if (!(obj instanceof n70)) {
            return yr1.i;
        }
        if (((obj instanceof iv) || (obj instanceof mb0)) && !(obj instanceof ug) && !(obj2 instanceof hj)) {
            return l0((n70) obj, obj2) ? obj2 : yr1.k;
        }
        n70 n70Var = (n70) obj;
        sp0 P = P(n70Var);
        if (P == null) {
            return yr1.k;
        }
        pb0 pb0Var = n70Var instanceof pb0 ? (pb0) n70Var : null;
        if (pb0Var == null) {
            pb0Var = new pb0(P, null);
        }
        synchronized (pb0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = pb0.e;
            if (atomicIntegerFieldUpdater.get(pb0Var) != 0) {
                return yr1.i;
            }
            atomicIntegerFieldUpdater.set(pb0Var, 1);
            if (pb0Var != n70Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, n70Var, pb0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != n70Var) {
                        return yr1.k;
                    }
                }
            }
            boolean f = pb0Var.f();
            hj hjVar = obj2 instanceof hj ? (hj) obj2 : null;
            if (hjVar != null) {
                pb0Var.a(hjVar.a);
            }
            Throwable e2 = f ? null : pb0Var.e();
            if (e2 != null) {
                c0(P, e2);
            }
            ug b0 = b0(P);
            if (b0 != null && o0(pb0Var, b0, obj2)) {
                return yr1.j;
            }
            P.e(new wh0(2), 2);
            ug b02 = b0(P);
            return (b02 == null || !o0(pb0Var, b02, obj2)) ? L(pb0Var, obj2) : yr1.j;
        }
    }

    @Override // defpackage.jb0
    public final CancellationException o() {
        CancellationException cancellationException;
        Object R = R();
        if (R instanceof pb0) {
            Throwable e2 = ((pb0) R).e();
            if (e2 == null) {
                af.j(this, "Job is still new or active: ");
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = e2 instanceof CancellationException ? (CancellationException) e2 : null;
            return cancellationException == null ? new kb0(concat, e2, this) : cancellationException;
        }
        if (R instanceof n70) {
            af.j(this, "Job is still new or active: ");
            return null;
        }
        if (!(R instanceof hj)) {
            return new kb0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((hj) R).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new kb0(H(), th, this) : cancellationException;
    }

    public final boolean o0(pb0 pb0Var, ug ugVar, Object obj) {
        while (t80.A(ugVar.l, false, new ob0(this, pb0Var, ugVar, obj)) == vp0.d) {
            ugVar = b0(ugVar);
            if (ugVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return function2.b(obj, this);
    }

    @Override // defpackage.jb0
    public final boolean start() {
        int j0;
        do {
            j0 = j0(R());
            if (j0 == 0) {
                return false;
            }
        } while (j0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a0() + '{' + k0(R()) + '}');
        sb.append('@');
        sb.append(op.y(this));
        return sb.toString();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        return e.b(this, fVar);
    }

    @Override // defpackage.jb0
    public final Object x(fn fnVar) {
        Object R;
        do {
            R = R();
            if (!(R instanceof n70)) {
                t80.l(fnVar.g());
                return Unit.a;
            }
        } while (j0(R) < 0);
        tf tfVar = new tf(1, qa0.b(fnVar));
        tfVar.w();
        tfVar.z(new pf(2, t80.A(this, true, new m31(tfVar))));
        Object u = tfVar.u();
        tn tnVar = tn.d;
        if (u != tnVar) {
            u = Unit.a;
        }
        return u == tnVar ? u : Unit.a;
    }

    @Override // defpackage.jb0
    public final rs z(boolean z, boolean z2, e eVar) {
        return V(z2, z ? new ya0(eVar) : new za0(eVar));
    }

    public void e0() {
    }

    public void A(Object obj) {
    }

    public void T(ij ijVar) {
        throw ijVar;
    }

    public void d0(Object obj) {
    }
}
