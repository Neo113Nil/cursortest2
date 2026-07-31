package ru.rustore.sdk.reactive.single;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
final class SingleTimeout$subscribe$wrappedObserver$1$onSubscribe$delayedTask$1 extends s implements Function0<Unit> {
    final /* synthetic */ SingleTimeout$subscribe$wrappedObserver$1 this$0;
    final /* synthetic */ SingleTimeout<T> this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleTimeout$subscribe$wrappedObserver$1$onSubscribe$delayedTask$1(SingleTimeout$subscribe$wrappedObserver$1 singleTimeout$subscribe$wrappedObserver$1, SingleTimeout<T> singleTimeout) {
        super(0);
        this.this$0 = singleTimeout$subscribe$wrappedObserver$1;
        this.this$1 = singleTimeout;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m287invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m287invoke() {
        AtomicReference atomicReference;
        long j4;
        TimeUnit timeUnit;
        atomicReference = this.this$0.upstreamDisposable;
        Disposable disposable = (Disposable) atomicReference.getAndSet(null);
        if (disposable != null) {
            disposable.dispose();
        }
        SingleTimeout$subscribe$wrappedObserver$1 singleTimeout$subscribe$wrappedObserver$1 = this.this$0;
        StringBuilder sb = new StringBuilder();
        sb.append("No value after timeout ");
        j4 = ((SingleTimeout) this.this$1).delay;
        sb.append(j4);
        sb.append(' ');
        timeUnit = ((SingleTimeout) this.this$1).timeUnit;
        sb.append(timeUnit);
        singleTimeout$subscribe$wrappedObserver$1.onError(new TimeoutException(sb.toString()));
    }
}
