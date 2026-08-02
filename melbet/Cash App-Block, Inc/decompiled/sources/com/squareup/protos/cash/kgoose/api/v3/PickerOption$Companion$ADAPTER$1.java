package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.kgoose.api.v3.PickerOption;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PickerOption$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PickerOption;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PickerOption$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        PickerOption.Icon savingsGoalIcon;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        PickerOption.Icon icon = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PickerOption((String) obj, (LocalizedString) obj2, icon, (LocalizedString) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                if (nextTag == 6) {
                    savingsGoalIcon = new PickerOption.Icon.SavingsGoalIcon((SavingsGoalIcon) SavingsGoalIcon.ADAPTER.decode(protoReader));
                } else if (nextTag != 7) {
                    protoReader.readUnknownField(nextTag);
                } else {
                    savingsGoalIcon = new PickerOption.Icon.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(protoReader));
                }
                icon = savingsGoalIcon;
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PickerOption pickerOption = (PickerOption) obj;
        reverseProtoWriter.getClass();
        pickerOption.getClass();
        reverseProtoWriter.writeBytes(pickerOption.unknownFields());
        PickerOption.Icon icon = pickerOption.icon;
        if (icon instanceof PickerOption.Icon.SavingsGoalIcon) {
            SavingsGoalIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((PickerOption.Icon.SavingsGoalIcon) icon).getValue());
        } else if (icon instanceof PickerOption.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((PickerOption.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, pickerOption.max_amount);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, pickerOption.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pickerOption.label);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, pickerOption.value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PickerOption pickerOption = (PickerOption) obj;
        pickerOption.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.STRING.encodedSizeWithTag(1, pickerOption.value) + pickerOption.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(2, pickerOption.label) + encodedSizeWithTag2;
        PickerOption.Icon icon = pickerOption.icon;
        if (icon instanceof PickerOption.Icon.SavingsGoalIcon) {
            encodedSizeWithTag = SavingsGoalIcon.ADAPTER.encodedSizeWithTag(6, ((PickerOption.Icon.SavingsGoalIcon) icon).getValue());
        } else {
            if (!(icon instanceof PickerOption.Icon.Avatar)) {
                if (icon != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return Money.ADAPTER.encodedSizeWithTag(5, pickerOption.max_amount) + protoAdapter.encodedSizeWithTag(4, pickerOption.subtitle) + encodedSizeWithTag3;
            }
            encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(7, ((PickerOption.Icon.Avatar) icon).getValue());
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        return Money.ADAPTER.encodedSizeWithTag(5, pickerOption.max_amount) + protoAdapter.encodedSizeWithTag(4, pickerOption.subtitle) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PickerOption pickerOption = (PickerOption) obj;
        pickerOption.getClass();
        LocalizedString localizedString = pickerOption.label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = pickerOption.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Money money = pickerOption.max_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = pickerOption.value;
        PickerOption.Icon icon = pickerOption.icon;
        byteString.getClass();
        return new PickerOption(str, localizedString2, icon, localizedString4, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PickerOption pickerOption = (PickerOption) obj;
        pickerOption.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pickerOption.value);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, pickerOption.label);
        protoAdapter.encodeWithTag(protoWriter, 4, pickerOption.subtitle);
        Money.ADAPTER.encodeWithTag(protoWriter, 5, pickerOption.max_amount);
        PickerOption.Icon icon = pickerOption.icon;
        if (icon instanceof PickerOption.Icon.SavingsGoalIcon) {
            SavingsGoalIcon.ADAPTER.encodeWithTag(protoWriter, 6, ((PickerOption.Icon.SavingsGoalIcon) icon).getValue());
        } else if (icon instanceof PickerOption.Icon.Avatar) {
            UiAvatar.ADAPTER.encodeWithTag(protoWriter, 7, ((PickerOption.Icon.Avatar) icon).getValue());
        } else if (icon != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(pickerOption.unknownFields());
    }
}
