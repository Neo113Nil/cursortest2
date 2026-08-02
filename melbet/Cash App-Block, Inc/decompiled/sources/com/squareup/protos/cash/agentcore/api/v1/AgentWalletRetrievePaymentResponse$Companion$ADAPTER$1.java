package com.squareup.protos.cash.agentcore.api.v1;

import com.squareup.protos.cash.agentcore.api.v1.AgentWalletRetrievePaymentResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AgentWalletRetrievePaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AgentWalletRetrievePaymentResponse((String) obj, (AgentWalletRetrievePaymentResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = AgentWalletRetrievePaymentResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AgentWalletRetrievePaymentResponse agentWalletRetrievePaymentResponse = (AgentWalletRetrievePaymentResponse) obj;
        reverseProtoWriter.getClass();
        agentWalletRetrievePaymentResponse.getClass();
        reverseProtoWriter.writeBytes(agentWalletRetrievePaymentResponse.unknownFields());
        AgentWalletRetrievePaymentResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, agentWalletRetrievePaymentResponse.status);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, agentWalletRetrievePaymentResponse.payment_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AgentWalletRetrievePaymentResponse agentWalletRetrievePaymentResponse = (AgentWalletRetrievePaymentResponse) obj;
        agentWalletRetrievePaymentResponse.getClass();
        return AgentWalletRetrievePaymentResponse.Status.ADAPTER.encodedSizeWithTag(2, agentWalletRetrievePaymentResponse.status) + ProtoAdapter.STRING.encodedSizeWithTag(1, agentWalletRetrievePaymentResponse.payment_id) + agentWalletRetrievePaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AgentWalletRetrievePaymentResponse agentWalletRetrievePaymentResponse = (AgentWalletRetrievePaymentResponse) obj;
        agentWalletRetrievePaymentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = agentWalletRetrievePaymentResponse.payment_id;
        AgentWalletRetrievePaymentResponse.Status status = agentWalletRetrievePaymentResponse.status;
        byteString.getClass();
        return new AgentWalletRetrievePaymentResponse(str, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AgentWalletRetrievePaymentResponse agentWalletRetrievePaymentResponse = (AgentWalletRetrievePaymentResponse) obj;
        agentWalletRetrievePaymentResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, agentWalletRetrievePaymentResponse.payment_id);
        AgentWalletRetrievePaymentResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, agentWalletRetrievePaymentResponse.status);
        protoWriter.writeBytes(agentWalletRetrievePaymentResponse.unknownFields());
    }
}
