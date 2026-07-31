package ru.rustore.sdk.reactive.single;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.SingleFlatMap;

@Metadata
/* loaded from: classes3.dex */
final class SingleFlatMap<T, R> extends Single<R> {

    @NotNull
    private final Function1<T, Single<R>> mapper;

    @NotNull
    private final Single<T> upstream;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    final class SingleFlatMapSubscriber implements Disposable {

        @NotNull
        private final AtomicBoolean disposed = new AtomicBoolean();

        @NotNull
        private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

        public SingleFlatMapSubscriber() {
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public void dispose() {
            Disposable andSet;
            if (!this.disposed.compareAndSet(false, true) || (andSet = this.upstreamDisposable.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        @Override // ru.rustore.sdk.reactive.core.Disposable
        public boolean isDisposed() {
            return this.disposed.get();
        }

        public final void subscribe(@NotNull final SingleObserver<R> downstream, T t4) {
            Object m243constructorimpl;
            Intrinsics.checkNotNullParameter(downstream, "downstream");
            SingleObserver<R> singleObserver = new SingleObserver<R>(this) { // from class: ru.rustore.sdk.reactive.single.SingleFlatMap$SingleFlatMapSubscriber$subscribe$singleFlatMapObserver$1
                final /* synthetic */ SingleFlatMap<T, R>.SingleFlatMapSubscriber this$0;

                {
                    this.this$0 = this;
                }

                @Override // ru.rustore.sdk.reactive.single.SingleObserver
                public void onError(Throwable e4) {
                    AtomicBoolean atomicBoolean;
                    Intrinsics.checkNotNullParameter(e4, "e");
                    atomicBoolean = ((SingleFlatMap.SingleFlatMapSubscriber) this.this$0).disposed;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        downstream.onError(e4);
                    }
                }

                @Override // ru.rustore.sdk.reactive.single.SingleObserver
                public void onSubscribe(Disposable d4) {
                    AtomicReference atomicReference;
                    AtomicReference atomicReference2;
                    Intrinsics.checkNotNullParameter(d4, "d");
                    atomicReference = ((SingleFlatMap.SingleFlatMapSubscriber) this.this$0).upstreamDisposable;
                    r.a(atomicReference, null, d4);
                    if (this.this$0.isDisposed()) {
                        atomicReference2 = ((SingleFlatMap.SingleFlatMapSubscriber) this.this$0).upstreamDisposable;
                        Disposable disposable = (Disposable) atomicReference2.getAndSet(null);
                        if (disposable != null) {
                            disposable.dispose();
                        }
                    }
                }

                @Override // ru.rustore.sdk.reactive.single.SingleObserver
                public void onSuccess(R r4) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = ((SingleFlatMap.SingleFlatMapSubscriber) this.this$0).disposed;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        downstream.onSuccess(r4);
                    }
                }
            };
            if (isDisposed()) {
                return;
            }
            SingleFlatMap<T, R> singleFlatMap = SingleFlatMap.this;
            try {
                Result.Companion companion = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl((Single) ((SingleFlatMap) singleFlatMap).mapper.invoke(t4));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.f(m243constructorimpl)) {
                Single single = (Single) m243constructorimpl;
                if (!isDisposed()) {
                    single.subscribe(singleObserver);
                }
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 == null || isDisposed()) {
                return;
            }
            singleObserver.onError(d4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleFlatMap(@NotNull Single<T> upstream, @NotNull Function1<? super T, ? extends Single<R>> mapper) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.upstream = upstream;
        this.mapper = mapper;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<R> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleFlatMap$subscribe$wrappedObserver$1(downstream, this));
    }
}
