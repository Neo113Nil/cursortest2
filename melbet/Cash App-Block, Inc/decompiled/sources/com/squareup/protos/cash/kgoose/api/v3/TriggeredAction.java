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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&%R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction$Builder;", "", "id", "Ljava/lang/String;", "creator", "", "created", "Ljava/lang/Long;", "updated", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "title", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRunStatus;", "latest_run_status", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRunStatus;", "latest_chat_session_id", "creation_session_id", "last_success_at", "name", "executed_at", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata;", "metadata", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionNotificationConfig;", "notification_config", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionNotificationConfig;", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "automation_definition", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "", "instructions", "Ljava/util/List;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo;", "triggers", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TriggeredAction> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ManagerbotAutomationDefinition#ADAPTER", schemaIndex = 16, tag = 22)
    public final ManagerbotAutomationDefinition automation_definition;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long created;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 14)
    public final String creation_session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String creator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 12, tag = 17)
    public final Long executed_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 10)
    public final List<String> instructions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 10, tag = 15)
    public final Long last_success_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 13)
    public final String latest_chat_session_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionRunStatus#ADAPTER", schemaIndex = 7, tag = 12)
    public final TriggeredActionRunStatus latest_run_status;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionMetadata#ADAPTER", schemaIndex = 14, tag = 20)
    public final TriggeredActionMetadata metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 16)
    public final String name;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionNotificationConfig#ADAPTER", schemaIndex = 15, tag = 21)
    public final TriggeredActionNotificationConfig notification_config;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggeredActionStatus#ADAPTER", schemaIndex = 4, tag = 6)
    public final TriggeredActionStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 7)
    public final String title;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TriggerInfo#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 13, tag = 19)
    public final List<TriggerInfo> triggers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 4)
    public final Long updated;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\b\u0010!\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction;", "<init>", "()V", "id", "", "creator", "created", "", "Ljava/lang/Long;", "updated", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionStatus;", "title", "instructions", "", "latest_run_status", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionRunStatus;", "latest_chat_session_id", "creation_session_id", "last_success_at", "name", "executed_at", "triggers", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggerInfo;", "metadata", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata;", "notification_config", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionNotificationConfig;", "automation_definition", "Lcom/squareup/protos/cash/kgoose/api/v3/ManagerbotAutomationDefinition;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredAction$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ManagerbotAutomationDefinition automation_definition;
        public Long created;
        public String creation_session_id;
        public String creator;
        public Long executed_at;
        public String id;
        public List<String> instructions;
        public Long last_success_at;
        public String latest_chat_session_id;
        public TriggeredActionRunStatus latest_run_status;
        public TriggeredActionMetadata metadata;
        public String name;
        public TriggeredActionNotificationConfig notification_config;
        public TriggeredActionStatus status;
        public String title;
        public List<TriggerInfo> triggers;
        public Long updated;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.instructions = emptyList;
            this.triggers = emptyList;
        }

        public final Builder automation_definition(ManagerbotAutomationDefinition automation_definition) {
            this.automation_definition = automation_definition;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TriggeredAction build() {
            return new TriggeredAction(this.id, this.creator, this.created, this.updated, this.status, this.title, this.instructions, this.latest_run_status, this.latest_chat_session_id, this.creation_session_id, this.last_success_at, this.name, this.executed_at, this.triggers, this.metadata, this.notification_config, this.automation_definition, buildUnknownFields());
        }

        public final Builder created(Long created) {
            this.created = created;
            return this;
        }

        public final Builder creation_session_id(String creation_session_id) {
            this.creation_session_id = creation_session_id;
            return this;
        }

        public final Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        public final Builder executed_at(Long executed_at) {
            this.executed_at = executed_at;
            return this;
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

        public final Builder last_success_at(Long last_success_at) {
            this.last_success_at = last_success_at;
            return this;
        }

        public final Builder latest_chat_session_id(String latest_chat_session_id) {
            this.latest_chat_session_id = latest_chat_session_id;
            return this;
        }

        public final Builder latest_run_status(TriggeredActionRunStatus latest_run_status) {
            this.latest_run_status = latest_run_status;
            return this;
        }

        public final Builder metadata(TriggeredActionMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder notification_config(TriggeredActionNotificationConfig notification_config) {
            this.notification_config = notification_config;
            return this;
        }

        public final Builder status(TriggeredActionStatus status) {
            this.status = status;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder triggers(List<TriggerInfo> triggers) {
            triggers.getClass();
            TransactorKt.checkElementsNotNull(triggers);
            this.triggers = triggers;
            return this;
        }

        public final Builder updated(Long updated) {
            this.updated = updated;
            return this;
        }
    }

    static {
        TriggeredAction$Companion$ADAPTER$1 triggeredAction$Companion$ADAPTER$1 = new TriggeredAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TriggeredAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TriggeredAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = triggeredAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(triggeredAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggeredAction(String str, String str2, Long l, Long l2, TriggeredActionStatus triggeredActionStatus, String str3, List list, TriggeredActionRunStatus triggeredActionRunStatus, String str4, String str5, Long l3, String str6, Long l4, List list2, TriggeredActionMetadata triggeredActionMetadata, TriggeredActionNotificationConfig triggeredActionNotificationConfig, ManagerbotAutomationDefinition managerbotAutomationDefinition, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.id = str;
        this.creator = str2;
        this.created = l;
        this.updated = l2;
        this.status = triggeredActionStatus;
        this.title = str3;
        this.latest_run_status = triggeredActionRunStatus;
        this.latest_chat_session_id = str4;
        this.creation_session_id = str5;
        this.last_success_at = l3;
        this.name = str6;
        this.executed_at = l4;
        this.metadata = triggeredActionMetadata;
        this.notification_config = triggeredActionNotificationConfig;
        this.automation_definition = managerbotAutomationDefinition;
        this.instructions = TransactorKt.immutableCopyOf("instructions", list);
        this.triggers = TransactorKt.immutableCopyOf("triggers", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggeredAction)) {
            return false;
        }
        TriggeredAction triggeredAction = (TriggeredAction) obj;
        return Intrinsics.areEqual(unknownFields(), triggeredAction.unknownFields()) && Intrinsics.areEqual(this.id, triggeredAction.id) && Intrinsics.areEqual(this.creator, triggeredAction.creator) && Intrinsics.areEqual(this.created, triggeredAction.created) && Intrinsics.areEqual(this.updated, triggeredAction.updated) && this.status == triggeredAction.status && Intrinsics.areEqual(this.title, triggeredAction.title) && Intrinsics.areEqual(this.instructions, triggeredAction.instructions) && this.latest_run_status == triggeredAction.latest_run_status && Intrinsics.areEqual(this.latest_chat_session_id, triggeredAction.latest_chat_session_id) && Intrinsics.areEqual(this.creation_session_id, triggeredAction.creation_session_id) && Intrinsics.areEqual(this.last_success_at, triggeredAction.last_success_at) && Intrinsics.areEqual(this.name, triggeredAction.name) && Intrinsics.areEqual(this.executed_at, triggeredAction.executed_at) && Intrinsics.areEqual(this.triggers, triggeredAction.triggers) && Intrinsics.areEqual(this.metadata, triggeredAction.metadata) && Intrinsics.areEqual(this.notification_config, triggeredAction.notification_config) && Intrinsics.areEqual(this.automation_definition, triggeredAction.automation_definition);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.creator;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.created;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        TriggeredActionStatus triggeredActionStatus = this.status;
        int hashCode6 = (hashCode5 + (triggeredActionStatus != null ? triggeredActionStatus.hashCode() : 0)) * 37;
        String str3 = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.instructions);
        TriggeredActionRunStatus triggeredActionRunStatus = this.latest_run_status;
        int hashCode7 = (m + (triggeredActionRunStatus != null ? triggeredActionRunStatus.hashCode() : 0)) * 37;
        String str4 = this.latest_chat_session_id;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.creation_session_id;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l3 = this.last_success_at;
        int hashCode10 = (hashCode9 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        String str6 = this.name;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l4 = this.executed_at;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode11 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37, 37, this.triggers);
        TriggeredActionMetadata triggeredActionMetadata = this.metadata;
        int hashCode12 = (m2 + (triggeredActionMetadata != null ? triggeredActionMetadata.hashCode() : 0)) * 37;
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = this.notification_config;
        int hashCode13 = (hashCode12 + (triggeredActionNotificationConfig != null ? triggeredActionNotificationConfig.hashCode() : 0)) * 37;
        ManagerbotAutomationDefinition managerbotAutomationDefinition = this.automation_definition;
        int hashCode14 = hashCode13 + (managerbotAutomationDefinition != null ? managerbotAutomationDefinition.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.creator = this.creator;
        builder.created = this.created;
        builder.updated = this.updated;
        builder.status = this.status;
        builder.title = this.title;
        builder.instructions = this.instructions;
        builder.latest_run_status = this.latest_run_status;
        builder.latest_chat_session_id = this.latest_chat_session_id;
        builder.creation_session_id = this.creation_session_id;
        builder.last_success_at = this.last_success_at;
        builder.name = this.name;
        builder.executed_at = this.executed_at;
        builder.triggers = this.triggers;
        builder.metadata = this.metadata;
        builder.notification_config = this.notification_config;
        builder.automation_definition = this.automation_definition;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.creator;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "creator=", arrayList);
        }
        Long l = this.created;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created=", l, arrayList);
        }
        Long l2 = this.updated;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated=", l2, arrayList);
        }
        TriggeredActionStatus triggeredActionStatus = this.status;
        if (triggeredActionStatus != null) {
            arrayList.add("status=" + triggeredActionStatus);
        }
        String str3 = this.title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "title=", arrayList);
        }
        if (!this.instructions.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("instructions=", arrayList, this.instructions);
        }
        TriggeredActionRunStatus triggeredActionRunStatus = this.latest_run_status;
        if (triggeredActionRunStatus != null) {
            arrayList.add("latest_run_status=" + triggeredActionRunStatus);
        }
        String str4 = this.latest_chat_session_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "latest_chat_session_id=", arrayList);
        }
        String str5 = this.creation_session_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "creation_session_id=", arrayList);
        }
        Long l3 = this.last_success_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_success_at=", l3, arrayList);
        }
        String str6 = this.name;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "name=", arrayList);
        }
        Long l4 = this.executed_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("executed_at=", l4, arrayList);
        }
        if (!this.triggers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("triggers=", arrayList, this.triggers);
        }
        TriggeredActionMetadata triggeredActionMetadata = this.metadata;
        if (triggeredActionMetadata != null) {
            arrayList.add("metadata=" + triggeredActionMetadata);
        }
        TriggeredActionNotificationConfig triggeredActionNotificationConfig = this.notification_config;
        if (triggeredActionNotificationConfig != null) {
            arrayList.add("notification_config=" + triggeredActionNotificationConfig);
        }
        ManagerbotAutomationDefinition managerbotAutomationDefinition = this.automation_definition;
        if (managerbotAutomationDefinition != null) {
            arrayList.add("automation_definition=" + managerbotAutomationDefinition);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TriggeredAction{", "}", 0, null, null, 56);
    }
}
