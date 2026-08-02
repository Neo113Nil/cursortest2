package com.squareup.protos.cash.taply.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DeviceProvisioningStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeviceProvisioningStatus((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeviceProvisioningStatus deviceProvisioningStatus = (DeviceProvisioningStatus) obj;
        reverseProtoWriter.getClass();
        deviceProvisioningStatus.getClass();
        reverseProtoWriter.writeBytes(deviceProvisioningStatus.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, deviceProvisioningStatus.is_provisioned);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeviceProvisioningStatus deviceProvisioningStatus = (DeviceProvisioningStatus) obj;
        deviceProvisioningStatus.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, deviceProvisioningStatus.is_provisioned) + deviceProvisioningStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeviceProvisioningStatus deviceProvisioningStatus = (DeviceProvisioningStatus) obj;
        deviceProvisioningStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = deviceProvisioningStatus.is_provisioned;
        byteString.getClass();
        return new DeviceProvisioningStatus(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeviceProvisioningStatus deviceProvisioningStatus = (DeviceProvisioningStatus) obj;
        deviceProvisioningStatus.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, deviceProvisioningStatus.is_provisioned);
        protoWriter.writeBytes(deviceProvisioningStatus.unknownFields());
    }
}
