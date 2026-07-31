package com.my.tracker.config;

import androidx.annotation.NonNull;
import com.my.tracker.obfuscated.AbstractC1664n1;

/* loaded from: classes2.dex */
public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    public static final class Builder {
        boolean useLightSensor = AbstractC1664n1.f21456a;
        boolean useMagneticFieldSensor = true;
        boolean useGyroscope = true;
        boolean usePressureSensor = true;
        boolean useProximitySensor = AbstractC1664n1.f21457b;

        Builder() {
        }

        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.useLightSensor, this.useMagneticFieldSensor, this.useGyroscope, this.usePressureSensor, this.useProximitySensor);
        }

        public Builder useGyroscopeSensor(boolean z4) {
            this.useGyroscope = z4;
            return this;
        }

        public Builder useLightSensor(boolean z4) {
            this.useLightSensor = z4;
            return this;
        }

        public Builder useMagneticFieldSensor(boolean z4) {
            this.useMagneticFieldSensor = z4;
            return this;
        }

        public Builder usePressureSensor(boolean z4) {
            this.usePressureSensor = z4;
            return this;
        }

        public Builder useProximitySensor(boolean z4) {
            this.useProximitySensor = z4;
            return this;
        }
    }

    AntiFraudConfig(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.useLightSensor = z4;
        this.useMagneticFieldSensor = z5;
        this.useGyroscope = z6;
        this.usePressureSensor = z7;
        this.useProximitySensor = z8;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }
}
