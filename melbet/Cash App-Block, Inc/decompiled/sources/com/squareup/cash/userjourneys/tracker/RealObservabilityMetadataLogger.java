package com.squareup.cash.userjourneys.tracker;

import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;

/* loaded from: classes.dex */
public final class RealObservabilityMetadataLogger {
    public final BugsnagClient bugsnagClient;
    public final RealObservabilityManager observabilityManager;

    public RealObservabilityMetadataLogger(BugsnagClient bugsnagClient, RealObservabilityManager realObservabilityManager) {
        this.bugsnagClient = bugsnagClient;
        this.observabilityManager = realObservabilityManager;
    }
}
