package le;

import ge.p1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class s extends c implements p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5998d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f5999c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j, s sVar, int i3) {
        super(sVar);
        this.f5999c = j;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override // le.c
    public final boolean c() {
        return f5998d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f5998d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, CoroutineContext coroutineContext);

    public final void h() {
        if (f5998d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f5998d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
