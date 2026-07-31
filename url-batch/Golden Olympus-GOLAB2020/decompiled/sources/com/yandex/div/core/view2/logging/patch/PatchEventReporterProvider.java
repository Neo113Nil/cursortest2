package com.yandex.div.core.view2.logging.patch;

import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class PatchEventReporterProvider {

    @NotNull
    private final Div2View div2View;

    public PatchEventReporterProvider(@NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        this.div2View = div2View;
    }
}
