package com.onesignal.core.internal.backend;

import com.onesignal.core.BuildConfig;
import com.onesignal.debug.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IParamsBackendService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/onesignal/core/internal/backend/RemoteLoggingParamsObject;", "", "logLevel", "Lcom/onesignal/debug/LogLevel;", "isEnabled", "", "(Lcom/onesignal/debug/LogLevel;Z)V", "()Z", "getLogLevel", "()Lcom/onesignal/debug/LogLevel;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteLoggingParamsObject {
    private final boolean isEnabled;
    private final LogLevel logLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteLoggingParamsObject() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public RemoteLoggingParamsObject(LogLevel logLevel, boolean z) {
        this.logLevel = logLevel;
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RemoteLoggingParamsObject(LogLevel logLevel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(logLevel, (i & 2) != 0 ? logLevel != null : z);
        logLevel = (i & 1) != 0 ? null : logLevel;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
