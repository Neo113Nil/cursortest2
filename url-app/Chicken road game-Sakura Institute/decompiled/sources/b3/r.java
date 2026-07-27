package b3;

import W2.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class r extends b implements p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5685d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f5686c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j4, r rVar, int i2) {
        super(rVar);
        this.f5686c = j4;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    @Override // b3.b
    public final boolean c() {
        return f5685d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f5685d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, CoroutineContext coroutineContext);

    public final void h() {
        if (f5685d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f5685d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
