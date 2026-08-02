package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetFullNameResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetFullNameResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetFullNameResponse((ResponseContext) obj, (SetFullNameResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SetFullNameResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 10) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetFullNameResponse setFullNameResponse = (SetFullNameResponse) obj;
        reverseProtoWriter.getClass();
        setFullNameResponse.getClass();
        reverseProtoWriter.writeBytes(setFullNameResponse.unknownFields());
        SetFullNameResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setFullNameResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 10, setFullNameResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetFullNameResponse setFullNameResponse = (SetFullNameResponse) obj;
        setFullNameResponse.getClass();
        return SetFullNameResponse.Status.ADAPTER.encodedSizeWithTag(1, setFullNameResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(10, setFullNameResponse.response_context) + setFullNameResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetFullNameResponse setFullNameResponse = (SetFullNameResponse) obj;
        setFullNameResponse.getClass();
        ResponseContext responseContext = setFullNameResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetFullNameResponse.Status status = setFullNameResponse.status;
        byteString.getClass();
        return new SetFullNameResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetFullNameResponse setFullNameResponse = (SetFullNameResponse) obj;
        setFullNameResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 10, setFullNameResponse.response_context);
        SetFullNameResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, setFullNameResponse.status);
        protoWriter.writeBytes(setFullNameResponse.unknownFields());
    }
}
