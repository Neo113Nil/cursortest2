package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1pSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class AFi1rSDK {
    public final List<AFi1pSDK> valueOf = new ArrayList();
    public final AFd1mSDK values;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventParameterName() {
    }

    public AFi1rSDK(AFd1mSDK aFd1mSDK) {
        this.values = aFd1mSDK;
    }

    public final synchronized void valueOf(AFi1pSDK aFi1pSDK) {
        this.valueOf.add(aFi1pSDK);
    }

    public final synchronized AFi1pSDK[] AFKeystoreWrapper() {
        return (AFi1pSDK[]) this.valueOf.toArray(new AFi1pSDK[0]);
    }

    public final void valueOf(final Runnable runnable) {
        valueOf(new AFi1uSDK(this.values.values(), this.values.AFInAppEventParameterName(), AFi1ySDK.FACEBOOK, runnable, new Runnable() { // from class: com.appsflyer.internal.AFi1rSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFi1rSDK.this.AFInAppEventParameterName(runnable);
            }
        }));
    }

    public final AFi1xSDK values(final Runnable runnable) {
        return new AFi1xSDK(new Runnable() { // from class: com.appsflyer.internal.AFi1rSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFi1rSDK.this.AFKeystoreWrapper(runnable);
            }
        }, this.values.AFInAppEventParameterName(), this.values.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(final Runnable runnable) {
        AFi1iSDK.AFInAppEventParameterName(this.values.AFInAppEventType(), new Runnable() { // from class: com.appsflyer.internal.AFi1rSDK$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AFi1rSDK.this.AFInAppEventType(runnable);
            }
        }, 0L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Runnable runnable) {
        try {
            if (valueOf(new AFg1aSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    public final boolean valueOf(AFa1rSDK aFa1rSDK) {
        int AFKeystoreWrapper = this.values.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0);
        return (!this.values.valueOf().values(AppsFlyerProperties.NEW_REFERRER_SENT) && AFKeystoreWrapper == 1) || (AFKeystoreWrapper == 1 && !(aFa1rSDK instanceof AFg1aSDK));
    }

    public final Runnable AFKeystoreWrapper(final AFi1xSDK aFi1xSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.AFi1rSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFi1rSDK.this.values(aFi1xSDK, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(AFi1xSDK aFi1xSDK, Runnable runnable) {
        AFd1xSDK valueOf = this.values.valueOf();
        int AFKeystoreWrapper = this.values.values().valueOf.AFKeystoreWrapper("appsFlyerCount", 0);
        boolean values = valueOf.values(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z = aFi1xSDK.registerClient == AFi1pSDK.AFa1tSDK.NOT_STARTED;
        if (AFKeystoreWrapper == 1) {
            if (z || values) {
                runnable.run();
            }
        }
    }

    public final boolean values() {
        return this.values.values().AFKeystoreWrapper("AF_PREINSTALL_DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventParameterName(Runnable runnable) {
        AFi1uSDK aFi1uSDK = new AFi1uSDK(this.values.values(), this.values.AFInAppEventParameterName(), AFi1ySDK.INSTAGRAM, runnable, new Runnable() { // from class: com.appsflyer.internal.AFi1rSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFi1rSDK.AFInAppEventParameterName();
            }
        });
        valueOf(aFi1uSDK);
        aFi1uSDK.AFInAppEventType(this.values.v().AFKeystoreWrapper);
    }
}
