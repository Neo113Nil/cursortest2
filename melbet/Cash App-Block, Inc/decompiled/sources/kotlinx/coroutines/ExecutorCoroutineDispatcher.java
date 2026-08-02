package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ExecutorCoroutineDispatcher extends CoroutineDispatcher implements Closeable, AutoCloseable {
    static {
        CoroutineDispatcher.Key.getClass();
    }

    public abstract Executor getExecutor();
}
