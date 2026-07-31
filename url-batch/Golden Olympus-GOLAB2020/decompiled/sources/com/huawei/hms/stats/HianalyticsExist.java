package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class HianalyticsExist {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14274a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f14275b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f14276c = false;

    public static boolean isHianalyticsExist() {
        synchronized (f14274a) {
            if (!f14275b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f14275b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + f14276c);
            }
        }
        return f14276c;
    }
}
