package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.ry0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ g(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.g;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AFb1lSDK.getCurrencyIso4217Code((AFb1lSDK) obj2, (AFh1oSDK) obj);
                break;
            case 1:
                ((AFa1tSDK) obj2).getMediationNetwork((AFh1sSDK) obj);
                break;
            case 2:
                ((AFi1aSDK) obj2).AFAdRevenueData((Context) obj);
                break;
            case 3:
                ((AFi1eSDK) obj2).getRevenue((Context) obj);
                break;
            case 4:
                AFj1qSDK.AFAdRevenueData((AFj1qSDK) obj2, (Context) obj);
                break;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                ((AFj1tSDK) obj2).G_((SensorEvent) obj);
                break;
            default:
                AFj1xSDK.AFAdRevenueData((AFj1xSDK) obj2, (Context) obj);
                break;
        }
    }
}
