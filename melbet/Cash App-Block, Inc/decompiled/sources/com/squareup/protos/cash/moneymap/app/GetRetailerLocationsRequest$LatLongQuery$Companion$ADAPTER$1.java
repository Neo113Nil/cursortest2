package com.squareup.protos.cash.moneymap.app;

import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetRetailerLocationsRequest$LatLongQuery$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetRetailerLocationsRequest.LatLongQuery((Double) obj, (Double) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetRetailerLocationsRequest.LatLongQuery latLongQuery = (GetRetailerLocationsRequest.LatLongQuery) obj;
        reverseProtoWriter.getClass();
        latLongQuery.getClass();
        reverseProtoWriter.writeBytes(latLongQuery.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, latLongQuery.longitude);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, latLongQuery.latitude);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetRetailerLocationsRequest.LatLongQuery latLongQuery = (GetRetailerLocationsRequest.LatLongQuery) obj;
        latLongQuery.getClass();
        int size$okio = latLongQuery.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        return protoAdapter.encodedSizeWithTag(2, latLongQuery.longitude) + protoAdapter.encodedSizeWithTag(1, latLongQuery.latitude) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetRetailerLocationsRequest.LatLongQuery) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetRetailerLocationsRequest.LatLongQuery(null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetRetailerLocationsRequest.LatLongQuery latLongQuery = (GetRetailerLocationsRequest.LatLongQuery) obj;
        latLongQuery.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, latLongQuery.latitude);
        protoAdapter.encodeWithTag(protoWriter, 2, latLongQuery.longitude);
        protoWriter.writeBytes(latLongQuery.unknownFields());
    }
}
