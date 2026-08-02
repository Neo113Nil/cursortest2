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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ListToolsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListToolsResponse$Builder;", "", "extension_name", "Ljava/lang/String;", "extension_description", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "tools", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListToolsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListToolsResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String extension_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String extension_name;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ToolConfig#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ToolConfig> tools;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ListToolsResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ListToolsResponse;", "<init>", "()V", "extension_name", "", "extension_description", "tools", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ToolConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String extension_description;
        public String extension_name;
        public List<ToolConfig> tools = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public ListToolsResponse build() {
            return new ListToolsResponse(this.extension_name, this.extension_description, this.tools, buildUnknownFields());
        }

        public final Builder extension_description(String extension_description) {
            this.extension_description = extension_description;
            return this;
        }

        public final Builder extension_name(String extension_name) {
            this.extension_name = extension_name;
            return this;
        }

        public final Builder tools(List<ToolConfig> tools) {
            tools.getClass();
            TransactorKt.checkElementsNotNull(tools);
            this.tools = tools;
            return this;
        }
    }

    static {
        ListToolsResponse$Companion$ADAPTER$1 listToolsResponse$Companion$ADAPTER$1 = new ListToolsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListToolsResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ListToolsResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/tool_endpoint_messages.proto");
        ADAPTER = listToolsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listToolsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListToolsResponse(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.extension_name = str;
        this.extension_description = str2;
        this.tools = TransactorKt.immutableCopyOf("tools", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListToolsResponse)) {
            return false;
        }
        ListToolsResponse listToolsResponse = (ListToolsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listToolsResponse.unknownFields()) && Intrinsics.areEqual(this.extension_name, listToolsResponse.extension_name) && Intrinsics.areEqual(this.extension_description, listToolsResponse.extension_description) && Intrinsics.areEqual(this.tools, listToolsResponse.tools);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.extension_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.extension_description;
        int hashCode3 = this.tools.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.extension_name = this.extension_name;
        builder.extension_description = this.extension_description;
        builder.tools = this.tools;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.extension_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "extension_name=", arrayList);
        }
        String str2 = this.extension_description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "extension_description=", arrayList);
        }
        if (!this.tools.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tools=", arrayList, this.tools);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListToolsResponse{", "}", 0, null, null, 56);
    }
}
