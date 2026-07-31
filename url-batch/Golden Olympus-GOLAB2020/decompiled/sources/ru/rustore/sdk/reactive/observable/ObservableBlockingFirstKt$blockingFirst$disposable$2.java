package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class ObservableBlockingFirstKt$blockingFirst$disposable$2 extends s implements Function0<Unit> {
    final /* synthetic */ CountDownLatch $countdownLatch;
    final /* synthetic */ G $result;
    final /* synthetic */ AtomicBoolean $valueReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableBlockingFirstKt$blockingFirst$disposable$2(AtomicBoolean atomicBoolean, G g4, CountDownLatch countDownLatch) {
        super(0);
        this.$valueReceived = atomicBoolean;
        this.$result = g4;
        this.$countdownLatch = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m274invoke();
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m274invoke() {
        if (this.$valueReceived.compareAndSet(false, true)) {
            G g4 = this.$result;
            Result.Companion companion = Result.Companion;
            g4.f41132b = Result.a(Result.m243constructorimpl(ResultKt.createFailure(new IllegalStateException("onComplete() called before value was received in blockingFirst()"))));
            this.$countdownLatch.countDown();
        }
    }
}
