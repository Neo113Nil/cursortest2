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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/FeedbackType;", "feedback_type", "Lcom/squareup/protos/cash/kgoose/api/v3/FeedbackType;", "", "issue_type", "Ljava/lang/String;", "comment", "message_id", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Feedback extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Feedback> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String comment;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.FeedbackType#ADAPTER", schemaIndex = 0, tag = 1)
    public final FeedbackType feedback_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String issue_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String message_id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/Feedback$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "<init>", "()V", "feedback_type", "Lcom/squareup/protos/cash/kgoose/api/v3/FeedbackType;", "issue_type", "", "comment", "message_id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String comment;
        public FeedbackType feedback_type;
        public String issue_type;
        public String message_id;

        @Override // com.squareup.wire.Message.Builder
        public Feedback build() {
            return new Feedback(this.feedback_type, this.issue_type, this.comment, this.message_id, buildUnknownFields());
        }

        public final Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public final Builder feedback_type(FeedbackType feedback_type) {
            this.feedback_type = feedback_type;
            return this;
        }

        public final Builder issue_type(String issue_type) {
            this.issue_type = issue_type;
            return this;
        }

        public final Builder message_id(String message_id) {
            this.message_id = message_id;
            return this;
        }
    }

    static {
        Feedback$Companion$ADAPTER$1 feedback$Companion$ADAPTER$1 = new Feedback$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Feedback.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.Feedback", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/feedback_messages.proto");
        ADAPTER = feedback$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(feedback$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feedback(FeedbackType feedbackType, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.feedback_type = feedbackType;
        this.issue_type = str;
        this.comment = str2;
        this.message_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) obj;
        return Intrinsics.areEqual(unknownFields(), feedback.unknownFields()) && this.feedback_type == feedback.feedback_type && Intrinsics.areEqual(this.issue_type, feedback.issue_type) && Intrinsics.areEqual(this.comment, feedback.comment) && Intrinsics.areEqual(this.message_id, feedback.message_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        FeedbackType feedbackType = this.feedback_type;
        int hashCode2 = (hashCode + (feedbackType != null ? feedbackType.hashCode() : 0)) * 37;
        String str = this.issue_type;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.comment;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.message_id;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.feedback_type = this.feedback_type;
        builder.issue_type = this.issue_type;
        builder.comment = this.comment;
        builder.message_id = this.message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        FeedbackType feedbackType = this.feedback_type;
        if (feedbackType != null) {
            arrayList.add("feedback_type=" + feedbackType);
        }
        String str = this.issue_type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "issue_type=", arrayList);
        }
        String str2 = this.comment;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "comment=", arrayList);
        }
        String str3 = this.message_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "message_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Feedback{", "}", 0, null, null, 56);
    }
}
