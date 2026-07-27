package com.onesignal.core.internal.backend;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class RemoteLoggingParamsObject {
    private final boolean isEnabled;
    private final LogLevel logLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteLoggingParamsObject() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public RemoteLoggingParamsObject(LogLevel logLevel, boolean z) {
        this.logLevel = logLevel;
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RemoteLoggingParamsObject(LogLevel logLevel, boolean z, int i2, e eVar) {
        this(logLevel, (i2 & 2) != 0 ? logLevel != null : z);
        logLevel = (i2 & 1) != 0 ? null : logLevel;
    }
}
