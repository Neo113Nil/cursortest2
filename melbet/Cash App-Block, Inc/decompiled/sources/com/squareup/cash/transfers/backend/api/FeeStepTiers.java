package com.squareup.cash.transfers.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public final class FeeStepTiers implements Parcelable {
    public static final Parcelable.Creator<FeeStepTiers> CREATOR = new TaxMenuSheet.Creator(7);
    public final TreeMap tiers;

    public /* synthetic */ FeeStepTiers(TreeMap treeMap) {
        this.tiers = treeMap;
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m3771writeToParcelimpl(TreeMap treeMap, Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(treeMap.size());
        for (Map.Entry entry : treeMap.entrySet()) {
            parcel.writeLong(((Number) entry.getKey()).longValue());
            ((TransfersWithdrawManager.FeeData.FeeStepTier) entry.getValue()).writeToParcel(parcel, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FeeStepTiers) {
            return this.tiers.equals(((FeeStepTiers) obj).tiers);
        }
        return false;
    }

    public final int hashCode() {
        return this.tiers.hashCode();
    }

    public final String toString() {
        return "FeeStepTiers(tiers=" + this.tiers + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        m3771writeToParcelimpl(this.tiers, parcel, i);
    }
}
