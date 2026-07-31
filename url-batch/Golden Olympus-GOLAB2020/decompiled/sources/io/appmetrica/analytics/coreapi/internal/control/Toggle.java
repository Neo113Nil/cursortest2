package io.appmetrica.analytics.coreapi.internal.control;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface Toggle {
    boolean getActualState();

    void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z4);

    void removeObserver(@NotNull ToggleObserver toggleObserver);
}
