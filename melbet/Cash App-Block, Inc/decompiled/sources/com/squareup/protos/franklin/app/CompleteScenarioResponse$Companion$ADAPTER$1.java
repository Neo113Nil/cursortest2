package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.CompleteScenarioResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CompleteScenarioResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CompleteScenarioResponse((ResponseContext) obj, (CompleteScenarioResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = CompleteScenarioResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 8) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CompleteScenarioResponse completeScenarioResponse = (CompleteScenarioResponse) obj;
        reverseProtoWriter.getClass();
        completeScenarioResponse.getClass();
        reverseProtoWriter.writeBytes(completeScenarioResponse.unknownFields());
        CompleteScenarioResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, completeScenarioResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, completeScenarioResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CompleteScenarioResponse completeScenarioResponse = (CompleteScenarioResponse) obj;
        completeScenarioResponse.getClass();
        return CompleteScenarioResponse.Status.ADAPTER.encodedSizeWithTag(1, completeScenarioResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(8, completeScenarioResponse.response_context) + completeScenarioResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CompleteScenarioResponse completeScenarioResponse = (CompleteScenarioResponse) obj;
        completeScenarioResponse.getClass();
        ResponseContext responseContext = completeScenarioResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        CompleteScenarioResponse.Status status = completeScenarioResponse.status;
        byteString.getClass();
        return new CompleteScenarioResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CompleteScenarioResponse completeScenarioResponse = (CompleteScenarioResponse) obj;
        completeScenarioResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 8, completeScenarioResponse.response_context);
        CompleteScenarioResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, completeScenarioResponse.status);
        protoWriter.writeBytes(completeScenarioResponse.unknownFields());
    }
}
