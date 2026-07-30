package io.reactivex.internal.operators.flowable;

import androidx.lifecycle.g;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, FlowablePublishClassic<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final AtomicReference<PublishSubscriber<T>> current;
    final b onSubscribe;
    final Flowable<T> source;

    static final class FlowablePublisher<T> implements b {
        private final int bufferSize;
        private final AtomicReference<PublishSubscriber<T>> curr;

        FlowablePublisher(AtomicReference<PublishSubscriber<T>> atomicReference, int i8) {
            this.curr = atomicReference;
            this.bufferSize = i8;
        }

        @Override // p7.b
        public void subscribe(c cVar) {
            PublishSubscriber<T> publishSubscriber;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(cVar);
            cVar.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.curr.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.curr, this.bufferSize);
                    if (g.a(this.curr, publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    } else {
                        continue;
                    }
                }
                if (publishSubscriber.add(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.remove(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.dispatch();
        }
    }

    static final class InnerSubscriber<T> extends AtomicLong implements d {
        private static final long serialVersionUID = -4453897557930727610L;
        final c child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        InnerSubscriber(c cVar) {
            this.child = cVar;
        }

        @Override // p7.d
        public void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.parent) == null) {
                return;
            }
            publishSubscriber.remove(this);
            publishSubscriber.dispatch();
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.addCancel(this, j8);
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.dispatch();
                }
            }
        }
    }

    static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscriber[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber[] TERMINATED = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        volatile Object terminalEvent;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i8) {
            this.current = atomicReference;
            this.bufferSize = i8;
        }

        boolean add(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!g.a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        boolean checkTerminated(Object obj, boolean z7) {
            int i8 = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    g.a(this.current, this, null);
                    InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(TERMINATED);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i8 < length) {
                            andSet[i8].child.onError(error);
                            i8++;
                        }
                    } else {
                        RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z7) {
                    g.a(this.current, this, null);
                    InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(TERMINATED);
                    int length2 = andSet2.length;
                    while (i8 < length2) {
                        andSet2[i8].child.onComplete();
                        i8++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:57:0x011f, code lost:
        
            if (r11 == 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
        
            if (r25.sourceMode == 1) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
        
            r25.upstream.get().request(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
        
            r4 = r0;
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0136, code lost:
        
            if (r11 == 0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0138, code lost:
        
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
        
            if (r25.sourceMode == 1) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x013d, code lost:
        
            r25.upstream.get().request(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        
            if (r14 == 0) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0150, code lost:
        
            if (r8 != false) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0014, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0149, code lost:
        
            r3 = 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void dispatch() {
            T t7;
            T t8;
            SimpleQueue<T> simpleQueue;
            boolean z7;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
            int i8 = 1;
            InnerSubscriber<T>[] innerSubscriberArr = atomicReference.get();
            int i9 = 1;
            while (true) {
                Object obj = this.terminalEvent;
                SimpleQueue<T> simpleQueue2 = this.queue;
                boolean z8 = simpleQueue2 == null || simpleQueue2.isEmpty();
                if (checkTerminated(obj, z8)) {
                    return;
                }
                if (!z8) {
                    int length = innerSubscriberArr.length;
                    int i10 = 0;
                    long j8 = Long.MAX_VALUE;
                    for (InnerSubscriber<T> innerSubscriber : innerSubscriberArr) {
                        long j9 = innerSubscriber.get();
                        if (j9 != Long.MIN_VALUE) {
                            j8 = Math.min(j8, j9 - innerSubscriber.emitted);
                        } else {
                            i10++;
                        }
                    }
                    if (length != i10) {
                        int i11 = 0;
                        while (true) {
                            long j10 = i11;
                            if (j10 >= j8) {
                                break;
                            }
                            Object obj2 = this.terminalEvent;
                            try {
                                t8 = simpleQueue2.poll();
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.upstream.get().cancel();
                                obj2 = NotificationLite.error(th);
                                this.terminalEvent = obj2;
                                t8 = null;
                            }
                            boolean z9 = t8 == null;
                            if (checkTerminated(obj2, z9)) {
                                return;
                            }
                            if (z9) {
                                z8 = z9;
                                break;
                            }
                            Object value = NotificationLite.getValue(t8);
                            int length2 = innerSubscriberArr.length;
                            int i12 = 0;
                            boolean z10 = false;
                            while (i12 < length2) {
                                InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr[i12];
                                long j11 = innerSubscriber2.get();
                                if (j11 != Long.MIN_VALUE) {
                                    simpleQueue = simpleQueue2;
                                    z7 = z9;
                                    if (j11 != Long.MAX_VALUE) {
                                        innerSubscriber2.emitted++;
                                    }
                                    innerSubscriber2.child.onNext(value);
                                } else {
                                    simpleQueue = simpleQueue2;
                                    z7 = z9;
                                    z10 = true;
                                }
                                i12++;
                                simpleQueue2 = simpleQueue;
                                z9 = z7;
                            }
                            SimpleQueue<T> simpleQueue3 = simpleQueue2;
                            boolean z11 = z9;
                            i11++;
                            InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
                            if (z10 || innerSubscriberArr2 != innerSubscriberArr) {
                                break;
                            }
                            simpleQueue2 = simpleQueue3;
                            z8 = z11;
                        }
                    } else {
                        Object obj3 = this.terminalEvent;
                        try {
                            t7 = simpleQueue2.poll();
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.upstream.get().cancel();
                            obj3 = NotificationLite.error(th2);
                            this.terminalEvent = obj3;
                            t7 = null;
                        }
                        if (checkTerminated(obj3, t7 == null)) {
                            return;
                        }
                        if (this.sourceMode != i8) {
                            this.upstream.get().request(1L);
                        }
                    }
                }
                i9 = addAndGet(-i9);
                if (i9 == 0) {
                    return;
                } else {
                    innerSubscriberArr = atomicReference.get();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = TERMINATED;
            if (innerSubscriberArr == innerSubscriberArr2 || this.subscribers.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            g.a(this.current, this, null);
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.complete();
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.terminalEvent != null) {
                RxJavaPlugins.onError(th);
            } else {
                this.terminalEvent = NotificationLite.error(th);
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.sourceMode != 0 || this.queue.offer(t7)) {
                dispatch();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.terminalEvent = NotificationLite.complete();
                        dispatch();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                dVar.request(this.bufferSize);
            }
        }

        void remove(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        i8 = -1;
                        break;
                    } else if (innerSubscriberArr[i8].equals(innerSubscriber)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i8);
                    System.arraycopy(innerSubscriberArr, i8 + 1, innerSubscriberArr3, i8, (length - i8) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!g.a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }
    }

    private FlowablePublish(b bVar, Flowable<T> flowable, AtomicReference<PublishSubscriber<T>> atomicReference, int i8) {
        this.onSubscribe = bVar;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferSize = i8;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i8) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(new FlowablePublisher(atomicReference, i8), flowable, atomicReference, i8));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.current, this.bufferSize);
            if (g.a(this.current, publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z7 = false;
        if (!publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z7 = true;
        }
        try {
            consumer.accept(publishSubscriber);
            if (z7) {
                this.source.subscribe((FlowableSubscriber) publishSubscriber);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public int publishBufferSize() {
        return this.bufferSize;
    }

    @Override // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public b publishSource() {
        return this.source;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public b source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.onSubscribe.subscribe(cVar);
    }
}
