package ru.rustore.sdk.reactive.single;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class SingleSubscribeObserver<T> implements SingleObserver<T>, Disposable {

    @NotNull
    private final AtomicBoolean disposed;

    @NotNull
    private final Function1<Throwable, Unit> onErrorCallback;

    @NotNull
    private final Function1<T, Unit> onSuccessCallback;

    @NotNull
    private final AtomicReference<Disposable> upstreamDisposable;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleSubscribeObserver(@NotNull Function1<? super Throwable, Unit> onErrorCallback, @NotNull Function1<? super T, Unit> onSuccessCallback) {
        Intrinsics.checkNotNullParameter(onErrorCallback, "onErrorCallback");
        Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
        this.onErrorCallback = onErrorCallback;
        this.onSuccessCallback = onSuccessCallback;
        this.disposed = new AtomicBoolean();
        this.upstreamDisposable = new AtomicReference<>(null);
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
    public void onError(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.onErrorCallback.invoke(e4);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSubscribe(@NotNull Disposable d4) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (!isDisposed() || (andSet = this.upstreamDisposable.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    @Override // ru.rustore.sdk.reactive.single.SingleObserver
    public void onSuccess(T t4) {
        if (this.disposed.compareAndSet(false, true)) {
            this.onSuccessCallback.invoke(t4);
        }
    }
}
