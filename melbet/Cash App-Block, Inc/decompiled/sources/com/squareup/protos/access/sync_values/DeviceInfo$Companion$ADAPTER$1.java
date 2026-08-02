package com.squareup.protos.access.sync_values;

import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DeviceInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeviceInfo((Long) obj, (String) obj2, (String) obj3, (String) obj4, (DeviceInfo.DeviceType) obj5, (String) obj6, (DeviceInfo.Status) obj7, (Long) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
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
                    try {
                        obj5 = DeviceInfo.DeviceType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj7 = DeviceInfo.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 8:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        reverseProtoWriter.getClass();
        deviceInfo.getClass();
        reverseProtoWriter.writeBytes(deviceInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, deviceInfo.verified_at);
        DeviceInfo.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 7, deviceInfo.status);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, deviceInfo.last_login_location_image_url);
        DeviceInfo.DeviceType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, deviceInfo.device_type);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, deviceInfo.hashed_app_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, deviceInfo.device_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, deviceInfo.last_login_location);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, deviceInfo.last_login_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        deviceInfo.getClass();
        int size$okio = deviceInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, deviceInfo.last_login_at) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(8, deviceInfo.verified_at) + DeviceInfo.Status.ADAPTER.encodedSizeWithTag(7, deviceInfo.status) + protoAdapter2.encodedSizeWithTag(6, deviceInfo.last_login_location_image_url) + DeviceInfo.DeviceType.ADAPTER.encodedSizeWithTag(5, deviceInfo.device_type) + protoAdapter2.encodedSizeWithTag(4, deviceInfo.hashed_app_token) + protoAdapter2.encodedSizeWithTag(3, deviceInfo.device_name) + protoAdapter2.encodedSizeWithTag(2, deviceInfo.last_login_location) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        deviceInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = deviceInfo.last_login_at;
        String str = deviceInfo.last_login_location;
        String str2 = deviceInfo.hashed_app_token;
        DeviceInfo.DeviceType deviceType = deviceInfo.device_type;
        String str3 = deviceInfo.last_login_location_image_url;
        DeviceInfo.Status status = deviceInfo.status;
        Long l2 = deviceInfo.verified_at;
        byteString.getClass();
        return new DeviceInfo(l, str, null, str2, deviceType, str3, status, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        deviceInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, deviceInfo.last_login_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 2, deviceInfo.last_login_location);
        protoAdapter2.encodeWithTag(protoWriter, 3, deviceInfo.device_name);
        protoAdapter2.encodeWithTag(protoWriter, 4, deviceInfo.hashed_app_token);
        DeviceInfo.DeviceType.ADAPTER.encodeWithTag(protoWriter, 5, deviceInfo.device_type);
        protoAdapter2.encodeWithTag(protoWriter, 6, deviceInfo.last_login_location_image_url);
        DeviceInfo.Status.ADAPTER.encodeWithTag(protoWriter, 7, deviceInfo.status);
        protoAdapter.encodeWithTag(protoWriter, 8, deviceInfo.verified_at);
        protoWriter.writeBytes(deviceInfo.unknownFields());
    }
}
