package y2;

import R1.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.q;
import q2.AbstractC0837y;
import q2.C0821h;

/* loaded from: classes.dex */
public final class c extends g implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10399g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z3) {
        super(z3 ? 1 : 0);
        this.owner$volatile = z3 ? null : d.f10400a;
    }

    public final Object c(Object obj, X1.c cVar) {
        boolean d3 = d(obj);
        y yVar = y.f4171a;
        if (d3) {
            return yVar;
        }
        C0821h l3 = AbstractC0837y.l(l0.c.B(cVar));
        try {
            a(new b(this, l3, obj));
            Object q3 = l3.q();
            W1.a aVar = W1.a.f4608d;
            if (q3 != aVar) {
                q3 = yVar;
            }
            return q3 == aVar ? q3 : yVar;
        } catch (Throwable th) {
            l3.A();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i3;
        char c2;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f10407f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10399g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c3 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != d.f10400a) {
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
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
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
        while (Math.max(g.f10407f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10399g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            q qVar = d.f10400a;
            if (obj2 != qVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, qVar)) {
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
        sb.append(AbstractC0837y.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(g.f10407f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f10399g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
