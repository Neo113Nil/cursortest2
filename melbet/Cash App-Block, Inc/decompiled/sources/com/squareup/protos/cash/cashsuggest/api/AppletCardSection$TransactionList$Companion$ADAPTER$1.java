package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$TransactionList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.TransactionList(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(OrderRow.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.TransactionList transactionList = (AppletCardSection.TransactionList) obj;
        reverseProtoWriter.getClass();
        transactionList.getClass();
        reverseProtoWriter.writeBytes(transactionList.unknownFields());
        OrderRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, transactionList.order_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.TransactionList transactionList = (AppletCardSection.TransactionList) obj;
        transactionList.getClass();
        return OrderRow.ADAPTER.asRepeated().encodedSizeWithTag(1, transactionList.order_rows) + transactionList.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.TransactionList transactionList = (AppletCardSection.TransactionList) obj;
        transactionList.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(transactionList.order_rows, OrderRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AppletCardSection.TransactionList(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.TransactionList transactionList = (AppletCardSection.TransactionList) obj;
        transactionList.getClass();
        OrderRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, transactionList.order_rows);
        protoWriter.writeBytes(transactionList.unknownFields());
    }
}
