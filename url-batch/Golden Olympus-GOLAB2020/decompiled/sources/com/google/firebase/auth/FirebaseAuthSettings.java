package com.google.firebase.auth;

/* loaded from: classes.dex */
public abstract class FirebaseAuthSettings {
    public abstract void forceRecaptchaFlowForTesting(boolean z4);

    public abstract void setAppVerificationDisabledForTesting(boolean z4);

    public abstract void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2);
}
