package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,+R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u0011R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u0012\u0004\b&\u0010\u0011R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010#¨\u0006-"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest$Builder;", "", "session_id", "Ljava/lang/String;", "profile_id", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig;", "profile_config", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig;", "mcp_decryption_config", "Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig;", "getMcp_decryption_config$annotations", "()V", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "session_name", "", "session_ttl_in_seconds", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolCall;", "force_tool_call", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolCall;", "getForce_tool_call$annotations", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "messages", "Ljava/util/List;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "supported_client_renderable_types", "getSupported_client_renderable_types$annotations", "", "metadata", "Ljava/util/Map;", "force_tool_calls", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PushMessagesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PushMessagesRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AgentConfigReference#ADAPTER", schemaIndex = 10, tag = 11)
    public final AgentConfigReference agent_config_ref;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatContext#ADAPTER", schemaIndex = 6, tag = 7)
    public final ChatContext chat_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolCall#ADAPTER", schemaIndex = 9, tag = 10)
    public final ToolCall force_tool_call;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolCall#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 13, tag = 15)
    public final List<ToolCall> force_tool_calls;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.McpDecryptionConfig#ADAPTER", schemaIndex = 5, tag = 6)
    public final McpDecryptionConfig mcp_decryption_config;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InputMessage#ADAPTER", label = WireField.Label.REPEATED, redacted = true, schemaIndex = 1, tag = 2)
    public final List<InputMessage> messages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final Map<String, String> metadata;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 4, tag = 5)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ProfileConfig#ADAPTER", schemaIndex = 3, tag = 4)
    public final ProfileConfig profile_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String profile_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String session_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 8, tag = 9)
    public final Integer session_ttl_in_seconds;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 12)
    public final List<ClientRenderType> supported_client_renderable_types;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010 J\u0012\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0007J\u001a\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001eJ\u0014\u0010\u001f\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\bJ\b\u0010!\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest;", "<init>", "()V", "session_id", "", "messages", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "profile_id", "profile_config", "Lcom/squareup/protos/cash/kgoose/api/v3/ProfileConfig;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "mcp_decryption_config", "Lcom/squareup/protos/cash/kgoose/api/v3/McpDecryptionConfig;", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "session_name", "session_ttl_in_seconds", "", "Ljava/lang/Integer;", "force_tool_call", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolCall;", "agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "supported_client_renderable_types", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderType;", "metadata", "", "force_tool_calls", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public AgentConfigReference agent_config_ref;
        public ChatContext chat_context;
        public ToolCall force_tool_call;
        public List<ToolCall> force_tool_calls;
        public McpDecryptionConfig mcp_decryption_config;
        public List<InputMessage> messages;
        public Map<String, String> metadata;
        public OnBehalfOf on_behalf_of;
        public ProfileConfig profile_config;
        public String profile_id;
        public String session_id;
        public String session_name;
        public Integer session_ttl_in_seconds;
        public List<? extends ClientRenderType> supported_client_renderable_types;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.messages = emptyList;
            this.supported_client_renderable_types = emptyList;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.metadata = emptyMap;
            this.force_tool_calls = emptyList;
        }

        public final Builder agent_config_ref(AgentConfigReference agent_config_ref) {
            this.agent_config_ref = agent_config_ref;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushMessagesRequest build() {
            return new PushMessagesRequest(this.session_id, this.messages, this.profile_id, this.profile_config, this.on_behalf_of, this.mcp_decryption_config, this.chat_context, this.session_name, this.session_ttl_in_seconds, this.force_tool_call, this.agent_config_ref, this.supported_client_renderable_types, this.metadata, this.force_tool_calls, buildUnknownFields());
        }

        public final Builder chat_context(ChatContext chat_context) {
            this.chat_context = chat_context;
            return this;
        }

        @Deprecated
        public final Builder force_tool_call(ToolCall force_tool_call) {
            this.force_tool_call = force_tool_call;
            return this;
        }

        public final Builder force_tool_calls(List<ToolCall> force_tool_calls) {
            force_tool_calls.getClass();
            TransactorKt.checkElementsNotNull(force_tool_calls);
            this.force_tool_calls = force_tool_calls;
            return this;
        }

        @Deprecated
        public final Builder mcp_decryption_config(McpDecryptionConfig mcp_decryption_config) {
            this.mcp_decryption_config = mcp_decryption_config;
            return this;
        }

        public final Builder messages(List<InputMessage> messages) {
            messages.getClass();
            TransactorKt.checkElementsNotNull(messages);
            this.messages = messages;
            return this;
        }

        public final Builder metadata(Map<String, String> metadata) {
            metadata.getClass();
            this.metadata = metadata;
            return this;
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        public final Builder profile_config(ProfileConfig profile_config) {
            this.profile_config = profile_config;
            return this;
        }

        public final Builder profile_id(String profile_id) {
            this.profile_id = profile_id;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        public final Builder session_name(String session_name) {
            this.session_name = session_name;
            return this;
        }

        public final Builder session_ttl_in_seconds(Integer session_ttl_in_seconds) {
            this.session_ttl_in_seconds = session_ttl_in_seconds;
            return this;
        }

        @Deprecated
        public final Builder supported_client_renderable_types(List<? extends ClientRenderType> supported_client_renderable_types) {
            supported_client_renderable_types.getClass();
            TransactorKt.checkElementsNotNull(supported_client_renderable_types);
            this.supported_client_renderable_types = supported_client_renderable_types;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PushMessagesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        PushMessagesRequest$Companion$ADAPTER$1 pushMessagesRequest$Companion$ADAPTER$1 = new PushMessagesRequest$Companion$ADAPTER$1(orCreateKotlinClass);
        ADAPTER = pushMessagesRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pushMessagesRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushMessagesRequest(String str, List list, String str2, ProfileConfig profileConfig, OnBehalfOf onBehalfOf, McpDecryptionConfig mcpDecryptionConfig, ChatContext chatContext, String str3, Integer num, ToolCall toolCall, AgentConfigReference agentConfigReference, List list2, Map map, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        map.getClass();
        list3.getClass();
        byteString.getClass();
        this.session_id = str;
        this.profile_id = str2;
        this.profile_config = profileConfig;
        this.on_behalf_of = onBehalfOf;
        this.mcp_decryption_config = mcpDecryptionConfig;
        this.chat_context = chatContext;
        this.session_name = str3;
        this.session_ttl_in_seconds = num;
        this.force_tool_call = toolCall;
        this.agent_config_ref = agentConfigReference;
        this.messages = TransactorKt.immutableCopyOf("messages", list);
        this.supported_client_renderable_types = TransactorKt.immutableCopyOf("supported_client_renderable_types", list2);
        this.metadata = TransactorKt.immutableCopyOf("metadata", map);
        this.force_tool_calls = TransactorKt.immutableCopyOf("force_tool_calls", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushMessagesRequest)) {
            return false;
        }
        PushMessagesRequest pushMessagesRequest = (PushMessagesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), pushMessagesRequest.unknownFields()) && Intrinsics.areEqual(this.session_id, pushMessagesRequest.session_id) && Intrinsics.areEqual(this.messages, pushMessagesRequest.messages) && Intrinsics.areEqual(this.profile_id, pushMessagesRequest.profile_id) && Intrinsics.areEqual(this.profile_config, pushMessagesRequest.profile_config) && Intrinsics.areEqual(this.on_behalf_of, pushMessagesRequest.on_behalf_of) && Intrinsics.areEqual(this.mcp_decryption_config, pushMessagesRequest.mcp_decryption_config) && Intrinsics.areEqual(this.chat_context, pushMessagesRequest.chat_context) && Intrinsics.areEqual(this.session_name, pushMessagesRequest.session_name) && Intrinsics.areEqual(this.session_ttl_in_seconds, pushMessagesRequest.session_ttl_in_seconds) && Intrinsics.areEqual(this.force_tool_call, pushMessagesRequest.force_tool_call) && Intrinsics.areEqual(this.agent_config_ref, pushMessagesRequest.agent_config_ref) && Intrinsics.areEqual(this.supported_client_renderable_types, pushMessagesRequest.supported_client_renderable_types) && Intrinsics.areEqual(this.metadata, pushMessagesRequest.metadata) && Intrinsics.areEqual(this.force_tool_calls, pushMessagesRequest.force_tool_calls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.messages);
        String str2 = this.profile_id;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        ProfileConfig profileConfig = this.profile_config;
        int hashCode3 = (hashCode2 + (profileConfig != null ? profileConfig.hashCode() : 0)) * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode4 = (hashCode3 + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37;
        McpDecryptionConfig mcpDecryptionConfig = this.mcp_decryption_config;
        int hashCode5 = (hashCode4 + (mcpDecryptionConfig != null ? mcpDecryptionConfig.hashCode() : 0)) * 37;
        ChatContext chatContext = this.chat_context;
        int hashCode6 = (hashCode5 + (chatContext != null ? chatContext.hashCode() : 0)) * 37;
        String str3 = this.session_name;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.session_ttl_in_seconds;
        int hashCode8 = (hashCode7 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        ToolCall toolCall = this.force_tool_call;
        int hashCode9 = (hashCode8 + (toolCall != null ? toolCall.hashCode() : 0)) * 37;
        AgentConfigReference agentConfigReference = this.agent_config_ref;
        int hashCode10 = this.force_tool_calls.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (agentConfigReference != null ? agentConfigReference.hashCode() : 0)) * 37, 37, this.supported_client_renderable_types), this.metadata, 37);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.session_id = this.session_id;
        builder.messages = this.messages;
        builder.profile_id = this.profile_id;
        builder.profile_config = this.profile_config;
        builder.on_behalf_of = this.on_behalf_of;
        builder.mcp_decryption_config = this.mcp_decryption_config;
        builder.chat_context = this.chat_context;
        builder.session_name = this.session_name;
        builder.session_ttl_in_seconds = this.session_ttl_in_seconds;
        builder.force_tool_call = this.force_tool_call;
        builder.agent_config_ref = this.agent_config_ref;
        builder.supported_client_renderable_types = this.supported_client_renderable_types;
        builder.metadata = this.metadata;
        builder.force_tool_calls = this.force_tool_calls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        if (!this.messages.isEmpty()) {
            arrayList.add("messages=██");
        }
        String str2 = this.profile_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "profile_id=", arrayList);
        }
        ProfileConfig profileConfig = this.profile_config;
        if (profileConfig != null) {
            arrayList.add("profile_config=" + profileConfig);
        }
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        McpDecryptionConfig mcpDecryptionConfig = this.mcp_decryption_config;
        if (mcpDecryptionConfig != null) {
            arrayList.add("mcp_decryption_config=" + mcpDecryptionConfig);
        }
        ChatContext chatContext = this.chat_context;
        if (chatContext != null) {
            arrayList.add("chat_context=" + chatContext);
        }
        String str3 = this.session_name;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "session_name=", arrayList);
        }
        Integer num = this.session_ttl_in_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("session_ttl_in_seconds=", num, arrayList);
        }
        ToolCall toolCall = this.force_tool_call;
        if (toolCall != null) {
            arrayList.add("force_tool_call=" + toolCall);
        }
        AgentConfigReference agentConfigReference = this.agent_config_ref;
        if (agentConfigReference != null) {
            arrayList.add("agent_config_ref=" + agentConfigReference);
        }
        if (!this.supported_client_renderable_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_client_renderable_types=", arrayList, this.supported_client_renderable_types);
        }
        if (!this.metadata.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("metadata=", this.metadata, arrayList);
        }
        if (!this.force_tool_calls.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("force_tool_calls=", arrayList, this.force_tool_calls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushMessagesRequest{", "}", 0, null, null, 56);
    }
}
