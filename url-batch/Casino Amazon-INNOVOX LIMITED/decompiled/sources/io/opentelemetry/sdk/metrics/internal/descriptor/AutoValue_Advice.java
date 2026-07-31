package io.opentelemetry.sdk.metrics.internal.descriptor;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.sdk.metrics.internal.descriptor.Advice;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class AutoValue_Advice extends Advice {

    @Nullable
    private final List<AttributeKey<?>> attributes;

    @Nullable
    private final List<Double> explicitBucketBoundaries;

    private AutoValue_Advice(@Nullable List<Double> list, @Nullable List<AttributeKey<?>> list2) {
        this.explicitBucketBoundaries = list;
        this.attributes = list2;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.Advice
    @Nullable
    public List<Double> getExplicitBucketBoundaries() {
        return this.explicitBucketBoundaries;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.descriptor.Advice
    @Nullable
    public List<AttributeKey<?>> getAttributes() {
        return this.attributes;
    }

    public String toString() {
        return "Advice{explicitBucketBoundaries=" + this.explicitBucketBoundaries + ", attributes=" + this.attributes + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Advice) {
            Advice advice = (Advice) obj;
            List<Double> list = this.explicitBucketBoundaries;
            if (list != null ? list.equals(advice.getExplicitBucketBoundaries()) : advice.getExplicitBucketBoundaries() == null) {
                List<AttributeKey<?>> list2 = this.attributes;
                if (list2 != null ? list2.equals(advice.getAttributes()) : advice.getAttributes() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<Double> list = this.explicitBucketBoundaries;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        List<AttributeKey<?>> list2 = this.attributes;
        return hashCode ^ (list2 != null ? list2.hashCode() : 0);
    }

    static final class Builder extends Advice.AdviceBuilder {
        private List<AttributeKey<?>> attributes;
        private List<Double> explicitBucketBoundaries;

        Builder() {
        }

        @Override // io.opentelemetry.sdk.metrics.internal.descriptor.Advice.AdviceBuilder
        Advice.AdviceBuilder explicitBucketBoundaries(@Nullable List<Double> list) {
            this.explicitBucketBoundaries = list;
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.descriptor.Advice.AdviceBuilder
        Advice.AdviceBuilder attributes(@Nullable List<AttributeKey<?>> list) {
            this.attributes = list;
            return this;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.descriptor.Advice.AdviceBuilder
        public Advice build() {
            return new AutoValue_Advice(this.explicitBucketBoundaries, this.attributes);
        }
    }
}
