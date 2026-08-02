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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse$Builder;", "", "next_cursor", "Ljava/lang/Long;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "sessions", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetUserSessionsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetUserSessionsResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long next_cursor;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Session#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Session> sessions;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse;", "<init>", "()V", "sessions", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Session;", "next_cursor", "", "Ljava/lang/Long;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long next_cursor;
        public List<Session> sessions = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public GetUserSessionsResponse build() {
            return new GetUserSessionsResponse(this.next_cursor, this.sessions, buildUnknownFields());
        }

        public final Builder next_cursor(Long next_cursor) {
            this.next_cursor = next_cursor;
            return this;
        }

        public final Builder sessions(List<Session> sessions) {
            sessions.getClass();
            TransactorKt.checkElementsNotNull(sessions);
            this.sessions = sessions;
            return this;
        }
    }

    static {
        GetUserSessionsResponse$Companion$ADAPTER$1 getUserSessionsResponse$Companion$ADAPTER$1 = new GetUserSessionsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetUserSessionsResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.GetUserSessionsResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/session_messages.proto");
        ADAPTER = getUserSessionsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getUserSessionsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserSessionsResponse(Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_cursor = l;
        this.sessions = TransactorKt.immutableCopyOf("sessions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserSessionsResponse)) {
            return false;
        }
        GetUserSessionsResponse getUserSessionsResponse = (GetUserSessionsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getUserSessionsResponse.unknownFields()) && Intrinsics.areEqual(this.sessions, getUserSessionsResponse.sessions) && Intrinsics.areEqual(this.next_cursor, getUserSessionsResponse.next_cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.sessions);
        Long l = this.next_cursor;
        int hashCode = m + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sessions = this.sessions;
        builder.next_cursor = this.next_cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.sessions.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sessions=", arrayList, this.sessions);
        }
        Long l = this.next_cursor;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_cursor=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetUserSessionsResponse{", "}", 0, null, null, 56);
    }
}
