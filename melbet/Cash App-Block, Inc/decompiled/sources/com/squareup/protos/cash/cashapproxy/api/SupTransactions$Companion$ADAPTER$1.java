package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupTransactions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupTransactions((Text) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SupTransactionSummary.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupTransactions supTransactions = (SupTransactions) obj;
        reverseProtoWriter.getClass();
        supTransactions.getClass();
        reverseProtoWriter.writeBytes(supTransactions.unknownFields());
        SupTransactionSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, supTransactions.rows);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, supTransactions.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupTransactions supTransactions = (SupTransactions) obj;
        supTransactions.getClass();
        return SupTransactionSummary.ADAPTER.asRepeated().encodedSizeWithTag(2, supTransactions.rows) + Text.ADAPTER.encodedSizeWithTag(1, supTransactions.title) + supTransactions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupTransactions supTransactions = (SupTransactions) obj;
        supTransactions.getClass();
        Text text = supTransactions.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(supTransactions.rows, SupTransactionSummary.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SupTransactions(text2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupTransactions supTransactions = (SupTransactions) obj;
        supTransactions.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, supTransactions.title);
        SupTransactionSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, supTransactions.rows);
        protoWriter.writeBytes(supTransactions.unknownFields());
    }
}
