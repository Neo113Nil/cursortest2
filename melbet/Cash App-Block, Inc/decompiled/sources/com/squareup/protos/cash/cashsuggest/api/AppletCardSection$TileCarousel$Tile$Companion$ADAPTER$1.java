package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$TileCarousel$Tile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.TileCarousel.Tile((UiAvatar) obj, (LocalizedString) obj2, (Image) obj3, (AppletCardSection.TileCarousel.Tile.OverlayColor) obj4, (Boolean) obj5, (EngagedItemToken) obj6, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj7, (AnalyticsEvent) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj7 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj7);
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj8);
                    break;
                case 6:
                    try {
                        obj4 = AppletCardSection.TileCarousel.Tile.OverlayColor.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 7:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.TileCarousel.Tile tile = (AppletCardSection.TileCarousel.Tile) obj;
        reverseProtoWriter.getClass();
        tile.getClass();
        reverseProtoWriter.writeBytes(tile.unknownFields());
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, tile.analytic_view_event);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, tile.tap_action);
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 8, tile.engaged_token);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, tile.dimmer_enabled);
        AppletCardSection.TileCarousel.Tile.OverlayColor.ADAPTER.encodeWithTag(reverseProtoWriter, 6, tile.overlay_color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, tile.image);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tile.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tile.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.TileCarousel.Tile tile = (AppletCardSection.TileCarousel.Tile) obj;
        tile.getClass();
        return AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, tile.analytic_view_event) + com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(4, tile.tap_action) + EngagedItemToken.ADAPTER.encodedSizeWithTag(8, tile.engaged_token) + ProtoAdapter.BOOL.encodedSizeWithTag(7, tile.dimmer_enabled) + AppletCardSection.TileCarousel.Tile.OverlayColor.ADAPTER.encodedSizeWithTag(6, tile.overlay_color) + Image.ADAPTER.encodedSizeWithTag(3, tile.image) + LocalizedString.ADAPTER.encodedSizeWithTag(2, tile.title) + UiAvatar.ADAPTER.encodedSizeWithTag(1, tile.avatar) + tile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.TileCarousel.Tile tile = (AppletCardSection.TileCarousel.Tile) obj;
        tile.getClass();
        UiAvatar uiAvatar = tile.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = tile.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Image image = tile.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        EngagedItemToken engagedItemToken = tile.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = tile.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        AnalyticsEvent analyticsEvent = tile.analytic_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        ByteString byteString = ByteString.EMPTY;
        AppletCardSection.TileCarousel.Tile.OverlayColor overlayColor = tile.overlay_color;
        Boolean bool = tile.dimmer_enabled;
        byteString.getClass();
        return new AppletCardSection.TileCarousel.Tile(uiAvatar2, localizedString2, image2, overlayColor, bool, engagedItemToken2, tapAction2, analyticsEvent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.TileCarousel.Tile tile = (AppletCardSection.TileCarousel.Tile) obj;
        tile.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, tile.avatar);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, tile.title);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, tile.image);
        AppletCardSection.TileCarousel.Tile.OverlayColor.ADAPTER.encodeWithTag(protoWriter, 6, tile.overlay_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, tile.dimmer_enabled);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 8, tile.engaged_token);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 4, tile.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 5, tile.analytic_view_event);
        protoWriter.writeBytes(tile.unknownFields());
    }
}
