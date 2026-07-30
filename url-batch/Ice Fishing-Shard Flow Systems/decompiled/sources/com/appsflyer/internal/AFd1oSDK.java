package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class AFd1oSDK {
    final ExecutorService getMonetizationNetwork;
    final AFd1jSDK getRevenue;

    public AFd1oSDK(AFd1jSDK aFd1jSDK, ExecutorService executorService) {
        this.getRevenue = aFd1jSDK;
        this.getMonetizationNetwork = executorService;
    }
}
