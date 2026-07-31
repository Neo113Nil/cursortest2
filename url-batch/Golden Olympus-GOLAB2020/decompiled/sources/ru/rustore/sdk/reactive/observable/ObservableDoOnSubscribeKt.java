package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableDoOnSubscribeKt {
    @NotNull
    public static final <T> Observable<T> doOnSubscribe(@NotNull Observable<T> observable, @NotNull Function1<? super Disposable, Unit> block) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new ObservableDoOnSubscribe(observable, block);
    }
}
