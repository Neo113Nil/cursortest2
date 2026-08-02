package com.squareup.lending;

import androidx.room.TransactorKt;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$ScoreSummaryOverlayData$ListItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem((LocalizedString) obj, (LocalizedString) obj2, (Icon) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (Color) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj6);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem = (CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem) obj;
        reverseProtoWriter.getClass();
        listItem.getClass();
        reverseProtoWriter.writeBytes(listItem.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, listItem.accessory_color);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, listItem.accessory_accessibility_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, listItem.accessory_text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, listItem.accessory_icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, listItem.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, listItem.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem = (CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem) obj;
        listItem.getClass();
        int size$okio = listItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(5, listItem.accessory_color) + protoAdapter.encodedSizeWithTag(4, listItem.accessory_accessibility_description) + protoAdapter.encodedSizeWithTag(3, listItem.accessory_text) + Icon.ADAPTER.encodedSizeWithTag(2, listItem.accessory_icon) + protoAdapter.encodedSizeWithTag(6, listItem.body_text) + protoAdapter.encodedSizeWithTag(1, listItem.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem = (CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem) obj;
        listItem.getClass();
        LocalizedString localizedString = listItem.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = listItem.body_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Icon icon = listItem.accessory_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString5 = listItem.accessory_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = listItem.accessory_accessibility_description;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        Color color = listItem.accessory_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem(localizedString2, localizedString4, icon2, localizedString6, localizedString8, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem listItem = (CashCreditScoreHomeData.ScoreSummaryOverlayData.ListItem) obj;
        listItem.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, listItem.text);
        protoAdapter.encodeWithTag(protoWriter, 6, listItem.body_text);
        Icon.ADAPTER.encodeWithTag(protoWriter, 2, listItem.accessory_icon);
        protoAdapter.encodeWithTag(protoWriter, 3, listItem.accessory_text);
        protoAdapter.encodeWithTag(protoWriter, 4, listItem.accessory_accessibility_description);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, listItem.accessory_color);
        protoWriter.writeBytes(listItem.unknownFields());
    }
}
