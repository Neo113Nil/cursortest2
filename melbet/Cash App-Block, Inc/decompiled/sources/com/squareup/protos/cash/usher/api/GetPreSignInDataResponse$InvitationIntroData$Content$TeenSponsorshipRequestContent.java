package com.squareup.protos.cash.usher.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent extends zzlt {
    public final GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent value;

    public GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent(GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent teenSponsorshipRequestContent) {
        teenSponsorshipRequestContent.getClass();
        this.value = teenSponsorshipRequestContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) && Intrinsics.areEqual(this.value, ((GetPreSignInDataResponse$InvitationIntroData$Content$TeenSponsorshipRequestContent) obj).value);
    }

    public final GetPreSignInDataResponse.InvitationIntroData.TeenSponsorshipRequestContent getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "TeenSponsorshipRequestContent(value=" + this.value + ")";
    }
}
