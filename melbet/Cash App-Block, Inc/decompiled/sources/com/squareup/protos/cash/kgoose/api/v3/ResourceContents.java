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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u0003\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents$Builder;", "", "uri", "Ljava/lang/String;", "mime_type", "text", "blob", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations;", "annotations", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations;", "", "meta", "Ljava/util/Map;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceContents extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResourceContents> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ResourceAnnotations#ADAPTER", schemaIndex = 5, tag = 6)
    public final ResourceAnnotations annotations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
    public final String blob;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", schemaIndex = 0, tag = 1)
    public final Map<String, ?> meta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String mime_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String uri;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceContents;", "<init>", "()V", "meta", "", "", "uri", "mime_type", "text", "blob", "annotations", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ResourceAnnotations annotations;
        public String blob;
        public Map<String, ?> meta;
        public String mime_type;
        public String text;
        public String uri;

        public final Builder annotations(ResourceAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }

        public final Builder blob(String blob) {
            this.blob = blob;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ResourceContents build() {
            return new ResourceContents(this.meta, this.uri, this.mime_type, this.text, this.blob, this.annotations, buildUnknownFields());
        }

        public final Builder meta(Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }

        public final Builder mime_type(String mime_type) {
            this.mime_type = mime_type;
            return this;
        }

        public final Builder text(String text) {
            this.text = text;
            return this;
        }

        public final Builder uri(String uri) {
            this.uri = uri;
            return this;
        }
    }

    static {
        ResourceContents$Companion$ADAPTER$1 resourceContents$Companion$ADAPTER$1 = new ResourceContents$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResourceContents.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ResourceContents", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = resourceContents$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(resourceContents$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceContents(Map map, String str, String str2, String str3, String str4, ResourceAnnotations resourceAnnotations, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.uri = str;
        this.mime_type = str2;
        this.text = str3;
        this.blob = str4;
        this.annotations = resourceAnnotations;
        this.meta = (Map) TransactorKt.immutableCopyOfStruct(map, "meta");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceContents)) {
            return false;
        }
        ResourceContents resourceContents = (ResourceContents) obj;
        return Intrinsics.areEqual(unknownFields(), resourceContents.unknownFields()) && Intrinsics.areEqual(this.meta, resourceContents.meta) && Intrinsics.areEqual(this.uri, resourceContents.uri) && Intrinsics.areEqual(this.mime_type, resourceContents.mime_type) && Intrinsics.areEqual(this.text, resourceContents.text) && Intrinsics.areEqual(this.blob, resourceContents.blob) && Intrinsics.areEqual(this.annotations, resourceContents.annotations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Map<String, ?> map = this.meta;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 37;
        String str = this.uri;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.mime_type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.blob;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        ResourceAnnotations resourceAnnotations = this.annotations;
        int hashCode7 = hashCode6 + (resourceAnnotations != null ? resourceAnnotations.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.uri = this.uri;
        builder.mime_type = this.mime_type;
        builder.text = this.text;
        builder.blob = this.blob;
        builder.annotations = this.annotations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> map = this.meta;
        if (map != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("meta=", map, arrayList);
        }
        String str = this.uri;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "uri=", arrayList);
        }
        String str2 = this.mime_type;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "mime_type=", arrayList);
        }
        if (this.text != null) {
            arrayList.add("text=██");
        }
        if (this.blob != null) {
            arrayList.add("blob=██");
        }
        ResourceAnnotations resourceAnnotations = this.annotations;
        if (resourceAnnotations != null) {
            arrayList.add("annotations=" + resourceAnnotations);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResourceContents{", "}", 0, null, null, 56);
    }
}
