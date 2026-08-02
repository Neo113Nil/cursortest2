package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetRatePlanResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetRatePlanResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetRatePlanResponse((ResponseContext) obj, (SetRatePlanResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SetRatePlanResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetRatePlanResponse setRatePlanResponse = (SetRatePlanResponse) obj;
        reverseProtoWriter.getClass();
        setRatePlanResponse.getClass();
        reverseProtoWriter.writeBytes(setRatePlanResponse.unknownFields());
        SetRatePlanResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setRatePlanResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, setRatePlanResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetRatePlanResponse setRatePlanResponse = (SetRatePlanResponse) obj;
        setRatePlanResponse.getClass();
        return SetRatePlanResponse.Status.ADAPTER.encodedSizeWithTag(1, setRatePlanResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(7, setRatePlanResponse.response_context) + setRatePlanResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetRatePlanResponse setRatePlanResponse = (SetRatePlanResponse) obj;
        setRatePlanResponse.getClass();
        ResponseContext responseContext = setRatePlanResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetRatePlanResponse.Status status = setRatePlanResponse.status;
        byteString.getClass();
        return new SetRatePlanResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetRatePlanResponse setRatePlanResponse = (SetRatePlanResponse) obj;
        setRatePlanResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 7, setRatePlanResponse.response_context);
        SetRatePlanResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setRatePlanResponse.status);
        protoWriter.writeBytes(setRatePlanResponse.unknownFields());
    }
}
