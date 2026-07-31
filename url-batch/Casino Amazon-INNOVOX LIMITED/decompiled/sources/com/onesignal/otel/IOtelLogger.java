package com.onesignal.otel;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* compiled from: IOtelLogger.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/onesignal/otel/IOtelLogger;", "", "debug", "", "message", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "info", "warn", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IOtelLogger {
    void debug(String message);

    void error(String message);

    void info(String message);

    void warn(String message);
}
