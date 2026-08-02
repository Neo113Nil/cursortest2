package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCardRenderData$RecipientData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardRenderData.RecipientData((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardRenderData.RecipientData recipientData = (GiftCardRenderData.RecipientData) obj;
        reverseProtoWriter.getClass();
        recipientData.getClass();
        reverseProtoWriter.writeBytes(recipientData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, recipientData.converted_to_cash_at);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, recipientData.open_action_base_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardRenderData.RecipientData recipientData = (GiftCardRenderData.RecipientData) obj;
        recipientData.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, recipientData.converted_to_cash_at) + ProtoAdapter.STRING.encodedSizeWithTag(1, recipientData.open_action_base_url) + recipientData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardRenderData.RecipientData recipientData = (GiftCardRenderData.RecipientData) obj;
        recipientData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recipientData.open_action_base_url;
        Long l = recipientData.converted_to_cash_at;
        byteString.getClass();
        return new GiftCardRenderData.RecipientData(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardRenderData.RecipientData recipientData = (GiftCardRenderData.RecipientData) obj;
        recipientData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recipientData.open_action_base_url);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, recipientData.converted_to_cash_at);
        protoWriter.writeBytes(recipientData.unknownFields());
    }
}
