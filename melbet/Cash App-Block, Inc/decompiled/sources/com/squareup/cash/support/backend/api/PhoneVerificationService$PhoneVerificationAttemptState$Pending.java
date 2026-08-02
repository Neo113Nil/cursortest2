package com.squareup.cash.support.backend.api;

import androidx.glance.layout.BoxKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class PhoneVerificationService$PhoneVerificationAttemptState$Pending extends BoxKt {
    public final String rejectButtonTitle;
    public final String verifyButtonTitle;

    public PhoneVerificationService$PhoneVerificationAttemptState$Pending(String str, String str2) {
        this.verifyButtonTitle = str;
        this.rejectButtonTitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneVerificationService$PhoneVerificationAttemptState$Pending)) {
            return false;
        }
        PhoneVerificationService$PhoneVerificationAttemptState$Pending phoneVerificationService$PhoneVerificationAttemptState$Pending = (PhoneVerificationService$PhoneVerificationAttemptState$Pending) obj;
        return Intrinsics.areEqual(this.verifyButtonTitle, phoneVerificationService$PhoneVerificationAttemptState$Pending.verifyButtonTitle) && Intrinsics.areEqual(this.rejectButtonTitle, phoneVerificationService$PhoneVerificationAttemptState$Pending.rejectButtonTitle);
    }

    public final int hashCode() {
        String str = this.verifyButtonTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rejectButtonTitle;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Pending(verifyButtonTitle=", this.verifyButtonTitle, ", rejectButtonTitle=", this.rejectButtonTitle, ")");
    }
}
