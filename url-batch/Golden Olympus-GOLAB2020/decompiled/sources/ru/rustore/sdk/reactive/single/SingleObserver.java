package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public interface SingleObserver<T> {
    void onError(@NotNull Throwable th);

    void onSubscribe(@NotNull Disposable disposable);

    void onSuccess(T t4);
}
