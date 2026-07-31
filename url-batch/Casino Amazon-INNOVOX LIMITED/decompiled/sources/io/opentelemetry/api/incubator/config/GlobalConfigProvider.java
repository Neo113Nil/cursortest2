package io.opentelemetry.api.incubator.config;

import androidx.compose.runtime.CompositionImpl$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class GlobalConfigProvider {
    private static final AtomicReference<ConfigProvider> instance = new AtomicReference<>(ConfigProvider.noop());

    @Nullable
    private static volatile Throwable setInstanceCaller;

    private GlobalConfigProvider() {
    }

    public static ConfigProvider get() {
        return instance.get();
    }

    public static void set(ConfigProvider configProvider) {
        if (!CompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(instance, ConfigProvider.noop(), configProvider) && configProvider != ConfigProvider.noop()) {
            throw new IllegalStateException("GlobalConfigProvider.set has already been called. GlobalConfigProvider.set must be called only once before any calls to GlobalConfigProvider.get. Previous invocation set to cause of this exception.", setInstanceCaller);
        }
        setInstanceCaller = new Throwable();
    }

    public static void resetForTest() {
        instance.set(ConfigProvider.noop());
    }
}
