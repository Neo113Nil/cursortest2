package p1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1059b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1060c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1061d = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((p1.r) r6).f1072a;
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
    public final l i() {
        l lVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1060c;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            lVar = lVar2;
            while (true) {
                l lVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1059b;
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
                    if (m()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof b) {
                        ((b) obj).b(lVar);
                        break;
                    }
                    if (!(obj instanceof r)) {
                        obj.getClass();
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

    public final void j(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1060c;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (m()) {
                lVar.i();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f1059b.get(this);
            if (!(obj instanceof b)) {
                return obj;
            }
            ((b) obj).b(this);
        }
    }

    public final l l() {
        Object k2 = k();
        r rVar = k2 instanceof r ? (r) k2 : null;
        if (rVar != null) {
            return rVar.f1072a;
        }
        k2.getClass();
        return (l) k2;
    }

    public boolean m() {
        return k() instanceof r;
    }

    public String toString() {
        return new k(this) + '@' + k1.t.a(this);
    }
}
