package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface AFc1zSDK {
    AFb1cSDK AFInAppEventParameterName();

    AFc1qSDK AFInAppEventType();

    AFb1fSDK AFKeystoreWrapper();

    AFe1lSDK AFLogger();

    AFf1kSDK AFLogger$LogLevel();

    AFe1xSDK AFVersionDeclaration();

    AFa1fSDK AppsFlyer2dXConversionCallback();

    AFc1tSDK afDebugLog();

    AFb1wSDK afErrorLogForExcManagerOnly();

    PurchaseHandler afInfoLog();

    AFe1tSDK afRDLog();

    AFf1fSDK afWarnLog();

    AFd1tSDK getLevel();

    AFb1uSDK init();

    AFb1bSDK onAppOpenAttributionNative();

    AFb1jSDK onConversionDataSuccess();

    AFb1iSDK onDeepLinkingNative();

    AFc1cSDK onInstallConversionDataLoadedNative();

    AFf1mSDK onInstallConversionFailureNative();

    AFc1vSDK onResponseErrorNative();

    AFf1tSDK onResponseNative();

    ExecutorService valueOf();

    ScheduledExecutorService values();
}
