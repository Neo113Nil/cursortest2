package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface ga1 extends xb0 {
    void a();

    void a(@Nullable TextureView textureView);

    void a(@NotNull mc2 mc2Var);

    void a(@Nullable nc2 nc2Var);

    void a(@Nullable nf2 nf2Var);

    void a(@NotNull ya1 ya1Var);

    long b();

    void c();

    boolean e();

    long getAdPosition();

    float getVolume();

    boolean isPlayingAd();

    void pauseAd();

    void resumeAd();

    void setVolume(float f4);
}
