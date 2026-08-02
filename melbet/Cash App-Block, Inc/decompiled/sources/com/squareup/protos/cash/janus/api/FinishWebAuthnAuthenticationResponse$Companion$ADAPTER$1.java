package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FinishWebAuthnAuthenticationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FinishWebAuthnAuthenticationResponse((ResponseContext) obj, (ClientScenario) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = ClientScenario.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FinishWebAuthnAuthenticationResponse finishWebAuthnAuthenticationResponse = (FinishWebAuthnAuthenticationResponse) obj;
        reverseProtoWriter.getClass();
        finishWebAuthnAuthenticationResponse.getClass();
        reverseProtoWriter.writeBytes(finishWebAuthnAuthenticationResponse.unknownFields());
        ClientScenario.ADAPTER.encodeWithTag(reverseProtoWriter, 2, finishWebAuthnAuthenticationResponse.client_scenario);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, finishWebAuthnAuthenticationResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FinishWebAuthnAuthenticationResponse finishWebAuthnAuthenticationResponse = (FinishWebAuthnAuthenticationResponse) obj;
        finishWebAuthnAuthenticationResponse.getClass();
        return ClientScenario.ADAPTER.encodedSizeWithTag(2, finishWebAuthnAuthenticationResponse.client_scenario) + ResponseContext.ADAPTER.encodedSizeWithTag(1, finishWebAuthnAuthenticationResponse.response_context) + finishWebAuthnAuthenticationResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FinishWebAuthnAuthenticationResponse finishWebAuthnAuthenticationResponse = (FinishWebAuthnAuthenticationResponse) obj;
        finishWebAuthnAuthenticationResponse.getClass();
        ResponseContext responseContext = finishWebAuthnAuthenticationResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ClientScenario clientScenario = finishWebAuthnAuthenticationResponse.client_scenario;
        byteString.getClass();
        return new FinishWebAuthnAuthenticationResponse(responseContext2, clientScenario, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FinishWebAuthnAuthenticationResponse finishWebAuthnAuthenticationResponse = (FinishWebAuthnAuthenticationResponse) obj;
        finishWebAuthnAuthenticationResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, finishWebAuthnAuthenticationResponse.response_context);
        ClientScenario.ADAPTER.encodeWithTag(protoWriter, 2, finishWebAuthnAuthenticationResponse.client_scenario);
        protoWriter.writeBytes(finishWebAuthnAuthenticationResponse.unknownFields());
    }
}
