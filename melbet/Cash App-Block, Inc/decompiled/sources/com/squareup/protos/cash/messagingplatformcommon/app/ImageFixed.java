package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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
public final class ImageFixed extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageFixed> CREATOR;
    public final String asset_url;
    public final Integer height;
    public final com.squareup.protos.cash.ui.Image image_asset;
    public final Integer width;

    static {
        ImageFixed$Companion$ADAPTER$1 imageFixed$Companion$ADAPTER$1 = new ImageFixed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageFixed.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.ImageFixed", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = imageFixed$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageFixed$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFixed(String str, Integer num, Integer num2, com.squareup.protos.cash.ui.Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_url = str;
        this.width = num;
        this.height = num2;
        this.image_asset = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageFixed)) {
            return false;
        }
        ImageFixed imageFixed = (ImageFixed) obj;
        return Intrinsics.areEqual(unknownFields(), imageFixed.unknownFields()) && Intrinsics.areEqual(this.asset_url, imageFixed.asset_url) && Intrinsics.areEqual(this.width, imageFixed.width) && Intrinsics.areEqual(this.height, imageFixed.height) && Intrinsics.areEqual(this.image_asset, imageFixed.image_asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.height;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        com.squareup.protos.cash.ui.Image image = this.image_asset;
        int hashCode5 = hashCode4 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(22, false);
        builder.id = this.asset_url;
        builder.last_4 = this.width;
        builder.gift_card_id = this.height;
        builder.gift_card_amount = this.image_asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset_url=", arrayList);
        }
        Integer num = this.width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("width=", num, arrayList);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("height=", num2, arrayList);
        }
        com.squareup.protos.cash.ui.Image image = this.image_asset;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image_asset=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageFixed{", "}", 0, null, null, 56);
    }
}
