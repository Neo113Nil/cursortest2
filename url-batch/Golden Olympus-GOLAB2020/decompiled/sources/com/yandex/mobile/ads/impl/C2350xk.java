package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2350xk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f34601a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vs f34602b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yt f34603c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f34604d;

    public C2350xk(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull z50 adPlayer, @NotNull pw1 videoPlayer, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adPlayer, "adPlayer");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f34601a = sdkEnvironmentModule;
        this.f34602b = adPlayer;
        this.f34603c = videoPlayer;
        this.f34604d = applicationContext;
    }

    @NotNull
    public final C2304vk a(@NotNull ViewGroup adViewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull qs instreamAd) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        rs rsVar = new rs(this.f34604d, this.f34601a, instreamAd, this.f34602b, this.f34603c);
        return new C2304vk(adViewGroup, friendlyOverlays, rsVar, new WeakReference(adViewGroup), new bl0(rsVar), null);
    }
}
