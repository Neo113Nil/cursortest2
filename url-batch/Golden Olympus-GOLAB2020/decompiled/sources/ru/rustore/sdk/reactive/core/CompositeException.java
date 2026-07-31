package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class CompositeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeException(@NotNull String message, @NotNull Throwable... cause) {
        super(message, (Throwable) AbstractC3219i.H(cause));
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
