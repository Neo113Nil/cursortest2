package com.onesignal.internal;

import com.onesignal.debug.LogLevel;
import com.onesignal.internal.OtelConfigAction;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelConfigEvaluator {
    public static final OtelConfigEvaluator INSTANCE = new OtelConfigEvaluator();

    private OtelConfigEvaluator() {
    }

    public final OtelConfigAction evaluate(OtelConfig otelConfig, OtelConfig otelConfig2) {
        LogLevel logLevel;
        i.e(otelConfig2, "new");
        boolean z = false;
        if (otelConfig != null && otelConfig.isEnabled()) {
            z = true;
        }
        boolean isEnabled = otelConfig2.isEnabled();
        if (!z && isEnabled) {
            LogLevel logLevel2 = otelConfig2.getLogLevel();
            if (logLevel2 == null) {
                logLevel2 = LogLevel.ERROR;
            }
            return new OtelConfigAction.Enable(logLevel2);
        }
        if (z && !isEnabled) {
            return OtelConfigAction.Disable.INSTANCE;
        }
        if (z && isEnabled) {
            if ((otelConfig != null ? otelConfig.getLogLevel() : null) != otelConfig2.getLogLevel()) {
                if (otelConfig == null || (logLevel = otelConfig.getLogLevel()) == null) {
                    logLevel = LogLevel.ERROR;
                }
                LogLevel logLevel3 = otelConfig2.getLogLevel();
                if (logLevel3 == null) {
                    logLevel3 = LogLevel.ERROR;
                }
                return new OtelConfigAction.UpdateLogLevel(logLevel, logLevel3);
            }
        }
        return OtelConfigAction.NoChange.INSTANCE;
    }
}
