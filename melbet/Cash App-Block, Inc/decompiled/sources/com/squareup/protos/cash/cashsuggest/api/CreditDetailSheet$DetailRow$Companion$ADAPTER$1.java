package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.CreditDetailSheet;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditDetailSheet$DetailRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditDetailSheet.DetailRow((CreditLineType) obj, (CreditDetailSheet.DetailRow.DisplayStyle) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (Icon) obj5, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CreditLineType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj2 = CreditDetailSheet.DetailRow.DisplayStyle.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditDetailSheet.DetailRow detailRow = (CreditDetailSheet.DetailRow) obj;
        reverseProtoWriter.getClass();
        detailRow.getClass();
        reverseProtoWriter.writeBytes(detailRow.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, detailRow.show_footer_divider);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 6, detailRow.tap_action);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, detailRow.accessory_icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, detailRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, detailRow.title);
        CreditDetailSheet.DetailRow.DisplayStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, detailRow.display_style);
        CreditLineType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, detailRow.line_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditDetailSheet.DetailRow detailRow = (CreditDetailSheet.DetailRow) obj;
        detailRow.getClass();
        int encodedSizeWithTag = CreditDetailSheet.DetailRow.DisplayStyle.ADAPTER.encodedSizeWithTag(2, detailRow.display_style) + CreditLineType.ADAPTER.encodedSizeWithTag(1, detailRow.line_type) + detailRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, detailRow.show_footer_divider) + com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(6, detailRow.tap_action) + Icon.ADAPTER.encodedSizeWithTag(5, detailRow.accessory_icon) + protoAdapter.encodedSizeWithTag(4, detailRow.subtitle) + protoAdapter.encodedSizeWithTag(3, detailRow.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditDetailSheet.DetailRow detailRow = (CreditDetailSheet.DetailRow) obj;
        detailRow.getClass();
        LocalizedString localizedString = detailRow.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = detailRow.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Icon icon = detailRow.accessory_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = detailRow.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        CreditLineType creditLineType = detailRow.line_type;
        CreditDetailSheet.DetailRow.DisplayStyle displayStyle = detailRow.display_style;
        Boolean bool = detailRow.show_footer_divider;
        byteString.getClass();
        return new CreditDetailSheet.DetailRow(creditLineType, displayStyle, localizedString2, localizedString4, icon2, tapAction2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditDetailSheet.DetailRow detailRow = (CreditDetailSheet.DetailRow) obj;
        detailRow.getClass();
        CreditLineType.ADAPTER.encodeWithTag(protoWriter, 1, detailRow.line_type);
        CreditDetailSheet.DetailRow.DisplayStyle.ADAPTER.encodeWithTag(protoWriter, 2, detailRow.display_style);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, detailRow.title);
        protoAdapter.encodeWithTag(protoWriter, 4, detailRow.subtitle);
        Icon.ADAPTER.encodeWithTag(protoWriter, 5, detailRow.accessory_icon);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 6, detailRow.tap_action);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, detailRow.show_footer_divider);
        protoWriter.writeBytes(detailRow.unknownFields());
    }
}
