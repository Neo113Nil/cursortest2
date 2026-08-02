package com.stripe.android.core.frauddetection;

import com.stripe.android.core.exception.StripeException;

/* loaded from: classes8.dex */
public interface FraudDetectionErrorReporter {
    void reportFraudDetectionError(StripeException stripeException);
}
