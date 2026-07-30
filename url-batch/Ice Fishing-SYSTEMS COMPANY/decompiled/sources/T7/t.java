package T7;

import O7.m0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public abstract class t extends d implements m0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3165w = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* renamed from: v, reason: collision with root package name */
    public final long f3166v;

    public t(long j9, t tVar, int i) {
        super(tVar);
        this.f3166v = j9;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // T7.d
    public final boolean c() {
        return f3165w.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3165w.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, InterfaceC5138i interfaceC5138i);

    public final void h() {
        if (f3165w.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f3165w;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, com.anythink.basead.exoplayer.b.aX + i));
        return true;
    }
}
