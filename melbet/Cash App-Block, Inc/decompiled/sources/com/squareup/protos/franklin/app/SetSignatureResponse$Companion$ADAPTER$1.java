package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetSignatureResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetSignatureResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetSignatureResponse((ResponseContext) obj, (SetSignatureResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SetSignatureResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetSignatureResponse setSignatureResponse = (SetSignatureResponse) obj;
        reverseProtoWriter.getClass();
        setSignatureResponse.getClass();
        reverseProtoWriter.writeBytes(setSignatureResponse.unknownFields());
        SetSignatureResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setSignatureResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setSignatureResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetSignatureResponse setSignatureResponse = (SetSignatureResponse) obj;
        setSignatureResponse.getClass();
        return SetSignatureResponse.Status.ADAPTER.encodedSizeWithTag(2, setSignatureResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, setSignatureResponse.response_context) + setSignatureResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetSignatureResponse setSignatureResponse = (SetSignatureResponse) obj;
        setSignatureResponse.getClass();
        ResponseContext responseContext = setSignatureResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetSignatureResponse.Status status = setSignatureResponse.status;
        byteString.getClass();
        return new SetSignatureResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetSignatureResponse setSignatureResponse = (SetSignatureResponse) obj;
        setSignatureResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setSignatureResponse.response_context);
        SetSignatureResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, setSignatureResponse.status);
        protoWriter.writeBytes(setSignatureResponse.unknownFields());
    }
}
