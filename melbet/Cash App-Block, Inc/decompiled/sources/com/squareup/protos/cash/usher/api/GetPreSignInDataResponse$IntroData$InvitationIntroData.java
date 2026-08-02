package com.squareup.protos.cash.usher.api;

import androidx.room.util.DBUtil;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class GetPreSignInDataResponse$IntroData$InvitationIntroData extends DBUtil {
    public final GetPreSignInDataResponse.InvitationIntroData value;

    public GetPreSignInDataResponse$IntroData$InvitationIntroData(GetPreSignInDataResponse.InvitationIntroData invitationIntroData) {
        invitationIntroData.getClass();
        this.value = invitationIntroData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPreSignInDataResponse$IntroData$InvitationIntroData) && Intrinsics.areEqual(this.value, ((GetPreSignInDataResponse$IntroData$InvitationIntroData) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "InvitationIntroData(value=" + this.value + ")";
    }
}
