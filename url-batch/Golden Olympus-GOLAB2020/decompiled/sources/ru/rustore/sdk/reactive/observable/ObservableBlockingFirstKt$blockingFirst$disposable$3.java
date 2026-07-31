package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata
/* loaded from: classes3.dex */
final class ObservableBlockingFirstKt$blockingFirst$disposable$3<T> extends s implements Function1<T, Unit> {
    final /* synthetic */ CountDownLatch $countdownLatch;
    final /* synthetic */ G $result;
    final /* synthetic */ AtomicBoolean $valueReceived;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservableBlockingFirstKt$blockingFirst$disposable$3(AtomicBoolean atomicBoolean, G g4, CountDownLatch countDownLatch) {
        super(1);
        this.$valueReceived = atomicBoolean;
        this.$result = g4;
        this.$countdownLatch = countDownLatch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m275invoke((ObservableBlockingFirstKt$blockingFirst$disposable$3<T>) obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m275invoke(T t4) {
        if (this.$valueReceived.compareAndSet(false, true)) {
            this.$result.f41132b = Result.a(Result.m243constructorimpl(t4));
            this.$countdownLatch.countDown();
        }
    }
}
