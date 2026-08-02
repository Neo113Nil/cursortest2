package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityRow;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ActivityStatsElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ActivityStatsElement((GenericProfileElement.ActivityStatsElement.ActivityStats) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GenericProfileElement.ActivityStatsElement.ActivityStats.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ActivityRow.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.ActivityStatsElement activityStatsElement = (GenericProfileElement.ActivityStatsElement) obj;
        reverseProtoWriter.getClass();
        activityStatsElement.getClass();
        reverseProtoWriter.writeBytes(activityStatsElement.unknownFields());
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, activityStatsElement.activity_rows);
        GenericProfileElement.ActivityStatsElement.ActivityStats.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityStatsElement.activity_stats);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ActivityStatsElement activityStatsElement = (GenericProfileElement.ActivityStatsElement) obj;
        activityStatsElement.getClass();
        return ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(2, activityStatsElement.activity_rows) + GenericProfileElement.ActivityStatsElement.ActivityStats.ADAPTER.encodedSizeWithTag(1, activityStatsElement.activity_stats) + activityStatsElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ActivityStatsElement activityStatsElement = (GenericProfileElement.ActivityStatsElement) obj;
        activityStatsElement.getClass();
        GenericProfileElement.ActivityStatsElement.ActivityStats activityStats = activityStatsElement.activity_stats;
        GenericProfileElement.ActivityStatsElement.ActivityStats activityStats2 = activityStats != null ? (GenericProfileElement.ActivityStatsElement.ActivityStats) GenericProfileElement.ActivityStatsElement.ActivityStats.ADAPTER.redact(activityStats) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activityStatsElement.activity_rows, ActivityRow.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.ActivityStatsElement(activityStats2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ActivityStatsElement activityStatsElement = (GenericProfileElement.ActivityStatsElement) obj;
        activityStatsElement.getClass();
        GenericProfileElement.ActivityStatsElement.ActivityStats.ADAPTER.encodeWithTag(protoWriter, 1, activityStatsElement.activity_stats);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, activityStatsElement.activity_rows);
        protoWriter.writeBytes(activityStatsElement.unknownFields());
    }
}
