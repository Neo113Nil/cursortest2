package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface od {
    void a();

    void a(@NotNull Activity activity, @Nullable String str);

    void a(@NotNull LevelPlayAdError levelPlayAdError);

    void b();

    @NotNull
    LevelPlayAdInfo c();

    @NotNull
    InterfaceC1488j1 d();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
