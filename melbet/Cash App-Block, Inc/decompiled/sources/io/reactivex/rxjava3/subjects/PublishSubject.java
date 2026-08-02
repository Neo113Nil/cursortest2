package io.reactivex.rxjava3.subjects;

import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class PublishSubject extends Subject {
    public Throwable error;
    public final AtomicReference subscribers = new AtomicReference(EMPTY);
    public static final PublishDisposable[] TERMINATED = new PublishDisposable[0];
    public static final PublishDisposable[] EMPTY = new PublishDisposable[0];

    public final class PublishDisposable extends AtomicBoolean implements Disposable {
        public final Observer downstream;
        public final PublishSubject parent;

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.downstream = observer;
            this.parent = publishSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        AtomicReference atomicReference = this.subscribers;
        Object obj = atomicReference.get();
        Object obj2 = TERMINATED;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.subscribers;
        Object obj = atomicReference.get();
        Object obj2 = TERMINATED;
        if (obj == obj2) {
            UnsignedBytes.onError(th);
            return;
        }
        this.error = th;
        for (PublishDisposable publishDisposable : (PublishDisposable[]) atomicReference.getAndSet(obj2)) {
            if (publishDisposable.get()) {
                UnsignedBytes.onError(th);
            } else {
                publishDisposable.downstream.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.nullCheck(obj, "onNext called with a null value.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.subscribers.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.downstream.onNext(obj);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (this.subscribers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void remove(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.subscribers;
            PublishDisposable[] publishDisposableArr2 = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr2 == TERMINATED || publishDisposableArr2 == (publishDisposableArr = EMPTY)) {
                return;
            }
            int length = publishDisposableArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr2[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishDisposableArr = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr2, 0, publishDisposableArr, 0, i);
                System.arraycopy(publishDisposableArr2, i + 1, publishDisposableArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                if (atomicReference.get() != publishDisposableArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        while (true) {
            AtomicReference atomicReference = this.subscribers;
            PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == TERMINATED) {
                Throwable th = this.error;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            PublishDisposable[] publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
            while (!atomicReference.compareAndSet(publishDisposableArr, publishDisposableArr2)) {
                if (atomicReference.get() != publishDisposableArr) {
                    break;
                }
            }
            if (publishDisposable.get()) {
                remove(publishDisposable);
                return;
            }
            return;
        }
    }
}
