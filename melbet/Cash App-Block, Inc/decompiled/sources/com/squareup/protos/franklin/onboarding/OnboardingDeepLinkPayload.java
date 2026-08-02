package com.squareup.protos.franklin.onboarding;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OnboardingDeepLinkPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OnboardingDeepLinkPayload> CREATOR;
    public final CashLocalOnboardingDeepLinkPayload cash_local_payload;
    public final InvitationOnboardingDeepLinkPayload invitation_payload;
    public final LoyaltyOnboardingDeepLinkPayload loyalty_payload;
    public final OnboardingDeepLinkType onboarding_type;
    public final StaffInvitationOnboardingDeepLinkPayload staff_invitation_payload;

    static {
        OnboardingDeepLinkPayload$Companion$ADAPTER$1 onboardingDeepLinkPayload$Companion$ADAPTER$1 = new OnboardingDeepLinkPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OnboardingDeepLinkPayload.class), "type.googleapis.com/squareup.franklin.onboarding.OnboardingDeepLinkPayload", Syntax.PROTO_2, null, "squareup/franklin/onboarding.proto");
        ADAPTER = onboardingDeepLinkPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(onboardingDeepLinkPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingDeepLinkPayload(OnboardingDeepLinkType onboardingDeepLinkType, LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload, InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload, CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload, StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.onboarding_type = onboardingDeepLinkType;
        this.loyalty_payload = loyaltyOnboardingDeepLinkPayload;
        this.invitation_payload = invitationOnboardingDeepLinkPayload;
        this.cash_local_payload = cashLocalOnboardingDeepLinkPayload;
        this.staff_invitation_payload = staffInvitationOnboardingDeepLinkPayload;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OnboardingDeepLinkPayload)) {
            return false;
        }
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = (OnboardingDeepLinkPayload) obj;
        return Intrinsics.areEqual(unknownFields(), onboardingDeepLinkPayload.unknownFields()) && this.onboarding_type == onboardingDeepLinkPayload.onboarding_type && Intrinsics.areEqual(this.loyalty_payload, onboardingDeepLinkPayload.loyalty_payload) && Intrinsics.areEqual(this.invitation_payload, onboardingDeepLinkPayload.invitation_payload) && Intrinsics.areEqual(this.cash_local_payload, onboardingDeepLinkPayload.cash_local_payload) && Intrinsics.areEqual(this.staff_invitation_payload, onboardingDeepLinkPayload.staff_invitation_payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OnboardingDeepLinkType onboardingDeepLinkType = this.onboarding_type;
        int hashCode2 = (hashCode + (onboardingDeepLinkType != null ? onboardingDeepLinkType.hashCode() : 0)) * 37;
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = this.loyalty_payload;
        int hashCode3 = (hashCode2 + (loyaltyOnboardingDeepLinkPayload != null ? loyaltyOnboardingDeepLinkPayload.hashCode() : 0)) * 37;
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = this.invitation_payload;
        int hashCode4 = (hashCode3 + (invitationOnboardingDeepLinkPayload != null ? invitationOnboardingDeepLinkPayload.hashCode() : 0)) * 37;
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = this.cash_local_payload;
        int hashCode5 = (hashCode4 + (cashLocalOnboardingDeepLinkPayload != null ? cashLocalOnboardingDeepLinkPayload.hashCode() : 0)) * 37;
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = this.staff_invitation_payload;
        int hashCode6 = hashCode5 + (staffInvitationOnboardingDeepLinkPayload != null ? staffInvitationOnboardingDeepLinkPayload.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(18, false);
        builder.alias = this.onboarding_type;
        builder.verified = this.loyalty_payload;
        builder.expires_at = this.invitation_payload;
        builder.version = this.cash_local_payload;
        builder.display_date = this.staff_invitation_payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OnboardingDeepLinkType onboardingDeepLinkType = this.onboarding_type;
        if (onboardingDeepLinkType != null) {
            arrayList.add("onboarding_type=" + onboardingDeepLinkType);
        }
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = this.loyalty_payload;
        if (loyaltyOnboardingDeepLinkPayload != null) {
            arrayList.add("loyalty_payload=" + loyaltyOnboardingDeepLinkPayload);
        }
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = this.invitation_payload;
        if (invitationOnboardingDeepLinkPayload != null) {
            arrayList.add("invitation_payload=" + invitationOnboardingDeepLinkPayload);
        }
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = this.cash_local_payload;
        if (cashLocalOnboardingDeepLinkPayload != null) {
            arrayList.add("cash_local_payload=" + cashLocalOnboardingDeepLinkPayload);
        }
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = this.staff_invitation_payload;
        if (staffInvitationOnboardingDeepLinkPayload != null) {
            arrayList.add("staff_invitation_payload=" + staffInvitationOnboardingDeepLinkPayload);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingDeepLinkPayload{", "}", 0, null, null, 56);
    }
}
