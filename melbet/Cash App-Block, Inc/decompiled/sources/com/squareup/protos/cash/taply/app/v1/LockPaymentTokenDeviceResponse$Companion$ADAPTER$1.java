package com.squareup.protos.cash.taply.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.taply.model.v1.PaymentTokenDevice;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LockPaymentTokenDeviceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LockPaymentTokenDeviceResponse((PaymentTokenDevice) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PaymentTokenDevice.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LockPaymentTokenDeviceResponse lockPaymentTokenDeviceResponse = (LockPaymentTokenDeviceResponse) obj;
        reverseProtoWriter.getClass();
        lockPaymentTokenDeviceResponse.getClass();
        reverseProtoWriter.writeBytes(lockPaymentTokenDeviceResponse.unknownFields());
        PaymentTokenDevice.ADAPTER.encodeWithTag(reverseProtoWriter, 1, lockPaymentTokenDeviceResponse.payment_token_device);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LockPaymentTokenDeviceResponse lockPaymentTokenDeviceResponse = (LockPaymentTokenDeviceResponse) obj;
        lockPaymentTokenDeviceResponse.getClass();
        return PaymentTokenDevice.ADAPTER.encodedSizeWithTag(1, lockPaymentTokenDeviceResponse.payment_token_device) + lockPaymentTokenDeviceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LockPaymentTokenDeviceResponse lockPaymentTokenDeviceResponse = (LockPaymentTokenDeviceResponse) obj;
        lockPaymentTokenDeviceResponse.getClass();
        PaymentTokenDevice paymentTokenDevice = lockPaymentTokenDeviceResponse.payment_token_device;
        PaymentTokenDevice paymentTokenDevice2 = paymentTokenDevice != null ? (PaymentTokenDevice) PaymentTokenDevice.ADAPTER.redact(paymentTokenDevice) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LockPaymentTokenDeviceResponse(paymentTokenDevice2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LockPaymentTokenDeviceResponse lockPaymentTokenDeviceResponse = (LockPaymentTokenDeviceResponse) obj;
        lockPaymentTokenDeviceResponse.getClass();
        PaymentTokenDevice.ADAPTER.encodeWithTag(protoWriter, 1, lockPaymentTokenDeviceResponse.payment_token_device);
        protoWriter.writeBytes(lockPaymentTokenDeviceResponse.unknownFields());
    }
}
