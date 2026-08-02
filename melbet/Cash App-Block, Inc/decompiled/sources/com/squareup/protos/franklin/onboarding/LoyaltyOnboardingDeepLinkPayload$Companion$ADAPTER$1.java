package com.squareup.protos.franklin.onboarding;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoyaltyOnboardingDeepLinkPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyOnboardingDeepLinkPayload((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = (LoyaltyOnboardingDeepLinkPayload) obj;
        reverseProtoWriter.getClass();
        loyaltyOnboardingDeepLinkPayload.getClass();
        reverseProtoWriter.writeBytes(loyaltyOnboardingDeepLinkPayload.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, loyaltyOnboardingDeepLinkPayload.merchant_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = (LoyaltyOnboardingDeepLinkPayload) obj;
        loyaltyOnboardingDeepLinkPayload.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, loyaltyOnboardingDeepLinkPayload.merchant_token) + loyaltyOnboardingDeepLinkPayload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = (LoyaltyOnboardingDeepLinkPayload) obj;
        loyaltyOnboardingDeepLinkPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = loyaltyOnboardingDeepLinkPayload.merchant_token;
        byteString.getClass();
        return new LoyaltyOnboardingDeepLinkPayload(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyOnboardingDeepLinkPayload loyaltyOnboardingDeepLinkPayload = (LoyaltyOnboardingDeepLinkPayload) obj;
        loyaltyOnboardingDeepLinkPayload.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, loyaltyOnboardingDeepLinkPayload.merchant_token);
        protoWriter.writeBytes(loyaltyOnboardingDeepLinkPayload.unknownFields());
    }
}
