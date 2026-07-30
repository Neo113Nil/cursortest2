package V5;

import R5.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements b, X5.d {

    /* renamed from: e, reason: collision with root package name */
    private static final d f2760e = new d(null);

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2761i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final b f2762d;
    private volatile Object result;

    public e(b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        W5.a aVar = W5.a.f2788e;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2762d = delegate;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        W5.a aVar = W5.a.f2788e;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2761i;
            W5.a aVar2 = W5.a.f2787d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return W5.a.f2787d;
        }
        if (obj == W5.a.f2789i) {
            return W5.a.f2787d;
        }
        if (obj instanceof m) {
            throw ((m) obj).f2420d;
        }
        return obj;
    }

    @Override // X5.d
    public final X5.d getCallerFrame() {
        b bVar = this.f2762d;
        if (bVar instanceof X5.d) {
            return (X5.d) bVar;
        }
        return null;
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return this.f2762d.getContext();
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            W5.a aVar = W5.a.f2788e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2761i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            W5.a aVar2 = W5.a.f2787d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2761i;
            W5.a aVar3 = W5.a.f2789i;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f2762d.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f2762d;
    }
}
