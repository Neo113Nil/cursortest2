package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.InitiatePasscodeResetResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InitiatePasscodeResetResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiatePasscodeResetResponse((ResponseContext) obj, (InitiatePasscodeResetResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = InitiatePasscodeResetResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiatePasscodeResetResponse initiatePasscodeResetResponse = (InitiatePasscodeResetResponse) obj;
        reverseProtoWriter.getClass();
        initiatePasscodeResetResponse.getClass();
        reverseProtoWriter.writeBytes(initiatePasscodeResetResponse.unknownFields());
        InitiatePasscodeResetResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiatePasscodeResetResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, initiatePasscodeResetResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiatePasscodeResetResponse initiatePasscodeResetResponse = (InitiatePasscodeResetResponse) obj;
        initiatePasscodeResetResponse.getClass();
        return InitiatePasscodeResetResponse.Status.ADAPTER.encodedSizeWithTag(1, initiatePasscodeResetResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(3, initiatePasscodeResetResponse.response_context) + initiatePasscodeResetResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiatePasscodeResetResponse initiatePasscodeResetResponse = (InitiatePasscodeResetResponse) obj;
        initiatePasscodeResetResponse.getClass();
        ResponseContext responseContext = initiatePasscodeResetResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        InitiatePasscodeResetResponse.Status status = initiatePasscodeResetResponse.status;
        byteString.getClass();
        return new InitiatePasscodeResetResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiatePasscodeResetResponse initiatePasscodeResetResponse = (InitiatePasscodeResetResponse) obj;
        initiatePasscodeResetResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, initiatePasscodeResetResponse.response_context);
        InitiatePasscodeResetResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, initiatePasscodeResetResponse.status);
        protoWriter.writeBytes(initiatePasscodeResetResponse.unknownFields());
    }
}
