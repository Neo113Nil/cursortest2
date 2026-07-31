package io.opentelemetry.sdk.common.export;

import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.sdk.common.export.AutoValue_RetryPolicy;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Predicate;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class RetryPolicy {
    private static final RetryPolicy DEFAULT = builder().build();
    private static final double DEFAULT_BACKOFF_MULTIPLIER = 1.5d;
    private static final int DEFAULT_INITIAL_BACKOFF_SECONDS = 1;
    private static final int DEFAULT_MAX_ATTEMPTS = 5;
    private static final int DEFAULT_MAX_BACKOFF_SECONDS = 5;

    public abstract double getBackoffMultiplier();

    public abstract Duration getInitialBackoff();

    public abstract int getMaxAttempts();

    public abstract Duration getMaxBackoff();

    @Nullable
    public abstract Predicate<IOException> getRetryExceptionPredicate();

    public abstract RetryPolicyBuilder toBuilder();

    RetryPolicy() {
    }

    public static RetryPolicy getDefault() {
        return DEFAULT;
    }

    public static RetryPolicyBuilder builder() {
        return new AutoValue_RetryPolicy.Builder().setMaxAttempts(5).setInitialBackoff(Duration.ofSeconds(1L)).setMaxBackoff(Duration.ofSeconds(5L)).setBackoffMultiplier(DEFAULT_BACKOFF_MULTIPLIER);
    }

    public static abstract class RetryPolicyBuilder {
        abstract RetryPolicy autoBuild();

        public abstract RetryPolicyBuilder setBackoffMultiplier(double d);

        public abstract RetryPolicyBuilder setInitialBackoff(Duration duration);

        public abstract RetryPolicyBuilder setMaxAttempts(int i);

        public abstract RetryPolicyBuilder setMaxBackoff(Duration duration);

        public abstract RetryPolicyBuilder setRetryExceptionPredicate(Predicate<IOException> predicate);

        RetryPolicyBuilder() {
        }

        public RetryPolicy build() {
            RetryPolicy autoBuild = autoBuild();
            Utils.checkArgument(autoBuild.getMaxAttempts() > 1 && autoBuild.getMaxAttempts() < 6, "maxAttempts must be greater than 1 and less than 6");
            Utils.checkArgument(autoBuild.getInitialBackoff().toNanos() > 0, "initialBackoff must be greater than 0");
            Utils.checkArgument(autoBuild.getMaxBackoff().toNanos() > 0, "maxBackoff must be greater than 0");
            Utils.checkArgument(autoBuild.getBackoffMultiplier() > 0.0d, "backoffMultiplier must be greater than 0");
            return autoBuild;
        }
    }
}
