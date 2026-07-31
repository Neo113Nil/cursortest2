package ru.rustore.sdk.reactive.observable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessorFactoryKt;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class CombineCollector implements ObservableObserver<Pair<? extends Integer, ? extends Object>>, Disposable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Object NULL = new Object();

    @NotNull
    private final AtomicInteger completeCountLeft;

    @NotNull
    private final AtomicBoolean disposed;

    @NotNull
    private final ObservableObserver<Object[]> downstream;

    @NotNull
    private final BufferEmitProcessor<Object[]> emitProcessor;

    @NotNull
    private final Object[] results;

    @NotNull
    private final CopyOnWriteArraySet<AtomicReference<Disposable>> upstreamDisposables;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object getNULL() {
            return CombineCollector.NULL;
        }

        private Companion() {
        }
    }

    public CombineCollector(int i4, @NotNull ObservableObserver<Object[]> downstream, @NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        this.downstream = downstream;
        this.disposed = new AtomicBoolean();
        this.upstreamDisposables = new CopyOnWriteArraySet<>();
        this.completeCountLeft = new AtomicInteger(i4);
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = NULL;
        }
        this.results = objArr;
        this.emitProcessor = BufferEmitProcessorFactoryKt.createBufferEmitProcessor$default(backpressureStrategy, this.downstream, null, 2, null);
    }

    private final void disposeUpstreams() {
        Iterator<T> it = this.upstreamDisposables.iterator();
        while (it.hasNext()) {
            Disposable disposable = (Disposable) ((AtomicReference) it.next()).getAndSet(null);
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        if (this.disposed.compareAndSet(false, true)) {
            disposeUpstreams();
            this.emitProcessor.dispose();
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onComplete() {
        if (this.completeCountLeft.decrementAndGet() == 0 && this.disposed.compareAndSet(false, true)) {
            synchronized (this) {
                this.emitProcessor.complete();
                Unit unit = Unit.f41027a;
            }
            this.emitProcessor.drain();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onError(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.emitProcessor.error(e4);
            disposeUpstreams();
            this.emitProcessor.drain();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public /* bridge */ /* synthetic */ void onNext(Pair<? extends Integer, ? extends Object> pair) {
        onNext2((Pair<Integer, ? extends Object>) pair);
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onSubscribe(@NotNull Disposable d4) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        AtomicReference<Disposable> atomicReference = new AtomicReference<>(d4);
        this.upstreamDisposables.add(atomicReference);
        if (isDisposed() && (andSet = atomicReference.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.downstream.onSubscribe(this);
    }

    /* renamed from: onNext, reason: avoid collision after fix types in other method */
    public void onNext2(@NotNull Pair<Integer, ? extends Object> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        synchronized (this) {
            try {
                int intValue = item.component1().intValue();
                Object component2 = item.component2();
                Object[] objArr = this.results;
                objArr[intValue] = component2;
                int length = objArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        BufferEmitProcessor<Object[]> bufferEmitProcessor = this.emitProcessor;
                        Object[] objArr2 = this.results;
                        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                        bufferEmitProcessor.emit(copyOf);
                        break;
                    }
                    if (Intrinsics.areEqual(objArr[i4], NULL)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.emitProcessor.drain();
    }
}
