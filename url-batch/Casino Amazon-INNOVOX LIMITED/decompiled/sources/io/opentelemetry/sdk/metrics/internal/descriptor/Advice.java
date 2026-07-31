package io.opentelemetry.sdk.metrics.internal.descriptor;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.sdk.metrics.internal.descriptor.AutoValue_Advice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class Advice {
    private static final Advice EMPTY_ADVICE = builder().build();

    @Nullable
    public abstract List<AttributeKey<?>> getAttributes();

    @Nullable
    public abstract List<Double> getExplicitBucketBoundaries();

    public static Advice empty() {
        return EMPTY_ADVICE;
    }

    public static AdviceBuilder builder() {
        return new AutoValue_Advice.Builder();
    }

    Advice() {
    }

    public boolean hasAttributes() {
        return getAttributes() != null;
    }

    public static abstract class AdviceBuilder {
        abstract AdviceBuilder attributes(@Nullable List<AttributeKey<?>> list);

        public abstract Advice build();

        abstract AdviceBuilder explicitBucketBoundaries(@Nullable List<Double> list);

        AdviceBuilder() {
        }

        public AdviceBuilder setExplicitBucketBoundaries(@Nullable List<Double> list) {
            if (list != null) {
                list = Collections.unmodifiableList(new ArrayList(list));
            }
            return explicitBucketBoundaries(list);
        }

        public AdviceBuilder setAttributes(@Nullable List<AttributeKey<?>> list) {
            if (list != null) {
                list = Collections.unmodifiableList(new ArrayList(list));
            }
            return attributes(list);
        }
    }
}
