package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface fg {

    @Metadata
    public interface a {
        void a(@NotNull String str, @NotNull String str2, int i4);

        void b(@NotNull String str, @NotNull String str2, int i4);
    }

    @Nullable
    LevelPlayReward a(@Nullable String str, @NotNull String str2);
}
