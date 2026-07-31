package b1;

import W0.AbstractC0081v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1761e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1762f = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1763g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((b1.s) r6).f1774a;
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
    public final l f() {
        l lVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1762f;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            lVar = lVar2;
            while (true) {
                l lVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1761e;
                    Object obj = atomicReferenceFieldUpdater2.get(lVar);
                    if (obj == this) {
                        if (lVar2 != lVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != lVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (n()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof r) {
                        ((r) obj).a(lVar);
                        break;
                    }
                    if (!(obj instanceof s)) {
                        P0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        lVar3 = lVar;
                        lVar = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar = (l) atomicReferenceFieldUpdater.get(lVar);
                    }
                }
                lVar = lVar3;
            }
        }
        return lVar;
    }

    public final void g(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1762f;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (l() != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (n()) {
                lVar.f();
                return;
            }
            return;
        }
    }

    public final Object l() {
        while (true) {
            Object obj = f1761e.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l m() {
        l lVar;
        Object l2 = l();
        s sVar = l2 instanceof s ? (s) l2 : null;
        if (sVar != null && (lVar = sVar.f1774a) != null) {
            return lVar;
        }
        P0.h.c(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (l) l2;
    }

    public boolean n() {
        return l() instanceof s;
    }

    public String toString() {
        return new k(this, AbstractC0081v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0081v.b(this);
    }
}
