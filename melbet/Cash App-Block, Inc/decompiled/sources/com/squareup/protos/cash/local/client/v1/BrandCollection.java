package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes7.dex */
public final class BrandCollection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BrandCollection> CREATOR;
    public final String caption;
    public final GeoFence geo_fence;
    public final List locations;
    public final LocalImage masthead_image;
    public final String primary_cta_button_label;
    public final String primary_cta_client_route;
    public final String subtitle;
    public final List tag_catalog;
    public final String title;

    public final class GeoFence extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GeoFence> CREATOR;
        public final Double max_latitude;
        public final Double max_longitude;
        public final Double min_latitude;
        public final Double min_longitude;

        static {
            BrandCollection$GeoFence$Companion$ADAPTER$1 brandCollection$GeoFence$Companion$ADAPTER$1 = new BrandCollection$GeoFence$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GeoFence.class), "type.googleapis.com/squareup.cash.local.client.v1.BrandCollection.GeoFence", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand_collection.proto");
            ADAPTER = brandCollection$GeoFence$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(brandCollection$GeoFence$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeoFence(Double d, Double d2, Double d3, Double d4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.min_longitude = d;
            this.max_longitude = d2;
            this.min_latitude = d3;
            this.max_latitude = d4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GeoFence)) {
                return false;
            }
            GeoFence geoFence = (GeoFence) obj;
            return Intrinsics.areEqual(unknownFields(), geoFence.unknownFields()) && Intrinsics.areEqual(this.min_longitude, geoFence.min_longitude) && Intrinsics.areEqual(this.max_longitude, geoFence.max_longitude) && Intrinsics.areEqual(this.min_latitude, geoFence.min_latitude) && Intrinsics.areEqual(this.max_latitude, geoFence.max_latitude);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Double d = this.min_longitude;
            int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
            Double d2 = this.max_longitude;
            int hashCode3 = (hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0)) * 37;
            Double d3 = this.min_latitude;
            int hashCode4 = (hashCode3 + (d3 != null ? Double.hashCode(d3.doubleValue()) : 0)) * 37;
            Double d4 = this.max_latitude;
            int hashCode5 = hashCode4 + (d4 != null ? Double.hashCode(d4.doubleValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.CubicBezier.Builder builder = new EasingCurve.CubicBezier.Builder(1);
            builder.x1 = this.min_longitude;
            builder.y1 = this.max_longitude;
            builder.x2 = this.min_latitude;
            builder.y2 = this.max_latitude;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Double d = this.min_longitude;
            if (d != null) {
                SizeMode$EnumUnboxingLocalUtility.m("min_longitude=", d, arrayList);
            }
            Double d2 = this.max_longitude;
            if (d2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("max_longitude=", d2, arrayList);
            }
            Double d3 = this.min_latitude;
            if (d3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("min_latitude=", d3, arrayList);
            }
            Double d4 = this.max_latitude;
            if (d4 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("max_latitude=", d4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GeoFence{", "}", 0, null, null, 56);
        }
    }

    public final class Location extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Location> CREATOR;
        public final String activity_label;
        public final LocalAddress address;
        public final String artwork_image_url;
        public final LocalColor background_color;
        public final LocalBrand.Banner banner;
        public final String brand_token;
        public final String category;
        public final String client_route;
        public final LocalColor foreground_color;
        public final Integer heat_level;
        public final LocalImage hero_image;
        public final LocalImage item_image;
        public final String location_token;
        public final LocalColor max_heat_color;
        public final LocalColor min_heat_color;
        public final String name;
        public final LocalOpenHours open_hours;
        public final LocalOpenStatus open_status;
        public final String promo_description;
        public final String promo_tag;
        public final Integer recent_order_count;
        public final List tags;
        public final String time_zone;

        static {
            BrandCollection$Location$Companion$ADAPTER$1 brandCollection$Location$Companion$ADAPTER$1 = new BrandCollection$Location$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Location.class), "type.googleapis.com/squareup.cash.local.client.v1.BrandCollection.Location", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand_collection.proto");
            ADAPTER = brandCollection$Location$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(brandCollection$Location$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Location(LocalColor localColor, LocalColor localColor2, String str, String str2, String str3, LocalOpenStatus localOpenStatus, LocalOpenHours localOpenHours, LocalAddress localAddress, String str4, String str5, String str6, String str7, Integer num, Integer num2, String str8, LocalColor localColor3, LocalColor localColor4, LocalBrand.Banner banner, LocalImage localImage, LocalImage localImage2, String str9, String str10, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.background_color = localColor;
            this.foreground_color = localColor2;
            this.artwork_image_url = str;
            this.category = str2;
            this.time_zone = str3;
            this.open_status = localOpenStatus;
            this.open_hours = localOpenHours;
            this.address = localAddress;
            this.client_route = str4;
            this.name = str5;
            this.brand_token = str6;
            this.location_token = str7;
            this.recent_order_count = num;
            this.heat_level = num2;
            this.activity_label = str8;
            this.min_heat_color = localColor3;
            this.max_heat_color = localColor4;
            this.banner = banner;
            this.item_image = localImage;
            this.hero_image = localImage2;
            this.promo_tag = str9;
            this.promo_description = str10;
            this.tags = TransactorKt.immutableCopyOf("tags", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return Intrinsics.areEqual(unknownFields(), location.unknownFields()) && Intrinsics.areEqual(this.background_color, location.background_color) && Intrinsics.areEqual(this.foreground_color, location.foreground_color) && Intrinsics.areEqual(this.artwork_image_url, location.artwork_image_url) && Intrinsics.areEqual(this.category, location.category) && Intrinsics.areEqual(this.time_zone, location.time_zone) && this.open_status == location.open_status && Intrinsics.areEqual(this.open_hours, location.open_hours) && Intrinsics.areEqual(this.address, location.address) && Intrinsics.areEqual(this.client_route, location.client_route) && Intrinsics.areEqual(this.name, location.name) && Intrinsics.areEqual(this.brand_token, location.brand_token) && Intrinsics.areEqual(this.location_token, location.location_token) && Intrinsics.areEqual(this.recent_order_count, location.recent_order_count) && Intrinsics.areEqual(this.heat_level, location.heat_level) && Intrinsics.areEqual(this.activity_label, location.activity_label) && Intrinsics.areEqual(this.min_heat_color, location.min_heat_color) && Intrinsics.areEqual(this.max_heat_color, location.max_heat_color) && this.banner == location.banner && Intrinsics.areEqual(this.item_image, location.item_image) && Intrinsics.areEqual(this.hero_image, location.hero_image) && Intrinsics.areEqual(this.promo_tag, location.promo_tag) && Intrinsics.areEqual(this.promo_description, location.promo_description) && Intrinsics.areEqual(this.tags, location.tags);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalColor localColor = this.background_color;
            int hashCode2 = (hashCode + (localColor != null ? localColor.hashCode() : 0)) * 37;
            LocalColor localColor2 = this.foreground_color;
            int hashCode3 = (hashCode2 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
            String str = this.artwork_image_url;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.category;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.time_zone;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalOpenStatus localOpenStatus = this.open_status;
            int hashCode7 = (hashCode6 + (localOpenStatus != null ? localOpenStatus.hashCode() : 0)) * 37;
            LocalOpenHours localOpenHours = this.open_hours;
            int hashCode8 = (hashCode7 + (localOpenHours != null ? localOpenHours.hashCode() : 0)) * 37;
            LocalAddress localAddress = this.address;
            int hashCode9 = (hashCode8 + (localAddress != null ? localAddress.hashCode() : 0)) * 37;
            String str4 = this.client_route;
            int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.name;
            int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.brand_token;
            int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.location_token;
            int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 37;
            Integer num = this.recent_order_count;
            int hashCode14 = (hashCode13 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.heat_level;
            int hashCode15 = (hashCode14 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            String str8 = this.activity_label;
            int hashCode16 = (hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 37;
            LocalColor localColor3 = this.min_heat_color;
            int hashCode17 = (hashCode16 + (localColor3 != null ? localColor3.hashCode() : 0)) * 37;
            LocalColor localColor4 = this.max_heat_color;
            int hashCode18 = (hashCode17 + (localColor4 != null ? localColor4.hashCode() : 0)) * 37;
            LocalBrand.Banner banner = this.banner;
            int hashCode19 = (hashCode18 + (banner != null ? banner.hashCode() : 0)) * 37;
            LocalImage localImage = this.item_image;
            int hashCode20 = (hashCode19 + (localImage != null ? localImage.hashCode() : 0)) * 37;
            LocalImage localImage2 = this.hero_image;
            int hashCode21 = (hashCode20 + (localImage2 != null ? localImage2.hashCode() : 0)) * 37;
            String str9 = this.promo_tag;
            int hashCode22 = (hashCode21 + (str9 != null ? str9.hashCode() : 0)) * 37;
            String str10 = this.promo_description;
            int hashCode23 = this.tags.hashCode() + ((hashCode22 + (str10 != null ? str10.hashCode() : 0)) * 37);
            this.hashCode = hashCode23;
            return hashCode23;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiControl.Builder builder = new UiControl.Builder(1);
            builder.f1401type = this.background_color;
            builder.state = this.foreground_color;
            builder.main_text = this.artwork_image_url;
            builder.sub_text = this.category;
            builder.accessibility_text = this.time_zone;
            builder.localizable_text = this.open_status;
            builder.localizable_main_text = this.open_hours;
            builder.localizable_sub_text = this.address;
            builder.action_url_to_open = this.client_route;
            builder.support_node_token = this.name;
            builder.info_text = this.brand_token;
            builder.localizable_accessibility_text = this.location_token;
            builder.localizable_info_text = this.recent_order_count;
            builder.main_text_color_override = this.heat_level;
            builder.accent_color = this.activity_label;
            builder.button = this.min_heat_color;
            builder.icon = this.max_heat_color;
            builder.action = this.banner;
            builder.client_scenario = this.item_image;
            builder.status_result = this.hero_image;
            builder.dialog = this.promo_tag;
            builder.enabled = this.promo_description;
            builder.info_text_style = this.tags;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalColor localColor = this.background_color;
            if (localColor != null) {
                SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor, arrayList);
            }
            LocalColor localColor2 = this.foreground_color;
            if (localColor2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor2, arrayList);
            }
            String str = this.artwork_image_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "artwork_image_url=", arrayList);
            }
            String str2 = this.category;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "category=", arrayList);
            }
            String str3 = this.time_zone;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "time_zone=", arrayList);
            }
            LocalOpenStatus localOpenStatus = this.open_status;
            if (localOpenStatus != null) {
                arrayList.add("open_status=" + localOpenStatus);
            }
            LocalOpenHours localOpenHours = this.open_hours;
            if (localOpenHours != null) {
                arrayList.add("open_hours=" + localOpenHours);
            }
            LocalAddress localAddress = this.address;
            if (localAddress != null) {
                arrayList.add("address=" + localAddress);
            }
            String str4 = this.client_route;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "client_route=", arrayList);
            }
            String str5 = this.name;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "name=", arrayList);
            }
            String str6 = this.brand_token;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "brand_token=", arrayList);
            }
            String str7 = this.location_token;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "location_token=", arrayList);
            }
            Integer num = this.recent_order_count;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("recent_order_count=", num, arrayList);
            }
            Integer num2 = this.heat_level;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("heat_level=", num2, arrayList);
            }
            String str8 = this.activity_label;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "activity_label=", arrayList);
            }
            LocalColor localColor3 = this.min_heat_color;
            if (localColor3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("min_heat_color=", localColor3, arrayList);
            }
            LocalColor localColor4 = this.max_heat_color;
            if (localColor4 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("max_heat_color=", localColor4, arrayList);
            }
            LocalBrand.Banner banner = this.banner;
            if (banner != null) {
                arrayList.add("banner=" + banner);
            }
            LocalImage localImage = this.item_image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("item_image=", localImage, arrayList);
            }
            LocalImage localImage2 = this.hero_image;
            if (localImage2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("hero_image=", localImage2, arrayList);
            }
            String str9 = this.promo_tag;
            if (str9 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "promo_tag=", arrayList);
            }
            String str10 = this.promo_description;
            if (str10 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "promo_description=", arrayList);
            }
            List list = this.tags;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("tags=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Location{", "}", 0, null, null, 56);
        }
    }

    static {
        BrandCollection$Companion$ADAPTER$1 brandCollection$Companion$ADAPTER$1 = new BrandCollection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrandCollection.class), "type.googleapis.com/squareup.cash.local.client.v1.BrandCollection", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand_collection.proto");
        ADAPTER = brandCollection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(brandCollection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandCollection(String str, String str2, String str3, List list, GeoFence geoFence, LocalImage localImage, String str4, String str5, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = str;
        this.subtitle = str2;
        this.caption = str3;
        this.geo_fence = geoFence;
        this.masthead_image = localImage;
        this.primary_cta_client_route = str4;
        this.primary_cta_button_label = str5;
        this.locations = TransactorKt.immutableCopyOf("locations", list);
        this.tag_catalog = TransactorKt.immutableCopyOf("tag_catalog", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrandCollection)) {
            return false;
        }
        BrandCollection brandCollection = (BrandCollection) obj;
        return Intrinsics.areEqual(unknownFields(), brandCollection.unknownFields()) && Intrinsics.areEqual(this.title, brandCollection.title) && Intrinsics.areEqual(this.subtitle, brandCollection.subtitle) && Intrinsics.areEqual(this.caption, brandCollection.caption) && Intrinsics.areEqual(this.locations, brandCollection.locations) && Intrinsics.areEqual(this.geo_fence, brandCollection.geo_fence) && Intrinsics.areEqual(this.masthead_image, brandCollection.masthead_image) && Intrinsics.areEqual(this.primary_cta_client_route, brandCollection.primary_cta_client_route) && Intrinsics.areEqual(this.primary_cta_button_label, brandCollection.primary_cta_button_label) && Intrinsics.areEqual(this.tag_catalog, brandCollection.tag_catalog);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.caption;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.locations);
        GeoFence geoFence = this.geo_fence;
        int hashCode4 = (m + (geoFence != null ? geoFence.hashCode() : 0)) * 37;
        LocalImage localImage = this.masthead_image;
        int hashCode5 = (hashCode4 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        String str4 = this.primary_cta_client_route;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.primary_cta_button_label;
        int hashCode7 = this.tag_catalog.hashCode() + ((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PrepurchaseCashCardAppletData.Builder builder = new PrepurchaseCashCardAppletData.Builder(22, false);
        builder.locale = this.title;
        builder.title = this.subtitle;
        builder.info_rows_header = this.caption;
        builder.info_rows = this.locations;
        builder.footer_text = this.geo_fence;
        builder.loadable_subtitle = this.masthead_image;
        builder.primary_footer_button_state = this.primary_cta_client_route;
        builder.secondary_footer_button_state = this.primary_cta_button_label;
        builder.payment_plans_data = this.tag_catalog;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.caption;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "caption=", arrayList);
        }
        List list = this.locations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("locations=", arrayList, list);
        }
        GeoFence geoFence = this.geo_fence;
        if (geoFence != null) {
            arrayList.add("geo_fence=" + geoFence);
        }
        LocalImage localImage = this.masthead_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("masthead_image=", localImage, arrayList);
        }
        String str4 = this.primary_cta_client_route;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "primary_cta_client_route=", arrayList);
        }
        String str5 = this.primary_cta_button_label;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "primary_cta_button_label=", arrayList);
        }
        List list2 = this.tag_catalog;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tag_catalog=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrandCollection{", "}", 0, null, null, 56);
    }
}
