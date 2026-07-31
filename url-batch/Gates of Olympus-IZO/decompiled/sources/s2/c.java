package s2;

import L1.z;
import M1.B;
import j1.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0552y;
import k2.C0536h;

/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7553g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z3) {
        super(z3 ? 1 : 0);
        this.owner$volatile = z3 ? null : d.f7554a;
    }

    public final Object c(Object obj, R1.c cVar) {
        boolean d3 = d(obj);
        z zVar = z.f2729a;
        if (d3) {
            return zVar;
        }
        C0536h k3 = AbstractC0552y.k(B.G(cVar));
        try {
            a(new b(this, k3, obj));
            Object p = k3.p();
            Q1.a aVar = Q1.a.f3113d;
            if (p != aVar) {
                p = zVar;
            }
            return p == aVar ? p : zVar;
        } catch (Throwable th) {
            k3.z();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i3;
        char c3;
        char c4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f7561f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7553g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c4 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != d.f7554a) {
                                c4 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c4 == 1) {
                            c3 = 2;
                            break;
                        }
                        if (c4 == 2) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c3 = 0;
                    break;
                }
            }
        }
        c3 = 1;
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(g.f7561f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7553g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            p pVar = d.f7554a;
            if (obj2 != pVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pVar)) {
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
        sb.append(AbstractC0552y.i(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f7561f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f7553g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
