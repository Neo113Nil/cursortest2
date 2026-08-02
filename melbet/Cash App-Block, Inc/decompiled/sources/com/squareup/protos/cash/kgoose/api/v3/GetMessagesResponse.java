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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse$Builder;", "", "next_cursor", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "session_name", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo;", "token_usage_info", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "messages", "Ljava/util/List;", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "session_activities", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "feedback", "getFeedback$annotations", "()V", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMessagesResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Feedback#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<Feedback> feedback;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Message#ADAPTER", label = WireField.Label.REPEATED, redacted = true, schemaIndex = 0, tag = 1)
    public final List<Message> messages;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String next_cursor;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Activity#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<Activity> session_activities;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String session_name;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus#ADAPTER", schemaIndex = 2, tag = 3)
    public final ChatSessionStatus status;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.TokenUsageInfo#ADAPTER", schemaIndex = 5, tag = 6)
    public final TokenUsageInfo token_usage_info;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0016\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006H\u0007J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetMessagesResponse;", "<init>", "()V", "messages", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "next_cursor", "", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "session_name", "session_activities", "Lcom/squareup/protos/cash/kgoose/api/v3/Activity;", "token_usage_info", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo;", "feedback", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Feedback> feedback;
        public List<Message> messages;
        public String next_cursor;
        public List<Activity> session_activities;
        public String session_name;
        public ChatSessionStatus status;
        public TokenUsageInfo token_usage_info;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.messages = emptyList;
            this.session_activities = emptyList;
            this.feedback = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetMessagesResponse build() {
            return new GetMessagesResponse(this.messages, this.next_cursor, this.status, this.session_name, this.session_activities, this.token_usage_info, this.feedback, buildUnknownFields());
        }

        @Deprecated
        public final Builder feedback(List<Feedback> feedback) {
            feedback.getClass();
            TransactorKt.checkElementsNotNull(feedback);
            this.feedback = feedback;
            return this;
        }

        public final Builder messages(List<Message> messages) {
            messages.getClass();
            TransactorKt.checkElementsNotNull(messages);
            this.messages = messages;
            return this;
        }

        public final Builder next_cursor(String next_cursor) {
            this.next_cursor = next_cursor;
            return this;
        }

        public final Builder session_activities(List<Activity> session_activities) {
            session_activities.getClass();
            TransactorKt.checkElementsNotNull(session_activities);
            this.session_activities = session_activities;
            return this;
        }

        public final Builder session_name(String session_name) {
            this.session_name = session_name;
            return this;
        }

        public final Builder status(ChatSessionStatus status) {
            this.status = status;
            return this;
        }

        public final Builder token_usage_info(TokenUsageInfo token_usage_info) {
            this.token_usage_info = token_usage_info;
            return this;
        }
    }

    static {
        GetMessagesResponse$Companion$ADAPTER$1 getMessagesResponse$Companion$ADAPTER$1 = new GetMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMessagesResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = getMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMessagesResponse(List list, String str, ChatSessionStatus chatSessionStatus, String str2, List list2, TokenUsageInfo tokenUsageInfo, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.next_cursor = str;
        this.status = chatSessionStatus;
        this.session_name = str2;
        this.token_usage_info = tokenUsageInfo;
        this.messages = TransactorKt.immutableCopyOf("messages", list);
        this.session_activities = TransactorKt.immutableCopyOf("session_activities", list2);
        this.feedback = TransactorKt.immutableCopyOf("feedback", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMessagesResponse)) {
            return false;
        }
        GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.messages, getMessagesResponse.messages) && Intrinsics.areEqual(this.next_cursor, getMessagesResponse.next_cursor) && this.status == getMessagesResponse.status && Intrinsics.areEqual(this.session_name, getMessagesResponse.session_name) && Intrinsics.areEqual(this.session_activities, getMessagesResponse.session_activities) && Intrinsics.areEqual(this.token_usage_info, getMessagesResponse.token_usage_info) && Intrinsics.areEqual(this.feedback, getMessagesResponse.feedback);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.messages);
        String str = this.next_cursor;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        ChatSessionStatus chatSessionStatus = this.status;
        int hashCode2 = (hashCode + (chatSessionStatus != null ? chatSessionStatus.hashCode() : 0)) * 37;
        String str2 = this.session_name;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.session_activities);
        TokenUsageInfo tokenUsageInfo = this.token_usage_info;
        int hashCode3 = this.feedback.hashCode() + ((m2 + (tokenUsageInfo != null ? tokenUsageInfo.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.messages = this.messages;
        builder.next_cursor = this.next_cursor;
        builder.status = this.status;
        builder.session_name = this.session_name;
        builder.session_activities = this.session_activities;
        builder.token_usage_info = this.token_usage_info;
        builder.feedback = this.feedback;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.messages.isEmpty()) {
            arrayList.add("messages=██");
        }
        String str = this.next_cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_cursor=", arrayList);
        }
        ChatSessionStatus chatSessionStatus = this.status;
        if (chatSessionStatus != null) {
            arrayList.add("status=" + chatSessionStatus);
        }
        String str2 = this.session_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "session_name=", arrayList);
        }
        if (!this.session_activities.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("session_activities=", arrayList, this.session_activities);
        }
        TokenUsageInfo tokenUsageInfo = this.token_usage_info;
        if (tokenUsageInfo != null) {
            arrayList.add("token_usage_info=" + tokenUsageInfo);
        }
        if (!this.feedback.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("feedback=", arrayList, this.feedback);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMessagesResponse{", "}", 0, null, null, 56);
    }
}
