package com.squareup.protos.giftly;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GiftCardDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GiftCardDetails((String) obj, (String) obj2, (LocalizableString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GiftCardDetails giftCardDetails = (GiftCardDetails) obj;
        reverseProtoWriter.getClass();
        giftCardDetails.getClass();
        reverseProtoWriter.writeBytes(giftCardDetails.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, giftCardDetails.localizable_note);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, giftCardDetails.note);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, giftCardDetails.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GiftCardDetails giftCardDetails = (GiftCardDetails) obj;
        giftCardDetails.getClass();
        int size$okio = giftCardDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(3, giftCardDetails.localizable_note) + protoAdapter.encodedSizeWithTag(2, giftCardDetails.note) + protoAdapter.encodedSizeWithTag(1, giftCardDetails.icon) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GiftCardDetails giftCardDetails = (GiftCardDetails) obj;
        giftCardDetails.getClass();
        LocalizableString localizableString = giftCardDetails.localizable_note;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = giftCardDetails.icon;
        String str2 = giftCardDetails.note;
        byteString.getClass();
        return new GiftCardDetails(str, str2, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GiftCardDetails giftCardDetails = (GiftCardDetails) obj;
        giftCardDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, giftCardDetails.icon);
        protoAdapter.encodeWithTag(protoWriter, 2, giftCardDetails.note);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 3, giftCardDetails.localizable_note);
        protoWriter.writeBytes(giftCardDetails.unknownFields());
    }
}
