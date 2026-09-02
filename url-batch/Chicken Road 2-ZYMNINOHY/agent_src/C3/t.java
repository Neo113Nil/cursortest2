package C3;

import f3.InterfaceC0430h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x3.g0;

/* loaded from: classes.dex */
public abstract class t extends d implements g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f317d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f318c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public t(long j4, t tVar, int i4) {
        super(tVar);
        this.f318c = j4;
        this.cleanedAndPointers$volatile = i4 << 16;
    }

    @Override // C3.d
    public final boolean c() {
        return f317d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f317d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i4, InterfaceC0430h interfaceC0430h);

    public final void h() {
        if (f317d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f317d;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
