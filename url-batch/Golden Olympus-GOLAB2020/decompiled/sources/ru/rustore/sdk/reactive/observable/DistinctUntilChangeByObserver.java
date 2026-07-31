package ru.rustore.sdk.reactive.observable;

import androidx.lifecycle.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class DistinctUntilChangeByObserver<T> implements ObservableObserver<T>, Disposable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Object NULL = new Object();

    @NotNull
    private final Function2<T, T, Boolean> comparator;

    @NotNull
    private final AtomicBoolean disposed;

    @NotNull
    private final ObservableObserver<T> downstream;

    @Nullable
    private volatile Object oldProceedValue;

    @NotNull
    private final AtomicReference<Disposable> upstreamDisposable;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object getNULL() {
            return DistinctUntilChangeByObserver.NULL;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctUntilChangeByObserver(@NotNull ObservableObserver<T> downstream, @NotNull Function2<? super T, ? super T, Boolean> comparator) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.downstream = downstream;
        this.comparator = comparator;
        this.disposed = new AtomicBoolean();
        this.upstreamDisposable = new AtomicReference<>(null);
        this.oldProceedValue = NULL;
    }

    private static /* synthetic */ void getOldProceedValue$annotations() {
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

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onComplete() {
        if (this.disposed.compareAndSet(false, true)) {
            this.downstream.onComplete();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onError(@NotNull Throwable e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        if (this.disposed.compareAndSet(false, true)) {
            this.downstream.onError(e4);
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onNext(T t4) {
        Object m243constructorimpl;
        boolean z4;
        try {
            Result.Companion companion = Result.Companion;
            Object obj = this.oldProceedValue;
            if (Intrinsics.areEqual(obj, NULL)) {
                this.oldProceedValue = t4;
                z4 = true;
            } else {
                boolean booleanValue = ((Boolean) this.comparator.invoke(obj, t4)).booleanValue();
                z4 = !booleanValue;
                if (!booleanValue) {
                    this.oldProceedValue = t4;
                }
            }
            m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(z4));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.f(m243constructorimpl) && ((Boolean) m243constructorimpl).booleanValue() && !isDisposed()) {
            this.downstream.onNext(t4);
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 == null || !this.disposed.compareAndSet(false, true)) {
            return;
        }
        Disposable andSet = this.upstreamDisposable.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
        this.downstream.onError(d4);
    }

    @Override // ru.rustore.sdk.reactive.observable.ObservableObserver
    public void onSubscribe(@NotNull Disposable d4) {
        Disposable andSet;
        Intrinsics.checkNotNullParameter(d4, "d");
        r.a(this.upstreamDisposable, null, d4);
        if (isDisposed() && (andSet = this.upstreamDisposable.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.downstream.onSubscribe(this);
    }
}
