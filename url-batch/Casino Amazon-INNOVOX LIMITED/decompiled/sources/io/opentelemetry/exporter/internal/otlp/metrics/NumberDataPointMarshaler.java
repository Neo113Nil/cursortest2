package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.NumberDataPoint;
import io.opentelemetry.sdk.metrics.data.DoublePointData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import io.opentelemetry.sdk.metrics.data.PointData;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class NumberDataPointMarshaler extends MarshalerWithSize {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final KeyValueMarshaler[] attributes;
    private final ExemplarMarshaler[] exemplars;
    private final long startTimeUnixNano;
    private final long timeUnixNano;
    private final PointData value;
    private final ProtoFieldInfo valueField;

    static NumberDataPointMarshaler[] createRepeated(Collection<? extends PointData> collection) {
        NumberDataPointMarshaler[] numberDataPointMarshalerArr = new NumberDataPointMarshaler[collection.size()];
        Iterator<? extends PointData> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            numberDataPointMarshalerArr[i] = create(it.next());
            i++;
        }
        return numberDataPointMarshalerArr;
    }

    static NumberDataPointMarshaler create(PointData pointData) {
        return new NumberDataPointMarshaler(pointData.getStartEpochNanos(), pointData.getEpochNanos(), pointData, toProtoPointValueType(pointData), ExemplarMarshaler.createRepeated(pointData.getExemplars()), KeyValueMarshaler.createForAttributes(pointData.getAttributes()));
    }

    private NumberDataPointMarshaler(long j, long j2, PointData pointData, ProtoFieldInfo protoFieldInfo, ExemplarMarshaler[] exemplarMarshalerArr, KeyValueMarshaler[] keyValueMarshalerArr) {
        super(calculateSize(j, j2, protoFieldInfo, pointData, exemplarMarshalerArr, keyValueMarshalerArr));
        this.startTimeUnixNano = j;
        this.timeUnixNano = j2;
        this.value = pointData;
        this.valueField = protoFieldInfo;
        this.exemplars = exemplarMarshalerArr;
        this.attributes = keyValueMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeFixed64(NumberDataPoint.START_TIME_UNIX_NANO, this.startTimeUnixNano);
        serializer.serializeFixed64(NumberDataPoint.TIME_UNIX_NANO, this.timeUnixNano);
        if (this.valueField == NumberDataPoint.AS_INT) {
            serializer.serializeFixed64Optional(this.valueField, ((LongPointData) this.value).getValue());
        } else {
            serializer.serializeDoubleOptional(this.valueField, ((DoublePointData) this.value).getValue());
        }
        serializer.serializeRepeatedMessage(NumberDataPoint.EXEMPLARS, this.exemplars);
        serializer.serializeRepeatedMessage(NumberDataPoint.ATTRIBUTES, this.attributes);
    }

    private static int calculateSize(long j, long j2, ProtoFieldInfo protoFieldInfo, PointData pointData, ExemplarMarshaler[] exemplarMarshalerArr, KeyValueMarshaler[] keyValueMarshalerArr) {
        int sizeDoubleOptional;
        int sizeFixed64 = MarshalerUtil.sizeFixed64(NumberDataPoint.START_TIME_UNIX_NANO, j) + MarshalerUtil.sizeFixed64(NumberDataPoint.TIME_UNIX_NANO, j2);
        if (protoFieldInfo == NumberDataPoint.AS_INT) {
            sizeDoubleOptional = MarshalerUtil.sizeFixed64Optional(protoFieldInfo, ((LongPointData) pointData).getValue());
        } else {
            sizeDoubleOptional = MarshalerUtil.sizeDoubleOptional(protoFieldInfo, ((DoublePointData) pointData).getValue());
        }
        return sizeFixed64 + sizeDoubleOptional + MarshalerUtil.sizeRepeatedMessage(NumberDataPoint.EXEMPLARS, exemplarMarshalerArr) + MarshalerUtil.sizeRepeatedMessage(NumberDataPoint.ATTRIBUTES, keyValueMarshalerArr);
    }

    static ProtoFieldInfo toProtoPointValueType(PointData pointData) {
        if (pointData instanceof LongPointData) {
            return NumberDataPoint.AS_INT;
        }
        return NumberDataPoint.AS_DOUBLE;
    }
}
