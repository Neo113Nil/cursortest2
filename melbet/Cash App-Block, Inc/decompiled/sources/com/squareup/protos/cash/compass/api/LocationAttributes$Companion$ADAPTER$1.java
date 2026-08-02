package com.squareup.protos.cash.compass.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocationAttributes$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ?? r3 = 0;
        Double d = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Float f6 = r3;
            if (nextTag == -1) {
                return new LocationAttributes(f6, d, f, f2, f3, f4, f5, bool, bool2, l, l2, l3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    r3 = ProtoAdapter.FLOAT.decode(protoReader);
                    continue;
                case 2:
                    d = ProtoAdapter.DOUBLE.decode(protoReader);
                    break;
                case 3:
                    f = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 4:
                    f2 = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 5:
                    f3 = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 6:
                    f4 = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 7:
                    f5 = ProtoAdapter.FLOAT.decode(protoReader);
                    break;
                case 8:
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    bool2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 11:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 12:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r3 = f6;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocationAttributes locationAttributes = (LocationAttributes) obj;
        reverseProtoWriter.getClass();
        locationAttributes.getClass();
        reverseProtoWriter.writeBytes(locationAttributes.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, locationAttributes.system_time_since_boot);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, locationAttributes.gps_time_since_boot);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, locationAttributes.gps_time);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, locationAttributes.is_produced_by_accessory);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, locationAttributes.is_spoofed_location);
        ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, locationAttributes.bearing_accuracy);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, locationAttributes.bearing);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, locationAttributes.speed_accuracy);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, locationAttributes.speed);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, locationAttributes.altitude_accuracy);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, locationAttributes.altitude);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, locationAttributes.location_accuracy);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocationAttributes locationAttributes = (LocationAttributes) obj;
        locationAttributes.getClass();
        int size$okio = locationAttributes.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(7, locationAttributes.bearing_accuracy) + protoAdapter.encodedSizeWithTag(6, locationAttributes.bearing) + protoAdapter.encodedSizeWithTag(5, locationAttributes.speed_accuracy) + protoAdapter.encodedSizeWithTag(4, locationAttributes.speed) + protoAdapter.encodedSizeWithTag(3, locationAttributes.altitude_accuracy) + ProtoAdapter.DOUBLE.encodedSizeWithTag(2, locationAttributes.altitude) + protoAdapter.encodedSizeWithTag(1, locationAttributes.location_accuracy) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(9, locationAttributes.is_produced_by_accessory) + protoAdapter2.encodedSizeWithTag(8, locationAttributes.is_spoofed_location) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter3.encodedSizeWithTag(12, locationAttributes.system_time_since_boot) + protoAdapter3.encodedSizeWithTag(11, locationAttributes.gps_time_since_boot) + protoAdapter3.encodedSizeWithTag(10, locationAttributes.gps_time) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocationAttributes locationAttributes = (LocationAttributes) obj;
        locationAttributes.getClass();
        ByteString byteString = ByteString.EMPTY;
        Float f = locationAttributes.location_accuracy;
        Double d = locationAttributes.altitude;
        Float f2 = locationAttributes.altitude_accuracy;
        Float f3 = locationAttributes.speed;
        Float f4 = locationAttributes.speed_accuracy;
        Float f5 = locationAttributes.bearing;
        Float f6 = locationAttributes.bearing_accuracy;
        Boolean bool = locationAttributes.is_spoofed_location;
        Boolean bool2 = locationAttributes.is_produced_by_accessory;
        Long l = locationAttributes.gps_time;
        Long l2 = locationAttributes.gps_time_since_boot;
        Long l3 = locationAttributes.system_time_since_boot;
        byteString.getClass();
        return new LocationAttributes(f, d, f2, f3, f4, f5, f6, bool, bool2, l, l2, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocationAttributes locationAttributes = (LocationAttributes) obj;
        locationAttributes.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.FLOAT;
        protoAdapter.encodeWithTag(protoWriter, 1, locationAttributes.location_accuracy);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, locationAttributes.altitude);
        protoAdapter.encodeWithTag(protoWriter, 3, locationAttributes.altitude_accuracy);
        protoAdapter.encodeWithTag(protoWriter, 4, locationAttributes.speed);
        protoAdapter.encodeWithTag(protoWriter, 5, locationAttributes.speed_accuracy);
        protoAdapter.encodeWithTag(protoWriter, 6, locationAttributes.bearing);
        protoAdapter.encodeWithTag(protoWriter, 7, locationAttributes.bearing_accuracy);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 8, locationAttributes.is_spoofed_location);
        protoAdapter2.encodeWithTag(protoWriter, 9, locationAttributes.is_produced_by_accessory);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 10, locationAttributes.gps_time);
        protoAdapter3.encodeWithTag(protoWriter, 11, locationAttributes.gps_time_since_boot);
        protoAdapter3.encodeWithTag(protoWriter, 12, locationAttributes.system_time_since_boot);
        protoWriter.writeBytes(locationAttributes.unknownFields());
    }
}
