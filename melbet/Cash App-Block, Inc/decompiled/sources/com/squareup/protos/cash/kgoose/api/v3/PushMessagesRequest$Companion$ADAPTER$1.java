package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest;", "", "", "metadataAdapter$delegate", "Lkotlin/Lazy;", "getMetadataAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "metadataAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushMessagesRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: metadataAdapter$delegate, reason: from kotlin metadata */
    private final Lazy metadataAdapter;

    public PushMessagesRequest$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.PushMessagesRequest", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        this.metadataAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(12));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PushMessagesRequest((String) obj8, m, (String) obj9, (ProfileConfig) obj3, (OnBehalfOf) obj4, (McpDecryptionConfig) obj5, (ChatContext) obj6, (String) obj10, (Integer) obj7, (ToolCall) obj, (AgentConfigReference) obj2, arrayList3, linkedHashMap2, arrayList4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    m.add(InputMessage.ADAPTER.decode(protoReader));
                    continue;
                case 3:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj3 = TransactorKt.decodeMessageOrMerge(ProfileConfig.ADAPTER, protoReader, obj3);
                    continue;
                case 5:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj4 = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj4);
                    continue;
                case 6:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj5 = TransactorKt.decodeMessageOrMerge(McpDecryptionConfig.ADAPTER, protoReader, obj5);
                    continue;
                case 7:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj6 = TransactorKt.decodeMessageOrMerge(ChatContext.ADAPTER, protoReader, obj6);
                    continue;
                case 8:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj7 = ProtoAdapter.INT32.decode(protoReader);
                    continue;
                case 10:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj = TransactorKt.decodeMessageOrMerge(ToolCall.ADAPTER, protoReader, obj);
                    continue;
                case 11:
                    arrayList = arrayList3;
                    linkedHashMap = linkedHashMap2;
                    arrayList2 = arrayList4;
                    obj2 = TransactorKt.decodeMessageOrMerge(AgentConfigReference.ADAPTER, protoReader, obj2);
                    continue;
                case 12:
                    try {
                        ClientRenderType.ADAPTER.tryDecode(protoReader, arrayList3);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = arrayList3;
                        linkedHashMap = linkedHashMap2;
                        arrayList2 = arrayList4;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 13:
                    linkedHashMap2.putAll((Map) ((ProtoAdapter) this.metadataAdapter.getValue()).decode(protoReader));
                    break;
                case 14:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 15:
                    arrayList4.add(ToolCall.ADAPTER.decode(protoReader));
                    break;
            }
            arrayList = arrayList3;
            linkedHashMap = linkedHashMap2;
            arrayList2 = arrayList4;
            arrayList3 = arrayList;
            linkedHashMap2 = linkedHashMap;
            arrayList4 = arrayList2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PushMessagesRequest pushMessagesRequest = (PushMessagesRequest) obj;
        reverseProtoWriter.getClass();
        pushMessagesRequest.getClass();
        reverseProtoWriter.writeBytes(pushMessagesRequest.unknownFields());
        ProtoAdapter protoAdapter = ToolCall.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 15, pushMessagesRequest.force_tool_calls);
        ((ProtoAdapter) this.metadataAdapter.getValue()).encodeWithTag(reverseProtoWriter, 13, pushMessagesRequest.metadata);
        ClientRenderType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 12, pushMessagesRequest.supported_client_renderable_types);
        AgentConfigReference.ADAPTER.encodeWithTag(reverseProtoWriter, 11, pushMessagesRequest.agent_config_ref);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, pushMessagesRequest.force_tool_call);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 9, pushMessagesRequest.session_ttl_in_seconds);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, pushMessagesRequest.session_name);
        ChatContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, pushMessagesRequest.chat_context);
        McpDecryptionConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 6, pushMessagesRequest.mcp_decryption_config);
        OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 5, pushMessagesRequest.on_behalf_of);
        ProfileConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pushMessagesRequest.profile_config);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, pushMessagesRequest.profile_id);
        InputMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, pushMessagesRequest.messages);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, pushMessagesRequest.session_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PushMessagesRequest pushMessagesRequest = (PushMessagesRequest) obj;
        pushMessagesRequest.getClass();
        int size$okio = pushMessagesRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(9, pushMessagesRequest.session_ttl_in_seconds) + protoAdapter.encodedSizeWithTag(8, pushMessagesRequest.session_name) + ChatContext.ADAPTER.encodedSizeWithTag(7, pushMessagesRequest.chat_context) + McpDecryptionConfig.ADAPTER.encodedSizeWithTag(6, pushMessagesRequest.mcp_decryption_config) + OnBehalfOf.ADAPTER.encodedSizeWithTag(5, pushMessagesRequest.on_behalf_of) + ProfileConfig.ADAPTER.encodedSizeWithTag(4, pushMessagesRequest.profile_config) + protoAdapter.encodedSizeWithTag(3, pushMessagesRequest.profile_id) + InputMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, pushMessagesRequest.messages) + protoAdapter.encodedSizeWithTag(1, pushMessagesRequest.session_id) + size$okio;
        ProtoAdapter protoAdapter2 = ToolCall.ADAPTER;
        return protoAdapter2.asRepeated().encodedSizeWithTag(15, pushMessagesRequest.force_tool_calls) + ((ProtoAdapter) this.metadataAdapter.getValue()).encodedSizeWithTag(13, pushMessagesRequest.metadata) + ClientRenderType.ADAPTER.asRepeated().encodedSizeWithTag(12, pushMessagesRequest.supported_client_renderable_types) + AgentConfigReference.ADAPTER.encodedSizeWithTag(11, pushMessagesRequest.agent_config_ref) + protoAdapter2.encodedSizeWithTag(10, pushMessagesRequest.force_tool_call) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PushMessagesRequest pushMessagesRequest = (PushMessagesRequest) obj;
        pushMessagesRequest.getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ProfileConfig profileConfig = pushMessagesRequest.profile_config;
        ProfileConfig profileConfig2 = profileConfig != null ? (ProfileConfig) ProfileConfig.ADAPTER.redact(profileConfig) : null;
        OnBehalfOf onBehalfOf = pushMessagesRequest.on_behalf_of;
        OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
        McpDecryptionConfig mcpDecryptionConfig = pushMessagesRequest.mcp_decryption_config;
        McpDecryptionConfig mcpDecryptionConfig2 = mcpDecryptionConfig != null ? (McpDecryptionConfig) McpDecryptionConfig.ADAPTER.redact(mcpDecryptionConfig) : null;
        ChatContext chatContext = pushMessagesRequest.chat_context;
        ChatContext chatContext2 = chatContext != null ? (ChatContext) ChatContext.ADAPTER.redact(chatContext) : null;
        ToolCall toolCall = pushMessagesRequest.force_tool_call;
        ToolCall toolCall2 = toolCall != null ? (ToolCall) ToolCall.ADAPTER.redact(toolCall) : null;
        AgentConfigReference agentConfigReference = pushMessagesRequest.agent_config_ref;
        AgentConfigReference agentConfigReference2 = agentConfigReference != null ? (AgentConfigReference) AgentConfigReference.ADAPTER.redact(agentConfigReference) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(pushMessagesRequest.force_tool_calls, ToolCall.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = pushMessagesRequest.session_id;
        String str2 = pushMessagesRequest.profile_id;
        String str3 = pushMessagesRequest.session_name;
        Integer num = pushMessagesRequest.session_ttl_in_seconds;
        List<ClientRenderType> list = pushMessagesRequest.supported_client_renderable_types;
        Map<String, String> map = pushMessagesRequest.metadata;
        emptyList.getClass();
        list.getClass();
        map.getClass();
        byteString.getClass();
        return new PushMessagesRequest(str, emptyList, str2, profileConfig2, onBehalfOf2, mcpDecryptionConfig2, chatContext2, str3, num, toolCall2, agentConfigReference2, list, map, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PushMessagesRequest pushMessagesRequest = (PushMessagesRequest) obj;
        pushMessagesRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, pushMessagesRequest.session_id);
        InputMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushMessagesRequest.messages);
        protoAdapter.encodeWithTag(protoWriter, 3, pushMessagesRequest.profile_id);
        ProfileConfig.ADAPTER.encodeWithTag(protoWriter, 4, pushMessagesRequest.profile_config);
        OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 5, pushMessagesRequest.on_behalf_of);
        McpDecryptionConfig.ADAPTER.encodeWithTag(protoWriter, 6, pushMessagesRequest.mcp_decryption_config);
        ChatContext.ADAPTER.encodeWithTag(protoWriter, 7, pushMessagesRequest.chat_context);
        protoAdapter.encodeWithTag(protoWriter, 8, pushMessagesRequest.session_name);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 9, pushMessagesRequest.session_ttl_in_seconds);
        ProtoAdapter protoAdapter2 = ToolCall.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 10, pushMessagesRequest.force_tool_call);
        AgentConfigReference.ADAPTER.encodeWithTag(protoWriter, 11, pushMessagesRequest.agent_config_ref);
        ClientRenderType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, pushMessagesRequest.supported_client_renderable_types);
        ((ProtoAdapter) this.metadataAdapter.getValue()).encodeWithTag(protoWriter, 13, pushMessagesRequest.metadata);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 15, pushMessagesRequest.force_tool_calls);
        protoWriter.writeBytes(pushMessagesRequest.unknownFields());
    }
}
