package w1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r1.Y;

/* loaded from: classes.dex */
public abstract class t extends d implements Y {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f4499d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f4500c;
    private volatile int cleanedAndPointers;

    public t(long j, t1.j jVar, int i) {
        super(jVar);
        this.f4500c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // w1.d
    public final boolean c() {
        return f4499d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f4499d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, a1.i iVar);

    public final void h() {
        if (f4499d.incrementAndGet(this) == t1.d.f4182b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f4499d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
