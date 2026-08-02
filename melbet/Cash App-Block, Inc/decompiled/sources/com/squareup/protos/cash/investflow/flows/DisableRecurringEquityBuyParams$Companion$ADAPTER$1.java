package com.squareup.protos.cash.investflow.flows;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisableRecurringEquityBuyParams$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DisableRecurringEquityBuyParams((String) obj, (Money) obj2, (RecurringSchedule) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(RecurringSchedule.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisableRecurringEquityBuyParams disableRecurringEquityBuyParams = (DisableRecurringEquityBuyParams) obj;
        reverseProtoWriter.getClass();
        disableRecurringEquityBuyParams.getClass();
        reverseProtoWriter.writeBytes(disableRecurringEquityBuyParams.unknownFields());
        RecurringSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 4, disableRecurringEquityBuyParams.recurring_schedule);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 3, disableRecurringEquityBuyParams.amount);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, disableRecurringEquityBuyParams.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisableRecurringEquityBuyParams disableRecurringEquityBuyParams = (DisableRecurringEquityBuyParams) obj;
        disableRecurringEquityBuyParams.getClass();
        return RecurringSchedule.ADAPTER.encodedSizeWithTag(4, disableRecurringEquityBuyParams.recurring_schedule) + Money.ADAPTER.encodedSizeWithTag(3, disableRecurringEquityBuyParams.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, disableRecurringEquityBuyParams.investment_entity_token) + disableRecurringEquityBuyParams.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisableRecurringEquityBuyParams disableRecurringEquityBuyParams = (DisableRecurringEquityBuyParams) obj;
        disableRecurringEquityBuyParams.getClass();
        Money money = disableRecurringEquityBuyParams.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        RecurringSchedule recurringSchedule = disableRecurringEquityBuyParams.recurring_schedule;
        RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (RecurringSchedule) RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = disableRecurringEquityBuyParams.investment_entity_token;
        byteString.getClass();
        return new DisableRecurringEquityBuyParams(str, money2, recurringSchedule2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisableRecurringEquityBuyParams disableRecurringEquityBuyParams = (DisableRecurringEquityBuyParams) obj;
        disableRecurringEquityBuyParams.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, disableRecurringEquityBuyParams.investment_entity_token);
        Money.ADAPTER.encodeWithTag(protoWriter, 3, disableRecurringEquityBuyParams.amount);
        RecurringSchedule.ADAPTER.encodeWithTag(protoWriter, 4, disableRecurringEquityBuyParams.recurring_schedule);
        protoWriter.writeBytes(disableRecurringEquityBuyParams.unknownFields());
    }
}
