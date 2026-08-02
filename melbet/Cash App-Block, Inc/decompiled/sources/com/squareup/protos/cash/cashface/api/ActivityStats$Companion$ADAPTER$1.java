package com.squareup.protos.cash.cashface.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.api.ActivityStats;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivityStats$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityStats((ActivityStats.Stats) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ActivityStats.Stats.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityStats activityStats = (ActivityStats) obj;
        reverseProtoWriter.getClass();
        activityStats.getClass();
        reverseProtoWriter.writeBytes(activityStats.unknownFields());
        ActivityStats.Stats.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityStats.activity_stats);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityStats activityStats = (ActivityStats) obj;
        activityStats.getClass();
        return ActivityStats.Stats.ADAPTER.encodedSizeWithTag(1, activityStats.activity_stats) + activityStats.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityStats activityStats = (ActivityStats) obj;
        activityStats.getClass();
        ActivityStats.Stats stats = activityStats.activity_stats;
        ActivityStats.Stats stats2 = stats != null ? (ActivityStats.Stats) ActivityStats.Stats.ADAPTER.redact(stats) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ActivityStats(stats2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityStats activityStats = (ActivityStats) obj;
        activityStats.getClass();
        ActivityStats.Stats.ADAPTER.encodeWithTag(protoWriter, 1, activityStats.activity_stats);
        protoWriter.writeBytes(activityStats.unknownFields());
    }
}
