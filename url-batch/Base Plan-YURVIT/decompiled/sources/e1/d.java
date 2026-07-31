package e1;

import B0.E;
import W0.AbstractC0081v;
import W0.C0066f;
import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1871g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner = e.f1872a;

    public final Object c(I0.b bVar) {
        boolean d2 = d();
        D0.h hVar = D0.h.f206a;
        if (!d2) {
            C0066f c2 = AbstractC0081v.c(AbstractC0086a.v(bVar));
            try {
                a(new c(this, c2));
                Object t = c2.t();
                H0.a aVar = H0.a.f511e;
                if (t != aVar) {
                    t = hVar;
                }
                if (t == aVar) {
                    return t;
                }
            } catch (Throwable th) {
                c2.A();
                throw th;
            }
        }
        return hVar;
    }

    public final boolean d() {
        int i2;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1879f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                if (i3 <= 0) {
                    c2 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    f1871g.set(this, null);
                    c2 = 0;
                    break;
                }
            }
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f1879f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1871g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            E e2 = e.f1872a;
            if (obj2 != e2) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, e2)) {
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
        sb.append(AbstractC0081v.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1879f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1871g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
