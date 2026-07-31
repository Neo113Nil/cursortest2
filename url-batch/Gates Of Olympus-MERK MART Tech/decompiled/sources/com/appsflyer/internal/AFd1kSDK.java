package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFd1kSDK implements AFd1mSDK {
    private static final int valueOf = (int) TimeUnit.SECONDS.toMillis(30);
    private ScheduledExecutorService AFInAppEventParameterName;
    private ExecutorService AFInAppEventType;
    private ExecutorService AFKeystoreWrapper;
    private PurchaseHandler AFLogger;
    private AFc1pSDK AFLogger$LogLevel;
    private AFd1uSDK AFVersionDeclaration;
    private AFg1mSDK AppsFlyer2dXConversionCallback;
    private AFe1gSDK afDebugLog;
    private AFh1bSDK afErrorLog;
    private AFd1ySDK afErrorLogForExcManagerOnly;
    private AFi1lSDK afInfoLog;
    private AFc1iSDK afLogForce;
    private AFd1fSDK afRDLog;
    private AFb1uSDK afVerboseLog;
    private AFg1xSDK afWarnLog;
    private AFe1ySDK d;
    private AFg1gSDK e;
    private AFb1bSDK force;
    private AFh1lSDK getLevel;
    private AFg1sSDK i;
    private AFf1aSDK init;
    private AFa1cSDK onAppOpenAttributionNative;
    private AFh1iSDK onInstallConversionDataLoadedNative;
    private AFc1qSDK onInstallConversionFailureNative;
    private AFd1qSDK onResponseErrorNative;
    private AFf1eSDK registerClient;
    private AFd1pSDK unregisterClient;
    private AFi1rSDK v;
    public final AFd1nSDK values = new AFd1nSDK();
    private AFe1cSDK w;

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFe1wSDK AFKeystoreWrapper() {
        return new AFe1wSDK(onInstallConversionDataLoadedNative(), values(), AppsFlyerProperties.getInstance(), afErrorLog());
    }

    private synchronized AFe1ySDK onInstallConversionDataLoadedNative() {
        if (this.d == null) {
            this.d = new AFe1ySDK(new AFe1rSDK(valueOf), AFInAppEventParameterName());
        }
        return this.d;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized ExecutorService AFInAppEventParameterName() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        }
        return this.AFInAppEventType;
    }

    private synchronized ExecutorService onAppOpenAttributionNative() {
        if (this.AFKeystoreWrapper == null) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
            this.AFKeystoreWrapper = newSingleThreadExecutor;
        }
        return this.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized ScheduledExecutorService AFInAppEventType() {
        if (this.AFInAppEventParameterName == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
            this.AFInAppEventParameterName = newScheduledThreadPool;
        }
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFd1pSDK values() {
        if (this.unregisterClient == null) {
            AFd1nSDK v = v();
            Context context = this.values.AFKeystoreWrapper;
            if (context != null) {
                this.unregisterClient = new AFd1pSDK(v, new AFd1sSDK(AFb1tSDK.AFKeystoreWrapper(context)));
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFd1xSDK valueOf() {
        Context context = this.values.AFKeystoreWrapper;
        if (context != null) {
            return new AFd1sSDK(AFb1tSDK.AFKeystoreWrapper(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized PurchaseHandler AFLogger() {
        if (this.AFLogger == null) {
            this.AFLogger = new PurchaseHandler(this);
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFf1eSDK registerClient() {
        if (this.registerClient == null) {
            AFf1cSDK aFf1cSDK = new AFf1cSDK(valueOf());
            this.registerClient = new AFf1eSDK(new AFf1fSDK(), values(), force(), aFf1cSDK, new AFe1wSDK(onInstallConversionDataLoadedNative(), values(), AppsFlyerProperties.getInstance(), afErrorLog()), new AFf1gSDK(values(), aFf1cSDK), i());
        }
        return this.registerClient;
    }

    private synchronized AFf1aSDK AppsFlyer2dXConversionCallback() {
        if (this.init == null) {
            this.init = new AFf1aSDK(v(), values());
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFg1gSDK d() {
        if (this.e == null) {
            this.e = new AFg1gSDK(valueOf());
        }
        return this.e;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFg1sSDK unregisterClient() {
        if (this.i == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFh1dSDK();
            }
            AFh1bSDK aFh1bSDK = this.afErrorLog;
            if (this.afErrorLogForExcManagerOnly == null) {
                this.afErrorLogForExcManagerOnly = new AFa1vSDK();
            }
            AFd1ySDK aFd1ySDK = this.afErrorLogForExcManagerOnly;
            if (this.afInfoLog == null) {
                Context context2 = this.values.AFKeystoreWrapper;
                if (context2 != null) {
                    this.afInfoLog = new AFi1nSDK(context2, onAppOpenAttributionNative());
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFi1lSDK aFi1lSDK = this.afInfoLog;
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFb1zSDK();
            }
            AFa1cSDK aFa1cSDK = this.onAppOpenAttributionNative;
            AFg1gSDK d = d();
            AFd1xSDK valueOf2 = valueOf();
            AFd1pSDK values = values();
            if (this.getLevel == null) {
                Context context3 = this.values.AFKeystoreWrapper;
                if (context3 != null) {
                    this.getLevel = new AFh1lSDK(context3);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFh1lSDK aFh1lSDK = this.getLevel;
            AFg1xSDK force = force();
            AFb1aSDK aFb1aSDK = new AFb1aSDK();
            AFd1nSDK v = v();
            AFf1aSDK AppsFlyer2dXConversionCallback = AppsFlyer2dXConversionCallback();
            if (this.onResponseErrorNative == null) {
                this.onResponseErrorNative = new AFd1qSDK();
            }
            this.i = new AFg1wSDK(context, aFh1bSDK, aFd1ySDK, aFi1lSDK, aFa1cSDK, d, valueOf2, values, aFh1lSDK, force, aFb1aSDK, v, AppsFlyer2dXConversionCallback, this.onResponseErrorNative);
        }
        return this.i;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFi1lSDK e() {
        if (this.afInfoLog == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context != null) {
                this.afInfoLog = new AFi1nSDK(context, onAppOpenAttributionNative());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFe1cSDK i() {
        if (this.w == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1kSDK.4
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                /* renamed from: values, reason: merged with bridge method [inline-methods] */
                public boolean offer(Runnable runnable) {
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1zSDK());
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFd1kSDK$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    AFd1kSDK.AFKeystoreWrapper(runnable, threadPoolExecutor2);
                }
            });
            this.w = new AFe1cSDK(threadPoolExecutor);
        }
        return this.w;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFb1bSDK afInfoLog() {
        if (this.force == null) {
            this.force = new AFb1gSDK(this);
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFi1rSDK w() {
        if (this.v == null) {
            this.v = new AFi1rSDK(this);
        }
        return this.v;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFg1xSDK force() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFg1xSDK(v(), new AFg1zSDK());
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFd1nSDK v() {
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFb1uSDK afWarnLog() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFb1jSDK(v());
        }
        return this.afVerboseLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1mSDK
    /* renamed from: onConversionDataSuccess, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1fSDK onInstallConversionFailureNative() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFd1fSDK(this);
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFe1gSDK afErrorLog() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFe1gSDK(values(), valueOf());
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFh1bSDK afDebugLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFh1dSDK();
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFc1pSDK afVerboseLog() {
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new AFc1pSDK(this);
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final synchronized AFc1iSDK afRDLog() {
        if (this.afLogForce == null) {
            this.afLogForce = new AFc1eSDK(v());
        }
        return this.afLogForce;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFh1lSDK getLevel() {
        if (this.getLevel == null) {
            Context context = this.values.AFKeystoreWrapper;
            if (context != null) {
                this.getLevel = new AFh1lSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFh1iSDK AFVersionDeclaration() {
        if (this.onInstallConversionDataLoadedNative == null) {
            this.onInstallConversionDataLoadedNative = new AFh1cSDK();
        }
        return this.onInstallConversionDataLoadedNative;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFd1qSDK AFLogger$LogLevel() {
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFd1qSDK();
        }
        return this.onResponseErrorNative;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFd1uSDK afLogForce() {
        if (this.AFVersionDeclaration == null) {
            ExecutorService onAppOpenAttributionNative = onAppOpenAttributionNative();
            ScheduledExecutorService AFInAppEventType = AFInAppEventType();
            AFc1pSDK afVerboseLog = afVerboseLog();
            if (this.onInstallConversionDataLoadedNative == null) {
                this.onInstallConversionDataLoadedNative = new AFh1cSDK();
            }
            this.AFVersionDeclaration = new AFd1wSDK(onAppOpenAttributionNative, AFInAppEventType, afVerboseLog, this.onInstallConversionDataLoadedNative);
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFg1mSDK afErrorLogForExcManagerOnly() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            this.AppsFlyer2dXConversionCallback = new AFg1kSDK(this);
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // com.appsflyer.internal.AFd1mSDK
    public final AFc1qSDK init() {
        if (this.onInstallConversionFailureNative == null) {
            this.onInstallConversionFailureNative = new AFc1jSDK(valueOf());
        }
        return this.onInstallConversionFailureNative;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFKeystoreWrapper(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger AFKeystoreWrapper = new AtomicInteger();
        private final AtomicInteger valueOf = new AtomicInteger();

        public AFa1zSDK() {
            AFKeystoreWrapper.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = AFKeystoreWrapper.get();
            return new Thread(runnable, new StringBuilder("queue-").append(i).append("-").append(this.valueOf.incrementAndGet()).toString());
        }
    }
}
