package ke;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements ld.a, nd.d {

    /* renamed from: d, reason: collision with root package name */
    public final f f5550d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f5551e;

    public u(f fVar, CoroutineContext coroutineContext) {
        this.f5550d = fVar;
        this.f5551e = coroutineContext;
    }

    @Override // nd.d
    public final nd.d getCallerFrame() {
        return this.f5550d;
    }

    @Override // ld.a
    public final CoroutineContext getContext() {
        return this.f5551e;
    }

    @Override // ld.a
    public final void resumeWith(Object obj) {
        this.f5550d.resumeWith(obj);
    }
}
