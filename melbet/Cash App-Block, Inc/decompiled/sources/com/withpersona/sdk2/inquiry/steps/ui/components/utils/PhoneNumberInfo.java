package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class PhoneNumberInfo {
    public final String countryCode;
    public final String localPhoneNumber;

    public PhoneNumberInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.countryCode = str;
        this.localPhoneNumber = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberInfo)) {
            return false;
        }
        PhoneNumberInfo phoneNumberInfo = (PhoneNumberInfo) obj;
        return Intrinsics.areEqual(this.countryCode, phoneNumberInfo.countryCode) && Intrinsics.areEqual(this.localPhoneNumber, phoneNumberInfo.localPhoneNumber);
    }

    public final int hashCode() {
        return this.localPhoneNumber.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("PhoneNumberInfo(countryCode=", this.countryCode, ", localPhoneNumber=", this.localPhoneNumber, ")");
    }
}
