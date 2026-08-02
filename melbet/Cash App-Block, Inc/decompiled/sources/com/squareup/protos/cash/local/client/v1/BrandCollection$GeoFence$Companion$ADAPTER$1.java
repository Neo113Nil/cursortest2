package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.BrandCollection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandCollection$GeoFence$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BrandCollection.GeoFence((Double) obj, (Double) obj2, (Double) obj3, (Double) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.DOUBLE.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrandCollection.GeoFence geoFence = (BrandCollection.GeoFence) obj;
        reverseProtoWriter.getClass();
        geoFence.getClass();
        reverseProtoWriter.writeBytes(geoFence.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, geoFence.max_latitude);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, geoFence.min_latitude);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, geoFence.max_longitude);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, geoFence.min_longitude);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrandCollection.GeoFence geoFence = (BrandCollection.GeoFence) obj;
        geoFence.getClass();
        int size$okio = geoFence.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        return protoAdapter.encodedSizeWithTag(4, geoFence.max_latitude) + protoAdapter.encodedSizeWithTag(3, geoFence.min_latitude) + protoAdapter.encodedSizeWithTag(2, geoFence.max_longitude) + protoAdapter.encodedSizeWithTag(1, geoFence.min_longitude) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrandCollection.GeoFence geoFence = (BrandCollection.GeoFence) obj;
        geoFence.getClass();
        ByteString byteString = ByteString.EMPTY;
        Double d = geoFence.min_longitude;
        Double d2 = geoFence.max_longitude;
        Double d3 = geoFence.min_latitude;
        Double d4 = geoFence.max_latitude;
        byteString.getClass();
        return new BrandCollection.GeoFence(d, d2, d3, d4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrandCollection.GeoFence geoFence = (BrandCollection.GeoFence) obj;
        geoFence.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, geoFence.min_longitude);
        protoAdapter.encodeWithTag(protoWriter, 2, geoFence.max_longitude);
        protoAdapter.encodeWithTag(protoWriter, 3, geoFence.min_latitude);
        protoAdapter.encodeWithTag(protoWriter, 4, geoFence.max_latitude);
        protoWriter.writeBytes(geoFence.unknownFields());
    }
}
