package com.onesignal.debug;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;

/* compiled from: IDebugManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/onesignal/debug/IDebugManager;", "", "alertLevel", "Lcom/onesignal/debug/LogLevel;", "getAlertLevel", "()Lcom/onesignal/debug/LogLevel;", "setAlertLevel", "(Lcom/onesignal/debug/LogLevel;)V", "logLevel", "getLogLevel", "setLogLevel", "addLogListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/debug/ILogListener;", "removeLogListener", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IDebugManager {
    void addLogListener(ILogListener listener);

    LogLevel getAlertLevel();

    LogLevel getLogLevel();

    void removeLogListener(ILogListener listener);

    void setAlertLevel(LogLevel logLevel);

    void setLogLevel(LogLevel logLevel);
}
