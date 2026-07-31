package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.core.ErrorStubKt;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableSubscribeKt {
    @NotNull
    public static final <T> Disposable subscribe(@NotNull Observable<T> observable, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function0<Unit> onComplete, @NotNull Function1<? super T, Unit> onNext) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        ObservableSubscribeObserver observableSubscribeObserver = new ObservableSubscribeObserver(onError, onComplete, onNext);
        observable.subscribe(observableSubscribeObserver);
        return observableSubscribeObserver;
    }

    public static /* synthetic */ Disposable subscribe$default(Observable observable, Function1 function1, Function0 function0, Function1 function12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function1 = ErrorStubKt.getErrorStub();
        }
        if ((i4 & 2) != 0) {
            function0 = ObservableSubscribeKt$subscribe$1.INSTANCE;
        }
        return subscribe(observable, function1, function0, function12);
    }
}
