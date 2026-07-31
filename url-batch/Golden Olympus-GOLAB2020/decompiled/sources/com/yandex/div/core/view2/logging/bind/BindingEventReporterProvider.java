package com.yandex.div.core.view2.logging.bind;

import O1.C1165z4;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BindingEventReporterProvider {

    @NotNull
    private final Div2View div2View;

    public BindingEventReporterProvider(@NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        this.div2View = div2View;
    }

    @NotNull
    public final BindingEventReporter get(@Nullable C1165z4 c1165z4, @Nullable C1165z4 c1165z42) {
        return Log.isEnabled() ? new BindingEventReporterImpl(this.div2View, c1165z4, c1165z42) : BindingEventReporter.Companion.getSTUB();
    }
}
