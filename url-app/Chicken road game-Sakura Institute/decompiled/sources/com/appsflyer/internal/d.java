package com.appsflyer.internal;

import com.appsflyer.internal.AFd1jSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements AFd1jSDK.AFa1zSDK, AFf1eSDK {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1vSDK f5986a;

    public /* synthetic */ d(AFb1vSDK aFb1vSDK) {
        this.f5986a = aFb1vSDK;
    }

    @Override // com.appsflyer.internal.AFd1jSDK.AFa1zSDK
    public void onConfigurationChanged(boolean z4) {
        this.f5986a.AFInAppEventParameterName(z4);
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public void onRemoteConfigUpdateFinished(AFf1gSDK aFf1gSDK) {
        this.f5986a.AFInAppEventParameterName(aFf1gSDK);
    }
}
