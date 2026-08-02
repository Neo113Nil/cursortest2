package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HeroSection$HeroTile$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Avatar avatar;
        ?? r0;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Boolean bool = null;
        Object obj3 = null;
        Object obj4 = null;
        Avatar avatar2 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Long l = null;
        Long l2 = null;
        HeroSection.HeroTile.DisplayStyle displayStyle = null;
        HeroSection.HeroTile.HeroOverlayColor heroOverlayColor = null;
        String str = null;
        AnalyticsEvent analyticsEvent = null;
        String str2 = null;
        String str3 = null;
        TapAction tapAction = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HeroSection.HeroTile(analyticsEvent, tapAction, (Image) obj4, avatar2, (LocalizedString) obj5, (LocalizedString) obj6, (FormattedDetail) obj7, bool, heroOverlayColor, (AnalyticsMetadata) obj10, (EngagedItemToken) obj11, str, l, l2, displayStyle, (Image) obj8, (StyledText) obj9, (StyledText) obj12, (CountdownCaption) obj13, (HeroSection.HeroTile.FooterDetail) obj14, (Color) obj3, str2, str3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    analyticsEvent = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, analyticsEvent);
                    obj5 = obj5;
                    r0 = bool;
                    avatar2 = avatar2;
                    break;
                case 2:
                    tapAction = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, tapAction);
                    avatar2 = avatar2;
                    r0 = bool;
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
                    r0 = bool;
                    break;
                case 4:
                    avatar2 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, avatar2);
                    r0 = bool;
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj8);
                    r0 = bool;
                    break;
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj9);
                    r0 = bool;
                    break;
                case 7:
                    obj12 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj12);
                    r0 = bool;
                    break;
                case 8:
                    obj13 = TransactorKt.decodeMessageOrMerge(CountdownCaption.ADAPTER, protoReader, obj13);
                    r0 = bool;
                    break;
                case 9:
                    r0 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(AnalyticsMetadata.ADAPTER, protoReader, obj10);
                    r0 = bool;
                    break;
                case 11:
                    obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
                    r0 = bool;
                    break;
                case 12:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    r0 = bool;
                    break;
                case 13:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    r0 = bool;
                    break;
                case 14:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    r0 = bool;
                    break;
                case 15:
                    l = ProtoAdapter.INT64.decode(protoReader);
                    r0 = bool;
                    break;
                case 16:
                    obj11 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj11);
                    r0 = bool;
                    break;
                case 17:
                    obj2 = obj4;
                    avatar = avatar2;
                    obj = obj5;
                    try {
                        displayStyle = HeroSection.HeroTile.DisplayStyle.ADAPTER.decode(protoReader);
                        obj5 = obj;
                        obj4 = obj2;
                        avatar2 = avatar;
                        r0 = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 18:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    r0 = bool;
                    break;
                case 19:
                    obj14 = TransactorKt.decodeMessageOrMerge(HeroSection.HeroTile.FooterDetail.ADAPTER, protoReader, obj14);
                    r0 = bool;
                    break;
                case 20:
                    obj7 = TransactorKt.decodeMessageOrMerge(FormattedDetail.ADAPTER, protoReader, obj7);
                    r0 = bool;
                    break;
                case 21:
                    try {
                        heroOverlayColor = HeroSection.HeroTile.HeroOverlayColor.ADAPTER.decode(protoReader);
                        r0 = bool;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj5;
                        obj2 = obj4;
                        avatar = avatar2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 22:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    r0 = bool;
                    break;
                case 23:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    r0 = bool;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj2 = obj4;
                    avatar = avatar2;
                    obj = obj5;
                    r0 = bool;
                    obj5 = obj;
                    obj4 = obj2;
                    avatar2 = avatar;
                    break;
            }
            bool = r0;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HeroSection.HeroTile heroTile = (HeroSection.HeroTile) obj;
        reverseProtoWriter.getClass();
        heroTile.getClass();
        reverseProtoWriter.writeBytes(heroTile.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, heroTile.business_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, heroTile.offer_token);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 11, heroTile.background_color);
        HeroSection.HeroTile.FooterDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 19, heroTile.footer_detail);
        CountdownCaption.ADAPTER.encodeWithTag(reverseProtoWriter, 8, heroTile.countdown_caption);
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, heroTile.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, heroTile.title);
        ProtoAdapter protoAdapter3 = Image.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, heroTile.badge_icon);
        HeroSection.HeroTile.DisplayStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 17, heroTile.display_style);
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 18, heroTile.stop_at_ms);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 15, heroTile.effective_at_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, heroTile.boost_token);
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 16, heroTile.engaged_token);
        AnalyticsMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 10, heroTile.metadata);
        HeroSection.HeroTile.HeroOverlayColor.ADAPTER.encodeWithTag(reverseProtoWriter, 21, heroTile.overlay_color);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 9, heroTile.dimmer_enabled);
        FormattedDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 20, heroTile.formatted_footer);
        ProtoAdapter protoAdapter5 = LocalizedString.ADAPTER;
        protoAdapter5.encodeWithTag(reverseProtoWriter, 23, heroTile.l_subtitle);
        protoAdapter5.encodeWithTag(reverseProtoWriter, 22, heroTile.l_title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 4, heroTile.avatar);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, heroTile.picture);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, heroTile.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, heroTile.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HeroSection.HeroTile heroTile = (HeroSection.HeroTile) obj;
        heroTile.getClass();
        int encodedSizeWithTag = TapAction.ADAPTER.encodedSizeWithTag(2, heroTile.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, heroTile.analytics_view_event) + heroTile.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Image.ADAPTER;
        int encodedSizeWithTag2 = Avatar.ADAPTER.encodedSizeWithTag(4, heroTile.avatar) + protoAdapter.encodedSizeWithTag(3, heroTile.picture) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = EngagedItemToken.ADAPTER.encodedSizeWithTag(16, heroTile.engaged_token) + AnalyticsMetadata.ADAPTER.encodedSizeWithTag(10, heroTile.metadata) + HeroSection.HeroTile.HeroOverlayColor.ADAPTER.encodedSizeWithTag(21, heroTile.overlay_color) + ProtoAdapter.BOOL.encodedSizeWithTag(9, heroTile.dimmer_enabled) + FormattedDetail.ADAPTER.encodedSizeWithTag(20, heroTile.formatted_footer) + protoAdapter2.encodedSizeWithTag(23, heroTile.l_subtitle) + protoAdapter2.encodedSizeWithTag(22, heroTile.l_title) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(14, heroTile.boost_token) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
        int encodedSizeWithTag5 = protoAdapter.encodedSizeWithTag(5, heroTile.badge_icon) + HeroSection.HeroTile.DisplayStyle.ADAPTER.encodedSizeWithTag(17, heroTile.display_style) + protoAdapter4.encodedSizeWithTag(18, heroTile.stop_at_ms) + protoAdapter4.encodedSizeWithTag(15, heroTile.effective_at_ms) + encodedSizeWithTag4;
        ProtoAdapter protoAdapter5 = StyledText.ADAPTER;
        return protoAdapter3.encodedSizeWithTag(13, heroTile.business_token) + protoAdapter3.encodedSizeWithTag(12, heroTile.offer_token) + Color.ADAPTER.encodedSizeWithTag(11, heroTile.background_color) + HeroSection.HeroTile.FooterDetail.ADAPTER.encodedSizeWithTag(19, heroTile.footer_detail) + CountdownCaption.ADAPTER.encodedSizeWithTag(8, heroTile.countdown_caption) + protoAdapter5.encodedSizeWithTag(7, heroTile.subtitle) + protoAdapter5.encodedSizeWithTag(6, heroTile.title) + encodedSizeWithTag5;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HeroSection.HeroTile heroTile = (HeroSection.HeroTile) obj;
        heroTile.getClass();
        AnalyticsEvent analyticsEvent = heroTile.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = heroTile.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Image image = heroTile.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Avatar avatar = heroTile.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        LocalizedString localizedString = heroTile.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = heroTile.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        FormattedDetail formattedDetail = heroTile.formatted_footer;
        FormattedDetail formattedDetail2 = formattedDetail != null ? (FormattedDetail) FormattedDetail.ADAPTER.redact(formattedDetail) : null;
        AnalyticsMetadata analyticsMetadata = heroTile.metadata;
        AnalyticsMetadata analyticsMetadata2 = analyticsMetadata != null ? (AnalyticsMetadata) AnalyticsMetadata.ADAPTER.redact(analyticsMetadata) : null;
        EngagedItemToken engagedItemToken = heroTile.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        Image image3 = heroTile.badge_icon;
        Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
        StyledText styledText = heroTile.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = heroTile.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        CountdownCaption countdownCaption = heroTile.countdown_caption;
        CountdownCaption countdownCaption2 = countdownCaption != null ? (CountdownCaption) CountdownCaption.ADAPTER.redact(countdownCaption) : null;
        HeroSection.HeroTile.FooterDetail footerDetail = heroTile.footer_detail;
        HeroSection.HeroTile.FooterDetail footerDetail2 = footerDetail != null ? (HeroSection.HeroTile.FooterDetail) HeroSection.HeroTile.FooterDetail.ADAPTER.redact(footerDetail) : null;
        Color color = heroTile.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = heroTile.dimmer_enabled;
        HeroSection.HeroTile.HeroOverlayColor heroOverlayColor = heroTile.overlay_color;
        String str = heroTile.boost_token;
        Long l = heroTile.effective_at_ms;
        Long l2 = heroTile.stop_at_ms;
        HeroSection.HeroTile.DisplayStyle displayStyle = heroTile.display_style;
        String str2 = heroTile.offer_token;
        String str3 = heroTile.business_token;
        byteString.getClass();
        return new HeroSection.HeroTile(analyticsEvent2, tapAction2, image2, avatar2, localizedString2, localizedString4, formattedDetail2, bool, heroOverlayColor, analyticsMetadata2, engagedItemToken2, str, l, l2, displayStyle, image4, styledText2, styledText4, countdownCaption2, footerDetail2, color2, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HeroSection.HeroTile heroTile = (HeroSection.HeroTile) obj;
        heroTile.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, heroTile.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, heroTile.tap_action);
        ProtoAdapter protoAdapter = Image.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, heroTile.picture);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 4, heroTile.avatar);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 22, heroTile.l_title);
        protoAdapter2.encodeWithTag(protoWriter, 23, heroTile.l_subtitle);
        FormattedDetail.ADAPTER.encodeWithTag(protoWriter, 20, heroTile.formatted_footer);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, heroTile.dimmer_enabled);
        HeroSection.HeroTile.HeroOverlayColor.ADAPTER.encodeWithTag(protoWriter, 21, heroTile.overlay_color);
        AnalyticsMetadata.ADAPTER.encodeWithTag(protoWriter, 10, heroTile.metadata);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 16, heroTile.engaged_token);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(protoWriter, 14, heroTile.boost_token);
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
        protoAdapter4.encodeWithTag(protoWriter, 15, heroTile.effective_at_ms);
        protoAdapter4.encodeWithTag(protoWriter, 18, heroTile.stop_at_ms);
        HeroSection.HeroTile.DisplayStyle.ADAPTER.encodeWithTag(protoWriter, 17, heroTile.display_style);
        protoAdapter.encodeWithTag(protoWriter, 5, heroTile.badge_icon);
        ProtoAdapter protoAdapter5 = StyledText.ADAPTER;
        protoAdapter5.encodeWithTag(protoWriter, 6, heroTile.title);
        protoAdapter5.encodeWithTag(protoWriter, 7, heroTile.subtitle);
        CountdownCaption.ADAPTER.encodeWithTag(protoWriter, 8, heroTile.countdown_caption);
        HeroSection.HeroTile.FooterDetail.ADAPTER.encodeWithTag(protoWriter, 19, heroTile.footer_detail);
        Color.ADAPTER.encodeWithTag(protoWriter, 11, heroTile.background_color);
        protoAdapter3.encodeWithTag(protoWriter, 12, heroTile.offer_token);
        protoAdapter3.encodeWithTag(protoWriter, 13, heroTile.business_token);
        protoWriter.writeBytes(heroTile.unknownFields());
    }
}
