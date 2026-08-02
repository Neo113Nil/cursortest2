package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$Breakdown$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingRenderData.Breakdown((Money) obj, (Money) obj2, (Money) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData.Breakdown breakdown = (LendingRenderData.Breakdown) obj;
        reverseProtoWriter.getClass();
        breakdown.getClass();
        reverseProtoWriter.writeBytes(breakdown.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, breakdown.interest_owing_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, breakdown.late_fees_owing_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, breakdown.setup_fee_owing_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, breakdown.principal_owing_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData.Breakdown breakdown = (LendingRenderData.Breakdown) obj;
        breakdown.getClass();
        int size$okio = breakdown.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, breakdown.interest_owing_amount) + protoAdapter.encodedSizeWithTag(3, breakdown.late_fees_owing_amount) + protoAdapter.encodedSizeWithTag(2, breakdown.setup_fee_owing_amount) + protoAdapter.encodedSizeWithTag(1, breakdown.principal_owing_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData.Breakdown breakdown = (LendingRenderData.Breakdown) obj;
        breakdown.getClass();
        Money money = breakdown.principal_owing_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = breakdown.setup_fee_owing_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = breakdown.late_fees_owing_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = breakdown.interest_owing_amount;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LendingRenderData.Breakdown(money2, money4, money6, money8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData.Breakdown breakdown = (LendingRenderData.Breakdown) obj;
        breakdown.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, breakdown.principal_owing_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, breakdown.setup_fee_owing_amount);
        protoAdapter.encodeWithTag(protoWriter, 3, breakdown.late_fees_owing_amount);
        protoAdapter.encodeWithTag(protoWriter, 4, breakdown.interest_owing_amount);
        protoWriter.writeBytes(breakdown.unknownFields());
    }
}
