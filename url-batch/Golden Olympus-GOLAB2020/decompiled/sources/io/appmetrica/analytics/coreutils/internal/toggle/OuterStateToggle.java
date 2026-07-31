package io.appmetrica.analytics.coreutils.internal.toggle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z4, @NotNull String str) {
        super(z4, str);
    }

    public final void update(boolean z4) {
        super.updateState(z4);
    }
}
