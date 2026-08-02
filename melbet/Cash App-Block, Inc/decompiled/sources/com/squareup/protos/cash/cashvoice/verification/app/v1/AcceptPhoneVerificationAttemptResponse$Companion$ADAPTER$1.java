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
public final class AcceptPhoneVerificationAttemptResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AcceptPhoneVerificationAttemptResponse((PhoneVerificationAttemptState) obj, (String) obj2, (String) obj3, (ResponseContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AcceptPhoneVerificationAttemptResponse acceptPhoneVerificationAttemptResponse = (AcceptPhoneVerificationAttemptResponse) obj;
        reverseProtoWriter.getClass();
        acceptPhoneVerificationAttemptResponse.getClass();
        reverseProtoWriter.writeBytes(acceptPhoneVerificationAttemptResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, acceptPhoneVerificationAttemptResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, acceptPhoneVerificationAttemptResponse.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, acceptPhoneVerificationAttemptResponse.title);
        PhoneVerificationAttemptState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, acceptPhoneVerificationAttemptResponse.verification_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AcceptPhoneVerificationAttemptResponse acceptPhoneVerificationAttemptResponse = (AcceptPhoneVerificationAttemptResponse) obj;
        acceptPhoneVerificationAttemptResponse.getClass();
        int encodedSizeWithTag = PhoneVerificationAttemptState.ADAPTER.encodedSizeWithTag(1, acceptPhoneVerificationAttemptResponse.verification_state) + acceptPhoneVerificationAttemptResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, acceptPhoneVerificationAttemptResponse.response_context) + protoAdapter.encodedSizeWithTag(3, acceptPhoneVerificationAttemptResponse.message) + protoAdapter.encodedSizeWithTag(2, acceptPhoneVerificationAttemptResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AcceptPhoneVerificationAttemptResponse acceptPhoneVerificationAttemptResponse = (AcceptPhoneVerificationAttemptResponse) obj;
        acceptPhoneVerificationAttemptResponse.getClass();
        ResponseContext responseContext = acceptPhoneVerificationAttemptResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        PhoneVerificationAttemptState phoneVerificationAttemptState = acceptPhoneVerificationAttemptResponse.verification_state;
        String str = acceptPhoneVerificationAttemptResponse.title;
        String str2 = acceptPhoneVerificationAttemptResponse.message;
        byteString.getClass();
        return new AcceptPhoneVerificationAttemptResponse(phoneVerificationAttemptState, str, str2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AcceptPhoneVerificationAttemptResponse acceptPhoneVerificationAttemptResponse = (AcceptPhoneVerificationAttemptResponse) obj;
        acceptPhoneVerificationAttemptResponse.getClass();
        PhoneVerificationAttemptState.ADAPTER.encodeWithTag(protoWriter, 1, acceptPhoneVerificationAttemptResponse.verification_state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, acceptPhoneVerificationAttemptResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, acceptPhoneVerificationAttemptResponse.message);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, acceptPhoneVerificationAttemptResponse.response_context);
        protoWriter.writeBytes(acceptPhoneVerificationAttemptResponse.unknownFields());
    }
}
