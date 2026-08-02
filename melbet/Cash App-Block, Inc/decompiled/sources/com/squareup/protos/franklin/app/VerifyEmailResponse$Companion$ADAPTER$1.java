package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifyEmailResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignInType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyEmailResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new VerifyEmailResponse((ResponseContext) obj, (VerifyEmailResponse.Status) obj2, (SignInType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifyEmailResponse.Status.ADAPTER.decode(protoReader);
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
        VerifyEmailResponse verifyEmailResponse = (VerifyEmailResponse) obj;
        reverseProtoWriter.getClass();
        verifyEmailResponse.getClass();
        reverseProtoWriter.writeBytes(verifyEmailResponse.unknownFields());
        SignInType.ADAPTER.encodeWithTag(reverseProtoWriter, 13, verifyEmailResponse.sign_in_type);
        VerifyEmailResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyEmailResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 12, verifyEmailResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyEmailResponse verifyEmailResponse = (VerifyEmailResponse) obj;
        verifyEmailResponse.getClass();
        return SignInType.ADAPTER.encodedSizeWithTag(13, verifyEmailResponse.sign_in_type) + VerifyEmailResponse.Status.ADAPTER.encodedSizeWithTag(1, verifyEmailResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(12, verifyEmailResponse.response_context) + verifyEmailResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyEmailResponse verifyEmailResponse = (VerifyEmailResponse) obj;
        verifyEmailResponse.getClass();
        ResponseContext responseContext = verifyEmailResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyEmailResponse.Status status = verifyEmailResponse.status;
        SignInType signInType = verifyEmailResponse.sign_in_type;
        byteString.getClass();
        return new VerifyEmailResponse(responseContext2, status, signInType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyEmailResponse verifyEmailResponse = (VerifyEmailResponse) obj;
        verifyEmailResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 12, verifyEmailResponse.response_context);
        VerifyEmailResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifyEmailResponse.status);
        SignInType.ADAPTER.encodeWithTag(protoWriter, 13, verifyEmailResponse.sign_in_type);
        protoWriter.writeBytes(verifyEmailResponse.unknownFields());
    }
}
