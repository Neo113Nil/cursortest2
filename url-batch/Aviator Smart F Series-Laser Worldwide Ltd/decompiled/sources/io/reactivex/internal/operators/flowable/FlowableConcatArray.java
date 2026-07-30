package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final b[] sources;

    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final c downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final b[] sources;
        final AtomicInteger wip;

        ConcatArraySubscriber(b[] bVarArr, boolean z7, c cVar) {
            super(false);
            this.downstream = cVar;
            this.sources = bVarArr;
            this.delayError = z7;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                b[] bVarArr = this.sources;
                int length = bVarArr.length;
                int i8 = this.index;
                while (i8 != length) {
                    b bVar = bVarArr[i8];
                    if (bVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List list = this.errors;
                        if (list == null) {
                            list = new ArrayList((length - i8) + 1);
                            this.errors = list;
                        }
                        list.add(nullPointerException);
                        i8++;
                    } else {
                        long j8 = this.produced;
                        if (j8 != 0) {
                            this.produced = 0L;
                            produced(j8);
                        }
                        bVar.subscribe(this);
                        i8++;
                        this.index = i8;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.onComplete();
                } else if (list2.size() == 1) {
                    this.downstream.onError(list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list2));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (!this.delayError) {
                this.downstream.onError(th);
                return;
            }
            List list = this.errors;
            if (list == null) {
                list = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = list;
            }
            list.add(th);
            onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.produced++;
            this.downstream.onNext(t7);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            setSubscription(dVar);
        }
    }

    public FlowableConcatArray(b[] bVarArr, boolean z7) {
        this.sources = bVarArr;
        this.delayError = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, cVar);
        cVar.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
