package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.local.client.v1.POSLocalCashRedemption;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.franklin.ui.UiIdvState;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetEditorialResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/GiftCard$Builder;", "Builder", "ShareLinkInfo", "EditorialContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetEditorialResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEditorialResponse> CREATOR;
    public final List contents;
    public final ShareLinkInfo share_link_info;
    public final String share_link_url;
    public final String title;

    public final class EditorialContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EditorialContent> CREATOR;
        public final zzic content_type;

        public final class BrandCarousel extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BrandCarousel> CREATOR;
            public final LocalBrand brand;
            public final String brand_profile_url;
            public final String brand_token;
            public final List carousel_images;
            public final String category;
            public final String description;
            public final LocalLocationSummary location;
            public final String location_token;
            public final String name;
            public final String share_url;

            public final class CarouselImage extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<CarouselImage> CREATOR;
                public final String client_route_url;
                public final LocalImage image;
                public final String overlay_text;

                static {
                    GetEditorialResponse$EditorialContent$BrandCarousel$CarouselImage$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$BrandCarousel$CarouselImage$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$BrandCarousel$CarouselImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CarouselImage.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.BrandCarousel.CarouselImage", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                    ADAPTER = getEditorialResponse$EditorialContent$BrandCarousel$CarouselImage$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$BrandCarousel$CarouselImage$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CarouselImage(LocalImage localImage, String str, String str2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.image = localImage;
                    this.client_route_url = str;
                    this.overlay_text = str2;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CarouselImage)) {
                        return false;
                    }
                    CarouselImage carouselImage = (CarouselImage) obj;
                    return Intrinsics.areEqual(unknownFields(), carouselImage.unknownFields()) && Intrinsics.areEqual(this.image, carouselImage.image) && Intrinsics.areEqual(this.client_route_url, carouselImage.client_route_url) && Intrinsics.areEqual(this.overlay_text, carouselImage.overlay_text);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalImage localImage = this.image;
                    int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
                    String str = this.client_route_url;
                    int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.overlay_text;
                    int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    POSLocalCashRedemption.Coupon.Builder builder = new POSLocalCashRedemption.Coupon.Builder(1);
                    builder.icon = this.image;
                    builder.title = this.client_route_url;
                    builder.code = this.overlay_text;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalImage localImage = this.image;
                    if (localImage != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
                    }
                    String str = this.client_route_url;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
                    }
                    String str2 = this.overlay_text;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "overlay_text=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "CarouselImage{", "}", 0, null, null, 56);
                }
            }

            static {
                GetEditorialResponse$EditorialContent$BrandCarousel$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$BrandCarousel$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$BrandCarousel$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandCarousel.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.BrandCarousel", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                ADAPTER = getEditorialResponse$EditorialContent$BrandCarousel$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$BrandCarousel$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BrandCarousel(LocalBrand localBrand, String str, List list, String str2, LocalLocationSummary localLocationSummary, String str3, String str4, String str5, String str6, String str7, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.brand = localBrand;
                this.brand_profile_url = str;
                this.name = str2;
                this.location = localLocationSummary;
                this.category = str3;
                this.description = str4;
                this.brand_token = str5;
                this.location_token = str6;
                this.share_url = str7;
                this.carousel_images = TransactorKt.immutableCopyOf("carousel_images", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof BrandCarousel)) {
                    return false;
                }
                BrandCarousel brandCarousel = (BrandCarousel) obj;
                return Intrinsics.areEqual(unknownFields(), brandCarousel.unknownFields()) && Intrinsics.areEqual(this.brand, brandCarousel.brand) && Intrinsics.areEqual(this.brand_profile_url, brandCarousel.brand_profile_url) && Intrinsics.areEqual(this.carousel_images, brandCarousel.carousel_images) && Intrinsics.areEqual(this.name, brandCarousel.name) && Intrinsics.areEqual(this.location, brandCarousel.location) && Intrinsics.areEqual(this.category, brandCarousel.category) && Intrinsics.areEqual(this.description, brandCarousel.description) && Intrinsics.areEqual(this.brand_token, brandCarousel.brand_token) && Intrinsics.areEqual(this.location_token, brandCarousel.location_token) && Intrinsics.areEqual(this.share_url, brandCarousel.share_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalBrand localBrand = this.brand;
                int hashCode2 = (hashCode + (localBrand != null ? localBrand.hashCode() : 0)) * 37;
                String str = this.brand_profile_url;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.carousel_images);
                String str2 = this.name;
                int hashCode3 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
                LocalLocationSummary localLocationSummary = this.location;
                int hashCode4 = (hashCode3 + (localLocationSummary != null ? localLocationSummary.hashCode() : 0)) * 37;
                String str3 = this.category;
                int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.description;
                int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
                String str5 = this.brand_token;
                int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
                String str6 = this.location_token;
                int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
                String str7 = this.share_url;
                int hashCode9 = hashCode8 + (str7 != null ? str7.hashCode() : 0);
                this.hashCode = hashCode9;
                return hashCode9;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CashInRequest.Builder builder = new CashInRequest.Builder(7);
                builder.request_context = this.brand;
                builder.external_id = this.brand_profile_url;
                builder.source = this.carousel_images;
                builder.passcode_token = this.name;
                builder.target = this.location;
                builder.external_client_transfer_token = this.category;
                builder.amount = this.description;
                builder.call_context = this.brand_token;
                builder.forwarded_call_context = this.location_token;
                builder.client_verified_digital_wallet = this.share_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalBrand localBrand = this.brand;
                if (localBrand != null) {
                    arrayList.add("brand=" + localBrand);
                }
                String str = this.brand_profile_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_profile_url=", arrayList);
                }
                List list = this.carousel_images;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("carousel_images=", arrayList, list);
                }
                String str2 = this.name;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
                }
                LocalLocationSummary localLocationSummary = this.location;
                if (localLocationSummary != null) {
                    arrayList.add("location=" + localLocationSummary);
                }
                String str3 = this.category;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "category=", arrayList);
                }
                String str4 = this.description;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "description=", arrayList);
                }
                String str5 = this.brand_token;
                if (str5 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "brand_token=", arrayList);
                }
                String str6 = this.location_token;
                if (str6 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "location_token=", arrayList);
                }
                String str7 = this.share_url;
                if (str7 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "share_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BrandCarousel{", "}", 0, null, null, 56);
            }
        }

        public final class Image extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Image> CREATOR;
            public final LocalImage image;
            public final Style style;

            public enum Style implements WireEnum {
                STYLE_UNSPECIFIED(0),
                STYLE_HERO(1);

                public static final GetEditorialResponse$EditorialContent$Image$Style$Companion$ADAPTER$1 ADAPTER;
                public static final FeeType.Companion Companion;
                public final int value;

                static {
                    Style style = STYLE_UNSPECIFIED;
                    Companion = new FeeType.Companion();
                    ADAPTER = new GetEditorialResponse$EditorialContent$Image$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, style);
                }

                Style(int i) {
                    this.value = i;
                }

                public static final Style fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return STYLE_UNSPECIFIED;
                    }
                    if (i != 1) {
                        return null;
                    }
                    return STYLE_HERO;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            static {
                GetEditorialResponse$EditorialContent$Image$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Image$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Image$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Image.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Image", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                ADAPTER = getEditorialResponse$EditorialContent$Image$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Image$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(LocalImage localImage, Style style, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.image = localImage;
                this.style = style;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Intrinsics.areEqual(unknownFields(), image.unknownFields()) && Intrinsics.areEqual(this.image, image.image) && this.style == image.style;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalImage localImage = this.image;
                int hashCode2 = (hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37;
                Style style = this.style;
                int hashCode3 = hashCode2 + (style != null ? style.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                InputValue.Builder builder = new InputValue.Builder(9);
                builder.input_id = this.image;
                builder.value = this.style;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalImage localImage = this.image;
                if (localImage != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
                }
                Style style = this.style;
                if (style != null) {
                    arrayList.add("style=" + style);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Image{", "}", 0, null, null, 56);
            }
        }

        public final class Preview extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Preview> CREATOR;
            public final List cards;

            public final class Card extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Card> CREATOR;
                public final String client_route_url;
                public final LocalImage image;
                public final List texts;

                static {
                    GetEditorialResponse$EditorialContent$Preview$Card$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Preview$Card$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Preview$Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Card.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Preview.Card", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                    ADAPTER = getEditorialResponse$EditorialContent$Preview$Card$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Preview$Card$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Card(LocalImage localImage, List list, String str, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.image = localImage;
                    this.client_route_url = str;
                    this.texts = TransactorKt.immutableCopyOf("texts", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Card)) {
                        return false;
                    }
                    Card card = (Card) obj;
                    return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.image, card.image) && Intrinsics.areEqual(this.texts, card.texts) && Intrinsics.areEqual(this.client_route_url, card.client_route_url);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    LocalImage localImage = this.image;
                    int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37, 37, this.texts);
                    String str = this.client_route_url;
                    int hashCode2 = m + (str != null ? str.hashCode() : 0);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Row.Builder builder = new Row.Builder(1);
                    builder.image = this.image;
                    builder.texts = this.texts;
                    builder.client_route_url = this.client_route_url;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    LocalImage localImage = this.image;
                    if (localImage != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
                    }
                    List list = this.texts;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("texts=", arrayList, list);
                    }
                    String str = this.client_route_url;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
                }
            }

            static {
                GetEditorialResponse$EditorialContent$Preview$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Preview$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Preview$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Preview.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Preview", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                ADAPTER = getEditorialResponse$EditorialContent$Preview$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Preview$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Preview(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.cards = TransactorKt.immutableCopyOf("cards", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Preview)) {
                    return false;
                }
                Preview preview = (Preview) obj;
                return Intrinsics.areEqual(unknownFields(), preview.unknownFields()) && Intrinsics.areEqual(this.cards, preview.cards);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.cards.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                MoneyTab.Builder builder = new MoneyTab.Builder(7, false);
                builder.applets = this.cards;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                List list = this.cards;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("cards=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Preview{", "}", 0, null, null, 56);
            }
        }

        public final class Row extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Row> CREATOR;
            public final String client_route_url;
            public final LocalImage image;
            public final List texts;

            public final class Builder extends Message.Builder {
                public final /* synthetic */ int $r8$classId;
                public String client_route_url;
                public LocalImage image;
                public List texts;

                public /* synthetic */ Builder(int i) {
                    this.$r8$classId = i;
                }

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    switch (this.$r8$classId) {
                        case 0:
                            return new Row(this.image, this.texts, this.client_route_url, buildUnknownFields());
                        default:
                            return new Preview.Card(this.image, this.texts, this.client_route_url, buildUnknownFields());
                    }
                }
            }

            static {
                GetEditorialResponse$EditorialContent$Row$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Row$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Row", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                ADAPTER = getEditorialResponse$EditorialContent$Row$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Row$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Row(LocalImage localImage, List list, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.image = localImage;
                this.client_route_url = str;
                this.texts = TransactorKt.immutableCopyOf("texts", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Row)) {
                    return false;
                }
                Row row = (Row) obj;
                return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.image, row.image) && Intrinsics.areEqual(this.texts, row.texts) && Intrinsics.areEqual(this.client_route_url, row.client_route_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalImage localImage = this.image;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localImage != null ? localImage.hashCode() : 0)) * 37, 37, this.texts);
                String str = this.client_route_url;
                int hashCode2 = m + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(0);
                builder.image = this.image;
                builder.texts = this.texts;
                builder.client_route_url = this.client_route_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                LocalImage localImage = this.image;
                if (localImage != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
                }
                List list = this.texts;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("texts=", arrayList, list);
                }
                String str = this.client_route_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
            }
        }

        public final class Spacer extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Spacer> CREATOR;
            public final Boolean divider;
            public final Long height;

            static {
                GetEditorialResponse$EditorialContent$Spacer$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Spacer$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Spacer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Spacer.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Spacer", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                ADAPTER = getEditorialResponse$EditorialContent$Spacer$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Spacer$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Spacer(Boolean bool, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.height = l;
                this.divider = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Spacer)) {
                    return false;
                }
                Spacer spacer = (Spacer) obj;
                return Intrinsics.areEqual(unknownFields(), spacer.unknownFields()) && Intrinsics.areEqual(this.height, spacer.height) && Intrinsics.areEqual(this.divider, spacer.divider);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.height;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                Boolean bool = this.divider;
                int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiIdvState.Builder builder = new UiIdvState.Builder(2);
                builder.can_attempt_electronic_idv_at = this.height;
                builder.has_verified_identity = this.divider;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.height;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("height=", l, arrayList);
                }
                Boolean bool = this.divider;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("divider=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Spacer{", "}", 0, null, null, 56);
            }
        }

        public final class Text extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Text> CREATOR;
            public final Alignment alignment;
            public final LocalColor color;
            public final Font font;
            public final Long line_limit;
            public final String markdown_text;

            public enum Alignment implements WireEnum {
                ALIGNMENT_UNSPECIFIED(0),
                ALIGNMENT_LEFT(1),
                ALIGNMENT_CENTER(2),
                ALIGNMENT_RIGHT(3);

                public static final GetEditorialResponse$EditorialContent$Text$Alignment$Companion$ADAPTER$1 ADAPTER;
                public static final ContactAliasType.Companion Companion;
                public final int value;

                static {
                    Alignment alignment = ALIGNMENT_UNSPECIFIED;
                    Companion = new ContactAliasType.Companion();
                    ADAPTER = new GetEditorialResponse$EditorialContent$Text$Alignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Alignment.class), Syntax.PROTO_2, alignment);
                }

                Alignment(int i) {
                    this.value = i;
                }

                public static final Alignment fromValue(int i) {
                    Companion.getClass();
                    if (i == 0) {
                        return ALIGNMENT_UNSPECIFIED;
                    }
                    if (i == 1) {
                        return ALIGNMENT_LEFT;
                    }
                    if (i == 2) {
                        return ALIGNMENT_CENTER;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return ALIGNMENT_RIGHT;
                }

                @Override // com.squareup.wire.WireEnum
                public final int getValue() {
                    return this.value;
                }
            }

            public final class Font extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Font> CREATOR;
                public final Long size;
                public final Weight weight;

                public enum Weight implements WireEnum {
                    WEIGHT_UNSPECIFIED(0),
                    WEIGHT_REGULAR(1),
                    WEIGHT_MEDIUM(2),
                    WEIGHT_SEMIBOLD(3),
                    WEIGHT_BOLD(4);

                    public static final GetEditorialResponse$EditorialContent$Text$Font$Weight$Companion$ADAPTER$1 ADAPTER;
                    public static final RetailerType.Companion Companion;
                    public final int value;

                    static {
                        Weight weight = WEIGHT_UNSPECIFIED;
                        Companion = new RetailerType.Companion();
                        ADAPTER = new GetEditorialResponse$EditorialContent$Text$Font$Weight$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Weight.class), Syntax.PROTO_2, weight);
                    }

                    Weight(int i) {
                        this.value = i;
                    }

                    public static final Weight fromValue(int i) {
                        Companion.getClass();
                        return RetailerType.Companion.m3903fromValue(i);
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return this.value;
                    }
                }

                static {
                    GetEditorialResponse$EditorialContent$Text$Font$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Text$Font$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Text$Font$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Font.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Text.Font", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                    ADAPTER = getEditorialResponse$EditorialContent$Text$Font$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Text$Font$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Font(Long l, Weight weight, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.size = l;
                    this.weight = weight;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Font)) {
                        return false;
                    }
                    Font font = (Font) obj;
                    return Intrinsics.areEqual(unknownFields(), font.unknownFields()) && Intrinsics.areEqual(this.size, font.size) && this.weight == font.weight;
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Long l = this.size;
                    int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                    Weight weight = this.weight;
                    int hashCode3 = hashCode2 + (weight != null ? weight.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    InputValue.Builder builder = new InputValue.Builder(10);
                    builder.input_id = this.size;
                    builder.value = this.weight;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Long l = this.size;
                    if (l != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("size=", l, arrayList);
                    }
                    Weight weight = this.weight;
                    if (weight != null) {
                        arrayList.add("weight=" + weight);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Font{", "}", 0, null, null, 56);
                }
            }

            static {
                GetEditorialResponse$EditorialContent$Text$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Text$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent.Text", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
                ADAPTER = getEditorialResponse$EditorialContent$Text$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Text$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(String str, Alignment alignment, Font font, LocalColor localColor, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.markdown_text = str;
                this.alignment = alignment;
                this.font = font;
                this.color = localColor;
                this.line_limit = l;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.markdown_text, text.markdown_text) && this.alignment == text.alignment && Intrinsics.areEqual(this.font, text.font) && Intrinsics.areEqual(this.color, text.color) && Intrinsics.areEqual(this.line_limit, text.line_limit);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.markdown_text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Alignment alignment = this.alignment;
                int hashCode3 = (hashCode2 + (alignment != null ? alignment.hashCode() : 0)) * 37;
                Font font = this.font;
                int hashCode4 = (hashCode3 + (font != null ? font.hashCode() : 0)) * 37;
                LocalColor localColor = this.color;
                int hashCode5 = (hashCode4 + (localColor != null ? localColor.hashCode() : 0)) * 37;
                Long l = this.line_limit;
                int hashCode6 = hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                BrandBanner.Builder builder = new BrandBanner.Builder(3);
                builder.icon = this.markdown_text;
                builder.title = this.alignment;
                builder.subtitle = this.font;
                builder.icon_background_color = this.color;
                builder.action = this.line_limit;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.markdown_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "markdown_text=", arrayList);
                }
                Alignment alignment = this.alignment;
                if (alignment != null) {
                    arrayList.add("alignment=" + alignment);
                }
                Font font = this.font;
                if (font != null) {
                    arrayList.add("font=" + font);
                }
                LocalColor localColor = this.color;
                if (localColor != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("color=", localColor, arrayList);
                }
                Long l = this.line_limit;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("line_limit=", l, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
            }
        }

        static {
            GetEditorialResponse$EditorialContent$Companion$ADAPTER$1 getEditorialResponse$EditorialContent$Companion$ADAPTER$1 = new GetEditorialResponse$EditorialContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EditorialContent.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.EditorialContent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
            ADAPTER = getEditorialResponse$EditorialContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$EditorialContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditorialContent(zzic zzicVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content_type = zzicVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EditorialContent)) {
                return false;
            }
            EditorialContent editorialContent = (EditorialContent) obj;
            return Intrinsics.areEqual(unknownFields(), editorialContent.unknownFields()) && Intrinsics.areEqual(this.content_type, editorialContent.content_type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzic zzicVar = this.content_type;
            int hashCode2 = hashCode + (zzicVar != null ? zzicVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LocalBuyer.Builder builder = new LocalBuyer.Builder(2);
            builder.local_buyer = this.content_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzic zzicVar = this.content_type;
            if (zzicVar != null) {
                arrayList.add("content_type=" + zzicVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EditorialContent{", "}", 0, null, null, 56);
        }
    }

    public final class ShareLinkInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShareLinkInfo> CREATOR;
        public final String subtitle;
        public final String thumbnail_url;
        public final String title;
        public final String url;

        static {
            GetEditorialResponse$ShareLinkInfo$Companion$ADAPTER$1 getEditorialResponse$ShareLinkInfo$Companion$ADAPTER$1 = new GetEditorialResponse$ShareLinkInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShareLinkInfo.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse.ShareLinkInfo", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
            ADAPTER = getEditorialResponse$ShareLinkInfo$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$ShareLinkInfo$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareLinkInfo(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
            this.title = str2;
            this.subtitle = str3;
            this.thumbnail_url = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareLinkInfo)) {
                return false;
            }
            ShareLinkInfo shareLinkInfo = (ShareLinkInfo) obj;
            return Intrinsics.areEqual(unknownFields(), shareLinkInfo.unknownFields()) && Intrinsics.areEqual(this.url, shareLinkInfo.url) && Intrinsics.areEqual(this.title, shareLinkInfo.title) && Intrinsics.areEqual(this.subtitle, shareLinkInfo.subtitle) && Intrinsics.areEqual(this.thumbnail_url, shareLinkInfo.thumbnail_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.subtitle;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.thumbnail_url;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(5);
            builder.customer_token = this.url;
            builder.full_name = this.title;
            builder.profile_photo_url = this.subtitle;
            builder.cashtag = this.thumbnail_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            String str2 = this.title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
            }
            String str3 = this.subtitle;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
            }
            String str4 = this.thumbnail_url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "thumbnail_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShareLinkInfo{", "}", 0, null, null, 56);
        }
    }

    static {
        GetEditorialResponse$Companion$ADAPTER$1 getEditorialResponse$Companion$ADAPTER$1 = new GetEditorialResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetEditorialResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetEditorialResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_editorial.proto");
        ADAPTER = getEditorialResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getEditorialResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEditorialResponse(String str, String str2, List list, ShareLinkInfo shareLinkInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.share_link_url = str2;
        this.share_link_info = shareLinkInfo;
        this.contents = TransactorKt.immutableCopyOf("contents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEditorialResponse)) {
            return false;
        }
        GetEditorialResponse getEditorialResponse = (GetEditorialResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getEditorialResponse.unknownFields()) && Intrinsics.areEqual(this.title, getEditorialResponse.title) && Intrinsics.areEqual(this.share_link_url, getEditorialResponse.share_link_url) && Intrinsics.areEqual(this.contents, getEditorialResponse.contents) && Intrinsics.areEqual(this.share_link_info, getEditorialResponse.share_link_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.share_link_url;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.contents);
        ShareLinkInfo shareLinkInfo = this.share_link_info;
        int hashCode3 = m + (shareLinkInfo != null ? shareLinkInfo.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(5, false);
        builder.id = this.title;
        builder.last_4 = this.share_link_url;
        builder.gift_card_id = this.contents;
        builder.gift_card_amount = this.share_link_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.share_link_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "share_link_url=", arrayList);
        }
        List list = this.contents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contents=", arrayList, list);
        }
        ShareLinkInfo shareLinkInfo = this.share_link_info;
        if (shareLinkInfo != null) {
            arrayList.add("share_link_info=" + shareLinkInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEditorialResponse{", "}", 0, null, null, 56);
    }
}
