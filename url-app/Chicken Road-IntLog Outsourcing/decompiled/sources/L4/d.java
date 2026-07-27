package L4;

import D4.AbstractC0024y;
import D4.C0007g;
import G0.C0051a;
import f4.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1529g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z) {
        super(z ? 1 : 0);
        this.owner = z ? null : e.f1530a;
    }

    public final Object c(AbstractC1295c abstractC1295c) {
        boolean d6 = d(null);
        v vVar = v.f5689a;
        if (d6) {
            return vVar;
        }
        C0007g i2 = AbstractC0024y.i(B0.f.F(abstractC1295c));
        try {
            a(new c(this, i2));
            Object r5 = i2.r();
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            if (r5 != enumC1260a) {
                r5 = vVar;
            }
            return r5 == enumC1260a ? r5 : vVar;
        } catch (Throwable th) {
            i2.z();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i2;
        char c2;
        char c6;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1537f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1529g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c6 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f1530a) {
                                c6 = obj2 == obj ? (char) 1 : (char) 2;
                            }
                        }
                        if (c6 == 1) {
                            c2 = 2;
                            break;
                        }
                        if (c6 == 2) {
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
        while (Math.max(h.f1537f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1529g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0051a c0051a = e.f1530a;
            if (obj2 != c0051a) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0051a)) {
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
        sb.append(AbstractC0024y.h(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1537f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1529g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
