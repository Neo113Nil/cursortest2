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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionEntryPoint;", "entry_point", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionEntryPoint;", "", "tool_call_id", "Ljava/lang/String;", "trigger_user_message_id", "source_assistant_message_id", "template_id", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AutomationAttributionContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AutomationAttributionContext> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AutomationAttributionEntryPoint#ADAPTER", schemaIndex = 0, tag = 1)
    public final AutomationAttributionEntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String source_assistant_message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String template_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String tool_call_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String trigger_user_message_id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "<init>", "()V", "entry_point", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionEntryPoint;", "tool_call_id", "", "trigger_user_message_id", "source_assistant_message_id", "template_id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AutomationAttributionEntryPoint entry_point;
        public String source_assistant_message_id;
        public String template_id;
        public String tool_call_id;
        public String trigger_user_message_id;

        @Override // com.squareup.wire.Message.Builder
        public AutomationAttributionContext build() {
            return new AutomationAttributionContext(this.entry_point, this.tool_call_id, this.trigger_user_message_id, this.source_assistant_message_id, this.template_id, buildUnknownFields());
        }

        public final Builder entry_point(AutomationAttributionEntryPoint entry_point) {
            this.entry_point = entry_point;
            return this;
        }

        public final Builder source_assistant_message_id(String source_assistant_message_id) {
            this.source_assistant_message_id = source_assistant_message_id;
            return this;
        }

        public final Builder template_id(String template_id) {
            this.template_id = template_id;
            return this;
        }

        public final Builder tool_call_id(String tool_call_id) {
            this.tool_call_id = tool_call_id;
            return this;
        }

        public final Builder trigger_user_message_id(String trigger_user_message_id) {
            this.trigger_user_message_id = trigger_user_message_id;
            return this;
        }
    }

    static {
        AutomationAttributionContext$Companion$ADAPTER$1 automationAttributionContext$Companion$ADAPTER$1 = new AutomationAttributionContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AutomationAttributionContext.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.AutomationAttributionContext", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = automationAttributionContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(automationAttributionContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomationAttributionContext(AutomationAttributionEntryPoint automationAttributionEntryPoint, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point = automationAttributionEntryPoint;
        this.tool_call_id = str;
        this.trigger_user_message_id = str2;
        this.source_assistant_message_id = str3;
        this.template_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutomationAttributionContext)) {
            return false;
        }
        AutomationAttributionContext automationAttributionContext = (AutomationAttributionContext) obj;
        return Intrinsics.areEqual(unknownFields(), automationAttributionContext.unknownFields()) && this.entry_point == automationAttributionContext.entry_point && Intrinsics.areEqual(this.tool_call_id, automationAttributionContext.tool_call_id) && Intrinsics.areEqual(this.trigger_user_message_id, automationAttributionContext.trigger_user_message_id) && Intrinsics.areEqual(this.source_assistant_message_id, automationAttributionContext.source_assistant_message_id) && Intrinsics.areEqual(this.template_id, automationAttributionContext.template_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AutomationAttributionEntryPoint automationAttributionEntryPoint = this.entry_point;
        int hashCode2 = (hashCode + (automationAttributionEntryPoint != null ? automationAttributionEntryPoint.hashCode() : 0)) * 37;
        String str = this.tool_call_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.trigger_user_message_id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.source_assistant_message_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.template_id;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.entry_point = this.entry_point;
        builder.tool_call_id = this.tool_call_id;
        builder.trigger_user_message_id = this.trigger_user_message_id;
        builder.source_assistant_message_id = this.source_assistant_message_id;
        builder.template_id = this.template_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AutomationAttributionEntryPoint automationAttributionEntryPoint = this.entry_point;
        if (automationAttributionEntryPoint != null) {
            arrayList.add("entry_point=" + automationAttributionEntryPoint);
        }
        String str = this.tool_call_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tool_call_id=", arrayList);
        }
        String str2 = this.trigger_user_message_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "trigger_user_message_id=", arrayList);
        }
        String str3 = this.source_assistant_message_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "source_assistant_message_id=", arrayList);
        }
        String str4 = this.template_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "template_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AutomationAttributionContext{", "}", 0, null, null, 56);
    }
}
