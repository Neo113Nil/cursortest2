package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.janus.api.StartAccountRecoveryResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StartAccountRecoveryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new StartAccountRecoveryResponse((ResponseContext) obj, (StartAccountRecoveryResponse.Status) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = StartAccountRecoveryResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartAccountRecoveryResponse startAccountRecoveryResponse = (StartAccountRecoveryResponse) obj;
        reverseProtoWriter.getClass();
        startAccountRecoveryResponse.getClass();
        reverseProtoWriter.writeBytes(startAccountRecoveryResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, startAccountRecoveryResponse.client_scenario);
        StartAccountRecoveryResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, startAccountRecoveryResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, startAccountRecoveryResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartAccountRecoveryResponse startAccountRecoveryResponse = (StartAccountRecoveryResponse) obj;
        startAccountRecoveryResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, startAccountRecoveryResponse.client_scenario) + StartAccountRecoveryResponse.Status.ADAPTER.encodedSizeWithTag(2, startAccountRecoveryResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, startAccountRecoveryResponse.response_context) + startAccountRecoveryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartAccountRecoveryResponse startAccountRecoveryResponse = (StartAccountRecoveryResponse) obj;
        startAccountRecoveryResponse.getClass();
        ResponseContext responseContext = startAccountRecoveryResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        StartAccountRecoveryResponse.Status status = startAccountRecoveryResponse.status;
        String str = startAccountRecoveryResponse.client_scenario;
        byteString.getClass();
        return new StartAccountRecoveryResponse(responseContext2, status, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartAccountRecoveryResponse startAccountRecoveryResponse = (StartAccountRecoveryResponse) obj;
        startAccountRecoveryResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, startAccountRecoveryResponse.response_context);
        StartAccountRecoveryResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, startAccountRecoveryResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, startAccountRecoveryResponse.client_scenario);
        protoWriter.writeBytes(startAccountRecoveryResponse.unknownFields());
    }
}
