package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.metrics.v1.internal.ExponentialHistogramDataPoint;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.internal.PrimitiveLongList;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public class ExponentialHistogramBucketsMarshaler extends MarshalerWithSize {
    private final List<Long> counts;
    private final int offset;

    static ExponentialHistogramBucketsMarshaler create(ExponentialHistogramBuckets exponentialHistogramBuckets) {
        return new ExponentialHistogramBucketsMarshaler(exponentialHistogramBuckets.getOffset(), exponentialHistogramBuckets.getBucketCounts());
    }

    private ExponentialHistogramBucketsMarshaler(int i, List<Long> list) {
        super(calculateSize(i, list));
        this.offset = i;
        this.counts = list;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    protected void writeTo(Serializer serializer) throws IOException {
        serializer.serializeSInt32(ExponentialHistogramDataPoint.Buckets.OFFSET, this.offset);
        if (this.counts instanceof DynamicPrimitiveLongList) {
            serializer.serializeRepeatedUInt64(ExponentialHistogramDataPoint.Buckets.BUCKET_COUNTS, (DynamicPrimitiveLongList) this.counts);
        } else {
            serializer.serializeRepeatedUInt64(ExponentialHistogramDataPoint.Buckets.BUCKET_COUNTS, PrimitiveLongList.toArray(this.counts));
        }
    }

    static int calculateSize(int i, List<Long> list) {
        int sizeRepeatedUInt64;
        int sizeSInt32 = MarshalerUtil.sizeSInt32(ExponentialHistogramDataPoint.Buckets.OFFSET, i);
        if (list instanceof DynamicPrimitiveLongList) {
            sizeRepeatedUInt64 = MarshalerUtil.sizeRepeatedUInt64(ExponentialHistogramDataPoint.Buckets.BUCKET_COUNTS, (DynamicPrimitiveLongList) list);
        } else {
            sizeRepeatedUInt64 = MarshalerUtil.sizeRepeatedUInt64(ExponentialHistogramDataPoint.Buckets.BUCKET_COUNTS, PrimitiveLongList.toArray(list));
        }
        return sizeSInt32 + sizeRepeatedUInt64;
    }
}
