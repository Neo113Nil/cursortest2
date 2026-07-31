package io.opentelemetry.exporter.internal;

import io.opentelemetry.context.Context;

@Deprecated
/* loaded from: classes3.dex */
public final class InstrumentationUtil {
    private InstrumentationUtil() {
    }

    public static void suppressInstrumentation(Runnable runnable) {
        io.opentelemetry.api.internal.InstrumentationUtil.suppressInstrumentation(runnable);
    }

    public static boolean shouldSuppressInstrumentation(Context context) {
        return io.opentelemetry.api.internal.InstrumentationUtil.shouldSuppressInstrumentation(context);
    }
}
