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
public final class LoanTransaction$LoanRefund$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LoanTransaction.LoanRefund((Money) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LoanTransaction.LoanRefund loanRefund = (LoanTransaction.LoanRefund) obj;
        reverseProtoWriter.getClass();
        loanRefund.getClass();
        reverseProtoWriter.writeBytes(loanRefund.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, loanRefund.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LoanTransaction.LoanRefund loanRefund = (LoanTransaction.LoanRefund) obj;
        loanRefund.getClass();
        return Money.ADAPTER.encodedSizeWithTag(1, loanRefund.amount) + loanRefund.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LoanTransaction.LoanRefund loanRefund = (LoanTransaction.LoanRefund) obj;
        loanRefund.getClass();
        Money money = loanRefund.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LoanTransaction.LoanRefund(money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LoanTransaction.LoanRefund loanRefund = (LoanTransaction.LoanRefund) obj;
        loanRefund.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, loanRefund.amount);
        protoWriter.writeBytes(loanRefund.unknownFields());
    }
}
