package w1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s1.AbstractC0335s;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4504a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4505b = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4506c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((w1.o) r6).f4516a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i i() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4505b;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4504a;
                    Object obj = atomicReferenceFieldUpdater2.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (m()) {
                        return null;
                    }
                    if (obj == null) {
                        return iVar2;
                    }
                    if (obj instanceof n) {
                        ((n) obj).a(iVar2);
                        break;
                    }
                    if (!(obj instanceof o)) {
                        k1.e.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater.get(iVar2);
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void j(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4505b;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (k() != iVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    break;
                }
            }
            if (m()) {
                iVar.i();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f4504a.get(this);
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final i l() {
        i iVar;
        Object k2 = k();
        o oVar = k2 instanceof o ? (o) k2 : null;
        if (oVar != null && (iVar = oVar.f4516a) != null) {
            return iVar;
        }
        k1.e.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (i) k2;
    }

    public boolean m() {
        return k() instanceof o;
    }

    public String toString() {
        return new h(this) + '@' + AbstractC0335s.c(this);
    }
}
