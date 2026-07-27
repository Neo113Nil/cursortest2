package b3;

import D.I0;
import W2.B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5667d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5668e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5669i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(i iVar, int i2) {
        while (true) {
            i f4 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5668e;
            if (f4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f4 = (i) obj;
                    if (!f4.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f4);
                }
            }
            if (f4 instanceof h) {
                return (((h) f4).f5666j & i2) == 0 && f4.e(iVar, i2);
            }
            atomicReferenceFieldUpdater.set(iVar, f4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5667d;
            atomicReferenceFieldUpdater2.set(iVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f4, this, iVar)) {
                if (atomicReferenceFieldUpdater2.get(f4) != this) {
                    break;
                }
            }
            iVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((b3.o) r6).f5683a;
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5668e;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5667d;
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
                        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
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
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5668e;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f5667d.get(this) != iVar) {
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
        Object obj = f5667d.get(this);
        o oVar = obj instanceof o ? (o) obj : null;
        if (oVar != null && (iVar = oVar.f5683a) != null) {
            return iVar;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean i() {
        return f5667d.get(this) instanceof o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = 1;
        sb.append(new I0(1, i2, B.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(B.f(this));
        return sb.toString();
    }
}
