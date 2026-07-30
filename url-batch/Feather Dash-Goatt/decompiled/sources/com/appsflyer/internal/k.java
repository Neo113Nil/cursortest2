package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFd1wSDK e;

    public /* synthetic */ k(AFd1wSDK aFd1wSDK, int i) {
        this.d = i;
        this.e = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        AFd1wSDK aFd1wSDK = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFd1wSDK.getCurrencyIso4217Code(aFd1wSDK);
                break;
            case 1:
                AFd1wSDK.AFAdRevenueData(aFd1wSDK);
                break;
            default:
                AFd1wSDK.getMediationNetwork(aFd1wSDK);
                break;
        }
    }
}
