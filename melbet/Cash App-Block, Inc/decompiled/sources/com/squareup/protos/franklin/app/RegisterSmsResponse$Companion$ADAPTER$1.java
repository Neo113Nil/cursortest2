package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.RegisterSmsResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RegisterSmsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterSmsResponse((ResponseContext) obj, (RegisterSmsResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = RegisterSmsResponse.Status.ADAPTER.decode(protoReader);
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
        RegisterSmsResponse registerSmsResponse = (RegisterSmsResponse) obj;
        reverseProtoWriter.getClass();
        registerSmsResponse.getClass();
        reverseProtoWriter.writeBytes(registerSmsResponse.unknownFields());
        RegisterSmsResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, registerSmsResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, registerSmsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterSmsResponse registerSmsResponse = (RegisterSmsResponse) obj;
        registerSmsResponse.getClass();
        return RegisterSmsResponse.Status.ADAPTER.encodedSizeWithTag(1, registerSmsResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(7, registerSmsResponse.response_context) + registerSmsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterSmsResponse registerSmsResponse = (RegisterSmsResponse) obj;
        registerSmsResponse.getClass();
        ResponseContext responseContext = registerSmsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        RegisterSmsResponse.Status status = registerSmsResponse.status;
        byteString.getClass();
        return new RegisterSmsResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterSmsResponse registerSmsResponse = (RegisterSmsResponse) obj;
        registerSmsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 7, registerSmsResponse.response_context);
        RegisterSmsResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, registerSmsResponse.status);
        protoWriter.writeBytes(registerSmsResponse.unknownFields());
    }
}
