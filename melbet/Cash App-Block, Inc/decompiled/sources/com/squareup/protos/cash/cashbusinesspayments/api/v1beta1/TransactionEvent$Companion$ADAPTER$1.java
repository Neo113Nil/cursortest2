package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TransactionEvent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TransactionEvent((Instant) obj, (Money) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransactionEvent transactionEvent = (TransactionEvent) obj;
        reverseProtoWriter.getClass();
        transactionEvent.getClass();
        reverseProtoWriter.writeBytes(transactionEvent.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, transactionEvent.is_refunded);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, transactionEvent.amount);
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 1, transactionEvent.date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransactionEvent transactionEvent = (TransactionEvent) obj;
        transactionEvent.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, transactionEvent.is_refunded) + Money.ADAPTER.encodedSizeWithTag(2, transactionEvent.amount) + ProtoAdapter.INSTANT.encodedSizeWithTag(1, transactionEvent.date) + transactionEvent.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransactionEvent transactionEvent = (TransactionEvent) obj;
        transactionEvent.getClass();
        Instant instant = transactionEvent.date;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        Money money = transactionEvent.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = transactionEvent.is_refunded;
        byteString.getClass();
        return new TransactionEvent(instant2, money2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransactionEvent transactionEvent = (TransactionEvent) obj;
        transactionEvent.getClass();
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 1, transactionEvent.date);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, transactionEvent.amount);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, transactionEvent.is_refunded);
        protoWriter.writeBytes(transactionEvent.unknownFields());
    }
}
