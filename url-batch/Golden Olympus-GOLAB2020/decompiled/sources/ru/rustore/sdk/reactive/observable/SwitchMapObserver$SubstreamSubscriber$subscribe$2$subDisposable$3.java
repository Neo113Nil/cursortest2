package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata
/* loaded from: classes3.dex */
final class SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$3<R> extends s implements Function1<R, Unit> {
    final /* synthetic */ SwitchMapObserver<T, R>.SubstreamSubscriber this$0;
    final /* synthetic */ SwitchMapObserver<T, R> this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$3(SwitchMapObserver<T, R>.SubstreamSubscriber substreamSubscriber, SwitchMapObserver<T, R> switchMapObserver) {
        super(1);
        this.this$0 = substreamSubscriber;
        this.this$1 = switchMapObserver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m279invoke((SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$3<R>) obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m279invoke(R r4) {
        if (this.this$0.isDisposed()) {
            return;
        }
        ((SwitchMapObserver) this.this$1).emitProcessor.emit(r4);
        ((SwitchMapObserver) this.this$1).emitProcessor.drain();
    }
}
