package com.squareup.protos.franklin.onboarding;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvitationOnboardingDeepLinkPayload((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = (InvitationOnboardingDeepLinkPayload) obj;
        reverseProtoWriter.getClass();
        invitationOnboardingDeepLinkPayload.getClass();
        reverseProtoWriter.writeBytes(invitationOnboardingDeepLinkPayload.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, invitationOnboardingDeepLinkPayload.promotion_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, invitationOnboardingDeepLinkPayload.invitation_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = (InvitationOnboardingDeepLinkPayload) obj;
        invitationOnboardingDeepLinkPayload.getClass();
        int size$okio = invitationOnboardingDeepLinkPayload.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, invitationOnboardingDeepLinkPayload.promotion_code) + protoAdapter.encodedSizeWithTag(1, invitationOnboardingDeepLinkPayload.invitation_code) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = (InvitationOnboardingDeepLinkPayload) obj;
        invitationOnboardingDeepLinkPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = invitationOnboardingDeepLinkPayload.invitation_code;
        String str2 = invitationOnboardingDeepLinkPayload.promotion_code;
        byteString.getClass();
        return new InvitationOnboardingDeepLinkPayload(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = (InvitationOnboardingDeepLinkPayload) obj;
        invitationOnboardingDeepLinkPayload.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, invitationOnboardingDeepLinkPayload.invitation_code);
        protoAdapter.encodeWithTag(protoWriter, 2, invitationOnboardingDeepLinkPayload.promotion_code);
        protoWriter.writeBytes(invitationOnboardingDeepLinkPayload.unknownFields());
    }
}
