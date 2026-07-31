package P5;

import H5.AbstractC0165z;
import H5.C0147g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.v;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1885g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner = e.f1886a;

    public final Object c(AbstractC0607c abstractC0607c) {
        int i7;
        char c7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1893f;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
            } else {
                if (i8 <= 0) {
                    c7 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    f1885g.set(this, null);
                    c7 = 0;
                    break;
                }
            }
        }
        v vVar = v.f5219a;
        if (c7 != 0) {
            if (c7 != 1) {
                if (c7 != 2) {
                    throw new IllegalStateException("unexpected");
                }
                throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
            }
            C0147g h7 = AbstractC0165z.h(AbstractC0676f.m(abstractC0607c));
            try {
                a(new c(this, h7));
                Object q6 = h7.q();
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                if (q6 != enumC0580a) {
                    q6 = vVar;
                }
                if (q6 == enumC0580a) {
                    return q6;
                }
            } catch (Throwable th) {
                h7.y();
                throw th;
            }
        }
        return vVar;
    }

    public final void d(Object obj) {
        while (Math.max(h.f1893f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1885g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            M5.v vVar = e.f1886a;
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
        sb.append(AbstractC0165z.g(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1893f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1885g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
