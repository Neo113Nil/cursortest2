package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ScheduledReloadData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ScheduledReloadData((ScheduledTransactionPreference) obj, (Long) obj2, (String) obj3, (Boolean) obj4, (Money) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScheduledTransactionPreference.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledReloadData scheduledReloadData = (ScheduledReloadData) obj;
        reverseProtoWriter.getClass();
        scheduledReloadData.getClass();
        reverseProtoWriter.writeBytes(scheduledReloadData.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, scheduledReloadData.min_amount);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, scheduledReloadData.supported);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, scheduledReloadData.funding_source);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, scheduledReloadData.next_reload_at);
        ScheduledTransactionPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, scheduledReloadData.scheduled_reload_preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledReloadData scheduledReloadData = (ScheduledReloadData) obj;
        scheduledReloadData.getClass();
        return Money.ADAPTER.encodedSizeWithTag(5, scheduledReloadData.min_amount) + ProtoAdapter.BOOL.encodedSizeWithTag(4, scheduledReloadData.supported) + ProtoAdapter.STRING.encodedSizeWithTag(3, scheduledReloadData.funding_source) + ProtoAdapter.INT64.encodedSizeWithTag(2, scheduledReloadData.next_reload_at) + ScheduledTransactionPreference.ADAPTER.encodedSizeWithTag(1, scheduledReloadData.scheduled_reload_preference) + scheduledReloadData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledReloadData scheduledReloadData = (ScheduledReloadData) obj;
        scheduledReloadData.getClass();
        ScheduledTransactionPreference scheduledTransactionPreference = scheduledReloadData.scheduled_reload_preference;
        ScheduledTransactionPreference scheduledTransactionPreference2 = scheduledTransactionPreference != null ? (ScheduledTransactionPreference) ScheduledTransactionPreference.ADAPTER.redact(scheduledTransactionPreference) : null;
        Money money = scheduledReloadData.min_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = scheduledReloadData.next_reload_at;
        String str = scheduledReloadData.funding_source;
        Boolean bool = scheduledReloadData.supported;
        byteString.getClass();
        return new ScheduledReloadData(scheduledTransactionPreference2, l, str, bool, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledReloadData scheduledReloadData = (ScheduledReloadData) obj;
        scheduledReloadData.getClass();
        ScheduledTransactionPreference.ADAPTER.encodeWithTag(protoWriter, 1, scheduledReloadData.scheduled_reload_preference);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, scheduledReloadData.next_reload_at);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, scheduledReloadData.funding_source);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, scheduledReloadData.supported);
        Money.ADAPTER.encodeWithTag(protoWriter, 5, scheduledReloadData.min_amount);
        protoWriter.writeBytes(scheduledReloadData.unknownFields());
    }
}
