package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.InlineList;

/* loaded from: classes3.dex */
public final class DispatcherExecutor implements Executor {
    public final CoroutineDispatcher dispatcher;

    public DispatcherExecutor(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        if (InlineList.safeIsDispatchNeeded(coroutineDispatcher, emptyCoroutineContext)) {
            InlineList.safeDispatch(coroutineDispatcher, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.dispatcher.toString();
    }
}
