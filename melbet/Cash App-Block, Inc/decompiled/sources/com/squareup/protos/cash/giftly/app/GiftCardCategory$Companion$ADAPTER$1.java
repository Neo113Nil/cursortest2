package com.squareup.protos.cash.giftly.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GiftCardCategory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardCategory((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardCategory giftCardCategory = (GiftCardCategory) obj;
        reverseProtoWriter.getClass();
        giftCardCategory.getClass();
        reverseProtoWriter.writeBytes(giftCardCategory.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, giftCardCategory.gift_card_type_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, giftCardCategory.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, giftCardCategory.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardCategory giftCardCategory = (GiftCardCategory) obj;
        giftCardCategory.getClass();
        int size$okio = giftCardCategory.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(3, giftCardCategory.gift_card_type_tokens) + protoAdapter.encodedSizeWithTag(2, giftCardCategory.name) + protoAdapter.encodedSizeWithTag(1, giftCardCategory.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardCategory giftCardCategory = (GiftCardCategory) obj;
        giftCardCategory.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardCategory.token;
        String str2 = giftCardCategory.name;
        List list = giftCardCategory.gift_card_type_tokens;
        list.getClass();
        byteString.getClass();
        return new GiftCardCategory(str, str2, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardCategory giftCardCategory = (GiftCardCategory) obj;
        giftCardCategory.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCardCategory.token);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCardCategory.name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, giftCardCategory.gift_card_type_tokens);
        protoWriter.writeBytes(giftCardCategory.unknownFields());
    }
}
