package ru.rustore.sdk.core.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
final class CompletionHandler {

    @Nullable
    private final Executor executor;

    @NotNull
    private final OnCompletionListener onCompletionListener;

    public CompletionHandler(@NotNull OnCompletionListener onCompletionListener, @Nullable Executor executor) {
        Intrinsics.checkNotNullParameter(onCompletionListener, "onCompletionListener");
        this.onCompletionListener = onCompletionListener;
        this.executor = executor;
    }

    @Nullable
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    public final OnCompletionListener getOnCompletionListener() {
        return this.onCompletionListener;
    }

    public /* synthetic */ CompletionHandler(OnCompletionListener onCompletionListener, Executor executor, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(onCompletionListener, (i4 & 2) != 0 ? null : executor);
    }
}
