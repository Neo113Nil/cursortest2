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
public final class GiftCardStoreUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardStoreUpsell((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardStoreUpsell giftCardStoreUpsell = (GiftCardStoreUpsell) obj;
        reverseProtoWriter.getClass();
        giftCardStoreUpsell.getClass();
        reverseProtoWriter.writeBytes(giftCardStoreUpsell.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, giftCardStoreUpsell.gift_card_type_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, giftCardStoreUpsell.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardStoreUpsell giftCardStoreUpsell = (GiftCardStoreUpsell) obj;
        giftCardStoreUpsell.getClass();
        int size$okio = giftCardStoreUpsell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, giftCardStoreUpsell.gift_card_type_tokens) + protoAdapter.encodedSizeWithTag(1, giftCardStoreUpsell.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardStoreUpsell giftCardStoreUpsell = (GiftCardStoreUpsell) obj;
        giftCardStoreUpsell.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardStoreUpsell.title;
        List list = giftCardStoreUpsell.gift_card_type_tokens;
        list.getClass();
        byteString.getClass();
        return new GiftCardStoreUpsell(str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardStoreUpsell giftCardStoreUpsell = (GiftCardStoreUpsell) obj;
        giftCardStoreUpsell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCardStoreUpsell.title);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, giftCardStoreUpsell.gift_card_type_tokens);
        protoWriter.writeBytes(giftCardStoreUpsell.unknownFields());
    }
}
