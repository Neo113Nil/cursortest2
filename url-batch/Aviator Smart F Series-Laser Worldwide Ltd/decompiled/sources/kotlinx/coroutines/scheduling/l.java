package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.q;

/* loaded from: classes5.dex */
final class l extends CoroutineDispatcher {
    public static final l INSTANCE = new l();

    private l() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        b.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable, k.BlockingContext, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        b.INSTANCE.dispatchWithContext$kotlinx_coroutines_core(runnable, k.BlockingContext, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i8) {
        q.checkParallelism(i8);
        return i8 >= k.MAX_POOL_SIZE ? this : super.limitedParallelism(i8);
    }
}
