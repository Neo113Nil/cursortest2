package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableSummaryPointData;
import java.util.List;

/* loaded from: classes3.dex */
public interface SummaryPointData extends PointData {
    long getCount();

    double getSum();

    List<ValueAtQuantile> getValues();

    static SummaryPointData create(long j, long j2, Attributes attributes, long j3, double d, List<ValueAtQuantile> list) {
        return ImmutableSummaryPointData.create(j, j2, attributes, j3, d, list);
    }
}
