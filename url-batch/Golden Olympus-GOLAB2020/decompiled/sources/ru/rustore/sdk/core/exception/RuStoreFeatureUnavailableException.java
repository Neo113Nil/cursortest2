package ru.rustore.sdk.core.exception;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreFeatureUnavailableException extends RuStoreFeatureAvailabilityException {
    public RuStoreFeatureUnavailableException(@Nullable String str) {
        super(str == null ? "Feature not available" : str);
    }
}
