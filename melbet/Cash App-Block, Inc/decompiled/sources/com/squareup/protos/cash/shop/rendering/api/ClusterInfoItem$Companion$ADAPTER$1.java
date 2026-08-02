package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.ClusterInfoItem;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClusterInfoItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ClusterInfoItem((LocalizedString) obj, (TapAction) obj2, (Button) obj3, (ClusterInfoItem.ClusterColorTheme) obj4, (AnalyticsEvent) obj5, (FormattedDetail) obj6, (StyledText) obj7, (Color) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj7 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj7);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(TapAction.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj8);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(AnalyticsEvent.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(FormattedDetail.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    try {
                        obj4 = ClusterInfoItem.ClusterColorTheme.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 8:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClusterInfoItem clusterInfoItem = (ClusterInfoItem) obj;
        reverseProtoWriter.getClass();
        clusterInfoItem.getClass();
        reverseProtoWriter.writeBytes(clusterInfoItem.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, clusterInfoItem.background_color);
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clusterInfoItem.title);
        FormattedDetail.ADAPTER.encodeWithTag(reverseProtoWriter, 6, clusterInfoItem.formatted_details);
        AnalyticsEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 5, clusterInfoItem.analytics_view_event);
        ClusterInfoItem.ClusterColorTheme.ADAPTER.encodeWithTag(reverseProtoWriter, 7, clusterInfoItem.color_theme);
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, clusterInfoItem.button);
        TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clusterInfoItem.tap_action);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, clusterInfoItem.l_title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClusterInfoItem clusterInfoItem = (ClusterInfoItem) obj;
        clusterInfoItem.getClass();
        return Color.ADAPTER.encodedSizeWithTag(4, clusterInfoItem.background_color) + StyledText.ADAPTER.encodedSizeWithTag(1, clusterInfoItem.title) + FormattedDetail.ADAPTER.encodedSizeWithTag(6, clusterInfoItem.formatted_details) + AnalyticsEvent.ADAPTER.encodedSizeWithTag(5, clusterInfoItem.analytics_view_event) + ClusterInfoItem.ClusterColorTheme.ADAPTER.encodedSizeWithTag(7, clusterInfoItem.color_theme) + Button.ADAPTER.encodedSizeWithTag(3, clusterInfoItem.button) + TapAction.ADAPTER.encodedSizeWithTag(2, clusterInfoItem.tap_action) + LocalizedString.ADAPTER.encodedSizeWithTag(8, clusterInfoItem.l_title) + clusterInfoItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClusterInfoItem clusterInfoItem = (ClusterInfoItem) obj;
        clusterInfoItem.getClass();
        LocalizedString localizedString = clusterInfoItem.l_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        TapAction tapAction = clusterInfoItem.tap_action;
        TapAction tapAction2 = tapAction != null ? (TapAction) TapAction.ADAPTER.redact(tapAction) : null;
        Button button = clusterInfoItem.button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        AnalyticsEvent analyticsEvent = clusterInfoItem.analytics_view_event;
        AnalyticsEvent analyticsEvent2 = analyticsEvent != null ? (AnalyticsEvent) AnalyticsEvent.ADAPTER.redact(analyticsEvent) : null;
        FormattedDetail formattedDetail = clusterInfoItem.formatted_details;
        FormattedDetail formattedDetail2 = formattedDetail != null ? (FormattedDetail) FormattedDetail.ADAPTER.redact(formattedDetail) : null;
        StyledText styledText = clusterInfoItem.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        Color color = clusterInfoItem.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        ClusterInfoItem.ClusterColorTheme clusterColorTheme = clusterInfoItem.color_theme;
        byteString.getClass();
        return new ClusterInfoItem(localizedString2, tapAction2, button2, clusterColorTheme, analyticsEvent2, formattedDetail2, styledText2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClusterInfoItem clusterInfoItem = (ClusterInfoItem) obj;
        clusterInfoItem.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 8, clusterInfoItem.l_title);
        TapAction.ADAPTER.encodeWithTag(protoWriter, 2, clusterInfoItem.tap_action);
        Button.ADAPTER.encodeWithTag(protoWriter, 3, clusterInfoItem.button);
        ClusterInfoItem.ClusterColorTheme.ADAPTER.encodeWithTag(protoWriter, 7, clusterInfoItem.color_theme);
        AnalyticsEvent.ADAPTER.encodeWithTag(protoWriter, 5, clusterInfoItem.analytics_view_event);
        FormattedDetail.ADAPTER.encodeWithTag(protoWriter, 6, clusterInfoItem.formatted_details);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 1, clusterInfoItem.title);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, clusterInfoItem.background_color);
        protoWriter.writeBytes(clusterInfoItem.unknownFields());
    }
}
