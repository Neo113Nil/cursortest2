package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DeviceContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeviceContext((Platform) obj3, (String) obj4, (String) obj5, (String) obj6, (Integer) obj7, (Integer) obj8, (Integer) obj9, (String) obj10, (String) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj3 = Platform.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj3;
                        obj2 = obj4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj7 = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 6:
                    obj8 = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 7:
                    obj9 = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 8:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj2 = obj4;
                    break;
            }
            obj4 = obj2;
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeviceContext deviceContext = (DeviceContext) obj;
        reverseProtoWriter.getClass();
        deviceContext.getClass();
        reverseProtoWriter.writeBytes(deviceContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, deviceContext.locale);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, deviceContext.resolution_density_bucket);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, deviceContext.resolution_density_dpi);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, deviceContext.resolution_height);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, deviceContext.resolution_width);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, deviceContext.model);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deviceContext.manufacturer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, deviceContext.platform_version);
        Platform.ADAPTER.encodeWithTag(reverseProtoWriter, 1, deviceContext.platform);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceContext deviceContext = (DeviceContext) obj;
        deviceContext.getClass();
        int encodedSizeWithTag = Platform.ADAPTER.encodedSizeWithTag(1, deviceContext.platform) + deviceContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, deviceContext.model) + protoAdapter.encodedSizeWithTag(3, deviceContext.manufacturer) + protoAdapter.encodedSizeWithTag(2, deviceContext.platform_version) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(9, deviceContext.locale) + protoAdapter.encodedSizeWithTag(8, deviceContext.resolution_density_bucket) + protoAdapter2.encodedSizeWithTag(7, deviceContext.resolution_density_dpi) + protoAdapter2.encodedSizeWithTag(6, deviceContext.resolution_height) + protoAdapter2.encodedSizeWithTag(5, deviceContext.resolution_width) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceContext deviceContext = (DeviceContext) obj;
        deviceContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        Platform platform = deviceContext.platform;
        String str = deviceContext.platform_version;
        String str2 = deviceContext.manufacturer;
        String str3 = deviceContext.model;
        Integer num = deviceContext.resolution_width;
        Integer num2 = deviceContext.resolution_height;
        Integer num3 = deviceContext.resolution_density_dpi;
        String str4 = deviceContext.resolution_density_bucket;
        String str5 = deviceContext.locale;
        byteString.getClass();
        return new DeviceContext(platform, str, str2, str3, num, num2, num3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeviceContext deviceContext = (DeviceContext) obj;
        deviceContext.getClass();
        Platform.ADAPTER.encodeWithTag(protoWriter, 1, deviceContext.platform);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, deviceContext.platform_version);
        protoAdapter.encodeWithTag(protoWriter, 3, deviceContext.manufacturer);
        protoAdapter.encodeWithTag(protoWriter, 4, deviceContext.model);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 5, deviceContext.resolution_width);
        protoAdapter2.encodeWithTag(protoWriter, 6, deviceContext.resolution_height);
        protoAdapter2.encodeWithTag(protoWriter, 7, deviceContext.resolution_density_dpi);
        protoAdapter.encodeWithTag(protoWriter, 8, deviceContext.resolution_density_bucket);
        protoAdapter.encodeWithTag(protoWriter, 9, deviceContext.locale);
        protoWriter.writeBytes(deviceContext.unknownFields());
    }
}
