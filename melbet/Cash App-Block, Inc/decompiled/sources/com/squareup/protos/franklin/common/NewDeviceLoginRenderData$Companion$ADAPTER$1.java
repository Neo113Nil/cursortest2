package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.NewDeviceLoginRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class NewDeviceLoginRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new NewDeviceLoginRenderData((String) obj, (String) obj2, (NewDeviceLoginRenderData.Status) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = NewDeviceLoginRenderData.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NewDeviceLoginRenderData newDeviceLoginRenderData = (NewDeviceLoginRenderData) obj;
        reverseProtoWriter.getClass();
        newDeviceLoginRenderData.getClass();
        reverseProtoWriter.writeBytes(newDeviceLoginRenderData.unknownFields());
        NewDeviceLoginRenderData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 3, newDeviceLoginRenderData.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, newDeviceLoginRenderData.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, newDeviceLoginRenderData.action_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NewDeviceLoginRenderData newDeviceLoginRenderData = (NewDeviceLoginRenderData) obj;
        newDeviceLoginRenderData.getClass();
        int size$okio = newDeviceLoginRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return NewDeviceLoginRenderData.Status.ADAPTER.encodedSizeWithTag(3, newDeviceLoginRenderData.status) + protoAdapter.encodedSizeWithTag(2, newDeviceLoginRenderData.icon_url) + protoAdapter.encodedSizeWithTag(1, newDeviceLoginRenderData.action_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NewDeviceLoginRenderData newDeviceLoginRenderData = (NewDeviceLoginRenderData) obj;
        newDeviceLoginRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = newDeviceLoginRenderData.action_url;
        String str2 = newDeviceLoginRenderData.icon_url;
        NewDeviceLoginRenderData.Status status = newDeviceLoginRenderData.status;
        byteString.getClass();
        return new NewDeviceLoginRenderData(str, str2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NewDeviceLoginRenderData newDeviceLoginRenderData = (NewDeviceLoginRenderData) obj;
        newDeviceLoginRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, newDeviceLoginRenderData.action_url);
        protoAdapter.encodeWithTag(protoWriter, 2, newDeviceLoginRenderData.icon_url);
        NewDeviceLoginRenderData.Status.ADAPTER.encodeWithTag(protoWriter, 3, newDeviceLoginRenderData.status);
        protoWriter.writeBytes(newDeviceLoginRenderData.unknownFields());
    }
}
