package t1;

import V.q;
import i1.InterfaceC0192l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f4201a = new h();

    public static b a(int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if (i != -2) {
            return i != -1 ? i != 0 ? i != Integer.MAX_VALUE ? new b(i, null) : new b(Integer.MAX_VALUE, null) : new b(0, null) : new m(1, 2, null);
        }
        f.f4199a.getClass();
        return new b(e.f4198b, null);
    }

    public static final void b(n nVar, Throwable th) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        boolean z2;
        long j2;
        Object obj;
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = new CancellationException("Channel was consumed, consumer had failed");
                r0.initCause(th);
            }
        }
        b bVar = (b) nVar;
        bVar.getClass();
        if (r0 == null) {
            r0 = new CancellationException("Channel was cancelled");
        }
        do {
            atomicLongFieldUpdater = b.f4173d;
            j = atomicLongFieldUpdater.get(bVar);
            if (((int) (j >> 60)) != 0) {
                break;
            } else {
                j jVar = d.f4181a;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j, (1 << 60) + (j & 1152921504606846975L)));
        q qVar = d.f4196s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f4177k;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, qVar, r0)) {
                z2 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(bVar) != qVar) {
                z2 = false;
                break;
            }
        }
        do {
            j2 = atomicLongFieldUpdater.get(bVar);
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j2, (3 << 60) + (j2 & 1152921504606846975L)));
        bVar.h();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b.f4178l;
                obj = atomicReferenceFieldUpdater2.get(bVar);
                q qVar2 = obj == null ? d.f4194q : d.f4195r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(bVar, obj, qVar2)) {
                    if (atomicReferenceFieldUpdater2.get(bVar) != obj) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return;
            }
            j1.n.a(1, obj);
            ((InterfaceC0192l) obj).g(bVar.l());
        }
    }
}
