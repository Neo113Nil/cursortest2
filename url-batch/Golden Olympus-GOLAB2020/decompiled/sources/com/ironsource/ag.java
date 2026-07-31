package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ag {

    @Metadata
    public interface a {
        @NotNull
        Object a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, @NotNull n8 n8Var, @NotNull ef efVar);

        void b(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat);
    }

    @NotNull
    l8 a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat);
}
