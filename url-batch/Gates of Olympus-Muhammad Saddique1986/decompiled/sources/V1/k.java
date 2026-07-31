package V1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class k implements d, X1.d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4559e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final d f4560d;
    private volatile Object result;

    public k(d dVar, W1.a aVar) {
        this.f4560d = dVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        W1.a aVar = W1.a.f4609e;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4559e;
            W1.a aVar2 = W1.a.f4608d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return W1.a.f4608d;
        }
        if (obj == W1.a.f4610f) {
            return W1.a.f4608d;
        }
        if (obj instanceof R1.k) {
            throw ((R1.k) obj).f4152d;
        }
        return obj;
    }

    @Override // X1.d
    public final X1.d k() {
        d dVar = this.f4560d;
        if (dVar instanceof X1.d) {
            return (X1.d) dVar;
        }
        return null;
    }

    @Override // V1.d
    public final i t() {
        return this.f4560d.t();
    }

    public final String toString() {
        return "SafeContinuation for " + this.f4560d;
    }

    @Override // V1.d
    public final void u(Object obj) {
        while (true) {
            Object obj2 = this.result;
            W1.a aVar = W1.a.f4609e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4559e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            W1.a aVar2 = W1.a.f4608d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4559e;
            W1.a aVar3 = W1.a.f4610f;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f4560d.u(obj);
            return;
        }
    }
}
