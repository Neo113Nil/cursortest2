package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) obj);
                break;
            case 1:
                AFa1tSDK.getMediationNetwork((AFd1zSDK) obj);
                break;
            default:
                ((AFd1nSDK) obj).getMediationNetwork();
                break;
        }
    }
}
