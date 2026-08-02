package com.squareup.protos.cash.woodrow.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PerformanceSummary((Money) obj, (Money) obj2, (Money) obj3, (Money) obj4, (Instant) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PerformanceSummary performanceSummary = (PerformanceSummary) obj;
        reverseProtoWriter.getClass();
        performanceSummary.getClass();
        reverseProtoWriter.writeBytes(performanceSummary.unknownFields());
        Instant instant = performanceSummary.version;
        if (instant != null) {
            ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 6, instant);
        }
        Money money = performanceSummary.unrealized_total_cost;
        if (money != null) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, money);
        }
        Money money2 = performanceSummary.unrealized_quantity;
        if (money2 != null) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, money2);
        }
        Money money3 = performanceSummary.realized_total_cost;
        if (money3 != null) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, money3);
        }
        Money money4 = performanceSummary.realized_gain_loss;
        if (money4 != null) {
            Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, money4);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PerformanceSummary performanceSummary = (PerformanceSummary) obj;
        performanceSummary.getClass();
        int size$okio = performanceSummary.unknownFields().getSize$okio();
        Money money = performanceSummary.realized_gain_loss;
        if (money != null) {
            size$okio += Money.ADAPTER.encodedSizeWithTag(1, money);
        }
        Money money2 = performanceSummary.realized_total_cost;
        if (money2 != null) {
            size$okio += Money.ADAPTER.encodedSizeWithTag(2, money2);
        }
        Money money3 = performanceSummary.unrealized_quantity;
        if (money3 != null) {
            size$okio += Money.ADAPTER.encodedSizeWithTag(3, money3);
        }
        Money money4 = performanceSummary.unrealized_total_cost;
        if (money4 != null) {
            size$okio += Money.ADAPTER.encodedSizeWithTag(4, money4);
        }
        Instant instant = performanceSummary.version;
        return instant != null ? ProtoAdapter.INSTANT.encodedSizeWithTag(6, instant) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PerformanceSummary performanceSummary = (PerformanceSummary) obj;
        performanceSummary.getClass();
        Money money = performanceSummary.realized_gain_loss;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = performanceSummary.realized_total_cost;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = performanceSummary.unrealized_quantity;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = performanceSummary.unrealized_total_cost;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Instant instant = performanceSummary.version;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PerformanceSummary(money2, money4, money6, money8, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PerformanceSummary performanceSummary = (PerformanceSummary) obj;
        performanceSummary.getClass();
        Money money = performanceSummary.realized_gain_loss;
        if (money != null) {
            Money.ADAPTER.encodeWithTag(protoWriter, 1, money);
        }
        Money money2 = performanceSummary.realized_total_cost;
        if (money2 != null) {
            Money.ADAPTER.encodeWithTag(protoWriter, 2, money2);
        }
        Money money3 = performanceSummary.unrealized_quantity;
        if (money3 != null) {
            Money.ADAPTER.encodeWithTag(protoWriter, 3, money3);
        }
        Money money4 = performanceSummary.unrealized_total_cost;
        if (money4 != null) {
            Money.ADAPTER.encodeWithTag(protoWriter, 4, money4);
        }
        Instant instant = performanceSummary.version;
        if (instant != null) {
            ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 6, instant);
        }
        protoWriter.writeBytes(performanceSummary.unknownFields());
    }
}
