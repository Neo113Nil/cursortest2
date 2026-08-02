package com.squareup.protos.cash.cryptoinvestflow.service;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DisableRecurringCryptoBuyInitiationData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DisableRecurringCryptoBuyInitiationData((Money) obj, (RecurringSchedule) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(RecurringSchedule.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DisableRecurringCryptoBuyInitiationData disableRecurringCryptoBuyInitiationData = (DisableRecurringCryptoBuyInitiationData) obj;
        reverseProtoWriter.getClass();
        disableRecurringCryptoBuyInitiationData.getClass();
        reverseProtoWriter.writeBytes(disableRecurringCryptoBuyInitiationData.unknownFields());
        RecurringSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 2, disableRecurringCryptoBuyInitiationData.recurring_schedule);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disableRecurringCryptoBuyInitiationData.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DisableRecurringCryptoBuyInitiationData disableRecurringCryptoBuyInitiationData = (DisableRecurringCryptoBuyInitiationData) obj;
        disableRecurringCryptoBuyInitiationData.getClass();
        return RecurringSchedule.ADAPTER.encodedSizeWithTag(2, disableRecurringCryptoBuyInitiationData.recurring_schedule) + Money.ADAPTER.encodedSizeWithTag(1, disableRecurringCryptoBuyInitiationData.amount) + disableRecurringCryptoBuyInitiationData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DisableRecurringCryptoBuyInitiationData disableRecurringCryptoBuyInitiationData = (DisableRecurringCryptoBuyInitiationData) obj;
        disableRecurringCryptoBuyInitiationData.getClass();
        Money money = disableRecurringCryptoBuyInitiationData.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        RecurringSchedule recurringSchedule = disableRecurringCryptoBuyInitiationData.recurring_schedule;
        RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (RecurringSchedule) RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DisableRecurringCryptoBuyInitiationData(money2, recurringSchedule2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DisableRecurringCryptoBuyInitiationData disableRecurringCryptoBuyInitiationData = (DisableRecurringCryptoBuyInitiationData) obj;
        disableRecurringCryptoBuyInitiationData.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, disableRecurringCryptoBuyInitiationData.amount);
        RecurringSchedule.ADAPTER.encodeWithTag(protoWriter, 2, disableRecurringCryptoBuyInitiationData.recurring_schedule);
        protoWriter.writeBytes(disableRecurringCryptoBuyInitiationData.unknownFields());
    }
}
