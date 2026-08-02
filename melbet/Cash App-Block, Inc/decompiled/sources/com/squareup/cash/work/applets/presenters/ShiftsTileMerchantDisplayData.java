package com.squareup.cash.work.applets.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ShiftsTileMerchantDisplayData {
    public final List allMerchants;
    public final int extraMerchantsCount;
    public final MerchantInfo primaryMerchant;

    public ShiftsTileMerchantDisplayData(MerchantInfo merchantInfo, List list, int i) {
        list.getClass();
        this.primaryMerchant = merchantInfo;
        this.allMerchants = list;
        this.extraMerchantsCount = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftsTileMerchantDisplayData)) {
            return false;
        }
        ShiftsTileMerchantDisplayData shiftsTileMerchantDisplayData = (ShiftsTileMerchantDisplayData) obj;
        return this.primaryMerchant.equals(shiftsTileMerchantDisplayData.primaryMerchant) && Intrinsics.areEqual(this.allMerchants, shiftsTileMerchantDisplayData.allMerchants) && this.extraMerchantsCount == shiftsTileMerchantDisplayData.extraMerchantsCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.extraMerchantsCount) + Recorder$$ExternalSyntheticOutline2.m(this.primaryMerchant.hashCode() * 31, 31, this.allMerchants);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShiftsTileMerchantDisplayData(primaryMerchant=");
        sb.append(this.primaryMerchant);
        sb.append(", allMerchants=");
        sb.append(this.allMerchants);
        sb.append(", extraMerchantsCount=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.extraMerchantsCount, ")", sb);
    }
}
