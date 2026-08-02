package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BankingConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankingConfig((BankingConfig.Strings) obj, (BankingConfig.RecurringDepositsDdaUpsell) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BankingConfig.Strings.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BankingConfig.RecurringDepositsDdaUpsell.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankingConfig bankingConfig = (BankingConfig) obj;
        reverseProtoWriter.getClass();
        bankingConfig.getClass();
        reverseProtoWriter.writeBytes(bankingConfig.unknownFields());
        BankingConfig.RecurringDepositsDdaUpsell.ADAPTER.encodeWithTag(reverseProtoWriter, 2, bankingConfig.recurring_deposits_dda_upsell);
        BankingConfig.Strings.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bankingConfig.strings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankingConfig bankingConfig = (BankingConfig) obj;
        bankingConfig.getClass();
        return BankingConfig.RecurringDepositsDdaUpsell.ADAPTER.encodedSizeWithTag(2, bankingConfig.recurring_deposits_dda_upsell) + BankingConfig.Strings.ADAPTER.encodedSizeWithTag(1, bankingConfig.strings) + bankingConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankingConfig bankingConfig = (BankingConfig) obj;
        bankingConfig.getClass();
        BankingConfig.Strings strings = bankingConfig.strings;
        BankingConfig.Strings strings2 = strings != null ? (BankingConfig.Strings) BankingConfig.Strings.ADAPTER.redact(strings) : null;
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell = bankingConfig.recurring_deposits_dda_upsell;
        BankingConfig.RecurringDepositsDdaUpsell recurringDepositsDdaUpsell2 = recurringDepositsDdaUpsell != null ? (BankingConfig.RecurringDepositsDdaUpsell) BankingConfig.RecurringDepositsDdaUpsell.ADAPTER.redact(recurringDepositsDdaUpsell) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BankingConfig(strings2, recurringDepositsDdaUpsell2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankingConfig bankingConfig = (BankingConfig) obj;
        bankingConfig.getClass();
        BankingConfig.Strings.ADAPTER.encodeWithTag(protoWriter, 1, bankingConfig.strings);
        BankingConfig.RecurringDepositsDdaUpsell.ADAPTER.encodeWithTag(protoWriter, 2, bankingConfig.recurring_deposits_dda_upsell);
        protoWriter.writeBytes(bankingConfig.unknownFields());
    }
}
