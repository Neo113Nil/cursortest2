package com.unity3d.ironsourceads.banner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class BannerAdInfo {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f21895a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f21896b;

    public BannerAdInfo(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f21895a = instanceId;
        this.f21896b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bannerAdInfo.f21895a;
        }
        if ((i4 & 2) != 0) {
            str2 = bannerAdInfo.f21896b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f21895a;
    }

    @NotNull
    public final String component2() {
        return this.f21896b;
    }

    @NotNull
    public final BannerAdInfo copy(@NotNull String instanceId, @NotNull String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return Intrinsics.areEqual(this.f21895a, bannerAdInfo.f21895a) && Intrinsics.areEqual(this.f21896b, bannerAdInfo.f21896b);
    }

    @NotNull
    public final String getAdId() {
        return this.f21896b;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f21895a;
    }

    public int hashCode() {
        return (this.f21895a.hashCode() * 31) + this.f21896b.hashCode();
    }

    @NotNull
    public String toString() {
        return "[instanceId: '" + this.f21895a + "', adId: '" + this.f21896b + "']";
    }
}
