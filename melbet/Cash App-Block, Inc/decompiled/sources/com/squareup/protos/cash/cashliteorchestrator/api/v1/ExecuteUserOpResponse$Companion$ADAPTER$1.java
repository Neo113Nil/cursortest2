package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExecuteUserOpResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExecuteUserOpResponse((String) obj, (String) obj2, (OperationStatus) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = OperationStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExecuteUserOpResponse executeUserOpResponse = (ExecuteUserOpResponse) obj;
        reverseProtoWriter.getClass();
        executeUserOpResponse.getClass();
        reverseProtoWriter.writeBytes(executeUserOpResponse.unknownFields());
        OperationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, executeUserOpResponse.operation_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, executeUserOpResponse.operation_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, executeUserOpResponse.user_op_hash);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExecuteUserOpResponse executeUserOpResponse = (ExecuteUserOpResponse) obj;
        executeUserOpResponse.getClass();
        int size$okio = executeUserOpResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return OperationStatus.ADAPTER.encodedSizeWithTag(3, executeUserOpResponse.operation_status) + protoAdapter.encodedSizeWithTag(2, executeUserOpResponse.operation_token) + protoAdapter.encodedSizeWithTag(1, executeUserOpResponse.user_op_hash) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExecuteUserOpResponse executeUserOpResponse = (ExecuteUserOpResponse) obj;
        executeUserOpResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = executeUserOpResponse.user_op_hash;
        String str2 = executeUserOpResponse.operation_token;
        OperationStatus operationStatus = executeUserOpResponse.operation_status;
        byteString.getClass();
        return new ExecuteUserOpResponse(str, str2, operationStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExecuteUserOpResponse executeUserOpResponse = (ExecuteUserOpResponse) obj;
        executeUserOpResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, executeUserOpResponse.user_op_hash);
        protoAdapter.encodeWithTag(protoWriter, 2, executeUserOpResponse.operation_token);
        OperationStatus.ADAPTER.encodeWithTag(protoWriter, 3, executeUserOpResponse.operation_status);
        protoWriter.writeBytes(executeUserOpResponse.unknownFields());
    }
}
