package t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import o2.K0;

/* renamed from: t2.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3429D extends AbstractC3434e implements K0 {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46202e = AtomicIntegerFieldUpdater.newUpdater(AbstractC3429D.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final long f46203d;

    public AbstractC3429D(long j4, AbstractC3429D abstractC3429D, int i4) {
        super(abstractC3429D);
        this.f46203d = j4;
        this.cleanedAndPointers$volatile = i4 << 16;
    }

    @Override // t2.AbstractC3434e
    public boolean k() {
        return f46202e.get(this) == r() && !l();
    }

    public final boolean p() {
        return f46202e.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i4, Throwable th, CoroutineContext coroutineContext);

    public final void t() {
        if (f46202e.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f46202e;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
