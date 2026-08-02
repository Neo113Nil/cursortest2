package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
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
public final class LocalMiniCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMiniCard> CREATOR;
    public final LocalImage artwork_image;
    public final LocalColor background_color;
    public final LocalColor brand_card_outline_color;
    public final LocalImage icon;

    static {
        LocalMiniCard$Companion$ADAPTER$1 localMiniCard$Companion$ADAPTER$1 = new LocalMiniCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMiniCard.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMiniCard", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = localMiniCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMiniCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMiniCard(LocalColor localColor, LocalImage localImage, LocalImage localImage2, LocalColor localColor2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.background_color = localColor;
        this.icon = localImage;
        this.artwork_image = localImage2;
        this.brand_card_outline_color = localColor2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMiniCard)) {
            return false;
        }
        LocalMiniCard localMiniCard = (LocalMiniCard) obj;
        return Intrinsics.areEqual(unknownFields(), localMiniCard.unknownFields()) && Intrinsics.areEqual(this.background_color, localMiniCard.background_color) && Intrinsics.areEqual(this.icon, localMiniCard.icon) && Intrinsics.areEqual(this.artwork_image, localMiniCard.artwork_image) && Intrinsics.areEqual(this.brand_card_outline_color, localMiniCard.brand_card_outline_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalColor localColor = this.background_color;
        int hashCode2 = (hashCode + (localColor != null ? localColor.hashCode() : 0)) * 37;
        LocalImage localImage = this.icon;
        int hashCode3 = (hashCode2 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        LocalImage localImage2 = this.artwork_image;
        int hashCode4 = (hashCode3 + (localImage2 != null ? localImage2.hashCode() : 0)) * 37;
        LocalColor localColor2 = this.brand_card_outline_color;
        int hashCode5 = hashCode4 + (localColor2 != null ? localColor2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(11, false);
        builder.id = this.background_color;
        builder.last_4 = this.icon;
        builder.gift_card_id = this.artwork_image;
        builder.gift_card_amount = this.brand_card_outline_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalColor localColor = this.background_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor, arrayList);
        }
        LocalImage localImage = this.icon;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", localImage, arrayList);
        }
        LocalImage localImage2 = this.artwork_image;
        if (localImage2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage2, arrayList);
        }
        LocalColor localColor2 = this.brand_card_outline_color;
        if (localColor2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMiniCard{", "}", 0, null, null, 56);
    }
}
