package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.PaymentMgmtSection;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentMgmtSection$BalanceRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentMgmtSection.BalanceRow((LocalizedString) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentMgmtSection.BalanceRow balanceRow = (PaymentMgmtSection.BalanceRow) obj;
        reverseProtoWriter.getClass();
        balanceRow.getClass();
        reverseProtoWriter.writeBytes(balanceRow.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, balanceRow.amount);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, balanceRow.prefix_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentMgmtSection.BalanceRow balanceRow = (PaymentMgmtSection.BalanceRow) obj;
        balanceRow.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, balanceRow.amount) + LocalizedString.ADAPTER.encodedSizeWithTag(1, balanceRow.prefix_text) + balanceRow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentMgmtSection.BalanceRow balanceRow = (PaymentMgmtSection.BalanceRow) obj;
        balanceRow.getClass();
        LocalizedString localizedString = balanceRow.prefix_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Money money = balanceRow.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaymentMgmtSection.BalanceRow(localizedString2, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentMgmtSection.BalanceRow balanceRow = (PaymentMgmtSection.BalanceRow) obj;
        balanceRow.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, balanceRow.prefix_text);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, balanceRow.amount);
        protoWriter.writeBytes(balanceRow.unknownFields());
    }
}
