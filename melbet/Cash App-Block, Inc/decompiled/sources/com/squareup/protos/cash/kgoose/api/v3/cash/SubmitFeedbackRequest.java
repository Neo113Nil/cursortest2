package com.squareup.protos.cash.kgoose.api.v3.cash;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.FeedbackType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackRequest$Builder;", "", "session_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/FeedbackType;", "feedback_type", "Lcom/squareup/protos/cash/kgoose/api/v3/FeedbackType;", "issue_type", "comment", "message_id", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SubmitFeedbackRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitFeedbackRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String comment;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.FeedbackType#ADAPTER", schemaIndex = 1, tag = 2)
    public final FeedbackType feedback_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String issue_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String message_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String session_id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackRequest;", "<init>", "()V", "session_id", "", "feedback_type", "Lcom/squareup/protos/cash/kgoose/api/v3/FeedbackType;", "issue_type", "comment", "message_id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String comment;
        public FeedbackType feedback_type;
        public String issue_type;
        public String message_id;
        public String session_id;

        @Override // com.squareup.wire.Message.Builder
        public SubmitFeedbackRequest build() {
            return new SubmitFeedbackRequest(this.session_id, this.feedback_type, this.issue_type, this.comment, this.message_id, buildUnknownFields());
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

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitFeedbackRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.cash.SubmitFeedbackRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitFeedbackRequest((String) obj, (FeedbackType) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        try {
                            obj2 = FeedbackType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) obj;
                reverseProtoWriter.getClass();
                submitFeedbackRequest.getClass();
                reverseProtoWriter.writeBytes(submitFeedbackRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, submitFeedbackRequest.message_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, submitFeedbackRequest.comment);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, submitFeedbackRequest.issue_type);
                FeedbackType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, submitFeedbackRequest.feedback_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, submitFeedbackRequest.session_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) obj;
                submitFeedbackRequest.getClass();
                int size$okio = submitFeedbackRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, submitFeedbackRequest.message_id) + protoAdapter2.encodedSizeWithTag(4, submitFeedbackRequest.comment) + protoAdapter2.encodedSizeWithTag(3, submitFeedbackRequest.issue_type) + FeedbackType.ADAPTER.encodedSizeWithTag(2, submitFeedbackRequest.feedback_type) + protoAdapter2.encodedSizeWithTag(1, submitFeedbackRequest.session_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) obj;
                submitFeedbackRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = submitFeedbackRequest.session_id;
                FeedbackType feedbackType = submitFeedbackRequest.feedback_type;
                String str2 = submitFeedbackRequest.issue_type;
                String str3 = submitFeedbackRequest.comment;
                String str4 = submitFeedbackRequest.message_id;
                byteString.getClass();
                return new SubmitFeedbackRequest(str, feedbackType, str2, str3, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) obj;
                submitFeedbackRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, submitFeedbackRequest.session_id);
                FeedbackType.ADAPTER.encodeWithTag(protoWriter, 2, submitFeedbackRequest.feedback_type);
                protoAdapter2.encodeWithTag(protoWriter, 3, submitFeedbackRequest.issue_type);
                protoAdapter2.encodeWithTag(protoWriter, 4, submitFeedbackRequest.comment);
                protoAdapter2.encodeWithTag(protoWriter, 5, submitFeedbackRequest.message_id);
                protoWriter.writeBytes(submitFeedbackRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFeedbackRequest(String str, FeedbackType feedbackType, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session_id = str;
        this.feedback_type = feedbackType;
        this.issue_type = str2;
        this.comment = str3;
        this.message_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitFeedbackRequest)) {
            return false;
        }
        SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitFeedbackRequest.unknownFields()) && Intrinsics.areEqual(this.session_id, submitFeedbackRequest.session_id) && this.feedback_type == submitFeedbackRequest.feedback_type && Intrinsics.areEqual(this.issue_type, submitFeedbackRequest.issue_type) && Intrinsics.areEqual(this.comment, submitFeedbackRequest.comment) && Intrinsics.areEqual(this.message_id, submitFeedbackRequest.message_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        FeedbackType feedbackType = this.feedback_type;
        int hashCode3 = (hashCode2 + (feedbackType != null ? feedbackType.hashCode() : 0)) * 37;
        String str2 = this.issue_type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.comment;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.message_id;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.session_id = this.session_id;
        builder.feedback_type = this.feedback_type;
        builder.issue_type = this.issue_type;
        builder.comment = this.comment;
        builder.message_id = this.message_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        FeedbackType feedbackType = this.feedback_type;
        if (feedbackType != null) {
            arrayList.add("feedback_type=" + feedbackType);
        }
        String str2 = this.issue_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "issue_type=", arrayList);
        }
        String str3 = this.comment;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "comment=", arrayList);
        }
        String str4 = this.message_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "message_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFeedbackRequest{", "}", 0, null, null, 56);
    }
}
