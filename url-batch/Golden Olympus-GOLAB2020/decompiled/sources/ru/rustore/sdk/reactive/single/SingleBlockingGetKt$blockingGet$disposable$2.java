package ru.rustore.sdk.reactive.single;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
final class SingleBlockingGetKt$blockingGet$disposable$2<T> extends s implements Function1<T, Unit> {
    final /* synthetic */ CountDownLatch $countDownLatch;
    final /* synthetic */ G $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleBlockingGetKt$blockingGet$disposable$2(G g4, CountDownLatch countDownLatch) {
        super(1);
        this.$result = g4;
        this.$countDownLatch = countDownLatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m280invoke((SingleBlockingGetKt$blockingGet$disposable$2<T>) obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m280invoke(T t4) {
        this.$result.f41132b = Result.a(Result.m243constructorimpl(t4));
        this.$countDownLatch.countDown();
    }
}
