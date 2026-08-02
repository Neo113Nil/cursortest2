package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.OfferSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OffersSheetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OffersSheetResponse((OfferSheet) obj, (Long) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(OfferSheet.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(OfferSheetPreload.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OffersSheetResponse offersSheetResponse = (OffersSheetResponse) obj;
        reverseProtoWriter.getClass();
        offersSheetResponse.getClass();
        reverseProtoWriter.writeBytes(offersSheetResponse.unknownFields());
        OfferSheetPreload.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, offersSheetResponse.sheets_preload);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, offersSheetResponse.expire_at_ms);
        OfferSheet.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offersSheetResponse.sheet);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OffersSheetResponse offersSheetResponse = (OffersSheetResponse) obj;
        offersSheetResponse.getClass();
        return OfferSheetPreload.ADAPTER.asRepeated().encodedSizeWithTag(3, offersSheetResponse.sheets_preload) + ProtoAdapter.INT64.encodedSizeWithTag(2, offersSheetResponse.expire_at_ms) + OfferSheet.ADAPTER.encodedSizeWithTag(1, offersSheetResponse.sheet) + offersSheetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OffersSheetResponse offersSheetResponse = (OffersSheetResponse) obj;
        offersSheetResponse.getClass();
        OfferSheet offerSheet = offersSheetResponse.sheet;
        OfferSheet offerSheet2 = offerSheet != null ? (OfferSheet) OfferSheet.ADAPTER.redact(offerSheet) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(offersSheetResponse.sheets_preload, OfferSheetPreload.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = offersSheetResponse.expire_at_ms;
        byteString.getClass();
        return new OffersSheetResponse(offerSheet2, l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OffersSheetResponse offersSheetResponse = (OffersSheetResponse) obj;
        offersSheetResponse.getClass();
        OfferSheet.ADAPTER.encodeWithTag(protoWriter, 1, offersSheetResponse.sheet);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, offersSheetResponse.expire_at_ms);
        OfferSheetPreload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, offersSheetResponse.sheets_preload);
        protoWriter.writeBytes(offersSheetResponse.unknownFields());
    }
}
