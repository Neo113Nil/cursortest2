package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pb0 extends rb0 implements c50, o30 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(pb0.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long u = hd2.a.objectFieldOffset(pb0.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final t40 p;
    public final r30 q;
    public Object r;
    public final Object s;

    public pb0(t40 t40Var, r30 r30Var) {
        super(-1);
        this.p = t40Var;
        this.q = r30Var;
        this.r = j8.e;
        this.s = zw2.b(r30Var.getContext());
    }

    @Override // defpackage.c50
    public final c50 getCallerFrame() {
        return this.q;
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.q.getContext();
    }

    @Override // defpackage.rb0
    public final Object j() {
        Object obj = this.r;
        this.r = j8.e;
        return obj;
    }

    public final void k() {
        do {
            t.getClass();
        } while (hd2.a.getObjectVolatile(this, u) == j8.f);
    }

    public final fs m() {
        pb0 pb0Var;
        ng0 ng0Var = j8.f;
        while (true) {
            t.getClass();
            Unsafe unsafe = hd2.a;
            long j = u;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, ng0Var);
                return null;
            }
            if (objectVolatile instanceof fs) {
                while (true) {
                    Unsafe unsafe2 = hd2.a;
                    pb0 pb0Var2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(pb0Var2, u, objectVolatile, ng0Var);
                    pb0Var = pb0Var2;
                    if (compareAndSwapObject) {
                        return (fs) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(pb0Var, j) != objectVolatile) {
                        break;
                    }
                    this = pb0Var;
                }
            } else {
                pb0Var = this;
                if (objectVolatile != ng0Var && !(objectVolatile instanceof Throwable)) {
                    dm0.i(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = pb0Var;
        }
    }

    public final fs n() {
        t.getClass();
        Object objectVolatile = hd2.a.getObjectVolatile(this, u);
        if (objectVolatile instanceof fs) {
            return (fs) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        t.getClass();
        return hd2.a.getObjectVolatile(this, u) != null;
    }

    public final boolean p(Throwable th) {
        pb0 pb0Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = hd2.a;
            long j = u;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            ng0 ng0Var = j8.f;
            if (Intrinsics.b(objectVolatile, ng0Var)) {
                while (true) {
                    Unsafe unsafe3 = hd2.a;
                    pb0 pb0Var2 = this;
                    th2 = th;
                    pb0Var = pb0Var2;
                    if (unsafe3.compareAndSwapObject(pb0Var2, u, ng0Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(pb0Var, j) != ng0Var) {
                        break;
                    }
                    this = pb0Var;
                    th = th2;
                }
            } else {
                pb0Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = hd2.a;
                    if (unsafe.compareAndSwapObject(pb0Var, u, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(pb0Var, j) == objectVolatile);
            }
            this = pb0Var;
            th = th2;
        }
    }

    public final Throwable q(fs fsVar) {
        Unsafe unsafe;
        pb0 pb0Var;
        fs fsVar2;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = hd2.a;
            long j = u;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            ng0 ng0Var = j8.f;
            if (objectVolatile != ng0Var) {
                pb0 pb0Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    dm0.i(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = hd2.a;
                    if (unsafe.compareAndSwapObject(pb0Var2, u, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(pb0Var2, j) == objectVolatile);
                lh.e("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = hd2.a;
                pb0Var = this;
                fsVar2 = fsVar;
                if (unsafe3.compareAndSwapObject(pb0Var, u, ng0Var, fsVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(pb0Var, j) != ng0Var) {
                    break;
                }
                this = pb0Var;
                fsVar = fsVar2;
            }
            this = pb0Var;
            fsVar = fsVar2;
        }
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        Throwable a = aa2.a(obj);
        Object gxVar = a == null ? obj : new gx(a, false);
        r30 r30Var = this.q;
        CoroutineContext context = r30Var.getContext();
        t40 t40Var = this.p;
        if (t40Var.P(context)) {
            this.r = gxVar;
            this.o = 0;
            t40Var.N(r30Var.getContext(), this);
            return;
        }
        pi0 a2 = bx2.a();
        if (a2.o >= 4294967296L) {
            this.r = gxVar;
            this.o = 0;
            a2.S(this);
            return;
        }
        a2.T(true);
        try {
            CoroutineContext context2 = r30Var.getContext();
            Object c = zw2.c(context2, this.s);
            try {
                r30Var.resumeWith(obj);
                Unit unit = Unit.a;
                while (a2.V()) {
                }
            } finally {
                zw2.a(context2, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.p + ", " + o70.M(this.q) + ']';
    }

    @Override // defpackage.rb0
    public final o30 d() {
        return this;
    }
}
