package com.squareup.cash.taptopay.backend.real;

import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.observability.types.ErrorReporter;

/* loaded from: classes7.dex */
public final class RealTapToPayErrorReporter {
    public final ErrorReporter errorReporter;

    public RealTapToPayErrorReporter(ErrorReporter errorReporter, FeatureFlagManager featureFlagManager) {
        this.errorReporter = errorReporter;
    }
}
