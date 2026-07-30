package defpackage;

import com.facebook.internal.AnalyticsEvents;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class fs extends rb0 implements ds, c50, g63 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(fs.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(fs.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final o30 p;
    public final CoroutineContext q;

    static {
        Unsafe unsafe = hd2.a;
        v = unsafe.objectFieldOffset(fs.class.getDeclaredField("_state$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(fs.class, Object.class, "_parentHandle$volatile");
        u = unsafe.objectFieldOffset(fs.class.getDeclaredField("_parentHandle$volatile"));
    }

    public fs(int i, o30 o30Var) {
        super(i);
        this.p = o30Var;
        this.q = o30Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = j3.a;
    }

    public static Object F(vs1 vs1Var, Object obj, int i, xt0 xt0Var) {
        if (obj instanceof gx) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (xt0Var != null || (vs1Var instanceof as)) {
            return new ex(obj, vs1Var instanceof as ? (as) vs1Var : null, xt0Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable q;
        o30 o30Var = this.p;
        pb0 pb0Var = o30Var instanceof pb0 ? (pb0) o30Var : null;
        if (pb0Var == null || (q = pb0Var.q(this)) == null) {
            return;
        }
        o();
        g(q);
    }

    public final boolean C() {
        s.getClass();
        Unsafe unsafe = hd2.a;
        long j = v;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof ex) && ((ex) objectVolatile).d != null) {
            o();
            return false;
        }
        r.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, j3.a);
        return true;
    }

    public final void D(Object obj, int i, xt0 xt0Var) {
        fs fsVar;
        while (true) {
            s.getClass();
            Unsafe unsafe = hd2.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof vs1)) {
                fs fsVar2 = this;
                if (objectVolatile instanceof js) {
                    js jsVar = (js) objectVolatile;
                    if (js.c.compareAndSet(jsVar, 0, 1)) {
                        if (xt0Var != null) {
                            fsVar2.m(xt0Var, jsVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                dm0.i(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object F = F((vs1) objectVolatile, obj, i, xt0Var);
            while (true) {
                Unsafe unsafe2 = hd2.a;
                fsVar = this;
                if (unsafe2.compareAndSwapObject(fsVar, v, objectVolatile, F)) {
                    if (!fsVar.y()) {
                        fsVar.o();
                    }
                    fsVar.p(i);
                    return;
                } else if (unsafe2.getObjectVolatile(fsVar, j) != objectVolatile) {
                    break;
                } else {
                    this = fsVar;
                }
            }
            this = fsVar;
        }
    }

    public final void E(t40 t40Var, Unit unit) {
        o30 o30Var = this.p;
        pb0 pb0Var = o30Var instanceof pb0 ? (pb0) o30Var : null;
        D(unit, (pb0Var != null ? pb0Var.p : null) == t40Var ? 4 : this.o, null);
    }

    public final ng0 G(Object obj, xt0 xt0Var) {
        fs fsVar;
        ng0 ng0Var = yk3.o;
        while (true) {
            s.getClass();
            Unsafe unsafe = hd2.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof vs1)) {
                return null;
            }
            Object F = F((vs1) objectVolatile, obj, this.o, xt0Var);
            while (true) {
                Unsafe unsafe2 = hd2.a;
                fsVar = this;
                if (unsafe2.compareAndSwapObject(fsVar, v, objectVolatile, F)) {
                    if (!fsVar.y()) {
                        fsVar.o();
                    }
                    return ng0Var;
                }
                if (unsafe2.getObjectVolatile(fsVar, j) != objectVolatile) {
                    break;
                }
                this = fsVar;
            }
            this = fsVar;
        }
    }

    @Override // defpackage.g63
    public final void a(vg2 vg2Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = r;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                lh.g("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(vg2Var);
    }

    @Override // defpackage.rb0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        fs fsVar;
        while (true) {
            s.getClass();
            Unsafe unsafe = hd2.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof vs1) {
                lh.g("Not completed");
                return;
            }
            if (objectVolatile instanceof gx) {
                return;
            }
            if (objectVolatile instanceof ex) {
                ex exVar = (ex) objectVolatile;
                if (exVar.e != null) {
                    lh.g("Must be called at most once");
                    return;
                }
                ex a = ex.a(exVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = hd2.a;
                    fs fsVar2 = this;
                    if (unsafe2.compareAndSwapObject(fsVar2, v, objectVolatile, a)) {
                        as asVar = exVar.b;
                        if (asVar != null) {
                            fsVar2.k(asVar, cancellationException);
                        }
                        xt0 xt0Var = exVar.c;
                        if (xt0Var != null) {
                            fsVar2.m(xt0Var, cancellationException, exVar.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(fsVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        fsVar = fsVar2;
                        break;
                    }
                    this = fsVar2;
                }
            } else {
                fs fsVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                ex exVar2 = new ex(objectVolatile, (as) null, (xt0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    ex exVar3 = exVar2;
                    Unsafe unsafe3 = hd2.a;
                    fsVar = fsVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(fsVar, v, objectVolatile, exVar3);
                    exVar2 = exVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(fsVar, j) != objectVolatile) {
                        break;
                    } else {
                        fsVar3 = fsVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = fsVar;
        }
    }

    @Override // defpackage.ds
    public final void c(Object obj, xt0 xt0Var) {
        D(obj, this.o, xt0Var);
    }

    @Override // defpackage.rb0
    public final o30 d() {
        return this.p;
    }

    @Override // defpackage.ds
    public final ng0 e(Object obj, xt0 xt0Var) {
        return G(obj, xt0Var);
    }

    @Override // defpackage.rb0
    public final Throwable f(Object obj) {
        Throwable f = super.f(obj);
        if (f != null) {
            return f;
        }
        return null;
    }

    @Override // defpackage.ds
    public final boolean g(Throwable th) {
        fs fsVar;
        while (true) {
            s.getClass();
            Unsafe unsafe = hd2.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof vs1)) {
                return false;
            }
            js jsVar = new js(this, th, (objectVolatile instanceof as) || (objectVolatile instanceof vg2));
            while (true) {
                Unsafe unsafe2 = hd2.a;
                fsVar = this;
                if (unsafe2.compareAndSwapObject(fsVar, v, objectVolatile, jsVar)) {
                    vs1 vs1Var = (vs1) objectVolatile;
                    if (vs1Var instanceof as) {
                        fsVar.k((as) objectVolatile, th);
                    } else if (vs1Var instanceof vg2) {
                        fsVar.n((vg2) objectVolatile, th);
                    }
                    if (!fsVar.y()) {
                        fsVar.o();
                    }
                    fsVar.p(fsVar.o);
                    return true;
                }
                if (unsafe2.getObjectVolatile(fsVar, j) != objectVolatile) {
                    break;
                }
                this = fsVar;
            }
            this = fsVar;
        }
    }

    @Override // defpackage.c50
    public final c50 getCallerFrame() {
        o30 o30Var = this.p;
        if (o30Var instanceof c50) {
            return (c50) o30Var;
        }
        return null;
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.q;
    }

    @Override // defpackage.rb0
    public final Object h(Object obj) {
        return obj instanceof ex ? ((ex) obj).a : obj;
    }

    @Override // defpackage.rb0
    public final Object j() {
        return t();
    }

    public final void k(as asVar, Throwable th) {
        try {
            switch (asVar.a) {
                case 0:
                    ((ScheduledFuture) asVar.b).cancel(false);
                    break;
                case 1:
                    ((Function1) asVar.b).invoke(th);
                    break;
                default:
                    ((ec0) asVar.b).a();
                    break;
            }
        } catch (Throwable th2) {
            zm3.B(new hx("Exception in invokeOnCancellation handler for " + this, th2), this.q);
        }
    }

    @Override // defpackage.ds
    public final void l(Object obj) {
        p(this.o);
    }

    public final void m(xt0 xt0Var, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.q;
        try {
            xt0Var.a(th, obj, coroutineContext);
        } catch (Throwable th2) {
            zm3.B(new hx("Exception in resume onCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void n(vg2 vg2Var, Throwable th) {
        CoroutineContext coroutineContext = this.q;
        int i = r.get(this) & 536870911;
        if (i == 536870911) {
            lh.g("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            vg2Var.l(i, coroutineContext);
        } catch (Throwable th2) {
            zm3.B(new hx("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final void o() {
        ec0 r2 = r();
        if (r2 == null) {
            return;
        }
        r2.a();
        t.getClass();
        hd2.a.putObjectVolatile(this, u, rs1.m);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = r;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    lh.g("Already resumed");
                    return;
                }
                boolean z = i == 4;
                o30 o30Var = this.p;
                if (!z && (o30Var instanceof pb0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.o;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        pb0 pb0Var = (pb0) o30Var;
                        t40 t40Var = pb0Var.p;
                        CoroutineContext context = pb0Var.q.getContext();
                        if (t40Var.P(context)) {
                            t40Var.N(context, this);
                            return;
                        }
                        pi0 a = bx2.a();
                        if (a.o >= 4294967296L) {
                            a.S(this);
                            return;
                        }
                        a.T(true);
                        try {
                            sb0.a(this, o30Var, true);
                            do {
                            } while (a.V());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                sb0.a(this, o30Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(n61 n61Var) {
        return n61Var.v();
    }

    public final ec0 r() {
        t.getClass();
        return (ec0) hd2.a.getObjectVolatile(this, u);
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        Throwable a = aa2.a(obj);
        if (a != null) {
            obj = new gx(a, false);
        }
        D(obj, this.o, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        g61 g61Var;
        boolean y = y();
        do {
            atomicIntegerFieldUpdater = r;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    lh.g("Already suspended");
                    return null;
                }
                if (y) {
                    B();
                }
                Object t2 = t();
                if (t2 instanceof gx) {
                    throw ((gx) t2).a;
                }
                int i3 = this.o;
                if ((i3 != 1 && i3 != 2) || (g61Var = (g61) this.q.m(qb2.U)) == null || g61Var.b()) {
                    return h(t2);
                }
                CancellationException v2 = g61Var.v();
                b(v2);
                throw v2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (r() == null) {
            v();
        }
        if (y) {
            B();
        }
        return b50.m;
    }

    public final Object t() {
        s.getClass();
        return hd2.a.getObjectVolatile(this, v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(o70.M(this.p));
        sb.append("){");
        Object t2 = t();
        sb.append(t2 instanceof vs1 ? "Active" : t2 instanceof js ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED);
        sb.append("}@");
        sb.append(o70.x(this));
        return sb.toString();
    }

    public final void u() {
        ec0 v2 = v();
        if (v2 == null || (t() instanceof vs1)) {
            return;
        }
        v2.a();
        t.getClass();
        hd2.a.putObjectVolatile(this, u, rs1.m);
    }

    public final ec0 v() {
        g61 g61Var = (g61) this.q.m(qb2.U);
        if (g61Var == null) {
            return null;
        }
        ec0 K = l41.K(g61Var, true, new au(this));
        while (true) {
            t.getClass();
            Unsafe unsafe = hd2.a;
            long j = u;
            fs fsVar = this;
            if (!unsafe.compareAndSwapObject(fsVar, j, (Object) null, K) && unsafe.getObjectVolatile(fsVar, j) == null) {
                this = fsVar;
            }
        }
        return K;
    }

    public final void w(Function1 function1) {
        x(new as(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        z(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(vs1 vs1Var) {
        fs fsVar;
        Unsafe unsafe;
        fs fsVar2;
        while (true) {
            s.getClass();
            Unsafe unsafe2 = hd2.a;
            long j = v;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof j3) {
                while (true) {
                    Unsafe unsafe3 = hd2.a;
                    fsVar = this;
                    if (unsafe3.compareAndSwapObject(fsVar, v, objectVolatile, vs1Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(fsVar, j) != objectVolatile) {
                        break;
                    } else {
                        this = fsVar;
                    }
                }
            } else {
                fsVar = this;
                if ((objectVolatile instanceof as) || (objectVolatile instanceof vg2)) {
                    break;
                }
                if (objectVolatile instanceof gx) {
                    gx gxVar = (gx) objectVolatile;
                    if (!gx.b.compareAndSet(gxVar, 0, 1)) {
                        z(vs1Var, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof js) {
                        Throwable th = gxVar.a;
                        if (vs1Var instanceof as) {
                            fsVar.k((as) vs1Var, th);
                            return;
                        } else {
                            vs1Var.getClass();
                            fsVar.n((vg2) vs1Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof ex) {
                    ex exVar = (ex) objectVolatile;
                    if (exVar.b != null) {
                        z(vs1Var, objectVolatile);
                        throw null;
                    }
                    if (vs1Var instanceof vg2) {
                        return;
                    }
                    vs1Var.getClass();
                    as asVar = (as) vs1Var;
                    Throwable th2 = exVar.e;
                    if (th2 != null) {
                        fsVar.k(asVar, th2);
                        return;
                    }
                    ex a = ex.a(exVar, asVar, null, 29);
                    do {
                        unsafe = hd2.a;
                        fsVar2 = fsVar;
                        if (unsafe.compareAndSwapObject(fsVar, v, objectVolatile, a)) {
                            return;
                        } else {
                            fsVar = fsVar2;
                        }
                    } while (unsafe.getObjectVolatile(fsVar2, j) == objectVolatile);
                } else {
                    fs fsVar3 = fsVar;
                    if (vs1Var instanceof vg2) {
                        return;
                    }
                    vs1Var.getClass();
                    ex exVar2 = new ex(objectVolatile, (as) vs1Var, (xt0) null, (Throwable) null, 28);
                    while (true) {
                        ex exVar3 = exVar2;
                        Unsafe unsafe4 = hd2.a;
                        fsVar = fsVar3;
                        boolean compareAndSwapObject = unsafe4.compareAndSwapObject(fsVar, v, objectVolatile, exVar3);
                        exVar2 = exVar3;
                        if (compareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(fsVar, j) != objectVolatile) {
                            break;
                        } else {
                            fsVar3 = fsVar;
                        }
                    }
                }
            }
            this = fsVar;
        }
    }

    public final boolean y() {
        if (this.o != 2) {
            return false;
        }
        o30 o30Var = this.p;
        o30Var.getClass();
        return ((pb0) o30Var).o();
    }
}
