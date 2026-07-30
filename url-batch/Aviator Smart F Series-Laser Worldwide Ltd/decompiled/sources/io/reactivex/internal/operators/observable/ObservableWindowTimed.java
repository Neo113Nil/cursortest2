package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int bufferSize;
    final long maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    static final class WindowExactBoundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
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
        Disposable upstream;
        UnicastSubject<T> window;
        final Scheduler.Worker worker;

        static final class ConsumerIndexHolder implements Runnable {
            final long index;
            final WindowExactBoundedObserver<?> parent;

            ConsumerIndexHolder(long j8, WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.index = j8;
                this.parent = windowExactBoundedObserver;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowExactBoundedObserver<?> windowExactBoundedObserver = this.parent;
                if (((QueueDrainObserver) windowExactBoundedObserver).cancelled) {
                    windowExactBoundedObserver.terminated = true;
                } else {
                    ((QueueDrainObserver) windowExactBoundedObserver).queue.offer(this);
                }
                if (windowExactBoundedObserver.enter()) {
                    windowExactBoundedObserver.drainLoop();
                }
            }
        }

        WindowExactBoundedObserver(Observer<? super Observable<T>> observer, long j8, TimeUnit timeUnit, Scheduler scheduler, int i8, long j9, boolean z7) {
            super(observer, new MpscLinkedQueue());
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

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        void disposeTimer() {
            DisposableHelper.dispose(this.timer);
            Scheduler.Worker worker = this.worker;
            if (worker != null) {
                worker.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.window;
            int i8 = 1;
            while (!this.terminated) {
                boolean z7 = this.done;
                Object poll = mpscLinkedQueue.poll();
                boolean z8 = poll == null;
                boolean z9 = poll instanceof ConsumerIndexHolder;
                if (z7 && (z8 || z9)) {
                    this.window = null;
                    mpscLinkedQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        unicastSubject.onError(th);
                    } else {
                        unicastSubject.onComplete();
                    }
                    disposeTimer();
                    return;
                }
                if (z8) {
                    i8 = leave(-i8);
                    if (i8 == 0) {
                        return;
                    }
                } else if (z9) {
                    ConsumerIndexHolder consumerIndexHolder = (ConsumerIndexHolder) poll;
                    if (!this.restartTimerOnMaxSize || this.producerIndex == consumerIndexHolder.index) {
                        unicastSubject.onComplete();
                        this.count = 0L;
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                    long j8 = this.count + 1;
                    if (j8 >= this.maxSize) {
                        this.producerIndex++;
                        this.count = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                        this.window = unicastSubject;
                        this.downstream.onNext(unicastSubject);
                        if (this.restartTimerOnMaxSize) {
                            Disposable disposable = this.timer.get();
                            disposable.dispose();
                            Scheduler.Worker worker = this.worker;
                            ConsumerIndexHolder consumerIndexHolder2 = new ConsumerIndexHolder(this.producerIndex, this);
                            long j9 = this.timespan;
                            Disposable schedulePeriodically = worker.schedulePeriodically(consumerIndexHolder2, j9, j9, this.unit);
                            if (!this.timer.compareAndSet(disposable, schedulePeriodically)) {
                                schedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.count = j8;
                    }
                }
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            disposeTimer();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t7) {
            if (this.terminated) {
                return;
            }
            if (fastEnter()) {
                UnicastSubject<T> unicastSubject = this.window;
                unicastSubject.onNext(t7);
                long j8 = this.count + 1;
                if (j8 >= this.maxSize) {
                    this.producerIndex++;
                    this.count = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                    this.window = create;
                    this.downstream.onNext(create);
                    if (this.restartTimerOnMaxSize) {
                        this.timer.get().dispose();
                        Scheduler.Worker worker = this.worker;
                        ConsumerIndexHolder consumerIndexHolder = new ConsumerIndexHolder(this.producerIndex, this);
                        long j9 = this.timespan;
                        DisposableHelper.replace(this.timer, worker.schedulePeriodically(consumerIndexHolder, j9, j9, this.unit));
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            Disposable schedulePeriodicallyDirect;
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                this.window = create;
                observer.onNext(create);
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
                this.timer.replace(schedulePeriodicallyDirect);
            }
        }
    }

    static final class WindowExactUnboundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        static final Object NEXT = new Object();
        final int bufferSize;
        final Scheduler scheduler;
        volatile boolean terminated;
        final SequentialDisposable timer;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        UnicastSubject<T> window;

        WindowExactUnboundedObserver(Observer<? super Observable<T>> observer, long j8, TimeUnit timeUnit, Scheduler scheduler, int i8) {
            super(observer, new MpscLinkedQueue());
            this.timer = new SequentialDisposable();
            this.timespan = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.bufferSize = i8;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        
            r7.timer.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.window = null;
            r0.clear();
            r0 = r7.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            UnicastSubject<T> unicastSubject = this.window;
            int i8 = 1;
            while (true) {
                boolean z7 = this.terminated;
                boolean z8 = this.done;
                Object poll = mpscLinkedQueue.poll();
                if (!z8 || (poll != null && poll != NEXT)) {
                    if (poll == null) {
                        i8 = leave(-i8);
                        if (i8 == 0) {
                            return;
                        }
                    } else if (poll == NEXT) {
                        unicastSubject.onComplete();
                        if (z7) {
                            this.upstream.dispose();
                        } else {
                            unicastSubject = (UnicastSubject<T>) UnicastSubject.create(this.bufferSize);
                            this.window = unicastSubject;
                            observer.onNext(unicastSubject);
                        }
                    } else {
                        unicastSubject.onNext(NotificationLite.getValue(poll));
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.window = UnicastSubject.create(this.bufferSize);
                Observer<? super V> observer = this.downstream;
                observer.onSubscribe(this);
                observer.onNext(this.window);
                if (this.cancelled) {
                    return;
                }
                Scheduler scheduler = this.scheduler;
                long j8 = this.timespan;
                this.timer.replace(scheduler.schedulePeriodicallyDirect(this, j8, j8, this.unit));
            }
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

    static final class WindowSkipObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        final int bufferSize;
        volatile boolean terminated;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        Disposable upstream;
        final List<UnicastSubject<T>> windows;
        final Scheduler.Worker worker;

        final class CompletionTask implements Runnable {

            /* renamed from: w, reason: collision with root package name */
            private final UnicastSubject<T> f17004w;

            CompletionTask(UnicastSubject<T> unicastSubject) {
                this.f17004w = unicastSubject;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindowSkipObserver.this.complete(this.f17004w);
            }
        }

        static final class SubjectWork<T> {
            final boolean open;

            /* renamed from: w, reason: collision with root package name */
            final UnicastSubject<T> f17005w;

            SubjectWork(UnicastSubject<T> unicastSubject, boolean z7) {
                this.f17005w = unicastSubject;
                this.open = z7;
            }
        }

        WindowSkipObserver(Observer<? super Observable<T>> observer, long j8, long j9, TimeUnit timeUnit, Scheduler.Worker worker, int i8) {
            super(observer, new MpscLinkedQueue());
            this.timespan = j8;
            this.timeskip = j9;
            this.unit = timeUnit;
            this.worker = worker;
            this.bufferSize = i8;
            this.windows = new LinkedList();
        }

        void complete(UnicastSubject<T> unicastSubject) {
            this.queue.offer(new SubjectWork(unicastSubject, false));
            if (enter()) {
                drainLoop();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer<? super V> observer = this.downstream;
            List<UnicastSubject<T>> list = this.windows;
            int i8 = 1;
            while (!this.terminated) {
                boolean z7 = this.done;
                Object poll = mpscLinkedQueue.poll();
                boolean z8 = poll == null;
                boolean z9 = poll instanceof SubjectWork;
                if (z7 && (z8 || z9)) {
                    mpscLinkedQueue.clear();
                    Throwable th = this.error;
                    if (th != null) {
                        Iterator<UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        Iterator<UnicastSubject<T>> it2 = list.iterator();
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
                        list.remove(subjectWork.f17005w);
                        subjectWork.f17005w.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.terminated = true;
                        }
                    } else if (!this.cancelled) {
                        UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                        list.add(create);
                        observer.onNext(create);
                        this.worker.schedule(new CompletionTask(create), this.timespan, this.unit);
                    }
                } else {
                    Iterator<UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.upstream.dispose();
            mpscLinkedQueue.clear();
            list.clear();
            this.worker.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t7) {
            if (fastEnter()) {
                Iterator<UnicastSubject<T>> it = this.windows.iterator();
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                this.windows.add(create);
                this.downstream.onNext(create);
                this.worker.schedule(new CompletionTask(create), this.timespan, this.unit);
                Scheduler.Worker worker = this.worker;
                long j8 = this.timeskip;
                worker.schedulePeriodically(this, j8, j8, this.unit);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastSubject.create(this.bufferSize), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                drainLoop();
            }
        }
    }

    public ObservableWindowTimed(ObservableSource<T> observableSource, long j8, long j9, TimeUnit timeUnit, Scheduler scheduler, long j10, int i8, boolean z7) {
        super(observableSource);
        this.timespan = j8;
        this.timeskip = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.maxSize = j10;
        this.bufferSize = i8;
        this.restartTimerOnMaxSize = z7;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Observable<T>> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        long j8 = this.timespan;
        long j9 = this.timeskip;
        if (j8 != j9) {
            this.source.subscribe(new WindowSkipObserver(serializedObserver, j8, j9, this.unit, this.scheduler.createWorker(), this.bufferSize));
            return;
        }
        long j10 = this.maxSize;
        if (j10 == Long.MAX_VALUE) {
            this.source.subscribe(new WindowExactUnboundedObserver(serializedObserver, this.timespan, this.unit, this.scheduler, this.bufferSize));
        } else {
            this.source.subscribe(new WindowExactBoundedObserver(serializedObserver, j8, this.unit, this.scheduler, this.bufferSize, j10, this.restartTimerOnMaxSize));
        }
    }
}
