package com.onesignal.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.debug.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: OtelConfigEvaluator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/onesignal/internal/OtelConfig;", "", "isEnabled", "", "logLevel", "Lcom/onesignal/debug/LogLevel;", "(ZLcom/onesignal/debug/LogLevel;)V", "()Z", "getLogLevel", "()Lcom/onesignal/debug/LogLevel;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OtelConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final OtelConfig DISABLED = new OtelConfig(false, null);
    private final boolean isEnabled;
    private final LogLevel logLevel;

    public static /* synthetic */ OtelConfig copy$default(OtelConfig otelConfig, boolean z, LogLevel logLevel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = otelConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            logLevel = otelConfig.logLevel;
        }
        return otelConfig.copy(z, logLevel);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final OtelConfig copy(boolean isEnabled, LogLevel logLevel) {
        return new OtelConfig(isEnabled, logLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtelConfig)) {
            return false;
        }
        OtelConfig otelConfig = (OtelConfig) other;
        return this.isEnabled == otelConfig.isEnabled && this.logLevel == otelConfig.logLevel;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        LogLevel logLevel = this.logLevel;
        return hashCode + (logLevel == null ? 0 : logLevel.hashCode());
    }

    public String toString() {
        return "OtelConfig(isEnabled=" + this.isEnabled + ", logLevel=" + this.logLevel + ')';
    }

    public OtelConfig(boolean z, LogLevel logLevel) {
        this.isEnabled = z;
        this.logLevel = logLevel;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* compiled from: OtelConfigEvaluator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/internal/OtelConfig$Companion;", "", "()V", "DISABLED", "Lcom/onesignal/internal/OtelConfig;", "getDISABLED", "()Lcom/onesignal/internal/OtelConfig;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OtelConfig getDISABLED() {
            return OtelConfig.DISABLED;
        }
    }
}
