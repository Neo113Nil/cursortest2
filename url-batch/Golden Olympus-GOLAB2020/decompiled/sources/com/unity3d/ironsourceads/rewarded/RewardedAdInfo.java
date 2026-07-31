package com.unity3d.ironsourceads.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class RewardedAdInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21927a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21928b;

    public RewardedAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f21927a = instanceId;
        this.f21928b = adId;
    }

    @NotNull
    public final String getAdId() {
        return this.f21928b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f21927a;
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f21927a + "', adId: '" + this.f21928b + "']";
    }
}
