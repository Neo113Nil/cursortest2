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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)(R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u0012\u0004\b'\u0010\u0010¨\u0006*"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Session$Builder;", "", "id", "Ljava/lang/String;", "name", "", "created", "Ljava/lang/Long;", "updated", "tile_id", "", "async_process", "Ljava/lang/Boolean;", "getAsync_process$annotations", "()V", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "chat_session_status", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "space_id", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "chat_source", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "last_message_at", "last_read_at", "has_unread_messages", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "activities", "Ljava/util/List;", "", "metadata", "Ljava/util/Map;", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "feedback", "getFeedback$annotations", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Session extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Session> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Activity#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<Activity> activities;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean async_process;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatContext#ADAPTER", schemaIndex = 10, tag = 11)
    public final ChatContext chat_context;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus#ADAPTER", schemaIndex = 6, tag = 7)
    public final ChatSessionStatus chat_session_status;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Source#ADAPTER", schemaIndex = 9, tag = 10)
    public final Source chat_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long created;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Feedback#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 15, tag = 16)
    public final List<Feedback> feedback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 13, tag = 14)
    public final Boolean has_unread_messages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 11, tag = 12)
    public final Long last_message_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 12, tag = 13)
    public final Long last_read_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 15)
    public final Map<String, String> metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String space_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String tile_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 3, tag = 4)
    public final Long updated;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010!J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010!J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\"J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0015\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010!J\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010!J\u0015\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\"J\u001a\u0010\u001d\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001eJ\u0016\u0010\u001f\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0013H\u0007J\b\u0010#\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u001e\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Session$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "<init>", "()V", "id", "", "name", "created", "", "Ljava/lang/Long;", "updated", "tile_id", "async_process", "", "Ljava/lang/Boolean;", "chat_session_status", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "activities", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "space_id", "chat_source", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "chat_context", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatContext;", "last_message_at", "last_read_at", "has_unread_messages", "metadata", "", "feedback", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/Session$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/Session$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Activity> activities;
        public Boolean async_process;
        public ChatContext chat_context;
        public ChatSessionStatus chat_session_status;
        public Source chat_source;
        public Long created;
        public List<Feedback> feedback;
        public Boolean has_unread_messages;
        public String id;
        public Long last_message_at;
        public Long last_read_at;
        public Map<String, String> metadata;
        public String name;
        public String space_id;
        public String tile_id;
        public Long updated;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.activities = emptyList;
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            this.metadata = emptyMap;
            this.feedback = emptyList;
        }

        public final Builder activities(List<Activity> activities) {
            activities.getClass();
            TransactorKt.checkElementsNotNull(activities);
            this.activities = activities;
            return this;
        }

        @Deprecated
        public final Builder async_process(Boolean async_process) {
            this.async_process = async_process;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Session build() {
            return new Session(this.id, this.name, this.created, this.updated, this.tile_id, this.async_process, this.chat_session_status, this.activities, this.space_id, this.chat_source, this.chat_context, this.last_message_at, this.last_read_at, this.has_unread_messages, this.metadata, this.feedback, buildUnknownFields());
        }

        public final Builder chat_context(ChatContext chat_context) {
            this.chat_context = chat_context;
            return this;
        }

        public final Builder chat_session_status(ChatSessionStatus chat_session_status) {
            this.chat_session_status = chat_session_status;
            return this;
        }

        public final Builder chat_source(Source chat_source) {
            this.chat_source = chat_source;
            return this;
        }

        public final Builder created(Long created) {
            this.created = created;
            return this;
        }

        @Deprecated
        public final Builder feedback(List<Feedback> feedback) {
            feedback.getClass();
            TransactorKt.checkElementsNotNull(feedback);
            this.feedback = feedback;
            return this;
        }

        public final Builder has_unread_messages(Boolean has_unread_messages) {
            this.has_unread_messages = has_unread_messages;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder last_message_at(Long last_message_at) {
            this.last_message_at = last_message_at;
            return this;
        }

        public final Builder last_read_at(Long last_read_at) {
            this.last_read_at = last_read_at;
            return this;
        }

        public final Builder metadata(Map<String, String> metadata) {
            metadata.getClass();
            this.metadata = metadata;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder space_id(String space_id) {
            this.space_id = space_id;
            return this;
        }

        public final Builder tile_id(String tile_id) {
            this.tile_id = tile_id;
            return this;
        }

        public final Builder updated(Long updated) {
            this.updated = updated;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Session.class);
        Syntax syntax = Syntax.PROTO_2;
        Session$Companion$ADAPTER$1 session$Companion$ADAPTER$1 = new Session$Companion$ADAPTER$1(orCreateKotlinClass);
        ADAPTER = session$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(session$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Session(String str, String str2, Long l, Long l2, String str3, Boolean bool, ChatSessionStatus chatSessionStatus, List list, String str4, Source source, ChatContext chatContext, Long l3, Long l4, Boolean bool2, Map map, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        map.getClass();
        list2.getClass();
        byteString.getClass();
        this.id = str;
        this.name = str2;
        this.created = l;
        this.updated = l2;
        this.tile_id = str3;
        this.async_process = bool;
        this.chat_session_status = chatSessionStatus;
        this.space_id = str4;
        this.chat_source = source;
        this.chat_context = chatContext;
        this.last_message_at = l3;
        this.last_read_at = l4;
        this.has_unread_messages = bool2;
        this.activities = TransactorKt.immutableCopyOf("activities", list);
        this.metadata = TransactorKt.immutableCopyOf("metadata", map);
        this.feedback = TransactorKt.immutableCopyOf("feedback", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return Intrinsics.areEqual(unknownFields(), session.unknownFields()) && Intrinsics.areEqual(this.id, session.id) && Intrinsics.areEqual(this.name, session.name) && Intrinsics.areEqual(this.created, session.created) && Intrinsics.areEqual(this.updated, session.updated) && Intrinsics.areEqual(this.tile_id, session.tile_id) && Intrinsics.areEqual(this.async_process, session.async_process) && this.chat_session_status == session.chat_session_status && Intrinsics.areEqual(this.activities, session.activities) && Intrinsics.areEqual(this.space_id, session.space_id) && this.chat_source == session.chat_source && Intrinsics.areEqual(this.chat_context, session.chat_context) && Intrinsics.areEqual(this.last_message_at, session.last_message_at) && Intrinsics.areEqual(this.last_read_at, session.last_read_at) && Intrinsics.areEqual(this.has_unread_messages, session.has_unread_messages) && Intrinsics.areEqual(this.metadata, session.metadata) && Intrinsics.areEqual(this.feedback, session.feedback);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.created;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str3 = this.tile_id;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.async_process;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ChatSessionStatus chatSessionStatus = this.chat_session_status;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (chatSessionStatus != null ? chatSessionStatus.hashCode() : 0)) * 37, 37, this.activities);
        String str4 = this.space_id;
        int hashCode8 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        Source source = this.chat_source;
        int hashCode9 = (hashCode8 + (source != null ? source.hashCode() : 0)) * 37;
        ChatContext chatContext = this.chat_context;
        int hashCode10 = (hashCode9 + (chatContext != null ? chatContext.hashCode() : 0)) * 37;
        Long l3 = this.last_message_at;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.last_read_at;
        int hashCode12 = (hashCode11 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Boolean bool2 = this.has_unread_messages;
        int hashCode13 = this.feedback.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((hashCode12 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37, this.metadata, 37);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.name = this.name;
        builder.created = this.created;
        builder.updated = this.updated;
        builder.tile_id = this.tile_id;
        builder.async_process = this.async_process;
        builder.chat_session_status = this.chat_session_status;
        builder.activities = this.activities;
        builder.space_id = this.space_id;
        builder.chat_source = this.chat_source;
        builder.chat_context = this.chat_context;
        builder.last_message_at = this.last_message_at;
        builder.last_read_at = this.last_read_at;
        builder.has_unread_messages = this.has_unread_messages;
        builder.metadata = this.metadata;
        builder.feedback = this.feedback;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        Long l = this.created;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created=", l, arrayList);
        }
        Long l2 = this.updated;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated=", l2, arrayList);
        }
        String str3 = this.tile_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "tile_id=", arrayList);
        }
        Boolean bool = this.async_process;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("async_process=", bool, arrayList);
        }
        ChatSessionStatus chatSessionStatus = this.chat_session_status;
        if (chatSessionStatus != null) {
            arrayList.add("chat_session_status=" + chatSessionStatus);
        }
        if (!this.activities.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("activities=", arrayList, this.activities);
        }
        String str4 = this.space_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "space_id=", arrayList);
        }
        Source source = this.chat_source;
        if (source != null) {
            arrayList.add("chat_source=" + source);
        }
        ChatContext chatContext = this.chat_context;
        if (chatContext != null) {
            arrayList.add("chat_context=" + chatContext);
        }
        Long l3 = this.last_message_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_message_at=", l3, arrayList);
        }
        Long l4 = this.last_read_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_read_at=", l4, arrayList);
        }
        Boolean bool2 = this.has_unread_messages;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_unread_messages=", bool2, arrayList);
        }
        if (!this.metadata.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("metadata=", this.metadata, arrayList);
        }
        if (!this.feedback.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("feedback=", arrayList, this.feedback);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Session{", "}", 0, null, null, 56);
    }
}
