package com.onesignal.debug.internal.logging.otel.android;

import com.google.firebase.messaging.Constants;
import com.onesignal.core.BuildConfig;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.otel.IOtelLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidOtelLogger.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/onesignal/debug/internal/logging/otel/android/AndroidOtelLogger;", "Lcom/onesignal/otel/IOtelLogger;", "()V", "debug", "", "message", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "info", "warn", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidOtelLogger implements IOtelLogger {
    @Override // com.onesignal.otel.IOtelLogger
    public void error(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logging.error$default(message, null, 2, null);
    }

    @Override // com.onesignal.otel.IOtelLogger
    public void warn(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logging.warn$default(message, null, 2, null);
    }

    @Override // com.onesignal.otel.IOtelLogger
    public void info(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logging.info$default(message, null, 2, null);
    }

    @Override // com.onesignal.otel.IOtelLogger
    public void debug(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logging.debug$default(message, null, 2, null);
    }
}
