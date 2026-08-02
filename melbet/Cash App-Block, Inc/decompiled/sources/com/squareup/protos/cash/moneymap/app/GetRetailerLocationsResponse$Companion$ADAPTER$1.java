package com.squareup.protos.cash.moneymap.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRetailerLocationsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetRetailerLocationsResponse.RetailerLocation.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) obj;
        reverseProtoWriter.getClass();
        getRetailerLocationsResponse.getClass();
        reverseProtoWriter.writeBytes(getRetailerLocationsResponse.unknownFields());
        GetRetailerLocationsResponse.RetailerLocation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getRetailerLocationsResponse.retailer_locations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) obj;
        getRetailerLocationsResponse.getClass();
        return GetRetailerLocationsResponse.RetailerLocation.ADAPTER.asRepeated().encodedSizeWithTag(1, getRetailerLocationsResponse.retailer_locations) + getRetailerLocationsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) obj;
        getRetailerLocationsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getRetailerLocationsResponse.retailer_locations, GetRetailerLocationsResponse.RetailerLocation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetRetailerLocationsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) obj;
        getRetailerLocationsResponse.getClass();
        GetRetailerLocationsResponse.RetailerLocation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getRetailerLocationsResponse.retailer_locations);
        protoWriter.writeBytes(getRetailerLocationsResponse.unknownFields());
    }
}
