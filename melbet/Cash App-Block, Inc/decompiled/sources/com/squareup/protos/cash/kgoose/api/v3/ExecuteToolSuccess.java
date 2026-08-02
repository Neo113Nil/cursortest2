package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess$Builder;", "", "client_route_url", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "content", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExecuteToolSuccess extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExecuteToolSuccess> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String client_route_url;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.UserContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<UserContent> content;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExecuteToolSuccess;", "<init>", "()V", "client_route_url", "", "content", "", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String client_route_url;
        public List<UserContent> content = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public ExecuteToolSuccess build() {
            return new ExecuteToolSuccess(this.client_route_url, this.content, buildUnknownFields());
        }

        public final Builder client_route_url(String client_route_url) {
            this.client_route_url = client_route_url;
            return this;
        }

        public final Builder content(List<UserContent> content) {
            content.getClass();
            TransactorKt.checkElementsNotNull(content);
            this.content = content;
            return this;
        }
    }

    static {
        ExecuteToolSuccess$Companion$ADAPTER$1 executeToolSuccess$Companion$ADAPTER$1 = new ExecuteToolSuccess$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExecuteToolSuccess.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ExecuteToolSuccess", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/tool_endpoint_messages.proto");
        ADAPTER = executeToolSuccess$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(executeToolSuccess$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteToolSuccess(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.client_route_url = str;
        this.content = TransactorKt.immutableCopyOf("content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExecuteToolSuccess)) {
            return false;
        }
        ExecuteToolSuccess executeToolSuccess = (ExecuteToolSuccess) obj;
        return Intrinsics.areEqual(unknownFields(), executeToolSuccess.unknownFields()) && Intrinsics.areEqual(this.client_route_url, executeToolSuccess.client_route_url) && Intrinsics.areEqual(this.content, executeToolSuccess.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.client_route_url;
        int hashCode2 = this.content.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.client_route_url = this.client_route_url;
        builder.content = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.client_route_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
        }
        if (!this.content.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("content=", arrayList, this.content);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExecuteToolSuccess{", "}", 0, null, null, 56);
    }
}
