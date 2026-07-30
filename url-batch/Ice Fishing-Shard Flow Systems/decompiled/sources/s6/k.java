package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7841a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7841a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int a7 = mVar.a(runnable);
            if (a7 == 0) {
                return true;
            }
            if (a7 == 1) {
                m c7 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c7) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            } else if (a7 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7841a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.b()) {
                return;
            }
            m c7 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c7) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int c() {
        m mVar = (m) f7841a.get(this);
        mVar.getClass();
        long j = m.f7844f.get(mVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7841a;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object d7 = mVar.d();
            if (d7 != m.f7845g) {
                return d7;
            }
            m c7 = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, c7) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
