package h7;

import c7.k1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q extends b implements k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4703d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f4704c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public q(long j8, q qVar, int i7) {
        super(qVar);
        this.f4704c = j8;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // h7.b
    public final boolean c() {
        return f4703d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f4703d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i7, h6.i iVar);

    public final void h() {
        if (f4703d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f4703d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
