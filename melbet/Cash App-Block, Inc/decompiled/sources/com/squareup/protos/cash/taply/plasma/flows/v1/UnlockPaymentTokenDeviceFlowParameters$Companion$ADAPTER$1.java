package com.squareup.protos.cash.taply.plasma.flows.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UnlockPaymentTokenDeviceFlowParameters$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UnlockPaymentTokenDeviceFlowParameters((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnlockPaymentTokenDeviceFlowParameters unlockPaymentTokenDeviceFlowParameters = (UnlockPaymentTokenDeviceFlowParameters) obj;
        reverseProtoWriter.getClass();
        unlockPaymentTokenDeviceFlowParameters.getClass();
        reverseProtoWriter.writeBytes(unlockPaymentTokenDeviceFlowParameters.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, unlockPaymentTokenDeviceFlowParameters.passcode_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, unlockPaymentTokenDeviceFlowParameters.device_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnlockPaymentTokenDeviceFlowParameters unlockPaymentTokenDeviceFlowParameters = (UnlockPaymentTokenDeviceFlowParameters) obj;
        unlockPaymentTokenDeviceFlowParameters.getClass();
        int size$okio = unlockPaymentTokenDeviceFlowParameters.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, unlockPaymentTokenDeviceFlowParameters.passcode_token) + protoAdapter.encodedSizeWithTag(1, unlockPaymentTokenDeviceFlowParameters.device_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnlockPaymentTokenDeviceFlowParameters unlockPaymentTokenDeviceFlowParameters = (UnlockPaymentTokenDeviceFlowParameters) obj;
        unlockPaymentTokenDeviceFlowParameters.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = unlockPaymentTokenDeviceFlowParameters.device_id;
        byteString.getClass();
        return new UnlockPaymentTokenDeviceFlowParameters(str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnlockPaymentTokenDeviceFlowParameters unlockPaymentTokenDeviceFlowParameters = (UnlockPaymentTokenDeviceFlowParameters) obj;
        unlockPaymentTokenDeviceFlowParameters.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, unlockPaymentTokenDeviceFlowParameters.device_id);
        protoAdapter.encodeWithTag(protoWriter, 2, unlockPaymentTokenDeviceFlowParameters.passcode_token);
        protoWriter.writeBytes(unlockPaymentTokenDeviceFlowParameters.unknownFields());
    }
}
