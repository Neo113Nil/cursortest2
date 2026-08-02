package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DisputedTransactionRenderData$DisputedCapture$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisputedTransactionRenderData.DisputedCapture((Money) obj, (Long) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 12:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 13:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 14:
                    m.add(DisputedTransactionRenderData.DisputedCapture.DisputeCase.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisputedTransactionRenderData.DisputedCapture disputedCapture = (DisputedTransactionRenderData.DisputedCapture) obj;
        reverseProtoWriter.getClass();
        disputedCapture.getClass();
        reverseProtoWriter.writeBytes(disputedCapture.unknownFields());
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 14, disputedCapture.capture_dispute_history);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 13, disputedCapture.capture_date);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 12, disputedCapture.capture_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisputedTransactionRenderData.DisputedCapture disputedCapture = (DisputedTransactionRenderData.DisputedCapture) obj;
        disputedCapture.getClass();
        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.ADAPTER.asRepeated().encodedSizeWithTag(14, disputedCapture.capture_dispute_history) + ProtoAdapter.INT64.encodedSizeWithTag(13, disputedCapture.capture_date) + Money.ADAPTER.encodedSizeWithTag(12, disputedCapture.capture_amount) + disputedCapture.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisputedTransactionRenderData.DisputedCapture disputedCapture = (DisputedTransactionRenderData.DisputedCapture) obj;
        disputedCapture.getClass();
        Money money = disputedCapture.capture_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(disputedCapture.capture_dispute_history, DisputedTransactionRenderData.DisputedCapture.DisputeCase.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = disputedCapture.capture_date;
        byteString.getClass();
        return new DisputedTransactionRenderData.DisputedCapture(money2, l, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisputedTransactionRenderData.DisputedCapture disputedCapture = (DisputedTransactionRenderData.DisputedCapture) obj;
        disputedCapture.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 12, disputedCapture.capture_amount);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, disputedCapture.capture_date);
        DisputedTransactionRenderData.DisputedCapture.DisputeCase.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, disputedCapture.capture_dispute_history);
        protoWriter.writeBytes(disputedCapture.unknownFields());
    }
}
