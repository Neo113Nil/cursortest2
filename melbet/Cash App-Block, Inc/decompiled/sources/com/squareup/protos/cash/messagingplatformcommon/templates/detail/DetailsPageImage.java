package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
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
public final class DetailsPageImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageImage> CREATOR;
    public final DetailsPageImageAsset image_asset;

    static {
        DetailsPageImage$Companion$ADAPTER$1 detailsPageImage$Companion$ADAPTER$1 = new DetailsPageImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageImage.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageImage", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageImage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageImage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageImage(DetailsPageImageAsset detailsPageImageAsset, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image_asset = detailsPageImageAsset;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageImage)) {
            return false;
        }
        DetailsPageImage detailsPageImage = (DetailsPageImage) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageImage.unknownFields()) && Intrinsics.areEqual(this.image_asset, detailsPageImage.image_asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DetailsPageImageAsset detailsPageImageAsset = this.image_asset;
        int hashCode2 = hashCode + (detailsPageImageAsset != null ? detailsPageImageAsset.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(22);
        builder.local_buyer = this.image_asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DetailsPageImageAsset detailsPageImageAsset = this.image_asset;
        if (detailsPageImageAsset != null) {
            arrayList.add("image_asset=" + detailsPageImageAsset);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageImage{", "}", 0, null, null, 56);
    }
}
