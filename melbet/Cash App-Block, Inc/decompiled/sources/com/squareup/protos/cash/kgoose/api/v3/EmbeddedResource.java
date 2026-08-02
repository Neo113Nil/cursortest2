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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u0003\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents;", "resource", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents;", "", "type", "Ljava/lang/String;", "", "meta", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddedResource extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmbeddedResource> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", schemaIndex = 0, tag = 1)
    public final Map<String, ?> meta;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ResourceContents#ADAPTER", schemaIndex = 1, tag = 3)
    public final ResourceContents resource;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 5)
    public final String type;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/EmbeddedResource;", "<init>", "()V", "meta", "", "", "resource", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents;", "type", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Map<String, ?> meta;
        public ResourceContents resource;
        public String type;

        @Override // com.squareup.wire.Message.Builder
        public EmbeddedResource build() {
            return new EmbeddedResource(this.meta, this.resource, this.type, buildUnknownFields());
        }

        public final Builder meta(Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }

        public final Builder resource(ResourceContents resource) {
            this.resource = resource;
            return this;
        }

        public final Builder type(String type2) {
            this.type = type2;
            return this;
        }
    }

    static {
        EmbeddedResource$Companion$ADAPTER$1 embeddedResource$Companion$ADAPTER$1 = new EmbeddedResource$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmbeddedResource.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.EmbeddedResource", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = embeddedResource$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(embeddedResource$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedResource(Map map, ResourceContents resourceContents, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.resource = resourceContents;
        this.type = str;
        this.meta = (Map) TransactorKt.immutableCopyOfStruct(map, "meta");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddedResource)) {
            return false;
        }
        EmbeddedResource embeddedResource = (EmbeddedResource) obj;
        return Intrinsics.areEqual(unknownFields(), embeddedResource.unknownFields()) && Intrinsics.areEqual(this.meta, embeddedResource.meta) && Intrinsics.areEqual(this.resource, embeddedResource.resource) && Intrinsics.areEqual(this.type, embeddedResource.type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Map<String, ?> map = this.meta;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 37;
        ResourceContents resourceContents = this.resource;
        int hashCode3 = (hashCode2 + (resourceContents != null ? resourceContents.hashCode() : 0)) * 37;
        String str = this.type;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.resource = this.resource;
        builder.type = this.type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> map = this.meta;
        if (map != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("meta=", map, arrayList);
        }
        ResourceContents resourceContents = this.resource;
        if (resourceContents != null) {
            arrayList.add("resource=" + resourceContents);
        }
        String str = this.type;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "type=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmbeddedResource{", "}", 0, null, null, 56);
    }
}
