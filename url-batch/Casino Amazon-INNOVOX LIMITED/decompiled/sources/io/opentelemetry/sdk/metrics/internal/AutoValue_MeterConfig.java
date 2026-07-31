package io.opentelemetry.sdk.metrics.internal;

/* loaded from: classes3.dex */
final class AutoValue_MeterConfig extends MeterConfig {
    private final boolean enabled;

    AutoValue_MeterConfig(boolean z) {
        this.enabled = z;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.MeterConfig
    public boolean isEnabled() {
        return this.enabled;
    }

    public String toString() {
        return "MeterConfig{enabled=" + this.enabled + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MeterConfig) && this.enabled == ((MeterConfig) obj).isEnabled();
    }

    public int hashCode() {
        return (this.enabled ? 1231 : 1237) ^ 1000003;
    }
}
