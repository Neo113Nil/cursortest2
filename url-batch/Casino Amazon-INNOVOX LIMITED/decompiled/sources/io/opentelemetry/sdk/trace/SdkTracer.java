package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.trace.internal.TracerConfig;

/* loaded from: classes3.dex */
class SdkTracer implements Tracer {
    static final String FALLBACK_SPAN_NAME = "<unspecified span name>";
    private static final boolean INCUBATOR_AVAILABLE;
    private static final Tracer NOOP_TRACER = TracerProvider.noop().get("noop");
    private final InstrumentationScopeInfo instrumentationScopeInfo;
    private final TracerSharedState sharedState;
    protected boolean tracerEnabled;

    static {
        boolean z;
        try {
            Class.forName("io.opentelemetry.api.incubator.trace.ExtendedDefaultTracerProvider");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        INCUBATOR_AVAILABLE = z;
    }

    SdkTracer(TracerSharedState tracerSharedState, InstrumentationScopeInfo instrumentationScopeInfo, TracerConfig tracerConfig) {
        this.sharedState = tracerSharedState;
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.tracerEnabled = tracerConfig.isEnabled();
    }

    static SdkTracer create(TracerSharedState tracerSharedState, InstrumentationScopeInfo instrumentationScopeInfo, TracerConfig tracerConfig) {
        if (INCUBATOR_AVAILABLE) {
            return IncubatingUtil.createExtendedTracer(tracerSharedState, instrumentationScopeInfo, tracerConfig);
        }
        return new SdkTracer(tracerSharedState, instrumentationScopeInfo, tracerConfig);
    }

    @Override // io.opentelemetry.api.trace.Tracer
    public SpanBuilder spanBuilder(String str) {
        if (!this.tracerEnabled) {
            return NOOP_TRACER.spanBuilder(str);
        }
        if (str == null || str.trim().isEmpty()) {
            str = FALLBACK_SPAN_NAME;
        }
        if (this.sharedState.hasBeenShutdown()) {
            return NOOP_TRACER.spanBuilder(str);
        }
        if (INCUBATOR_AVAILABLE) {
            InstrumentationScopeInfo instrumentationScopeInfo = this.instrumentationScopeInfo;
            TracerSharedState tracerSharedState = this.sharedState;
            return IncubatingUtil.createExtendedSpanBuilder(str, instrumentationScopeInfo, tracerSharedState, tracerSharedState.getSpanLimits());
        }
        InstrumentationScopeInfo instrumentationScopeInfo2 = this.instrumentationScopeInfo;
        TracerSharedState tracerSharedState2 = this.sharedState;
        return new SdkSpanBuilder(str, instrumentationScopeInfo2, tracerSharedState2, tracerSharedState2.getSpanLimits());
    }

    InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEnabled() {
        return this.tracerEnabled;
    }

    void updateTracerConfig(TracerConfig tracerConfig) {
        this.tracerEnabled = tracerConfig.isEnabled();
    }
}
