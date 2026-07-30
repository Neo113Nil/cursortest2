package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gq1 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(gq1.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = n51.a.objectFieldOffset(gq1.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(gq1.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(gq1.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(gq1.class, "blockingTasksInBuffer$volatile");

    public final mg1 a(mg1 mg1Var, boolean z) {
        if (z) {
            return b(mg1Var);
        }
        b.getClass();
        mg1 mg1Var2 = (mg1) n51.a.getAndSetObject(this, f, mg1Var);
        if (mg1Var2 == null) {
            return null;
        }
        return b(mg1Var2);
    }

    public final mg1 b(mg1 mg1Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return mg1Var;
        }
        if (mg1Var.e) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, mg1Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = n51.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(v40 v40Var) {
        b.getClass();
        mg1 mg1Var = (mg1) n51.a.getAndSetObject(this, f, (Object) null);
        if (mg1Var != null) {
            v40Var.a(mg1Var);
        }
        while (true) {
            mg1 f2 = f();
            if (f2 == null) {
                return;
            } else {
                v40Var.a(f2);
            }
        }
    }

    public final mg1 e() {
        b.getClass();
        mg1 mg1Var = (mg1) n51.a.getAndSetObject(this, f, (Object) null);
        return mg1Var == null ? f() : mg1Var;
    }

    public final mg1 f() {
        mg1 mg1Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (mg1Var = (mg1) this.a.getAndSet(i2, null)) != null) {
                if (mg1Var.e) {
                    e.decrementAndGet(this);
                }
                return mg1Var;
            }
        }
    }

    public final mg1 g() {
        gq1 gq1Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = n51.a;
            long j = f;
            mg1 mg1Var = (mg1) unsafe.getObjectVolatile(this, j);
            if (mg1Var != null && mg1Var.e) {
                while (true) {
                    Unsafe unsafe2 = n51.a;
                    gq1Var = this;
                    if (unsafe2.compareAndSwapObject(gq1Var, f, mg1Var, (Object) null)) {
                        return mg1Var;
                    }
                    if (unsafe2.getObjectVolatile(gq1Var, j) != mg1Var) {
                        break;
                    }
                    this = gq1Var;
                }
            }
            this = gq1Var;
        }
        gq1 gq1Var2 = this;
        int i = d.get(gq1Var2);
        int i2 = c.get(gq1Var2);
        while (i != i2 && e.get(gq1Var2) != 0) {
            i2--;
            mg1 h = gq1Var2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final mg1 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        mg1 mg1Var = (mg1) atomicReferenceArray.get(i2);
        if (mg1Var != null && mg1Var.e == z) {
            while (!atomicReferenceArray.compareAndSet(i2, mg1Var, null)) {
                if (atomicReferenceArray.get(i2) != mg1Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return mg1Var;
        }
        return null;
    }

    public final long i(int i, z11 z11Var) {
        gq1 gq1Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = n51.a;
            long j = f;
            mg1 mg1Var = (mg1) unsafe.getObjectVolatile(this, j);
            if (mg1Var == null) {
                return -2L;
            }
            if (((mg1Var.e ? 1 : 2) & i) == 0) {
                return -2L;
            }
            qg1.f.getClass();
            long nanoTime = System.nanoTime() - mg1Var.d;
            long j2 = qg1.b;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = n51.a;
                gq1Var = this;
                if (unsafe2.compareAndSwapObject(gq1Var, f, mg1Var, (Object) null)) {
                    z11Var.d = mg1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(gq1Var, j) != mg1Var) {
                    break;
                }
                this = gq1Var;
            }
            this = gq1Var;
        }
    }
}
