package le;

import ge.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5984d = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5985e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5986i = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(k kVar, int i3) {
        while (true) {
            k f3 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5985e;
            if (f3 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f3 = (k) obj;
                    if (!f3.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f3);
                }
            }
            if (f3 instanceof i) {
                return (((i) f3).f5983r & i3) == 0 && f3.c(kVar, i3);
            }
            atomicReferenceFieldUpdater.set(kVar, f3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5984d;
            atomicReferenceFieldUpdater2.set(kVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f3, this, kVar)) {
                if (atomicReferenceFieldUpdater2.get(f3) != this) {
                    break;
                }
            }
            kVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((le.p) r6).f5996a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5985e;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5984d;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar2);
                    if (obj == this) {
                        if (kVar != kVar2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != kVar) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof p)) {
                        obj.getClass();
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) atomicReferenceFieldUpdater.get(kVar2);
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void g(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5985e;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f5984d.get(this) != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (i()) {
                kVar.f();
                return;
            }
            return;
        }
    }

    public final k h() {
        Object obj = f5984d.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f5996a;
        }
        obj.getClass();
        return (k) obj;
    }

    public boolean i() {
        return f5984d.get(this) instanceof p;
    }

    public String toString() {
        return new j(1, a0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + a0.m(this);
    }
}
