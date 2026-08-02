package F3;

import C3.v;
import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import g3.EnumC0441a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.AbstractC1562w;
import x3.C1546f;

/* loaded from: classes.dex */
public final class d extends i implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f795g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f796a;

    public final Object c(h3.c cVar) {
        boolean d4 = d();
        C0297i c0297i = C0297i.f5732a;
        if (!d4) {
            C1546f d5 = AbstractC1562w.d(AbstractC0347t0.m(cVar));
            try {
                a(new c(this, d5));
                Object q4 = d5.q();
                EnumC0441a enumC0441a = EnumC0441a.f9038a;
                if (q4 != enumC0441a) {
                    q4 = c0297i;
                }
                if (q4 == enumC0441a) {
                    return q4;
                }
            } catch (Throwable th) {
                d5.x();
                throw th;
            }
        }
        return c0297i;
    }

    public final boolean d() {
        int i4;
        char c4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f805f;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 > 1) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1));
            } else {
                if (i5 <= 0) {
                    c4 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i5, i5 - 1)) {
                    f795g.set(this, null);
                    c4 = 0;
                    break;
                }
            }
        }
        if (c4 == 0) {
            return true;
        }
        if (c4 == 1) {
            return false;
        }
        if (c4 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(i.f805f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f795g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            v vVar = e.f796a;
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
        sb.append(AbstractC1562w.c(this));
        sb.append("[isLocked=");
        sb.append(Math.max(i.f805f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f795g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
