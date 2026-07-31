package ru.rustore.sdk.core.tasks;

import W1.h;
import W1.i;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class TaskThreadHelper {

    @NotNull
    public static final TaskThreadHelper INSTANCE = new TaskThreadHelper();

    @NotNull
    private static final h executorService$delegate = i.b(TaskThreadHelper$executorService$2.INSTANCE);

    @NotNull
    private static final h mainHandler$delegate = i.b(TaskThreadHelper$mainHandler$2.INSTANCE);

    private TaskThreadHelper() {
    }

    @NotNull
    public final ExecutorService getExecutorService() {
        Object value = executorService$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-executorService>(...)");
        return (ExecutorService) value;
    }

    @NotNull
    public final Handler getMainHandler() {
        return (Handler) mainHandler$delegate.getValue();
    }
}
