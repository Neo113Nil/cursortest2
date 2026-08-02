package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PushProvisionApplePayResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PushProvisionApplePayResponse((ResponseContext) obj, (String) obj2, (String) obj3, (String) obj4, (PushProvisionStatus) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = PushProvisionStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PushProvisionApplePayResponse pushProvisionApplePayResponse = (PushProvisionApplePayResponse) obj;
        reverseProtoWriter.getClass();
        pushProvisionApplePayResponse.getClass();
        reverseProtoWriter.writeBytes(pushProvisionApplePayResponse.unknownFields());
        PushProvisionStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 5, pushProvisionApplePayResponse.status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, pushProvisionApplePayResponse.ephemeral_public_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pushProvisionApplePayResponse.activation_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pushProvisionApplePayResponse.encrypted_pass_data);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pushProvisionApplePayResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PushProvisionApplePayResponse pushProvisionApplePayResponse = (PushProvisionApplePayResponse) obj;
        pushProvisionApplePayResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(1, pushProvisionApplePayResponse.response_context) + pushProvisionApplePayResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return PushProvisionStatus.ADAPTER.encodedSizeWithTag(5, pushProvisionApplePayResponse.status) + protoAdapter.encodedSizeWithTag(4, pushProvisionApplePayResponse.ephemeral_public_key) + protoAdapter.encodedSizeWithTag(3, pushProvisionApplePayResponse.activation_data) + protoAdapter.encodedSizeWithTag(2, pushProvisionApplePayResponse.encrypted_pass_data) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PushProvisionApplePayResponse pushProvisionApplePayResponse = (PushProvisionApplePayResponse) obj;
        pushProvisionApplePayResponse.getClass();
        ResponseContext responseContext = pushProvisionApplePayResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        PushProvisionStatus pushProvisionStatus = pushProvisionApplePayResponse.status;
        byteString.getClass();
        return new PushProvisionApplePayResponse(responseContext2, null, null, null, pushProvisionStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PushProvisionApplePayResponse pushProvisionApplePayResponse = (PushProvisionApplePayResponse) obj;
        pushProvisionApplePayResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, pushProvisionApplePayResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, pushProvisionApplePayResponse.encrypted_pass_data);
        protoAdapter.encodeWithTag(protoWriter, 3, pushProvisionApplePayResponse.activation_data);
        protoAdapter.encodeWithTag(protoWriter, 4, pushProvisionApplePayResponse.ephemeral_public_key);
        PushProvisionStatus.ADAPTER.encodeWithTag(protoWriter, 5, pushProvisionApplePayResponse.status);
        protoWriter.writeBytes(pushProvisionApplePayResponse.unknownFields());
    }
}
