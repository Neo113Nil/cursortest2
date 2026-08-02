package com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.balancebasedaddcash.core.models.DisablePreferenceReason;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference$Disabled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceBasedAddCashPreference.Disabled((DisablePreferenceReason) obj, (Boolean) obj2, (BalanceBasedAddCashPreference.DialogBox) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DisablePreferenceReason.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(BalanceBasedAddCashPreference.DialogBox.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceBasedAddCashPreference.Disabled disabled = (BalanceBasedAddCashPreference.Disabled) obj;
        reverseProtoWriter.getClass();
        disabled.getClass();
        reverseProtoWriter.writeBytes(disabled.unknownFields());
        BalanceBasedAddCashPreference.DialogBox.ADAPTER.encodeWithTag(reverseProtoWriter, 3, disabled.locked_dialog_box);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, disabled.is_locked);
        DisablePreferenceReason.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disabled.disable_preference_reason);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceBasedAddCashPreference.Disabled disabled = (BalanceBasedAddCashPreference.Disabled) obj;
        disabled.getClass();
        return BalanceBasedAddCashPreference.DialogBox.ADAPTER.encodedSizeWithTag(3, disabled.locked_dialog_box) + ProtoAdapter.BOOL.encodedSizeWithTag(2, disabled.is_locked) + DisablePreferenceReason.ADAPTER.encodedSizeWithTag(1, disabled.disable_preference_reason) + disabled.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceBasedAddCashPreference.Disabled disabled = (BalanceBasedAddCashPreference.Disabled) obj;
        disabled.getClass();
        BalanceBasedAddCashPreference.DialogBox dialogBox = disabled.locked_dialog_box;
        BalanceBasedAddCashPreference.DialogBox dialogBox2 = dialogBox != null ? (BalanceBasedAddCashPreference.DialogBox) BalanceBasedAddCashPreference.DialogBox.ADAPTER.redact(dialogBox) : null;
        ByteString byteString = ByteString.EMPTY;
        DisablePreferenceReason disablePreferenceReason = disabled.disable_preference_reason;
        Boolean bool = disabled.is_locked;
        byteString.getClass();
        return new BalanceBasedAddCashPreference.Disabled(disablePreferenceReason, bool, dialogBox2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceBasedAddCashPreference.Disabled disabled = (BalanceBasedAddCashPreference.Disabled) obj;
        disabled.getClass();
        DisablePreferenceReason.ADAPTER.encodeWithTag(protoWriter, 1, disabled.disable_preference_reason);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, disabled.is_locked);
        BalanceBasedAddCashPreference.DialogBox.ADAPTER.encodeWithTag(protoWriter, 3, disabled.locked_dialog_box);
        protoWriter.writeBytes(disabled.unknownFields());
    }
}
