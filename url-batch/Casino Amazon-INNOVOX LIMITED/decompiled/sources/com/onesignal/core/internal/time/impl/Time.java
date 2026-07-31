package com.onesignal.core.internal.time.impl;

import android.os.Process;
import android.os.SystemClock;
import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.time.ITime;
import kotlin.Metadata;

/* compiled from: Time.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onesignal/core/internal/time/impl/Time;", "Lcom/onesignal/core/internal/time/ITime;", "()V", "currentTimeMillis", "", "getCurrentTimeMillis", "()J", "processUptimeMillis", "getProcessUptimeMillis", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Time implements ITime {
    @Override // com.onesignal.core.internal.time.ITime
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.onesignal.core.internal.time.ITime
    public long getProcessUptimeMillis() {
        return SystemClock.uptimeMillis() - Process.getStartUptimeMillis();
    }
}
