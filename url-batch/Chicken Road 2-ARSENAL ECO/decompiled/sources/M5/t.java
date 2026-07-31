package M5;

import H5.k0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o5.InterfaceC0569i;

/* loaded from: classes.dex */
public abstract class t extends d implements k0 {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1621i = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: h, reason: collision with root package name */
    public final long f1622h;

    public t(long j4, t tVar, int i7) {
        super(tVar);
        this.f1622h = j4;
        this.cleanedAndPointers = i7 << 16;
    }

    @Override // M5.d
    public final boolean c() {
        return f1621i.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1621i.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i7, InterfaceC0569i interfaceC0569i);

    public final void h() {
        if (f1621i.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f1621i;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
