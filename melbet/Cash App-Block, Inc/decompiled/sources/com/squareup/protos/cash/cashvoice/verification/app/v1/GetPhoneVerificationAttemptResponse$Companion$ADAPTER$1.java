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
public final class GetPhoneVerificationAttemptResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPhoneVerificationAttemptResponse((PhoneVerificationAttemptState) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (ResponseContext) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = PhoneVerificationAttemptState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPhoneVerificationAttemptResponse getPhoneVerificationAttemptResponse = (GetPhoneVerificationAttemptResponse) obj;
        reverseProtoWriter.getClass();
        getPhoneVerificationAttemptResponse.getClass();
        reverseProtoWriter.writeBytes(getPhoneVerificationAttemptResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, getPhoneVerificationAttemptResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, getPhoneVerificationAttemptResponse.reject_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getPhoneVerificationAttemptResponse.accept_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getPhoneVerificationAttemptResponse.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getPhoneVerificationAttemptResponse.title);
        PhoneVerificationAttemptState.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getPhoneVerificationAttemptResponse.verification_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPhoneVerificationAttemptResponse getPhoneVerificationAttemptResponse = (GetPhoneVerificationAttemptResponse) obj;
        getPhoneVerificationAttemptResponse.getClass();
        int encodedSizeWithTag = PhoneVerificationAttemptState.ADAPTER.encodedSizeWithTag(1, getPhoneVerificationAttemptResponse.verification_state) + getPhoneVerificationAttemptResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ResponseContext.ADAPTER.encodedSizeWithTag(6, getPhoneVerificationAttemptResponse.response_context) + protoAdapter.encodedSizeWithTag(5, getPhoneVerificationAttemptResponse.reject_button_title) + protoAdapter.encodedSizeWithTag(4, getPhoneVerificationAttemptResponse.accept_button_title) + protoAdapter.encodedSizeWithTag(3, getPhoneVerificationAttemptResponse.message) + protoAdapter.encodedSizeWithTag(2, getPhoneVerificationAttemptResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPhoneVerificationAttemptResponse getPhoneVerificationAttemptResponse = (GetPhoneVerificationAttemptResponse) obj;
        getPhoneVerificationAttemptResponse.getClass();
        ResponseContext responseContext = getPhoneVerificationAttemptResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        PhoneVerificationAttemptState phoneVerificationAttemptState = getPhoneVerificationAttemptResponse.verification_state;
        String str = getPhoneVerificationAttemptResponse.title;
        String str2 = getPhoneVerificationAttemptResponse.message;
        String str3 = getPhoneVerificationAttemptResponse.accept_button_title;
        String str4 = getPhoneVerificationAttemptResponse.reject_button_title;
        byteString.getClass();
        return new GetPhoneVerificationAttemptResponse(phoneVerificationAttemptState, str, str2, str3, str4, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPhoneVerificationAttemptResponse getPhoneVerificationAttemptResponse = (GetPhoneVerificationAttemptResponse) obj;
        getPhoneVerificationAttemptResponse.getClass();
        PhoneVerificationAttemptState.ADAPTER.encodeWithTag(protoWriter, 1, getPhoneVerificationAttemptResponse.verification_state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, getPhoneVerificationAttemptResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 3, getPhoneVerificationAttemptResponse.message);
        protoAdapter.encodeWithTag(protoWriter, 4, getPhoneVerificationAttemptResponse.accept_button_title);
        protoAdapter.encodeWithTag(protoWriter, 5, getPhoneVerificationAttemptResponse.reject_button_title);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 6, getPhoneVerificationAttemptResponse.response_context);
        protoWriter.writeBytes(getPhoneVerificationAttemptResponse.unknownFields());
    }
}
