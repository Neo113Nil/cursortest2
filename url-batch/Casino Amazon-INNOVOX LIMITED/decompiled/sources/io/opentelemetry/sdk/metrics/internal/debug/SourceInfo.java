package io.opentelemetry.sdk.metrics.internal.debug;

/* loaded from: classes3.dex */
public interface SourceInfo {
    String multiLineDebugString();

    String shortDebugString();

    static SourceInfo noSourceInfo() {
        return NoSourceInfo.INSTANCE;
    }

    static SourceInfo fromCurrentStack() {
        if (!DebugConfig.isMetricsDebugEnabled()) {
            return noSourceInfo();
        }
        return new StackTraceSourceInfo(Thread.currentThread().getStackTrace());
    }
}
