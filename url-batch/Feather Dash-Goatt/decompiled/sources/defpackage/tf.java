package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class tf extends js implements sf, un, yn1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(tf.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(tf.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final dn h;
    public final CoroutineContext i;

    static {
        Unsafe unsafe = n51.a;
        n = unsafe.objectFieldOffset(tf.class.getDeclaredField("_state$volatile"));
        l = AtomicReferenceFieldUpdater.newUpdater(tf.class, Object.class, "_parentHandle$volatile");
        m = unsafe.objectFieldOffset(tf.class.getDeclaredField("_parentHandle$volatile"));
    }

    public tf(int i, dn dnVar) {
        super(i);
        this.h = dnVar;
        this.i = dnVar.g();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = f2.a;
    }

    public static void C(yp0 yp0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + yp0Var + ", already has " + obj).toString());
    }

    public static Object I(yp0 yp0Var, Object obj, int i, s30 s30Var) {
        if (obj instanceof hj) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (s30Var != null || (yp0Var instanceof pf)) {
            return new fj(obj, yp0Var instanceof pf ? (pf) yp0Var : null, s30Var, (Throwable) null, 16);
        }
        return obj;
    }

    public final boolean A() {
        if (this.g != 2) {
            return false;
        }
        dn dnVar = this.h;
        dnVar.getClass();
        return ((hs) dnVar).o();
    }

    @Override // defpackage.sf
    public final void B(Object obj) {
        p(this.g);
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E() {
        Throwable q;
        dn dnVar = this.h;
        hs hsVar = dnVar instanceof hs ? (hs) dnVar : null;
        if (hsVar == null || (q = hsVar.q(this)) == null) {
            return;
        }
        o();
        t(q);
    }

    public final boolean F() {
        k.getClass();
        Unsafe unsafe = n51.a;
        long j2 = n;
        Object objectVolatile = unsafe.getObjectVolatile(this, j2);
        if ((objectVolatile instanceof fj) && ((fj) objectVolatile).d != null) {
            o();
            return false;
        }
        j.set(this, 536870911);
        unsafe.putObjectVolatile(this, j2, f2.a);
        return true;
    }

    public final void G(Object obj, int i, s30 s30Var) {
        tf tfVar;
        while (true) {
            k.getClass();
            Unsafe unsafe = n51.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof yp0)) {
                tf tfVar2 = this;
                if (objectVolatile instanceof vf) {
                    vf vfVar = (vf) objectVolatile;
                    if (vf.c.compareAndSet(vfVar, 0, 1)) {
                        if (s30Var != null) {
                            tfVar2.k(s30Var, vfVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                af.j(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object I = I((yp0) objectVolatile, obj, i, s30Var);
            while (true) {
                Unsafe unsafe2 = n51.a;
                tfVar = this;
                if (unsafe2.compareAndSwapObject(tfVar, n, objectVolatile, I)) {
                    if (!tfVar.A()) {
                        tfVar.o();
                    }
                    tfVar.p(i);
                    return;
                } else if (unsafe2.getObjectVolatile(tfVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = tfVar;
                }
            }
            this = tfVar;
        }
    }

    public final void H(ln lnVar, Unit unit) {
        dn dnVar = this.h;
        hs hsVar = dnVar instanceof hs ? (hs) dnVar : null;
        G(unit, (hsVar != null ? hsVar.h : null) == lnVar ? 4 : this.g, null);
    }

    public final fv J(Object obj, s30 s30Var) {
        tf tfVar;
        fv fvVar = uq1.b;
        while (true) {
            k.getClass();
            Unsafe unsafe = n51.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof yp0)) {
                return null;
            }
            Object I = I((yp0) objectVolatile, obj, this.g, s30Var);
            while (true) {
                Unsafe unsafe2 = n51.a;
                tfVar = this;
                if (unsafe2.compareAndSwapObject(tfVar, n, objectVolatile, I)) {
                    if (!tfVar.A()) {
                        tfVar.o();
                    }
                    return fvVar;
                }
                if (unsafe2.getObjectVolatile(tfVar, j2) != objectVolatile) {
                    break;
                }
                this = tfVar;
            }
            this = tfVar;
        }
    }

    @Override // defpackage.yn1
    public final void a(e81 e81Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                dd0.j("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        z(e81Var);
    }

    @Override // defpackage.js
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        tf tfVar;
        while (true) {
            k.getClass();
            Unsafe unsafe = n51.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (objectVolatile instanceof yp0) {
                dd0.j("Not completed");
                return;
            }
            if (objectVolatile instanceof hj) {
                return;
            }
            if (objectVolatile instanceof fj) {
                fj fjVar = (fj) objectVolatile;
                if (fjVar.e != null) {
                    dd0.j("Must be called at most once");
                    return;
                }
                fj a = fj.a(fjVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = n51.a;
                    tf tfVar2 = this;
                    if (unsafe2.compareAndSwapObject(tfVar2, n, objectVolatile, a)) {
                        pf pfVar = fjVar.b;
                        if (pfVar != null) {
                            tfVar2.j(pfVar, cancellationException);
                        }
                        s30 s30Var = fjVar.c;
                        if (s30Var != null) {
                            tfVar2.k(s30Var, cancellationException, fjVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(tfVar2, j2) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        tfVar = tfVar2;
                        break;
                    }
                    this = tfVar2;
                }
            } else {
                tf tfVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                fj fjVar2 = new fj(objectVolatile, (pf) null, (s30) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    fj fjVar3 = fjVar2;
                    Unsafe unsafe3 = n51.a;
                    tfVar = tfVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(tfVar, n, objectVolatile, fjVar3);
                    fjVar2 = fjVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(tfVar, j2) != objectVolatile) {
                        break;
                    } else {
                        tfVar3 = tfVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = tfVar;
        }
    }

    @Override // defpackage.un
    public final un c() {
        dn dnVar = this.h;
        if (dnVar instanceof un) {
            return (un) dnVar;
        }
        return null;
    }

    @Override // defpackage.js
    public final dn d() {
        return this.h;
    }

    @Override // defpackage.js
    public final Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // defpackage.js
    public final Object f(Object obj) {
        return obj instanceof fj ? ((fj) obj).a : obj;
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.i;
    }

    @Override // defpackage.js
    public final Object i() {
        return v();
    }

    public final void j(pf pfVar, Throwable th) {
        try {
            switch (pfVar.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    ((ScheduledFuture) pfVar.b).cancel(false);
                    break;
                case 1:
                    ((Function1) pfVar.b).invoke(th);
                    break;
                default:
                    ((rs) pfVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            m90.z(new ij("Exception in invokeOnCancellation handler for " + this, th2), this.i);
        }
    }

    public final void k(s30 s30Var, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.i;
        try {
            s30Var.a(th, obj, coroutineContext);
        } catch (Throwable th2) {
            m90.z(new ij("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        Throwable a = k31.a(obj);
        if (a != null) {
            obj = new hj(a, false);
        }
        G(obj, this.g, null);
    }

    public final void m(e81 e81Var, Throwable th) {
        CoroutineContext coroutineContext = this.i;
        int i = j.get(this) & 536870911;
        if (i == 536870911) {
            dd0.j("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            e81Var.l(i, coroutineContext);
        } catch (Throwable th2) {
            m90.z(new ij("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    @Override // defpackage.sf
    public final void n(Object obj, s30 s30Var) {
        G(obj, this.g, s30Var);
    }

    public final void o() {
        rs s = s();
        if (s == null) {
            return;
        }
        s.a();
        l.getClass();
        n51.a.putObjectVolatile(this, m, vp0.d);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    dd0.j("Already resumed");
                    return;
                }
                boolean z = i == 4;
                dn dnVar = this.h;
                if (!z && (dnVar instanceof hs)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.g;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        hs hsVar = (hs) dnVar;
                        ln lnVar = hsVar.h;
                        CoroutineContext g = hsVar.i.g();
                        if (lnVar.l(g)) {
                            lnVar.f(g, this);
                            return;
                        }
                        ew a = ci1.a();
                        if (a.g >= 4294967296L) {
                            a.q(this);
                            return;
                        }
                        a.r(true);
                        try {
                            p4.Z(this, dnVar, true);
                            do {
                            } while (a.t());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                p4.Z(this, dnVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(qb0 qb0Var) {
        return qb0Var.o();
    }

    @Override // defpackage.sf
    public final fv r(Object obj, s30 s30Var) {
        return J(obj, s30Var);
    }

    public final rs s() {
        l.getClass();
        return (rs) n51.a.getObjectVolatile(this, m);
    }

    @Override // defpackage.sf
    public final boolean t(Throwable th) {
        tf tfVar;
        while (true) {
            k.getClass();
            Unsafe unsafe = n51.a;
            long j2 = n;
            Object objectVolatile = unsafe.getObjectVolatile(this, j2);
            if (!(objectVolatile instanceof yp0)) {
                return false;
            }
            vf vfVar = new vf(this, th, (objectVolatile instanceof pf) || (objectVolatile instanceof e81));
            while (true) {
                Unsafe unsafe2 = n51.a;
                tfVar = this;
                if (unsafe2.compareAndSwapObject(tfVar, n, objectVolatile, vfVar)) {
                    yp0 yp0Var = (yp0) objectVolatile;
                    if (yp0Var instanceof pf) {
                        tfVar.j((pf) objectVolatile, th);
                    } else if (yp0Var instanceof e81) {
                        tfVar.m((e81) objectVolatile, th);
                    }
                    if (!tfVar.A()) {
                        tfVar.o();
                    }
                    tfVar.p(tfVar.g);
                    return true;
                }
                if (unsafe2.getObjectVolatile(tfVar, j2) != objectVolatile) {
                    break;
                }
                this = tfVar;
            }
            this = tfVar;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('(');
        sb.append(op.Q(this.h));
        sb.append("){");
        Object v = v();
        sb.append(v instanceof yp0 ? "Active" : v instanceof vf ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(op.y(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        jb0 jb0Var;
        boolean A = A();
        do {
            atomicIntegerFieldUpdater = j;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    dd0.j("Already suspended");
                    return null;
                }
                if (A) {
                    E();
                }
                Object v = v();
                if (v instanceof hj) {
                    throw ((hj) v).a;
                }
                int i3 = this.g;
                if ((i3 != 1 && i3 != 2) || (jb0Var = (jb0) this.i.d(j41.m)) == null || jb0Var.b()) {
                    return f(v);
                }
                CancellationException o = jb0Var.o();
                b(o);
                throw o;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (s() == null) {
            x();
        }
        if (A) {
            E();
        }
        return tn.d;
    }

    public final Object v() {
        k.getClass();
        return n51.a.getObjectVolatile(this, n);
    }

    public final void w() {
        rs x = x();
        if (x == null || (v() instanceof yp0)) {
            return;
        }
        x.a();
        l.getClass();
        n51.a.putObjectVolatile(this, m, vp0.d);
    }

    public final rs x() {
        jb0 jb0Var = (jb0) this.i.d(j41.m);
        if (jb0Var == null) {
            return null;
        }
        rs A = t80.A(jb0Var, true, new sg(this));
        while (true) {
            l.getClass();
            Unsafe unsafe = n51.a;
            long j2 = m;
            tf tfVar = this;
            if (!unsafe.compareAndSwapObject(tfVar, j2, (Object) null, A) && unsafe.getObjectVolatile(tfVar, j2) == null) {
                this = tfVar;
            }
        }
        return A;
    }

    public final void y(Function1 function1) {
        z(new pf(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c5, code lost:
    
        C(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c8, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(yp0 yp0Var) {
        tf tfVar;
        Unsafe unsafe;
        tf tfVar2;
        while (true) {
            k.getClass();
            Unsafe unsafe2 = n51.a;
            long j2 = n;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j2);
            if (objectVolatile instanceof f2) {
                while (true) {
                    Unsafe unsafe3 = n51.a;
                    tfVar = this;
                    if (unsafe3.compareAndSwapObject(tfVar, n, objectVolatile, yp0Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(tfVar, j2) != objectVolatile) {
                        break;
                    } else {
                        this = tfVar;
                    }
                }
            } else {
                tfVar = this;
                if ((objectVolatile instanceof pf) || (objectVolatile instanceof e81)) {
                    break;
                }
                if (objectVolatile instanceof hj) {
                    hj hjVar = (hj) objectVolatile;
                    if (!hj.b.compareAndSet(hjVar, 0, 1)) {
                        C(yp0Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof vf) {
                        Throwable th = hjVar.a;
                        if (yp0Var instanceof pf) {
                            tfVar.j((pf) yp0Var, th);
                            return;
                        } else {
                            tfVar.m((e81) yp0Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof fj) {
                    fj fjVar = (fj) objectVolatile;
                    if (fjVar.b != null) {
                        C(yp0Var, objectVolatile);
                        throw null;
                    }
                    if (yp0Var instanceof e81) {
                        return;
                    }
                    pf pfVar = (pf) yp0Var;
                    Throwable th2 = fjVar.e;
                    if (th2 != null) {
                        tfVar.j(pfVar, th2);
                        return;
                    }
                    fj a = fj.a(fjVar, pfVar, null, 29);
                    do {
                        unsafe = n51.a;
                        tfVar2 = tfVar;
                        if (unsafe.compareAndSwapObject(tfVar, n, objectVolatile, a)) {
                            return;
                        } else {
                            tfVar = tfVar2;
                        }
                    } while (unsafe.getObjectVolatile(tfVar2, j2) == objectVolatile);
                } else {
                    tf tfVar3 = tfVar;
                    if (yp0Var instanceof e81) {
                        return;
                    }
                    fj fjVar2 = new fj(objectVolatile, (pf) yp0Var, (s30) null, (Throwable) null, 28);
                    while (true) {
                        fj fjVar3 = fjVar2;
                        Unsafe unsafe4 = n51.a;
                        tfVar = tfVar3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(tfVar, n, objectVolatile, fjVar3);
                        fjVar2 = fjVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(tfVar, j2) != objectVolatile) {
                            break;
                        } else {
                            tfVar3 = tfVar;
                        }
                    }
                }
            }
            this = tfVar;
        }
    }
}
