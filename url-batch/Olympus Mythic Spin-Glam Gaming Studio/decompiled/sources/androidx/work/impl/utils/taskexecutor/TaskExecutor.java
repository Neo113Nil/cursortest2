package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes4.dex */
public interface TaskExecutor {
    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();

    default void executeOnTaskThread(Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }
}
