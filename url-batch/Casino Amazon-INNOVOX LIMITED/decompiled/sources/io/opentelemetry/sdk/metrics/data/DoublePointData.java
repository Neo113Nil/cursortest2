package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableDoublePointData;
import java.util.List;

/* loaded from: classes3.dex */
public interface DoublePointData extends PointData {
    @Override // io.opentelemetry.sdk.metrics.data.PointData
    List<DoubleExemplarData> getExemplars();

    double getValue();

    static DoublePointData create(long j, long j2, Attributes attributes, double d, List<DoubleExemplarData> list) {
        return ImmutableDoublePointData.create(j, j2, attributes, d, list);
    }
}
