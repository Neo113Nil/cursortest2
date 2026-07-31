package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public interface AFd1mSDK {
    ExecutorService AFInAppEventParameterName();

    ScheduledExecutorService AFInAppEventType();

    AFe1wSDK AFKeystoreWrapper();

    PurchaseHandler AFLogger();

    AFd1qSDK AFLogger$LogLevel();

    AFh1iSDK AFVersionDeclaration();

    AFh1bSDK afDebugLog();

    AFe1gSDK afErrorLog();

    AFg1mSDK afErrorLogForExcManagerOnly();

    AFb1bSDK afInfoLog();

    AFd1uSDK afLogForce();

    AFc1iSDK afRDLog();

    AFc1pSDK afVerboseLog();

    AFb1uSDK afWarnLog();

    AFg1gSDK d();

    AFi1lSDK e();

    AFg1xSDK force();

    AFh1lSDK getLevel();

    AFe1cSDK i();

    AFc1qSDK init();

    AFd1hSDK onInstallConversionFailureNative();

    AFf1eSDK registerClient();

    AFg1sSDK unregisterClient();

    AFd1nSDK v();

    AFd1xSDK valueOf();

    AFd1pSDK values();

    AFi1rSDK w();
}
