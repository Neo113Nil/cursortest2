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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CallToolResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CallToolResponse$Builder;", "", "is_error", "Ljava/lang/Boolean;", "", "structured_content_json", "Ljava/lang/String;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "content", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallToolResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CallToolResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.UserContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<UserContent> content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean is_error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String structured_content_json;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CallToolResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CallToolResponse;", "<init>", "()V", "content", "", "Lcom/squareup/protos/cash/kgoose/api/v3/UserContent;", "is_error", "", "Ljava/lang/Boolean;", "structured_content_json", "", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/CallToolResponse$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<UserContent> content = EmptyList.INSTANCE;
        public Boolean is_error;
        public String structured_content_json;

        @Override // com.squareup.wire.Message.Builder
        public CallToolResponse build() {
            return new CallToolResponse(this.is_error, this.structured_content_json, this.content, buildUnknownFields());
        }

        public final Builder content(List<UserContent> content) {
            content.getClass();
            TransactorKt.checkElementsNotNull(content);
            this.content = content;
            return this;
        }

        public final Builder is_error(Boolean is_error) {
            this.is_error = is_error;
            return this;
        }

        public final Builder structured_content_json(String structured_content_json) {
            this.structured_content_json = structured_content_json;
            return this;
        }
    }

    static {
        CallToolResponse$Companion$ADAPTER$1 callToolResponse$Companion$ADAPTER$1 = new CallToolResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CallToolResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CallToolResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/tool_endpoint_messages.proto");
        ADAPTER = callToolResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(callToolResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToolResponse(Boolean bool, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.is_error = bool;
        this.structured_content_json = str;
        this.content = TransactorKt.immutableCopyOf("content", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CallToolResponse)) {
            return false;
        }
        CallToolResponse callToolResponse = (CallToolResponse) obj;
        return Intrinsics.areEqual(unknownFields(), callToolResponse.unknownFields()) && Intrinsics.areEqual(this.content, callToolResponse.content) && Intrinsics.areEqual(this.is_error, callToolResponse.is_error) && Intrinsics.areEqual(this.structured_content_json, callToolResponse.structured_content_json);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.content);
        Boolean bool = this.is_error;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.structured_content_json;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.content = this.content;
        builder.is_error = this.is_error;
        builder.structured_content_json = this.structured_content_json;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.content.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("content=", arrayList, this.content);
        }
        Boolean bool = this.is_error;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_error=", bool, arrayList);
        }
        String str = this.structured_content_json;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "structured_content_json=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CallToolResponse{", "}", 0, null, null, 56);
    }
}
