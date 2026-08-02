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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u0012\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig$Builder;", "", "tool", "Ljava/lang/String;", "description", "config_json", "meta_json", "", "mutates_state", "Ljava/lang/Boolean;", "direct_execution_only", "getDirect_execution_only$annotations", "()V", "workflow_steps_json", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToolConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ToolConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String config_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean direct_execution_only;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String meta_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean mutates_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String tool;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String workflow_steps_json;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "<init>", "()V", "tool", "", "description", "config_json", "meta_json", "mutates_state", "", "Ljava/lang/Boolean;", "direct_execution_only", "workflow_steps_json", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String config_json;
        public String description;
        public Boolean direct_execution_only;
        public String meta_json;
        public Boolean mutates_state;
        public String tool;
        public String workflow_steps_json;

        @Override // com.squareup.wire.Message.Builder
        public ToolConfig build() {
            return new ToolConfig(this.tool, this.description, this.config_json, this.meta_json, this.mutates_state, this.direct_execution_only, this.workflow_steps_json, buildUnknownFields());
        }

        public final Builder config_json(String config_json) {
            this.config_json = config_json;
            return this;
        }

        public final Builder description(String description) {
            this.description = description;
            return this;
        }

        @Deprecated
        public final Builder direct_execution_only(Boolean direct_execution_only) {
            this.direct_execution_only = direct_execution_only;
            return this;
        }

        public final Builder meta_json(String meta_json) {
            this.meta_json = meta_json;
            return this;
        }

        public final Builder mutates_state(Boolean mutates_state) {
            this.mutates_state = mutates_state;
            return this;
        }

        public final Builder tool(String tool) {
            this.tool = tool;
            return this;
        }

        public final Builder workflow_steps_json(String workflow_steps_json) {
            this.workflow_steps_json = workflow_steps_json;
            return this;
        }
    }

    static {
        ToolConfig$Companion$ADAPTER$1 toolConfig$Companion$ADAPTER$1 = new ToolConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ToolConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ToolConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/extension_messages.proto");
        ADAPTER = toolConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(toolConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolConfig(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tool = str;
        this.description = str2;
        this.config_json = str3;
        this.meta_json = str4;
        this.mutates_state = bool;
        this.direct_execution_only = bool2;
        this.workflow_steps_json = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ToolConfig)) {
            return false;
        }
        ToolConfig toolConfig = (ToolConfig) obj;
        return Intrinsics.areEqual(unknownFields(), toolConfig.unknownFields()) && Intrinsics.areEqual(this.tool, toolConfig.tool) && Intrinsics.areEqual(this.description, toolConfig.description) && Intrinsics.areEqual(this.config_json, toolConfig.config_json) && Intrinsics.areEqual(this.meta_json, toolConfig.meta_json) && Intrinsics.areEqual(this.mutates_state, toolConfig.mutates_state) && Intrinsics.areEqual(this.direct_execution_only, toolConfig.direct_execution_only) && Intrinsics.areEqual(this.workflow_steps_json, toolConfig.workflow_steps_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.tool;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.config_json;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.meta_json;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.mutates_state;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.direct_execution_only;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str5 = this.workflow_steps_json;
        int hashCode8 = hashCode7 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.tool = this.tool;
        builder.description = this.description;
        builder.config_json = this.config_json;
        builder.meta_json = this.meta_json;
        builder.mutates_state = this.mutates_state;
        builder.direct_execution_only = this.direct_execution_only;
        builder.workflow_steps_json = this.workflow_steps_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.tool;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tool=", arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        String str3 = this.config_json;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "config_json=", arrayList);
        }
        String str4 = this.meta_json;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "meta_json=", arrayList);
        }
        Boolean bool = this.mutates_state;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("mutates_state=", bool, arrayList);
        }
        Boolean bool2 = this.direct_execution_only;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("direct_execution_only=", bool2, arrayList);
        }
        String str5 = this.workflow_steps_json;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "workflow_steps_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ToolConfig{", "}", 0, null, null, 56);
    }
}
