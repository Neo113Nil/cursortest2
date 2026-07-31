package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface w5 {
    void a(@Nullable LevelPlayAdError levelPlayAdError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo, @Nullable LevelPlayAdError levelPlayAdError);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo, boolean z4);

    void c(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void d(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void e(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void g(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
