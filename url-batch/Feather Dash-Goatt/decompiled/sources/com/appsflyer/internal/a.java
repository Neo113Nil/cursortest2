package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements AFf1uSDK, AFd1xSDK.AFa1tSDK {
    public final /* synthetic */ AFa1tSDK a;

    public /* synthetic */ a(AFa1tSDK aFa1tSDK) {
        this.a = aFa1tSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1tSDK
    public void onConfigurationChanged(boolean z) {
        this.a.getCurrencyIso4217Code(z);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
        this.a.AFAdRevenueData(aFf1nSDK);
    }
}
