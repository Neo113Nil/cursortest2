package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class SingleObserveOn$subscribe$wrappedObserver$1$onError$1 extends s implements Function0<Unit> {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ Throwable $e;
    final /* synthetic */ SingleObserveOn$subscribe$wrappedObserver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleObserveOn$subscribe$wrappedObserver$1$onError$1(SingleObserveOn$subscribe$wrappedObserver$1 singleObserveOn$subscribe$wrappedObserver$1, SingleObserver<T> singleObserver, Throwable th) {
        super(0);
        this.this$0 = singleObserveOn$subscribe$wrappedObserver$1;
        this.$downstream = singleObserver;
        this.$e = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m283invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m283invoke() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.this$0.disposed;
        if (atomicBoolean.compareAndSet(false, true)) {
            this.$downstream.onError(this.$e);
        }
    }
}
