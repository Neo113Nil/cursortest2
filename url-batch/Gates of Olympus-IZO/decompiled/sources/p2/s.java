package p2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import k2.k0;

/* loaded from: classes.dex */
public abstract class s extends b implements k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6805d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f6806c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j3, s sVar, int i3) {
        super(sVar);
        this.f6806c = j3;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override // p2.b
    public final boolean c() {
        return f6805d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f6805d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, P1.i iVar);

    public final void h() {
        if (f6805d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f6805d;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
