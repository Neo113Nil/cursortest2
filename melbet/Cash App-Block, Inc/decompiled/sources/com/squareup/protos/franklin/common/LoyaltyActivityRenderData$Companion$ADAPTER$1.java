package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.LoyaltyActivityRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoyaltyActivityRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoyaltyActivityRenderData((LoyaltyActivityRenderData.Type) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LoyaltyActivityRenderData.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoyaltyActivityRenderData loyaltyActivityRenderData = (LoyaltyActivityRenderData) obj;
        reverseProtoWriter.getClass();
        loyaltyActivityRenderData.getClass();
        reverseProtoWriter.writeBytes(loyaltyActivityRenderData.unknownFields());
        LoyaltyActivityRenderData.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loyaltyActivityRenderData.f1383type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoyaltyActivityRenderData loyaltyActivityRenderData = (LoyaltyActivityRenderData) obj;
        loyaltyActivityRenderData.getClass();
        return LoyaltyActivityRenderData.Type.ADAPTER.encodedSizeWithTag(1, loyaltyActivityRenderData.f1383type) + loyaltyActivityRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoyaltyActivityRenderData loyaltyActivityRenderData = (LoyaltyActivityRenderData) obj;
        loyaltyActivityRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        LoyaltyActivityRenderData.Type type2 = loyaltyActivityRenderData.f1383type;
        byteString.getClass();
        return new LoyaltyActivityRenderData(type2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoyaltyActivityRenderData loyaltyActivityRenderData = (LoyaltyActivityRenderData) obj;
        loyaltyActivityRenderData.getClass();
        LoyaltyActivityRenderData.Type.ADAPTER.encodeWithTag(protoWriter, 1, loyaltyActivityRenderData.f1383type);
        protoWriter.writeBytes(loyaltyActivityRenderData.unknownFields());
    }
}
