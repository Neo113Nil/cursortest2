package com.onesignal.debug.internal.logging.otel.android;

import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.otel.IOtelLogger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AndroidOtelLogger implements IOtelLogger {
    @Override // com.onesignal.otel.IOtelLogger
    public void debug(String message) {
        i.e(message, "message");
        Logging.debug$default(message, null, 2, null);
    }

    @Override // com.onesignal.otel.IOtelLogger
    public void error(String message) {
        i.e(message, "message");
        Logging.error$default(message, null, 2, null);
    }

    @Override // com.onesignal.otel.IOtelLogger
    public void info(String message) {
        i.e(message, "message");
        Logging.info$default(message, null, 2, null);
    }

    @Override // com.onesignal.otel.IOtelLogger
    public void warn(String message) {
        i.e(message, "message");
        Logging.warn$default(message, null, 2, null);
    }
}
