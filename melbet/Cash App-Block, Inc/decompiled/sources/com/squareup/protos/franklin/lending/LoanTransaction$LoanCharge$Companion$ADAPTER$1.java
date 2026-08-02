package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanTransaction$LoanCharge$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LoanTransaction.LoanCharge((LoanTransaction.LoanCharge.ChargeType) obj, (Money) obj2, (Money) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LoanTransaction.LoanCharge.ChargeType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
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
        LoanTransaction.LoanCharge loanCharge = (LoanTransaction.LoanCharge) obj;
        reverseProtoWriter.getClass();
        loanCharge.getClass();
        reverseProtoWriter.writeBytes(loanCharge.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, loanCharge.missed_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, loanCharge.amount);
        LoanTransaction.LoanCharge.ChargeType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanCharge.charge_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanTransaction.LoanCharge loanCharge = (LoanTransaction.LoanCharge) obj;
        loanCharge.getClass();
        int encodedSizeWithTag = LoanTransaction.LoanCharge.ChargeType.ADAPTER.encodedSizeWithTag(1, loanCharge.charge_type) + loanCharge.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, loanCharge.missed_amount) + protoAdapter.encodedSizeWithTag(2, loanCharge.amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanTransaction.LoanCharge loanCharge = (LoanTransaction.LoanCharge) obj;
        loanCharge.getClass();
        Money money = loanCharge.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = loanCharge.missed_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ByteString byteString = ByteString.EMPTY;
        LoanTransaction.LoanCharge.ChargeType chargeType = loanCharge.charge_type;
        byteString.getClass();
        return new LoanTransaction.LoanCharge(chargeType, money2, money4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanTransaction.LoanCharge loanCharge = (LoanTransaction.LoanCharge) obj;
        loanCharge.getClass();
        LoanTransaction.LoanCharge.ChargeType.ADAPTER.encodeWithTag(protoWriter, 1, loanCharge.charge_type);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, loanCharge.amount);
        protoAdapter.encodeWithTag(protoWriter, 3, loanCharge.missed_amount);
        protoWriter.writeBytes(loanCharge.unknownFields());
    }
}
