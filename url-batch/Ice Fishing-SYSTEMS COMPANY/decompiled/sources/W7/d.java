package W7;

import O7.AbstractC0399y;
import O7.C0382g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes2.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3503g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f3504a;

    public final Object c(InterfaceC5133d interfaceC5133d) {
        int i;
        char c4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f3511f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i4 <= 0) {
                    c4 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    f3503g.set(this, null);
                    c4 = 0;
                    break;
                }
            }
        }
        v vVar = v.f40183a;
        if (c4 != 0) {
            if (c4 != 1) {
                if (c4 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C0382g k6 = AbstractC0399y.k(w8.a.f(interfaceC5133d));
            try {
                a(new c(this, k6));
                Object q6 = k6.q();
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                if (q6 != enumC5179a) {
                    q6 = vVar;
                }
                if (q6 == enumC5179a) {
                    return q6;
                }
            } catch (Throwable th) {
                k6.y();
                throw th;
            }
        }
        return vVar;
    }

    public final void d(Object obj) {
        while (Math.max(h.f3511f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3503g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            T7.v vVar = e.f3504a;
            if (obj2 != vVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
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
        sb.append(AbstractC0399y.j(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f3511f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f3503g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
