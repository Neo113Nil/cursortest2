package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2327wk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f34099a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vs f34100b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final yt f34101c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f34102d;

    public C2327wk(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull y50 adPlayer, @NotNull ow1 videoPlayer, @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adPlayer, "adPlayer");
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f34099a = sdkEnvironmentModule;
        this.f34100b = adPlayer;
        this.f34101c = videoPlayer;
        this.f34102d = applicationContext;
    }

    @NotNull
    public final C2281uk a(@NotNull ViewGroup adViewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull qs instreamAd) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        rs rsVar = new rs(this.f34102d, this.f34099a, instreamAd, this.f34100b, this.f34101c);
        return new C2281uk(adViewGroup, friendlyOverlays, rsVar, new WeakReference(adViewGroup), new bl0(rsVar), null);
    }
}
