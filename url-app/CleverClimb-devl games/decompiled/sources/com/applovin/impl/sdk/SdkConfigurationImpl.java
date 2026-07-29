package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final j f2888a;

    public SdkConfigurationImpl(j jVar) {
        this.f2888a = jVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = (String) this.f2888a.a(com.applovin.impl.sdk.b.b.fo);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    public String toString() {
        return "AppLovinSdkConfiguration{getConsentDialogState=" + getConsentDialogState() + '}';
    }
}
