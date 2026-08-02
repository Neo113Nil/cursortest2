package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RemoveCustomersFromPoolResponse$RemoveCustomerResult$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RemoveCustomersFromPoolResponse.RemoveCustomerResult((String) obj, (RemoveCustomersFromPoolResponse.Status) obj2, (RemoveCustomersFromPoolResponse.FailureReason) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = RemoveCustomersFromPoolResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = RemoveCustomersFromPoolResponse.FailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemoveCustomersFromPoolResponse.RemoveCustomerResult removeCustomerResult = (RemoveCustomersFromPoolResponse.RemoveCustomerResult) obj;
        reverseProtoWriter.getClass();
        removeCustomerResult.getClass();
        reverseProtoWriter.writeBytes(removeCustomerResult.unknownFields());
        RemoveCustomersFromPoolResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, removeCustomerResult.failure_reason);
        RemoveCustomersFromPoolResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, removeCustomerResult.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, removeCustomerResult.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemoveCustomersFromPoolResponse.RemoveCustomerResult removeCustomerResult = (RemoveCustomersFromPoolResponse.RemoveCustomerResult) obj;
        removeCustomerResult.getClass();
        return RemoveCustomersFromPoolResponse.FailureReason.ADAPTER.encodedSizeWithTag(3, removeCustomerResult.failure_reason) + RemoveCustomersFromPoolResponse.Status.ADAPTER.encodedSizeWithTag(2, removeCustomerResult.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, removeCustomerResult.customer_token) + removeCustomerResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemoveCustomersFromPoolResponse.RemoveCustomerResult removeCustomerResult = (RemoveCustomersFromPoolResponse.RemoveCustomerResult) obj;
        removeCustomerResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = removeCustomerResult.customer_token;
        RemoveCustomersFromPoolResponse.Status status = removeCustomerResult.status;
        RemoveCustomersFromPoolResponse.FailureReason failureReason = removeCustomerResult.failure_reason;
        byteString.getClass();
        return new RemoveCustomersFromPoolResponse.RemoveCustomerResult(str, status, failureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemoveCustomersFromPoolResponse.RemoveCustomerResult removeCustomerResult = (RemoveCustomersFromPoolResponse.RemoveCustomerResult) obj;
        removeCustomerResult.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, removeCustomerResult.customer_token);
        RemoveCustomersFromPoolResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, removeCustomerResult.status);
        RemoveCustomersFromPoolResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 3, removeCustomerResult.failure_reason);
        protoWriter.writeBytes(removeCustomerResult.unknownFields());
    }
}
