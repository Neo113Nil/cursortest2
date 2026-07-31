package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class SingleObserveOn$subscribe$wrappedObserver$1$onSubscribe$1 extends s implements Function0<Unit> {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ SingleObserveOn$subscribe$wrappedObserver$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleObserveOn$subscribe$wrappedObserver$1$onSubscribe$1(SingleObserveOn$subscribe$wrappedObserver$1 singleObserveOn$subscribe$wrappedObserver$1, SingleObserver<T> singleObserver) {
        super(0);
        this.this$0 = singleObserveOn$subscribe$wrappedObserver$1;
        this.$downstream = singleObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m284invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m284invoke() {
        if (this.this$0.isDisposed()) {
            return;
        }
        this.$downstream.onSubscribe(this.this$0);
    }
}
