package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yi1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ve2 f35149a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1937g2 f35150b;

    public yi1(@NotNull ve2 videoPlayerController, @NotNull C1937g2 adBreakStatusController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        this.f35149a = videoPlayerController;
        this.f35150b = adBreakStatusController;
    }

    @NotNull
    public final xi1 a(@NotNull wl0 instreamAdPlaylist, @NotNull zi1 listener) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylist, "instreamAdPlaylist");
        Intrinsics.checkNotNullParameter(listener, "listener");
        gf2 gf2Var = new gf2(this.f35149a, new Handler(Looper.getMainLooper()));
        it1 it1Var = new it1(instreamAdPlaylist);
        return new xi1(gf2Var, new sn1(it1Var, this.f35150b), new rn1(it1Var, this.f35150b), listener);
    }
}
