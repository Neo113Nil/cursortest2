package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrand$LocationFulfillmentSummary$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalBrand.LocationFulfillmentSummary((Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalBrand.LocationFulfillmentSummary locationFulfillmentSummary = (LocalBrand.LocationFulfillmentSummary) obj;
        reverseProtoWriter.getClass();
        locationFulfillmentSummary.getClass();
        reverseProtoWriter.writeBytes(locationFulfillmentSummary.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, locationFulfillmentSummary.total_locations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, locationFulfillmentSummary.num_delivery_locations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, locationFulfillmentSummary.num_pickup_locations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalBrand.LocationFulfillmentSummary locationFulfillmentSummary = (LocalBrand.LocationFulfillmentSummary) obj;
        locationFulfillmentSummary.getClass();
        int size$okio = locationFulfillmentSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, locationFulfillmentSummary.total_locations) + protoAdapter.encodedSizeWithTag(2, locationFulfillmentSummary.num_delivery_locations) + protoAdapter.encodedSizeWithTag(1, locationFulfillmentSummary.num_pickup_locations) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalBrand.LocationFulfillmentSummary locationFulfillmentSummary = (LocalBrand.LocationFulfillmentSummary) obj;
        locationFulfillmentSummary.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = locationFulfillmentSummary.num_pickup_locations;
        Integer num2 = locationFulfillmentSummary.num_delivery_locations;
        Integer num3 = locationFulfillmentSummary.total_locations;
        byteString.getClass();
        return new LocalBrand.LocationFulfillmentSummary(num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalBrand.LocationFulfillmentSummary locationFulfillmentSummary = (LocalBrand.LocationFulfillmentSummary) obj;
        locationFulfillmentSummary.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, locationFulfillmentSummary.num_pickup_locations);
        protoAdapter.encodeWithTag(protoWriter, 2, locationFulfillmentSummary.num_delivery_locations);
        protoAdapter.encodeWithTag(protoWriter, 3, locationFulfillmentSummary.total_locations);
        protoWriter.writeBytes(locationFulfillmentSummary.unknownFields());
    }
}
