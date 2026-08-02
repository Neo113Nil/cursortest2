package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RowSection$FilterRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RowSection.FilterRow((AnalyticsEvent) obj, (RowSection.FilterRow.FilterTapAction) obj2, (UiAvatar) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (StyledText) obj6, (StyledText) obj7, (Avatar) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(RowSection.FilterRow.FilterTapAction.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj8 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj8);
                    break;
                case 4:
                    obj6 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj6);
                    break;
                case 5:
                    obj7 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj7);
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.FilterRow filterRow = (RowSection.FilterRow) obj;
        reverseProtoWriter.getClass();
        filterRow.getClass();
        reverseProtoWriter.writeBytes(filterRow.unknownFields());
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, filterRow.avatar);
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, filterRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, filterRow.title);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, filterRow.l_subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, filterRow.l_title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 8, filterRow.ui_avatar);
        RowSection.FilterRow.FilterTapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, filterRow.tap_action);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 1, filterRow.analytics_view_event);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection.FilterRow filterRow = (RowSection.FilterRow) obj;
        filterRow.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(8, filterRow.ui_avatar) + RowSection.FilterRow.FilterTapAction.ADAPTER.encodedSizeWithTag(2, filterRow.tap_action) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(1, filterRow.analytics_view_event) + filterRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(7, filterRow.l_subtitle) + protoAdapter.encodedSizeWithTag(6, filterRow.l_title) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        return Avatar.ADAPTER.encodedSizeWithTag(3, filterRow.avatar) + protoAdapter2.encodedSizeWithTag(5, filterRow.subtitle) + protoAdapter2.encodedSizeWithTag(4, filterRow.title) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.FilterRow filterRow = (RowSection.FilterRow) obj;
        filterRow.getClass();
        AnalyticsEvent analyticsEvent = filterRow.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        RowSection.FilterRow.FilterTapAction filterTapAction = filterRow.tap_action;
        RowSection.FilterRow.FilterTapAction filterTapAction2 = filterTapAction != null ? (RowSection.FilterRow.FilterTapAction) RowSection.FilterRow.FilterTapAction.ADAPTER.redact(filterTapAction) : null;
        UiAvatar uiAvatar = filterRow.ui_avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        LocalizedString localizedString = filterRow.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = filterRow.l_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        StyledText styledText = filterRow.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = filterRow.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        Avatar avatar = filterRow.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RowSection.FilterRow(analyticsEvent2, filterTapAction2, uiAvatar2, localizedString2, localizedString4, styledText2, styledText4, avatar2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.FilterRow filterRow = (RowSection.FilterRow) obj;
        filterRow.getClass();
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 1, filterRow.analytics_view_event);
        RowSection.FilterRow.FilterTapAction.ADAPTER.encodeWithTag(protoWriter, 2, filterRow.tap_action);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 8, filterRow.ui_avatar);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 6, filterRow.l_title);
        protoAdapter.encodeWithTag(protoWriter, 7, filterRow.l_subtitle);
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, filterRow.title);
        protoAdapter2.encodeWithTag(protoWriter, 5, filterRow.subtitle);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 3, filterRow.avatar);
        protoWriter.writeBytes(filterRow.unknownFields());
    }
}
