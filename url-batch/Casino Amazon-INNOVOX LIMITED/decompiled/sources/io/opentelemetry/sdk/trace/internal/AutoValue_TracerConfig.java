package io.opentelemetry.sdk.trace.internal;

/* loaded from: classes3.dex */
final class AutoValue_TracerConfig extends TracerConfig {
    private final boolean enabled;

    AutoValue_TracerConfig(boolean z) {
        this.enabled = z;
    }

    @Override // io.opentelemetry.sdk.trace.internal.TracerConfig
    public boolean isEnabled() {
        return this.enabled;
    }

    public String toString() {
        return "TracerConfig{enabled=" + this.enabled + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TracerConfig) && this.enabled == ((TracerConfig) obj).isEnabled();
    }

    public int hashCode() {
        return (this.enabled ? 1231 : 1237) ^ 1000003;
    }
}
