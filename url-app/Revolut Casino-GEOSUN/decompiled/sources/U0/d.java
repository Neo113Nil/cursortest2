package U0;

import M0.AbstractC0063v;
import M0.C0048f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1031g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z2) {
        super(z2 ? 1 : 0);
        this.owner = z2 ? null : e.f1032a;
    }

    public final Object c(y0.b bVar) {
        boolean d2 = d(null);
        C0247g c0247g = C0247g.f3005a;
        if (d2) {
            return c0247g;
        }
        C0048f c2 = AbstractC0063v.c(o.g.r(bVar));
        try {
            a(new c(this, c2));
            Object s2 = c2.s();
            x0.a aVar = x0.a.f3094e;
            if (s2 != aVar) {
                s2 = c0247g;
            }
            return s2 == aVar ? s2 : c0247g;
        } catch (Throwable th) {
            c2.z();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i2;
        char c2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1039f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1031g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c3 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f1032a) {
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
        while (Math.max(h.f1039f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1031g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            A.j jVar = e.f1032a;
            if (obj2 != jVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar)) {
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
        sb.append(AbstractC0063v.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1039f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1031g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
