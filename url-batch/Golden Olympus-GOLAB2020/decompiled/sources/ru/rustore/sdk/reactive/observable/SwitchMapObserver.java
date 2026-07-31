package ru.rustore.sdk.reactive.observable;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessorFactoryKt;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class SwitchMapObserver<T, R> implements ObservableObserver<T>, Disposable {

    @NotNull
    private final AtomicReference<Disposable> actualSubstream;

    @NotNull
    private final AtomicInteger completionsLeftCount;

    @NotNull
    private final ObservableObserver<R> downstream;

    @NotNull
    private final BufferEmitProcessor<R> emitProcessor;

    @NotNull
    private final Function1<T, Observable<R>> mapper;

    @NotNull
    private final AtomicBoolean switchMapDisposed;

    @NotNull
    private final AtomicReference<Disposable> upstreamDisposable;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class SubstreamSubscriber implements Disposable {

        @NotNull
        private final AtomicReference<Disposable> substreamDisposable = new AtomicReference<>(null);

        @NotNull
        private final AtomicBoolean substreamDisposed = new AtomicBoolean();

        public SubstreamSubscriber() {
        }

        private final void attachSubstream(Disposable disposable) {
            Disposable andSet;
            r.a(this.substreamDisposable, null, disposable);
            if (!isDisposed() || (andSet = this.substreamDisposable.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sendError(Throwable th) {
            if (this.substreamDisposed.compareAndSet(false, true) && ((SwitchMapObserver) SwitchMapObserver.this).switchMapDisposed.compareAndSet(false, true)) {
                Disposable andSet = this.substreamDisposable.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                ((SwitchMapObserver) SwitchMapObserver.this).emitProcessor.error(th);
                ((SwitchMapObserver) SwitchMapObserver.this).emitProcessor.drain();
            }
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public void dispose() {
            if (this.substreamDisposed.compareAndSet(false, true)) {
                ((SwitchMapObserver) SwitchMapObserver.this).completionsLeftCount.decrementAndGet();
                Disposable andSet = this.substreamDisposable.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public boolean isDisposed() {
            return this.substreamDisposed.get();
        }

        public final void subscribe(T t4) {
            Object m243constructorimpl;
            if (isDisposed()) {
                return;
            }
            SwitchMapObserver<T, R> switchMapObserver = SwitchMapObserver.this;
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl((Observable) ((SwitchMapObserver) switchMapObserver).mapper.invoke(t4));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            SwitchMapObserver<T, R> switchMapObserver2 = SwitchMapObserver.this;
            if (Result.f(m243constructorimpl)) {
                attachSubstream(ObservableSubscribeKt.subscribe((Observable) m243constructorimpl, new SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$1(this), new SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$2(this, switchMapObserver2), new SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$3(this, switchMapObserver2)));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                sendError(d4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwitchMapObserver(@NotNull ObservableObserver<R> downstream, @NotNull Function1<? super T, ? extends Observable<R>> mapper, @NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        this.downstream = downstream;
        this.mapper = mapper;
        this.switchMapDisposed = new AtomicBoolean();
        this.actualSubstream = new AtomicReference<>(null);
        this.upstreamDisposable = new AtomicReference<>(null);
        this.emitProcessor = BufferEmitProcessorFactoryKt.createBufferEmitProcessor$default(backpressureStrategy, downstream, null, 2, null);
        this.completionsLeftCount = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerOnComplete() {
        if (this.completionsLeftCount.get() == 0 && this.switchMapDisposed.compareAndSet(false, true)) {
            this.emitProcessor.complete();
            this.emitProcessor.drain();
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        if (this.switchMapDisposed.compareAndSet(false, true)) {
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            Disposable andSet2 = this.actualSubstream.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return this.switchMapDisposed.get();
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onComplete() {
        this.completionsLeftCount.decrementAndGet();
        innerOnComplete();
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onError(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.switchMapDisposed.compareAndSet(false, true)) {
            Disposable andSet = this.actualSubstream.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            this.emitProcessor.error(e4);
            this.emitProcessor.drain();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onNext(T t4) {
        if (isDisposed()) {
            return;
        }
        this.completionsLeftCount.incrementAndGet();
        SubstreamSubscriber substreamSubscriber = new SubstreamSubscriber();
        Disposable andSet = this.actualSubstream.getAndSet(substreamSubscriber);
        if (andSet != null) {
            andSet.dispose();
        }
        if (isDisposed()) {
            return;
        }
        substreamSubscriber.subscribe(t4);
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onSubscribe(@NotNull Disposable d4) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (this.switchMapDisposed.get() && (andSet = this.upstreamDisposable.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.downstream.onSubscribe(this);
    }
}
