package ru.rustore.sdk.core.tasks;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
final class ListenerHandler<T> {

    @Nullable
    private final Executor executor;

    @Nullable
    private final OnFailureListener onFailure;

    @Nullable
    private final OnSuccessListener<T> onSuccess;

    public ListenerHandler() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Executor getExecutor() {
        return this.executor;
    }

    @Nullable
    public final OnFailureListener getOnFailure() {
        return this.onFailure;
    }

    @Nullable
    public final OnSuccessListener<T> getOnSuccess() {
        return this.onSuccess;
    }

    public ListenerHandler(@Nullable OnSuccessListener<T> onSuccessListener, @Nullable OnFailureListener onFailureListener, @Nullable Executor executor) {
        this.onSuccess = onSuccessListener;
        this.onFailure = onFailureListener;
        this.executor = executor;
    }

    public /* synthetic */ ListenerHandler(OnSuccessListener onSuccessListener, OnFailureListener onFailureListener, Executor executor, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : onSuccessListener, (i4 & 2) != 0 ? null : onFailureListener, (i4 & 4) != 0 ? null : executor);
    }
}
