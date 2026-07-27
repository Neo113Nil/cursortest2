package com.onesignal.common.threading;

import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$defaultExecutor$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$defaultExecutor$2 INSTANCE = new OneSignalDispatchers$defaultExecutor$2();

    public OneSignalDispatchers$defaultExecutor$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final ThreadPoolExecutor invoke() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(200), new OneSignalDispatchers.OptimizedThreadFactory("OneSignal-Default", 0, 2, null));
            threadPoolExecutor.allowCoreThreadTimeOut(false);
            return threadPoolExecutor;
        } catch (Exception e3) {
            Logging.error$default("OneSignalDispatchers: Failed to create Default executor: " + e3.getMessage(), null, 2, null);
            throw e3;
        }
    }
}
