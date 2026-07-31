package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface SingleEmitter<T> {
    void error(@NotNull Throwable th);

    boolean isDisposed();

    void onFinish(@NotNull Function0<Unit> function0);

    void success(T t4);
}
