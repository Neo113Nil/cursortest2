package com.yandex.div.internal.widget.tabs;

import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class TabTextStyleProvider {

    @NotNull
    private final DivTypefaceProvider typefaceProvider;

    public TabTextStyleProvider(@NotNull DivTypefaceProvider typefaceProvider) {
        Intrinsics.checkNotNullParameter(typefaceProvider, "typefaceProvider");
        this.typefaceProvider = typefaceProvider;
    }

    @NotNull
    public final DivTypefaceProvider getTypefaceProvider() {
        return this.typefaceProvider;
    }
}
