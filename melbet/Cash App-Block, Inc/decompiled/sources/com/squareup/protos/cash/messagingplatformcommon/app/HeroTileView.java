package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.PoolParticipant;
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
public final class HeroTileView extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HeroTileView> CREATOR;
    public final DetailsPageView details_page;
    public final Text eyebrow;
    public final Image image;
    public final Text subtitle;
    public final AppMessageAction tap_action;
    public final Double tile_ratio;
    public final Text title;

    static {
        HeroTileView$Companion$ADAPTER$1 heroTileView$Companion$ADAPTER$1 = new HeroTileView$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroTileView.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.HeroTileView", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = heroTileView$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(heroTileView$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroTileView(Image image, Double d, AppMessageAction appMessageAction, Text text, Text text2, Text text3, DetailsPageView detailsPageView, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.tile_ratio = d;
        this.tap_action = appMessageAction;
        this.eyebrow = text;
        this.title = text2;
        this.subtitle = text3;
        this.details_page = detailsPageView;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeroTileView)) {
            return false;
        }
        HeroTileView heroTileView = (HeroTileView) obj;
        return Intrinsics.areEqual(unknownFields(), heroTileView.unknownFields()) && Intrinsics.areEqual(this.image, heroTileView.image) && Intrinsics.areEqual(this.tile_ratio, heroTileView.tile_ratio) && Intrinsics.areEqual(this.tap_action, heroTileView.tap_action) && Intrinsics.areEqual(this.eyebrow, heroTileView.eyebrow) && Intrinsics.areEqual(this.title, heroTileView.title) && Intrinsics.areEqual(this.subtitle, heroTileView.subtitle) && Intrinsics.areEqual(this.details_page, heroTileView.details_page);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Double d = this.tile_ratio;
        int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        AppMessageAction appMessageAction = this.tap_action;
        int hashCode4 = (hashCode3 + (appMessageAction != null ? appMessageAction.hashCode() : 0)) * 37;
        Text text = this.eyebrow;
        int hashCode5 = (hashCode4 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.title;
        int hashCode6 = (hashCode5 + (text2 != null ? text2.hashCode() : 0)) * 37;
        Text text3 = this.subtitle;
        int hashCode7 = (hashCode6 + (text3 != null ? text3.hashCode() : 0)) * 37;
        DetailsPageView detailsPageView = this.details_page;
        int hashCode8 = hashCode7 + (detailsPageView != null ? detailsPageView.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(6);
        builder.customer_identifier = this.image;
        builder.full_name = this.tile_ratio;
        builder.profile_photo_url = this.tap_action;
        builder.cashtag = this.eyebrow;
        builder.added_at = this.title;
        builder.participant_type = this.subtitle;
        builder.aggregated_contribution_amount = this.details_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        Double d = this.tile_ratio;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tile_ratio=", d, arrayList);
        }
        AppMessageAction appMessageAction = this.tap_action;
        if (appMessageAction != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_action=", appMessageAction, arrayList);
        }
        Text text = this.eyebrow;
        if (text != null) {
            arrayList.add("eyebrow=" + text);
        }
        Text text2 = this.title;
        if (text2 != null) {
            arrayList.add("title=" + text2);
        }
        Text text3 = this.subtitle;
        if (text3 != null) {
            arrayList.add("subtitle=" + text3);
        }
        DetailsPageView detailsPageView = this.details_page;
        if (detailsPageView != null) {
            arrayList.add("details_page=" + detailsPageView);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeroTileView{", "}", 0, null, null, 56);
    }
}
