package io.reactivex.internal.operators.flowable;

import androidx.lifecycle.g;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableBufferTimed<T, U extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, U> {
    final Callable<U> bufferSupplier;
    final int maxSize;
    final boolean restartTimerOnMaxSize;
    final Scheduler scheduler;
    final long timeskip;
    final long timespan;
    final TimeUnit unit;

    static final class BufferExactBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements d, Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        long consumerIndex;
        final int maxSize;
        long producerIndex;
        final boolean restartTimerOnMaxSize;
        Disposable timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;

        /* renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f16969w;

        BufferExactBoundedSubscriber(c cVar, Callable<U> callable, long j8, TimeUnit timeUnit, int i8, boolean z7, Scheduler.Worker worker) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j8;
            this.unit = timeUnit;
            this.maxSize = i8;
            this.restartTimerOnMaxSize = z7;
            this.f16969w = worker;
        }

        @Override // p7.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            synchronized (this) {
                this.buffer = null;
            }
            this.upstream.cancel();
            this.f16969w.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f16969w.isDisposed();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            U u7;
            synchronized (this) {
                u7 = this.buffer;
                this.buffer = null;
            }
            if (u7 != null) {
                this.queue.offer(u7);
                this.done = true;
                if (enter()) {
                    QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                }
                this.f16969w.dispose();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
            this.f16969w.dispose();
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            synchronized (this) {
                try {
                    U u7 = this.buffer;
                    if (u7 == null) {
                        return;
                    }
                    u7.add(t7);
                    if (u7.size() < this.maxSize) {
                        return;
                    }
                    this.buffer = null;
                    this.producerIndex++;
                    if (this.restartTimerOnMaxSize) {
                        this.timer.dispose();
                    }
                    fastPathOrderedEmitMax(u7, false, this);
                    try {
                        U u8 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                        synchronized (this) {
                            this.buffer = u8;
                            this.consumerIndex++;
                        }
                        if (this.restartTimerOnMaxSize) {
                            Scheduler.Worker worker = this.f16969w;
                            long j8 = this.timespan;
                            this.timer = worker.schedulePeriodically(this, j8, j8, this.unit);
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cancel();
                        this.downstream.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    Scheduler.Worker worker = this.f16969w;
                    long j8 = this.timespan;
                    this.timer = worker.schedulePeriodically(this, j8, j8, this.unit);
                    dVar.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f16969w.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // p7.d
        public void request(long j8) {
            requested(j8);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u7 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u8 = this.buffer;
                    if (u8 != null && this.producerIndex == this.consumerIndex) {
                        this.buffer = u7;
                        fastPathOrderedEmitMax(u8, false, this);
                    }
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancel();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(c cVar, U u7) {
            cVar.onNext(u7);
            return true;
        }
    }

    static final class BufferExactUnboundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements d, Runnable, Disposable {
        U buffer;
        final Callable<U> bufferSupplier;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer;
        final long timespan;
        final TimeUnit unit;
        d upstream;

        BufferExactUnboundedSubscriber(c cVar, Callable<U> callable, long j8, TimeUnit timeUnit, Scheduler scheduler) {
            super(cVar, new MpscLinkedQueue());
            this.timer = new AtomicReference<>();
            this.bufferSupplier = callable;
            this.timespan = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.timer.get() == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                try {
                    U u7 = this.buffer;
                    if (u7 == null) {
                        return;
                    }
                    this.buffer = null;
                    this.queue.offer(u7);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.timer);
            synchronized (this) {
                this.buffer = null;
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            synchronized (this) {
                try {
                    U u7 = this.buffer;
                    if (u7 != null) {
                        u7.add(t7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    this.buffer = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    dVar.request(Long.MAX_VALUE);
                    Scheduler scheduler = this.scheduler;
                    long j8 = this.timespan;
                    Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j8, j8, this.unit);
                    if (g.a(this.timer, null, schedulePeriodicallyDirect)) {
                        return;
                    }
                    schedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    EmptySubscription.error(th, this.downstream);
                }
            }
        }

        @Override // p7.d
        public void request(long j8) {
            requested(j8);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u7 = (U) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u8 = this.buffer;
                        if (u8 == null) {
                            return;
                        }
                        this.buffer = u7;
                        fastPathEmitMax(u8, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(c cVar, U u7) {
            this.downstream.onNext(u7);
            return true;
        }
    }

    static final class BufferSkipBoundedSubscriber<T, U extends Collection<? super T>> extends QueueDrainSubscriber<T, U, U> implements d, Runnable {
        final Callable<U> bufferSupplier;
        final List<U> buffers;
        final long timeskip;
        final long timespan;
        final TimeUnit unit;
        d upstream;

        /* renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f16970w;

        final class RemoveFromBuffer implements Runnable {
            private final U buffer;

            RemoveFromBuffer(U u7) {
                this.buffer = u7;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (BufferSkipBoundedSubscriber.this) {
                    BufferSkipBoundedSubscriber.this.buffers.remove(this.buffer);
                }
                BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.fastPathOrderedEmitMax(this.buffer, false, bufferSkipBoundedSubscriber.f16970w);
            }
        }

        BufferSkipBoundedSubscriber(c cVar, Callable<U> callable, long j8, long j9, TimeUnit timeUnit, Scheduler.Worker worker) {
            super(cVar, new MpscLinkedQueue());
            this.bufferSupplier = callable;
            this.timespan = j8;
            this.timeskip = j9;
            this.unit = timeUnit;
            this.f16970w = worker;
            this.buffers = new LinkedList();
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.f16970w.dispose();
            clear();
        }

        void clear() {
            synchronized (this) {
                this.buffers.clear();
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.buffers);
                this.buffers.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((Collection) it.next());
            }
            this.done = true;
            if (enter()) {
                QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this.f16970w, this);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.done = true;
            this.f16970w.dispose();
            clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.buffers.iterator();
                    while (it.hasNext()) {
                        it.next().add(t7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                try {
                    Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                    this.buffers.add(collection);
                    this.downstream.onSubscribe(this);
                    dVar.request(Long.MAX_VALUE);
                    Scheduler.Worker worker = this.f16970w;
                    long j8 = this.timeskip;
                    worker.schedulePeriodically(this, j8, j8, this.unit);
                    this.f16970w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f16970w.dispose();
                    dVar.cancel();
                    EmptySubscription.error(th, this.downstream);
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
                return;
            }
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.cancelled) {
                            return;
                        }
                        this.buffers.add(collection);
                        this.f16970w.schedule(new RemoveFromBuffer(collection), this.timespan, this.unit);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public boolean accept(c cVar, U u7) {
            cVar.onNext(u7);
            return true;
        }
    }

    public FlowableBufferTimed(Flowable<T> flowable, long j8, long j9, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable, int i8, boolean z7) {
        super(flowable);
        this.timespan = j8;
        this.timeskip = j9;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSupplier = callable;
        this.maxSize = i8;
        this.restartTimerOnMaxSize = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        if (this.timespan == this.timeskip && this.maxSize == Integer.MAX_VALUE) {
            this.source.subscribe((FlowableSubscriber) new BufferExactUnboundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.unit, this.scheduler));
            return;
        }
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        if (this.timespan == this.timeskip) {
            this.source.subscribe((FlowableSubscriber) new BufferExactBoundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.unit, this.maxSize, this.restartTimerOnMaxSize, createWorker));
        } else {
            this.source.subscribe((FlowableSubscriber) new BufferSkipBoundedSubscriber(new SerializedSubscriber(cVar), this.bufferSupplier, this.timespan, this.timeskip, this.unit, createWorker));
        }
    }
}
