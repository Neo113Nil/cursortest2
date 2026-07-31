package f7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2786a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2786a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a8 = mVar.a(runnable);
            if (a8 == 0) {
                return true;
            }
            if (a8 == 1) {
                m c8 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c8) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a8 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2786a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c8 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c8) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f2786a.get(this);
        mVar.getClass();
        long j7 = m.f2789f.get(mVar);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2786a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d8 = mVar.d();
            if (d8 != m.f2790g) {
                return d8;
            }
            m c8 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c8) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
