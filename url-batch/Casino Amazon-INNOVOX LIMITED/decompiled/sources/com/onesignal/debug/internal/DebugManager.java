package com.onesignal.debug.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.IDebugManager;
import com.onesignal.debug.ILogListener;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebugManager.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/onesignal/debug/internal/DebugManager;", "Lcom/onesignal/debug/IDebugManager;", "()V", "value", "Lcom/onesignal/debug/LogLevel;", "alertLevel", "getAlertLevel", "()Lcom/onesignal/debug/LogLevel;", "setAlertLevel", "(Lcom/onesignal/debug/LogLevel;)V", "logLevel", "getLogLevel", "setLogLevel", "addLogListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/debug/ILogListener;", "removeLogListener", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DebugManager implements IDebugManager {
    public DebugManager() {
        setLogLevel(LogLevel.WARN);
        setAlertLevel(LogLevel.NONE);
    }

    @Override // com.onesignal.debug.IDebugManager
    public LogLevel getLogLevel() {
        return Logging.getLogLevel();
    }

    @Override // com.onesignal.debug.IDebugManager
    public void setLogLevel(LogLevel value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Logging.setLogLevel(value);
    }

    @Override // com.onesignal.debug.IDebugManager
    public LogLevel getAlertLevel() {
        return Logging.getVisualLogLevel();
    }

    @Override // com.onesignal.debug.IDebugManager
    public void setAlertLevel(LogLevel value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Logging.setVisualLogLevel(value);
    }

    @Override // com.onesignal.debug.IDebugManager
    public void addLogListener(ILogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logging.INSTANCE.addListener(listener);
    }

    @Override // com.onesignal.debug.IDebugManager
    public void removeLogListener(ILogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Logging.INSTANCE.removeListener(listener);
    }
}
