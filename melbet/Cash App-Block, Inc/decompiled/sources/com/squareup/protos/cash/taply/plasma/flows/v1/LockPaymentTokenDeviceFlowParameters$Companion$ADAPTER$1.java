package com.squareup.protos.cash.taply.plasma.flows.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LockPaymentTokenDeviceFlowParameters((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LockPaymentTokenDeviceFlowParameters lockPaymentTokenDeviceFlowParameters = (LockPaymentTokenDeviceFlowParameters) obj;
        reverseProtoWriter.getClass();
        lockPaymentTokenDeviceFlowParameters.getClass();
        reverseProtoWriter.writeBytes(lockPaymentTokenDeviceFlowParameters.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, lockPaymentTokenDeviceFlowParameters.device_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LockPaymentTokenDeviceFlowParameters lockPaymentTokenDeviceFlowParameters = (LockPaymentTokenDeviceFlowParameters) obj;
        lockPaymentTokenDeviceFlowParameters.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, lockPaymentTokenDeviceFlowParameters.device_id) + lockPaymentTokenDeviceFlowParameters.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LockPaymentTokenDeviceFlowParameters lockPaymentTokenDeviceFlowParameters = (LockPaymentTokenDeviceFlowParameters) obj;
        lockPaymentTokenDeviceFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = lockPaymentTokenDeviceFlowParameters.device_id;
        byteString.getClass();
        return new LockPaymentTokenDeviceFlowParameters(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LockPaymentTokenDeviceFlowParameters lockPaymentTokenDeviceFlowParameters = (LockPaymentTokenDeviceFlowParameters) obj;
        lockPaymentTokenDeviceFlowParameters.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, lockPaymentTokenDeviceFlowParameters.device_id);
        protoWriter.writeBytes(lockPaymentTokenDeviceFlowParameters.unknownFields());
    }
}
