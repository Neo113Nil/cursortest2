package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetOffersResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetOffersResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Offer.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetOffersResponse getOffersResponse = (GetOffersResponse) obj;
        reverseProtoWriter.getClass();
        getOffersResponse.getClass();
        reverseProtoWriter.writeBytes(getOffersResponse.unknownFields());
        Offer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getOffersResponse.offers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetOffersResponse getOffersResponse = (GetOffersResponse) obj;
        getOffersResponse.getClass();
        return Offer.ADAPTER.asRepeated().encodedSizeWithTag(1, getOffersResponse.offers) + getOffersResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetOffersResponse getOffersResponse = (GetOffersResponse) obj;
        getOffersResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getOffersResponse.offers, Offer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetOffersResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetOffersResponse getOffersResponse = (GetOffersResponse) obj;
        getOffersResponse.getClass();
        Offer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getOffersResponse.offers);
        protoWriter.writeBytes(getOffersResponse.unknownFields());
    }
}
