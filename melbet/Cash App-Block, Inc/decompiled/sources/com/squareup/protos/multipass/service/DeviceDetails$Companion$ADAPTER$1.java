package com.squareup.protos.multipass.service;

import com.squareup.protos.multipass.service.DeviceDetails;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DeviceDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeviceDetails((DeviceDetails.Type) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = DeviceDetails.Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        reverseProtoWriter.getClass();
        deviceDetails.getClass();
        reverseProtoWriter.writeBytes(deviceDetails.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, deviceDetails.is_squid);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, deviceDetails.serial);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, deviceDetails.secondary_device_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deviceDetails.ip_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, deviceDetails.device_id);
        DeviceDetails.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, deviceDetails.f1403type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        deviceDetails.getClass();
        int encodedSizeWithTag = DeviceDetails.Type.ADAPTER.encodedSizeWithTag(1, deviceDetails.f1403type) + deviceDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, deviceDetails.is_squid) + protoAdapter.encodedSizeWithTag(5, deviceDetails.serial) + protoAdapter.encodedSizeWithTag(4, deviceDetails.secondary_device_id) + protoAdapter.encodedSizeWithTag(3, deviceDetails.ip_address) + protoAdapter.encodedSizeWithTag(2, deviceDetails.device_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        deviceDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        DeviceDetails.Type type2 = deviceDetails.f1403type;
        Boolean bool = deviceDetails.is_squid;
        byteString.getClass();
        return new DeviceDetails(type2, null, null, null, null, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeviceDetails deviceDetails = (DeviceDetails) obj;
        deviceDetails.getClass();
        DeviceDetails.Type.ADAPTER.encodeWithTag(protoWriter, 1, deviceDetails.f1403type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, deviceDetails.device_id);
        protoAdapter.encodeWithTag(protoWriter, 3, deviceDetails.ip_address);
        protoAdapter.encodeWithTag(protoWriter, 4, deviceDetails.secondary_device_id);
        protoAdapter.encodeWithTag(protoWriter, 5, deviceDetails.serial);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, deviceDetails.is_squid);
        protoWriter.writeBytes(deviceDetails.unknownFields());
    }
}
