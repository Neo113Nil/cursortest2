package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableWindowTimed<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    static final class WindowExactBoundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d {
        final int bufferSize;
        long count;
        final long maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        UnicastProcessor<T> window;
        final Scheduler.Worker worker;

        static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedSubscriber<?> parent;

            ConsumerIndexHolder(long j8, WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.index = j8;
                this.parent = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.parent;
                if (((QueueDrainSubscriber) windowExactBoundedSubscriber).cancelled) {
                    windowExactBoundedSubscriber.terminated = true;
                } else {
                    ((QueueDrainSubscriber) windowExactBoundedSubscriber).queue.offer(this);
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.drainLoop();
                }
            }
        }

        WindowExactBoundedSubscriber(c cVar, long j8, TimeUnit timeUnit, Scheduler scheduler, int i8, long j9, boolean z7) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i8;
            this.maxSize = j9;
            this.restartTimerOnMaxSize = z7;
            if (z7) {
                this.worker = scheduler.createWorker();
            } else {
                this.worker = null;
            }
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
        }

        public void disposeTimer() {
            this.timer.dispose();
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i8 = 1;
            while (!this.terminated) {
                boolean z7 = this.done;
                Object poll = simpleQueue.poll();
                boolean z8 = poll == null;
                boolean z9 = poll instanceof ConsumerIndexHolder;
                if (z7 && (z8 || z9)) {
                    this.window = null;
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastProcessor.onError(th);
                    } else {
                        unicastProcessor.onComplete();
                    }
                    disposeTimer();
                    return;
                }
                if (z8) {
                    i8 = leave(-i8);
                    if (i8 == 0) {
                        return;
                    }
                } else {
                    int i9 = i8;
                    if (z9) {
                        ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                        if (!this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                            unicastProcessor.onComplete();
                            this.count = 0L;
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long requested = requested();
                            if (requested == 0) {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                disposeTimer();
                                return;
                            }
                            cVar.onNext(unicastProcessor);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(poll));
                        long j8 = this.count + 1;
                        if (j8 >= this.maxSize) {
                            this.producerIndex++;
                            this.count = 0L;
                            unicastProcessor.onComplete();
                            long requested2 = requested();
                            if (requested2 == 0) {
                                this.window = null;
                                this.upstream.cancel();
                                this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                                disposeTimer();
                                return;
                            }
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            this.downstream.onNext(unicastProcessor);
                            if (requested2 != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            if (this.restartTimerOnMaxSize) {
                                this.timer.get().dispose();
                                Scheduler.Worker worker = this.worker;
                                ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                                long j9 = this.timespan;
                                this.timer.replace(worker.schedulePeriodically(consumerIndexHolder2, j9, j9, this.unit));
                            }
                        } else {
                            this.count = j8;
                        }
                    }
                    i8 = i9;
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            disposeTimer();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                UnicastProcessor<T> unicastProcessor = this.window;
                unicastProcessor.onNext(t7);
                long j8 = this.count + 1;
                if (j8 >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastProcessor.onComplete();
                    long requested = requested();
                    if (requested == 0) {
                        this.window = null;
                        this.upstream.cancel();
                        this.downstream.onError(new MissingBackpressureException("Could not deliver window due to lack of requests"));
                        disposeTimer();
                        return;
                    }
                    UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                    this.window = create;
                    this.downstream.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        Scheduler.Worker worker = this.worker;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        long j9 = this.timespan;
                        this.timer.replace(worker.schedulePeriodically(consumerIndexHolder, j9, j9, this.unit));
                    }
                } else {
                    this.count = j8;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(t7));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            Disposable schedulePeriodicallyDirect;
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                c cVar = this.downstream;
                cVar.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                this.window = create;
                long requested = requested();
                if (requested == 0) {
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver initial window due to lack of requests."));
                    return;
                }
                cVar.onNext(create);
                if (requested != Long.MAX_VALUE) {
                    produced(1L);
                }
                ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                if (this.restartTimerOnMaxSize) {
                    Scheduler.Worker worker = this.worker;
                    long j8 = this.timespan;
                    schedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j8, j8, this.unit);
                } else {
                    Scheduler scheduler = this.scheduler;
                    long j9 = this.timespan;
                    schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j9, j9, this.unit);
                }
                if (this.timer.replace(schedulePeriodicallyDirect)) {
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p7.d
        public void request(long j8) {
            requested(j8);
        }
    }

    static final class WindowExactUnboundedSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d, Runnable {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        UnicastProcessor<T> window;

        WindowExactUnboundedSubscriber(c cVar, long j8, TimeUnit timeUnit, Scheduler scheduler, int i8) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i8;
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r10.timer.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r10.window = null;
            r0.clear();
            r0 = r10.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            UnicastProcessor<T> unicastProcessor = this.window;
            int i8 = 1;
            while (true) {
                boolean z7 = this.terminated;
                boolean z8 = this.done;
                Object poll = simpleQueue.poll();
                if (!z8 || (poll != null && poll != NEXT)) {
                    if (poll == null) {
                        i8 = leave(-i8);
                        if (i8 == 0) {
                            return;
                        }
                    } else if (poll == NEXT) {
                        unicastProcessor.onComplete();
                        if (z7) {
                            this.upstream.cancel();
                        } else {
                            unicastProcessor = (UnicastProcessor<T>) UnicastProcessor.create(this.bufferSize);
                            this.window = unicastProcessor;
                            long requested = requested();
                            if (requested == 0) {
                                this.window = null;
                                this.queue.clear();
                                this.upstream.cancel();
                                cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                this.timer.dispose();
                                return;
                            }
                            cVar.onNext(unicastProcessor);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                        }
                    } else {
                        unicastProcessor.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                this.window.onNext(t7);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(t7));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.window = UnicastProcessor.create(this.bufferSize);
                c cVar = this.downstream;
                cVar.onSubscribe(this);
                long requested = requested();
                if (requested == 0) {
                    this.cancelled = true;
                    dVar.cancel();
                    cVar.onError(new MissingBackpressureException("Could not deliver first window due to lack of requests."));
                    return;
                }
                cVar.onNext(this.window);
                if (requested != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (this.cancelled) {
                    return;
                }
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler = this.scheduler;
                long j8 = this.timespan;
                if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j8, j8, this.unit))) {
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // p7.d
        public void request(long j8) {
            requested(j8);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.cancelled) {
                this.terminated = true;
            }
            this.queue.offer(NEXT);
            if (enter()) {
                drainLoop();
            }
        }
    }

    static final class WindowSkipSubscriber<T> extends QueueDrainSubscriber<T, Object, Flowable<T>> implements d, Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        d upstream;
        final List<UnicastProcessor<T>> windows;
        final Scheduler.Worker worker;

        final class Completion implements Runnable {
            private final UnicastProcessor<T> processor;

            Completion(UnicastProcessor<T> unicastProcessor) {
                this.processor = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipSubscriber.this.complete(this.processor);
            }
        }

        static final class SubjectWork<T> {
            final boolean open;

            /* renamed from: w, reason: collision with root package name */
            final UnicastProcessor<T> f16987w;

            SubjectWork(UnicastProcessor<T> unicastProcessor, boolean z7) {
                this.f16987w = unicastProcessor;
                this.open = z7;
            }
        }

        WindowSkipSubscriber(c cVar, long j8, long j9, TimeUnit timeUnit, Scheduler.Worker worker, int i8) {
            super(cVar, new MpscLinkedQueue());
            this.timespan = j8;
            this.timeskip = j9;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i8;
            this.windows = new LinkedList();
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
        }

        void complete(UnicastProcessor<T> unicastProcessor) {
            this.queue.offer(new SubjectWork(unicastProcessor, false));
            if (enter()) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            SimpleQueue simpleQueue = this.queue;
            c cVar = this.downstream;
            List<UnicastProcessor<T>> list = this.windows;
            int i8 = 1;
            while (!this.terminated) {
                boolean z7 = this.done;
                Object poll = simpleQueue.poll();
                boolean z8 = poll == null;
                boolean z9 = poll instanceof SubjectWork;
                if (z7 && (z8 || z9)) {
                    simpleQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.worker.dispose();
                    return;
                }
                if (z8) {
                    i8 = leave(-i8);
                    if (i8 == 0) {
                        return;
                    }
                } else if (z9) {
                    SubjectWork subjectWork = (SubjectWork) poll;
                    if (!subjectWork.open) {
                        list.remove(subjectWork.f16987w);
                        subjectWork.f16987w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    } else if (!this.cancelled) {
                        long requested = requested();
                        if (requested != 0) {
                            UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                            list.add(create);
                            cVar.onNext(create);
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                            }
                            this.worker.schedule(new Completion(create), this.timespan, this.unit);
                        } else {
                            cVar.onError(new MissingBackpressureException("Can't emit window due to lack of requests"));
                        }
                    }
                } else {
                    Iterator<UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.upstream.cancel();
            simpleQueue.clear();
            list.clear();
            this.worker.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (fastEnter()) {
                Iterator<UnicastProcessor<T>> it = this.windows.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t7);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(t7);
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long requested = requested();
                if (requested == 0) {
                    dVar.cancel();
                    this.downstream.onError(new MissingBackpressureException("Could not emit the first window due to lack of requests"));
                    return;
                }
                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize);
                this.windows.add(create);
                this.downstream.onNext(create);
                if (requested != Long.MAX_VALUE) {
                    produced(1L);
                }
                this.worker.schedule(new Completion(create), this.timespan, this.unit);
                Scheduler.Worker worker = this.worker;
                long j8 = this.timeskip;
                worker.schedulePeriodically(this, j8, j8, this.unit);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            requested(j8);
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastProcessor.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public FlowableWindowTimed(Flowable<T> flowable, long j8, long j9, TimeUnit timeUnit, Scheduler scheduler, long j10, int i8, boolean z7) {
        super(flowable);
        this.timespan = j8;
        this.timeskip = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j10;
        this.bufferSize = i8;
        this.restartTimerOnMaxSize = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        long j8 = this.timespan;
        long j9 = this.timeskip;
        if (j8 != j9) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(serializedSubscriber, j8, j9, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j10 = this.maxSize;
        if (j10 == Long.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new WindowExactUnboundedSubscriber(serializedSubscriber, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowExactBoundedSubscriber(serializedSubscriber, j8, this.unit, this.scheduler, this.bufferSize, j10, this.restartTimerOnMaxSize));
        }
    }
}
