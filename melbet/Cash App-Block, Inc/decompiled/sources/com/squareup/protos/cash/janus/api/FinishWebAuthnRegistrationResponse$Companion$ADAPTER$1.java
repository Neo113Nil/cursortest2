package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FinishWebAuthnRegistrationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FinishWebAuthnRegistrationResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FinishWebAuthnRegistrationResponse finishWebAuthnRegistrationResponse = (FinishWebAuthnRegistrationResponse) obj;
        reverseProtoWriter.getClass();
        finishWebAuthnRegistrationResponse.getClass();
        reverseProtoWriter.writeBytes(finishWebAuthnRegistrationResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, finishWebAuthnRegistrationResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FinishWebAuthnRegistrationResponse finishWebAuthnRegistrationResponse = (FinishWebAuthnRegistrationResponse) obj;
        finishWebAuthnRegistrationResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, finishWebAuthnRegistrationResponse.response_context) + finishWebAuthnRegistrationResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FinishWebAuthnRegistrationResponse finishWebAuthnRegistrationResponse = (FinishWebAuthnRegistrationResponse) obj;
        finishWebAuthnRegistrationResponse.getClass();
        ResponseContext responseContext = finishWebAuthnRegistrationResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FinishWebAuthnRegistrationResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FinishWebAuthnRegistrationResponse finishWebAuthnRegistrationResponse = (FinishWebAuthnRegistrationResponse) obj;
        finishWebAuthnRegistrationResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, finishWebAuthnRegistrationResponse.response_context);
        protoWriter.writeBytes(finishWebAuthnRegistrationResponse.unknownFields());
    }
}
