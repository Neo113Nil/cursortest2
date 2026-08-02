package com.squareup.protos.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CustomAmountPickerData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CustomAmountPickerData((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Money) obj4, (Money) obj5, (Color) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CustomAmountPickerData customAmountPickerData = (CustomAmountPickerData) obj;
        reverseProtoWriter.getClass();
        customAmountPickerData.getClass();
        reverseProtoWriter.writeBytes(customAmountPickerData.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 6, customAmountPickerData.tint_color);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, customAmountPickerData.maximum_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, customAmountPickerData.minimum_amount);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, customAmountPickerData.button_title);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, customAmountPickerData.subtitle);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, customAmountPickerData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CustomAmountPickerData customAmountPickerData = (CustomAmountPickerData) obj;
        customAmountPickerData.getClass();
        int size$okio = customAmountPickerData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, customAmountPickerData.button_title) + protoAdapter.encodedSizeWithTag(2, customAmountPickerData.subtitle) + protoAdapter.encodedSizeWithTag(1, customAmountPickerData.title) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(6, customAmountPickerData.tint_color) + protoAdapter2.encodedSizeWithTag(5, customAmountPickerData.maximum_amount) + protoAdapter2.encodedSizeWithTag(4, customAmountPickerData.minimum_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CustomAmountPickerData customAmountPickerData = (CustomAmountPickerData) obj;
        customAmountPickerData.getClass();
        LocalizedString localizedString = customAmountPickerData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = customAmountPickerData.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = customAmountPickerData.button_title;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        Money money = customAmountPickerData.minimum_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = customAmountPickerData.maximum_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Color color = customAmountPickerData.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CustomAmountPickerData(localizedString2, localizedString4, localizedString6, money2, money4, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CustomAmountPickerData customAmountPickerData = (CustomAmountPickerData) obj;
        customAmountPickerData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, customAmountPickerData.title);
        protoAdapter.encodeWithTag(protoWriter, 2, customAmountPickerData.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, customAmountPickerData.button_title);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, customAmountPickerData.minimum_amount);
        protoAdapter2.encodeWithTag(protoWriter, 5, customAmountPickerData.maximum_amount);
        Color.ADAPTER.encodeWithTag(protoWriter, 6, customAmountPickerData.tint_color);
        protoWriter.writeBytes(customAmountPickerData.unknownFields());
    }
}
