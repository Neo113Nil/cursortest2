package com.squareup.protos.cash.investcrypto.server;

import androidx.room.TransactorKt;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.cash.investcrypto.event.CryptoOrderEvent;
import com.squareup.protos.cash.investcrypto.resources.OrderRejectionReason$Reason;
import com.squareup.protos.cash.investcrypto.server.CancelOrderResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CancelOrderResponse$InternalResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CancelOrderResponse.InternalResponse((StoredValueBalance) obj, (OrderRejectionReason$Reason) obj2, (CryptoOrderEvent) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(StoredValueBalance.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = OrderRejectionReason$Reason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CryptoOrderEvent.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CancelOrderResponse.InternalResponse internalResponse = (CancelOrderResponse.InternalResponse) obj;
        reverseProtoWriter.getClass();
        internalResponse.getClass();
        reverseProtoWriter.writeBytes(internalResponse.unknownFields());
        CryptoOrderEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, internalResponse.crypto_order_event);
        OrderRejectionReason$Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 2, internalResponse.rejection_reason);
        StoredValueBalance.ADAPTER.encodeWithTag(reverseProtoWriter, 1, internalResponse.balance);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelOrderResponse.InternalResponse internalResponse = (CancelOrderResponse.InternalResponse) obj;
        internalResponse.getClass();
        return CryptoOrderEvent.ADAPTER.encodedSizeWithTag(3, internalResponse.crypto_order_event) + OrderRejectionReason$Reason.ADAPTER.encodedSizeWithTag(2, internalResponse.rejection_reason) + StoredValueBalance.ADAPTER.encodedSizeWithTag(1, internalResponse.balance) + internalResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelOrderResponse.InternalResponse internalResponse = (CancelOrderResponse.InternalResponse) obj;
        internalResponse.getClass();
        StoredValueBalance storedValueBalance = internalResponse.balance;
        StoredValueBalance storedValueBalance2 = storedValueBalance != null ? (StoredValueBalance) StoredValueBalance.ADAPTER.redact(storedValueBalance) : null;
        CryptoOrderEvent cryptoOrderEvent = internalResponse.crypto_order_event;
        CryptoOrderEvent cryptoOrderEvent2 = cryptoOrderEvent != null ? (CryptoOrderEvent) CryptoOrderEvent.ADAPTER.redact(cryptoOrderEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        OrderRejectionReason$Reason orderRejectionReason$Reason = internalResponse.rejection_reason;
        byteString.getClass();
        return new CancelOrderResponse.InternalResponse(storedValueBalance2, orderRejectionReason$Reason, cryptoOrderEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelOrderResponse.InternalResponse internalResponse = (CancelOrderResponse.InternalResponse) obj;
        internalResponse.getClass();
        StoredValueBalance.ADAPTER.encodeWithTag(protoWriter, 1, internalResponse.balance);
        OrderRejectionReason$Reason.ADAPTER.encodeWithTag(protoWriter, 2, internalResponse.rejection_reason);
        CryptoOrderEvent.ADAPTER.encodeWithTag(protoWriter, 3, internalResponse.crypto_order_event);
        protoWriter.writeBytes(internalResponse.unknownFields());
    }
}
