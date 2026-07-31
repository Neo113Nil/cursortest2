package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class InitReport {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f14171a = false;

    /* renamed from: b, reason: collision with root package name */
    private static List f14172b = new CopyOnWriteArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static void a() {
        try {
            Iterator it = f14172b.iterator();
            while (it.hasNext()) {
                HianalyticsHelper.getInstance().getReportExecutor().submit((Runnable) it.next());
            }
            f14172b.clear();
        } catch (NullPointerException unused) {
            Logger.e("HaReport", "event is null occured");
        } catch (RejectedExecutionException unused2) {
            Logger.e("HaReport", "submit failed of rejected execution exception");
        } catch (Exception unused3) {
            Logger.e("HaReport", "submit failed because of some exception");
        }
    }

    public static void disableConnectNet() {
        f14171a = false;
    }

    public static void enableConnectNet() {
        if (f14171a) {
            Logger.v("HaReport", "has connect, not need to deal delay task");
            return;
        }
        Logger.v("HaReport", "deal delay task");
        f14171a = true;
        try {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.InitReport.1
                @Override // java.lang.Runnable
                public void run() {
                    InitReport.a();
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e("HaReport", "the thread submit has rejectedExecutionException!");
        } catch (Throwable unused2) {
            Logger.e("HaReport", "the thread submit has fatal error!");
        }
    }

    public static void executeDelay(Runnable runnable) {
        if (!f14171a) {
            f14172b.add(runnable);
            return;
        }
        try {
            HianalyticsHelper.getInstance().getReportExecutor().execute(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.e("HaReport", "the thread submit has rejectedExecutionException!");
        } catch (Throwable unused2) {
            Logger.e("HaReport", "the thread submit has fatal error!");
        }
    }

    public static boolean isHasConnectNet() {
        return f14171a;
    }

    public static void reportWhenInit(Runnable runnable) {
        if (!f14171a) {
            if (f14172b.size() > 10) {
                Logger.e("TAG", "the event to be report when init exceed the limit!");
                return;
            } else {
                f14172b.add(runnable);
                return;
            }
        }
        try {
            HianalyticsHelper.getInstance().getReportExecutor().execute(runnable);
        } catch (RejectedExecutionException unused) {
            Logger.e("HaReport", "the thread submit has rejectedExecutionException!");
        } catch (Throwable unused2) {
            Logger.e("HaReport", "the thread submit has fatal error!");
        }
    }
}
