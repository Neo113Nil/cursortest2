package h6;

import d6.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements d, j6.d {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4662g = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: f, reason: collision with root package name */
    public final d f4663f;
    private volatile Object result;

    public k(d dVar, i6.a aVar) {
        this.f4663f = dVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        i6.a aVar = i6.a.f4957g;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4662g;
            i6.a aVar2 = i6.a.f4956f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return i6.a.f4956f;
        }
        if (obj == i6.a.f4958h) {
            return i6.a.f4956f;
        }
        if (obj instanceof l) {
            throw ((l) obj).f2620f;
        }
        return obj;
    }

    @Override // j6.d
    public final j6.d getCallerFrame() {
        d dVar = this.f4663f;
        if (dVar instanceof j6.d) {
            return (j6.d) dVar;
        }
        return null;
    }

    @Override // h6.d
    public final i getContext() {
        return this.f4663f.getContext();
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            i6.a aVar = i6.a.f4957g;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4662g;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            i6.a aVar2 = i6.a.f4956f;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4662g;
            i6.a aVar3 = i6.a.f4958h;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f4663f.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f4663f;
    }
}
