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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse$Builder;", "", "session_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessageStatus;", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessageStatus;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PushMessagesResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String session_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.PushMessageStatus#ADAPTER", schemaIndex = 1, tag = 2)
    public final PushMessageStatus status;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessagesResponse;", "<init>", "()V", "session_id", "", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/PushMessageStatus;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String session_id;
        public PushMessageStatus status;

        @Override // com.squareup.wire.Message.Builder
        public PushMessagesResponse build() {
            return new PushMessagesResponse(this.session_id, this.status, buildUnknownFields());
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }

        public final Builder status(PushMessageStatus status) {
            this.status = status;
            return this;
        }
    }

    static {
        PushMessagesResponse$Companion$ADAPTER$1 pushMessagesResponse$Companion$ADAPTER$1 = new PushMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PushMessagesResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.PushMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = pushMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pushMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushMessagesResponse(String str, PushMessageStatus pushMessageStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.session_id = str;
        this.status = pushMessageStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushMessagesResponse)) {
            return false;
        }
        PushMessagesResponse pushMessagesResponse = (PushMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), pushMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.session_id, pushMessagesResponse.session_id) && this.status == pushMessagesResponse.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.session_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        PushMessageStatus pushMessageStatus = this.status;
        int hashCode3 = hashCode2 + (pushMessageStatus != null ? pushMessageStatus.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.session_id = this.session_id;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.session_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "session_id=", arrayList);
        }
        PushMessageStatus pushMessageStatus = this.status;
        if (pushMessageStatus != null) {
            arrayList.add("status=" + pushMessageStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushMessagesResponse{", "}", 0, null, null, 56);
    }
}
