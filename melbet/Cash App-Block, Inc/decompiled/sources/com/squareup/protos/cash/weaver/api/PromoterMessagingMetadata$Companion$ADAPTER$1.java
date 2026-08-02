package com.squareup.protos.cash.weaver.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PromoterMessagingMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PromoterMessagingMetadata((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PromoterMessagingMetadata promoterMessagingMetadata = (PromoterMessagingMetadata) obj;
        reverseProtoWriter.getClass();
        promoterMessagingMetadata.getClass();
        reverseProtoWriter.writeBytes(promoterMessagingMetadata.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, promoterMessagingMetadata.eligibility);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, promoterMessagingMetadata.campaign_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PromoterMessagingMetadata promoterMessagingMetadata = (PromoterMessagingMetadata) obj;
        promoterMessagingMetadata.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, promoterMessagingMetadata.eligibility) + ProtoAdapter.STRING.encodedSizeWithTag(1, promoterMessagingMetadata.campaign_token) + promoterMessagingMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PromoterMessagingMetadata promoterMessagingMetadata = (PromoterMessagingMetadata) obj;
        promoterMessagingMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = promoterMessagingMetadata.campaign_token;
        Boolean bool = promoterMessagingMetadata.eligibility;
        byteString.getClass();
        return new PromoterMessagingMetadata(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PromoterMessagingMetadata promoterMessagingMetadata = (PromoterMessagingMetadata) obj;
        promoterMessagingMetadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, promoterMessagingMetadata.campaign_token);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, promoterMessagingMetadata.eligibility);
        protoWriter.writeBytes(promoterMessagingMetadata.unknownFields());
    }
}
