package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFj1rSDK {
    public static final AFj1rSDK INSTANCE = new AFj1rSDK();

    private AFj1rSDK() {
    }

    public static final void values(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j4, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            scheduledExecutorService.schedule(runnable, j4, timeUnit);
        } catch (RejectedExecutionException e4) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e4);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }
}
