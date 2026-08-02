package com.squareup.cash.taptopay.encryption.api;

import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/taptopay/encryption/api/HieroglyphKeyError;", "Lcom/squareup/cash/observability/types/ReportedError;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HieroglyphKeyError extends ReportedError {
    public final String message;
    public final Set targets = ArraysKt___ArraysKt.toSet(new ReportedError.ErrorReportingTarget[]{ReportedError.ErrorReportingTarget.DATADOG, ReportedError.ErrorReportingTarget.LOGS});

    public HieroglyphKeyError(String str) {
        this.message = "HieroglyphKeyError: ".concat(str);
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return ArraysKt___ArraysKt.toSet(new ErrorFeature[]{ErrorFeature.Security.INSTANCE, ErrorFeature.DigitalSigning.INSTANCE});
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
