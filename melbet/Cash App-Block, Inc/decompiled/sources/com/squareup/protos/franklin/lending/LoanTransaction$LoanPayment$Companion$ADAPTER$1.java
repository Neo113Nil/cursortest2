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
public final class LoanTransaction$LoanPayment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanTransaction.LoanPayment((LoanTransaction.LoanPayment.State) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LoanTransaction.LoanPayment.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanTransaction.LoanPayment loanPayment = (LoanTransaction.LoanPayment) obj;
        reverseProtoWriter.getClass();
        loanPayment.getClass();
        reverseProtoWriter.writeBytes(loanPayment.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, loanPayment.amount);
        LoanTransaction.LoanPayment.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanPayment.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanTransaction.LoanPayment loanPayment = (LoanTransaction.LoanPayment) obj;
        loanPayment.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, loanPayment.amount) + LoanTransaction.LoanPayment.State.ADAPTER.encodedSizeWithTag(1, loanPayment.state) + loanPayment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanTransaction.LoanPayment loanPayment = (LoanTransaction.LoanPayment) obj;
        loanPayment.getClass();
        Money money = loanPayment.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        LoanTransaction.LoanPayment.State state = loanPayment.state;
        byteString.getClass();
        return new LoanTransaction.LoanPayment(state, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanTransaction.LoanPayment loanPayment = (LoanTransaction.LoanPayment) obj;
        loanPayment.getClass();
        LoanTransaction.LoanPayment.State.ADAPTER.encodeWithTag(protoWriter, 1, loanPayment.state);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, loanPayment.amount);
        protoWriter.writeBytes(loanPayment.unknownFields());
    }
}
