package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a93 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(a93.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = hd2.a.objectFieldOffset(a93.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(a93.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(a93.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(a93.class, "blockingTasksInBuffer$volatile");

    public final ht2 a(ht2 ht2Var, boolean z) {
        if (z) {
            return b(ht2Var);
        }
        b.getClass();
        ht2 ht2Var2 = (ht2) hd2.a.getAndSetObject(this, f, ht2Var);
        if (ht2Var2 == null) {
            return null;
        }
        return b(ht2Var2);
    }

    public final ht2 b(ht2 ht2Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return ht2Var;
        }
        if (ht2Var.n) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ht2Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = hd2.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(jv0 jv0Var) {
        b.getClass();
        ht2 ht2Var = (ht2) hd2.a.getAndSetObject(this, f, (Object) null);
        if (ht2Var != null) {
            jv0Var.a(ht2Var);
        }
        while (true) {
            ht2 f2 = f();
            if (f2 == null) {
                return;
            } else {
                jv0Var.a(f2);
            }
        }
    }

    public final ht2 e() {
        b.getClass();
        ht2 ht2Var = (ht2) hd2.a.getAndSetObject(this, f, (Object) null);
        return ht2Var == null ? f() : ht2Var;
    }

    public final ht2 f() {
        ht2 ht2Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (ht2Var = (ht2) this.a.getAndSet(i2, null)) != null) {
                if (ht2Var.n) {
                    e.decrementAndGet(this);
                }
                return ht2Var;
            }
        }
    }

    public final ht2 g() {
        a93 a93Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = hd2.a;
            long j = f;
            ht2 ht2Var = (ht2) unsafe.getObjectVolatile(this, j);
            if (ht2Var != null && ht2Var.n) {
                while (true) {
                    Unsafe unsafe2 = hd2.a;
                    a93Var = this;
                    if (unsafe2.compareAndSwapObject(a93Var, f, ht2Var, (Object) null)) {
                        return ht2Var;
                    }
                    if (unsafe2.getObjectVolatile(a93Var, j) != ht2Var) {
                        break;
                    }
                    this = a93Var;
                }
            }
            this = a93Var;
        }
        a93 a93Var2 = this;
        int i = d.get(a93Var2);
        int i2 = c.get(a93Var2);
        while (i != i2 && e.get(a93Var2) != 0) {
            i2--;
            ht2 h = a93Var2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final ht2 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        ht2 ht2Var = (ht2) atomicReferenceArray.get(i2);
        if (ht2Var != null && ht2Var.n == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ht2Var, null)) {
                if (atomicReferenceArray.get(i2) != ht2Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return ht2Var;
        }
        return null;
    }

    public final long i(int i, c82 c82Var) {
        a93 a93Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = hd2.a;
            long j = f;
            ht2 ht2Var = (ht2) unsafe.getObjectVolatile(this, j);
            if (ht2Var == null) {
                return -2L;
            }
            if (((ht2Var.n ? 1 : 2) & i) == 0) {
                return -2L;
            }
            rt2.f.getClass();
            long nanoTime = System.nanoTime() - ht2Var.m;
            long j2 = rt2.b;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = hd2.a;
                a93Var = this;
                if (unsafe2.compareAndSwapObject(a93Var, f, ht2Var, (Object) null)) {
                    c82Var.m = ht2Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(a93Var, j) != ht2Var) {
                    break;
                }
                this = a93Var;
            }
            this = a93Var;
        }
    }
}
