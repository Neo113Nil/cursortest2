package com.stripe.android.financialconnections.features.networkinglinksignup;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public interface LinkSignupHandler {
    void handleSignupFailure(NetworkingLinkSignupState networkingLinkSignupState, Throwable th);

    void navigateToVerification();

    Enum performSignup(NetworkingLinkSignupState networkingLinkSignupState, ContinuationImpl continuationImpl);
}
