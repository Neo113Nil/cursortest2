package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.operators.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class EmptyDisposable implements QueueDisposable {
    public static final /* synthetic */ EmptyDisposable[] $VALUES;
    public static final EmptyDisposable INSTANCE;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        INSTANCE = emptyDisposable;
        $VALUES = new EmptyDisposable[]{emptyDisposable, new EmptyDisposable("NEVER", 1)};
    }

    public static void complete(Observer observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable th, Observer observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // io.reactivex.rxjava3.operators.QueueDisposable
    public final int requestFusion() {
        return 2;
    }
}
