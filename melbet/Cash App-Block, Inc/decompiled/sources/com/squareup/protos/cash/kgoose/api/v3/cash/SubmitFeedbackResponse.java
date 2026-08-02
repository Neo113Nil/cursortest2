package com.squareup.protos.cash.kgoose.api.v3.cash;

import android.os.Parcelable;
import com.squareup.protos.cash.kgoose.api.v3.Feedback;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackResponse$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "feedback", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SubmitFeedbackResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitFeedbackResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Feedback#ADAPTER", schemaIndex = 0, tag = 1)
    public final Feedback feedback;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/SubmitFeedbackResponse;", "<init>", "()V", "feedback", "Lcom/squareup/protos/cash/kgoose/api/v3/Feedback;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Feedback feedback;

        @Override // com.squareup.wire.Message.Builder
        public SubmitFeedbackResponse build() {
            return new SubmitFeedbackResponse(this.feedback, buildUnknownFields());
        }

        public final Builder feedback(Feedback feedback) {
            this.feedback = feedback;
            return this;
        }
    }

    static {
        SubmitFeedbackResponse$Companion$ADAPTER$1 submitFeedbackResponse$Companion$ADAPTER$1 = new SubmitFeedbackResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitFeedbackResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.cash.SubmitFeedbackResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_feedback.proto");
        ADAPTER = submitFeedbackResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFeedbackResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFeedbackResponse(Feedback feedback, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.feedback = feedback;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitFeedbackResponse)) {
            return false;
        }
        SubmitFeedbackResponse submitFeedbackResponse = (SubmitFeedbackResponse) obj;
        return Intrinsics.areEqual(unknownFields(), submitFeedbackResponse.unknownFields()) && Intrinsics.areEqual(this.feedback, submitFeedbackResponse.feedback);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Feedback feedback = this.feedback;
        int hashCode2 = hashCode + (feedback != null ? feedback.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.feedback = this.feedback;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Feedback feedback = this.feedback;
        if (feedback != null) {
            arrayList.add("feedback=" + feedback);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFeedbackResponse{", "}", 0, null, null, 56);
    }
}
