package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1hSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class AFi1aSDK {
    public final AFd1kSDK AFInAppEventParameterName;
    public final List<AFi1hSDK> AFKeystoreWrapper = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf() {
    }

    public AFi1aSDK(AFd1kSDK aFd1kSDK) {
        this.AFInAppEventParameterName = aFd1kSDK;
    }

    public final synchronized void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        this.AFKeystoreWrapper.add(aFi1hSDK);
    }

    public final synchronized AFi1hSDK[] AFKeystoreWrapper() {
        return (AFi1hSDK[]) this.AFKeystoreWrapper.toArray(new AFi1hSDK[0]);
    }

    public final void AFInAppEventParameterName(final Runnable runnable) {
        AFInAppEventParameterName(new AFi1jSDK(this.AFInAppEventParameterName.AFInAppEventType(), this.AFInAppEventParameterName.values(), AFi1fSDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.AFi1aSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.this.AFInAppEventType(runnable);
            }
        }));
    }

    public final AFi1lSDK valueOf(final Runnable runnable) {
        return new AFi1lSDK(new Runnable() { // from class: com.appsflyer.internal.AFi1aSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.this.values(runnable);
            }
        }, this.AFInAppEventParameterName.values(), this.AFInAppEventParameterName.AFInAppEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(final Runnable runnable) {
        AFj1rSDK.values(this.AFInAppEventParameterName.AFKeystoreWrapper(), new Runnable() { // from class: com.appsflyer.internal.AFi1aSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.this.AFKeystoreWrapper(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Runnable runnable) {
        try {
            if (AFKeystoreWrapper(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final boolean AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        int valueOf = this.AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
        return (!this.AFInAppEventParameterName.valueOf().AFInAppEventType(AppsFlyerProperties.NEW_REFERRER_SENT) && valueOf == 1) || (valueOf == 1 && !(aFa1qSDK instanceof AFh1oSDK));
    }

    public final Runnable AFInAppEventType(final AFi1lSDK aFi1lSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.AFi1aSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.this.values(aFi1lSDK, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(AFi1lSDK aFi1lSDK, Runnable runnable) {
        AFd1qSDK valueOf = this.AFInAppEventParameterName.valueOf();
        int valueOf2 = this.AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
        boolean AFInAppEventType = valueOf.AFInAppEventType(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z = aFi1lSDK.unregisterClient == AFi1hSDK.AFa1ySDK.NOT_STARTED;
        if (valueOf2 == 1) {
            if (z || AFInAppEventType) {
                runnable.run();
            }
        }
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.AFInAppEventType().AFInAppEventParameterName("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Runnable runnable) {
        AFi1jSDK aFi1jSDK = new AFi1jSDK(this.AFInAppEventParameterName.AFInAppEventType(), this.AFInAppEventParameterName.values(), AFi1fSDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.AFi1aSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.valueOf();
            }
        });
        AFInAppEventParameterName(aFi1jSDK);
        aFi1jSDK.values(this.AFInAppEventParameterName.w().AFKeystoreWrapper);
    }
}
