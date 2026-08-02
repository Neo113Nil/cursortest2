package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.groups.GroupExpense;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncGroupExpense$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncGroupExpense((GroupExpense) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GroupExpense.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncGroupExpense syncGroupExpense = (SyncGroupExpense) obj;
        reverseProtoWriter.getClass();
        syncGroupExpense.getClass();
        reverseProtoWriter.writeBytes(syncGroupExpense.unknownFields());
        GroupExpense.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncGroupExpense.expense);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncGroupExpense syncGroupExpense = (SyncGroupExpense) obj;
        syncGroupExpense.getClass();
        return GroupExpense.ADAPTER.encodedSizeWithTag(1, syncGroupExpense.expense) + syncGroupExpense.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncGroupExpense syncGroupExpense = (SyncGroupExpense) obj;
        syncGroupExpense.getClass();
        GroupExpense groupExpense = syncGroupExpense.expense;
        GroupExpense groupExpense2 = groupExpense != null ? (GroupExpense) GroupExpense.ADAPTER.redact(groupExpense) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncGroupExpense(groupExpense2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncGroupExpense syncGroupExpense = (SyncGroupExpense) obj;
        syncGroupExpense.getClass();
        GroupExpense.ADAPTER.encodeWithTag(protoWriter, 1, syncGroupExpense.expense);
        protoWriter.writeBytes(syncGroupExpense.unknownFields());
    }
}
