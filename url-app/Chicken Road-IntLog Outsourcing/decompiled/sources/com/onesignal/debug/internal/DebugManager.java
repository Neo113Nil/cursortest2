package com.onesignal.debug.internal;

import com.onesignal.debug.IDebugManager;
import com.onesignal.debug.ILogListener;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DebugManager implements IDebugManager {
    public DebugManager() {
        setLogLevel(LogLevel.WARN);
        setAlertLevel(LogLevel.NONE);
    }

    @Override // com.onesignal.debug.IDebugManager
    public void addLogListener(ILogListener listener) {
        i.e(listener, "listener");
        Logging.INSTANCE.addListener(listener);
    }

    @Override // com.onesignal.debug.IDebugManager
    public LogLevel getAlertLevel() {
        return Logging.getVisualLogLevel();
    }

    @Override // com.onesignal.debug.IDebugManager
    public LogLevel getLogLevel() {
        return Logging.getLogLevel();
    }

    @Override // com.onesignal.debug.IDebugManager
    public void removeLogListener(ILogListener listener) {
        i.e(listener, "listener");
        Logging.INSTANCE.removeListener(listener);
    }

    @Override // com.onesignal.debug.IDebugManager
    public void setAlertLevel(LogLevel value) {
        i.e(value, "value");
        Logging.setVisualLogLevel(value);
    }

    @Override // com.onesignal.debug.IDebugManager
    public void setLogLevel(LogLevel value) {
        i.e(value, "value");
        Logging.setLogLevel(value);
    }
}
