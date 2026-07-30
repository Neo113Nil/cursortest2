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
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class AFc1xSDK implements AFc1zSDK {
    private static final int AFKeystoreWrapper = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFb1bSDK AFInAppEventParameterName = new AFb1bSDK();
    private ExecutorService AFInAppEventType;
    private AFc1pSDK AFLogger;
    private AFd1tSDK AFLogger$LogLevel;
    private AFe1tSDK AFVersionDeclaration;
    private AFc1cSDK AppsFlyer2dXConversionCallback;
    private AFb1cSDK afDebugLog;
    private PurchaseHandler afErrorLog;
    private AFf1fSDK afErrorLogForExcManagerOnly;
    private AFe1lSDK afInfoLog;
    private AFc1tSDK afRDLog;
    private AFb1wSDK afWarnLog;
    private AFf1kSDK getLevel;
    private AFf1mSDK init;
    private AFa1fSDK onAppOpenAttributionNative;
    private AFb1vSDK onAttributionFailure;
    private AFb1iSDK onAttributionFailureNative;
    private AFb1uSDK onConversionDataSuccess;
    private AFa1iSDK onDeepLinkingNative;
    private AFe1xSDK onInstallConversionDataLoadedNative;
    private AFc1wSDK onInstallConversionFailureNative;
    private AFf1tSDK onResponse;
    private AFb1jSDK onResponseErrorNative;
    private AFa1gSDK onResponseNative;
    private ScheduledExecutorService valueOf;
    private ExecutorService values;

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFc1qSDK AFInAppEventType() {
        return new AFc1qSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionDataLoadedNative());
    }

    private synchronized AFc1pSDK onAttributionFailureNative() {
        if (this.AFLogger == null) {
            this.AFLogger = new AFc1pSDK(new AFc1mSDK(AFKeystoreWrapper), valueOf());
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized ExecutorService valueOf() {
        if (this.values == null) {
            this.values = Executors.newCachedThreadPool();
        }
        return this.values;
    }

    private synchronized ExecutorService onConversionDataFail() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = Executors.newSingleThreadExecutor();
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized ScheduledExecutorService values() {
        if (this.valueOf == null) {
            this.valueOf = Executors.newScheduledThreadPool(2);
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1cSDK AFInAppEventParameterName() {
        if (this.afDebugLog == null) {
            AFb1bSDK onAppOpenAttributionNative = onAppOpenAttributionNative();
            Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
            if (context != null) {
                this.afDebugLog = new AFb1cSDK(onAppOpenAttributionNative, new AFb1gSDK(AFa1dSDK.values(context)));
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFb1fSDK AFKeystoreWrapper() {
        Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
        if (context != null) {
            return new AFb1gSDK(AFa1dSDK.values(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized PurchaseHandler afInfoLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new PurchaseHandler(this);
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFc1tSDK afDebugLog() {
        if (this.afRDLog == null) {
            AFb1tSDK aFb1tSDK = new AFb1tSDK(AFKeystoreWrapper());
            this.afRDLog = new AFc1tSDK(new AFd1bSDK(), AFInAppEventParameterName(), AFVersionDeclaration(), aFb1tSDK, new AFc1qSDK(onAttributionFailureNative(), AFInAppEventParameterName(), AppsFlyerProperties.getInstance(), onInstallConversionDataLoadedNative()), new AFe1vSDK(AFInAppEventParameterName(), aFb1tSDK), getLevel());
        }
        return this.afRDLog;
    }

    public final synchronized AFb1vSDK afErrorLog() {
        if (this.onAttributionFailure == null) {
            this.onAttributionFailure = new AFb1vSDK(onAppOpenAttributionNative(), AFInAppEventParameterName());
        }
        return this.onAttributionFailure;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFe1lSDK AFLogger() {
        if (this.afInfoLog == null) {
            this.afInfoLog = new AFe1lSDK(AFKeystoreWrapper());
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFe1tSDK afRDLog() {
        if (this.AFVersionDeclaration == null) {
            Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.init == null) {
                this.init = new AFf1lSDK();
            }
            AFf1mSDK aFf1mSDK = this.init;
            if (this.onResponseErrorNative == null) {
                this.onResponseErrorNative = new AFa1xSDK();
            }
            AFb1jSDK aFb1jSDK = this.onResponseErrorNative;
            if (this.afErrorLogForExcManagerOnly == null) {
                Context context2 = this.AFInAppEventParameterName.AFInAppEventParameterName;
                if (context2 != null) {
                    this.afErrorLogForExcManagerOnly = new AFf1bSDK(context2);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFf1fSDK aFf1fSDK = this.afErrorLogForExcManagerOnly;
            if (this.onResponseNative == null) {
                this.onResponseNative = new AFa1hSDK();
            }
            AFa1gSDK aFa1gSDK = this.onResponseNative;
            AFe1lSDK AFLogger = AFLogger();
            AFb1fSDK AFKeystoreWrapper2 = AFKeystoreWrapper();
            AFb1cSDK AFInAppEventParameterName = AFInAppEventParameterName();
            if (this.onDeepLinkingNative == null) {
                this.onDeepLinkingNative = new AFa1iSDK();
            }
            this.AFVersionDeclaration = new AFe1uSDK(context, aFf1mSDK, aFb1jSDK, aFf1fSDK, aFa1gSDK, AFLogger, AFKeystoreWrapper2, AFInAppEventParameterName, this.onDeepLinkingNative, AFVersionDeclaration(), new AFb1xSDK());
        }
        return this.AFVersionDeclaration;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFf1fSDK afWarnLog() {
        if (this.afErrorLogForExcManagerOnly == null) {
            Context context = this.AFInAppEventParameterName.AFInAppEventParameterName;
            if (context != null) {
                this.afErrorLogForExcManagerOnly = new AFf1bSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFd1tSDK getLevel() {
        if (this.AFLogger$LogLevel == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFc1xSDK.5
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
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFc1xSDK$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    AFc1xSDK.values(runnable, threadPoolExecutor2);
                }
            });
            this.AFLogger$LogLevel = new AFd1tSDK(threadPoolExecutor);
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1wSDK afErrorLogForExcManagerOnly() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFb1rSDK();
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFf1kSDK AFLogger$LogLevel() {
        if (this.getLevel == null) {
            this.getLevel = new AFf1kSDK();
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFe1xSDK AFVersionDeclaration() {
        if (this.onInstallConversionDataLoadedNative == null) {
            this.onInstallConversionDataLoadedNative = new AFe1xSDK(onAppOpenAttributionNative(), new AFe1wSDK());
        }
        return this.onInstallConversionDataLoadedNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1bSDK onAppOpenAttributionNative() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFa1fSDK AppsFlyer2dXConversionCallback() {
        if (this.onAppOpenAttributionNative == null) {
            this.onAppOpenAttributionNative = new AFa1jSDK(onAppOpenAttributionNative());
        }
        return this.onAppOpenAttributionNative;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFc1zSDK
    /* renamed from: onAttributionFailure, reason: merged with bridge method [inline-methods] */
    public synchronized AFc1wSDK onResponseErrorNative() {
        if (this.onInstallConversionFailureNative == null) {
            this.onInstallConversionFailureNative = new AFc1wSDK(this);
        }
        return this.onInstallConversionFailureNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFc1cSDK onInstallConversionDataLoadedNative() {
        if (this.AppsFlyer2dXConversionCallback == null) {
            this.AppsFlyer2dXConversionCallback = new AFc1cSDK(AFInAppEventParameterName(), AFKeystoreWrapper());
        }
        return this.AppsFlyer2dXConversionCallback;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFf1mSDK onInstallConversionFailureNative() {
        if (this.init == null) {
            this.init = new AFf1lSDK();
        }
        return this.init;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final synchronized AFb1uSDK init() {
        if (this.onConversionDataSuccess == null) {
            this.onConversionDataSuccess = new AFb1uSDK(this);
        }
        return this.onConversionDataSuccess;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFb1jSDK onConversionDataSuccess() {
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFa1xSDK();
        }
        return this.onResponseErrorNative;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFf1tSDK onResponseNative() {
        if (this.onResponse == null) {
            this.onResponse = new AFf1qSDK();
        }
        return this.onResponse;
    }

    @Override // com.appsflyer.internal.AFc1zSDK
    public final AFb1iSDK onDeepLinkingNative() {
        if (this.onAttributionFailureNative == null) {
            ExecutorService onConversionDataFail = onConversionDataFail();
            AFb1uSDK init = init();
            if (this.onResponse == null) {
                this.onResponse = new AFf1qSDK();
            }
            this.onAttributionFailureNative = new AFb1lSDK(onConversionDataFail, init, this.onResponse);
        }
        return this.onAttributionFailureNative;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void values(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger values = new AtomicInteger();
        private final AtomicInteger AFInAppEventParameterName = new AtomicInteger();

        public AFa1zSDK() {
            values.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = values.get();
            return new Thread(runnable, new StringBuilder("queue-").append(i).append("-").append(this.AFInAppEventParameterName.incrementAndGet()).toString());
        }
    }
}
