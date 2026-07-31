package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableBlockingFirstKt {
    @NotNull
    public static final <T> Object blockingFirst(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        G g4 = new G();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Disposable subscribe = ObservableSubscribeKt.subscribe(observable, new ObservableBlockingFirstKt$blockingFirst$disposable$1(atomicBoolean, g4, countDownLatch), new ObservableBlockingFirstKt$blockingFirst$disposable$2(atomicBoolean, g4, countDownLatch), new ObservableBlockingFirstKt$blockingFirst$disposable$3(atomicBoolean, g4, countDownLatch));
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
