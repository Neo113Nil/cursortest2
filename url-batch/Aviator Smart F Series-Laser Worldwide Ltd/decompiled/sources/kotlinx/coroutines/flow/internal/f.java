package kotlinx.coroutines.flow.internal;

import f6.p;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class f implements CoroutineContext {
    private final /* synthetic */ CoroutineContext $$delegate_0;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f17050e;

    public f(Throwable th, CoroutineContext coroutineContext) {
        this.f17050e = th;
        this.$$delegate_0 = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, p pVar) {
        return (R) this.$$delegate_0.fold(r8, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) this.$$delegate_0.get(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.$$delegate_0.minusKey(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.$$delegate_0.plus(coroutineContext);
    }
}
