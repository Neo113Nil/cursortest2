package R0;

import M0.c0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class v extends d implements c0 {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f937h = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: g, reason: collision with root package name */
    public final long f938g;

    public v(long j2, v vVar, int i2) {
        super(vVar);
        this.f938g = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // R0.d
    public final boolean c() {
        return f937h.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f937h.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, w0.i iVar);

    public final void h() {
        if (f937h.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f937h;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
