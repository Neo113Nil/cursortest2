package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TransactionAmountHistory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TransactionAmountHistory(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(TransactionAmountLineItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TransactionAmountHistory transactionAmountHistory = (TransactionAmountHistory) obj;
        reverseProtoWriter.getClass();
        transactionAmountHistory.getClass();
        reverseProtoWriter.writeBytes(transactionAmountHistory.unknownFields());
        TransactionAmountLineItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, transactionAmountHistory.line_items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TransactionAmountHistory transactionAmountHistory = (TransactionAmountHistory) obj;
        transactionAmountHistory.getClass();
        return TransactionAmountLineItem.ADAPTER.asRepeated().encodedSizeWithTag(1, transactionAmountHistory.line_items) + transactionAmountHistory.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TransactionAmountHistory transactionAmountHistory = (TransactionAmountHistory) obj;
        transactionAmountHistory.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(transactionAmountHistory.line_items, TransactionAmountLineItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TransactionAmountHistory(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TransactionAmountHistory transactionAmountHistory = (TransactionAmountHistory) obj;
        transactionAmountHistory.getClass();
        TransactionAmountLineItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, transactionAmountHistory.line_items);
        protoWriter.writeBytes(transactionAmountHistory.unknownFields());
    }
}
