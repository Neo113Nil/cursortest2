package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.ExponentialHistogramDataPoint;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.internal.PrimitiveLongList;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class ExponentialHistogramBucketsStatelessMarshaler implements StatelessMarshaler<ExponentialHistogramBuckets> {
    static final ExponentialHistogramBucketsStatelessMarshaler INSTANCE = new ExponentialHistogramBucketsStatelessMarshaler();

    private ExponentialHistogramBucketsStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, ExponentialHistogramBuckets exponentialHistogramBuckets, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeSInt32(ExponentialHistogramDataPoint.Buckets.OFFSET, exponentialHistogramBuckets.getOffset());
        List<Long> bucketCounts = exponentialHistogramBuckets.getBucketCounts();
        if (bucketCounts instanceof DynamicPrimitiveLongList) {
            serializer.serializeRepeatedUInt64(ExponentialHistogramDataPoint.Buckets.BUCKET_COUNTS, (DynamicPrimitiveLongList) bucketCounts);
        } else {
            serializer.serializeRepeatedUInt64(ExponentialHistogramDataPoint.Buckets.BUCKET_COUNTS, PrimitiveLongList.toArray(bucketCounts));
        }
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(ExponentialHistogramBuckets exponentialHistogramBuckets, MarshalerContext marshalerContext) {
        return ExponentialHistogramBucketsMarshaler.calculateSize(exponentialHistogramBuckets.getOffset(), exponentialHistogramBuckets.getBucketCounts());
    }
}
