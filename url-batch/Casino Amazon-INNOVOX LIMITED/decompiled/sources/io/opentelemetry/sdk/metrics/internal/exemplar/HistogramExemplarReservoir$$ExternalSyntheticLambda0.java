package io.opentelemetry.sdk.metrics.internal.exemplar;

import io.opentelemetry.api.common.Attributes;
import java.util.function.BiFunction;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class HistogramExemplarReservoir$$ExternalSyntheticLambda0 implements BiFunction {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((ReservoirCell) obj).getAndResetDouble((Attributes) obj2);
    }
}
