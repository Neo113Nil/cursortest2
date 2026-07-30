package r6;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class y implements V5.b, X5.d {

    /* renamed from: d, reason: collision with root package name */
    public final V5.b f7592d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f7593e;

    public y(V5.b bVar, CoroutineContext coroutineContext) {
        this.f7592d = bVar;
        this.f7593e = coroutineContext;
    }

    @Override // X5.d
    public final X5.d getCallerFrame() {
        V5.b bVar = this.f7592d;
        if (bVar instanceof X5.d) {
            return (X5.d) bVar;
        }
        return null;
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return this.f7593e;
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        this.f7592d.resumeWith(obj);
    }
}
