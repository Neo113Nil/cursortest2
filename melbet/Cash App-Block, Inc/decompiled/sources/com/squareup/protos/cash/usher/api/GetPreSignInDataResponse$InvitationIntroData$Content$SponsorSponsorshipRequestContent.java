package com.squareup.protos.cash.usher.api;

import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent extends zzlt {
    public final GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent value;

    public GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent(GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent sponsorSponsorshipRequestContent) {
        sponsorSponsorshipRequestContent.getClass();
        this.value = sponsorSponsorshipRequestContent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) && Intrinsics.areEqual(this.value, ((GetPreSignInDataResponse$InvitationIntroData$Content$SponsorSponsorshipRequestContent) obj).value);
    }

    public final GetPreSignInDataResponse.InvitationIntroData.SponsorSponsorshipRequestContent getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "SponsorSponsorshipRequestContent(value=" + this.value + ")";
    }
}
