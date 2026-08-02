package com.squareup.cash.work.data.api;

import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LastClockedInInfo {
    public final JobIdentifier jobIdentifier;
    public final LocationIdentifier locationIdentifier;
    public final MerchantIdentifier merchant;
    public final String teamMemberId;

    public LastClockedInInfo(JobIdentifier jobIdentifier, MerchantIdentifier merchantIdentifier, String str, LocationIdentifier locationIdentifier) {
        str.getClass();
        this.jobIdentifier = jobIdentifier;
        this.merchant = merchantIdentifier;
        this.teamMemberId = str;
        this.locationIdentifier = locationIdentifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastClockedInInfo)) {
            return false;
        }
        LastClockedInInfo lastClockedInInfo = (LastClockedInInfo) obj;
        return this.jobIdentifier.equals(lastClockedInInfo.jobIdentifier) && this.merchant.equals(lastClockedInInfo.merchant) && Intrinsics.areEqual(this.teamMemberId, lastClockedInInfo.teamMemberId) && this.locationIdentifier.equals(lastClockedInInfo.locationIdentifier);
    }

    public final int hashCode() {
        return this.locationIdentifier.token.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.jobIdentifier.token.hashCode() * 31, 31, this.merchant.token), 31, this.teamMemberId);
    }

    public final String toString() {
        return "LastClockedInInfo(jobIdentifier=" + this.jobIdentifier + ", merchant=" + this.merchant + ", teamMemberId=" + this.teamMemberId + ", locationIdentifier=" + this.locationIdentifier + ")";
    }
}
