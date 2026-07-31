package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.internal.data.ImmutableSummaryData;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface SummaryData extends Data<SummaryPointData> {
    static SummaryData create(Collection<SummaryPointData> collection) {
        return ImmutableSummaryData.create(collection);
    }
}
