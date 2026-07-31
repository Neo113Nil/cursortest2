package com.yandex.div.core.player;

import O1.Lf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface DivVideoAttachable {
    default void attach(@NotNull DivPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
    }

    default void detach() {
    }

    @Nullable
    default DivPlayer getAttachedPlayer() {
        return null;
    }

    default void setScale(@NotNull Lf videoScale) {
        Intrinsics.checkNotNullParameter(videoScale, "videoScale");
    }

    default void setVisibleOnScreen(boolean z4) {
    }
}
