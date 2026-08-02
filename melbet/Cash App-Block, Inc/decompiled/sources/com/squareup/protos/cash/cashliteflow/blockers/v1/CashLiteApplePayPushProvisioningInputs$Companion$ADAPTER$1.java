package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashLiteApplePayPushProvisioningInputs$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashLiteApplePayPushProvisioningInputs((PushProvisioningStatus) obj, (ApplePayPushProvisioningFailureReason) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    obj2 = ApplePayPushProvisioningFailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashLiteApplePayPushProvisioningInputs cashLiteApplePayPushProvisioningInputs = (CashLiteApplePayPushProvisioningInputs) obj;
        reverseProtoWriter.getClass();
        cashLiteApplePayPushProvisioningInputs.getClass();
        reverseProtoWriter.writeBytes(cashLiteApplePayPushProvisioningInputs.unknownFields());
        ApplePayPushProvisioningFailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashLiteApplePayPushProvisioningInputs.failure_reason);
        PushProvisioningStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashLiteApplePayPushProvisioningInputs.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashLiteApplePayPushProvisioningInputs cashLiteApplePayPushProvisioningInputs = (CashLiteApplePayPushProvisioningInputs) obj;
        cashLiteApplePayPushProvisioningInputs.getClass();
        return ApplePayPushProvisioningFailureReason.ADAPTER.encodedSizeWithTag(2, cashLiteApplePayPushProvisioningInputs.failure_reason) + PushProvisioningStatus.ADAPTER.encodedSizeWithTag(1, cashLiteApplePayPushProvisioningInputs.status) + cashLiteApplePayPushProvisioningInputs.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashLiteApplePayPushProvisioningInputs cashLiteApplePayPushProvisioningInputs = (CashLiteApplePayPushProvisioningInputs) obj;
        cashLiteApplePayPushProvisioningInputs.getClass();
        ByteString byteString = ByteString.EMPTY;
        PushProvisioningStatus pushProvisioningStatus = cashLiteApplePayPushProvisioningInputs.status;
        ApplePayPushProvisioningFailureReason applePayPushProvisioningFailureReason = cashLiteApplePayPushProvisioningInputs.failure_reason;
        byteString.getClass();
        return new CashLiteApplePayPushProvisioningInputs(pushProvisioningStatus, applePayPushProvisioningFailureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashLiteApplePayPushProvisioningInputs cashLiteApplePayPushProvisioningInputs = (CashLiteApplePayPushProvisioningInputs) obj;
        cashLiteApplePayPushProvisioningInputs.getClass();
        PushProvisioningStatus.ADAPTER.encodeWithTag(protoWriter, 1, cashLiteApplePayPushProvisioningInputs.status);
        ApplePayPushProvisioningFailureReason.ADAPTER.encodeWithTag(protoWriter, 2, cashLiteApplePayPushProvisioningInputs.failure_reason);
        protoWriter.writeBytes(cashLiteApplePayPushProvisioningInputs.unknownFields());
    }
}
