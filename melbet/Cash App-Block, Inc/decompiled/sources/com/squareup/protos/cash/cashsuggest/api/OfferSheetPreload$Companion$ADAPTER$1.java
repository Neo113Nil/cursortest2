package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class OfferSheetPreload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferSheetPreload((OfferSheetKey) obj, (OffersSheetResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(OfferSheetKey.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(OffersSheetResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OfferSheetPreload offerSheetPreload = (OfferSheetPreload) obj;
        reverseProtoWriter.getClass();
        offerSheetPreload.getClass();
        reverseProtoWriter.writeBytes(offerSheetPreload.unknownFields());
        OffersSheetResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offerSheetPreload.sheet_response);
        OfferSheetKey.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offerSheetPreload.sheet_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferSheetPreload offerSheetPreload = (OfferSheetPreload) obj;
        offerSheetPreload.getClass();
        return OffersSheetResponse.ADAPTER.encodedSizeWithTag(2, offerSheetPreload.sheet_response) + OfferSheetKey.ADAPTER.encodedSizeWithTag(1, offerSheetPreload.sheet_key) + offerSheetPreload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferSheetPreload offerSheetPreload = (OfferSheetPreload) obj;
        offerSheetPreload.getClass();
        OfferSheetKey offerSheetKey = offerSheetPreload.sheet_key;
        OfferSheetKey offerSheetKey2 = offerSheetKey != null ? (OfferSheetKey) OfferSheetKey.ADAPTER.redact(offerSheetKey) : null;
        OffersSheetResponse offersSheetResponse = offerSheetPreload.sheet_response;
        OffersSheetResponse offersSheetResponse2 = offersSheetResponse != null ? (OffersSheetResponse) OffersSheetResponse.ADAPTER.redact(offersSheetResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OfferSheetPreload(offerSheetKey2, offersSheetResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferSheetPreload offerSheetPreload = (OfferSheetPreload) obj;
        offerSheetPreload.getClass();
        OfferSheetKey.ADAPTER.encodeWithTag(protoWriter, 1, offerSheetPreload.sheet_key);
        OffersSheetResponse.ADAPTER.encodeWithTag(protoWriter, 2, offerSheetPreload.sheet_response);
        protoWriter.writeBytes(offerSheetPreload.unknownFields());
    }
}
