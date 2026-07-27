package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class OtelConfig {
    public static final Companion Companion = new Companion(null);
    private static final OtelConfig DISABLED = new OtelConfig(false, null);
    private final boolean isEnabled;
    private final LogLevel logLevel;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final OtelConfig getDISABLED() {
            return OtelConfig.DISABLED;
        }

        private Companion() {
        }
    }

    public OtelConfig(boolean z, LogLevel logLevel) {
        this.isEnabled = z;
        this.logLevel = logLevel;
    }

    public static /* synthetic */ OtelConfig copy$default(OtelConfig otelConfig, boolean z, LogLevel logLevel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = otelConfig.isEnabled;
        }
        if ((i2 & 2) != 0) {
            logLevel = otelConfig.logLevel;
        }
        return otelConfig.copy(z, logLevel);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final LogLevel component2() {
        return this.logLevel;
    }

    public final OtelConfig copy(boolean z, LogLevel logLevel) {
        return new OtelConfig(z, logLevel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtelConfig)) {
            return false;
        }
        OtelConfig otelConfig = (OtelConfig) obj;
        return this.isEnabled == otelConfig.isEnabled && this.logLevel == otelConfig.logLevel;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        LogLevel logLevel = this.logLevel;
        return hashCode + (logLevel == null ? 0 : logLevel.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        return "OtelConfig(isEnabled=" + this.isEnabled + ", logLevel=" + this.logLevel + ')';
    }
}
