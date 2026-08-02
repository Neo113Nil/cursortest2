package g1;

import B.m;
import Y0.AbstractC0127v;
import Y0.C0112f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2229g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z2) {
        super(z2 ? 1 : 0);
        this.owner = z2 ? null : e.f2230a;
    }

    public final Object c(J0.b bVar) {
        boolean d2 = d(null);
        F0.h hVar = F0.h.f469a;
        if (d2) {
            return hVar;
        }
        C0112f c2 = AbstractC0127v.c(i1.a.t(bVar));
        try {
            a(new c(this, c2));
            Object u2 = c2.u();
            I0.a aVar = I0.a.f733e;
            if (u2 != aVar) {
                u2 = hVar;
            }
            return u2 == aVar ? u2 : hVar;
        } catch (Throwable th) {
            c2.B();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i2;
        char c2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f2237f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2229g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c3 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f2230a) {
                                c3 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c3 == 1) {
                            c2 = 2;
                            break;
                        }
                        if (c3 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c2 = 0;
                    break;
                }
            }
        }
        c2 = 1;
        if (c2 == 0) {
            return true;
        }
        if (c2 == 1) {
            return false;
        }
        if (c2 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f2237f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2229g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            m mVar = e.f2230a;
            if (obj2 != mVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mVar)) {
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
        sb.append(AbstractC0127v.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f2237f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f2229g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
