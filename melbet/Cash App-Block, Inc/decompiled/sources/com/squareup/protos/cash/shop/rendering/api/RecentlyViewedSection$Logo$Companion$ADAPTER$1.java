package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.RecentlyViewedSection;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecentlyViewedSection$Logo$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
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
        ?? r9 = 0;
        Object obj7 = null;
        String str = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            String str2 = r9;
            if (nextTag == -1) {
                return new RecentlyViewedSection.Logo((EngagedItemToken) obj, (AnalyticsEvent) obj2, (TapAction) obj3, (Avatar) obj4, (LocalizedString) obj5, (LocalizedString) obj6, str2, (LocalizedString) obj7, str, (StyledText) obj8, (StyledText) obj9, (AnalyticsMetadata) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    str = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj8 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj8);
                    break;
                case 6:
                    obj9 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj9);
                    break;
                case 7:
                    obj10 = TransactorKt.decodeMessageOrMerge(AnalyticsMetadata.ADAPTER, protoReader, obj10);
                    break;
                case 8:
                    r9 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 9:
                    obj = TransactorKt.decodeMessageOrMerge(EngagedItemToken.ADAPTER, protoReader, obj);
                    break;
                case 10:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 11:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 12:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            r9 = str2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecentlyViewedSection.Logo logo = (RecentlyViewedSection.Logo) obj;
        reverseProtoWriter.getClass();
        logo.getClass();
        reverseProtoWriter.writeBytes(logo.unknownFields());
        AnalyticsMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 7, logo.metadata);
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, logo.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, logo.title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, logo.business_token);
        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 12, logo.accessibility_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, logo.boost_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, logo.l_subtitle);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 10, logo.l_title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 4, logo.avatar);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, logo.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 2, logo.analytics_view_event);
        EngagedItemToken.ADAPTER.encodeWithTag(reverseProtoWriter, 9, logo.engaged_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecentlyViewedSection.Logo logo = (RecentlyViewedSection.Logo) obj;
        logo.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(4, logo.avatar) + TapAction.ADAPTER.encodedSizeWithTag(3, logo.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(2, logo.analytics_view_event) + EngagedItemToken.ADAPTER.encodedSizeWithTag(9, logo.engaged_token) + logo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(11, logo.l_subtitle) + protoAdapter.encodedSizeWithTag(10, logo.l_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(1, logo.business_token) + protoAdapter.encodedSizeWithTag(12, logo.accessibility_text) + protoAdapter2.encodedSizeWithTag(8, logo.boost_token) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        return AnalyticsMetadata.ADAPTER.encodedSizeWithTag(7, logo.metadata) + protoAdapter3.encodedSizeWithTag(6, logo.subtitle) + protoAdapter3.encodedSizeWithTag(5, logo.title) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RecentlyViewedSection.Logo logo = (RecentlyViewedSection.Logo) obj;
        logo.getClass();
        EngagedItemToken engagedItemToken = logo.engaged_token;
        EngagedItemToken engagedItemToken2 = engagedItemToken != null ? (EngagedItemToken) EngagedItemToken.ADAPTER.redact(engagedItemToken) : null;
        AnalyticsEvent analyticsEvent = logo.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        TapAction tapAction = logo.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Avatar avatar = logo.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        LocalizedString localizedString = logo.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = logo.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = logo.accessibility_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        StyledText styledText = logo.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = logo.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        AnalyticsMetadata analyticsMetadata = logo.metadata;
        AnalyticsMetadata analyticsMetadata2 = analyticsMetadata != null ? (AnalyticsMetadata) AnalyticsMetadata.ADAPTER.redact(analyticsMetadata) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = logo.boost_token;
        String str2 = logo.business_token;
        byteString.getClass();
        return new RecentlyViewedSection.Logo(engagedItemToken2, analyticsEvent2, tapAction2, avatar2, localizedString2, localizedString4, str, localizedString6, str2, styledText2, styledText4, analyticsMetadata2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecentlyViewedSection.Logo logo = (RecentlyViewedSection.Logo) obj;
        logo.getClass();
        EngagedItemToken.ADAPTER.encodeWithTag(protoWriter, 9, logo.engaged_token);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 2, logo.analytics_view_event);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 3, logo.tap_action);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 4, logo.avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 10, logo.l_title);
        protoAdapter.encodeWithTag(protoWriter, 11, logo.l_subtitle);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 8, logo.boost_token);
        protoAdapter.encodeWithTag(protoWriter, 12, logo.accessibility_text);
        protoAdapter2.encodeWithTag(protoWriter, 1, logo.business_token);
        ProtoAdapter protoAdapter3 = StyledText.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 5, logo.title);
        protoAdapter3.encodeWithTag(protoWriter, 6, logo.subtitle);
        AnalyticsMetadata.ADAPTER.encodeWithTag(protoWriter, 7, logo.metadata);
        protoWriter.writeBytes(logo.unknownFields());
    }
}
