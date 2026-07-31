package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kc2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bg2 f28173a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28174b;

    public kc2(@NotNull lc2<?> videoAdPlayer, @NotNull bg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f28173a = videoTracker;
        this.f28174b = videoAdPlayer.getVolume() == 0.0f;
    }

    public final void a(float f4) {
        if (f4 == 0.0f) {
            if (this.f28174b) {
                return;
            }
            this.f28174b = true;
            this.f28173a.l();
            return;
        }
        if (this.f28174b) {
            this.f28174b = false;
            this.f28173a.a();
        }
    }
}
