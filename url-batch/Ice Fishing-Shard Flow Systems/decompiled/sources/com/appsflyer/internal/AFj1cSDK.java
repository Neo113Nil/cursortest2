package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import f6.InterfaceC0406a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFj1cSDK {
    public static final AFj1cSDK INSTANCE = new AFj1cSDK();

    private AFj1cSDK() {
    }

    public static final Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object obj = map.get("meta");
        Map<String, Object> map2 = (!(obj instanceof Map) || ((obj instanceof InterfaceC0406a) && !(obj instanceof f6.d))) ? null : (Map) obj;
        if (map2 != null) {
            return map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        map.put("meta", linkedHashMap);
        return linkedHashMap;
    }

    public static final void getMonetizationNetwork(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
        } catch (RejectedExecutionException e7) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e7);
        } catch (Throwable th) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th);
        }
    }
}
