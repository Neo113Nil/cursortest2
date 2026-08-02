package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.janus.api.GetLoginScenarioPlanResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetLoginScenarioPlanResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetLoginScenarioPlanResponse((GetLoginScenarioPlanResponse.Status) obj, (ResponseContext) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetLoginScenarioPlanResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetLoginScenarioPlanResponse getLoginScenarioPlanResponse = (GetLoginScenarioPlanResponse) obj;
        reverseProtoWriter.getClass();
        getLoginScenarioPlanResponse.getClass();
        reverseProtoWriter.writeBytes(getLoginScenarioPlanResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getLoginScenarioPlanResponse.app_attest_challenge);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getLoginScenarioPlanResponse.play_integrity_nonce);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getLoginScenarioPlanResponse.response_context);
        GetLoginScenarioPlanResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getLoginScenarioPlanResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetLoginScenarioPlanResponse getLoginScenarioPlanResponse = (GetLoginScenarioPlanResponse) obj;
        getLoginScenarioPlanResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(2, getLoginScenarioPlanResponse.response_context) + GetLoginScenarioPlanResponse.Status.ADAPTER.encodedSizeWithTag(1, getLoginScenarioPlanResponse.status) + getLoginScenarioPlanResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, getLoginScenarioPlanResponse.app_attest_challenge) + protoAdapter.encodedSizeWithTag(3, getLoginScenarioPlanResponse.play_integrity_nonce) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetLoginScenarioPlanResponse getLoginScenarioPlanResponse = (GetLoginScenarioPlanResponse) obj;
        getLoginScenarioPlanResponse.getClass();
        ResponseContext responseContext = getLoginScenarioPlanResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        GetLoginScenarioPlanResponse.Status status = getLoginScenarioPlanResponse.status;
        String str = getLoginScenarioPlanResponse.play_integrity_nonce;
        String str2 = getLoginScenarioPlanResponse.app_attest_challenge;
        byteString.getClass();
        return new GetLoginScenarioPlanResponse(status, responseContext2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetLoginScenarioPlanResponse getLoginScenarioPlanResponse = (GetLoginScenarioPlanResponse) obj;
        getLoginScenarioPlanResponse.getClass();
        GetLoginScenarioPlanResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, getLoginScenarioPlanResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getLoginScenarioPlanResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, getLoginScenarioPlanResponse.play_integrity_nonce);
        protoAdapter.encodeWithTag(protoWriter, 4, getLoginScenarioPlanResponse.app_attest_challenge);
        protoWriter.writeBytes(getLoginScenarioPlanResponse.unknownFields());
    }
}
