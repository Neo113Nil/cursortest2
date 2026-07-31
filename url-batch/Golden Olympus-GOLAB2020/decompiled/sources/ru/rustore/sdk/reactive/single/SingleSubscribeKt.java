package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;
import ru.rustore.sdk.reactive.core.ErrorStubKt;

@Metadata
/* loaded from: classes3.dex */
public final class SingleSubscribeKt {
    @NotNull
    public static final <T> Disposable subscribe(@NotNull Single<T> single, @NotNull Function1<? super Throwable, Unit> onError, @NotNull Function1<? super T, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        SingleSubscribeObserver singleSubscribeObserver = new SingleSubscribeObserver(onError, onSuccess);
        single.subscribe(singleSubscribeObserver);
        return singleSubscribeObserver;
    }

    public static /* synthetic */ Disposable subscribe$default(Single single, Function1 function1, Function1 function12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            function1 = ErrorStubKt.getErrorStub();
        }
        return subscribe(single, function1, function12);
    }
}
