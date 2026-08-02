package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifySmsResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignInType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifySmsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new VerifySmsResponse((ResponseContext) obj, (VerifySmsResponse.Status) obj2, (SignInType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifySmsResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 12) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 13) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = SignInType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifySmsResponse verifySmsResponse = (VerifySmsResponse) obj;
        reverseProtoWriter.getClass();
        verifySmsResponse.getClass();
        reverseProtoWriter.writeBytes(verifySmsResponse.unknownFields());
        SignInType.ADAPTER.encodeWithTag(reverseProtoWriter, 13, verifySmsResponse.sign_in_type);
        VerifySmsResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifySmsResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 12, verifySmsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifySmsResponse verifySmsResponse = (VerifySmsResponse) obj;
        verifySmsResponse.getClass();
        return SignInType.ADAPTER.encodedSizeWithTag(13, verifySmsResponse.sign_in_type) + VerifySmsResponse.Status.ADAPTER.encodedSizeWithTag(1, verifySmsResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(12, verifySmsResponse.response_context) + verifySmsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifySmsResponse verifySmsResponse = (VerifySmsResponse) obj;
        verifySmsResponse.getClass();
        ResponseContext responseContext = verifySmsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifySmsResponse.Status status = verifySmsResponse.status;
        SignInType signInType = verifySmsResponse.sign_in_type;
        byteString.getClass();
        return new VerifySmsResponse(responseContext2, status, signInType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifySmsResponse verifySmsResponse = (VerifySmsResponse) obj;
        verifySmsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 12, verifySmsResponse.response_context);
        VerifySmsResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifySmsResponse.status);
        SignInType.ADAPTER.encodeWithTag(protoWriter, 13, verifySmsResponse.sign_in_type);
        protoWriter.writeBytes(verifySmsResponse.unknownFields());
    }
}
