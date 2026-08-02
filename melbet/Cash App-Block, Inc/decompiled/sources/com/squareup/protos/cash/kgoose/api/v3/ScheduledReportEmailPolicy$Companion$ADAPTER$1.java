package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ScheduledReportEmailPolicy;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ScheduledReportEmailPolicy$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ScheduledReportEmailPolicy((Integer) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = (ScheduledReportEmailPolicy) obj;
        reverseProtoWriter.getClass();
        scheduledReportEmailPolicy.getClass();
        reverseProtoWriter.writeBytes(scheduledReportEmailPolicy.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, scheduledReportEmailPolicy.max_raw_result_preview_chars);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, scheduledReportEmailPolicy.max_nested_group_by);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, scheduledReportEmailPolicy.max_metric_tiles);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, scheduledReportEmailPolicy.max_columns);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, scheduledReportEmailPolicy.max_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = (ScheduledReportEmailPolicy) obj;
        scheduledReportEmailPolicy.getClass();
        int size$okio = scheduledReportEmailPolicy.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(5, scheduledReportEmailPolicy.max_raw_result_preview_chars) + protoAdapter.encodedSizeWithTag(4, scheduledReportEmailPolicy.max_nested_group_by) + protoAdapter.encodedSizeWithTag(3, scheduledReportEmailPolicy.max_metric_tiles) + protoAdapter.encodedSizeWithTag(2, scheduledReportEmailPolicy.max_columns) + protoAdapter.encodedSizeWithTag(1, scheduledReportEmailPolicy.max_rows) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = (ScheduledReportEmailPolicy) obj;
        scheduledReportEmailPolicy.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = scheduledReportEmailPolicy.max_rows;
        Integer num2 = scheduledReportEmailPolicy.max_columns;
        Integer num3 = scheduledReportEmailPolicy.max_metric_tiles;
        Integer num4 = scheduledReportEmailPolicy.max_nested_group_by;
        Integer num5 = scheduledReportEmailPolicy.max_raw_result_preview_chars;
        byteString.getClass();
        return new ScheduledReportEmailPolicy(num, num2, num3, num4, num5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ScheduledReportEmailPolicy scheduledReportEmailPolicy = (ScheduledReportEmailPolicy) obj;
        scheduledReportEmailPolicy.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, scheduledReportEmailPolicy.max_rows);
        protoAdapter.encodeWithTag(protoWriter, 2, scheduledReportEmailPolicy.max_columns);
        protoAdapter.encodeWithTag(protoWriter, 3, scheduledReportEmailPolicy.max_metric_tiles);
        protoAdapter.encodeWithTag(protoWriter, 4, scheduledReportEmailPolicy.max_nested_group_by);
        protoAdapter.encodeWithTag(protoWriter, 5, scheduledReportEmailPolicy.max_raw_result_preview_chars);
        protoWriter.writeBytes(scheduledReportEmailPolicy.unknownFields());
    }
}
