package io.reactivex;

import io.reactivex.annotations.NonNull;
import p7.c;
import p7.d;

/* loaded from: classes4.dex */
public interface FlowableSubscriber<T> extends c {
    @Override // p7.c
    /* synthetic */ void onComplete();

    @Override // p7.c
    /* synthetic */ void onError(Throwable th);

    @Override // p7.c
    /* synthetic */ void onNext(Object obj);

    @Override // p7.c
    void onSubscribe(@NonNull d dVar);
}
