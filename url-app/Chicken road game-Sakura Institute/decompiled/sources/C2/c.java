package C2;

import E2.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.C1342q;

@Metadata
/* loaded from: classes.dex */
public final class c<T> implements C2.a, d {

    /* renamed from: e, reason: collision with root package name */
    private static final a f1162e = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1163i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "result");

    /* renamed from: d, reason: collision with root package name */
    public final C2.a f1164d;
    private volatile Object result;

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(C2.a delegate, D2.a aVar) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f1164d = delegate;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        D2.a aVar = D2.a.f2164e;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1163i;
            D2.a aVar2 = D2.a.f2163d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return D2.a.f2163d;
        }
        if (obj == D2.a.f2165i) {
            return D2.a.f2163d;
        }
        if (obj instanceof C1342q) {
            throw ((C1342q) obj).f11674d;
        }
        return obj;
    }

    @Override // E2.d
    public final d e() {
        C2.a aVar = this.f1164d;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    @Override // C2.a
    public final CoroutineContext p() {
        return this.f1164d.p();
    }

    public final String toString() {
        return "SafeContinuation for " + this.f1164d;
    }

    @Override // C2.a
    public final void u(Object obj) {
        while (true) {
            Object obj2 = this.result;
            D2.a aVar = D2.a.f2164e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1163i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            D2.a aVar2 = D2.a.f2163d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1163i;
            D2.a aVar3 = D2.a.f2165i;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f1164d.u(obj);
            return;
        }
    }
}
