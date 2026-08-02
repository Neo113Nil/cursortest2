package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations$Builder;", "", "last_modified", "Ljava/lang/String;", "", "priority", "Ljava/lang/Double;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "audience", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResourceAnnotations extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResourceAnnotations> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Role#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Role> audience;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String last_modified;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 2, tag = 3)
    public final Double priority;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations;", "<init>", "()V", "audience", "", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "last_modified", "", "priority", "", "Ljava/lang/Double;", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/kgoose/api/v3/ResourceAnnotations$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<? extends Role> audience = EmptyList.INSTANCE;
        public String last_modified;
        public Double priority;

        public final Builder audience(List<? extends Role> audience) {
            audience.getClass();
            TransactorKt.checkElementsNotNull(audience);
            this.audience = audience;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ResourceAnnotations build() {
            return new ResourceAnnotations(this.audience, this.last_modified, this.priority, buildUnknownFields());
        }

        public final Builder last_modified(String last_modified) {
            this.last_modified = last_modified;
            return this;
        }

        public final Builder priority(Double priority) {
            this.priority = priority;
            return this;
        }
    }

    static {
        ResourceAnnotations$Companion$ADAPTER$1 resourceAnnotations$Companion$ADAPTER$1 = new ResourceAnnotations$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResourceAnnotations.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ResourceAnnotations", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = resourceAnnotations$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(resourceAnnotations$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceAnnotations(List list, String str, Double d, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.last_modified = str;
        this.priority = d;
        this.audience = TransactorKt.immutableCopyOf("audience", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceAnnotations)) {
            return false;
        }
        ResourceAnnotations resourceAnnotations = (ResourceAnnotations) obj;
        return Intrinsics.areEqual(unknownFields(), resourceAnnotations.unknownFields()) && Intrinsics.areEqual(this.audience, resourceAnnotations.audience) && Intrinsics.areEqual(this.last_modified, resourceAnnotations.last_modified) && Intrinsics.areEqual(this.priority, resourceAnnotations.priority);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.audience);
        String str = this.last_modified;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        Double d = this.priority;
        int hashCode2 = hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.audience = this.audience;
        builder.last_modified = this.last_modified;
        builder.priority = this.priority;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.audience.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("audience=", arrayList, this.audience);
        }
        String str = this.last_modified;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last_modified=", arrayList);
        }
        Double d = this.priority;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("priority=", d, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResourceAnnotations{", "}", 0, null, null, 56);
    }
}
