package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference$Builder;", "", "name", "Ljava/lang/String;", "version", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AgentConfigReference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AgentConfigReference> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String version;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/AgentConfigReference;", "<init>", "()V", "name", "", "version", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String name;
        public String version;

        @Override // com.squareup.wire.Message.Builder
        public AgentConfigReference build() {
            return new AgentConfigReference(this.name, this.version, buildUnknownFields());
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder version(String version) {
            this.version = version;
            return this;
        }
    }

    static {
        AgentConfigReference$Companion$ADAPTER$1 agentConfigReference$Companion$ADAPTER$1 = new AgentConfigReference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AgentConfigReference.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.AgentConfigReference", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/agent_config_messages.proto");
        ADAPTER = agentConfigReference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(agentConfigReference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentConfigReference(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.version = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AgentConfigReference)) {
            return false;
        }
        AgentConfigReference agentConfigReference = (AgentConfigReference) obj;
        return Intrinsics.areEqual(unknownFields(), agentConfigReference.unknownFields()) && Intrinsics.areEqual(this.name, agentConfigReference.name) && Intrinsics.areEqual(this.version, agentConfigReference.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.version;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "version=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AgentConfigReference{", "}", 0, null, null, 56);
    }
}
