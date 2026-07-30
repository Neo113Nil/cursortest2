package k7;

import a8.m;
import c7.a0;
import d6.z;
import h7.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5379g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = d.f5380a;

    public final Object c(j6.c cVar) {
        boolean d8 = d();
        z zVar = z.f2639a;
        if (!d8) {
            c7.h k8 = a0.k(m.A(cVar));
            try {
                a(new b(this, k8));
                Object q8 = k8.q();
                i6.a aVar = i6.a.f4956f;
                if (q8 != aVar) {
                    q8 = zVar;
                }
                if (q8 == aVar) {
                    return q8;
                }
            } catch (Throwable th) {
                k8.z();
                throw th;
            }
        }
        return zVar;
    }

    public final boolean d() {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f5387f;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    f5379g.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void e(Object obj) {
        while (Math.max(g.f5387f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5379g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            s sVar = d.f5380a;
            if (obj2 != sVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, sVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(a0.i(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f5387f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f5379g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
