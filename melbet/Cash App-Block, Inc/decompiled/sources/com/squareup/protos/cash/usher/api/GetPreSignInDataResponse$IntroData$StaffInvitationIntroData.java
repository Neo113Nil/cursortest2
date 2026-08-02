package com.squareup.protos.cash.usher.api;

import androidx.room.util.DBUtil;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GetPreSignInDataResponse$IntroData$StaffInvitationIntroData extends DBUtil {
    public final GetPreSignInDataResponse.StaffInvitationIntroData value;

    public GetPreSignInDataResponse$IntroData$StaffInvitationIntroData(GetPreSignInDataResponse.StaffInvitationIntroData staffInvitationIntroData) {
        staffInvitationIntroData.getClass();
        this.value = staffInvitationIntroData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) && Intrinsics.areEqual(this.value, ((GetPreSignInDataResponse$IntroData$StaffInvitationIntroData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "StaffInvitationIntroData(value=" + this.value + ")";
    }
}
