package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "client_renderable", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "", "", "data", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StructuredContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StructuredContent> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientRenderable#ADAPTER", schemaIndex = 1, tag = 2)
    public final ClientRenderable client_renderable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", schemaIndex = 0, tag = 1)
    public final Map<String, ?> data;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/StructuredContent;", "<init>", "()V", "data", "", "", "client_renderable", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientRenderable;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ClientRenderable client_renderable;
        public Map<String, ?> data;

        @Override // com.squareup.wire.Message.Builder
        public StructuredContent build() {
            return new StructuredContent(this.data, this.client_renderable, buildUnknownFields());
        }

        public final Builder client_renderable(ClientRenderable client_renderable) {
            this.client_renderable = client_renderable;
            return this;
        }

        public final Builder data(Map<String, ?> data) {
            this.data = data;
            return this;
        }
    }

    static {
        StructuredContent$Companion$ADAPTER$1 structuredContent$Companion$ADAPTER$1 = new StructuredContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StructuredContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.StructuredContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = structuredContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(structuredContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StructuredContent(Map map, ClientRenderable clientRenderable, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.client_renderable = clientRenderable;
        this.data = (Map) TransactorKt.immutableCopyOfStruct(map, "data");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StructuredContent)) {
            return false;
        }
        StructuredContent structuredContent = (StructuredContent) obj;
        return Intrinsics.areEqual(unknownFields(), structuredContent.unknownFields()) && Intrinsics.areEqual(this.data, structuredContent.data) && Intrinsics.areEqual(this.client_renderable, structuredContent.client_renderable);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Map<String, ?> map = this.data;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 37;
        ClientRenderable clientRenderable = this.client_renderable;
        int hashCode3 = hashCode2 + (clientRenderable != null ? clientRenderable.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.data = this.data;
        builder.client_renderable = this.client_renderable;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> map = this.data;
        if (map != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("data=", map, arrayList);
        }
        ClientRenderable clientRenderable = this.client_renderable;
        if (clientRenderable != null) {
            arrayList.add("client_renderable=" + clientRenderable);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StructuredContent{", "}", 0, null, null, 56);
    }
}
