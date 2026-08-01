package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFc1kSDK {
    private static final hd.g getMediationNetwork = hd.h.b(AnonymousClass5.getMediationNetwork);

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1kSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends wd.p implements Function0<ExecutorService> {
        public static final AnonymousClass5 getMediationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    public static final ExecutorService getCurrencyIso4217Code() {
        AFc1jSDK aFc1jSDK = new AFc1jSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1jSDK.allowCoreThreadTimeOut(true);
        return aFc1jSDK;
    }

    public static final ExecutorService getMediationNetwork() {
        Object value = getMediationNetwork.getValue();
        value.getClass();
        return (ExecutorService) value;
    }

    public static final ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        newScheduledThreadPool.getClass();
        return newScheduledThreadPool;
    }

    public static final ScheduledExecutorService getRevenue() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.getClass();
        return newSingleThreadScheduledExecutor;
    }
}
