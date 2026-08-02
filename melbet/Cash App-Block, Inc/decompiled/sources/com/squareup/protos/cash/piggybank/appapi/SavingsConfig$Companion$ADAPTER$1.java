package com.squareup.protos.cash.piggybank.appapi;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.piggybank.appapi.SavingsConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsConfig((Integer) obj, (SavingsConfig.SavingsCopy) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(SavingsConfig.SavingsCopy.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        reverseProtoWriter.getClass();
        savingsConfig.getClass();
        reverseProtoWriter.writeBytes(savingsConfig.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, savingsConfig.skip_cash_card_upsell_for_yield_onboarding);
        SavingsConfig.SavingsCopy.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsConfig.savings_copy);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, savingsConfig.max_number_of_goals);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        savingsConfig.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, savingsConfig.skip_cash_card_upsell_for_yield_onboarding) + SavingsConfig.SavingsCopy.ADAPTER.encodedSizeWithTag(3, savingsConfig.savings_copy) + ProtoAdapter.INT32.encodedSizeWithTag(2, savingsConfig.max_number_of_goals) + savingsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        savingsConfig.getClass();
        SavingsConfig.SavingsCopy savingsCopy = savingsConfig.savings_copy;
        SavingsConfig.SavingsCopy savingsCopy2 = savingsCopy != null ? (SavingsConfig.SavingsCopy) SavingsConfig.SavingsCopy.ADAPTER.redact(savingsCopy) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = savingsConfig.max_number_of_goals;
        Boolean bool = savingsConfig.skip_cash_card_upsell_for_yield_onboarding;
        byteString.getClass();
        return new SavingsConfig(num, savingsCopy2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig savingsConfig = (SavingsConfig) obj;
        savingsConfig.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, savingsConfig.max_number_of_goals);
        SavingsConfig.SavingsCopy.ADAPTER.encodeWithTag(protoWriter, 3, savingsConfig.savings_copy);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, savingsConfig.skip_cash_card_upsell_for_yield_onboarding);
        protoWriter.writeBytes(savingsConfig.unknownFields());
    }
}
