package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public final class SingleEmitterImpl<T> implements SingleEmitter<T>, Disposable {

    @NotNull
    private final AtomicBoolean disposed;

    @NotNull
    private final SingleObserver<T> downstream;

    @NotNull
    private final AtomicReference<Function0<Unit>> onFinishReference;

    public SingleEmitterImpl(@NotNull SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.downstream = downstream;
        this.disposed = new AtomicBoolean();
        this.onFinishReference = new AtomicReference<>(null);
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        Function0<Unit> function0;
        if (!this.disposed.compareAndSet(false, true) || (function0 = this.onFinishReference.get()) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // ru.rustore.sdk.reactive.single.SingleEmitter
    public void error(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.disposed.compareAndSet(false, true)) {
            Function0<Unit> function0 = this.onFinishReference.get();
            if (function0 != null) {
                function0.invoke();
            }
            this.downstream.onError(error);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleEmitter, ru.rustore.sdk.reactive.core.Disposable
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // ru.rustore.sdk.reactive.single.SingleEmitter
    public void onFinish(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (isDisposed()) {
            block.invoke();
        } else {
            this.onFinishReference.set(block);
        }
    }

    @Override // ru.rustore.sdk.reactive.single.SingleEmitter
    public void success(T t4) {
        if (this.disposed.compareAndSet(false, true)) {
            Function0<Unit> function0 = this.onFinishReference.get();
            if (function0 != null) {
                function0.invoke();
            }
            this.downstream.onSuccess(t4);
        }
    }
}
