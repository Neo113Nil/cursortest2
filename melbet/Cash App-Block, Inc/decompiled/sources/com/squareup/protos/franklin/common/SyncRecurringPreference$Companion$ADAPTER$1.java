package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncRecurringPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncRecurringPreference((ScheduledTransactionPreference) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScheduledTransactionPreference.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncRecurringPreference syncRecurringPreference = (SyncRecurringPreference) obj;
        reverseProtoWriter.getClass();
        syncRecurringPreference.getClass();
        reverseProtoWriter.writeBytes(syncRecurringPreference.unknownFields());
        ScheduledTransactionPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncRecurringPreference.preference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncRecurringPreference syncRecurringPreference = (SyncRecurringPreference) obj;
        syncRecurringPreference.getClass();
        return ScheduledTransactionPreference.ADAPTER.encodedSizeWithTag(1, syncRecurringPreference.preference) + syncRecurringPreference.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncRecurringPreference syncRecurringPreference = (SyncRecurringPreference) obj;
        syncRecurringPreference.getClass();
        ScheduledTransactionPreference scheduledTransactionPreference = syncRecurringPreference.preference;
        ScheduledTransactionPreference scheduledTransactionPreference2 = scheduledTransactionPreference != null ? (ScheduledTransactionPreference) ScheduledTransactionPreference.ADAPTER.redact(scheduledTransactionPreference) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncRecurringPreference(scheduledTransactionPreference2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncRecurringPreference syncRecurringPreference = (SyncRecurringPreference) obj;
        syncRecurringPreference.getClass();
        ScheduledTransactionPreference.ADAPTER.encodeWithTag(protoWriter, 1, syncRecurringPreference.preference);
        protoWriter.writeBytes(syncRecurringPreference.unknownFields());
    }
}
