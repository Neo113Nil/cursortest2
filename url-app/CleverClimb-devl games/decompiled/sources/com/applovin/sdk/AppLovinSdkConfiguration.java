package com.applovin.sdk;

/* loaded from: classes.dex */
public interface AppLovinSdkConfiguration {

    public enum ConsentDialogState {
        UNKNOWN,
        APPLIES,
        DOES_NOT_APPLY
    }

    ConsentDialogState getConsentDialogState();
}
