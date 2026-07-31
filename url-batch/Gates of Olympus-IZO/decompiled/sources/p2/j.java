package p2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6787d = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6788e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6789f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(j jVar, int i3) {
        while (true) {
            j f3 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788e;
            if (f3 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f3 = (j) obj;
                    if (!f3.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f3);
                }
            }
            if (f3 instanceof h) {
                return (((h) f3).f6785g & i3) == 0 && f3.e(jVar, i3);
            }
            atomicReferenceFieldUpdater.set(jVar, f3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6787d;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f3, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(f3) != this) {
                    break;
                }
            }
            jVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((p2.p) r6).f6803a;
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
    public final j f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788e;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6787d;
                    Object obj = atomicReferenceFieldUpdater2.get(jVar2);
                    if (obj == this) {
                        if (jVar == jVar2) {
                            return jVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, jVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != jVar) {
                                break;
                            }
                        }
                        return jVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof p)) {
                        Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        jVar3 = jVar2;
                        jVar2 = (j) obj;
                    } else {
                        if (jVar3 != null) {
                            break;
                        }
                        jVar2 = (j) atomicReferenceFieldUpdater.get(jVar2);
                    }
                }
                jVar2 = jVar3;
            }
        }
    }

    public final void g(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6788e;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f6787d.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (i()) {
                jVar.f();
                return;
            }
            return;
        }
    }

    public final j h() {
        j jVar;
        Object obj = f6787d.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (jVar = pVar.f6803a) != null) {
            return jVar;
        }
        Z1.i.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean i() {
        return f6787d.get(this) instanceof p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        sb.append(new i(1, i3, AbstractC0552y.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(AbstractC0552y.i(this));
        return sb.toString();
    }
}
