package com.squareup.protos.cash.kgoose.api.v3.cash;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.Message;
import com.squareup.protos.cash.kgoose.api.v3.Session;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesResponse$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "session", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "", "customer_token", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "messages", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSessionAndMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSessionAndMessagesResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String customer_token;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Message#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<Message> messages;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Session#ADAPTER", schemaIndex = 0, tag = 1)
    public final Session session;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/cash/GetSessionAndMessagesResponse;", "<init>", "()V", "session", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "messages", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Message;", "customer_token", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String customer_token;
        public List<com.squareup.protos.cash.kgoose.api.v3.Message> messages = EmptyList.INSTANCE;
        public Session session;

        @Override // com.squareup.wire.Message.Builder
        public GetSessionAndMessagesResponse build() {
            return new GetSessionAndMessagesResponse(this.session, this.messages, this.customer_token, buildUnknownFields());
        }

        public final Builder customer_token(String customer_token) {
            this.customer_token = customer_token;
            return this;
        }

        public final Builder messages(List<com.squareup.protos.cash.kgoose.api.v3.Message> messages) {
            messages.getClass();
            TransactorKt.checkElementsNotNull(messages);
            this.messages = messages;
            return this;
        }

        public final Builder session(Session session) {
            this.session = session;
            return this;
        }
    }

    static {
        GetSessionAndMessagesResponse$Companion$ADAPTER$1 getSessionAndMessagesResponse$Companion$ADAPTER$1 = new GetSessionAndMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSessionAndMessagesResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.cash.GetSessionAndMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/cash_service.proto");
        ADAPTER = getSessionAndMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSessionAndMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSessionAndMessagesResponse(Session session, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.session = session;
        this.customer_token = str;
        this.messages = TransactorKt.immutableCopyOf("messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSessionAndMessagesResponse)) {
            return false;
        }
        GetSessionAndMessagesResponse getSessionAndMessagesResponse = (GetSessionAndMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSessionAndMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.session, getSessionAndMessagesResponse.session) && Intrinsics.areEqual(this.messages, getSessionAndMessagesResponse.messages) && Intrinsics.areEqual(this.customer_token, getSessionAndMessagesResponse.customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Session session = this.session;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (session != null ? session.hashCode() : 0)) * 37, 37, this.messages);
        String str = this.customer_token;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.session = this.session;
        builder.messages = this.messages;
        builder.customer_token = this.customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Session session = this.session;
        if (session != null) {
            arrayList.add("session=" + session);
        }
        if (!this.messages.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("messages=", arrayList, this.messages);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSessionAndMessagesResponse{", "}", 0, null, null, 56);
    }
}
