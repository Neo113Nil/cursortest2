package io.reactivex.rxjava3.internal.observers;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final class LambdaObserver extends AtomicReference implements Observer, Disposable {
    public final Consumer onError;
    public final Consumer onNext;
    public final KClasses$$Lambda$1 onComplete = Functions.EMPTY_ACTION;
    public final POPMatchingFactory onSubscribe = Functions.EMPTY_CONSUMER;

    public LambdaObserver(Consumer consumer, Consumer consumer2) {
        this.onNext = consumer;
        this.onError = consumer2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj == disposableHelper) {
            return;
        }
        lazySet(disposableHelper);
        try {
            this.onComplete.getClass();
        } catch (Throwable th) {
            Longs.throwIfFatal(th);
            UnsignedBytes.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        Object obj = get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (obj == disposableHelper) {
            UnsignedBytes.onError(th);
            return;
        }
        lazySet(disposableHelper);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            Longs.throwIfFatal(th2);
            UnsignedBytes.onError(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (get() == DisposableHelper.DISPOSED) {
            return;
        }
        try {
            this.onNext.accept(obj);
        } catch (Throwable th) {
            Longs.throwIfFatal(th);
            ((Disposable) get()).dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.setOnce(this, disposable)) {
            try {
                this.onSubscribe.getClass();
            } catch (Throwable th) {
                Longs.throwIfFatal(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
