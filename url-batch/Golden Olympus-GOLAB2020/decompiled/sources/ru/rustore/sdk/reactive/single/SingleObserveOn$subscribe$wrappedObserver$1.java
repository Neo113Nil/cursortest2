package ru.rustore.sdk.reactive.single;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Disposable;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
public final class SingleObserveOn$subscribe$wrappedObserver$1<T> implements SingleObserver<T>, Disposable {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ SingleObserveOn<T> this$0;
    private final AtomicBoolean disposed = new AtomicBoolean();
    private final AtomicReference<Disposable> upstreamDisposable = new AtomicReference<>(null);

    SingleObserveOn$subscribe$wrappedObserver$1(SingleObserveOn<T> singleObserveOn, SingleObserver<T> singleObserver) {
        this.this$0 = singleObserveOn;
        this.$downstream = singleObserver;
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

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onError(Throwable e4) {
        Dispatcher dispatcher;
        Intrinsics.checkNotNullParameter(e4, "e");
        dispatcher = ((SingleObserveOn) this.this$0).dispatcher;
        dispatcher.execute(new SingleObserveOn$subscribe$wrappedObserver$1$onError$1(this, this.$downstream, e4));
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(Disposable d4) {
        Dispatcher dispatcher;
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (isDisposed() && (andSet = this.upstreamDisposable.getAndSet(null)) != null) {
            andSet.dispose();
        }
        dispatcher = ((SingleObserveOn) this.this$0).dispatcher;
        dispatcher.execute(new SingleObserveOn$subscribe$wrappedObserver$1$onSubscribe$1(this, this.$downstream));
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T t4) {
        Dispatcher dispatcher;
        dispatcher = ((SingleObserveOn) this.this$0).dispatcher;
        dispatcher.execute(new SingleObserveOn$subscribe$wrappedObserver$1$onSuccess$1(this, this.$downstream, t4));
    }
}
