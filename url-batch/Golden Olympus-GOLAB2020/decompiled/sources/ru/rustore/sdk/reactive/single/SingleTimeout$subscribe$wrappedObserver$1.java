package ru.rustore.sdk.reactive.single;

import androidx.lifecycle.r;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class SingleTimeout$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ SingleTimeout<T> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);
    private final AtomicReference<Disposable> delayedTaskDisposable = new AtomicReference<>(null);

    SingleTimeout$subscribe$wrappedObserver$1(SingleTimeout<T> singleTimeout, SingleObserver<T> singleObserver) {
        this.this$0 = singleTimeout;
        this.$downstream = singleObserver;
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        if (this.disposed.compareAndSet(false, true)) {
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            Disposable andSet2 = this.delayedTaskDisposable.getAndSet(null);
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
            Disposable andSet = this.delayedTaskDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            this.$downstream.onError(e4);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d4) {
        Dispatcher dispatcher;
        long j4;
        TimeUnit timeUnit;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (this.disposed.get()) {
            Disposable andSet = this.upstreamDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            Disposable andSet2 = this.delayedTaskDisposable.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
        } else {
            dispatcher = ((SingleTimeout) this.this$0).dispatcher;
            j4 = ((SingleTimeout) this.this$0).delay;
            timeUnit = ((SingleTimeout) this.this$0).timeUnit;
            Disposable andSet3 = this.delayedTaskDisposable.getAndSet(dispatcher.executeDelayed(j4, timeUnit, new SingleTimeout$subscribe$wrappedObserver$1$onSubscribe$delayedTask$1(this, this.this$0)));
            if (andSet3 != null) {
                andSet3.dispose();
            }
        }
        this.$downstream.onSubscribe(this);
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T t4) {
        if (this.disposed.compareAndSet(false, true)) {
            Disposable andSet = this.delayedTaskDisposable.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            this.$downstream.onSuccess(t4);
        }
    }
}
