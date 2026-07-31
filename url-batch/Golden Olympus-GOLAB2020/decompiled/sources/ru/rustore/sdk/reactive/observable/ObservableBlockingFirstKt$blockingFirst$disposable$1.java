package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class ObservableBlockingFirstKt$blockingFirst$disposable$1 extends s implements Function1<Throwable, Unit> {
    final /* synthetic */ CountDownLatch $countdownLatch;
    final /* synthetic */ G $result;
    final /* synthetic */ AtomicBoolean $valueReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableBlockingFirstKt$blockingFirst$disposable$1(AtomicBoolean atomicBoolean, G g4, CountDownLatch countDownLatch) {
        super(1);
        this.$valueReceived = atomicBoolean;
        this.$result = g4;
        this.$countdownLatch = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f41027a;
    }

    public final void invoke(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.$valueReceived.compareAndSet(false, true)) {
            G g4 = this.$result;
            Result.Companion companion = Result.Companion;
            g4.f41132b = Result.a(Result.m243constructorimpl(ResultKt.createFailure(error)));
            this.$countdownLatch.countDown();
        }
    }
}
