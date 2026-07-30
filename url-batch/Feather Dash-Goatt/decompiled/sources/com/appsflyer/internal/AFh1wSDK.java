package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public interface AFh1wSDK {
    boolean AFAdRevenueData();

    void getCurrencyIso4217Code(AFf1tSDK aFf1tSDK, Function0<Unit> function0);

    void getCurrencyIso4217Code(AFh1sSDK aFh1sSDK);

    void getMediationNetwork(AFh1sSDK aFh1sSDK);

    boolean getMediationNetwork();

    void getMonetizationNetwork(AFh1sSDK aFh1sSDK);

    void getRevenue();

    void u_(Intent intent, AFa1oSDK aFa1oSDK);
}
