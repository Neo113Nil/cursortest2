package ru.rustore.sdk.core.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public class RuStoreFeatureAvailabilityException extends RuStoreException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuStoreFeatureAvailabilityException(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
