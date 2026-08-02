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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0016\u0018R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$Builder;", "", "id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "role", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "", "created", "Ljava/lang/Long;", "", "deleted", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo;", "llm_call_error_info", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "content", "Ljava/util/List;", "Companion", "Builder", "ErrorInfo", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Message extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Message> CREATOR;
    public static final boolean DEFAULT_DELETED = false;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MessageContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<MessageContent> content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long created;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean deleted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Message$ErrorInfo#ADAPTER", schemaIndex = 5, tag = 6)
    public final ErrorInfo llm_call_error_info;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Role#ADAPTER", schemaIndex = 1, tag = 2)
    public final Role role;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0014J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Message$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "<init>", "()V", "id", "", "role", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "created", "", "Ljava/lang/Long;", "content", "", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "deleted", "", "Ljava/lang/Boolean;", "llm_call_error_info", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/Message$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/Message$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<MessageContent> content = EmptyList.INSTANCE;
        public Long created;
        public Boolean deleted;
        public String id;
        public ErrorInfo llm_call_error_info;
        public Role role;

        @Override // com.squareup.wire.Message.Builder
        public Message build() {
            return new Message(this.id, this.role, this.created, this.content, this.deleted, this.llm_call_error_info, buildUnknownFields());
        }

        public final Builder content(List<MessageContent> content) {
            content.getClass();
            TransactorKt.checkElementsNotNull(content);
            this.content = content;
            return this;
        }

        public final Builder created(Long created) {
            this.created = created;
            return this;
        }

        public final Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder llm_call_error_info(ErrorInfo llm_call_error_info) {
            this.llm_call_error_info = llm_call_error_info;
            return this;
        }

        public final Builder role(Role role) {
            this.role = role;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo$Builder;", "", "is_error", "Ljava/lang/Boolean;", "", "cause", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ErrorInfo> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String cause;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
        public final Boolean is_error;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo;", "<init>", "()V", "is_error", "", "Ljava/lang/Boolean;", "cause", "", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/Message$ErrorInfo$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String cause;
            public Boolean is_error;

            @Override // com.squareup.wire.Message.Builder
            public ErrorInfo build() {
                return new ErrorInfo(this.cause, this.is_error, buildUnknownFields());
            }

            public final Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            public final Builder is_error(Boolean is_error) {
                this.is_error = is_error;
                return this;
            }
        }

        static {
            Message$ErrorInfo$Companion$ADAPTER$1 message$ErrorInfo$Companion$ADAPTER$1 = new Message$ErrorInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ErrorInfo.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Message.ErrorInfo", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
            ADAPTER = message$ErrorInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(message$ErrorInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorInfo(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.is_error = bool;
            this.cause = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ErrorInfo)) {
                return false;
            }
            ErrorInfo errorInfo = (ErrorInfo) obj;
            return Intrinsics.areEqual(unknownFields(), errorInfo.unknownFields()) && Intrinsics.areEqual(this.is_error, errorInfo.is_error) && Intrinsics.areEqual(this.cause, errorInfo.cause);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.is_error;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str = this.cause;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.is_error = this.is_error;
            builder.cause = this.cause;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.is_error;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_error=", bool, arrayList);
            }
            String str = this.cause;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cause=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        Message$Companion$ADAPTER$1 message$Companion$ADAPTER$1 = new Message$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Message.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Message", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = message$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(message$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Message(String str, Role role, Long l, List list, Boolean bool, ErrorInfo errorInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.role = role;
        this.created = l;
        this.deleted = bool;
        this.llm_call_error_info = errorInfo;
        this.content = TransactorKt.immutableCopyOf("content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return Intrinsics.areEqual(unknownFields(), message.unknownFields()) && Intrinsics.areEqual(this.id, message.id) && this.role == message.role && Intrinsics.areEqual(this.created, message.created) && Intrinsics.areEqual(this.content, message.content) && Intrinsics.areEqual(this.deleted, message.deleted) && Intrinsics.areEqual(this.llm_call_error_info, message.llm_call_error_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Role role = this.role;
        int hashCode3 = (hashCode2 + (role != null ? role.hashCode() : 0)) * 37;
        Long l = this.created;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.content);
        Boolean bool = this.deleted;
        int hashCode4 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ErrorInfo errorInfo = this.llm_call_error_info;
        int hashCode5 = hashCode4 + (errorInfo != null ? errorInfo.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.role = this.role;
        builder.created = this.created;
        builder.content = this.content;
        builder.deleted = this.deleted;
        builder.llm_call_error_info = this.llm_call_error_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Role role = this.role;
        if (role != null) {
            arrayList.add("role=" + role);
        }
        Long l = this.created;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created=", l, arrayList);
        }
        if (!this.content.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("content=", arrayList, this.content);
        }
        Boolean bool = this.deleted;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted=", bool, arrayList);
        }
        ErrorInfo errorInfo = this.llm_call_error_info;
        if (errorInfo != null) {
            arrayList.add("llm_call_error_info=" + errorInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Message{", "}", 0, null, null, 56);
    }
}
