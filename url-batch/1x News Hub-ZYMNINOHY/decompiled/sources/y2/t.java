package y2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import t2.h0;

/* loaded from: classes.dex */
public abstract class t extends d implements h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10865d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f10866c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j3, t tVar, int i3) {
        super(tVar);
        this.f10866c = j3;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override // y2.d
    public final boolean c() {
        return f10865d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f10865d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, d2.h hVar);

    public final void h() {
        if (f10865d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f10865d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
