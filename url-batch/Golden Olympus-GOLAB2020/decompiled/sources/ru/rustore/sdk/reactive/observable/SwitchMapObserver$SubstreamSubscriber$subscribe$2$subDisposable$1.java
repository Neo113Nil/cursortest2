package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$1 extends s implements Function1<Throwable, Unit> {
    final /* synthetic */ SwitchMapObserver<T, R>.SubstreamSubscriber this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$1(SwitchMapObserver<T, R>.SubstreamSubscriber substreamSubscriber) {
        super(1);
        this.this$0 = substreamSubscriber;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f41027a;
    }

    public final void invoke(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.this$0.sendError(error);
    }
}
