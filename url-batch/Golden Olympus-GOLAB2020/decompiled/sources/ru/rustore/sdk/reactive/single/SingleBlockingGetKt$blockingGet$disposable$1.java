package ru.rustore.sdk.reactive.single;

import java.util.concurrent.CountDownLatch;
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
final class SingleBlockingGetKt$blockingGet$disposable$1 extends s implements Function1<Throwable, Unit> {
    final /* synthetic */ CountDownLatch $countDownLatch;
    final /* synthetic */ G $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleBlockingGetKt$blockingGet$disposable$1(G g4, CountDownLatch countDownLatch) {
        super(1);
        this.$result = g4;
        this.$countDownLatch = countDownLatch;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f41027a;
    }

    public final void invoke(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        G g4 = this.$result;
        Result.Companion companion = Result.Companion;
        g4.f41132b = Result.a(Result.m243constructorimpl(ResultKt.createFailure(error)));
        this.$countDownLatch.countDown();
    }
}
