package io.opentelemetry.sdk.metrics.internal.debug;

import com.facebook.hermes.intl.Constants;
import io.opentelemetry.api.internal.ConfigUtil;

/* loaded from: classes3.dex */
public final class DebugConfig {
    private static final String ENABLE_METRICS_DEBUG_PROPERTY = "otel.experimental.sdk.metrics.debug";
    private static boolean enabled = Boolean.parseBoolean(ConfigUtil.getString(ENABLE_METRICS_DEBUG_PROPERTY, Constants.CASEFIRST_FALSE));

    private DebugConfig() {
    }

    public static boolean isMetricsDebugEnabled() {
        return enabled;
    }

    public static String getHowToEnableMessage() {
        return "To enable better debugging, run your JVM with -Dotel.experimental.sdk.metrics.debug=true";
    }

    public static void enableForTesting(boolean z) {
        enabled = z;
    }
}
