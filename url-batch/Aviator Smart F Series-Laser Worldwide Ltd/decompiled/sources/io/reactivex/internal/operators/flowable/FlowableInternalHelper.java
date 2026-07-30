package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableInternalHelper {

    static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;

        BufferedReplayCallable(Flowable<T> flowable, int i8) {
            this.parent = flowable;
            this.bufferSize = i8;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize);
        }
    }

    static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        BufferedTimedReplay(Flowable<T> flowable, int i8, long j8, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i8;
            this.time = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    static final class FlatMapIntoIterable<T, U> implements Function<T, b> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ b apply(Object obj) {
            return apply((FlatMapIntoIterable<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public b apply(T t7) {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t7), "The mapper returned a null Iterable"));
        }
    }

    static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t, reason: collision with root package name */
        private final T f16976t;

        FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t7) {
            this.combiner = biFunction;
            this.f16976t = t7;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u7) {
            return this.combiner.apply(this.f16976t, u7);
        }
    }

    static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, b> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends b> mapper;

        FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends b> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ b apply(Object obj) {
            return apply((FlatMapWithCombinerOuter<T, R, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public b apply(T t7) {
            return new FlowableMapPublisher((b) ObjectHelper.requireNonNull(this.mapper.apply(t7), "The mapper returned a null Publisher"), new FlatMapWithCombinerInner(this.combiner, t7));
        }
    }

    static final class ItemDelayFunction<T, U> implements Function<T, b> {
        final Function<? super T, ? extends b> itemDelay;

        ItemDelayFunction(Function<? super T, ? extends b> function) {
            this.itemDelay = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ b apply(Object obj) {
            return apply((ItemDelayFunction<T, U>) obj);
        }

        @Override // io.reactivex.functions.Function
        public b apply(T t7) {
            return new FlowableTakePublisher((b) ObjectHelper.requireNonNull(this.itemDelay.apply(t7), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(t7)).defaultIfEmpty(t7);
        }
    }

    static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;

        ReplayCallable(Flowable<T> flowable) {
            this.parent = flowable;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay();
        }
    }

    static final class ReplayFunction<T, R> implements Function<Flowable<T>, b> {
        private final Scheduler scheduler;
        private final Function<? super Flowable<T>, ? extends b> selector;

        ReplayFunction(Function<? super Flowable<T>, ? extends b> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public b apply(Flowable<T> flowable) {
            return Flowable.fromPublisher((b) ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }
    }

    public enum RequestMax implements Consumer<d> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(d dVar) {
            dVar.request(Long.MAX_VALUE);
        }
    }

    static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final BiConsumer<S, Emitter<T>> consumer;

        SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleBiGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s7, Emitter<T> emitter) {
            this.consumer.accept(s7, emitter);
            return s7;
        }
    }

    static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        final Consumer<Emitter<T>> consumer;

        SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleGenerator<T, S>) obj, (Emitter) obj2);
        }

        public S apply(S s7, Emitter<T> emitter) {
            this.consumer.accept(emitter);
            return s7;
        }
    }

    static final class SubscriberOnComplete<T> implements Action {
        final c subscriber;

        SubscriberOnComplete(c cVar) {
            this.subscriber = cVar;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.subscriber.onComplete();
        }
    }

    static final class SubscriberOnError<T> implements Consumer<Throwable> {
        final c subscriber;

        SubscriberOnError(c cVar) {
            this.subscriber = cVar;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            this.subscriber.onError(th);
        }
    }

    static final class SubscriberOnNext<T> implements Consumer<T> {
        final c subscriber;

        SubscriberOnNext(c cVar) {
            this.subscriber = cVar;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t7) {
            this.subscriber.onNext(t7);
        }
    }

    static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        TimedReplay(Flowable<T> flowable, long j8, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.time = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    static final class ZipIterableFunction<T, R> implements Function<List<b>, b> {
        private final Function<? super Object[], ? extends R> zipper;

        ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }

        @Override // io.reactivex.functions.Function
        public b apply(List<b> list) {
            return Flowable.zipIterable(list, this.zipper, false, Flowable.bufferSize());
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, b> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, b> flatMapWithCombiner(Function<? super T, ? extends b> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, b> itemDelay(Function<? super T, ? extends b> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new ReplayCallable(flowable);
    }

    public static <T, R> Function<Flowable<T>, b> replayFunction(Function<? super Flowable<T>, ? extends b> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(c cVar) {
        return new SubscriberOnComplete(cVar);
    }

    public static <T> Consumer<Throwable> subscriberOnError(c cVar) {
        return new SubscriberOnError(cVar);
    }

    public static <T> Consumer<T> subscriberOnNext(c cVar) {
        return new SubscriberOnNext(cVar);
    }

    public static <T, R> Function<List<b>, b> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i8) {
        return new BufferedReplayCallable(flowable, i8);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i8, long j8, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplay(flowable, i8, j8, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j8, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplay(flowable, j8, timeUnit, scheduler);
    }
}
