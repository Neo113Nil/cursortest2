package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetOperationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetOperationResponse((Operation) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Operation.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetOperationResponse getOperationResponse = (GetOperationResponse) obj;
        reverseProtoWriter.getClass();
        getOperationResponse.getClass();
        reverseProtoWriter.writeBytes(getOperationResponse.unknownFields());
        Operation.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getOperationResponse.f1252operation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetOperationResponse getOperationResponse = (GetOperationResponse) obj;
        getOperationResponse.getClass();
        return Operation.ADAPTER.encodedSizeWithTag(1, getOperationResponse.f1252operation) + getOperationResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetOperationResponse getOperationResponse = (GetOperationResponse) obj;
        getOperationResponse.getClass();
        Operation operation2 = getOperationResponse.f1252operation;
        Operation operation3 = operation2 != null ? (Operation) Operation.ADAPTER.redact(operation2) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetOperationResponse(operation3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetOperationResponse getOperationResponse = (GetOperationResponse) obj;
        getOperationResponse.getClass();
        Operation.ADAPTER.encodeWithTag(protoWriter, 1, getOperationResponse.f1252operation);
        protoWriter.writeBytes(getOperationResponse.unknownFields());
    }
}
