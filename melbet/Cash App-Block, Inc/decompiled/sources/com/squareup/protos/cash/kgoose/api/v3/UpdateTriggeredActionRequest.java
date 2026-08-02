package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest$Builder;", "", "id", "Ljava/lang/String;", "title", "schedule", "time_zone", "", "run_times", "Ljava/lang/Long;", "run_after", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionNotificationConfig;", "notification_config", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionNotificationConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "automation_definition", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "session_id", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "attribution_context", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "", "instructions", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateTriggeredActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateTriggeredActionRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AutomationAttributionContext#ADAPTER", schemaIndex = 11, tag = 12)
    public final AutomationAttributionContext attribution_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotAutomationDefinition#ADAPTER", schemaIndex = 9, tag = 10)
    public final ManagerbotAutomationDefinition automation_definition;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<String> instructions;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionNotificationConfig#ADAPTER", schemaIndex = 8, tag = 9)
    public final TriggeredActionNotificationConfig notification_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 6, tag = 7)
    public final Long run_after;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 5, tag = 6)
    public final Long run_times;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String schedule;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String session_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionStatus#ADAPTER", schemaIndex = 7, tag = 8)
    public final TriggeredActionStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String time_zone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0019J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0019J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest;", "<init>", "()V", "id", "", "title", "instructions", "", "schedule", "time_zone", "run_times", "", "Ljava/lang/Long;", "run_after", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "notification_config", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionNotificationConfig;", "automation_definition", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "session_id", "attribution_context", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/UpdateTriggeredActionRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public AutomationAttributionContext attribution_context;
        public ManagerbotAutomationDefinition automation_definition;
        public String id;
        public List<String> instructions = EmptyList.INSTANCE;
        public TriggeredActionNotificationConfig notification_config;
        public Long run_after;
        public Long run_times;
        public String schedule;
        public String session_id;
        public TriggeredActionStatus status;
        public String time_zone;
        public String title;

        public final Builder attribution_context(AutomationAttributionContext attribution_context) {
            this.attribution_context = attribution_context;
            return this;
        }

        public final Builder automation_definition(ManagerbotAutomationDefinition automation_definition) {
            this.automation_definition = automation_definition;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateTriggeredActionRequest build() {
            return new UpdateTriggeredActionRequest(this.id, this.title, this.instructions, this.schedule, this.time_zone, this.run_times, this.run_after, this.status, this.notification_config, this.automation_definition, this.session_id, this.attribution_context, buildUnknownFields());
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder instructions(List<String> instructions) {
            instructions.getClass();
            TransactorKt.checkElementsNotNull(instructions);
            this.instructions = instructions;
            return this;
        }

        public final Builder notification_config(TriggeredActionNotificationConfig notification_config) {
            this.notification_config = notification_config;
            return this;
        }

        public final Builder run_after(Long run_after) {
            this.run_after = run_after;
            return this;
        }

        public final Builder run_times(Long run_times) {
            this.run_times = run_times;
            return this;
        }

        public final Builder schedule(String schedule) {
            this.schedule = schedule;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        public final Builder status(TriggeredActionStatus status) {
            this.status = status;
            return this;
        }

        public final Builder time_zone(String time_zone) {
            this.time_zone = time_zone;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        UpdateTriggeredActionRequest$Companion$ADAPTER$1 updateTriggeredActionRequest$Companion$ADAPTER$1 = new UpdateTriggeredActionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateTriggeredActionRequest.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.UpdateTriggeredActionRequest", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = updateTriggeredActionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateTriggeredActionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTriggeredActionRequest(String str, String str2, List list, String str3, String str4, Long l, Long l2, TriggeredActionStatus triggeredActionStatus, TriggeredActionNotificationConfig triggeredActionNotificationConfig, ManagerbotAutomationDefinition managerbotAutomationDefinition, String str5, AutomationAttributionContext automationAttributionContext, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.title = str2;
        this.schedule = str3;
        this.time_zone = str4;
        this.run_times = l;
        this.run_after = l2;
        this.status = triggeredActionStatus;
        this.notification_config = triggeredActionNotificationConfig;
        this.automation_definition = managerbotAutomationDefinition;
        this.session_id = str5;
        this.attribution_context = automationAttributionContext;
        this.instructions = TransactorKt.immutableCopyOf("instructions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateTriggeredActionRequest)) {
            return false;
        }
        UpdateTriggeredActionRequest updateTriggeredActionRequest = (UpdateTriggeredActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateTriggeredActionRequest.unknownFields()) && Intrinsics.areEqual(this.id, updateTriggeredActionRequest.id) && Intrinsics.areEqual(this.title, updateTriggeredActionRequest.title) && Intrinsics.areEqual(this.instructions, updateTriggeredActionRequest.instructions) && Intrinsics.areEqual(this.schedule, updateTriggeredActionRequest.schedule) && Intrinsics.areEqual(this.time_zone, updateTriggeredActionRequest.time_zone) && Intrinsics.areEqual(this.run_times, updateTriggeredActionRequest.run_times) && Intrinsics.areEqual(this.run_after, updateTriggeredActionRequest.run_after) && this.status == updateTriggeredActionRequest.status && Intrinsics.areEqual(this.notification_config, updateTriggeredActionRequest.notification_config) && Intrinsics.areEqual(this.automation_definition, updateTriggeredActionRequest.automation_definition) && Intrinsics.areEqual(this.session_id, updateTriggeredActionRequest.session_id) && Intrinsics.areEqual(this.attribution_context, updateTriggeredActionRequest.attribution_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.instructions);
        String str3 = this.schedule;
        int hashCode3 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.time_zone;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.run_times;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.run_after;
        int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        TriggeredActionStatus triggeredActionStatus = this.status;
        int hashCode7 = (hashCode6 + (triggeredActionStatus != null ? triggeredActionStatus.hashCode() : 0)) * 37;
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = this.notification_config;
        int hashCode8 = (hashCode7 + (triggeredActionNotificationConfig != null ? triggeredActionNotificationConfig.hashCode() : 0)) * 37;
        ManagerbotAutomationDefinition managerbotAutomationDefinition = this.automation_definition;
        int hashCode9 = (hashCode8 + (managerbotAutomationDefinition != null ? managerbotAutomationDefinition.hashCode() : 0)) * 37;
        String str5 = this.session_id;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        AutomationAttributionContext automationAttributionContext = this.attribution_context;
        int hashCode11 = hashCode10 + (automationAttributionContext != null ? automationAttributionContext.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.title = this.title;
        builder.instructions = this.instructions;
        builder.schedule = this.schedule;
        builder.time_zone = this.time_zone;
        builder.run_times = this.run_times;
        builder.run_after = this.run_after;
        builder.status = this.status;
        builder.notification_config = this.notification_config;
        builder.automation_definition = this.automation_definition;
        builder.session_id = this.session_id;
        builder.attribution_context = this.attribution_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        if (!this.instructions.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("instructions=", arrayList, this.instructions);
        }
        String str3 = this.schedule;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "schedule=", arrayList);
        }
        String str4 = this.time_zone;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "time_zone=", arrayList);
        }
        Long l = this.run_times;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("run_times=", l, arrayList);
        }
        Long l2 = this.run_after;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("run_after=", l2, arrayList);
        }
        TriggeredActionStatus triggeredActionStatus = this.status;
        if (triggeredActionStatus != null) {
            arrayList.add("status=" + triggeredActionStatus);
        }
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = this.notification_config;
        if (triggeredActionNotificationConfig != null) {
            arrayList.add("notification_config=" + triggeredActionNotificationConfig);
        }
        ManagerbotAutomationDefinition managerbotAutomationDefinition = this.automation_definition;
        if (managerbotAutomationDefinition != null) {
            arrayList.add("automation_definition=" + managerbotAutomationDefinition);
        }
        String str5 = this.session_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "session_id=", arrayList);
        }
        AutomationAttributionContext automationAttributionContext = this.attribution_context;
        if (automationAttributionContext != null) {
            arrayList.add("attribution_context=" + automationAttributionContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateTriggeredActionRequest{", "}", 0, null, null, 56);
    }
}
