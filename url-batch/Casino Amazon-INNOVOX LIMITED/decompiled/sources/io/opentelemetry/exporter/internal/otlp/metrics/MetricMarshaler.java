package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.Metric;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.MetricDataType;
import java.io.IOException;

/* loaded from: classes3.dex */
final class MetricMarshaler extends MarshalerWithSize {
    private final ProtoFieldInfo dataField;
    private final Marshaler dataMarshaler;
    private final byte[] descriptionUtf8;
    private final byte[] nameUtf8;
    private final byte[] unitUtf8;

    static Marshaler create(MetricData metricData) {
        Marshaler create;
        ProtoFieldInfo protoFieldInfo;
        Marshaler marshaler;
        ProtoFieldInfo protoFieldInfo2;
        byte[] bytes = MarshalerUtil.toBytes(metricData.getName());
        byte[] bytes2 = MarshalerUtil.toBytes(metricData.getDescription());
        byte[] bytes3 = MarshalerUtil.toBytes(metricData.getUnit());
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[metricData.getType().ordinal()]) {
            case 1:
                create = GaugeMarshaler.create(metricData.getLongGaugeData());
                protoFieldInfo = Metric.GAUGE;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            case 2:
                create = GaugeMarshaler.create(metricData.getDoubleGaugeData());
                protoFieldInfo = Metric.GAUGE;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            case 3:
                create = SumMarshaler.create(metricData.getLongSumData());
                protoFieldInfo = Metric.SUM;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            case 4:
                create = SumMarshaler.create(metricData.getDoubleSumData());
                protoFieldInfo = Metric.SUM;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            case 5:
                create = SummaryMarshaler.create(metricData.getSummaryData());
                protoFieldInfo = Metric.SUMMARY;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            case 6:
                create = HistogramMarshaler.create(metricData.getHistogramData());
                protoFieldInfo = Metric.HISTOGRAM;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            case 7:
                create = ExponentialHistogramMarshaler.create(metricData.getExponentialHistogramData());
                protoFieldInfo = Metric.EXPONENTIAL_HISTOGRAM;
                marshaler = create;
                protoFieldInfo2 = protoFieldInfo;
                break;
            default:
                marshaler = null;
                protoFieldInfo2 = null;
                break;
        }
        if (marshaler == null || protoFieldInfo2 == null) {
            return NoopMarshaler.INSTANCE;
        }
        return new MetricMarshaler(bytes, bytes2, bytes3, marshaler, protoFieldInfo2);
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.metrics.MetricMarshaler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType;

        static {
            int[] iArr = new int[MetricDataType.values().length];
            $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType = iArr;
            try {
                iArr[MetricDataType.LONG_GAUGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[MetricDataType.DOUBLE_GAUGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[MetricDataType.LONG_SUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[MetricDataType.DOUBLE_SUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[MetricDataType.SUMMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[MetricDataType.HISTOGRAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$sdk$metrics$data$MetricDataType[MetricDataType.EXPONENTIAL_HISTOGRAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private MetricMarshaler(byte[] bArr, byte[] bArr2, byte[] bArr3, Marshaler marshaler, ProtoFieldInfo protoFieldInfo) {
        super(calculateSize(bArr, bArr2, bArr3, marshaler, protoFieldInfo));
        this.nameUtf8 = bArr;
        this.descriptionUtf8 = bArr2;
        this.unitUtf8 = bArr3;
        this.dataMarshaler = marshaler;
        this.dataField = protoFieldInfo;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeString(Metric.NAME, this.nameUtf8);
        serializer.serializeString(Metric.DESCRIPTION, this.descriptionUtf8);
        serializer.serializeString(Metric.UNIT, this.unitUtf8);
        serializer.serializeMessage(this.dataField, this.dataMarshaler);
    }

    private static int calculateSize(byte[] bArr, byte[] bArr2, byte[] bArr3, Marshaler marshaler, ProtoFieldInfo protoFieldInfo) {
        return MarshalerUtil.sizeBytes(Metric.NAME, bArr) + MarshalerUtil.sizeBytes(Metric.DESCRIPTION, bArr2) + MarshalerUtil.sizeBytes(Metric.UNIT, bArr3) + MarshalerUtil.sizeMessage(protoFieldInfo, marshaler);
    }
}
