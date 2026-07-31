package io.opentelemetry.api.internal;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.ContextKey;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class InstrumentationUtil {
    private static final ContextKey<Boolean> SUPPRESS_INSTRUMENTATION_KEY = ContextKey.named("suppress_instrumentation");

    private InstrumentationUtil() {
    }

    public static void suppressInstrumentation(Runnable runnable) {
        Context.current().with(SUPPRESS_INSTRUMENTATION_KEY, true).wrap(runnable).run();
    }

    public static boolean shouldSuppressInstrumentation(Context context) {
        return Objects.equals(context.get(SUPPRESS_INSTRUMENTATION_KEY), true);
    }
}
