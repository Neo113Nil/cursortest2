package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableRange extends Flowable<Integer> {
    final int end;
    final int start;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final int end;
        int index;

        BaseRangeSubscription(int i8, int i9) {
            this.index = i8;
            this.end = i9;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
        }

        abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Integer poll() {
            int i8 = this.index;
            if (i8 == this.end) {
                return null;
            }
            this.index = i8 + 1;
            return Integer.valueOf(i8);
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Integer> downstream;

        RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i8, int i9) {
            super(i8, i9);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i8 = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            for (int i9 = this.index; i9 != i8; i9++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i9));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void slowPath(long j8) {
            int i8 = this.end;
            int i9 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            do {
                long j9 = 0;
                while (true) {
                    if (j9 == j8 || i9 == i8) {
                        if (i9 == i8) {
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
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i9))) {
                            j9++;
                        }
                        i9++;
                    }
                }
            } while (j8 != 0);
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final c downstream;

        RangeSubscription(c cVar, int i8, int i9) {
            super(i8, i9);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        void fastPath() {
            int i8 = this.end;
            c cVar = this.downstream;
            for (int i9 = this.index; i9 != i8; i9++) {
                if (this.cancelled) {
                    return;
                }
                cVar.onNext(Integer.valueOf(i9));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        
            r9.index = r1;
            r10 = addAndGet(-r5);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void slowPath(long j8) {
            int i8 = this.end;
            int i9 = this.index;
            c cVar = this.downstream;
            do {
                long j9 = 0;
                while (true) {
                    if (j9 == j8 || i9 == i8) {
                        if (i9 == i8) {
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
                        cVar.onNext(Integer.valueOf(i9));
                        j9++;
                        i9++;
                    }
                }
            } while (j8 != 0);
        }
    }

    public FlowableRange(int i8, int i9) {
        this.start = i8;
        this.end = i8 + i9;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) cVar, this.start, this.end));
        } else {
            cVar.onSubscribe(new RangeSubscription(cVar, this.start, this.end));
        }
    }
}
