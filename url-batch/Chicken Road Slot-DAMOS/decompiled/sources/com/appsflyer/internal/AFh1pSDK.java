package com.appsflyer.internal;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface AFh1pSDK {
    void AFAdRevenueData();

    void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK);

    void getMediationNetwork(AFh1mSDK aFh1mSDK);

    void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0);

    void getMonetizationNetwork(AFh1mSDK aFh1mSDK);

    boolean getMonetizationNetwork();

    boolean getRevenue();

    void u_(Intent intent, AFa1mSDK aFa1mSDK);
}
