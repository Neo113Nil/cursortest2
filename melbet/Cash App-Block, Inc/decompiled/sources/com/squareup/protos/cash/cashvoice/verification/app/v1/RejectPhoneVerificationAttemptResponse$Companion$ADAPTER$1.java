package com.squareup.protos.cash.cashvoice.verification.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RejectPhoneVerificationAttemptResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RejectPhoneVerificationAttemptResponse((PhoneVerificationAttemptState) obj, (String) obj2, (String) obj3, (ResponseContext) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = PhoneVerificationAttemptState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RejectPhoneVerificationAttemptResponse rejectPhoneVerificationAttemptResponse = (RejectPhoneVerificationAttemptResponse) obj;
        reverseProtoWriter.getClass();
        rejectPhoneVerificationAttemptResponse.getClass();
        reverseProtoWriter.writeBytes(rejectPhoneVerificationAttemptResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, rejectPhoneVerificationAttemptResponse.article_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, rejectPhoneVerificationAttemptResponse.response_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, rejectPhoneVerificationAttemptResponse.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, rejectPhoneVerificationAttemptResponse.title);
        PhoneVerificationAttemptState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, rejectPhoneVerificationAttemptResponse.verification_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RejectPhoneVerificationAttemptResponse rejectPhoneVerificationAttemptResponse = (RejectPhoneVerificationAttemptResponse) obj;
        rejectPhoneVerificationAttemptResponse.getClass();
        int encodedSizeWithTag = PhoneVerificationAttemptState.ADAPTER.encodedSizeWithTag(1, rejectPhoneVerificationAttemptResponse.verification_state) + rejectPhoneVerificationAttemptResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, rejectPhoneVerificationAttemptResponse.article_token) + ResponseContext.ADAPTER.encodedSizeWithTag(4, rejectPhoneVerificationAttemptResponse.response_context) + protoAdapter.encodedSizeWithTag(3, rejectPhoneVerificationAttemptResponse.message) + protoAdapter.encodedSizeWithTag(2, rejectPhoneVerificationAttemptResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RejectPhoneVerificationAttemptResponse rejectPhoneVerificationAttemptResponse = (RejectPhoneVerificationAttemptResponse) obj;
        rejectPhoneVerificationAttemptResponse.getClass();
        ResponseContext responseContext = rejectPhoneVerificationAttemptResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        PhoneVerificationAttemptState phoneVerificationAttemptState = rejectPhoneVerificationAttemptResponse.verification_state;
        String str = rejectPhoneVerificationAttemptResponse.title;
        String str2 = rejectPhoneVerificationAttemptResponse.message;
        String str3 = rejectPhoneVerificationAttemptResponse.article_token;
        byteString.getClass();
        return new RejectPhoneVerificationAttemptResponse(phoneVerificationAttemptState, str, str2, responseContext2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RejectPhoneVerificationAttemptResponse rejectPhoneVerificationAttemptResponse = (RejectPhoneVerificationAttemptResponse) obj;
        rejectPhoneVerificationAttemptResponse.getClass();
        PhoneVerificationAttemptState.ADAPTER.encodeWithTag(protoWriter, 1, rejectPhoneVerificationAttemptResponse.verification_state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, rejectPhoneVerificationAttemptResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, rejectPhoneVerificationAttemptResponse.message);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, rejectPhoneVerificationAttemptResponse.response_context);
        protoAdapter.encodeWithTag(protoWriter, 5, rejectPhoneVerificationAttemptResponse.article_token);
        protoWriter.writeBytes(rejectPhoneVerificationAttemptResponse.unknownFields());
    }
}
