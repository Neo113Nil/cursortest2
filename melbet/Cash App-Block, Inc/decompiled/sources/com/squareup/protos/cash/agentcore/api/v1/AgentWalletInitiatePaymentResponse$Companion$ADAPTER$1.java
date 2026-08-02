package com.squareup.protos.cash.agentcore.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AgentWalletInitiatePaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AgentWalletInitiatePaymentResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AgentWalletInitiatePaymentResponse agentWalletInitiatePaymentResponse = (AgentWalletInitiatePaymentResponse) obj;
        reverseProtoWriter.getClass();
        agentWalletInitiatePaymentResponse.getClass();
        reverseProtoWriter.writeBytes(agentWalletInitiatePaymentResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, agentWalletInitiatePaymentResponse.payment_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AgentWalletInitiatePaymentResponse agentWalletInitiatePaymentResponse = (AgentWalletInitiatePaymentResponse) obj;
        agentWalletInitiatePaymentResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, agentWalletInitiatePaymentResponse.payment_id) + agentWalletInitiatePaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AgentWalletInitiatePaymentResponse agentWalletInitiatePaymentResponse = (AgentWalletInitiatePaymentResponse) obj;
        agentWalletInitiatePaymentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = agentWalletInitiatePaymentResponse.payment_id;
        byteString.getClass();
        return new AgentWalletInitiatePaymentResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AgentWalletInitiatePaymentResponse agentWalletInitiatePaymentResponse = (AgentWalletInitiatePaymentResponse) obj;
        agentWalletInitiatePaymentResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, agentWalletInitiatePaymentResponse.payment_id);
        protoWriter.writeBytes(agentWalletInitiatePaymentResponse.unknownFields());
    }
}
