package com.yandex.div.core.view2;

import O1.C1165z4;
import com.yandex.div.DivDataTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Binding {

    @Nullable
    private final C1165z4 data;

    @NotNull
    private final DivDataTag tag;

    public Binding(@NotNull DivDataTag tag, @Nullable C1165z4 c1165z4) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.data = c1165z4;
    }

    @Nullable
    public final C1165z4 getData() {
        return this.data;
    }

    @NotNull
    public final DivDataTag getTag() {
        return this.tag;
    }
}
