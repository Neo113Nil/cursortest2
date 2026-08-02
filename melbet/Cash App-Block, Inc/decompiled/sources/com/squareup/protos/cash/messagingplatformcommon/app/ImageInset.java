package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFill;
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
public final class ImageInset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageInset> CREATOR;
    public final String asset_url;
    public final com.squareup.protos.cash.ui.Image image_asset;

    static {
        ImageInset$Companion$ADAPTER$1 imageInset$Companion$ADAPTER$1 = new ImageInset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageInset.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.ImageInset", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = imageInset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageInset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageInset(com.squareup.protos.cash.ui.Image image, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_url = str;
        this.image_asset = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageInset)) {
            return false;
        }
        ImageInset imageInset = (ImageInset) obj;
        return Intrinsics.areEqual(unknownFields(), imageInset.unknownFields()) && Intrinsics.areEqual(this.asset_url, imageInset.asset_url) && Intrinsics.areEqual(this.image_asset, imageInset.image_asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        com.squareup.protos.cash.ui.Image image = this.image_asset;
        int hashCode3 = hashCode2 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ImageFill.Builder builder = new ImageFill.Builder(2);
        builder.asset_url = this.asset_url;
        builder.image_asset = this.image_asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset_url=", arrayList);
        }
        com.squareup.protos.cash.ui.Image image = this.image_asset;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image_asset=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageInset{", "}", 0, null, null, 56);
    }
}
