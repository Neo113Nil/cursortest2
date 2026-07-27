package E2;

import W2.C0286h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f2311e;

    /* renamed from: i, reason: collision with root package name */
    public transient C2.a f2312i;

    public c(C2.a aVar, CoroutineContext coroutineContext) {
        super(aVar);
        this.f2311e = coroutineContext;
    }

    @Override // E2.a
    public void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2.a aVar = this.f2312i;
        if (aVar != null && aVar != this) {
            CoroutineContext.Element k4 = p().k(kotlin.coroutines.e.f7496f);
            Intrinsics.c(k4);
            b3.f fVar = (b3.f) aVar;
            do {
                atomicReferenceFieldUpdater = b3.f.f5654n;
            } while (atomicReferenceFieldUpdater.get(fVar) == b3.a.f5648c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0286h c0286h = obj instanceof C0286h ? (C0286h) obj : null;
            if (c0286h != null) {
                c0286h.m();
            }
        }
        this.f2312i = b.f2310d;
    }

    @Override // C2.a
    public CoroutineContext p() {
        CoroutineContext coroutineContext = this.f2311e;
        Intrinsics.c(coroutineContext);
        return coroutineContext;
    }

    public c(C2.a aVar) {
        this(aVar, aVar != null ? aVar.p() : null);
    }
}
