package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import app.cash.redwood.protocol.host.NodeReuseKt;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSectionHeader;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditLineSectionHeader$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        NodeReuseKt creditLineSectionHeader$Subtitle$TextSubtitle;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        NodeReuseKt nodeReuseKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLineSectionHeader((LocalizedString) obj, (TappableIcon) obj2, (CreditLineType) obj3, (com.squareup.protos.cash.shop.rendering.api.TapAction) obj4, nodeReuseKt, (CreditLineSectionHeader.DisplayEffect) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    try {
                        obj3 = CreditLineType.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER, protoReader, obj4);
                    continue;
                case 4:
                    try {
                        creditLineSectionHeader$Subtitle$TextSubtitle = new CreditLineSectionHeader$Subtitle$CreditLine((CreditLineType) CreditLineType.ADAPTER.decode(protoReader));
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    creditLineSectionHeader$Subtitle$TextSubtitle = new CreditLineSectionHeader$Subtitle$TextSubtitle((LocalizedString) LocalizedString.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    try {
                        obj5 = CreditLineSectionHeader.DisplayEffect.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(TappableIcon.ADAPTER, protoReader, obj2);
                    continue;
                case 8:
                    creditLineSectionHeader$Subtitle$TextSubtitle = new CreditLineSectionHeader$Subtitle$MoneyBar((MoneyBar) MoneyBar.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            nodeReuseKt = creditLineSectionHeader$Subtitle$TextSubtitle;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLineSectionHeader creditLineSectionHeader = (CreditLineSectionHeader) obj;
        reverseProtoWriter.getClass();
        creditLineSectionHeader.getClass();
        reverseProtoWriter.writeBytes(creditLineSectionHeader.unknownFields());
        NodeReuseKt nodeReuseKt = creditLineSectionHeader.subtitle;
        if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$CreditLine) {
            CreditLineType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CreditLineSectionHeader$Subtitle$CreditLine) nodeReuseKt).value);
        } else if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$TextSubtitle) {
            LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CreditLineSectionHeader$Subtitle$TextSubtitle) nodeReuseKt).value);
        } else if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$MoneyBar) {
            MoneyBar.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((CreditLineSectionHeader$Subtitle$MoneyBar) nodeReuseKt).value);
        } else if (nodeReuseKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CreditLineSectionHeader.DisplayEffect.ADAPTER.encodeWithTag(reverseProtoWriter, 6, creditLineSectionHeader.display_effect);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, creditLineSectionHeader.tap_action);
        CreditLineType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, creditLineSectionHeader.credit_line_type);
        TappableIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 7, creditLineSectionHeader.tappable_info);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditLineSectionHeader.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CreditLineSectionHeader creditLineSectionHeader = (CreditLineSectionHeader) obj;
        creditLineSectionHeader.getClass();
        int size$okio = creditLineSectionHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = TappableIcon.ADAPTER.encodedSizeWithTag(7, creditLineSectionHeader.tappable_info) + protoAdapter.encodedSizeWithTag(1, creditLineSectionHeader.title) + size$okio;
        CreditLineType$Companion$ADAPTER$1 creditLineType$Companion$ADAPTER$1 = CreditLineType.ADAPTER;
        int encodedSizeWithTag3 = com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodedSizeWithTag(3, creditLineSectionHeader.tap_action) + creditLineType$Companion$ADAPTER$1.encodedSizeWithTag(2, creditLineSectionHeader.credit_line_type) + encodedSizeWithTag2;
        NodeReuseKt nodeReuseKt = creditLineSectionHeader.subtitle;
        if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$CreditLine) {
            encodedSizeWithTag = creditLineType$Companion$ADAPTER$1.encodedSizeWithTag(4, ((CreditLineSectionHeader$Subtitle$CreditLine) nodeReuseKt).value);
        } else if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$TextSubtitle) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(5, ((CreditLineSectionHeader$Subtitle$TextSubtitle) nodeReuseKt).value);
        } else {
            if (!(nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$MoneyBar)) {
                if (nodeReuseKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return CreditLineSectionHeader.DisplayEffect.ADAPTER.encodedSizeWithTag(6, creditLineSectionHeader.display_effect) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = MoneyBar.ADAPTER.encodedSizeWithTag(8, ((CreditLineSectionHeader$Subtitle$MoneyBar) nodeReuseKt).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return CreditLineSectionHeader.DisplayEffect.ADAPTER.encodedSizeWithTag(6, creditLineSectionHeader.display_effect) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLineSectionHeader creditLineSectionHeader = (CreditLineSectionHeader) obj;
        creditLineSectionHeader.getClass();
        LocalizedString localizedString = creditLineSectionHeader.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        TappableIcon tappableIcon = creditLineSectionHeader.tappable_info;
        TappableIcon tappableIcon2 = tappableIcon != null ? (TappableIcon) TappableIcon.ADAPTER.redact(tappableIcon) : null;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction = creditLineSectionHeader.tap_action;
        com.squareup.protos.cash.shop.rendering.api.TapAction tapAction2 = tapAction != null ? (com.squareup.protos.cash.shop.rendering.api.TapAction) com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.redact(tapAction) : null;
        ByteString byteString = ByteString.EMPTY;
        CreditLineType creditLineType = creditLineSectionHeader.credit_line_type;
        NodeReuseKt nodeReuseKt = creditLineSectionHeader.subtitle;
        CreditLineSectionHeader.DisplayEffect displayEffect = creditLineSectionHeader.display_effect;
        byteString.getClass();
        return new CreditLineSectionHeader(localizedString2, tappableIcon2, creditLineType, tapAction2, nodeReuseKt, displayEffect, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLineSectionHeader creditLineSectionHeader = (CreditLineSectionHeader) obj;
        creditLineSectionHeader.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, creditLineSectionHeader.title);
        TappableIcon.ADAPTER.encodeWithTag(protoWriter, 7, creditLineSectionHeader.tappable_info);
        CreditLineType$Companion$ADAPTER$1 creditLineType$Companion$ADAPTER$1 = CreditLineType.ADAPTER;
        creditLineType$Companion$ADAPTER$1.encodeWithTag(protoWriter, 2, creditLineSectionHeader.credit_line_type);
        com.squareup.protos.cash.shop.rendering.api.TapAction.ADAPTER.encodeWithTag(protoWriter, 3, creditLineSectionHeader.tap_action);
        CreditLineSectionHeader.DisplayEffect.ADAPTER.encodeWithTag(protoWriter, 6, creditLineSectionHeader.display_effect);
        NodeReuseKt nodeReuseKt = creditLineSectionHeader.subtitle;
        if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$CreditLine) {
            creditLineType$Companion$ADAPTER$1.encodeWithTag(protoWriter, 4, ((CreditLineSectionHeader$Subtitle$CreditLine) nodeReuseKt).value);
        } else if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$TextSubtitle) {
            protoAdapter.encodeWithTag(protoWriter, 5, ((CreditLineSectionHeader$Subtitle$TextSubtitle) nodeReuseKt).value);
        } else if (nodeReuseKt instanceof CreditLineSectionHeader$Subtitle$MoneyBar) {
            MoneyBar.ADAPTER.encodeWithTag(protoWriter, 8, ((CreditLineSectionHeader$Subtitle$MoneyBar) nodeReuseKt).value);
        } else if (nodeReuseKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(creditLineSectionHeader.unknownFields());
    }
}
