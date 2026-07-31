package ru.rustore.sdk.reactive.single;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.single.SingleFlatMap;
import ru.rustore.sdk.reactive.single.SingleFlatMap.SingleFlatMapSubscriber;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class SingleFlatMap$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    final /* synthetic */ SingleObserver<R> $downstream;
    final /* synthetic */ SingleFlatMap<T, R> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);
    private final AtomicReference<Disposable> substreamDisposable = new AtomicReference<>(null);

    SingleFlatMap$subscribe$wrappedObserver$1(SingleObserver<R> singleObserver, SingleFlatMap<T, R> singleFlatMap) {
        this.$downstream = singleObserver;
        this.this$0 = singleFlatMap;
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        if (this.disposed.compareAndSet(false, true)) {
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            Disposable andSet2 = this.substreamDisposable.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onError(Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.$downstream.onError(e4);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d4) {
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (this.disposed.get()) {
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            Disposable andSet2 = this.substreamDisposable.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
        }
        this.$downstream.onSubscribe(this);
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T t4) {
        if (this.disposed.compareAndSet(false, true)) {
            SingleFlatMap.SingleFlatMapSubscriber singleFlatMapSubscriber = this.this$0.new SingleFlatMapSubscriber();
            this.substreamDisposable.set(singleFlatMapSubscriber);
            singleFlatMapSubscriber.subscribe(this.$downstream, t4);
        }
    }
}
