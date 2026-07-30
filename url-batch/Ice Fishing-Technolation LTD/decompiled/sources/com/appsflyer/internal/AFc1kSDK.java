package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFc1kSDK {
    private static final Lazy getMediationNetwork = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1kSDK.5
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    public static final ExecutorService getCurrencyIso4217Code() {
        AFc1jSDK aFc1jSDK = new AFc1jSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1jSDK.allowCoreThreadTimeOut(true);
        return aFc1jSDK;
    }

    public static final ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
        return newScheduledThreadPool;
    }

    public static final ScheduledExecutorService getRevenue() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadScheduledExecutor, "");
        return newSingleThreadScheduledExecutor;
    }

    public static final ExecutorService getMediationNetwork() {
        Object value = getMediationNetwork.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }
}
