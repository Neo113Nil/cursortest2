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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse$Builder;", "", "cancelled", "Ljava/lang/Boolean;", "", "message", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "session_status", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CancelLastUserMessageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CancelLastUserMessageResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean cancelled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String message;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus#ADAPTER", schemaIndex = 2, tag = 3)
    public final ChatSessionStatus session_status;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse;", "<init>", "()V", "cancelled", "", "Ljava/lang/Boolean;", "message", "", "session_status", "Lcom/squareup/protos/cash/kgoose/api/v3/ChatSessionStatus;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/CancelLastUserMessageResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Boolean cancelled;
        public String message;
        public ChatSessionStatus session_status;

        @Override // com.squareup.wire.Message.Builder
        public CancelLastUserMessageResponse build() {
            return new CancelLastUserMessageResponse(this.cancelled, this.message, this.session_status, buildUnknownFields());
        }

        public final Builder cancelled(Boolean cancelled) {
            this.cancelled = cancelled;
            return this;
        }

        public final Builder message(String message) {
            this.message = message;
            return this;
        }

        public final Builder session_status(ChatSessionStatus session_status) {
            this.session_status = session_status;
            return this;
        }
    }

    static {
        CancelLastUserMessageResponse$Companion$ADAPTER$1 cancelLastUserMessageResponse$Companion$ADAPTER$1 = new CancelLastUserMessageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CancelLastUserMessageResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CancelLastUserMessageResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = cancelLastUserMessageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cancelLastUserMessageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelLastUserMessageResponse(Boolean bool, String str, ChatSessionStatus chatSessionStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cancelled = bool;
        this.message = str;
        this.session_status = chatSessionStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelLastUserMessageResponse)) {
            return false;
        }
        CancelLastUserMessageResponse cancelLastUserMessageResponse = (CancelLastUserMessageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), cancelLastUserMessageResponse.unknownFields()) && Intrinsics.areEqual(this.cancelled, cancelLastUserMessageResponse.cancelled) && Intrinsics.areEqual(this.message, cancelLastUserMessageResponse.message) && this.session_status == cancelLastUserMessageResponse.session_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.cancelled;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.message;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ChatSessionStatus chatSessionStatus = this.session_status;
        int hashCode4 = hashCode3 + (chatSessionStatus != null ? chatSessionStatus.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cancelled = this.cancelled;
        builder.message = this.message;
        builder.session_status = this.session_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.cancelled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cancelled=", bool, arrayList);
        }
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        ChatSessionStatus chatSessionStatus = this.session_status;
        if (chatSessionStatus != null) {
            arrayList.add("session_status=" + chatSessionStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CancelLastUserMessageResponse{", "}", 0, null, null, 56);
    }
}
