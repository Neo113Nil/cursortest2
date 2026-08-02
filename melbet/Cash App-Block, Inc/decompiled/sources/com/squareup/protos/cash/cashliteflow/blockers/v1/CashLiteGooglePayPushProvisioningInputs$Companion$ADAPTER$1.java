package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashLiteGooglePayPushProvisioningInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashLiteGooglePayPushProvisioningInputs((PushProvisioningStatus) obj, (GooglePayPushProvisioningFailureReason) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PushProvisioningStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = GooglePayPushProvisioningFailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashLiteGooglePayPushProvisioningInputs cashLiteGooglePayPushProvisioningInputs = (CashLiteGooglePayPushProvisioningInputs) obj;
        reverseProtoWriter.getClass();
        cashLiteGooglePayPushProvisioningInputs.getClass();
        reverseProtoWriter.writeBytes(cashLiteGooglePayPushProvisioningInputs.unknownFields());
        GooglePayPushProvisioningFailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashLiteGooglePayPushProvisioningInputs.failure_reason);
        PushProvisioningStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashLiteGooglePayPushProvisioningInputs.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLiteGooglePayPushProvisioningInputs cashLiteGooglePayPushProvisioningInputs = (CashLiteGooglePayPushProvisioningInputs) obj;
        cashLiteGooglePayPushProvisioningInputs.getClass();
        return GooglePayPushProvisioningFailureReason.ADAPTER.encodedSizeWithTag(2, cashLiteGooglePayPushProvisioningInputs.failure_reason) + PushProvisioningStatus.ADAPTER.encodedSizeWithTag(1, cashLiteGooglePayPushProvisioningInputs.status) + cashLiteGooglePayPushProvisioningInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLiteGooglePayPushProvisioningInputs cashLiteGooglePayPushProvisioningInputs = (CashLiteGooglePayPushProvisioningInputs) obj;
        cashLiteGooglePayPushProvisioningInputs.getClass();
        ByteString byteString = ByteString.EMPTY;
        PushProvisioningStatus pushProvisioningStatus = cashLiteGooglePayPushProvisioningInputs.status;
        GooglePayPushProvisioningFailureReason googlePayPushProvisioningFailureReason = cashLiteGooglePayPushProvisioningInputs.failure_reason;
        byteString.getClass();
        return new CashLiteGooglePayPushProvisioningInputs(pushProvisioningStatus, googlePayPushProvisioningFailureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLiteGooglePayPushProvisioningInputs cashLiteGooglePayPushProvisioningInputs = (CashLiteGooglePayPushProvisioningInputs) obj;
        cashLiteGooglePayPushProvisioningInputs.getClass();
        PushProvisioningStatus.ADAPTER.encodeWithTag(protoWriter, 1, cashLiteGooglePayPushProvisioningInputs.status);
        GooglePayPushProvisioningFailureReason.ADAPTER.encodeWithTag(protoWriter, 2, cashLiteGooglePayPushProvisioningInputs.failure_reason);
        protoWriter.writeBytes(cashLiteGooglePayPushProvisioningInputs.unknownFields());
    }
}
