package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClusterItem$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj15 = obj6;
            if (nextTag == -1) {
                return new ClusterItem((AnalyticsEvent) obj2, (TapAction) obj4, (Avatar) obj5, (String) obj3, (String) obj15, (EngagedItemToken) obj7, (LocalizedString) obj8, (LocalizedString) obj9, (AnalyticsMetadata) obj10, (String) obj11, (StyledText) obj12, (StyledText) obj13, (OfferBadge) obj14, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj6 = obj15;
                    break;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj4);
                    obj = obj3;
                    obj6 = obj15;
                    break;
                case 3:
                    obj5 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj5);
                    obj = obj3;
                    obj6 = obj15;
                    break;
                case 4:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj6 = obj15;
                    break;
                case 5:
                    obj12 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj12);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 6:
                    obj13 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj13);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(AnalyticsMetadata.ADAPTER, protoReader, obj10);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 9:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj3;
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj7);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 11:
                    obj14 = TransactorKt.decodeMessageOrMerge(OfferBadge.ADAPTER, protoReader, obj14);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 12:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj8);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                case 13:
                    obj9 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj9);
                    obj6 = obj15;
                    obj = obj3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj6 = obj15;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClusterItem clusterItem = (ClusterItem) obj;
        reverseProtoWriter.getClass();
        clusterItem.getClass();
        reverseProtoWriter.writeBytes(clusterItem.unknownFields());
        OfferBadge.ADAPTER.encodeWithTag(reverseProtoWriter, 11, clusterItem.merchant_sale_badge);
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, clusterItem.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, clusterItem.title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, clusterItem.business_token);
        AnalyticsMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 7, clusterItem.metadata);
        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 13, clusterItem.l_subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 12, clusterItem.l_title);
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 10, clusterItem.engaged_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, clusterItem.boost_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, clusterItem.offer_token);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, clusterItem.avatar);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clusterItem.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clusterItem.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClusterItem clusterItem = (ClusterItem) obj;
        clusterItem.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(3, clusterItem.avatar) + TapAction.ADAPTER.encodedSizeWithTag(2, clusterItem.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, clusterItem.analytics_view_event) + clusterItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = EngagedItemToken.ADAPTER.encodedSizeWithTag(10, clusterItem.engaged_token) + protoAdapter.encodedSizeWithTag(9, clusterItem.boost_token) + protoAdapter.encodedSizeWithTag(4, clusterItem.offer_token) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, clusterItem.business_token) + AnalyticsMetadata.ADAPTER.encodedSizeWithTag(7, clusterItem.metadata) + protoAdapter2.encodedSizeWithTag(13, clusterItem.l_subtitle) + protoAdapter2.encodedSizeWithTag(12, clusterItem.l_title) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        return OfferBadge.ADAPTER.encodedSizeWithTag(11, clusterItem.merchant_sale_badge) + protoAdapter3.encodedSizeWithTag(6, clusterItem.subtitle) + protoAdapter3.encodedSizeWithTag(5, clusterItem.title) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClusterItem clusterItem = (ClusterItem) obj;
        clusterItem.getClass();
        AnalyticsEvent analyticsEvent = clusterItem.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = clusterItem.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Avatar avatar = clusterItem.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        EngagedItemToken engagedItemToken = clusterItem.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        LocalizedString localizedString = clusterItem.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = clusterItem.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        AnalyticsMetadata analyticsMetadata = clusterItem.metadata;
        AnalyticsMetadata analyticsMetadata2 = analyticsMetadata != null ? (AnalyticsMetadata) AnalyticsMetadata.ADAPTER.redact(analyticsMetadata) : null;
        StyledText styledText = clusterItem.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = clusterItem.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        OfferBadge offerBadge = clusterItem.merchant_sale_badge;
        OfferBadge offerBadge2 = offerBadge != null ? (OfferBadge) OfferBadge.ADAPTER.redact(offerBadge) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = clusterItem.offer_token;
        String str2 = clusterItem.boost_token;
        String str3 = clusterItem.business_token;
        byteString.getClass();
        return new ClusterItem(analyticsEvent2, tapAction2, avatar2, str, str2, engagedItemToken2, localizedString2, localizedString4, analyticsMetadata2, str3, styledText2, styledText4, offerBadge2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClusterItem clusterItem = (ClusterItem) obj;
        clusterItem.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, clusterItem.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, clusterItem.tap_action);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 3, clusterItem.avatar);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 4, clusterItem.offer_token);
        protoAdapter.encodeWithTag(protoWriter, 9, clusterItem.boost_token);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 10, clusterItem.engaged_token);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 12, clusterItem.l_title);
        protoAdapter2.encodeWithTag(protoWriter, 13, clusterItem.l_subtitle);
        AnalyticsMetadata.ADAPTER.encodeWithTag(protoWriter, 7, clusterItem.metadata);
        protoAdapter.encodeWithTag(protoWriter, 8, clusterItem.business_token);
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 5, clusterItem.title);
        protoAdapter3.encodeWithTag(protoWriter, 6, clusterItem.subtitle);
        OfferBadge.ADAPTER.encodeWithTag(protoWriter, 11, clusterItem.merchant_sale_badge);
        protoWriter.writeBytes(clusterItem.unknownFields());
    }
}
