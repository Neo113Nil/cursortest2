package com.squareup.protos.cash.agentcore.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAgentsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAgentsResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AgentAccount.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAgentsResponse getAgentsResponse = (GetAgentsResponse) obj;
        reverseProtoWriter.getClass();
        getAgentsResponse.getClass();
        reverseProtoWriter.writeBytes(getAgentsResponse.unknownFields());
        AgentAccount.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAgentsResponse.agents);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAgentsResponse getAgentsResponse = (GetAgentsResponse) obj;
        getAgentsResponse.getClass();
        return AgentAccount.ADAPTER.asRepeated().encodedSizeWithTag(1, getAgentsResponse.agents) + getAgentsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAgentsResponse getAgentsResponse = (GetAgentsResponse) obj;
        getAgentsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAgentsResponse.agents, AgentAccount.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAgentsResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAgentsResponse getAgentsResponse = (GetAgentsResponse) obj;
        getAgentsResponse.getClass();
        AgentAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAgentsResponse.agents);
        protoWriter.writeBytes(getAgentsResponse.unknownFields());
    }
}
