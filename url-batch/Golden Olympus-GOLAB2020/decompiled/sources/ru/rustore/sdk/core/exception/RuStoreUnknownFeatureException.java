package ru.rustore.sdk.core.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreUnknownFeatureException extends RuStoreFeatureAvailabilityException {
    public RuStoreUnknownFeatureException(@Nullable String str) {
        super(str == null ? "Unknown feature" : str);
    }
}
