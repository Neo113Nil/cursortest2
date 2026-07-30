package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {
    final T initialValue;
    final Flowable<T> source;

    static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {
        volatile Object value;

        final class Iterator implements java.util.Iterator<T> {
            private Object buf;

            Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.buf = MostRecentSubscriber.this.value;
                return !NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = MostRecentSubscriber.this.value;
                    }
                    if (NotificationLite.isComplete(this.buf)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.buf)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.buf));
                    }
                    T t7 = (T) NotificationLite.getValue(this.buf);
                    this.buf = null;
                    return t7;
                } catch (Throwable th) {
                    this.buf = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        MostRecentSubscriber(T t7) {
            this.value = NotificationLite.next(t7);
        }

        public MostRecentSubscriber<T>.Iterator getIterable() {
            return new Iterator();
        }

        @Override // io.reactivex.subscribers.DefaultSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.value = NotificationLite.complete();
        }

        @Override // io.reactivex.subscribers.DefaultSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.value = NotificationLite.error(th);
        }

        @Override // io.reactivex.subscribers.DefaultSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.value = NotificationLite.next(t7);
        }
    }

    public BlockingFlowableMostRecent(Flowable<T> flowable, T t7) {
        this.source = flowable;
        this.initialValue = t7;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        MostRecentSubscriber mostRecentSubscriber = new MostRecentSubscriber(this.initialValue);
        this.source.subscribe((FlowableSubscriber) mostRecentSubscriber);
        return mostRecentSubscriber.getIterable();
    }
}
