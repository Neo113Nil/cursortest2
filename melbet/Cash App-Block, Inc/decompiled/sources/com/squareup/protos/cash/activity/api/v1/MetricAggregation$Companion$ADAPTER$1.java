package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.cash.activity.api.v1.MetricAggregation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/MetricAggregation$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/MetricAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MetricAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MetricAggregation((MetricAggregation.Operation) obj, (MetricAggregation.Field) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = MetricAggregation.Operation.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = MetricAggregation.Field.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MetricAggregation metricAggregation = (MetricAggregation) obj;
        reverseProtoWriter.getClass();
        metricAggregation.getClass();
        reverseProtoWriter.writeBytes(metricAggregation.unknownFields());
        MetricAggregation.Field.ADAPTER.encodeWithTag(reverseProtoWriter, 2, metricAggregation.field);
        MetricAggregation.Operation.ADAPTER.encodeWithTag(reverseProtoWriter, 1, metricAggregation.operation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MetricAggregation metricAggregation = (MetricAggregation) obj;
        metricAggregation.getClass();
        return MetricAggregation.Field.ADAPTER.encodedSizeWithTag(2, metricAggregation.field) + MetricAggregation.Operation.ADAPTER.encodedSizeWithTag(1, metricAggregation.operation) + metricAggregation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MetricAggregation metricAggregation = (MetricAggregation) obj;
        metricAggregation.getClass();
        ByteString byteString = ByteString.EMPTY;
        MetricAggregation.Operation operation2 = metricAggregation.operation;
        MetricAggregation.Field field = metricAggregation.field;
        byteString.getClass();
        return new MetricAggregation(operation2, field, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MetricAggregation metricAggregation = (MetricAggregation) obj;
        metricAggregation.getClass();
        MetricAggregation.Operation.ADAPTER.encodeWithTag(protoWriter, 1, metricAggregation.operation);
        MetricAggregation.Field.ADAPTER.encodeWithTag(protoWriter, 2, metricAggregation.field);
        protoWriter.writeBytes(metricAggregation.unknownFields());
    }
}
