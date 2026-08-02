package com.squareup.protos.franklin.onboarding;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StaffInvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StaffInvitationOnboardingDeepLinkPayload((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = (StaffInvitationOnboardingDeepLinkPayload) obj;
        reverseProtoWriter.getClass();
        staffInvitationOnboardingDeepLinkPayload.getClass();
        reverseProtoWriter.writeBytes(staffInvitationOnboardingDeepLinkPayload.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, staffInvitationOnboardingDeepLinkPayload.invitation_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = (StaffInvitationOnboardingDeepLinkPayload) obj;
        staffInvitationOnboardingDeepLinkPayload.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, staffInvitationOnboardingDeepLinkPayload.invitation_code) + staffInvitationOnboardingDeepLinkPayload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = (StaffInvitationOnboardingDeepLinkPayload) obj;
        staffInvitationOnboardingDeepLinkPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = staffInvitationOnboardingDeepLinkPayload.invitation_code;
        byteString.getClass();
        return new StaffInvitationOnboardingDeepLinkPayload(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = (StaffInvitationOnboardingDeepLinkPayload) obj;
        staffInvitationOnboardingDeepLinkPayload.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, staffInvitationOnboardingDeepLinkPayload.invitation_code);
        protoWriter.writeBytes(staffInvitationOnboardingDeepLinkPayload.unknownFields());
    }
}
