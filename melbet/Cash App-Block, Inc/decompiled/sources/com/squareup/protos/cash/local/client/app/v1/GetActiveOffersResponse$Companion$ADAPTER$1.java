package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetActiveOffersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetActiveOffersResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActiveOffer.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetActiveOffersResponse getActiveOffersResponse = (GetActiveOffersResponse) obj;
        reverseProtoWriter.getClass();
        getActiveOffersResponse.getClass();
        reverseProtoWriter.writeBytes(getActiveOffersResponse.unknownFields());
        ActiveOffer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getActiveOffersResponse.offers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetActiveOffersResponse getActiveOffersResponse = (GetActiveOffersResponse) obj;
        getActiveOffersResponse.getClass();
        return ActiveOffer.ADAPTER.asRepeated().encodedSizeWithTag(1, getActiveOffersResponse.offers) + getActiveOffersResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetActiveOffersResponse getActiveOffersResponse = (GetActiveOffersResponse) obj;
        getActiveOffersResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getActiveOffersResponse.offers, ActiveOffer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetActiveOffersResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetActiveOffersResponse getActiveOffersResponse = (GetActiveOffersResponse) obj;
        getActiveOffersResponse.getClass();
        ActiveOffer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getActiveOffersResponse.offers);
        protoWriter.writeBytes(getActiveOffersResponse.unknownFields());
    }
}
