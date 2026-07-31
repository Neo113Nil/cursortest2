package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class TakeCountException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeCountException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
