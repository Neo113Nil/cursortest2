package com.onesignal.debug;

/* loaded from: classes.dex */
public interface IDebugManager {
    void addLogListener(ILogListener iLogListener);

    LogLevel getAlertLevel();

    LogLevel getLogLevel();

    void removeLogListener(ILogListener iLogListener);

    void setAlertLevel(LogLevel logLevel);

    void setLogLevel(LogLevel logLevel);
}
