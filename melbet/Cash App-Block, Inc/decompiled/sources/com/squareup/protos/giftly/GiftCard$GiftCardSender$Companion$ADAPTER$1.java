package com.squareup.protos.giftly;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCard$GiftCardSender$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GiftCard.GiftCardSender((String) obj, (String) obj2, (LocalizableString) obj3, (String) obj4, (LocalizableString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCard.GiftCardSender giftCardSender = (GiftCard.GiftCardSender) obj;
        reverseProtoWriter.getClass();
        giftCardSender.getClass();
        reverseProtoWriter.writeBytes(giftCardSender.unknownFields());
        ProtoAdapter protoAdapter = LocalizableString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, giftCardSender.localizable_amount_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, giftCardSender.amount_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, giftCardSender.localizable_note);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, giftCardSender.note);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, giftCardSender.from_customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCard.GiftCardSender giftCardSender = (GiftCard.GiftCardSender) obj;
        giftCardSender.getClass();
        int size$okio = giftCardSender.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, giftCardSender.note) + protoAdapter.encodedSizeWithTag(1, giftCardSender.from_customer_token) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(5, giftCardSender.localizable_amount_text) + protoAdapter.encodedSizeWithTag(3, giftCardSender.amount_text) + protoAdapter2.encodedSizeWithTag(4, giftCardSender.localizable_note) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCard.GiftCardSender giftCardSender = (GiftCard.GiftCardSender) obj;
        giftCardSender.getClass();
        LocalizableString localizableString = giftCardSender.localizable_amount_text;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardSender.from_customer_token;
        String str2 = giftCardSender.amount_text;
        byteString.getClass();
        return new GiftCard.GiftCardSender(str, null, null, str2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCard.GiftCardSender giftCardSender = (GiftCard.GiftCardSender) obj;
        giftCardSender.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCardSender.from_customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCardSender.note);
        ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, giftCardSender.localizable_note);
        protoAdapter.encodeWithTag(protoWriter, 3, giftCardSender.amount_text);
        protoAdapter2.encodeWithTag(protoWriter, 5, giftCardSender.localizable_amount_text);
        protoWriter.writeBytes(giftCardSender.unknownFields());
    }
}
