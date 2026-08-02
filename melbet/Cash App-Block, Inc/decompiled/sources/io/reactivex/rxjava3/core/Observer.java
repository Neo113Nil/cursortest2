package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.disposables.Disposable;

/* loaded from: classes9.dex */
public interface Observer {
    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);

    void onSubscribe(Disposable disposable);
}
