package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class TiledHeroImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TiledHeroImage> CREATOR;
    public final String caption;
    public final LocalImage hero_image;
    public final LocalMiniCard mini_card;

    static {
        TiledHeroImage$Companion$ADAPTER$1 tiledHeroImage$Companion$ADAPTER$1 = new TiledHeroImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TiledHeroImage.class), "type.googleapis.com/squareup.cash.local.client.v1.TiledHeroImage", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = tiledHeroImage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tiledHeroImage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiledHeroImage(LocalImage localImage, LocalMiniCard localMiniCard, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.hero_image = localImage;
        this.mini_card = localMiniCard;
        this.caption = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TiledHeroImage)) {
            return false;
        }
        TiledHeroImage tiledHeroImage = (TiledHeroImage) obj;
        return Intrinsics.areEqual(unknownFields(), tiledHeroImage.unknownFields()) && Intrinsics.areEqual(this.hero_image, tiledHeroImage.hero_image) && Intrinsics.areEqual(this.mini_card, tiledHeroImage.mini_card) && Intrinsics.areEqual(this.caption, tiledHeroImage.caption);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalImage localImage = this.hero_image;
        int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
        LocalMiniCard localMiniCard = this.mini_card;
        int hashCode3 = (hashCode2 + (localMiniCard != null ? localMiniCard.hashCode() : 0)) * 37;
        String str = this.caption;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(7, false);
        builder.advertisement_data = this.hero_image;
        builder.transmission_level = this.mini_card;
        builder.frequency = this.caption;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalImage localImage = this.hero_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("hero_image=", localImage, arrayList);
        }
        LocalMiniCard localMiniCard = this.mini_card;
        if (localMiniCard != null) {
            arrayList.add("mini_card=" + localMiniCard);
        }
        String str = this.caption;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "caption=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TiledHeroImage{", "}", 0, null, null, 56);
    }
}
