package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCardRenderData$SenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardRenderData.SenderData((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GiftCardRenderData.SenderData senderData = (GiftCardRenderData.SenderData) obj;
        reverseProtoWriter.getClass();
        senderData.getClass();
        reverseProtoWriter.writeBytes(senderData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, senderData.instrument_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardRenderData.SenderData senderData = (GiftCardRenderData.SenderData) obj;
        senderData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, senderData.instrument_token) + senderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardRenderData.SenderData senderData = (GiftCardRenderData.SenderData) obj;
        senderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = senderData.instrument_token;
        byteString.getClass();
        return new GiftCardRenderData.SenderData(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardRenderData.SenderData senderData = (GiftCardRenderData.SenderData) obj;
        senderData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, senderData.instrument_token);
        protoWriter.writeBytes(senderData.unknownFields());
    }
}
