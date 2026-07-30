package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements AFf1uSDK, AFd1xSDK.AFa1tSDK {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFa1tSDK f4316a;

    public /* synthetic */ a(AFa1tSDK aFa1tSDK) {
        this.f4316a = aFa1tSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1tSDK
    public void onConfigurationChanged(boolean z7) {
        this.f4316a.getCurrencyIso4217Code(z7);
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    public void onRemoteConfigUpdateFinished(AFf1nSDK aFf1nSDK) {
        this.f4316a.AFAdRevenueData(aFf1nSDK);
    }
}
