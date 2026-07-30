package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class hs extends js implements un, dn {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(hs.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long m = n51.a.objectFieldOffset(hs.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final ln h;
    public final fn i;
    public Object j;
    public final Object k;

    public hs(ln lnVar, fn fnVar) {
        super(-1);
        this.h = lnVar;
        this.i = fnVar;
        this.j = m90.h;
        this.k = bi1.b(fnVar.g());
    }

    @Override // defpackage.un
    public final un c() {
        return this.i;
    }

    @Override // defpackage.dn
    public final CoroutineContext g() {
        return this.i.g();
    }

    @Override // defpackage.js
    public final Object i() {
        Object obj = this.j;
        this.j = m90.h;
        return obj;
    }

    public final void j() {
        do {
            l.getClass();
        } while (n51.a.getObjectVolatile(this, m) == m90.i);
    }

    public final tf k() {
        hs hsVar;
        fv fvVar = m90.i;
        while (true) {
            l.getClass();
            Unsafe unsafe = n51.a;
            long j = m;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, fvVar);
                return null;
            }
            if (objectVolatile instanceof tf) {
                while (true) {
                    Unsafe unsafe2 = n51.a;
                    hs hsVar2 = this;
                    boolean compareAndSwapObject = unsafe2.compareAndSwapObject(hsVar2, m, objectVolatile, fvVar);
                    hsVar = hsVar2;
                    if (compareAndSwapObject) {
                        return (tf) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(hsVar, j) != objectVolatile) {
                        break;
                    }
                    this = hsVar;
                }
            } else {
                hsVar = this;
                if (objectVolatile != fvVar && !(objectVolatile instanceof Throwable)) {
                    af.j(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = hsVar;
        }
    }

    @Override // defpackage.dn
    public final void l(Object obj) {
        Throwable a = k31.a(obj);
        Object hjVar = a == null ? obj : new hj(a, false);
        fn fnVar = this.i;
        CoroutineContext g = fnVar.g();
        ln lnVar = this.h;
        if (lnVar.l(g)) {
            this.j = hjVar;
            this.g = 0;
            lnVar.f(fnVar.g(), this);
            return;
        }
        ew a2 = ci1.a();
        if (a2.g >= 4294967296L) {
            this.j = hjVar;
            this.g = 0;
            a2.q(this);
            return;
        }
        a2.r(true);
        try {
            CoroutineContext g2 = fnVar.g();
            Object c = bi1.c(g2, this.k);
            try {
                fnVar.l(obj);
                while (a2.t()) {
                }
            } finally {
                bi1.a(g2, c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final tf m() {
        l.getClass();
        Object objectVolatile = n51.a.getObjectVolatile(this, m);
        if (objectVolatile instanceof tf) {
            return (tf) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        l.getClass();
        return n51.a.getObjectVolatile(this, m) != null;
    }

    public final boolean p(Throwable th) {
        hs hsVar;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = n51.a;
            long j = m;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            fv fvVar = m90.i;
            if (Intrinsics.a(objectVolatile, fvVar)) {
                while (true) {
                    Unsafe unsafe3 = n51.a;
                    hs hsVar2 = this;
                    th2 = th;
                    hsVar = hsVar2;
                    if (unsafe3.compareAndSwapObject(hsVar2, m, fvVar, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(hsVar, j) != fvVar) {
                        break;
                    }
                    this = hsVar;
                    th = th2;
                }
            } else {
                hsVar = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = n51.a;
                    if (unsafe.compareAndSwapObject(hsVar, m, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(hsVar, j) == objectVolatile);
            }
            this = hsVar;
            th = th2;
        }
    }

    public final Throwable q(tf tfVar) {
        Unsafe unsafe;
        hs hsVar;
        tf tfVar2;
        while (true) {
            l.getClass();
            Unsafe unsafe2 = n51.a;
            long j = m;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            fv fvVar = m90.i;
            if (objectVolatile != fvVar) {
                hs hsVar2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    af.j(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = n51.a;
                    if (unsafe.compareAndSwapObject(hsVar2, m, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(hsVar2, j) == objectVolatile);
                dd0.e("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = n51.a;
                hsVar = this;
                tfVar2 = tfVar;
                if (unsafe3.compareAndSwapObject(hsVar, m, fvVar, tfVar2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(hsVar, j) != fvVar) {
                    break;
                }
                this = hsVar;
                tfVar = tfVar2;
            }
            this = hsVar;
            tfVar = tfVar2;
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.h + ", " + op.Q(this.i) + ']';
    }

    @Override // defpackage.js
    public final dn d() {
        return this;
    }
}
