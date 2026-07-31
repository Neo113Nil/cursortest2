package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qs f35175a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xl0 f35176b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private wl0 f35177c;

    public /* synthetic */ yl0(qs qsVar, ve2 ve2Var) {
        this(qsVar, ve2Var, new xl0(ve2Var));
    }

    @NotNull
    public final wl0 a() {
        wl0 wl0Var = this.f35177c;
        if (wl0Var != null) {
            return wl0Var;
        }
        wl0 a4 = this.f35176b.a(this.f35175a.a());
        this.f35177c = a4;
        return a4;
    }

    public yl0(@NotNull qs instreamVideoAd, @NotNull ve2 videoPlayerController, @NotNull xl0 instreamAdPlaylistCreator) {
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdPlaylistCreator, "instreamAdPlaylistCreator");
        this.f35175a = instreamVideoAd;
        this.f35176b = instreamAdPlaylistCreator;
    }
}
