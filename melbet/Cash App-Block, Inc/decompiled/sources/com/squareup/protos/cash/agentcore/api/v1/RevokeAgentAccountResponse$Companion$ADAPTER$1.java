package com.squareup.protos.cash.agentcore.api.v1;

import com.squareup.protos.cash.agentcore.api.v1.RevokeAgentAccountResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RevokeAgentAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RevokeAgentAccountResponse((RevokeAgentAccountResponse.Status) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = RevokeAgentAccountResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RevokeAgentAccountResponse revokeAgentAccountResponse = (RevokeAgentAccountResponse) obj;
        reverseProtoWriter.getClass();
        revokeAgentAccountResponse.getClass();
        reverseProtoWriter.writeBytes(revokeAgentAccountResponse.unknownFields());
        RevokeAgentAccountResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, revokeAgentAccountResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RevokeAgentAccountResponse revokeAgentAccountResponse = (RevokeAgentAccountResponse) obj;
        revokeAgentAccountResponse.getClass();
        return RevokeAgentAccountResponse.Status.ADAPTER.encodedSizeWithTag(1, revokeAgentAccountResponse.status) + revokeAgentAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RevokeAgentAccountResponse revokeAgentAccountResponse = (RevokeAgentAccountResponse) obj;
        revokeAgentAccountResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RevokeAgentAccountResponse.Status status = revokeAgentAccountResponse.status;
        byteString.getClass();
        return new RevokeAgentAccountResponse(status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RevokeAgentAccountResponse revokeAgentAccountResponse = (RevokeAgentAccountResponse) obj;
        revokeAgentAccountResponse.getClass();
        RevokeAgentAccountResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, revokeAgentAccountResponse.status);
        protoWriter.writeBytes(revokeAgentAccountResponse.unknownFields());
    }
}
