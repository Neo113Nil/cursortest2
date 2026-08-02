package com.squareup.lending.sync_values;

import androidx.room.TransactorKt;
import app.cash.local.presenters.internal.LoyaltyKt;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.lending.Toggle;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ToggleEntryPointData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        LoyaltyKt toggleEntryPointData$Action$PerformToggle;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        LoyaltyKt loyaltyKt = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToggleEntryPointData((Icon) obj3, (ToggleEntryPointData.ToggleState) obj4, loyaltyKt, (LocalizedString) obj5, (LocalizedString) obj6, (ToggleEntryPointData.CardHeader) obj7, (ToggleEntryPointData.CardTabCta) obj8, (String) obj9, (String) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
                    break;
                case 2:
                    try {
                        obj4 = ToggleEntryPointData.ToggleState.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    toggleEntryPointData$Action$PerformToggle = new ToggleEntryPointData$Action$PerformToggle((Toggle) Toggle.ADAPTER.decode(protoReader));
                    loyaltyKt = toggleEntryPointData$Action$PerformToggle;
                    break;
                case 4:
                    toggleEntryPointData$Action$PerformToggle = new ToggleEntryPointData$Action$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
                    loyaltyKt = toggleEntryPointData$Action$PerformToggle;
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj7 = TransactorKt.decodeMessageOrMerge(ToggleEntryPointData.CardHeader.ADAPTER, protoReader, obj7);
                    break;
                case 7:
                    obj8 = TransactorKt.decodeMessageOrMerge(ToggleEntryPointData.CardTabCta.ADAPTER, protoReader, obj8);
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 9:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 10:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj4 = obj;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) obj;
        reverseProtoWriter.getClass();
        toggleEntryPointData.getClass();
        reverseProtoWriter.writeBytes(toggleEntryPointData.unknownFields());
        LoyaltyKt loyaltyKt = toggleEntryPointData.action;
        if (loyaltyKt instanceof ToggleEntryPointData$Action$PerformToggle) {
            Toggle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ToggleEntryPointData$Action$PerformToggle) loyaltyKt).value);
        } else if (loyaltyKt instanceof ToggleEntryPointData$Action$ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((ToggleEntryPointData$Action$ClientRoute) loyaltyKt).value);
        } else if (loyaltyKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, toggleEntryPointData.info_icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, toggleEntryPointData.row_override_url);
        ToggleEntryPointData.CardTabCta.ADAPTER.encodeWithTag(reverseProtoWriter, 7, toggleEntryPointData.card_tab_cta);
        ToggleEntryPointData.CardHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 6, toggleEntryPointData.turned_on_card_header);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, toggleEntryPointData.toggle_subtitle_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, toggleEntryPointData.toggle_text);
        ToggleEntryPointData.ToggleState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, toggleEntryPointData.toggle_state);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, toggleEntryPointData.toggle_icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) obj;
        toggleEntryPointData.getClass();
        int encodedSizeWithTag2 = ToggleEntryPointData.ToggleState.ADAPTER.encodedSizeWithTag(2, toggleEntryPointData.toggle_state) + Icon.ADAPTER.encodedSizeWithTag(1, toggleEntryPointData.toggle_icon) + toggleEntryPointData.unknownFields().getSize$okio();
        LoyaltyKt loyaltyKt = toggleEntryPointData.action;
        if (loyaltyKt instanceof ToggleEntryPointData$Action$PerformToggle) {
            encodedSizeWithTag = Toggle.ADAPTER.encodedSizeWithTag(3, ((ToggleEntryPointData$Action$PerformToggle) loyaltyKt).value);
        } else {
            if (!(loyaltyKt instanceof ToggleEntryPointData$Action$ClientRoute)) {
                if (loyaltyKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
                int encodedSizeWithTag3 = ToggleEntryPointData.CardTabCta.ADAPTER.encodedSizeWithTag(7, toggleEntryPointData.card_tab_cta) + ToggleEntryPointData.CardHeader.ADAPTER.encodedSizeWithTag(6, toggleEntryPointData.turned_on_card_header) + protoAdapter.encodedSizeWithTag(8, toggleEntryPointData.toggle_subtitle_text) + protoAdapter.encodedSizeWithTag(5, toggleEntryPointData.toggle_text) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(10, toggleEntryPointData.info_icon_url) + protoAdapter2.encodedSizeWithTag(9, toggleEntryPointData.row_override_url) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, ((ToggleEntryPointData$Action$ClientRoute) loyaltyKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
        int encodedSizeWithTag32 = ToggleEntryPointData.CardTabCta.ADAPTER.encodedSizeWithTag(7, toggleEntryPointData.card_tab_cta) + ToggleEntryPointData.CardHeader.ADAPTER.encodedSizeWithTag(6, toggleEntryPointData.turned_on_card_header) + protoAdapter3.encodedSizeWithTag(8, toggleEntryPointData.toggle_subtitle_text) + protoAdapter3.encodedSizeWithTag(5, toggleEntryPointData.toggle_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter22 = ProtoAdapter.STRING;
        return protoAdapter22.encodedSizeWithTag(10, toggleEntryPointData.info_icon_url) + protoAdapter22.encodedSizeWithTag(9, toggleEntryPointData.row_override_url) + encodedSizeWithTag32;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) obj;
        toggleEntryPointData.getClass();
        Icon icon = toggleEntryPointData.toggle_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = toggleEntryPointData.toggle_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = toggleEntryPointData.toggle_subtitle_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ToggleEntryPointData.CardHeader cardHeader = toggleEntryPointData.turned_on_card_header;
        ToggleEntryPointData.CardHeader cardHeader2 = cardHeader != null ? (ToggleEntryPointData.CardHeader) ToggleEntryPointData.CardHeader.ADAPTER.redact(cardHeader) : null;
        ToggleEntryPointData.CardTabCta cardTabCta = toggleEntryPointData.card_tab_cta;
        ToggleEntryPointData.CardTabCta cardTabCta2 = cardTabCta != null ? (ToggleEntryPointData.CardTabCta) ToggleEntryPointData.CardTabCta.ADAPTER.redact(cardTabCta) : null;
        ByteString byteString = ByteString.EMPTY;
        ToggleEntryPointData.ToggleState toggleState = toggleEntryPointData.toggle_state;
        LoyaltyKt loyaltyKt = toggleEntryPointData.action;
        String str = toggleEntryPointData.row_override_url;
        String str2 = toggleEntryPointData.info_icon_url;
        byteString.getClass();
        return new ToggleEntryPointData(icon2, toggleState, loyaltyKt, localizedString2, localizedString4, cardHeader2, cardTabCta2, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) obj;
        toggleEntryPointData.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, toggleEntryPointData.toggle_icon);
        ToggleEntryPointData.ToggleState.ADAPTER.encodeWithTag(protoWriter, 2, toggleEntryPointData.toggle_state);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, toggleEntryPointData.toggle_text);
        protoAdapter.encodeWithTag(protoWriter, 8, toggleEntryPointData.toggle_subtitle_text);
        ToggleEntryPointData.CardHeader.ADAPTER.encodeWithTag(protoWriter, 6, toggleEntryPointData.turned_on_card_header);
        ToggleEntryPointData.CardTabCta.ADAPTER.encodeWithTag(protoWriter, 7, toggleEntryPointData.card_tab_cta);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 9, toggleEntryPointData.row_override_url);
        protoAdapter2.encodeWithTag(protoWriter, 10, toggleEntryPointData.info_icon_url);
        LoyaltyKt loyaltyKt = toggleEntryPointData.action;
        if (loyaltyKt instanceof ToggleEntryPointData$Action$PerformToggle) {
            Toggle.ADAPTER.encodeWithTag(protoWriter, 3, ((ToggleEntryPointData$Action$PerformToggle) loyaltyKt).value);
        } else if (loyaltyKt instanceof ToggleEntryPointData$Action$ClientRoute) {
            protoAdapter2.encodeWithTag(protoWriter, 4, ((ToggleEntryPointData$Action$ClientRoute) loyaltyKt).value);
        } else if (loyaltyKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(toggleEntryPointData.unknownFields());
    }
}
