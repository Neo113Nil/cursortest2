package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class zt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zt.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(zt.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(zt.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(zt ztVar, int i) {
        while (true) {
            zt f = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f = (zt) obj;
                    if (!f.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f);
                }
            }
            if (f instanceof et) {
                return (((et) f).d & i) == 0 && f.e(ztVar, i);
            }
            atomicReferenceFieldUpdater.set(ztVar, f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(ztVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f, this, ztVar)) {
                if (atomicReferenceFieldUpdater2.get(f) != this) {
                    break;
                }
            }
            ztVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.x20) r6).a;
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
    public final zt f() {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            zt ztVar = (zt) atomicReferenceFieldUpdater.get(this);
            zt ztVar2 = ztVar;
            while (true) {
                zt ztVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
                    Object obj = atomicReferenceFieldUpdater2.get(ztVar2);
                    if (obj == this) {
                        if (ztVar != ztVar2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, ztVar, ztVar2)) {
                                if (atomicReferenceFieldUpdater.get(this) != ztVar) {
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
                    if (!(obj instanceof x20)) {
                        obj.getClass();
                        ztVar3 = ztVar2;
                        ztVar2 = (zt) obj;
                    } else {
                        if (ztVar3 != null) {
                            break;
                        }
                        ztVar2 = (zt) atomicReferenceFieldUpdater.get(ztVar2);
                    }
                }
                ztVar2 = ztVar3;
            }
        }
    }

    public final void g(zt ztVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            zt ztVar2 = (zt) atomicReferenceFieldUpdater.get(ztVar);
            if (a.get(this) != ztVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(ztVar, ztVar2, this)) {
                if (atomicReferenceFieldUpdater.get(ztVar) != ztVar2) {
                    break;
                }
            }
            if (i()) {
                ztVar.f();
                return;
            }
            return;
        }
    }

    public final zt h() {
        Object obj = a.get(this);
        x20 x20Var = obj instanceof x20 ? (x20) obj : null;
        if (x20Var != null) {
            return x20Var.a;
        }
        obj.getClass();
        return (zt) obj;
    }

    public boolean i() {
        return a.get(this) instanceof x20;
    }

    public String toString() {
        return new yt(this) + '@' + xf.s(this);
    }
}
