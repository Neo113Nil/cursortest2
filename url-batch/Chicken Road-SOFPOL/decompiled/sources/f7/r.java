package f7;

import a7.f1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r extends b implements f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2798d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f2799c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j7, r rVar, int i) {
        super(rVar);
        this.f2799c = j7;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // f7.b
    public final boolean c() {
        return f2798d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f2798d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, g6.h hVar);

    public final void h() {
        if (f2798d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f2798d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
