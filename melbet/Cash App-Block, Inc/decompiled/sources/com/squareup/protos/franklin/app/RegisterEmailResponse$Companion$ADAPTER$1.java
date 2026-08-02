package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RegisterEmailResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterEmailResponse((ResponseContext) obj, (RegisterEmailResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = RegisterEmailResponse.Status.ADAPTER.decode(protoReader);
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
        RegisterEmailResponse registerEmailResponse = (RegisterEmailResponse) obj;
        reverseProtoWriter.getClass();
        registerEmailResponse.getClass();
        reverseProtoWriter.writeBytes(registerEmailResponse.unknownFields());
        RegisterEmailResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, registerEmailResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, registerEmailResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterEmailResponse registerEmailResponse = (RegisterEmailResponse) obj;
        registerEmailResponse.getClass();
        return RegisterEmailResponse.Status.ADAPTER.encodedSizeWithTag(1, registerEmailResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(7, registerEmailResponse.response_context) + registerEmailResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterEmailResponse registerEmailResponse = (RegisterEmailResponse) obj;
        registerEmailResponse.getClass();
        ResponseContext responseContext = registerEmailResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        RegisterEmailResponse.Status status = registerEmailResponse.status;
        byteString.getClass();
        return new RegisterEmailResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterEmailResponse registerEmailResponse = (RegisterEmailResponse) obj;
        registerEmailResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 7, registerEmailResponse.response_context);
        RegisterEmailResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, registerEmailResponse.status);
        protoWriter.writeBytes(registerEmailResponse.unknownFields());
    }
}
