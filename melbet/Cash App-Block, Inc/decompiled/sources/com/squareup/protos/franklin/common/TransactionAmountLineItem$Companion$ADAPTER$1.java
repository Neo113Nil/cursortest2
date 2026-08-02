package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TransactionAmountLineItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransactionAmountLineItem((Long) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransactionAmountLineItem transactionAmountLineItem = (TransactionAmountLineItem) obj;
        reverseProtoWriter.getClass();
        transactionAmountLineItem.getClass();
        reverseProtoWriter.writeBytes(transactionAmountLineItem.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, transactionAmountLineItem.amount);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, transactionAmountLineItem.occurred_at);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransactionAmountLineItem transactionAmountLineItem = (TransactionAmountLineItem) obj;
        transactionAmountLineItem.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, transactionAmountLineItem.amount) + ProtoAdapter.INT64.encodedSizeWithTag(1, transactionAmountLineItem.occurred_at) + transactionAmountLineItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransactionAmountLineItem transactionAmountLineItem = (TransactionAmountLineItem) obj;
        transactionAmountLineItem.getClass();
        Money money = transactionAmountLineItem.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = transactionAmountLineItem.occurred_at;
        byteString.getClass();
        return new TransactionAmountLineItem(l, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransactionAmountLineItem transactionAmountLineItem = (TransactionAmountLineItem) obj;
        transactionAmountLineItem.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, transactionAmountLineItem.occurred_at);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, transactionAmountLineItem.amount);
        protoWriter.writeBytes(transactionAmountLineItem.unknownFields());
    }
}
