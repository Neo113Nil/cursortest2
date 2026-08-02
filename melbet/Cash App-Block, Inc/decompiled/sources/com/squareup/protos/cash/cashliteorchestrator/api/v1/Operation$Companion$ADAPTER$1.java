package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Operation$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        OperationType operationType;
        OperationStatus operationStatus;
        Chain chain;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        OperationType operationType2 = null;
        OperationStatus operationStatus2 = null;
        Chain chain2 = null;
        Chain chain3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        OperationFailureReason operationFailureReason = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Operation(str, operationType2, operationStatus2, chain2, chain3, str2, str3, str4, str5, operationFailureReason, str6, str7, str8, num, str9, str10, str11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    operationType = operationType2;
                    operationStatus = operationStatus2;
                    chain = chain2;
                    try {
                        operationType2 = OperationType.ADAPTER.decode(protoReader);
                        operationStatus2 = operationStatus;
                        chain2 = chain;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    operationType = operationType2;
                    operationStatus = operationStatus2;
                    chain = chain2;
                    try {
                        operationStatus2 = OperationStatus.ADAPTER.decode(protoReader);
                        operationType2 = operationType;
                        chain2 = chain;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    operationType = operationType2;
                    operationStatus = operationStatus2;
                    chain = chain2;
                    try {
                        chain2 = Chain.ADAPTER.decode(protoReader);
                        operationType2 = operationType;
                        operationStatus2 = operationStatus;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 5:
                    operationType = operationType2;
                    operationStatus = operationStatus2;
                    chain = chain2;
                    try {
                        chain3 = Chain.ADAPTER.decode(protoReader);
                        operationType2 = operationType;
                        operationStatus2 = operationStatus;
                        chain2 = chain;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 6:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 7:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 8:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 10:
                    try {
                        operationFailureReason = OperationFailureReason.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        operationType = operationType2;
                        operationStatus = operationStatus2;
                        chain = chain2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 11:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 16:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 17:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    operationType = operationType2;
                    operationStatus = operationStatus2;
                    chain = chain2;
                    decode = str;
                    operationType2 = operationType;
                    operationStatus2 = operationStatus;
                    chain2 = chain;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Operation operation2 = (Operation) obj;
        reverseProtoWriter.getClass();
        operation2.getClass();
        reverseProtoWriter.writeBytes(operation2.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, operation2.parent_operation_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, operation2.wallet_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, operation2.token_address);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 14, operation2.decimals);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, operation2.completed_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, operation2.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, operation2.failure_reason);
        OperationFailureReason.ADAPTER.encodeWithTag(reverseProtoWriter, 10, operation2.failure_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, operation2.dest_tx_hash);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, operation2.source_tx_hash);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, operation2.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, operation2.counterparty);
        ProtoAdapter protoAdapter2 = Chain.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, operation2.dest_chain);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, operation2.source_chain);
        OperationStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 3, operation2.status);
        OperationType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, operation2.f1253type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, operation2.operation_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Operation operation2 = (Operation) obj;
        operation2.getClass();
        int size$okio = operation2.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = OperationStatus.ADAPTER.encodedSizeWithTag(3, operation2.status) + OperationType.ADAPTER.encodedSizeWithTag(2, operation2.f1253type) + protoAdapter.encodedSizeWithTag(1, operation2.operation_token) + size$okio;
        ProtoAdapter protoAdapter2 = Chain.ADAPTER;
        return protoAdapter.encodedSizeWithTag(17, operation2.parent_operation_token) + protoAdapter.encodedSizeWithTag(16, operation2.wallet_address) + protoAdapter.encodedSizeWithTag(15, operation2.token_address) + ProtoAdapter.INT32.encodedSizeWithTag(14, operation2.decimals) + protoAdapter.encodedSizeWithTag(12, operation2.completed_at) + protoAdapter.encodedSizeWithTag(11, operation2.created_at) + protoAdapter.encodedSizeWithTag(13, operation2.failure_reason) + OperationFailureReason.ADAPTER.encodedSizeWithTag(10, operation2.failure_code) + protoAdapter.encodedSizeWithTag(9, operation2.dest_tx_hash) + protoAdapter.encodedSizeWithTag(8, operation2.source_tx_hash) + protoAdapter.encodedSizeWithTag(7, operation2.amount) + protoAdapter.encodedSizeWithTag(6, operation2.counterparty) + protoAdapter2.encodedSizeWithTag(5, operation2.dest_chain) + protoAdapter2.encodedSizeWithTag(4, operation2.source_chain) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Operation operation2 = (Operation) obj;
        operation2.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = operation2.operation_token;
        OperationType operationType = operation2.f1253type;
        OperationStatus operationStatus = operation2.status;
        Chain chain = operation2.source_chain;
        Chain chain2 = operation2.dest_chain;
        String str2 = operation2.counterparty;
        String str3 = operation2.amount;
        String str4 = operation2.source_tx_hash;
        String str5 = operation2.dest_tx_hash;
        OperationFailureReason operationFailureReason = operation2.failure_code;
        String str6 = operation2.failure_reason;
        String str7 = operation2.created_at;
        String str8 = operation2.completed_at;
        Integer num = operation2.decimals;
        String str9 = operation2.token_address;
        String str10 = operation2.wallet_address;
        String str11 = operation2.parent_operation_token;
        byteString.getClass();
        return new Operation(str, operationType, operationStatus, chain, chain2, str2, str3, str4, str5, operationFailureReason, str6, str7, str8, num, str9, str10, str11, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Operation operation2 = (Operation) obj;
        operation2.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, operation2.operation_token);
        OperationType.ADAPTER.encodeWithTag(protoWriter, 2, operation2.f1253type);
        OperationStatus.ADAPTER.encodeWithTag(protoWriter, 3, operation2.status);
        ProtoAdapter protoAdapter2 = Chain.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, operation2.source_chain);
        protoAdapter2.encodeWithTag(protoWriter, 5, operation2.dest_chain);
        protoAdapter.encodeWithTag(protoWriter, 6, operation2.counterparty);
        protoAdapter.encodeWithTag(protoWriter, 7, operation2.amount);
        protoAdapter.encodeWithTag(protoWriter, 8, operation2.source_tx_hash);
        protoAdapter.encodeWithTag(protoWriter, 9, operation2.dest_tx_hash);
        OperationFailureReason.ADAPTER.encodeWithTag(protoWriter, 10, operation2.failure_code);
        protoAdapter.encodeWithTag(protoWriter, 13, operation2.failure_reason);
        protoAdapter.encodeWithTag(protoWriter, 11, operation2.created_at);
        protoAdapter.encodeWithTag(protoWriter, 12, operation2.completed_at);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, operation2.decimals);
        protoAdapter.encodeWithTag(protoWriter, 15, operation2.token_address);
        protoAdapter.encodeWithTag(protoWriter, 16, operation2.wallet_address);
        protoAdapter.encodeWithTag(protoWriter, 17, operation2.parent_operation_token);
        protoWriter.writeBytes(operation2.unknownFields());
    }
}
