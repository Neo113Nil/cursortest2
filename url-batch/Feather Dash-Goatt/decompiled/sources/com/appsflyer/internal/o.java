package com.appsflyer.internal;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AFj1mSDK e;

    public /* synthetic */ o(AFj1mSDK aFj1mSDK, int i) {
        this.d = i;
        this.e = aFj1mSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        AFj1mSDK aFj1mSDK = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                aFj1mSDK.component1();
                break;
            case 1:
                aFj1mSDK.component2();
                break;
            default:
                aFj1mSDK.component3();
                break;
        }
    }
}
