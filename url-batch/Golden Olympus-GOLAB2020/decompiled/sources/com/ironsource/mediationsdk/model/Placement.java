package com.ironsource.mediationsdk.model;

import com.ironsource.mp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class Placement extends BasePlacement {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private String f17713e;

    /* renamed from: f, reason: collision with root package name */
    private int f17714f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i4, @NotNull String placementName, boolean z4, @NotNull String rewardName, int i5, @Nullable mp mpVar) {
        super(i4, placementName, z4, mpVar);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f17714f = i5;
        this.f17713e = rewardName;
    }

    public final int getRewardAmount() {
        return this.f17714f;
    }

    @NotNull
    public final String getRewardName() {
        return this.f17713e;
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    @NotNull
    public String toString() {
        return super.toString() + ", reward name: " + this.f17713e + " , amount: " + this.f17714f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(@NotNull BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.isDefault(), placement.getPlacementAvailabilitySettings());
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f17713e = "";
    }
}
