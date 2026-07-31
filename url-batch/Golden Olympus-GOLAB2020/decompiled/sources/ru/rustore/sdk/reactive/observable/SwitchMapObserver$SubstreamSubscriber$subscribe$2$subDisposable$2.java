package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.reactive.observable.SwitchMapObserver;

@Metadata
/* loaded from: classes3.dex */
final class SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$2 extends s implements Function0<Unit> {
    final /* synthetic */ SwitchMapObserver<T, R>.SubstreamSubscriber this$0;
    final /* synthetic */ SwitchMapObserver<T, R> this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchMapObserver$SubstreamSubscriber$subscribe$2$subDisposable$2(SwitchMapObserver<T, R>.SubstreamSubscriber substreamSubscriber, SwitchMapObserver<T, R> switchMapObserver) {
        super(0);
        this.this$0 = substreamSubscriber;
        this.this$1 = switchMapObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m278invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m278invoke() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = ((SwitchMapObserver.SubstreamSubscriber) this.this$0).substreamDisposed;
        if (atomicBoolean.compareAndSet(false, true)) {
            ((SwitchMapObserver) this.this$1).completionsLeftCount.decrementAndGet();
            this.this$1.innerOnComplete();
        }
    }
}
