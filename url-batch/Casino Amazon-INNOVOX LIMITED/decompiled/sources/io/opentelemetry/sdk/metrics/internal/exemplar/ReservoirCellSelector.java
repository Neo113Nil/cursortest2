package io.opentelemetry.sdk.metrics.internal.exemplar;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* loaded from: classes3.dex */
interface ReservoirCellSelector {
    int reservoirCellIndexFor(ReservoirCell[] reservoirCellArr, double d, Attributes attributes, Context context);

    int reservoirCellIndexFor(ReservoirCell[] reservoirCellArr, long j, Attributes attributes, Context context);

    void reset();
}
