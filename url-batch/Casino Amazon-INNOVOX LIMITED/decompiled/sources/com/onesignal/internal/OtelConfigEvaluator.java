package com.onesignal.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.debug.LogLevel;
import com.onesignal.internal.OtelConfigAction;
import io.opentelemetry.semconv.JvmAttributes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelConfigEvaluator.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/onesignal/internal/OtelConfigEvaluator;", "", "()V", "evaluate", "Lcom/onesignal/internal/OtelConfigAction;", "old", "Lcom/onesignal/internal/OtelConfig;", JvmAttributes.JvmThreadStateValues.NEW, BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelConfigEvaluator {
    public static final OtelConfigEvaluator INSTANCE = new OtelConfigEvaluator();

    private OtelConfigEvaluator() {
    }

    public final OtelConfigAction evaluate(OtelConfig old, OtelConfig r5) {
        LogLevel logLevel;
        Intrinsics.checkNotNullParameter(r5, "new");
        boolean z = false;
        if (old != null && old.isEnabled()) {
            z = true;
        }
        boolean isEnabled = r5.isEnabled();
        if (!z && isEnabled) {
            LogLevel logLevel2 = r5.getLogLevel();
            if (logLevel2 == null) {
                logLevel2 = LogLevel.ERROR;
            }
            return new OtelConfigAction.Enable(logLevel2);
        }
        if (z && !isEnabled) {
            return OtelConfigAction.Disable.INSTANCE;
        }
        if (z && isEnabled) {
            if ((old != null ? old.getLogLevel() : null) != r5.getLogLevel()) {
                if (old == null || (logLevel = old.getLogLevel()) == null) {
                    logLevel = LogLevel.ERROR;
                }
                LogLevel logLevel3 = r5.getLogLevel();
                if (logLevel3 == null) {
                    logLevel3 = LogLevel.ERROR;
                }
                return new OtelConfigAction.UpdateLogLevel(logLevel, logLevel3);
            }
        }
        return OtelConfigAction.NoChange.INSTANCE;
    }
}
