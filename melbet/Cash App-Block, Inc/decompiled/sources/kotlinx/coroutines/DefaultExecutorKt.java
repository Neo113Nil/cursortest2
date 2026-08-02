package kotlinx.coroutines;

import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.SystemPropsKt__SystemPropsKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public abstract class DefaultExecutorKt {
    public static final Delay DefaultDelay;

    static {
        String str;
        Delay delay;
        int i = SystemPropsKt__SystemPropsKt.AVAILABLE_PROCESSORS;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
            HandlerContext handlerContext2 = handlerContext.immediate;
            delay = handlerContext;
            if (handlerContext == null) {
                delay = DefaultExecutor.INSTANCE;
            }
        } else {
            delay = DefaultExecutor.INSTANCE;
        }
        DefaultDelay = delay;
    }
}
