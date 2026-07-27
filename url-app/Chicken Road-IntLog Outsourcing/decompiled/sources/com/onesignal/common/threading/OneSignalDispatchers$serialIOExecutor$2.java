package com.onesignal.common.threading;

import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.debug.internal.logging.Logging;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalDispatchers$serialIOExecutor$2 extends j implements InterfaceC1430a {
    public static final OneSignalDispatchers$serialIOExecutor$2 INSTANCE = new OneSignalDispatchers$serialIOExecutor$2();

    public OneSignalDispatchers$serialIOExecutor$2() {
        super(0);
    }

    @Override // t4.InterfaceC1430a
    public final ExecutorService invoke() {
        try {
            return Executors.newSingleThreadExecutor(new OneSignalDispatchers.OptimizedThreadFactory("OneSignal-SerialIO", 4));
        } catch (Exception e3) {
            Logging.error$default("OneSignalDispatchers: Failed to create SerialIO executor: " + e3.getMessage(), null, 2, null);
            throw e3;
        }
    }
}
