package io.opentelemetry.exporter.sender.okhttp.internal;

import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.internal.DaemonThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;

/* loaded from: classes3.dex */
public final class OkHttpUtil {
    private static boolean propagateContextForTestingInDispatcher = false;

    public static void setPropagateContextForTestingInDispatcher(boolean z) {
        propagateContextForTestingInDispatcher = z;
    }

    public static Dispatcher newDispatcher() {
        return new Dispatcher(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), createThreadFactory("okhttp-dispatch")));
    }

    private static DaemonThreadFactory createThreadFactory(String str) {
        if (propagateContextForTestingInDispatcher) {
            return new DaemonThreadFactory(str, new ThreadFactory() { // from class: io.opentelemetry.exporter.sender.okhttp.internal.OkHttpUtil$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread newThread;
                    newThread = Executors.defaultThreadFactory().newThread(Context.current().wrap(runnable));
                    return newThread;
                }
            });
        }
        return new DaemonThreadFactory(str);
    }

    private OkHttpUtil() {
    }
}
