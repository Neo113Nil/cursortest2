package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements AFd1xSDK.AFa1vSDK, AFf1mSDK {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFa1ySDK f2072a;

    public /* synthetic */ c(AFa1ySDK aFa1ySDK) {
        this.f2072a = aFa1ySDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
    public void onConfigurationChanged(boolean z10) {
        this.f2072a.getMediationNetwork(z10);
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
        this.f2072a.AFAdRevenueData(aFf1pSDK);
    }
}
