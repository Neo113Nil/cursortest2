package com.squareup.protos.franklin.lending;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoanTransaction$LoanAdjustment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanTransaction.LoanAdjustment((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LoanTransaction.LoanAdjustment loanAdjustment = (LoanTransaction.LoanAdjustment) obj;
        reverseProtoWriter.getClass();
        loanAdjustment.getClass();
        reverseProtoWriter.writeBytes(loanAdjustment.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanAdjustment.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanTransaction.LoanAdjustment loanAdjustment = (LoanTransaction.LoanAdjustment) obj;
        loanAdjustment.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, loanAdjustment.amount) + loanAdjustment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanTransaction.LoanAdjustment loanAdjustment = (LoanTransaction.LoanAdjustment) obj;
        loanAdjustment.getClass();
        Money money = loanAdjustment.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoanTransaction.LoanAdjustment(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanTransaction.LoanAdjustment loanAdjustment = (LoanTransaction.LoanAdjustment) obj;
        loanAdjustment.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, loanAdjustment.amount);
        protoWriter.writeBytes(loanAdjustment.unknownFields());
    }
}
