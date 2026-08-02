package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ReimbursedAmounts$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ReimbursedAmounts((Money) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ReimbursedAmounts reimbursedAmounts = (ReimbursedAmounts) obj;
        reverseProtoWriter.getClass();
        reimbursedAmounts.getClass();
        reverseProtoWriter.writeBytes(reimbursedAmounts.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, reimbursedAmounts.international_transaction_fee_reimbursed_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, reimbursedAmounts.atm_operator_fee_reimbursed_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, reimbursedAmounts.cash_app_fee_reimbursed_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReimbursedAmounts reimbursedAmounts = (ReimbursedAmounts) obj;
        reimbursedAmounts.getClass();
        int size$okio = reimbursedAmounts.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, reimbursedAmounts.international_transaction_fee_reimbursed_amount) + protoAdapter.encodedSizeWithTag(2, reimbursedAmounts.atm_operator_fee_reimbursed_amount) + protoAdapter.encodedSizeWithTag(1, reimbursedAmounts.cash_app_fee_reimbursed_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReimbursedAmounts reimbursedAmounts = (ReimbursedAmounts) obj;
        reimbursedAmounts.getClass();
        Money money = reimbursedAmounts.cash_app_fee_reimbursed_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = reimbursedAmounts.atm_operator_fee_reimbursed_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = reimbursedAmounts.international_transaction_fee_reimbursed_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ReimbursedAmounts(money2, money4, money6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReimbursedAmounts reimbursedAmounts = (ReimbursedAmounts) obj;
        reimbursedAmounts.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, reimbursedAmounts.cash_app_fee_reimbursed_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, reimbursedAmounts.atm_operator_fee_reimbursed_amount);
        protoAdapter.encodeWithTag(protoWriter, 3, reimbursedAmounts.international_transaction_fee_reimbursed_amount);
        protoWriter.writeBytes(reimbursedAmounts.unknownFields());
    }
}
