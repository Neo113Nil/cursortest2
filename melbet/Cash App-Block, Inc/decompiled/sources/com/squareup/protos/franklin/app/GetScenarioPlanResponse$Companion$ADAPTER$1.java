package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.GetScenarioPlanResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetScenarioPlanResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetScenarioPlanResponse((ResponseContext) obj, (GetScenarioPlanResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = GetScenarioPlanResponse.Status.ADAPTER.decode(protoReader);
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
        GetScenarioPlanResponse getScenarioPlanResponse = (GetScenarioPlanResponse) obj;
        reverseProtoWriter.getClass();
        getScenarioPlanResponse.getClass();
        reverseProtoWriter.writeBytes(getScenarioPlanResponse.unknownFields());
        GetScenarioPlanResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getScenarioPlanResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getScenarioPlanResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetScenarioPlanResponse getScenarioPlanResponse = (GetScenarioPlanResponse) obj;
        getScenarioPlanResponse.getClass();
        return GetScenarioPlanResponse.Status.ADAPTER.encodedSizeWithTag(1, getScenarioPlanResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(3, getScenarioPlanResponse.response_context) + getScenarioPlanResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetScenarioPlanResponse getScenarioPlanResponse = (GetScenarioPlanResponse) obj;
        getScenarioPlanResponse.getClass();
        ResponseContext responseContext = getScenarioPlanResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        GetScenarioPlanResponse.Status status = getScenarioPlanResponse.status;
        byteString.getClass();
        return new GetScenarioPlanResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetScenarioPlanResponse getScenarioPlanResponse = (GetScenarioPlanResponse) obj;
        getScenarioPlanResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, getScenarioPlanResponse.response_context);
        GetScenarioPlanResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, getScenarioPlanResponse.status);
        protoWriter.writeBytes(getScenarioPlanResponse.unknownFields());
    }
}
