package com.squareup.protos.cash.plasma.callcontext;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ForwardedCallContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ForwardedCallContext((ClientInfo) obj, (BrowserInteraction) obj2, (String) obj3, (ScenarioInitiatorType) obj4, (AuthorizationContext) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ClientInfo.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(BrowserInteraction.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj4 = ScenarioInitiatorType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(AuthorizationContext.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ForwardedCallContext forwardedCallContext = (ForwardedCallContext) obj;
        reverseProtoWriter.getClass();
        forwardedCallContext.getClass();
        reverseProtoWriter.writeBytes(forwardedCallContext.unknownFields());
        AuthorizationContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, forwardedCallContext.authorization_context);
        ScenarioInitiatorType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, forwardedCallContext.scenario_initiator_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, forwardedCallContext.app_token);
        BrowserInteraction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, forwardedCallContext.browser_interaction);
        ClientInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, forwardedCallContext.client_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ForwardedCallContext forwardedCallContext = (ForwardedCallContext) obj;
        forwardedCallContext.getClass();
        return AuthorizationContext.ADAPTER.encodedSizeWithTag(5, forwardedCallContext.authorization_context) + ScenarioInitiatorType.ADAPTER.encodedSizeWithTag(4, forwardedCallContext.scenario_initiator_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, forwardedCallContext.app_token) + BrowserInteraction.ADAPTER.encodedSizeWithTag(2, forwardedCallContext.browser_interaction) + ClientInfo.ADAPTER.encodedSizeWithTag(1, forwardedCallContext.client_info) + forwardedCallContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ForwardedCallContext forwardedCallContext = (ForwardedCallContext) obj;
        forwardedCallContext.getClass();
        ClientInfo clientInfo = forwardedCallContext.client_info;
        ClientInfo clientInfo2 = clientInfo != null ? (ClientInfo) ClientInfo.ADAPTER.redact(clientInfo) : null;
        BrowserInteraction browserInteraction = forwardedCallContext.browser_interaction;
        BrowserInteraction browserInteraction2 = browserInteraction != null ? (BrowserInteraction) BrowserInteraction.ADAPTER.redact(browserInteraction) : null;
        AuthorizationContext authorizationContext = forwardedCallContext.authorization_context;
        AuthorizationContext authorizationContext2 = authorizationContext != null ? (AuthorizationContext) AuthorizationContext.ADAPTER.redact(authorizationContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = forwardedCallContext.app_token;
        ScenarioInitiatorType scenarioInitiatorType = forwardedCallContext.scenario_initiator_type;
        byteString.getClass();
        return new ForwardedCallContext(clientInfo2, browserInteraction2, str, scenarioInitiatorType, authorizationContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ForwardedCallContext forwardedCallContext = (ForwardedCallContext) obj;
        forwardedCallContext.getClass();
        ClientInfo.ADAPTER.encodeWithTag(protoWriter, 1, forwardedCallContext.client_info);
        BrowserInteraction.ADAPTER.encodeWithTag(protoWriter, 2, forwardedCallContext.browser_interaction);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, forwardedCallContext.app_token);
        ScenarioInitiatorType.ADAPTER.encodeWithTag(protoWriter, 4, forwardedCallContext.scenario_initiator_type);
        AuthorizationContext.ADAPTER.encodeWithTag(protoWriter, 5, forwardedCallContext.authorization_context);
        protoWriter.writeBytes(forwardedCallContext.unknownFields());
    }
}
