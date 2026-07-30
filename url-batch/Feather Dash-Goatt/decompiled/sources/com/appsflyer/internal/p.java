package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFj1rSDK e;
    public final /* synthetic */ Runnable g;

    public /* synthetic */ p(AFj1rSDK aFj1rSDK, Runnable runnable, int i) {
        this.d = i;
        this.e = aFj1rSDK;
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Runnable runnable = this.g;
        AFj1rSDK aFj1rSDK = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                aFj1rSDK.getMediationNetwork(runnable);
                break;
            case 1:
                aFj1rSDK.getCurrencyIso4217Code(runnable);
                break;
            case 2:
                aFj1rSDK.getMonetizationNetwork(runnable);
                break;
            default:
                aFj1rSDK.areAllFieldsValid(runnable);
                break;
        }
    }
}
