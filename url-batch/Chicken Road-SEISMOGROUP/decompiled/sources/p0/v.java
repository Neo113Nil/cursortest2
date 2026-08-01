package p0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k0.W;

/* loaded from: classes.dex */
public abstract class v extends d implements W {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1178d = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f1179c;
    private volatile int cleanedAndPointers;

    public v(long j2, m0.k kVar, int i2) {
        super(kVar);
        this.f1179c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // p0.d
    public final boolean c() {
        return f1178d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1178d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, W.i iVar);

    public final void h() {
        if (f1178d.incrementAndGet(this) == m0.e.f1045b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1178d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
