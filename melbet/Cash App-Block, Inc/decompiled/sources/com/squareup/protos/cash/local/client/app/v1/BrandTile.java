package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandTile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BrandTile> CREATOR;
    public final LocalImage artwork_image;
    public final LocalColor background_color;
    public final LocalColor brand_card_outline_color;
    public final String brand_tile_client_route;
    public final String brand_token;
    public final LocalColor foreground_color;
    public final String name;

    static {
        BrandTile$Companion$ADAPTER$1 brandTile$Companion$ADAPTER$1 = new BrandTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandTile.class), "type.googleapis.com/squareup.cash.local.client.app.v1.BrandTile", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/market_tiles.proto");
        ADAPTER = brandTile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(brandTile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandTile(String str, String str2, LocalColor localColor, LocalColor localColor2, LocalImage localImage, String str3, LocalColor localColor3, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.brand_token = str;
        this.name = str2;
        this.foreground_color = localColor;
        this.background_color = localColor2;
        this.artwork_image = localImage;
        this.brand_tile_client_route = str3;
        this.brand_card_outline_color = localColor3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrandTile)) {
            return false;
        }
        BrandTile brandTile = (BrandTile) obj;
        return Intrinsics.areEqual(unknownFields(), brandTile.unknownFields()) && Intrinsics.areEqual(this.brand_token, brandTile.brand_token) && Intrinsics.areEqual(this.name, brandTile.name) && Intrinsics.areEqual(this.foreground_color, brandTile.foreground_color) && Intrinsics.areEqual(this.background_color, brandTile.background_color) && Intrinsics.areEqual(this.artwork_image, brandTile.artwork_image) && Intrinsics.areEqual(this.brand_tile_client_route, brandTile.brand_tile_client_route) && Intrinsics.areEqual(this.brand_card_outline_color, brandTile.brand_card_outline_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.brand_token), 37, this.name);
        LocalColor localColor = this.foreground_color;
        int hashCode = (m + (localColor != null ? localColor.hashCode() : 0)) * 37;
        LocalColor localColor2 = this.background_color;
        int hashCode2 = (hashCode + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
        LocalImage localImage = this.artwork_image;
        int hashCode3 = (hashCode2 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        String str = this.brand_tile_client_route;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        LocalColor localColor3 = this.brand_card_outline_color;
        int hashCode5 = hashCode4 + (localColor3 != null ? localColor3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(1);
        builder.customer_identifier = this.brand_token;
        builder.full_name = this.name;
        builder.cashtag = this.foreground_color;
        builder.added_at = this.background_color;
        builder.participant_type = this.artwork_image;
        builder.profile_photo_url = this.brand_tile_client_route;
        builder.aggregated_contribution_amount = this.brand_card_outline_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.name, "name=", arrayList);
        LocalColor localColor = this.foreground_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
        }
        LocalColor localColor2 = this.background_color;
        if (localColor2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
        }
        LocalImage localImage = this.artwork_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage, arrayList);
        }
        String str = this.brand_tile_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_tile_client_route=", arrayList);
        }
        LocalColor localColor3 = this.brand_card_outline_color;
        if (localColor3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrandTile{", "}", 0, null, null, 56);
    }
}
