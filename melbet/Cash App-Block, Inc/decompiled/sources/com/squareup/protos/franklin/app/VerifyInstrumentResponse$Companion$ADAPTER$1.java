package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifyInstrumentResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyInstrumentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyInstrumentResponse((ResponseContext) obj, (VerifyInstrumentResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifyInstrumentResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyInstrumentResponse verifyInstrumentResponse = (VerifyInstrumentResponse) obj;
        reverseProtoWriter.getClass();
        verifyInstrumentResponse.getClass();
        reverseProtoWriter.writeBytes(verifyInstrumentResponse.unknownFields());
        VerifyInstrumentResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyInstrumentResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, verifyInstrumentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyInstrumentResponse verifyInstrumentResponse = (VerifyInstrumentResponse) obj;
        verifyInstrumentResponse.getClass();
        return VerifyInstrumentResponse.Status.ADAPTER.encodedSizeWithTag(1, verifyInstrumentResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(5, verifyInstrumentResponse.response_context) + verifyInstrumentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyInstrumentResponse verifyInstrumentResponse = (VerifyInstrumentResponse) obj;
        verifyInstrumentResponse.getClass();
        ResponseContext responseContext = verifyInstrumentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyInstrumentResponse.Status status = verifyInstrumentResponse.status;
        byteString.getClass();
        return new VerifyInstrumentResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyInstrumentResponse verifyInstrumentResponse = (VerifyInstrumentResponse) obj;
        verifyInstrumentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 5, verifyInstrumentResponse.response_context);
        VerifyInstrumentResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifyInstrumentResponse.status);
        protoWriter.writeBytes(verifyInstrumentResponse.unknownFields());
    }
}
