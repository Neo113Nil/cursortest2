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
public final class AFd1nSDK implements AFd1kSDK {
    private static final int AFKeystoreWrapper = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFd1lSDK AFInAppEventParameterName = new AFd1lSDK();
    private ExecutorService AFInAppEventType;
    private PurchaseHandler AFLogger;
    private AFc1iSDK AFLogger$LogLevel;
    private AFc1vSDK AFPurchaseDetails;
    private AFd1iSDK afDebugLog;
    private AFe1gSDK afErrorLog;
    private AFh1cSDK afErrorLogForExcManagerOnly;
    private AFg1mSDK afInfoLog;
    private AFd1vSDK afLogForce;
    private AFi1sSDK afRDLog;
    private AFg1wSDK afVerboseLog;
    private AFb1tSDK afWarnLog;
    private AFg1rSDK component4;
    private AFd1pSDK component5;
    private AFf1bSDK d;
    private AFh1wSDK e;
    private AFb1bSDK force;
    private AFi1qSDK getCurrency;
    private AFd1xSDK getLevel;
    private AFa1bSDK getPrice;
    private AFh1zSDK getProductId;
    private AFg1tSDK getPurchaseToken;
    private AFc1kSDK getPurchaseType;
    private AFi1aSDK i;
    private AFd1sSDK registerClient;
    private AFe1xSDK unregisterClient;
    private AFe1cSDK v;
    private ExecutorService valueOf;
    private ScheduledExecutorService values;
    private AFi1cSDK w;

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFe1ySDK AFInAppEventParameterName() {
        return new AFe1ySDK(getPrice(), AFInAppEventType(), AppsFlyerProperties.getInstance(), afVerboseLog());
    }

    private synchronized AFe1xSDK getPrice() {
        if (this.unregisterClient == null) {
            this.unregisterClient = new AFe1xSDK(new AFe1qSDK(AFKeystoreWrapper), values());
        }
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized ExecutorService values() {
        if (this.valueOf == null) {
            this.valueOf = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
        }
        return this.valueOf;
    }

    private synchronized ExecutorService getProductId() {
        if (this.AFInAppEventType == null) {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
            this.AFInAppEventType = newSingleThreadExecutor;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized ScheduledExecutorService AFKeystoreWrapper() {
        if (this.values == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
            Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
            this.values = newScheduledThreadPool;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFd1sSDK AFInAppEventType() {
        if (this.registerClient == null) {
            AFd1lSDK w = w();
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                AFd1tSDK aFd1tSDK = new AFd1tSDK(AFb1vSDK.AFKeystoreWrapper(context));
                if (this.component5 == null) {
                    this.component5 = new AFd1pSDK();
                }
                this.registerClient = new AFd1sSDK(w, aFd1tSDK, this.component5);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFd1qSDK valueOf() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context != null) {
            return new AFd1tSDK(AFb1vSDK.AFKeystoreWrapper(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized PurchaseHandler unregisterClient() {
        if (this.AFLogger == null) {
            this.AFLogger = new PurchaseHandler(this);
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFf1bSDK registerClient() {
        if (this.d == null) {
            AFg1xSDK aFg1xSDK = new AFg1xSDK(valueOf());
            this.d = new AFf1bSDK(new AFg1ySDK(), AFInAppEventType(), i(), aFg1xSDK, new AFe1ySDK(getPrice(), AFInAppEventType(), AppsFlyerProperties.getInstance(), afVerboseLog()), new AFg1zSDK(AFInAppEventType(), aFg1xSDK), afInfoLog());
        }
        return this.d;
    }

    private synchronized AFg1rSDK component1() {
        if (this.component4 == null) {
            this.component4 = new AFg1rSDK(w(), AFInAppEventType());
        }
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFh1wSDK AFLogger() {
        if (this.e == null) {
            this.e = new AFh1wSDK(valueOf());
        }
        return this.e;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFg1mSDK e() {
        if (this.afInfoLog == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.afRDLog == null) {
                this.afRDLog = new AFi1tSDK();
            }
            AFi1sSDK aFi1sSDK = this.afRDLog;
            if (this.afLogForce == null) {
                this.afLogForce = new AFa1tSDK();
            }
            AFd1vSDK aFd1vSDK = this.afLogForce;
            if (this.w == null) {
                Context context2 = this.AFInAppEventParameterName.AFKeystoreWrapper;
                if (context2 != null) {
                    this.w = new AFj1vSDK(context2, getProductId());
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFi1cSDK aFi1cSDK = this.w;
            if (this.getPrice == null) {
                this.getPrice = new AFa1cSDK();
            }
            AFa1bSDK aFa1bSDK = this.getPrice;
            AFh1wSDK AFLogger = AFLogger();
            AFd1qSDK valueOf = valueOf();
            AFd1sSDK AFInAppEventType = AFInAppEventType();
            if (this.afErrorLogForExcManagerOnly == null) {
                Context context3 = this.AFInAppEventParameterName.AFKeystoreWrapper;
                if (context3 != null) {
                    this.afErrorLogForExcManagerOnly = new AFh1cSDK(context3);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            AFh1cSDK aFh1cSDK = this.afErrorLogForExcManagerOnly;
            AFg1wSDK i = i();
            AFb1hSDK aFb1hSDK = new AFb1hSDK();
            AFd1lSDK w = w();
            AFg1rSDK component1 = component1();
            if (this.component5 == null) {
                this.component5 = new AFd1pSDK();
            }
            this.afInfoLog = new AFg1jSDK(context, aFi1sSDK, aFd1vSDK, aFi1cSDK, aFa1bSDK, AFLogger, valueOf, AFInAppEventType, aFh1cSDK, i, aFb1hSDK, w, component1, this.component5);
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1cSDK d() {
        if (this.w == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                this.w = new AFj1vSDK(context, getProductId());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.w;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFe1cSDK afInfoLog() {
        if (this.v == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1nSDK.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
                public boolean offer(Runnable runnable) {
                    if (isEmpty()) {
                        return super.offer(runnable);
                    }
                    return false;
                }
            }, new AFa1zSDK());
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.appsflyer.internal.AFd1nSDK$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    AFd1nSDK.AFInAppEventType(runnable, threadPoolExecutor2);
                }
            });
            this.v = new AFe1cSDK(threadPoolExecutor);
        }
        return this.v;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFb1bSDK v() {
        if (this.force == null) {
            this.force = new AFb1gSDK(this);
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFi1aSDK force() {
        if (this.i == null) {
            this.i = new AFi1aSDK(this);
        }
        return this.i;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFg1wSDK i() {
        if (this.afVerboseLog == null) {
            this.afVerboseLog = new AFg1wSDK(w(), new AFg1uSDK());
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFd1lSDK w() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFb1tSDK afErrorLog() {
        if (this.afWarnLog == null) {
            this.afWarnLog = new AFb1iSDK(w());
        }
        return this.afWarnLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1kSDK
    /* renamed from: component4, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1iSDK getCurrency() {
        if (this.afDebugLog == null) {
            this.afDebugLog = new AFd1iSDK(this);
        }
        return this.afDebugLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFe1gSDK afVerboseLog() {
        if (this.afErrorLog == null) {
            this.afErrorLog = new AFe1gSDK(AFInAppEventType(), valueOf());
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1sSDK afWarnLog() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFi1tSDK();
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFc1vSDK afRDLog() {
        if (this.AFPurchaseDetails == null) {
            this.AFPurchaseDetails = new AFc1vSDK(this);
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final synchronized AFc1iSDK afDebugLog() {
        if (this.AFLogger$LogLevel == null) {
            this.AFLogger$LogLevel = new AFd1zSDK(w());
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFh1cSDK afLogForce() {
        if (this.afErrorLogForExcManagerOnly == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                this.afErrorLogForExcManagerOnly = new AFh1cSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFi1qSDK AFPurchaseDetails() {
        if (this.getCurrency == null) {
            this.getCurrency = new AFi1pSDK();
        }
        return this.getCurrency;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFd1pSDK getLevel() {
        if (this.component5 == null) {
            this.component5 = new AFd1pSDK();
        }
        return this.component5;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFd1xSDK afErrorLogForExcManagerOnly() {
        if (this.getLevel == null) {
            ExecutorService productId = getProductId();
            ScheduledExecutorService AFKeystoreWrapper2 = AFKeystoreWrapper();
            AFc1vSDK afRDLog = afRDLog();
            if (this.getCurrency == null) {
                this.getCurrency = new AFi1pSDK();
            }
            this.getLevel = new AFd1uSDK(productId, AFKeystoreWrapper2, afRDLog, this.getCurrency);
        }
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFh1zSDK AFLogger$LogLevel() {
        if (this.getProductId == null) {
            this.getProductId = new AFh1ySDK(this);
        }
        return this.getProductId;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFg1tSDK getPurchaseType() {
        if (this.getPurchaseToken == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                AFg1pSDK aFg1pSDK = new AFg1pSDK(context, AppsFlyerProperties.getInstance());
                if (this.component5 == null) {
                    this.component5 = new AFd1pSDK();
                }
                this.getPurchaseToken = new AFg1sSDK(aFg1pSDK, this.component5, AppsFlyerProperties.getInstance());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.getPurchaseToken;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    public final AFc1kSDK getPurchaseToken() {
        if (this.getPurchaseType == null) {
            this.getPurchaseType = new AFc1hSDK(valueOf());
        }
        return this.getPurchaseType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventType(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger valueOf = new AtomicInteger();
        private final AtomicInteger AFInAppEventParameterName = new AtomicInteger();

        public AFa1zSDK() {
            valueOf.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i = valueOf.get();
            return new Thread(runnable, new StringBuilder("queue-").append(i).append("-").append(this.AFInAppEventParameterName.incrementAndGet()).toString());
        }
    }
}
