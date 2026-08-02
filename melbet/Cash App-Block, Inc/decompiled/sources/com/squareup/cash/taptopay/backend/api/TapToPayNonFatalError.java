package com.squareup.cash.taptopay.backend.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/taptopay/backend/api/TapToPayNonFatalError;", "Lcom/squareup/cash/observability/types/ReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public class TapToPayNonFatalError extends ReportedError {
    public final String message;
    public final Set targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.TapToPay.INSTANCE);

    public TapToPayNonFatalError(String str) {
        this.message = str;
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Set getTargets() {
        return this.targets;
    }
}
