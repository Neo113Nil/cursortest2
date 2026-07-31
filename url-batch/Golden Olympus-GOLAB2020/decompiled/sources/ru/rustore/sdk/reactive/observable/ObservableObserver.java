package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public interface ObservableObserver<T> {
    void onComplete();

    void onError(@NotNull Throwable th);

    void onNext(T t4);

    void onSubscribe(@NotNull Disposable disposable);
}
