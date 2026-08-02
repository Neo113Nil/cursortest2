package B2;

import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;
import t2.AbstractC1212w;
import t2.C1196f;

/* loaded from: classes.dex */
public final class d extends i implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f172g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = e.f173a;

    public final Object c(AbstractC0326c abstractC0326c) {
        boolean d3 = d();
        C0195i c0195i = C0195i.f2555a;
        if (!d3) {
            C1196f d4 = AbstractC1212w.d(C2.b.x(abstractC0326c));
            try {
                a(new c(this, d4));
                Object s3 = d4.s();
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                if (s3 != enumC0317a) {
                    s3 = c0195i;
                }
                if (s3 == enumC0317a) {
                    return s3;
                }
            } catch (Throwable th) {
                d4.z();
                throw th;
            }
        }
        return c0195i;
    }

    public final boolean d() {
        int i3;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                if (i4 <= 0) {
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    f172g.set(this, null);
                    c3 = 0;
                    break;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void e(Object obj) {
        while (Math.max(i.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f172g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1148j c1148j = e.f173a;
            if (obj2 != c1148j) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1148j)) {
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
        sb.append(AbstractC1212w.c(this));
        sb.append("[isLocked=");
        sb.append(Math.max(i.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f172g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
