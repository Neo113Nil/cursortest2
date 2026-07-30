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
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class AFb1tSDK<T> {
    private final String[] AFAdRevenueData;
    public final Context getCurrencyIso4217Code;
    public final FutureTask<T> getMediationNetwork = new FutureTask<>(new Callable<T>() { // from class: com.appsflyer.internal.AFb1tSDK.5
        @Override // java.util.concurrent.Callable
        public final T call() {
            if (AFb1tSDK.this.getMonetizationNetwork()) {
                return (T) AFb1tSDK.this.getMediationNetwork();
            }
            return null;
        }
    });
    public final String getMonetizationNetwork;
    public final Executor getRevenue;

    public AFb1tSDK(Context context, Executor executor, String str, String... strArr) {
        this.getCurrencyIso4217Code = context;
        this.getMonetizationNetwork = str;
        this.AFAdRevenueData = strArr;
        this.getRevenue = executor;
    }

    public abstract T getMediationNetwork();

    public final boolean getMonetizationNetwork() {
        try {
            ProviderInfo resolveContentProvider = this.getCurrencyIso4217Code.getPackageManager().resolveContentProvider(this.getMonetizationNetwork, 128);
            if (resolveContentProvider != null) {
                if (Arrays.asList(this.AFAdRevenueData).contains(AFj1pSDK.N_(this.getCurrencyIso4217Code.getPackageManager(), ((PackageItemInfo) resolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return false;
        }
    }

    public T getRevenue() {
        try {
            return this.getMediationNetwork.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.afErrorLog(e.getMessage(), e, false, true);
            return null;
        } catch (TimeoutException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2, false, false);
            return null;
        }
    }
}
