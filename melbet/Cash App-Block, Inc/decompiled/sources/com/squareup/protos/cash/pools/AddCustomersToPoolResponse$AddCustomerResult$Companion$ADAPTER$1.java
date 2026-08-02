package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AddCustomersToPoolResponse$AddCustomerResult$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AddCustomersToPoolResponse.AddCustomerResult((String) obj, (AddCustomersToPoolResponse.Status) obj2, (AddCustomersToPoolResponse.FailureReason) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = AddCustomersToPoolResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = AddCustomersToPoolResponse.FailureReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddCustomersToPoolResponse.AddCustomerResult addCustomerResult = (AddCustomersToPoolResponse.AddCustomerResult) obj;
        reverseProtoWriter.getClass();
        addCustomerResult.getClass();
        reverseProtoWriter.writeBytes(addCustomerResult.unknownFields());
        AddCustomersToPoolResponse.FailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, addCustomerResult.failure_reason);
        AddCustomersToPoolResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addCustomerResult.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, addCustomerResult.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddCustomersToPoolResponse.AddCustomerResult addCustomerResult = (AddCustomersToPoolResponse.AddCustomerResult) obj;
        addCustomerResult.getClass();
        return AddCustomersToPoolResponse.FailureReason.ADAPTER.encodedSizeWithTag(3, addCustomerResult.failure_reason) + AddCustomersToPoolResponse.Status.ADAPTER.encodedSizeWithTag(2, addCustomerResult.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, addCustomerResult.customer_token) + addCustomerResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddCustomersToPoolResponse.AddCustomerResult addCustomerResult = (AddCustomersToPoolResponse.AddCustomerResult) obj;
        addCustomerResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = addCustomerResult.customer_token;
        AddCustomersToPoolResponse.Status status = addCustomerResult.status;
        AddCustomersToPoolResponse.FailureReason failureReason = addCustomerResult.failure_reason;
        byteString.getClass();
        return new AddCustomersToPoolResponse.AddCustomerResult(str, status, failureReason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddCustomersToPoolResponse.AddCustomerResult addCustomerResult = (AddCustomersToPoolResponse.AddCustomerResult) obj;
        addCustomerResult.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, addCustomerResult.customer_token);
        AddCustomersToPoolResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, addCustomerResult.status);
        AddCustomersToPoolResponse.FailureReason.ADAPTER.encodeWithTag(protoWriter, 3, addCustomerResult.failure_reason);
        protoWriter.writeBytes(addCustomerResult.unknownFields());
    }
}
