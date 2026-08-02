package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams$Builder;", "", "should_auto_send", "Ljava/lang/Boolean;", "", "session_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "kickoff_messages", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientKickoffParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientKickoffParams> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AgentConfigReference#ADAPTER", schemaIndex = 4, tag = 6)
    public final AgentConfigReference agent_config_ref;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.InputMessage#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<InputMessage> kickoff_messages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean should_auto_send;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", schemaIndex = 3, tag = 4)
    public final Tenancy tenancy;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "<init>", "()V", "kickoff_messages", "", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "should_auto_send", "", "Ljava/lang/Boolean;", "session_id", "", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "agent_config_ref", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AgentConfigReference agent_config_ref;
        public List<InputMessage> kickoff_messages = EmptyList.INSTANCE;
        public String session_id;
        public Boolean should_auto_send;
        public Tenancy tenancy;

        public final Builder agent_config_ref(AgentConfigReference agent_config_ref) {
            this.agent_config_ref = agent_config_ref;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ClientKickoffParams build() {
            return new ClientKickoffParams(this.kickoff_messages, this.should_auto_send, this.session_id, this.tenancy, this.agent_config_ref, buildUnknownFields());
        }

        public final Builder kickoff_messages(List<InputMessage> kickoff_messages) {
            kickoff_messages.getClass();
            TransactorKt.checkElementsNotNull(kickoff_messages);
            this.kickoff_messages = kickoff_messages;
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
        ClientKickoffParams$Companion$ADAPTER$1 clientKickoffParams$Companion$ADAPTER$1 = new ClientKickoffParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientKickoffParams.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ClientKickoffParams", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = clientKickoffParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientKickoffParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientKickoffParams(List list, Boolean bool, String str, Tenancy tenancy, AgentConfigReference agentConfigReference, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.should_auto_send = bool;
        this.session_id = str;
        this.tenancy = tenancy;
        this.agent_config_ref = agentConfigReference;
        this.kickoff_messages = TransactorKt.immutableCopyOf("kickoff_messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientKickoffParams)) {
            return false;
        }
        ClientKickoffParams clientKickoffParams = (ClientKickoffParams) obj;
        return Intrinsics.areEqual(unknownFields(), clientKickoffParams.unknownFields()) && Intrinsics.areEqual(this.kickoff_messages, clientKickoffParams.kickoff_messages) && Intrinsics.areEqual(this.should_auto_send, clientKickoffParams.should_auto_send) && Intrinsics.areEqual(this.session_id, clientKickoffParams.session_id) && this.tenancy == clientKickoffParams.tenancy && Intrinsics.areEqual(this.agent_config_ref, clientKickoffParams.agent_config_ref);
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
        int hashCode3 = (hashCode2 + (tenancy != null ? tenancy.hashCode() : 0)) * 37;
        AgentConfigReference agentConfigReference = this.agent_config_ref;
        int hashCode4 = hashCode3 + (agentConfigReference != null ? agentConfigReference.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.kickoff_messages = this.kickoff_messages;
        builder.should_auto_send = this.should_auto_send;
        builder.session_id = this.session_id;
        builder.tenancy = this.tenancy;
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
        AgentConfigReference agentConfigReference = this.agent_config_ref;
        if (agentConfigReference != null) {
            arrayList.add("agent_config_ref=" + agentConfigReference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientKickoffParams{", "}", 0, null, null, 56);
    }
}
