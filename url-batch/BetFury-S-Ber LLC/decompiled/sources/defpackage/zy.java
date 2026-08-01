package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class zy {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(zy.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(zy.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(zy.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(zy zyVar, int i) {
        while (true) {
            zy f2 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f2 = (zy) obj;
                    if (!f2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f2);
                }
            }
            if (f2 instanceof ey) {
                return (((ey) f2).i & i) == 0 && f2.e(zyVar, i);
            }
            atomicReferenceFieldUpdater.set(zyVar, f2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
            atomicReferenceFieldUpdater2.set(zyVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f2, this, zyVar)) {
                if (atomicReferenceFieldUpdater2.get(f2) != this) {
                    break;
                }
            }
            zyVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.f90) r6).a;
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
    public final zy f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            zy zyVar = (zy) atomicReferenceFieldUpdater.get(this);
            zy zyVar2 = zyVar;
            while (true) {
                zy zyVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                    Object obj = atomicReferenceFieldUpdater2.get(zyVar2);
                    if (obj == this) {
                        if (zyVar != zyVar2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, zyVar, zyVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != zyVar) {
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
                    if (!(obj instanceof f90)) {
                        obj.getClass();
                        zyVar3 = zyVar2;
                        zyVar2 = (zy) obj;
                    } else {
                        if (zyVar3 != null) {
                            break;
                        }
                        zyVar2 = (zy) atomicReferenceFieldUpdater.get(zyVar2);
                    }
                }
                zyVar2 = zyVar3;
            }
        }
    }

    public final void g(zy zyVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            zy zyVar2 = (zy) atomicReferenceFieldUpdater.get(zyVar);
            if (f.get(this) != zyVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(zyVar, zyVar2, this)) {
                if (atomicReferenceFieldUpdater.get(zyVar) != zyVar2) {
                    break;
                }
            }
            if (i()) {
                zyVar.f();
                return;
            }
            return;
        }
    }

    public final zy h() {
        Object obj = f.get(this);
        f90 f90Var = obj instanceof f90 ? (f90) obj : null;
        if (f90Var != null) {
            return f90Var.a;
        }
        obj.getClass();
        return (zy) obj;
    }

    public boolean i() {
        return f.get(this) instanceof f90;
    }

    public String toString() {
        return new yy(this, bi.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + bi.D(this);
    }
}
