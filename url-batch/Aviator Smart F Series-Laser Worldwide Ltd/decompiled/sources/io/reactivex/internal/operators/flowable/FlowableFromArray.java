package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    final T[] array;

    static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super T> downstream;

        ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            for (int i8 = this.index; i8 != length; i8++) {
                if (this.cancelled) {
                    return;
                }
                T t7 = tArr[i8];
                if (t7 == null) {
                    conditionalSubscriber.onError(new NullPointerException("The element at index " + i8 + " is null"));
                    return;
                }
                conditionalSubscriber.tryOnNext(t7);
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void slowPath(long j8) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i8 = this.index;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j9 = 0;
                while (true) {
                    if (j9 == j8 || i8 == length) {
                        if (i8 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j8 = get();
                            if (j9 == j8) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t7 = tArr[i8];
                        if (t7 == null) {
                            conditionalSubscriber.onError(new NullPointerException("The element at index " + i8 + " is null"));
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(t7)) {
                            j9++;
                        }
                        i8++;
                    }
                }
            } while (j8 != 0);
        }
    }

    static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        final c downstream;

        ArraySubscription(c cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            c cVar = this.downstream;
            for (int i8 = this.index; i8 != length; i8++) {
                if (this.cancelled) {
                    return;
                }
                T t7 = tArr[i8];
                if (t7 == null) {
                    cVar.onError(new NullPointerException("The element at index " + i8 + " is null"));
                    return;
                }
                cVar.onNext(t7);
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
        
            r10.index = r2;
            r11 = addAndGet(-r6);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void slowPath(long j8) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i8 = this.index;
            c cVar = this.downstream;
            do {
                long j9 = 0;
                while (true) {
                    if (j9 == j8 || i8 == length) {
                        if (i8 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            cVar.onComplete();
                            return;
                        } else {
                            j8 = get();
                            if (j9 == j8) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        T t7 = tArr[i8];
                        if (t7 == null) {
                            cVar.onError(new NullPointerException("The element at index " + i8 + " is null"));
                            return;
                        }
                        cVar.onNext(t7);
                        j9++;
                        i8++;
                    }
                }
            } while (j8 != 0);
        }
    }

    static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        final T[] array;
        volatile boolean cancelled;
        int index;

        BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.array.length;
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i8 = this.index;
            T[] tArr = this.array;
            if (i8 == tArr.length) {
                return null;
            }
            this.index = i8 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i8], "array element is null");
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public final void request(long j8) {
            if (SubscriptionHelper.validate(j8) && BackpressureHelper.add(this, j8) == 0) {
                if (j8 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j8);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i8) {
            return i8 & 1;
        }

        abstract void slowPath(long j8);
    }

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) cVar, this.array));
        } else {
            cVar.onSubscribe(new ArraySubscription(cVar, this.array));
        }
    }
}
