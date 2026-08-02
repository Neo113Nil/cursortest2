package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupTransactionSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupTransactionSummary(m, (Instant) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(RowItem.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupTransactionSummary supTransactionSummary = (SupTransactionSummary) obj;
        reverseProtoWriter.getClass();
        supTransactionSummary.getClass();
        reverseProtoWriter.writeBytes(supTransactionSummary.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 2, supTransactionSummary.created_time);
        RowItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, supTransactionSummary.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupTransactionSummary supTransactionSummary = (SupTransactionSummary) obj;
        supTransactionSummary.getClass();
        return ProtoAdapter.INSTANT.encodedSizeWithTag(2, supTransactionSummary.created_time) + RowItem.ADAPTER.asRepeated().encodedSizeWithTag(1, supTransactionSummary.details) + supTransactionSummary.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupTransactionSummary supTransactionSummary = (SupTransactionSummary) obj;
        supTransactionSummary.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(supTransactionSummary.details, RowItem.ADAPTER);
        Instant instant = supTransactionSummary.created_time;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SupTransactionSummary(m1169redactElements, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupTransactionSummary supTransactionSummary = (SupTransactionSummary) obj;
        supTransactionSummary.getClass();
        RowItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, supTransactionSummary.details);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 2, supTransactionSummary.created_time);
        protoWriter.writeBytes(supTransactionSummary.unknownFields());
    }
}
