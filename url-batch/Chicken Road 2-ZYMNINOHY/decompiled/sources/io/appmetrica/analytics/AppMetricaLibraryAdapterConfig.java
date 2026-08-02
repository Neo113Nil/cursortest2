package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AppMetricaLibraryAdapterConfig {
    public final Boolean advIdentifiersTracking;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private Boolean f9364a;

        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        public Builder withAdvIdentifiersTracking(boolean z) {
            this.f9364a = Boolean.valueOf(z);
            return this;
        }
    }

    public /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int i4) {
        this(builder);
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    public String toString() {
        return "AppMetricaLibraryAdapterConfig{advIdentifiersTracking=" + this.advIdentifiersTracking + '}';
    }

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.f9364a;
    }
}
