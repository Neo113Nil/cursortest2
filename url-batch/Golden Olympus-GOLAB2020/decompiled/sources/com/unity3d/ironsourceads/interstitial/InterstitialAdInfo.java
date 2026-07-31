package com.unity3d.ironsourceads.interstitial;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class InterstitialAdInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21914a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21915b;

    public InterstitialAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f21914a = instanceId;
        this.f21915b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.f21915b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f21914a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f21914a + "', adId: '" + this.f21915b + "']";
    }
}
