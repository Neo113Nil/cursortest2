package com.squareup.protos.cash.kgoose.client;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.AgentConfigReference;
import com.squareup.protos.cash.kgoose.api.v3.InputMessage;
import com.squareup.protos.cash.kgoose.api.v3.Tenancy;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "", "should_auto_send", "Ljava/lang/Boolean;", "", "session_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "kickoff_messages", "Ljava/util/List;", "", "metadata", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientKickoffParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientKickoffParams> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AgentConfigReference#ADAPTER", schemaIndex = 5, tag = 6)
    public final AgentConfigReference agent_config_ref;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InputMessage#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<InputMessage> kickoff_messages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final Map<String, String> metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean should_auto_send;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", schemaIndex = 3, tag = 4)
    public final Tenancy tenancy;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams;", "<init>", "()V", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "kickoff_messages", "(Ljava/util/List;)Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "", "should_auto_send", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "", "session_id", "(Ljava/lang/String;)Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenancy", "(Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;)Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "", "metadata", "(Ljava/util/Map;)Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "agent_config_ref", "(Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;)Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams$Builder;", "build", "()Lcom/squareup/protos/cash/kgoose/client/ClientKickoffParams;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AgentConfigReference agent_config_ref;
        public List kickoff_messages = EmptyList.INSTANCE;
        public Map metadata;
        public String session_id;
        public Boolean should_auto_send;
        public Tenancy tenancy;

        public Builder() {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.metadata = emptyMap;
        }

        public final Builder agent_config_ref(AgentConfigReference agent_config_ref) {
            this.agent_config_ref = agent_config_ref;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ClientKickoffParams build() {
            return new ClientKickoffParams(this.kickoff_messages, this.should_auto_send, this.session_id, this.tenancy, this.metadata, this.agent_config_ref, buildUnknownFields());
        }

        public final Builder kickoff_messages(List<InputMessage> kickoff_messages) {
            kickoff_messages.getClass();
            TransactorKt.checkElementsNotNull(kickoff_messages);
            this.kickoff_messages = kickoff_messages;
            return this;
        }

        public final Builder metadata(Map<String, String> metadata) {
            metadata.getClass();
            this.metadata = metadata;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        public final Builder should_auto_send(Boolean should_auto_send) {
            this.should_auto_send = should_auto_send;
            return this;
        }

        public final Builder tenancy(Tenancy tenancy) {
            this.tenancy = tenancy;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientKickoffParams.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.client.ClientKickoffParams$Companion$ADAPTER$1
            public final Lazy metadataAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.metadataAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(15));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ClientKickoffParams(m, (Boolean) obj, (String) obj2, (Tenancy) obj3, linkedHashMap, (AgentConfigReference) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(InputMessage.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            obj = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                obj3 = Tenancy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            linkedHashMap.putAll((Map) ((ProtoAdapter) this.metadataAdapter$delegate.getValue()).decode(protoReader));
                            break;
                        case 6:
                            obj4 = TransactorKt.decodeMessageOrMerge(AgentConfigReference.ADAPTER, protoReader, obj4);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
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
                ((ProtoAdapter) this.metadataAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 5, clientKickoffParams.metadata);
                Tenancy.ADAPTER.encodeWithTag(reverseProtoWriter, 4, clientKickoffParams.tenancy);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, clientKickoffParams.session_id);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, clientKickoffParams.should_auto_send);
                InputMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, clientKickoffParams.kickoff_messages);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
                clientKickoffParams.getClass();
                return AgentConfigReference.ADAPTER.encodedSizeWithTag(6, clientKickoffParams.agent_config_ref) + ((ProtoAdapter) this.metadataAdapter$delegate.getValue()).encodedSizeWithTag(5, clientKickoffParams.metadata) + Tenancy.ADAPTER.encodedSizeWithTag(4, clientKickoffParams.tenancy) + ProtoAdapter.STRING.encodedSizeWithTag(3, clientKickoffParams.session_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, clientKickoffParams.should_auto_send) + InputMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, clientKickoffParams.kickoff_messages) + clientKickoffParams.unknownFields().getSize$okio();
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
                Map<String, String> map = clientKickoffParams.metadata;
                map.getClass();
                byteString.getClass();
                return new ClientKickoffParams(m1169redactElements, bool, str, tenancy, map, agentConfigReference2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
                clientKickoffParams.getClass();
                InputMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, clientKickoffParams.kickoff_messages);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, clientKickoffParams.should_auto_send);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, clientKickoffParams.session_id);
                Tenancy.ADAPTER.encodeWithTag(protoWriter, 4, clientKickoffParams.tenancy);
                ((ProtoAdapter) this.metadataAdapter$delegate.getValue()).encodeWithTag(protoWriter, 5, clientKickoffParams.metadata);
                AgentConfigReference.ADAPTER.encodeWithTag(protoWriter, 6, clientKickoffParams.agent_config_ref);
                protoWriter.writeBytes(clientKickoffParams.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientKickoffParams(List list, Boolean bool, String str, Tenancy tenancy, Map map, AgentConfigReference agentConfigReference, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        map.getClass();
        byteString.getClass();
        this.should_auto_send = bool;
        this.session_id = str;
        this.tenancy = tenancy;
        this.agent_config_ref = agentConfigReference;
        this.kickoff_messages = TransactorKt.immutableCopyOf("kickoff_messages", list);
        this.metadata = TransactorKt.immutableCopyOf("metadata", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientKickoffParams)) {
            return false;
        }
        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
        return Intrinsics.areEqual(unknownFields(), clientKickoffParams.unknownFields()) && Intrinsics.areEqual(this.kickoff_messages, clientKickoffParams.kickoff_messages) && Intrinsics.areEqual(this.should_auto_send, clientKickoffParams.should_auto_send) && Intrinsics.areEqual(this.session_id, clientKickoffParams.session_id) && this.tenancy == clientKickoffParams.tenancy && Intrinsics.areEqual(this.metadata, clientKickoffParams.metadata) && Intrinsics.areEqual(this.agent_config_ref, clientKickoffParams.agent_config_ref);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.kickoff_messages);
        Boolean bool = this.should_auto_send;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.session_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Tenancy tenancy = this.tenancy;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m((hashCode2 + (tenancy != null ? tenancy.hashCode() : 0)) * 37, this.metadata, 37);
        AgentConfigReference agentConfigReference = this.agent_config_ref;
        int hashCode3 = m2 + (agentConfigReference != null ? agentConfigReference.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.kickoff_messages = this.kickoff_messages;
        builder.should_auto_send = this.should_auto_send;
        builder.session_id = this.session_id;
        builder.tenancy = this.tenancy;
        builder.metadata = this.metadata;
        builder.agent_config_ref = this.agent_config_ref;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.kickoff_messages.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("kickoff_messages=", arrayList, this.kickoff_messages);
        }
        Boolean bool = this.should_auto_send;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_auto_send=", bool, arrayList);
        }
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        Tenancy tenancy = this.tenancy;
        if (tenancy != null) {
            arrayList.add("tenancy=" + tenancy);
        }
        if (!this.metadata.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("metadata=", this.metadata, arrayList);
        }
        AgentConfigReference agentConfigReference = this.agent_config_ref;
        if (agentConfigReference != null) {
            arrayList.add("agent_config_ref=" + agentConfigReference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientKickoffParams{", "}", 0, null, null, 56);
    }
}
