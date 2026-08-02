package io.reactivex.rxjava3.internal.operators.observable;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ObservableCreate$CreateEmitter extends AtomicReference implements ObservableEmitter, Disposable {
    public final Observer observer;

    public ObservableCreate$CreateEmitter(Observer observer) {
        this.observer = observer;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this);
    }

    public final void onComplete() {
        if (((Disposable) get()) == DisposableHelper.DISPOSED) {
            return;
        }
        try {
            this.observer.onComplete();
        } finally {
            DisposableHelper.dispose(this);
        }
    }

    public final void onError(Throwable th) {
        Throwable createNullPointerException = th == null ? ExceptionHelper.createNullPointerException("onError called with a null Throwable.") : th;
        if (((Disposable) get()) == DisposableHelper.DISPOSED) {
            UnsignedBytes.onError(th);
            return;
        }
        try {
            this.observer.onError(createNullPointerException);
        } finally {
            DisposableHelper.dispose(this);
        }
    }

    public final void onNext(Object obj) {
        if (obj == null) {
            onError(ExceptionHelper.createNullPointerException("onNext called with a null value."));
        } else {
            if (((Disposable) get()) == DisposableHelper.DISPOSED) {
                return;
            }
            this.observer.onNext(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m(ObservableCreate$CreateEmitter.class.getSimpleName(), "{", super.toString(), "}");
    }
}
