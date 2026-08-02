package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FeeAmounts$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FeeAmounts((Money) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FeeAmounts feeAmounts = (FeeAmounts) obj;
        reverseProtoWriter.getClass();
        feeAmounts.getClass();
        reverseProtoWriter.writeBytes(feeAmounts.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, feeAmounts.international_transaction_fee_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, feeAmounts.atm_operator_fee_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, feeAmounts.cash_app_fee_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FeeAmounts feeAmounts = (FeeAmounts) obj;
        feeAmounts.getClass();
        int size$okio = feeAmounts.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, feeAmounts.international_transaction_fee_amount) + protoAdapter.encodedSizeWithTag(2, feeAmounts.atm_operator_fee_amount) + protoAdapter.encodedSizeWithTag(1, feeAmounts.cash_app_fee_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FeeAmounts feeAmounts = (FeeAmounts) obj;
        feeAmounts.getClass();
        Money money = feeAmounts.cash_app_fee_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = feeAmounts.atm_operator_fee_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = feeAmounts.international_transaction_fee_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FeeAmounts(money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FeeAmounts feeAmounts = (FeeAmounts) obj;
        feeAmounts.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, feeAmounts.cash_app_fee_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, feeAmounts.atm_operator_fee_amount);
        protoAdapter.encodeWithTag(protoWriter, 3, feeAmounts.international_transaction_fee_amount);
        protoWriter.writeBytes(feeAmounts.unknownFields());
    }
}
