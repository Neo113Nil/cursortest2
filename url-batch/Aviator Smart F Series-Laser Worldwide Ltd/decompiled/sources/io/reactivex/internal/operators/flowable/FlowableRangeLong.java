package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableRangeLong extends Flowable<Long> {
    final long end;
    final long start;

    static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        volatile boolean cancelled;
        final long end;
        long index;

        BaseRangeSubscription(long j8, long j9) {
            this.index = j8;
            this.end = j9;
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
        public final Long poll() {
            long j8 = this.index;
            if (j8 == this.end) {
                return null;
            }
            this.index = 1 + j8;
            return Long.valueOf(j8);
        }
    }

    static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final ConditionalSubscriber<? super Long> downstream;

        RangeConditionalSubscription(ConditionalSubscriber<? super Long> conditionalSubscriber, long j8, long j9) {
            super(j8, j9);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j8 = this.end;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            for (long j9 = this.index; j9 != j8; j9++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Long.valueOf(j9));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            r12.index = r2;
            r13 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void slowPath(long j8) {
            long j9 = this.end;
            long j10 = this.index;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j8 || j10 == j9) {
                        if (j10 == j9) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j8 = get();
                            if (j11 == j8) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(Long.valueOf(j10))) {
                            j11++;
                        }
                        j10++;
                    }
                }
            } while (j8 != 0);
        }
    }

    static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        final c downstream;

        RangeSubscription(c cVar, long j8, long j9) {
            super(j8, j9);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        void fastPath() {
            long j8 = this.end;
            c cVar = this.downstream;
            for (long j9 = this.index; j9 != j8; j9++) {
                if (this.cancelled) {
                    return;
                }
                cVar.onNext(Long.valueOf(j9));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            r11.index = r2;
            r12 = addAndGet(-r7);
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void slowPath(long j8) {
            long j9 = this.end;
            long j10 = this.index;
            c cVar = this.downstream;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j8 || j10 == j9) {
                        if (j10 == j9) {
                            if (this.cancelled) {
                                return;
                            }
                            cVar.onComplete();
                            return;
                        } else {
                            j8 = get();
                            if (j11 == j8) {
                                break;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            return;
                        }
                        cVar.onNext(Long.valueOf(j10));
                        j11++;
                        j10++;
                    }
                }
            } while (j8 != 0);
        }
    }

    public FlowableRangeLong(long j8, long j9) {
        this.start = j8;
        this.end = j8 + j9;
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
