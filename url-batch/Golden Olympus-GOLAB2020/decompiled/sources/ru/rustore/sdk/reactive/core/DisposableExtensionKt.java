package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class DisposableExtensionKt {
    public static final void ifNotDisposed(@NotNull Disposable disposable, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(disposable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (disposable.isDisposed()) {
            return;
        }
        block.invoke();
    }
}
