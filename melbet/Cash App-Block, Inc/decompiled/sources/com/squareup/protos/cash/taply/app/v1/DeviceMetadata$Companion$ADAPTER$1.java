package com.squareup.protos.cash.taply.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DeviceMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeviceMetadata((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeviceMetadata deviceMetadata = (DeviceMetadata) obj;
        reverseProtoWriter.getClass();
        deviceMetadata.getClass();
        reverseProtoWriter.writeBytes(deviceMetadata.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, deviceMetadata.tag_theme_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceMetadata deviceMetadata = (DeviceMetadata) obj;
        deviceMetadata.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, deviceMetadata.tag_theme_token) + deviceMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceMetadata deviceMetadata = (DeviceMetadata) obj;
        deviceMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = deviceMetadata.tag_theme_token;
        byteString.getClass();
        return new DeviceMetadata(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeviceMetadata deviceMetadata = (DeviceMetadata) obj;
        deviceMetadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deviceMetadata.tag_theme_token);
        protoWriter.writeBytes(deviceMetadata.unknownFields());
    }
}
