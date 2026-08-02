package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HeroImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HeroImage> CREATOR;
    public final Color background_color;
    public final Image image;
    public final HeroImagePlacement placement;
    public final Double screen_fill_percent;

    public enum HeroImagePlacement implements WireEnum {
        HERO_IMAGE_PLACEMENT_UNSPECIFIED(0),
        HERO_IMAGE_PLACEMENT_FILL(1),
        HERO_IMAGE_PLACEMENT_CENTER(2);

        public static final HeroImage$HeroImagePlacement$Companion$ADAPTER$1 ADAPTER;
        public static final Action.Type.Companion Companion;
        public final int value;

        static {
            HeroImagePlacement heroImagePlacement = HERO_IMAGE_PLACEMENT_UNSPECIFIED;
            Companion = new Action.Type.Companion();
            ADAPTER = new HeroImage$HeroImagePlacement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HeroImagePlacement.class), Syntax.PROTO_2, heroImagePlacement);
        }

        HeroImagePlacement(int i) {
            this.value = i;
        }

        public static final HeroImagePlacement fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return HERO_IMAGE_PLACEMENT_UNSPECIFIED;
            }
            if (i == 1) {
                return HERO_IMAGE_PLACEMENT_FILL;
            }
            if (i != 2) {
                return null;
            }
            return HERO_IMAGE_PLACEMENT_CENTER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        HeroImage$Companion$ADAPTER$1 heroImage$Companion$ADAPTER$1 = new HeroImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroImage.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.HeroImage", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/details_page.proto");
        ADAPTER = heroImage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(heroImage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroImage(Image image, Double d, HeroImagePlacement heroImagePlacement, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.screen_fill_percent = d;
        this.placement = heroImagePlacement;
        this.background_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeroImage)) {
            return false;
        }
        HeroImage heroImage = (HeroImage) obj;
        return Intrinsics.areEqual(unknownFields(), heroImage.unknownFields()) && Intrinsics.areEqual(this.image, heroImage.image) && Intrinsics.areEqual(this.screen_fill_percent, heroImage.screen_fill_percent) && this.placement == heroImage.placement && Intrinsics.areEqual(this.background_color, heroImage.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Double d = this.screen_fill_percent;
        int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        HeroImagePlacement heroImagePlacement = this.placement;
        int hashCode4 = (hashCode3 + (heroImagePlacement != null ? heroImagePlacement.hashCode() : 0)) * 37;
        Color color = this.background_color;
        int hashCode5 = hashCode4 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(5, false);
        builder.postal_code = this.image;
        builder.last_four_digits = this.screen_fill_percent;
        builder.expiration = this.placement;
        builder.ciphertext_ = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Double d = this.screen_fill_percent;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("screen_fill_percent=", d, arrayList);
        }
        HeroImagePlacement heroImagePlacement = this.placement;
        if (heroImagePlacement != null) {
            arrayList.add("placement=" + heroImagePlacement);
        }
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeroImage{", "}", 0, null, null, 56);
    }
}
