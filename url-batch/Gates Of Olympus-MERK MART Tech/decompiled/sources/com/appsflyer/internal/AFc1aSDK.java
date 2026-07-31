package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class AFc1aSDK<T> {
    public final AFd1mSDK AFInAppEventParameterName;
    public final Context AFInAppEventType;
    public final FutureTask<T> AFKeystoreWrapper = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFc1aSDK.2
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFc1aSDK.this.AFInAppEventParameterName()) {
                return (T) AFc1aSDK.this.valueOf();
            }
            return null;
        }
    });
    private final String[] valueOf;
    public final String values;

    protected abstract T valueOf();

    public AFc1aSDK(Context context, AFd1mSDK aFd1mSDK, String str, String... strArr) {
        this.AFInAppEventType = context;
        this.values = str;
        this.valueOf = strArr;
        this.AFInAppEventParameterName = aFd1mSDK;
    }

    public T values() {
        try {
            return this.AFKeystoreWrapper.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2, false, false);
            return null;
        }
    }

    public final boolean AFInAppEventParameterName() {
        try {
            ProviderInfo resolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.valueOf).contains(AFb1rSDK.valueOf(this.AFInAppEventType.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return false;
        }
    }
}
