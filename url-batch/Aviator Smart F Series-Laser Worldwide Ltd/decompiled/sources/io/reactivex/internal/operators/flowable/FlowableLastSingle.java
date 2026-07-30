package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import p7.b;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableLastSingle<T> extends Single<T> {
    final T defaultItem;
    final b source;

    static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final T defaultItem;
        final SingleObserver<? super T> downstream;
        T item;
        d upstream;

        LastSubscriber(SingleObserver<? super T> singleObserver, T t7) {
            this.downstream = singleObserver;
            this.defaultItem = t7;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            T t7 = this.item;
            if (t7 != null) {
                this.item = null;
                this.downstream.onSuccess(t7);
                return;
            }
            T t8 = this.defaultItem;
            if (t8 != null) {
                this.downstream.onSuccess(t8);
            } else {
                this.downstream.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.item = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.item = t7;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableLastSingle(b bVar, T t7) {
        this.source = bVar;
        this.defaultItem = t7;
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new LastSubscriber(singleObserver, this.defaultItem));
    }
}
