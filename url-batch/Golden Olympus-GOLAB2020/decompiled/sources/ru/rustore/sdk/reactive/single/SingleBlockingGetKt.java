package ru.rustore.sdk.reactive.single;

import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public final class SingleBlockingGetKt {
    @NotNull
    public static final <T> Object blockingGet(@NotNull Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        G g4 = new G();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Disposable subscribe = SingleSubscribeKt.subscribe(single, new SingleBlockingGetKt$blockingGet$disposable$1(g4, countDownLatch), new SingleBlockingGetKt$blockingGet$disposable$2(g4, countDownLatch));
        try {
            countDownLatch.await();
            subscribe.dispose();
            Object obj = g4.f41132b;
            if (obj != null) {
                return ((Result) obj).h();
            }
            throw new IllegalArgumentException("Required value was null.");
        } catch (Throwable th) {
            subscribe.dispose();
            throw th;
        }
    }
}
