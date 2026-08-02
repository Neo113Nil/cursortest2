package io.reactivex.rxjava3.operators;

import io.reactivex.rxjava3.disposables.Disposable;

/* loaded from: classes9.dex */
public interface QueueDisposable extends Disposable, SimpleQueue {
    int requestFusion();
}
