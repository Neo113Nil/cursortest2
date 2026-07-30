package p1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k1.t0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class u extends d implements t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1074d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: c, reason: collision with root package name */
    public final long f1075c;
    private volatile int cleanedAndPointers;

    public u(long j2, m1.k kVar, int i2) {
        super(kVar);
        this.f1075c = j2;
        this.cleanedAndPointers = i2 << 16;
    }

    @Override // p1.d
    public final boolean c() {
        return f1074d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1074d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, v0.h hVar);

    public final void h() {
        if (f1074d.incrementAndGet(this) == m1.e.f855b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f1074d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
