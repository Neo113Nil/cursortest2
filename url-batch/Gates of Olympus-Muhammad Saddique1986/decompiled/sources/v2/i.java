package v2;

import F.P0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.AbstractC0837y;

/* loaded from: classes.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9807d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9808e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9809f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(i iVar, int i3) {
        while (true) {
            i f3 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9808e;
            if (f3 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f3 = (i) obj;
                    if (!f3.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f3);
                }
            }
            if (f3 instanceof h) {
                return (((h) f3).f9806g & i3) == 0 && f3.e(iVar, i3);
            }
            atomicReferenceFieldUpdater.set(iVar, f3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9807d;
            atomicReferenceFieldUpdater2.set(iVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f3, this, iVar)) {
                if (atomicReferenceFieldUpdater2.get(f3) != this) {
                    break;
                }
            }
            iVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((v2.o) r6).f9823a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9808e;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9807d;
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
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof o)) {
                        f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
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

    public final void g(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9808e;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f9807d.get(this) != iVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    break;
                }
            }
            if (i()) {
                iVar.f();
                return;
            }
            return;
        }
    }

    public final i h() {
        i iVar;
        Object obj = f9807d.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (iVar = oVar.f9823a) != null) {
            return iVar;
        }
        f2.j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean i() {
        return f9807d.get(this) instanceof o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i3 = 2;
        sb.append(new P0(1, i3, AbstractC0837y.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(AbstractC0837y.j(this));
        return sb.toString();
    }
}
