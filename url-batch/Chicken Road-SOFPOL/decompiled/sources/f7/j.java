package f7;

import a7.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2783d = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2784e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2785f = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(j jVar, int i) {
        while (true) {
            j f6 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2784e;
            if (f6 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f6 = (j) obj;
                    if (!f6.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f6);
                }
            }
            if (f6 instanceof h) {
                return (((h) f6).f2781g & i) == 0 && f6.e(jVar, i);
            }
            atomicReferenceFieldUpdater.set(jVar, f6);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2783d;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f6, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(f6) != this) {
                    break;
                }
            }
            jVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((f7.o) r6).f2796a;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2784e;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            j jVar2 = jVar;
            while (true) {
                j jVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2783d;
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
                    if (!(obj instanceof o)) {
                        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2784e;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f2783d.get(this) != jVar) {
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
        Object obj = f2783d.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (jVar = oVar.f2796a) != null) {
            return jVar;
        }
        q6.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj;
    }

    public boolean i() {
        return f2783d.get(this) instanceof o;
    }

    public String toString() {
        return new i(1, 0, x.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + x.g(this);
    }
}
