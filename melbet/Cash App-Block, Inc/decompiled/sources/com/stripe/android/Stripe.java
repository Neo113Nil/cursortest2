package com.stripe.android;

import com.stripe.android.core.ApiVersion;

/* loaded from: classes8.dex */
public abstract class Stripe {
    public static final boolean advancedFraudSignalsEnabled;

    static {
        ApiVersion.INSTANCE.getCode();
        advancedFraudSignalsEnabled = true;
    }
}
