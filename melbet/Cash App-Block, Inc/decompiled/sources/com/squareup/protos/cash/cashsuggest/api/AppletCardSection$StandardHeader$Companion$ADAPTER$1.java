package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.TappableIcon;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$StandardHeader$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.StandardHeader((Money) obj, (LocalizedString) obj2, (TappableIcon) obj3, (LocalizedString) obj4, (AppletCardSection.StandardHeader.DisplayStyle) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(TappableIcon.ADAPTER, protoReader, obj3);
            } else if (nextTag == 5) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj5 = AppletCardSection.StandardHeader.DisplayStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.StandardHeader standardHeader = (AppletCardSection.StandardHeader) obj;
        reverseProtoWriter.getClass();
        standardHeader.getClass();
        reverseProtoWriter.writeBytes(standardHeader.unknownFields());
        AppletCardSection.StandardHeader.DisplayStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 6, standardHeader.display_style);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, standardHeader.body);
        TappableIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, standardHeader.amount_caption_tappable_info);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, standardHeader.amount_caption);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, standardHeader.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.StandardHeader standardHeader = (AppletCardSection.StandardHeader) obj;
        standardHeader.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, standardHeader.amount) + standardHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return AppletCardSection.StandardHeader.DisplayStyle.ADAPTER.encodedSizeWithTag(6, standardHeader.display_style) + protoAdapter.encodedSizeWithTag(5, standardHeader.body) + TappableIcon.ADAPTER.encodedSizeWithTag(4, standardHeader.amount_caption_tappable_info) + protoAdapter.encodedSizeWithTag(3, standardHeader.amount_caption) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.StandardHeader standardHeader = (AppletCardSection.StandardHeader) obj;
        standardHeader.getClass();
        Money money = standardHeader.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = standardHeader.amount_caption;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        TappableIcon tappableIcon = standardHeader.amount_caption_tappable_info;
        TappableIcon tappableIcon2 = tappableIcon != null ? (TappableIcon) TappableIcon.ADAPTER.redact(tappableIcon) : null;
        LocalizedString localizedString3 = standardHeader.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        AppletCardSection.StandardHeader.DisplayStyle displayStyle = standardHeader.display_style;
        byteString.getClass();
        return new AppletCardSection.StandardHeader(money2, localizedString2, tappableIcon2, localizedString4, displayStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.StandardHeader standardHeader = (AppletCardSection.StandardHeader) obj;
        standardHeader.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 2, standardHeader.amount);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, standardHeader.amount_caption);
        TappableIcon.ADAPTER.encodeWithTag(protoWriter, 4, standardHeader.amount_caption_tappable_info);
        protoAdapter.encodeWithTag(protoWriter, 5, standardHeader.body);
        AppletCardSection.StandardHeader.DisplayStyle.ADAPTER.encodeWithTag(protoWriter, 6, standardHeader.display_style);
        protoWriter.writeBytes(standardHeader.unknownFields());
    }
}
