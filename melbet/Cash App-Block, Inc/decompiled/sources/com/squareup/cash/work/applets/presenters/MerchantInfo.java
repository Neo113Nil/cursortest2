package com.squareup.cash.work.applets.presenters;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MerchantInfo {
    public final MerchantBranding branding;
    public final boolean hasShiftsEnabled;
    public final MerchantIdentifier identifier;
    public final String initials;
    public final String name;

    public MerchantInfo(MerchantIdentifier merchantIdentifier, String str, String str2, boolean z, MerchantBranding merchantBranding) {
        str2.getClass();
        this.identifier = merchantIdentifier;
        this.name = str;
        this.initials = str2;
        this.hasShiftsEnabled = z;
        this.branding = merchantBranding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantInfo)) {
            return false;
        }
        MerchantInfo merchantInfo = (MerchantInfo) obj;
        return this.identifier.equals(merchantInfo.identifier) && this.name.equals(merchantInfo.name) && Intrinsics.areEqual(this.initials, merchantInfo.initials) && this.hasShiftsEnabled == merchantInfo.hasShiftsEnabled && Intrinsics.areEqual(this.branding, merchantInfo.branding);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.identifier.token.hashCode() * 31, 31, this.name), 31, this.initials), 31, this.hasShiftsEnabled);
        MerchantBranding merchantBranding = this.branding;
        return m + (merchantBranding == null ? 0 : merchantBranding.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantInfo(identifier=");
        sb.append(this.identifier);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", initials=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.initials, ", hasShiftsEnabled=", this.hasShiftsEnabled, ", branding=");
        sb.append(this.branding);
        sb.append(")");
        return sb.toString();
    }
}
