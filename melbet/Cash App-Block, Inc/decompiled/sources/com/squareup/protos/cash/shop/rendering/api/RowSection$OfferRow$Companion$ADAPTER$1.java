package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RowSection$OfferRow$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        String str = null;
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
        String str2 = null;
        String str3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            long j = beginMessage;
            if (nextTag == -1) {
                return new RowSection.OfferRow((AnalyticsEvent) obj, (TapAction) obj2, (Avatar) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (AnalyticsMetadata) obj6, (EngagedItemToken) obj7, str, str2, (StyledText) obj10, (StyledText) obj11, (Button) obj12, str3, (Button) obj8, (OfferBadge) obj9, protoReader.endMessageAndGetUnknownFields(j));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj10 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj10);
                    break;
                case 5:
                    obj11 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj11);
                    break;
                case 6:
                    obj12 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj12);
                    break;
                case 7:
                    obj6 = TransactorKt.decodeMessageOrMerge(AnalyticsMetadata.ADAPTER, protoReader, obj6);
                    break;
                case 8:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj8);
                    break;
                case 10:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 11:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 12:
                    obj7 = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj7);
                    break;
                case 13:
                    obj9 = TransactorKt.decodeMessageOrMerge(OfferBadge.ADAPTER, protoReader, obj9);
                    break;
                case 14:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 15:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            decode = str;
            str = decode;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.OfferRow offerRow = (RowSection.OfferRow) obj;
        reverseProtoWriter.getClass();
        offerRow.getClass();
        reverseProtoWriter.writeBytes(offerRow.unknownFields());
        OfferBadge.ADAPTER.encodeWithTag(reverseProtoWriter, 13, offerRow.merchant_sale_badge);
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, offerRow.selected_button);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, offerRow.business_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, offerRow.button);
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 5, offerRow.subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, offerRow.title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, offerRow.boost_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, offerRow.offer_token);
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 12, offerRow.engaged_token);
        AnalyticsMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 7, offerRow.metadata);
        ProtoAdapter protoAdapter4 = LocalizedString.ADAPTER;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 15, offerRow.l_subtitle);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 14, offerRow.l_title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, offerRow.avatar);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, offerRow.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offerRow.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection.OfferRow offerRow = (RowSection.OfferRow) obj;
        offerRow.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(3, offerRow.avatar) + TapAction.ADAPTER.encodedSizeWithTag(2, offerRow.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, offerRow.analytics_view_event) + offerRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = EngagedItemToken.ADAPTER.encodedSizeWithTag(12, offerRow.engaged_token) + AnalyticsMetadata.ADAPTER.encodedSizeWithTag(7, offerRow.metadata) + protoAdapter.encodedSizeWithTag(15, offerRow.l_subtitle) + protoAdapter.encodedSizeWithTag(14, offerRow.l_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(11, offerRow.boost_token) + protoAdapter2.encodedSizeWithTag(10, offerRow.offer_token) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(5, offerRow.subtitle) + protoAdapter3.encodedSizeWithTag(4, offerRow.title) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter4 = Button.ADAPTER;
        return OfferBadge.ADAPTER.encodedSizeWithTag(13, offerRow.merchant_sale_badge) + protoAdapter4.encodedSizeWithTag(9, offerRow.selected_button) + protoAdapter2.encodedSizeWithTag(8, offerRow.business_token) + protoAdapter4.encodedSizeWithTag(6, offerRow.button) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.OfferRow offerRow = (RowSection.OfferRow) obj;
        offerRow.getClass();
        AnalyticsEvent analyticsEvent = offerRow.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = offerRow.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Avatar avatar = offerRow.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        LocalizedString localizedString = offerRow.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = offerRow.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        AnalyticsMetadata analyticsMetadata = offerRow.metadata;
        AnalyticsMetadata analyticsMetadata2 = analyticsMetadata != null ? (AnalyticsMetadata) AnalyticsMetadata.ADAPTER.redact(analyticsMetadata) : null;
        EngagedItemToken engagedItemToken = offerRow.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        StyledText styledText = offerRow.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = offerRow.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        Button button = offerRow.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = offerRow.selected_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        OfferBadge offerBadge = offerRow.merchant_sale_badge;
        OfferBadge offerBadge2 = offerBadge != null ? (OfferBadge) OfferBadge.ADAPTER.redact(offerBadge) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = offerRow.offer_token;
        String str2 = offerRow.boost_token;
        String str3 = offerRow.business_token;
        byteString.getClass();
        return new RowSection.OfferRow(analyticsEvent2, tapAction2, avatar2, localizedString2, localizedString4, analyticsMetadata2, engagedItemToken2, str, str2, styledText2, styledText4, button2, str3, button4, offerBadge2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.OfferRow offerRow = (RowSection.OfferRow) obj;
        offerRow.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, offerRow.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, offerRow.tap_action);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 3, offerRow.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 14, offerRow.l_title);
        protoAdapter.encodeWithTag(protoWriter, 15, offerRow.l_subtitle);
        AnalyticsMetadata.ADAPTER.encodeWithTag(protoWriter, 7, offerRow.metadata);
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 12, offerRow.engaged_token);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 10, offerRow.offer_token);
        protoAdapter2.encodeWithTag(protoWriter, 11, offerRow.boost_token);
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 4, offerRow.title);
        protoAdapter3.encodeWithTag(protoWriter, 5, offerRow.subtitle);
        ProtoAdapter protoAdapter4 = Button.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 6, offerRow.button);
        protoAdapter2.encodeWithTag(protoWriter, 8, offerRow.business_token);
        protoAdapter4.encodeWithTag(protoWriter, 9, offerRow.selected_button);
        OfferBadge.ADAPTER.encodeWithTag(protoWriter, 13, offerRow.merchant_sale_badge);
        protoWriter.writeBytes(offerRow.unknownFields());
    }
}
