package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ConfirmPasscodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConfirmPasscodeResponse((ResponseContext) obj, (ConfirmPasscodeResponse.Status) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = ConfirmPasscodeResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 6) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 11) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmPasscodeResponse confirmPasscodeResponse = (ConfirmPasscodeResponse) obj;
        reverseProtoWriter.getClass();
        confirmPasscodeResponse.getClass();
        reverseProtoWriter.writeBytes(confirmPasscodeResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, confirmPasscodeResponse.passcode_token);
        ConfirmPasscodeResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, confirmPasscodeResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 11, confirmPasscodeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmPasscodeResponse confirmPasscodeResponse = (ConfirmPasscodeResponse) obj;
        confirmPasscodeResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(6, confirmPasscodeResponse.passcode_token) + ConfirmPasscodeResponse.Status.ADAPTER.encodedSizeWithTag(1, confirmPasscodeResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(11, confirmPasscodeResponse.response_context) + confirmPasscodeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmPasscodeResponse confirmPasscodeResponse = (ConfirmPasscodeResponse) obj;
        confirmPasscodeResponse.getClass();
        ResponseContext responseContext = confirmPasscodeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ConfirmPasscodeResponse.Status status = confirmPasscodeResponse.status;
        byteString.getClass();
        return new ConfirmPasscodeResponse(responseContext2, status, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmPasscodeResponse confirmPasscodeResponse = (ConfirmPasscodeResponse) obj;
        confirmPasscodeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 11, confirmPasscodeResponse.response_context);
        ConfirmPasscodeResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, confirmPasscodeResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, confirmPasscodeResponse.passcode_token);
        protoWriter.writeBytes(confirmPasscodeResponse.unknownFields());
    }
}
