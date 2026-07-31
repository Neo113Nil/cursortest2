package v2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import q2.k0;

/* loaded from: classes.dex */
public abstract class r extends b implements k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9825d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f9826c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j3, r rVar, int i3) {
        super(rVar);
        this.f9826c = j3;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override // v2.b
    public final boolean c() {
        return f9825d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f9825d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, V1.i iVar);

    public final void h() {
        if (f9825d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f9825d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
