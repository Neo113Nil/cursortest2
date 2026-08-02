package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DetailsPageComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageComponent> CREATOR;
    public final zzjz component;

    static {
        DetailsPageComponent$Companion$ADAPTER$1 detailsPageComponent$Companion$ADAPTER$1 = new DetailsPageComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageComponent.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageComponent", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageComponent(zzjz zzjzVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.component = zzjzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageComponent)) {
            return false;
        }
        DetailsPageComponent detailsPageComponent = (DetailsPageComponent) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageComponent.unknownFields()) && Intrinsics.areEqual(this.component, detailsPageComponent.component);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjz zzjzVar = this.component;
        int hashCode2 = hashCode + (zzjzVar != null ? zzjzVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(21);
        builder.local_buyer = this.component;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzjz zzjzVar = this.component;
        if (zzjzVar != null) {
            arrayList.add("component=" + zzjzVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageComponent{", "}", 0, null, null, 56);
    }
}
