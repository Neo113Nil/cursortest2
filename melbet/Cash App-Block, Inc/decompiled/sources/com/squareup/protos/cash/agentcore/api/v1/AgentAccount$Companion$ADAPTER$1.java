package com.squareup.protos.cash.agentcore.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AgentAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AgentAccount((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Money) obj6, (Grant) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Grant.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AgentAccount agentAccount = (AgentAccount) obj;
        reverseProtoWriter.getClass();
        agentAccount.getClass();
        reverseProtoWriter.writeBytes(agentAccount.unknownFields());
        Grant.ADAPTER.encodeWithTag(reverseProtoWriter, 7, agentAccount.grant);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 6, agentAccount.balance);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, agentAccount.status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, agentAccount.cashtag);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, agentAccount.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, agentAccount.sponsorship_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, agentAccount.agent_account_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AgentAccount agentAccount = (AgentAccount) obj;
        agentAccount.getClass();
        int size$okio = agentAccount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Grant.ADAPTER.encodedSizeWithTag(7, agentAccount.grant) + Money.ADAPTER.encodedSizeWithTag(6, agentAccount.balance) + protoAdapter.encodedSizeWithTag(5, agentAccount.status) + protoAdapter.encodedSizeWithTag(4, agentAccount.cashtag) + protoAdapter.encodedSizeWithTag(3, agentAccount.display_name) + protoAdapter.encodedSizeWithTag(2, agentAccount.sponsorship_token) + protoAdapter.encodedSizeWithTag(1, agentAccount.agent_account_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AgentAccount agentAccount = (AgentAccount) obj;
        agentAccount.getClass();
        Money money = agentAccount.balance;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Grant grant = agentAccount.grant;
        Grant grant2 = grant != null ? (Grant) Grant.ADAPTER.redact(grant) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = agentAccount.agent_account_token;
        String str2 = agentAccount.sponsorship_token;
        String str3 = agentAccount.status;
        byteString.getClass();
        return new AgentAccount(str, str2, null, null, str3, money2, grant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AgentAccount agentAccount = (AgentAccount) obj;
        agentAccount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, agentAccount.agent_account_token);
        protoAdapter.encodeWithTag(protoWriter, 2, agentAccount.sponsorship_token);
        protoAdapter.encodeWithTag(protoWriter, 3, agentAccount.display_name);
        protoAdapter.encodeWithTag(protoWriter, 4, agentAccount.cashtag);
        protoAdapter.encodeWithTag(protoWriter, 5, agentAccount.status);
        Money.ADAPTER.encodeWithTag(protoWriter, 6, agentAccount.balance);
        Grant.ADAPTER.encodeWithTag(protoWriter, 7, agentAccount.grant);
        protoWriter.writeBytes(agentAccount.unknownFields());
    }
}
