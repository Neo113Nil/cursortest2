package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AvatarCarouselSection$AvatarItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
        AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarCarouselSection.AvatarItem((AnalyticsEvent) obj, (TapAction) obj2, (UiAvatar) obj3, (LocalizedString) obj4, (EngagedItemToken) obj5, avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata, (LocalizedString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = new AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata((OfferMetadata) OfferMetadata.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarCarouselSection.AvatarItem avatarItem = (AvatarCarouselSection.AvatarItem) obj;
        reverseProtoWriter.getClass();
        avatarItem.getClass();
        reverseProtoWriter.writeBytes(avatarItem.unknownFields());
        AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = avatarItem.feature_metadata;
        if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
            OfferMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 6, avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata.value);
        } else if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, avatarItem.accessibility_text);
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 5, avatarItem.engaged_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, avatarItem.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, avatarItem.avatar);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarItem.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarItem.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarCarouselSection.AvatarItem avatarItem = (AvatarCarouselSection.AvatarItem) obj;
        avatarItem.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(3, avatarItem.avatar) + TapAction.ADAPTER.encodedSizeWithTag(2, avatarItem.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, avatarItem.analytics_view_event) + avatarItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = EngagedItemToken.ADAPTER.encodedSizeWithTag(5, avatarItem.engaged_token) + protoAdapter.encodedSizeWithTag(4, avatarItem.title) + encodedSizeWithTag;
        AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = avatarItem.feature_metadata;
        if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
            encodedSizeWithTag2 += OfferMetadata.ADAPTER.encodedSizeWithTag(6, avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata.value);
        } else if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return protoAdapter.encodedSizeWithTag(7, avatarItem.accessibility_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarCarouselSection.AvatarItem avatarItem = (AvatarCarouselSection.AvatarItem) obj;
        avatarItem.getClass();
        AnalyticsEvent analyticsEvent = avatarItem.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = avatarItem.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        UiAvatar uiAvatar = avatarItem.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = avatarItem.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        EngagedItemToken engagedItemToken = avatarItem.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        LocalizedString localizedString3 = avatarItem.accessibility_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = avatarItem.feature_metadata;
        byteString.getClass();
        return new AvatarCarouselSection.AvatarItem(analyticsEvent2, tapAction2, uiAvatar2, localizedString2, engagedItemToken2, avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarCarouselSection.AvatarItem avatarItem = (AvatarCarouselSection.AvatarItem) obj;
        avatarItem.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, avatarItem.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, avatarItem.tap_action);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 3, avatarItem.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, avatarItem.title);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 5, avatarItem.engaged_token);
        protoAdapter.encodeWithTag(protoWriter, 7, avatarItem.accessibility_text);
        AvatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata = avatarItem.feature_metadata;
        if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
            OfferMetadata.ADAPTER.encodeWithTag(protoWriter, 6, avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata.value);
        } else if (avatarCarouselSection$AvatarItem$FeatureMetadata$OfferMetadata != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(avatarItem.unknownFields());
    }
}
