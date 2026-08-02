package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetMapLocationsResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMapLocationsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMapLocationsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GetMapLocationsResponse.MapLocation.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMapLocationsResponse getMapLocationsResponse = (GetMapLocationsResponse) obj;
        reverseProtoWriter.getClass();
        getMapLocationsResponse.getClass();
        reverseProtoWriter.writeBytes(getMapLocationsResponse.unknownFields());
        GetMapLocationsResponse.MapLocation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getMapLocationsResponse.map_locations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMapLocationsResponse getMapLocationsResponse = (GetMapLocationsResponse) obj;
        getMapLocationsResponse.getClass();
        return GetMapLocationsResponse.MapLocation.ADAPTER.asRepeated().encodedSizeWithTag(1, getMapLocationsResponse.map_locations) + getMapLocationsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMapLocationsResponse getMapLocationsResponse = (GetMapLocationsResponse) obj;
        getMapLocationsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getMapLocationsResponse.map_locations, GetMapLocationsResponse.MapLocation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetMapLocationsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMapLocationsResponse getMapLocationsResponse = (GetMapLocationsResponse) obj;
        getMapLocationsResponse.getClass();
        GetMapLocationsResponse.MapLocation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMapLocationsResponse.map_locations);
        protoWriter.writeBytes(getMapLocationsResponse.unknownFields());
    }
}
