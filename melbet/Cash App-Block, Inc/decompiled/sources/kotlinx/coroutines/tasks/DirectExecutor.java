package kotlinx.coroutines.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class DirectExecutor implements Executor {
    public static final DirectExecutor INSTANCE = new DirectExecutor();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
