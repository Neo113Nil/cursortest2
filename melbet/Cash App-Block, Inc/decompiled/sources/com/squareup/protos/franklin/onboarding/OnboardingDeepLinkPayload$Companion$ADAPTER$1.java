package com.squareup.protos.franklin.onboarding;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OnboardingDeepLinkPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OnboardingDeepLinkPayload((OnboardingDeepLinkType) obj, (LoyaltyOnboardingDeepLinkPayload) obj2, (InvitationOnboardingDeepLinkPayload) obj3, (CashLocalOnboardingDeepLinkPayload) obj4, (StaffInvitationOnboardingDeepLinkPayload) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = OnboardingDeepLinkType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LoyaltyOnboardingDeepLinkPayload.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(InvitationOnboardingDeepLinkPayload.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(CashLocalOnboardingDeepLinkPayload.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(StaffInvitationOnboardingDeepLinkPayload.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = (OnboardingDeepLinkPayload) obj;
        reverseProtoWriter.getClass();
        onboardingDeepLinkPayload.getClass();
        reverseProtoWriter.writeBytes(onboardingDeepLinkPayload.unknownFields());
        StaffInvitationOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 5, onboardingDeepLinkPayload.staff_invitation_payload);
        CashLocalOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 4, onboardingDeepLinkPayload.cash_local_payload);
        InvitationOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 3, onboardingDeepLinkPayload.invitation_payload);
        LoyaltyOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 2, onboardingDeepLinkPayload.loyalty_payload);
        OnboardingDeepLinkType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, onboardingDeepLinkPayload.onboarding_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = (OnboardingDeepLinkPayload) obj;
        onboardingDeepLinkPayload.getClass();
        return StaffInvitationOnboardingDeepLinkPayload.ADAPTER.encodedSizeWithTag(5, onboardingDeepLinkPayload.staff_invitation_payload) + CashLocalOnboardingDeepLinkPayload.ADAPTER.encodedSizeWithTag(4, onboardingDeepLinkPayload.cash_local_payload) + InvitationOnboardingDeepLinkPayload.ADAPTER.encodedSizeWithTag(3, onboardingDeepLinkPayload.invitation_payload) + LoyaltyOnboardingDeepLinkPayload.ADAPTER.encodedSizeWithTag(2, onboardingDeepLinkPayload.loyalty_payload) + OnboardingDeepLinkType.ADAPTER.encodedSizeWithTag(1, onboardingDeepLinkPayload.onboarding_type) + onboardingDeepLinkPayload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = (OnboardingDeepLinkPayload) obj;
        onboardingDeepLinkPayload.getClass();
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = onboardingDeepLinkPayload.loyalty_payload;
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload2 = loyaltyOnboardingDeepLinkPayload != null ? (LoyaltyOnboardingDeepLinkPayload) LoyaltyOnboardingDeepLinkPayload.ADAPTER.redact(loyaltyOnboardingDeepLinkPayload) : null;
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = onboardingDeepLinkPayload.invitation_payload;
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload2 = invitationOnboardingDeepLinkPayload != null ? (InvitationOnboardingDeepLinkPayload) InvitationOnboardingDeepLinkPayload.ADAPTER.redact(invitationOnboardingDeepLinkPayload) : null;
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload = onboardingDeepLinkPayload.cash_local_payload;
        CashLocalOnboardingDeepLinkPayload cashLocalOnboardingDeepLinkPayload2 = cashLocalOnboardingDeepLinkPayload != null ? (CashLocalOnboardingDeepLinkPayload) CashLocalOnboardingDeepLinkPayload.ADAPTER.redact(cashLocalOnboardingDeepLinkPayload) : null;
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = onboardingDeepLinkPayload.staff_invitation_payload;
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload2 = staffInvitationOnboardingDeepLinkPayload != null ? (StaffInvitationOnboardingDeepLinkPayload) StaffInvitationOnboardingDeepLinkPayload.ADAPTER.redact(staffInvitationOnboardingDeepLinkPayload) : null;
        ByteString byteString = ByteString.EMPTY;
        OnboardingDeepLinkType onboardingDeepLinkType = onboardingDeepLinkPayload.onboarding_type;
        byteString.getClass();
        return new OnboardingDeepLinkPayload(onboardingDeepLinkType, loyaltyOnboardingDeepLinkPayload2, invitationOnboardingDeepLinkPayload2, cashLocalOnboardingDeepLinkPayload2, staffInvitationOnboardingDeepLinkPayload2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OnboardingDeepLinkPayload onboardingDeepLinkPayload = (OnboardingDeepLinkPayload) obj;
        onboardingDeepLinkPayload.getClass();
        OnboardingDeepLinkType.ADAPTER.encodeWithTag(protoWriter, 1, onboardingDeepLinkPayload.onboarding_type);
        LoyaltyOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(protoWriter, 2, onboardingDeepLinkPayload.loyalty_payload);
        InvitationOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(protoWriter, 3, onboardingDeepLinkPayload.invitation_payload);
        CashLocalOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(protoWriter, 4, onboardingDeepLinkPayload.cash_local_payload);
        StaffInvitationOnboardingDeepLinkPayload.ADAPTER.encodeWithTag(protoWriter, 5, onboardingDeepLinkPayload.staff_invitation_payload);
        protoWriter.writeBytes(onboardingDeepLinkPayload.unknownFields());
    }
}
