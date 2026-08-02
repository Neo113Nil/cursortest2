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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity$Builder;", "", "tool_request_id", "Ljava/lang/String;", "summary", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus;", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClientCardUpdateActivity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientCardUpdateActivity> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientCardUpdateStatus#ADAPTER", schemaIndex = 2, tag = 3)
    public final ClientCardUpdateStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String tool_request_id;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateActivity;", "<init>", "()V", "tool_request_id", "", "summary", "status", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientCardUpdateStatus;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ClientCardUpdateStatus status;
        public String summary;
        public String tool_request_id;

        @Override // com.squareup.wire.Message.Builder
        public ClientCardUpdateActivity build() {
            return new ClientCardUpdateActivity(this.tool_request_id, this.summary, this.status, buildUnknownFields());
        }

        public final Builder status(ClientCardUpdateStatus status) {
            this.status = status;
            return this;
        }

        public final Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public final Builder tool_request_id(String tool_request_id) {
            this.tool_request_id = tool_request_id;
            return this;
        }
    }

    static {
        ClientCardUpdateActivity$Companion$ADAPTER$1 clientCardUpdateActivity$Companion$ADAPTER$1 = new ClientCardUpdateActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientCardUpdateActivity.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ClientCardUpdateActivity", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/activity_messages.proto");
        ADAPTER = clientCardUpdateActivity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientCardUpdateActivity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCardUpdateActivity(String str, String str2, ClientCardUpdateStatus clientCardUpdateStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.tool_request_id = str;
        this.summary = str2;
        this.status = clientCardUpdateStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientCardUpdateActivity)) {
            return false;
        }
        ClientCardUpdateActivity clientCardUpdateActivity = (ClientCardUpdateActivity) obj;
        return Intrinsics.areEqual(unknownFields(), clientCardUpdateActivity.unknownFields()) && Intrinsics.areEqual(this.tool_request_id, clientCardUpdateActivity.tool_request_id) && Intrinsics.areEqual(this.summary, clientCardUpdateActivity.summary) && this.status == clientCardUpdateActivity.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.tool_request_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.summary;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ClientCardUpdateStatus clientCardUpdateStatus = this.status;
        int hashCode4 = hashCode3 + (clientCardUpdateStatus != null ? clientCardUpdateStatus.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.tool_request_id = this.tool_request_id;
        builder.summary = this.summary;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.tool_request_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tool_request_id=", arrayList);
        }
        String str2 = this.summary;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "summary=", arrayList);
        }
        ClientCardUpdateStatus clientCardUpdateStatus = this.status;
        if (clientCardUpdateStatus != null) {
            arrayList.add("status=" + clientCardUpdateStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientCardUpdateActivity{", "}", 0, null, null, 56);
    }
}
