package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SetIncomingRequestPolicyResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SetIncomingRequestPolicyResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetIncomingRequestPolicyResponse((ResponseContext) obj, (SetIncomingRequestPolicyResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = SetIncomingRequestPolicyResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetIncomingRequestPolicyResponse setIncomingRequestPolicyResponse = (SetIncomingRequestPolicyResponse) obj;
        reverseProtoWriter.getClass();
        setIncomingRequestPolicyResponse.getClass();
        reverseProtoWriter.writeBytes(setIncomingRequestPolicyResponse.unknownFields());
        SetIncomingRequestPolicyResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setIncomingRequestPolicyResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setIncomingRequestPolicyResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetIncomingRequestPolicyResponse setIncomingRequestPolicyResponse = (SetIncomingRequestPolicyResponse) obj;
        setIncomingRequestPolicyResponse.getClass();
        return SetIncomingRequestPolicyResponse.Status.ADAPTER.encodedSizeWithTag(2, setIncomingRequestPolicyResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, setIncomingRequestPolicyResponse.response_context) + setIncomingRequestPolicyResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetIncomingRequestPolicyResponse setIncomingRequestPolicyResponse = (SetIncomingRequestPolicyResponse) obj;
        setIncomingRequestPolicyResponse.getClass();
        ResponseContext responseContext = setIncomingRequestPolicyResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SetIncomingRequestPolicyResponse.Status status = setIncomingRequestPolicyResponse.status;
        byteString.getClass();
        return new SetIncomingRequestPolicyResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetIncomingRequestPolicyResponse setIncomingRequestPolicyResponse = (SetIncomingRequestPolicyResponse) obj;
        setIncomingRequestPolicyResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setIncomingRequestPolicyResponse.response_context);
        SetIncomingRequestPolicyResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, setIncomingRequestPolicyResponse.status);
        protoWriter.writeBytes(setIncomingRequestPolicyResponse.unknownFields());
    }
}
