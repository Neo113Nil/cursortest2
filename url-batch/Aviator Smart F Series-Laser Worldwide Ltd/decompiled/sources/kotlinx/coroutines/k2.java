package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
final class k2 implements CoroutineContext.a, CoroutineContext.b {
    public static final k2 INSTANCE = new k2();

    private k2() {
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r8, f6.p pVar) {
        return (R) CoroutineContext.a.C0363a.fold(this, r8, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b bVar) {
        return (E) CoroutineContext.a.C0363a.get(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    public CoroutineContext.b getKey() {
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.a.C0363a.minusKey(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C0363a.plus(this, coroutineContext);
    }
}
