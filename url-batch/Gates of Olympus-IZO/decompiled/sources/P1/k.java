package P1;

import L1.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class k implements d, R1.d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3074e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final d f3075d;
    private volatile Object result;

    public k(d dVar, Q1.a aVar) {
        this.f3075d = dVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        Q1.a aVar = Q1.a.f3114e;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3074e;
            Q1.a aVar2 = Q1.a.f3113d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return Q1.a.f3113d;
        }
        if (obj == Q1.a.f3115f) {
            return Q1.a.f3113d;
        }
        if (obj instanceof l) {
            throw ((l) obj).f2710d;
        }
        return obj;
    }

    @Override // R1.d
    public final R1.d getCallerFrame() {
        d dVar = this.f3075d;
        if (dVar instanceof R1.d) {
            return (R1.d) dVar;
        }
        return null;
    }

    @Override // P1.d
    public final i getContext() {
        return this.f3075d.getContext();
    }

    @Override // P1.d
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            Q1.a aVar = Q1.a.f3114e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3074e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            Q1.a aVar2 = Q1.a.f3113d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3074e;
            Q1.a aVar3 = Q1.a.f3115f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f3075d.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f3075d;
    }
}
