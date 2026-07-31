package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.Summary;
import io.opentelemetry.sdk.metrics.data.SummaryData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class SummaryMarshaler extends MarshalerWithSize {
    private final SummaryDataPointMarshaler[] dataPoints;

    static SummaryMarshaler create(SummaryData summaryData) {
        return new SummaryMarshaler(SummaryDataPointMarshaler.createRepeated(summaryData.getPoints()));
    }

    private SummaryMarshaler(SummaryDataPointMarshaler[] summaryDataPointMarshalerArr) {
        super(calculateSize(summaryDataPointMarshalerArr));
        this.dataPoints = summaryDataPointMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(Summary.DATA_POINTS, this.dataPoints);
    }

    private static int calculateSize(SummaryDataPointMarshaler[] summaryDataPointMarshalerArr) {
        return MarshalerUtil.sizeRepeatedMessage(Summary.DATA_POINTS, summaryDataPointMarshalerArr);
    }
}
