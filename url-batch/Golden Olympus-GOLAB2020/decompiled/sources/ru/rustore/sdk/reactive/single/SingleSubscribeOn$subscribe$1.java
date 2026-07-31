package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class SingleSubscribeOn$subscribe$1 extends s implements Function0<Unit> {
    final /* synthetic */ SingleObserver<T> $downstream;
    final /* synthetic */ SingleSubscribeOn<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleSubscribeOn$subscribe$1(SingleSubscribeOn<T> singleSubscribeOn, SingleObserver<T> singleObserver) {
        super(0);
        this.this$0 = singleSubscribeOn;
        this.$downstream = singleObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m286invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m286invoke() {
        Single single;
        single = ((SingleSubscribeOn) this.this$0).upstream;
        single.subscribe(this.$downstream);
    }
}
