package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HeroSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HeroSection> CREATOR;
    public final List hero_tiles;

    public final class HeroTile extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeroTile> CREATOR;
        public final AnalyticsEvent analytics_view_event;
        public final Avatar avatar;
        public final Color background_color;
        public final Image badge_icon;
        public final String boost_token;
        public final String business_token;
        public final CountdownCaption countdown_caption;
        public final Boolean dimmer_enabled;
        public final DisplayStyle display_style;
        public final Long effective_at_ms;
        public final EngagedItemToken engaged_token;
        public final FooterDetail footer_detail;
        public final FormattedDetail formatted_footer;
        public final LocalizedString l_subtitle;
        public final LocalizedString l_title;
        public final AnalyticsMetadata metadata;
        public final String offer_token;
        public final HeroOverlayColor overlay_color;
        public final Image picture;
        public final Long stop_at_ms;
        public final StyledText subtitle;
        public final TapAction tap_action;
        public final StyledText title;

        public enum DisplayStyle implements WireEnum {
            TALL(0),
            SQUARE(1),
            SHORT(2);

            public static final HeroSection$HeroTile$DisplayStyle$Companion$ADAPTER$1 ADAPTER;
            public static final TextSize.Companion Companion;
            public final int value;

            static {
                DisplayStyle displayStyle = TALL;
                Companion = new TextSize.Companion();
                ADAPTER = new HeroSection$HeroTile$DisplayStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayStyle.class), Syntax.PROTO_2, displayStyle);
            }

            DisplayStyle(int i) {
                this.value = i;
            }

            public static final DisplayStyle fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return TALL;
                }
                if (i == 1) {
                    return SQUARE;
                }
                if (i != 2) {
                    return null;
                }
                return SHORT;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        public final class FooterDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<FooterDetail> CREATOR;
            public final zzkt detail;

            static {
                HeroSection$HeroTile$FooterDetail$Companion$ADAPTER$1 heroSection$HeroTile$FooterDetail$Companion$ADAPTER$1 = new HeroSection$HeroTile$FooterDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FooterDetail.class), "type.googleapis.com/squareup.cash.shop.rendering.api.HeroSection.HeroTile.FooterDetail", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/HeroSection.proto");
                ADAPTER = heroSection$HeroTile$FooterDetail$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(heroSection$HeroTile$FooterDetail$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FooterDetail(zzkt zzktVar, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.detail = zzktVar;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FooterDetail)) {
                    return false;
                }
                FooterDetail footerDetail = (FooterDetail) obj;
                return Intrinsics.areEqual(unknownFields(), footerDetail.unknownFields()) && Intrinsics.areEqual(this.detail, footerDetail.detail);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                zzkt zzktVar = this.detail;
                int hashCode2 = hashCode + (zzktVar != null ? zzktVar.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(19);
                builder.pool_lifecycle_filter = this.detail;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                zzkt zzktVar = this.detail;
                if (zzktVar != null) {
                    arrayList.add("detail=" + zzktVar);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "FooterDetail{", "}", 0, null, null, 56);
            }
        }

        public enum HeroOverlayColor implements WireEnum {
            UNSPECIFIED(0),
            BLACK(1),
            WHITE(2);

            public static final HeroSection$HeroTile$HeroOverlayColor$Companion$ADAPTER$1 ADAPTER;
            public static final TransactionType.Companion Companion;
            public final int value;

            static {
                HeroOverlayColor heroOverlayColor = UNSPECIFIED;
                Companion = new TransactionType.Companion();
                ADAPTER = new HeroSection$HeroTile$HeroOverlayColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HeroOverlayColor.class), Syntax.PROTO_2, heroOverlayColor);
            }

            HeroOverlayColor(int i) {
                this.value = i;
            }

            public static final HeroOverlayColor fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return BLACK;
                }
                if (i != 2) {
                    return null;
                }
                return WHITE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            HeroSection$HeroTile$Companion$ADAPTER$1 heroSection$HeroTile$Companion$ADAPTER$1 = new HeroSection$HeroTile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroTile.class), "type.googleapis.com/squareup.cash.shop.rendering.api.HeroSection.HeroTile", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/HeroSection.proto");
            ADAPTER = heroSection$HeroTile$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(heroSection$HeroTile$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeroTile(AnalyticsEvent analyticsEvent, TapAction tapAction, Image image, Avatar avatar, LocalizedString localizedString, LocalizedString localizedString2, FormattedDetail formattedDetail, Boolean bool, HeroOverlayColor heroOverlayColor, AnalyticsMetadata analyticsMetadata, EngagedItemToken engagedItemToken, String str, Long l, Long l2, DisplayStyle displayStyle, Image image2, StyledText styledText, StyledText styledText2, CountdownCaption countdownCaption, FooterDetail footerDetail, Color color, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.analytics_view_event = analyticsEvent;
            this.tap_action = tapAction;
            this.picture = image;
            this.avatar = avatar;
            this.l_title = localizedString;
            this.l_subtitle = localizedString2;
            this.formatted_footer = formattedDetail;
            this.dimmer_enabled = bool;
            this.overlay_color = heroOverlayColor;
            this.metadata = analyticsMetadata;
            this.engaged_token = engagedItemToken;
            this.boost_token = str;
            this.effective_at_ms = l;
            this.stop_at_ms = l2;
            this.display_style = displayStyle;
            this.badge_icon = image2;
            this.title = styledText;
            this.subtitle = styledText2;
            this.countdown_caption = countdownCaption;
            this.footer_detail = footerDetail;
            this.background_color = color;
            this.offer_token = str2;
            this.business_token = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeroTile)) {
                return false;
            }
            HeroTile heroTile = (HeroTile) obj;
            return Intrinsics.areEqual(unknownFields(), heroTile.unknownFields()) && Intrinsics.areEqual(this.analytics_view_event, heroTile.analytics_view_event) && Intrinsics.areEqual(this.tap_action, heroTile.tap_action) && Intrinsics.areEqual(this.picture, heroTile.picture) && Intrinsics.areEqual(this.avatar, heroTile.avatar) && Intrinsics.areEqual(this.l_title, heroTile.l_title) && Intrinsics.areEqual(this.l_subtitle, heroTile.l_subtitle) && Intrinsics.areEqual(this.formatted_footer, heroTile.formatted_footer) && Intrinsics.areEqual(this.dimmer_enabled, heroTile.dimmer_enabled) && this.overlay_color == heroTile.overlay_color && Intrinsics.areEqual(this.metadata, heroTile.metadata) && Intrinsics.areEqual(this.engaged_token, heroTile.engaged_token) && Intrinsics.areEqual(this.boost_token, heroTile.boost_token) && Intrinsics.areEqual(this.effective_at_ms, heroTile.effective_at_ms) && Intrinsics.areEqual(this.stop_at_ms, heroTile.stop_at_ms) && this.display_style == heroTile.display_style && Intrinsics.areEqual(this.badge_icon, heroTile.badge_icon) && Intrinsics.areEqual(this.title, heroTile.title) && Intrinsics.areEqual(this.subtitle, heroTile.subtitle) && Intrinsics.areEqual(this.countdown_caption, heroTile.countdown_caption) && Intrinsics.areEqual(this.footer_detail, heroTile.footer_detail) && Intrinsics.areEqual(this.background_color, heroTile.background_color) && Intrinsics.areEqual(this.offer_token, heroTile.offer_token) && Intrinsics.areEqual(this.business_token, heroTile.business_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            int hashCode2 = (hashCode + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            Image image = this.picture;
            int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
            Avatar avatar = this.avatar;
            int hashCode5 = (hashCode4 + (avatar != null ? avatar.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.l_title;
            int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.l_subtitle;
            int hashCode7 = (hashCode6 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            FormattedDetail formattedDetail = this.formatted_footer;
            int hashCode8 = (hashCode7 + (formattedDetail != null ? formattedDetail.hashCode() : 0)) * 37;
            Boolean bool = this.dimmer_enabled;
            int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            HeroOverlayColor heroOverlayColor = this.overlay_color;
            int hashCode10 = (hashCode9 + (heroOverlayColor != null ? heroOverlayColor.hashCode() : 0)) * 37;
            AnalyticsMetadata analyticsMetadata = this.metadata;
            int hashCode11 = (hashCode10 + (analyticsMetadata != null ? analyticsMetadata.hashCode() : 0)) * 37;
            EngagedItemToken engagedItemToken = this.engaged_token;
            int hashCode12 = (hashCode11 + (engagedItemToken != null ? engagedItemToken.hashCode() : 0)) * 37;
            String str = this.boost_token;
            int hashCode13 = (hashCode12 + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.effective_at_ms;
            int hashCode14 = (hashCode13 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.stop_at_ms;
            int hashCode15 = (hashCode14 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            DisplayStyle displayStyle = this.display_style;
            int hashCode16 = (hashCode15 + (displayStyle != null ? displayStyle.hashCode() : 0)) * 37;
            Image image2 = this.badge_icon;
            int hashCode17 = (hashCode16 + (image2 != null ? image2.hashCode() : 0)) * 37;
            StyledText styledText = this.title;
            int hashCode18 = (hashCode17 + (styledText != null ? styledText.hashCode() : 0)) * 37;
            StyledText styledText2 = this.subtitle;
            int hashCode19 = (hashCode18 + (styledText2 != null ? styledText2.hashCode() : 0)) * 37;
            CountdownCaption countdownCaption = this.countdown_caption;
            int hashCode20 = (hashCode19 + (countdownCaption != null ? countdownCaption.hashCode() : 0)) * 37;
            FooterDetail footerDetail = this.footer_detail;
            int hashCode21 = (hashCode20 + (footerDetail != null ? footerDetail.hashCode() : 0)) * 37;
            Color color = this.background_color;
            int hashCode22 = (hashCode21 + (color != null ? color.hashCode() : 0)) * 37;
            String str2 = this.offer_token;
            int hashCode23 = (hashCode22 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.business_token;
            int hashCode24 = hashCode23 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode24;
            return hashCode24;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiControl.Builder builder = new UiControl.Builder(4);
            builder.f1401type = this.analytics_view_event;
            builder.state = this.tap_action;
            builder.localizable_text = this.picture;
            builder.localizable_main_text = this.avatar;
            builder.localizable_sub_text = this.l_title;
            builder.localizable_accessibility_text = this.l_subtitle;
            builder.localizable_info_text = this.formatted_footer;
            builder.enabled = this.dimmer_enabled;
            builder.action_url_to_open = this.overlay_color;
            builder.support_node_token = this.metadata;
            builder.info_text = this.engaged_token;
            builder.main_text = this.boost_token;
            builder.accent_color = this.effective_at_ms;
            builder.button = this.stop_at_ms;
            builder.icon = this.display_style;
            builder.action = this.badge_icon;
            builder.client_scenario = this.title;
            builder.status_result = this.subtitle;
            builder.dialog = this.countdown_caption;
            builder.info_text_style = this.footer_detail;
            builder.main_text_color_override = this.background_color;
            builder.sub_text = this.offer_token;
            builder.accessibility_text = this.business_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsEvent analyticsEvent = this.analytics_view_event;
            if (analyticsEvent != null) {
                SizeMode$EnumUnboxingLocalUtility.m("analytics_view_event=", analyticsEvent, arrayList);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                SizeMode$EnumUnboxingLocalUtility.m("tap_action=", tapAction, arrayList);
            }
            Image image = this.picture;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("picture=", image, arrayList);
            }
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            LocalizedString localizedString = this.l_title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.l_subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("l_subtitle=", localizedString2, arrayList);
            }
            FormattedDetail formattedDetail = this.formatted_footer;
            if (formattedDetail != null) {
                arrayList.add("formatted_footer=" + formattedDetail);
            }
            Boolean bool = this.dimmer_enabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("dimmer_enabled=", bool, arrayList);
            }
            HeroOverlayColor heroOverlayColor = this.overlay_color;
            if (heroOverlayColor != null) {
                arrayList.add("overlay_color=" + heroOverlayColor);
            }
            AnalyticsMetadata analyticsMetadata = this.metadata;
            if (analyticsMetadata != null) {
                arrayList.add("metadata=" + analyticsMetadata);
            }
            EngagedItemToken engagedItemToken = this.engaged_token;
            if (engagedItemToken != null) {
                arrayList.add("engaged_token=" + engagedItemToken);
            }
            String str = this.boost_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "boost_token=", arrayList);
            }
            Long l = this.effective_at_ms;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("effective_at_ms=", l, arrayList);
            }
            Long l2 = this.stop_at_ms;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("stop_at_ms=", l2, arrayList);
            }
            DisplayStyle displayStyle = this.display_style;
            if (displayStyle != null) {
                arrayList.add("display_style=" + displayStyle);
            }
            Image image2 = this.badge_icon;
            if (image2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("badge_icon=", image2, arrayList);
            }
            StyledText styledText = this.title;
            if (styledText != null) {
                SizeMode$EnumUnboxingLocalUtility.m("title=", styledText, arrayList);
            }
            StyledText styledText2 = this.subtitle;
            if (styledText2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("subtitle=", styledText2, arrayList);
            }
            CountdownCaption countdownCaption = this.countdown_caption;
            if (countdownCaption != null) {
                arrayList.add("countdown_caption=" + countdownCaption);
            }
            FooterDetail footerDetail = this.footer_detail;
            if (footerDetail != null) {
                arrayList.add("footer_detail=" + footerDetail);
            }
            Color color = this.background_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
            }
            String str2 = this.offer_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "offer_token=", arrayList);
            }
            String str3 = this.business_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "business_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeroTile{", "}", 0, null, null, 56);
        }
    }

    static {
        HeroSection$Companion$ADAPTER$1 heroSection$Companion$ADAPTER$1 = new HeroSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeroSection.class), "type.googleapis.com/squareup.cash.shop.rendering.api.HeroSection", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/HeroSection.proto");
        ADAPTER = heroSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(heroSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.hero_tiles = TransactorKt.immutableCopyOf("hero_tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeroSection)) {
            return false;
        }
        HeroSection heroSection = (HeroSection) obj;
        return Intrinsics.areEqual(unknownFields(), heroSection.unknownFields()) && Intrinsics.areEqual(this.hero_tiles, heroSection.hero_tiles);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.hero_tiles.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(24, false);
        builder.pools = this.hero_tiles;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.hero_tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("hero_tiles=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HeroSection{", "}", 0, null, null, 56);
    }
}
