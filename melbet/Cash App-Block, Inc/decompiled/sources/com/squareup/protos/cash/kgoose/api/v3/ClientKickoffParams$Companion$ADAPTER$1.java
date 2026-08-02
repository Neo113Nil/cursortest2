package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientKickoffParams$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientKickoffParams(m, (Boolean) obj, (String) obj2, (Tenancy) obj3, (AgentConfigReference) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InputMessage.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj3 = Tenancy.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(AgentConfigReference.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
        reverseProtoWriter.getClass();
        clientKickoffParams.getClass();
        reverseProtoWriter.writeBytes(clientKickoffParams.unknownFields());
        AgentConfigReference.ADAPTER.encodeWithTag(reverseProtoWriter, 6, clientKickoffParams.agent_config_ref);
        Tenancy.ADAPTER.encodeWithTag(reverseProtoWriter, 4, clientKickoffParams.tenancy);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, clientKickoffParams.session_id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, clientKickoffParams.should_auto_send);
        InputMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, clientKickoffParams.kickoff_messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
        clientKickoffParams.getClass();
        return AgentConfigReference.ADAPTER.encodedSizeWithTag(6, clientKickoffParams.agent_config_ref) + Tenancy.ADAPTER.encodedSizeWithTag(4, clientKickoffParams.tenancy) + ProtoAdapter.STRING.encodedSizeWithTag(3, clientKickoffParams.session_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, clientKickoffParams.should_auto_send) + InputMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, clientKickoffParams.kickoff_messages) + clientKickoffParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
        clientKickoffParams.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(clientKickoffParams.kickoff_messages, InputMessage.ADAPTER);
        AgentConfigReference agentConfigReference = clientKickoffParams.agent_config_ref;
        AgentConfigReference agentConfigReference2 = agentConfigReference != null ? (AgentConfigReference) AgentConfigReference.ADAPTER.redact(agentConfigReference) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = clientKickoffParams.should_auto_send;
        String str = clientKickoffParams.session_id;
        Tenancy tenancy = clientKickoffParams.tenancy;
        byteString.getClass();
        return new ClientKickoffParams(m1169redactElements, bool, str, tenancy, agentConfigReference2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
        clientKickoffParams.getClass();
        InputMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, clientKickoffParams.kickoff_messages);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, clientKickoffParams.should_auto_send);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, clientKickoffParams.session_id);
        Tenancy.ADAPTER.encodeWithTag(protoWriter, 4, clientKickoffParams.tenancy);
        AgentConfigReference.ADAPTER.encodeWithTag(protoWriter, 6, clientKickoffParams.agent_config_ref);
        protoWriter.writeBytes(clientKickoffParams.unknownFields());
    }
}
