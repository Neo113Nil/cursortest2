package ru.rustore.sdk.reactive.subject;

import androidx.lifecycle.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C3218h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.backpressure.processor.BufferDropOldestEmitProcessor;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessor;
import ru.rustore.sdk.reactive.backpressure.processor.BufferEmitProcessorFactoryKt;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.observable.Observable;
import ru.rustore.sdk.reactive.observable.ObservableObserver;

@Metadata
/* loaded from: classes3.dex */
public final class MutableSubject<T> implements Subject<T> {

    @NotNull
    private final MutableSubject$downstream$1 downstream;

    @NotNull
    private final CopyOnWriteArraySet<BufferEmitProcessor<T>> observers;

    @NotNull
    private final BufferDropOldestEmitProcessor<T> processor;

    @NotNull
    private final C3218h replayBuffer;

    @NotNull
    private final Object replayBufferMonitor;
    private final int replayCount;

    @Metadata
    private final class SubjectObservable extends Observable<T> {

        @NotNull
        private final BackpressureStrategy backpressureStrategy;
        final /* synthetic */ MutableSubject<T> this$0;

        public SubjectObservable(@NotNull MutableSubject mutableSubject, BackpressureStrategy backpressureStrategy) {
            Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
            this.this$0 = mutableSubject;
            this.backpressureStrategy = backpressureStrategy;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ru.rustore.sdk.reactive.core.Disposable, ru.rustore.sdk.reactive.subject.MutableSubject$SubjectObservable$subscribe$subjectObservableDisposable$1] */
        @Override // ru.rustore.sdk.reactive.observable.Observable
        public void subscribe(@NotNull ObservableObserver<T> downstream) {
            BufferEmitProcessor createBufferEmitProcessor$default;
            Intrinsics.checkNotNullParameter(downstream, "downstream");
            final MutableSubject<T> mutableSubject = this.this$0;
            ?? r02 = new Disposable() { // from class: ru.rustore.sdk.reactive.subject.MutableSubject$SubjectObservable$subscribe$subjectObservableDisposable$1
                private final AtomicBoolean disposed = new AtomicBoolean();
                private final AtomicReference<BufferEmitProcessor<T>> emitProcessorRef = new AtomicReference<>(null);

                private final void disposeInternal() {
                    BufferEmitProcessor bufferEmitProcessor = (BufferEmitProcessor) this.emitProcessorRef.getAndSet(null);
                    if (bufferEmitProcessor != null) {
                        bufferEmitProcessor.dispose();
                        ((MutableSubject) mutableSubject).observers.remove(bufferEmitProcessor);
                    }
                }

                public final void attach(BufferEmitProcessor<T> emitProcessor) {
                    Intrinsics.checkNotNullParameter(emitProcessor, "emitProcessor");
                    r.a(this.emitProcessorRef, null, emitProcessor);
                    if (this.disposed.get()) {
                        disposeInternal();
                    }
                }

                @Override // ru.rustore.sdk.reactive.core.Disposable
                public void dispose() {
                    if (this.disposed.compareAndSet(false, true)) {
                        disposeInternal();
                    }
                }

                @Override // ru.rustore.sdk.reactive.core.Disposable
                public boolean isDisposed() {
                    return this.disposed.get();
                }
            };
            downstream.onSubscribe(r02);
            if (((MutableSubject) this.this$0).replayCount == 0) {
                createBufferEmitProcessor$default = BufferEmitProcessorFactoryKt.createBufferEmitProcessor$default(this.backpressureStrategy, downstream, null, 2, null);
                ((MutableSubject) this.this$0).observers.add(createBufferEmitProcessor$default);
            } else {
                Object obj = ((MutableSubject) this.this$0).replayBufferMonitor;
                MutableSubject<T> mutableSubject2 = this.this$0;
                synchronized (obj) {
                    createBufferEmitProcessor$default = BufferEmitProcessorFactoryKt.createBufferEmitProcessor$default(this.backpressureStrategy, downstream, null, 2, null);
                    createBufferEmitProcessor$default.emitAll(CollectionsKt.toList(((MutableSubject) mutableSubject2).replayBuffer));
                    ((MutableSubject) mutableSubject2).observers.add(createBufferEmitProcessor$default);
                }
            }
            r02.attach(createBufferEmitProcessor$default);
            createBufferEmitProcessor$default.drain();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MutableSubject() {
        this(r2, r2, 3, null);
        int i4 = 0;
    }

    private final void fillBuffer(T t4) {
        if (this.replayCount == 0) {
            return;
        }
        synchronized (this.replayBufferMonitor) {
            try {
                if (this.replayBuffer.size() >= this.replayCount) {
                    this.replayBuffer.p();
                }
                this.replayBuffer.addLast(t4);
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void emit(T t4) {
        fillBuffer(t4);
        this.processor.emit(t4);
        this.processor.drain();
    }

    @Override // ru.rustore.sdk.reactive.subject.Subject
    @NotNull
    public Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return new SubjectObservable(this, backpressureStrategy);
    }

    public MutableSubject(int i4, int i5) {
        this.replayCount = i4;
        this.replayBufferMonitor = new Object();
        this.replayBuffer = new C3218h();
        this.observers = new CopyOnWriteArraySet<>();
        ObservableObserver<T> observableObserver = new ObservableObserver<T>(this) { // from class: ru.rustore.sdk.reactive.subject.MutableSubject$downstream$1
            final /* synthetic */ MutableSubject<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onComplete() {
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onError(Throwable e4) {
                Intrinsics.checkNotNullParameter(e4, "e");
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onNext(T t4) {
                for (BufferEmitProcessor bufferEmitProcessor : ((MutableSubject) this.this$0).observers) {
                    bufferEmitProcessor.emit(t4);
                    bufferEmitProcessor.drain();
                }
            }

            @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
            public void onSubscribe(Disposable d4) {
                Intrinsics.checkNotNullParameter(d4, "d");
            }
        };
        this.downstream = observableObserver;
        this.processor = new BufferDropOldestEmitProcessor<>(observableObserver, i5, null, 4, null);
    }

    public /* synthetic */ MutableSubject(int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? UserVerificationMethods.USER_VERIFY_PATTERN : i5);
    }
}
