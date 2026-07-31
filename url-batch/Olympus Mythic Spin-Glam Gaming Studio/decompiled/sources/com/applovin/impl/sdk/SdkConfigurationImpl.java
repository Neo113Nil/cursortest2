package com.applovin.impl.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;

/* loaded from: classes11.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {
    private final k a;
    private List b;

    public SdkConfigurationImpl(k kVar) {
        this.a = kVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.a.n0().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.a.a(x4.V6);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        String str = (String) this.a.a(x4.V6);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.a.a(x4.W6);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    @Nullable
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.a.s0().c();
    }

    public void setEnabledAmazonAdUnitIds(@Nullable List<String> list) {
        this.b = list;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + '}';
    }
}
