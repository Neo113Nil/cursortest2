package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class ObservableSubscribeOn$subscribe$1 extends s implements Function0<Unit> {
    final /* synthetic */ ObservableObserver<T> $downstream;
    final /* synthetic */ ObservableSubscribeOn<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableSubscribeOn$subscribe$1(ObservableSubscribeOn<T> observableSubscribeOn, ObservableObserver<T> observableObserver) {
        super(0);
        this.this$0 = observableSubscribeOn;
        this.$downstream = observableObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m277invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m277invoke() {
        Observable observable;
        observable = ((ObservableSubscribeOn) this.this$0).upstream;
        observable.subscribe(this.$downstream);
    }
}
